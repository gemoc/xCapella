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
 package org.javafmi.wrapper.generic;

import org.javafmi.modeldescription.FmiVersion;
import org.javafmi.modeldescription.ModelDescription;
import org.javafmi.modeldescription.ScalarVariable;
import org.javafmi.proxy.FmuFile;
import org.javafmi.proxy.FmuProxy;
import org.javafmi.proxy.ProxyFactory;
import org.javafmi.proxy.Status;
import org.javafmi.wrapper.Variable;
import org.javafmi.wrapper.VariableReader;
import org.javafmi.wrapper.VariableWriter;
import org.javafmi.wrapper.variables.BatchRead;
import org.javafmi.wrapper.variables.SingleRead;

import java.util.List;


@SuppressWarnings("Convert2MethodRef")
public class Simulation {

    private static final long DEFAULT_TIMEOUT = 1000;
    private FmuFile fmuFile;
    private ModelDescription modelDescription;
    private FmuProxy proxy;
    private VariableWriter variableWriter;
    private VariableReader variableReader;
    private double currentTime;
    private double stopTime;
    private double startTime;

    protected Simulation() {
    }

    public Simulation(String fmuPath) {
        this(fmuPath, DEFAULT_TIMEOUT);
    }

    /**
     * @deprecated timeout is no longer needed
     */
    @Deprecated
    public Simulation(String fmuPath, long timeout) {
        this(new FmuFile(fmuPath));
    }

    Simulation(FmuFile fmuFile) {
        this.proxy = ProxyFactory.createProxy(fmuFile.getModelDescription(), fmuFile.getLibraryPath());
        this.modelDescription = fmuFile.getModelDescription();
        this.fmuFile = fmuFile;
        this.proxy.instantiate(fmuFile.getResourcesDirectoryPath());
        this.createVariableHandlers();
        this.setVariablesWithInitialAsExact();
    }

    private void createVariableHandlers() {
        this.variableWriter = new VariableWriter(proxy, modelDescription);
        this.variableReader = new VariableReader(proxy, modelDescription);
    }

    private void setVariablesWithInitialAsExact() {
        if (!supportsInitial()) return;
        for (ScalarVariable scalarVariable : getModelDescription().getModelVariables()) {
            if (hasInitialAsExact(scalarVariable)) {
                variableWriter.write(scalarVariable.getName(), scalarVariable.getStart());
            }
        }
    }

    private boolean supportsInitial() {
        return proxy.getVersion().equals(FmiVersion.TWO);
    }

    private boolean hasInitialAsExact(ScalarVariable scalarVariable) {
        return scalarVariable.getInitial().equals("exact");
    }

    public ModelDescription getModelDescription() {
        return modelDescription;
    }

    public Status init(double startTime) {
        return init(startTime, 2 ^ 32);
    }

    public Status init(double startTime, double stopTime) {
        this.startTime = startTime;
        this.currentTime = startTime;
        this.stopTime = stopTime;
        return proxy.initialize(startTime, stopTime);
    }
    
    public Status init(double startTime, double stopTime, double solverTolerance) {
		this.startTime = startTime;
		this.currentTime = startTime;
		this.stopTime = stopTime;
		return proxy.initialize(startTime, stopTime, solverTolerance);
    }

    public Status doStep(double stepSize) {
        Status doStepStatus = proxy.doStep(currentTime, stepSize);
        if (doStepStatus == Status.OK) currentTime += stepSize;
        return doStepStatus;
    }
    
    public Status doStep(double time,double stepSize) {
		currentTime=time;
		Status doStepStatus = proxy.doStep(currentTime, stepSize);
		if (doStepStatus == Status.OK) currentTime += stepSize;
		return doStepStatus;
	}

    public Status cancelStep() {
        return proxy.cancelStep();
    }

    public Status terminate() {
        Status terminateStatus = proxy.terminate();
        proxy.freeInstance();
        return terminateStatus;
    }

    public Status reset() {
        Status resetStatus = proxy.reset();
        if (resetStatus.equals(Status.OK)) currentTime = startTime;
        return resetStatus;
    }

    /**
     * @deprecated better use:
     * double var = simulation.read(name).asDoubles()
     * int var = simulation.read(name).asInteger()
     * bool var = simulation.read(name).asBoolean()
     * String var = simulation.read(name).asString()
     */
    @Deprecated
    public Variable readVariable(String variableName) {
        return variableReader.read(variableName);
    }

    /**
     * @deprecated better use:
     * simulation.write(var1).with(value1)
     * take into account the type of the value should be as defined in the model
     */
    @Deprecated
    public Status writeVariable(String name, Object value) {
        return variableWriter.write(name, value);
    }

    public boolean isTerminated() {
        return proxy.isTerminated() || currentTime >= stopTime;
    }

    public double getCurrentTime() {
        return currentTime;
    }

    /**
     * @deprecated better use:
     * simulation.write(var1, var2, ...).with(value1, value2, ...)
     * take into account the type of the value should be as defined in the model
     */
    @Deprecated
    public void writeVariables(List<Variable> variablesToWrite) {
        variableWriter.write(variablesToWrite.toArray(new Variable[variablesToWrite.size()]));
    }

    /**
     * @deprecated better use:
     * double[] var = simulation.read(name1, name2, ...).asDoubles()
     * int[] var = simulation.read(name1, name2, ...).asIntegers()
     * bool[] var = simulation.read(name1, name2, ...).asBooleans()
     * String[] var = simulation.read(name1, name2, ...).asStrings()
     */
    @Deprecated
    public Variable[] readVariables(String[] variableNames) {
        return variableReader.read(variableNames);
    }

    protected static FmuProxy getProxy(Simulation simulation) {
        return simulation.proxy;
    }

    public WriteCall write(String... variablesNames) {
        return new WriteCall(proxy, modelDescription.getValueReferences(variablesNames));
    }

    public BatchRead read(String... variablesNames) {
        return new BatchRead(proxy, modelDescription.getValueReferences(variablesNames));
    }

    public SingleRead read(String variableName) {
        return new SingleRead(proxy, modelDescription.getValueReference(variableName));
    }

    public FmuFile getFmuFile() {
        return fmuFile;
    }

    public class WriteCall {
        private final FmuProxy proxy;
        private final int[] valueReferences;

        public WriteCall(FmuProxy proxy, int[] valueReferences) {
            this.proxy = proxy;
            this.valueReferences = valueReferences;
        }

        public Status with(int... values) {
            return proxy.setInteger(valueReferences, values);
        }

        public Status with(boolean... values) {
            return proxy.setBoolean(valueReferences, values);
        }

        public Status with(String... values) {
            return proxy.setString(valueReferences, values);
        }

        public Status with(double... values) {
            return proxy.setReal(valueReferences, values);
        }
    }

}
