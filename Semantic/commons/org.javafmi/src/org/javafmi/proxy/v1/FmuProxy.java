/*

 Copyright 2013-2015 SIANI - ULPGC
 Jose Juan Hernandez Cabrera
 Jose Evora Gomez
 Johan Sebastian Cortes Montenegro

 This File is Part of JavaFMI Project

 JavaFMI Project is free software: you can redistribute it and/or modify
 it under the terms of the GNU Lesser General Public License as published by
 the Free Software Foundation, either version 3 of the License.

 JavaFMI Project is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU Lesser General Public License for more details.

 You should have received a copy of the GNU Lesser General Public License
 along with JavaFMI.  If not, see <http://www.gnu.org/licenses/>.

 */
 package org.javafmi.proxy.v1;

import com.sun.jna.Function;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Pointer;
import org.javafmi.kernel.NativeBoolean;
import org.javafmi.modeldescription.FmiVersion;
import org.javafmi.modeldescription.ScalarVariable;
import org.javafmi.modeldescription.v1.EnumerationType;
import org.javafmi.modeldescription.v1.ModelDescription;
import org.javafmi.proxy.Buffers;
import org.javafmi.proxy.FmuProxyState;
import org.javafmi.proxy.MethodExecutionException;
import org.javafmi.proxy.Status;
import org.javafmi.proxy.v1.nativeaccess.CallbackFunctionsStructure;
import org.javafmi.proxy.v1.nativeaccess.FmuFunctionSuffix;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.IntBuffer;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.javafmi.proxy.Status.*;

public class FmuProxy implements org.javafmi.proxy.FmuProxy {

    private static final String MIME_TYPE = "application/x-fmu-sharedlibrary";
    private static final long DEFAULT_TIMEOUT = 2000;
    private static final boolean DEFAULT_DOING_LOGGING = false;
    private static final boolean DEFAULT_VISIBLE = false;
    private static final boolean DEFAULT_INTERACTIVE = false;
    private static final boolean STOP_DEFINED = true;
    private ModelDescription modelDescription;
    private NativeLibrary libraryInstance;
    private double startTime;
    private double stopTime;
    private Pointer component;
    private Map<String, Function> functions;
    private FmuProxyState fmuProxyState;
    private CallbackFunctionsStructure.ByValue callbacks;
    private Buffers buffers;

    public FmuProxy(String libraryPath, ModelDescription modelDescription) {
        this.callbacks = new CallbackFunctionsStructure.ByValue();
        this.libraryInstance = NativeLibrary.getInstance(libraryPath);
        this.modelDescription = modelDescription.build();
        this.functions = getFunctions();
        this.buffers = new Buffers();
    }

    @Override
    public void instantiate(String resourcesPath) {
        component = (Pointer) functions.get(FmuFunctionSuffix.INSTANTIATE).invoke(Pointer.class, getParametersForInstantiate(resourcesPath));
        if (component == Pointer.NULL)
            throw new MethodExecutionException("Instantiate: " + modelDescription.getModelIdentifier());
        fmuProxyState = FmuProxyState.INSTANTIATED;
    }

    public Map<String, Function> getFunctions() {
        LinkedHashMap<String, Function> functions = new LinkedHashMap<>();
        for (String suffix : FmuFunctionSuffix.getFunctionsSuffix())
            functions.put(suffix, getFunction(suffix));
        return functions;
    }

    @Override
    public Status initialize(double startTime, double stopTime) {
        if (fmuProxyState.equals(FmuProxyState.INITED)) return WARNING;
        this.startTime = startTime;
        this.stopTime = stopTime;
        if (translateStatus(functions.get(FmuFunctionSuffix.INITIALIZE).invokeInt(getParametersForInitialize())) != Status.OK)
            throw new RuntimeException("impossible to initialize");
        fmuProxyState = FmuProxyState.INITED;
        return OK;
    }
    
    public Status initialize(double startTime, double stopTime,double internalSolverTolerance) {
		return WARNING;
	}

    @Override
    public Status terminate() {
        Status terminateStatus = translateStatus((Integer) functions.get(FmuFunctionSuffix.TERMINATE).invoke(Integer.class, new Object[]{component}));
        if (terminateStatus.equals(OK)) fmuProxyState = FmuProxyState.TERMINATED;
        else fmuProxyState = FmuProxyState.INITED;
        return terminateStatus;
    }

    @Override
    public Status reset() {
        Status resetStatus = translateStatus((Integer) functions.get(FmuFunctionSuffix.RESET).invoke(Integer.class, new Object[]{component}));
        if (resetStatus.equals(Status.OK)) {
            fmuProxyState = FmuProxyState.INSTANTIATED;
        }
        return resetStatus;
    }

    @Override
    public void freeInstance() {
        functions.get(FmuFunctionSuffix.FREE).invoke(new Object[]{component});
        libraryInstance.dispose();
    }

    @Override
    public Status doStep(double communicationPoint, double stepSize) {
        return translateStatus(functions.get(FmuFunctionSuffix.DO_STEP).invokeInt(getParametersForDoStep(stepSize, communicationPoint)));
    }

    @Override
    public Status cancelStep() {
        return translateStatus((Integer) functions.get(FmuFunctionSuffix.CANCEL_STEP).invoke(Integer.class, new Object[]{component}));
    }

    @Override
    public Object getEnumeration(ScalarVariable modelVariable) {
        EnumerationType enumeration = (EnumerationType) modelVariable.getType();
        Integer enumerationIndex;
        EnumerationType enumerationType = (EnumerationType) modelDescription.getTypeFromTypeDefinition(enumeration.getDeclaredType());
        if (modelVariable.getVariability().equalsIgnoreCase("constant")) {
            enumerationIndex = enumeration.getStart();
            return enumerationType.getItems().get(enumerationIndex - 1).getName();
        }
        enumerationIndex = getInteger(modelVariable.getValueReference())[0];
        return enumerationType.getItems().get(enumerationIndex - 1).getName();
    }

    @Override
    public double[] getReal(int... valueReferences) {
        DoubleBuffer buffer = buffers.forDouble(valueReferences.length);
        functions.get(FmuFunctionSuffix.GET_REAL).invokeInt(new Object[]{component, valueReferences, valueReferences.length, buffer});
        return buffer.array();
    }

    @Override
    public int[] getInteger(int... valueReference) {
        IntBuffer buffer = buffers.forInteger(valueReference.length);
        functions.get(FmuFunctionSuffix.GET_INTEGER).invoke(getParametersForFmuGetterSetter(valueReference, buffer));
        return buffer.array();
    }

    @Override
    public boolean[] getBoolean(int... valueReference) {
        ByteBuffer buffer = buffers.forBytes(valueReference.length);
        functions.get(FmuFunctionSuffix.GET_BOOLEAN).invoke(getParametersForFmuGetterSetter(valueReference, buffer));
        byte[] resultAsArray = buffer.array();
        boolean[] resultAsBoolean = new boolean[resultAsArray.length];
        for (int i = 0; i < resultAsArray.length; i++) {
            resultAsBoolean[i] = NativeBoolean.getBooleanFor(resultAsArray[i]);
        }
        return resultAsBoolean;
    }

    @Override
    public String[] getString(int... valueReference) {
        String[] buffer = new String[valueReference.length];
        functions.get(FmuFunctionSuffix.GET_STRING).invoke(getParametersForFmuGetterSetter(valueReference, buffer));
        return buffer;
    }

    @Override
    public Status setReal(int[] valueReferences, double[] values) {
        return translateStatus(functions.get(FmuFunctionSuffix.SET_REAL).invokeInt(new Object[]{component, valueReferences, valueReferences.length, values}));
    }

    @Override
    public Status setInteger(int[] valueReferences, int[] values) {
        return translateStatus(functions.get(FmuFunctionSuffix.SET_INTEGER).invokeInt(getParametersForFmuGetterSetter(valueReferences, values)));
    }

    @Override
    public Status setBoolean(int[] valueReference, boolean[] values) {
        return translateStatus(functions.get(FmuFunctionSuffix.SET_BOOLEAN).invokeInt(getParametersForFmuGetterSetter(valueReference, values)));
    }

    @Override
    public Status setString(int[] valueReference, String[] newValue) {
        return translateStatus(functions.get(FmuFunctionSuffix.SET_STRING).invokeInt(getParametersForFmuGetterSetter(valueReference, newValue)));
    }

    public Status setIsDoingLogging(boolean isDoingLogging) {
        return translateStatus(functions.get(FmuFunctionSuffix.SET_DEBUG).invokeInt(getParametersForSetDebugLogging()));
    }

    @Override
    public boolean isTerminated() {
        return fmuProxyState.equals(FmuProxyState.TERMINATED);
    }

    private Function getFunction(String suffix) {
        return libraryInstance.getFunction(modelDescription.getModelIdentifier() + suffix);
    }

    private Object[] getParametersForInstantiate(String resourcesPath) {
        return new Object[]{modelDescription.getModelIdentifier(), modelDescription.getGuid(), resourcesPath, MIME_TYPE, DEFAULT_TIMEOUT, NativeBoolean.getValueFor(DEFAULT_VISIBLE), NativeBoolean.getValueFor(DEFAULT_INTERACTIVE), callbacks, NativeBoolean.getValueFor(DEFAULT_DOING_LOGGING)};
    }

    private Object[] getParametersForInitialize() {
        return new Object[]{component, startTime, NativeBoolean.getValueFor(STOP_DEFINED), stopTime};
    }

    private Object[] getParametersForDoStep(double stepSize, double communicationPoint) {
        return new Object[]{component, communicationPoint, stepSize, (byte) 1};
    }

    private Object[] getParametersForSetDebugLogging() {
        return new Object[]{component, NativeBoolean.getValueFor(DEFAULT_DOING_LOGGING)};
    }

    public Object[] getParametersForFmuGetterSetter(int[] valueReference, Object buffer) {
        return new Object[]{component, valueReference, valueReference.length, buffer};
    }

    @Override
    public String getVersion() {
        return FmiVersion.ONE;
    }

}
