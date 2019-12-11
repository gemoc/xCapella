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
 package org.javafmi.proxy.v2.nativeaccess;

import com.sun.jna.Function;
import com.sun.jna.Memory;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.PointerByReference;
import org.javafmi.kernel.NativeBoolean;
import org.javafmi.proxy.MethodExecutionException;
import org.javafmi.proxy.Status;

import java.util.HashMap;
import java.util.Map;

public class FmiV2 {

    private final NativeLibrary instance;
    private final Map<String, Function> functions;
    private Pointer component;
    private String[] functionNames = {"Instantiate", "FreeInstance", "SetDebugLogging", "SetupExperiment", "EnterInitializationMode", "ExitInitializationMode", "Terminate", "Reset", "GetReal", "GetInteger", "GetBoolean", "GetString", "SetReal", "SetInteger", "SetBoolean", "SetString", "GetFMUstate", "SetFMUstate", "FreeFMUstate", "SerializedFMUstateSize", "SerializeFMUstate", "DeSerializeFMUstate", "GetDirectionalDerivative", "SetRealInputDerivatives", "GetRealOutputDerivatives", "DoStep", "CancelStep", "GetStatus", "GetRealStatus", "GetIntegerStatus", "GetBooleanStatus", "GetStringStatus"};

    public FmiV2(String libraryPath) {
        instance = NativeLibrary.getInstance(libraryPath);
        functions = loadFmiFunctions(instance);
    }

    private Map<String, Function> loadFmiFunctions(NativeLibrary instance) {
        Map<String, Function> result = new HashMap<>();
        for (String functionName : functionNames)
            try {
                result.put(functionName, instance.getFunction(fmi2(functionName)));
            } catch (UnsatisfiedLinkError e) {
                System.err.println("This FMU is not fully FMI V2.0 compliant, function not found: " + fmi2(functionName));
            }
        return result;
    }

    public void instantiate(String modelName, int fmiType, String guID, String resourcesLocation, CallbackFunctions callbacks, boolean visible, boolean loggingOn) {
        org.javafmi.proxy.v2.nativeaccess.FmiV2.Invocation.Result res = invoke("Instantiate")
                .with(modelName, fmiType, guID, resourcesLocation, callbacks, visible, loggingOn);
        component = res.asPointer();
        if (component == null)
            throw new MethodExecutionException("Impossible to instantiate " + modelName + " fmi2Instantiate returns null");
    }

    public void free() {
        invoke("FreeInstance").with(component).asVoid();
        instance.dispose();
    }

    public int setDebugLogging(boolean loggingOn, String... categories) {
        return invoke("SetDebugLogging").with(component, loggingOn, categories.length, categories).asInt();
    }

    public int setUpExperiment(boolean toleranceDefined, double tolerance, double startTime, boolean stopTimeDefined, double stopTime) {
        return invoke("SetupExperiment").with(component, toleranceDefined, tolerance, startTime, stopTimeDefined, stopTime).asInt();
    }

    public int enterInitializationMode() {
        return invoke("EnterInitializationMode").with(component).asInt();
    }

    public int exitInitializationMode() {
        return invoke("ExitInitializationMode").with(component).asInt();
    }

    public int terminate() {
        return invoke("Terminate").with(component).asInt();
    }

    public int reset() {
        return invoke("Reset").with(component).asInt();
    }

    public double[] getReal(int... valueReferences) {
        double[] doubleValues = new double[valueReferences.length];
        int status = invoke("GetReal").with(component, valueReferences, valueReferences.length, doubleValues).asInt();
        if (Status.translateStatus(status) != Status.OK)
            throw new RuntimeException("There was an error getting a variable inside the FMU");
        return doubleValues;
    }

    public int[] getInteger(int... valueReferences) {
        int[] integerValues = new int[valueReferences.length];
        int status = invoke("GetInteger").with(component, valueReferences, valueReferences.length, integerValues).asInt();
        if (Status.translateStatus(status) != Status.OK)
            throw new RuntimeException("There was an error getting a variable inside the FMU");
        return integerValues;
    }

    public boolean[] getBoolean(int... valueReferences) {
        int[] booleanValues = new int[valueReferences.length];
        int status = invoke("GetBoolean").with(component, valueReferences, valueReferences.length, booleanValues).asInt();
        if (Status.translateStatus(status) != Status.OK)
            throw new RuntimeException("There was an error getting a variable inside the FMU");
        boolean[] result = new boolean[booleanValues.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = NativeBoolean.getBooleanFor((byte) booleanValues[i]);
        }
        return result;
    }

    public String[] getString(int... valueReferences) {
        String[] stringValues = new String[valueReferences.length];
        int status = invoke("GetString").with(component, valueReferences, valueReferences.length, stringValues).asInt();
        if (Status.translateStatus(status) != Status.OK)
            throw new RuntimeException("There was an error getting a variable inside the FMU");
        return stringValues;
    }

    public int setReal(int[] valueReferences, double[] values) {
        return invoke("SetReal").with(component, valueReferences, valueReferences.length, values).asInt();
    }

    public int setInteger(int[] valueReferences, int[] intValues) {
        return invoke("SetInteger").with(component, valueReferences, valueReferences.length, intValues).asInt();
    }

    public int setBoolean(int[] valueReferences, boolean[] booleanValues) {
        int[] booleanAsIntegers = new int[booleanValues.length];
        for (int i = 0; i < booleanAsIntegers.length; i++) {
            booleanAsIntegers[i] = NativeBoolean.getValueFor(booleanValues[i]);
        }
        return invoke("SetBoolean").with(component, valueReferences, valueReferences.length, booleanAsIntegers).asInt();
    }

    public int setString(int[] valueReferences, String[] stringValues) {
        return invoke("SetString").with(component, valueReferences, valueReferences.length, stringValues).asInt();
    }

    public Pointer getFmuState(Pointer state) {
        PointerByReference pointerByReference = new PointerByReference(state);
        invoke("GetFMUstate").with(component, pointerByReference).asInt();
        return pointerByReference.getValue();
    }

    public int setFmuState(Pointer pointer) {
        return invoke("SetFMUstate").with(component, pointer).asInt();
    }

    public int freeFmuState(Pointer state) {
        return invoke("FreeFMUstate").with(component, new PointerByReference(state)).asInt();
    }

    public int serializedFmuStateSize(Pointer state) {
        Memory memory = new Memory(Pointer.SIZE);
        invoke("SerializedFMUstateSize").with(component, state, memory).asInt();
        return memory.getInt(0);
    }

    public byte[] serializeFmuState(Pointer state) {
        int size = serializedFmuStateSize(state);
        byte[] byteBuffer = new byte[size];
        invoke("SerializeFMUstate").with(component, state, byteBuffer, size).asInt();
        return byteBuffer;
    }

    public Pointer deSerializeFMUState(byte[] serializedState) {
        PointerByReference pointerByReference = new PointerByReference(new Memory(Pointer.SIZE));
        invoke("DeSerializeFMUstate").with(component, serializedState, serializedState.length, pointerByReference).asInt();
        return pointerByReference.getValue();
    }

    public double[] getDirectionalDerivative(int[] unknownValueReferences, int[] knownValueReferences, double[] knownDifferential) {
        double[] sharedDoubles = new double[knownDifferential.length];
        invoke("GetDirectionalDerivative").with(component, unknownValueReferences, unknownValueReferences.length, knownValueReferences, knownValueReferences.length, knownDifferential, sharedDoubles).asInt();
        return sharedDoubles;
    }

    public int setRealInputDerivatives(int[] valueReferences, int[] orders, double[] values) {
        return invoke("SetRealInputDerivatives").with(component, valueReferences, valueReferences.length, orders, values).asInt();
    }

    public double[] getRealOutputDerivatives(int[] valueReferences, int[] orders) {
        double[] values = new double[valueReferences.length];
        invoke("GetRealOutputDerivatives").with(component, valueReferences, valueReferences.length, orders, values).asInt();
        return values;
    }

    public int doStep(double currentSimulationTime, double stepSize, boolean noSetFmuStatePriorToCurrentPoint) {
        return invoke("DoStep").with(component, currentSimulationTime, stepSize, noSetFmuStatePriorToCurrentPoint).asInt();
    }

    public int cancelStep() {
        return invoke("CancelStep").with(component).asInt();
    }

    public int getStatus(int statusKind) {
        Memory status = new Memory(Pointer.SIZE);
        invoke("GetStatus").with(component, statusKind, status).asInt();
        return status.getInt(0);
    }

    public double getRealStatus(int statusKind) {
        double[] realStatus = new double[1];
        invoke("GetRealStatus").with(component, statusKind, realStatus).asInt();
        return realStatus[0];
    }

    public int getIntegerStatus(int statusKind) {
        Memory integerStatus = new Memory(Pointer.SIZE);
        invoke("GetIntegerStatus").with(component, statusKind, integerStatus).asInt();
        return integerStatus.getInt(0);
    }

    public boolean getBooleanStatus(int statusKind) {
        Memory booleanStatus = new Memory(Pointer.SIZE);
        invoke("GetBooleanStatus").with(component, statusKind, booleanStatus).asInt();
        return booleanStatus.getInt(0) == 1;
    }

    public String getStringStatus(int statusKind) {
        PointerByReference stringStatus = new PointerByReference(new Memory(Pointer.SIZE));
        invoke("GetStringStatus").with(component, statusKind, stringStatus).asInt();
        return stringStatus.getValue().getString(0);
    }

    private Invocation invoke(final String name) {
        return toto -> new Invocation.Result() {
            @Override
            public Pointer asPointer() {
            	Function nf = function(name);
                return (Pointer) nf.invoke(Pointer.class, toto);
            }

            @Override
            public int asInt() {
                return function(name).invokeInt(toto);
            }

            @Override
            public void asVoid() {
                function(name).invoke(toto);
            }
        };
    }

    private Function function(String name) {
        return functions.get(name);
    }

    private String fmi2(String name) {
        return "fmi2" + name;
    }

    private interface Invocation {
        Result with(Object... args);

        interface Result {
            public Pointer asPointer();

            public int asInt();

            public void asVoid();
        }
    }
}