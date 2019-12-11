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
 package org.javafmi.proxy.v2;

import org.javafmi.modeldescription.v2.Capabilities;
import org.javafmi.proxy.FmuProxyState;
import org.javafmi.proxy.MethodExecutionException;
import org.javafmi.proxy.State;
import org.javafmi.proxy.Status;
import org.javafmi.proxy.v2.nativeaccess.CallbackFunctions;
import org.javafmi.proxy.v2.nativeaccess.FmiV2;
import org.javafmi.proxy.v2.nativeaccess.FmiV2Interface;
import org.javafmi.modeldescription.FmiVersion;
import org.javafmi.modeldescription.ScalarVariable;
import org.javafmi.modeldescription.v2.EnumerationType;
import org.javafmi.modeldescription.v2.ModelDescription;

import static org.javafmi.proxy.Status.*;
import static org.javafmi.modeldescription.v2.Capabilities.*;

public class FmuProxy implements org.javafmi.proxy.FmuProxy {

	private final FmiV2 library;
	private final ModelDescription modelDescription;
	private final CallbackFunctions callbacks;
	private FmuProxyState fmuProxyState;

	public FmuProxy(FmiV2 library, ModelDescription modelDescription) {
		if (!hasCoSimulationSupport(modelDescription)) throw new RuntimeException("This Fmu does not support co-simulation execution");
		this.library = library;
		this.modelDescription = modelDescription;
		this.callbacks = createCallbacks();
	}

	private boolean hasCoSimulationSupport(ModelDescription modelDescription) {
		return modelDescription.getCoSimulation() != null;
	}

	private CallbackFunctions createCallbacks() {
		return checkCanRunAsynchronously(new CallbackFunctions());
	}

	private CallbackFunctions checkCanRunAsynchronously(CallbackFunctions callbackFunctions) {
		if (!modelDescription.check(Capabilities.CAN_RUN_ASYNCHRONOUSLY))
			callbackFunctions.stepFinished = null;
		return callbackFunctions;
	}

	@Override
	public String getVersion() {
		return FmiVersion.TWO;
	}

	@Override
	public void instantiate(String resourcesPath) {
		this.library.instantiate(
				modelDescription.getModelName(),
				FmiV2Interface.FmiType.fmiCoSimulation,
				modelDescription.getGuid(),
				"file://" + resourcesPath,
				callbacks,
				false,
				false);
		this.fmuProxyState = FmuProxyState.INSTANTIATED;
	}

	@Override
	public void freeInstance() {
		library.free();
	}

	public Status setDebugLogging(boolean loggingOn, String[] categories) {
		return Status.translateStatus(library.setDebugLogging(loggingOn, categories));
	}

	@Override
	public Status initialize(double startTime, double stopTime) {
		if (fmuProxyState.equals(FmuProxyState.INITED)) return WARNING;
		if(modelDescription.getDefaultExperiment() == null){
			if (ERROR == setUpExperiment(true, 0.1, startTime, true, stopTime))
				throw new MethodExecutionException("fmi2SetupExperiment: " + modelDescription.getModelIdentifier());	
		}
		if (ERROR == enterInitializationMode())
			throw new MethodExecutionException("fmi2SetupExperiment: " + modelDescription.getModelIdentifier());
		if (ERROR == exitInitializationMode())
			throw new MethodExecutionException("fmi2SetupExperiment: " + modelDescription.getModelIdentifier());
		return OK;
	}
	
	//rajout
	public Status initialize(double startTime, double stopTime,double solverTolerance) {
		if (fmuProxyState.equals(FmuProxyState.INITED)) return WARNING;
		if (ERROR == setUpExperiment(true, modelDescription.getDefaultExperiment().getTolerance(), startTime, true, stopTime))
			throw new MethodExecutionException("fmi2SetupExperiment: " + modelDescription.getModelIdentifier());
		if (ERROR == enterInitializationMode())
			throw new MethodExecutionException("fmi2SetupExperiment: " + modelDescription.getModelIdentifier());
		return OK;
	}

	public Status setUpExperiment(boolean toleranceDefined, double tolerance, double startTime, boolean stopTimeDefined, double stopTime) {
		return Status.translateStatus(library.setUpExperiment(toleranceDefined, tolerance, startTime, stopTimeDefined, stopTime));
	}

	public Status enterInitializationMode() {
		Status enterInitStatus = Status.translateStatus(library.enterInitializationMode());
		if (enterInitStatus.equals(OK)) fmuProxyState = FmuProxyState.INITTING;
		return enterInitStatus;
	}

	public Status exitInitializationMode() {
		Status exitInitStatus = Status.translateStatus(library.exitInitializationMode());
		if (exitInitStatus == OK) fmuProxyState = FmuProxyState.INITED;
		return exitInitStatus;
	}

	@Override
	public Status terminate() {
		Status terminateStatus = Status.translateStatus(library.terminate());
		if (terminateStatus.equals(OK)) fmuProxyState = FmuProxyState.TERMINATED;
		else fmuProxyState = FmuProxyState.INITED;
		return terminateStatus;
	}

	@Override
	public Status reset() {
		Status resetStatus = Status.translateStatus(library.reset());
		if (resetStatus.equals(Status.OK)) fmuProxyState = FmuProxyState.INSTANTIATED;
		return resetStatus;
	}

	public ModelDescription getModelDescription() {
		return modelDescription;
	}

	public Status setRealInputDerivatives(int[] valueReferences, int[] orders, double[] values) {
		return Status.translateStatus(library.setRealInputDerivatives(valueReferences, orders, values));
	}

	public double[] getRealOutputDerivatives(int[] valueReferences, int[] orders) {
		return library.getRealOutputDerivatives(valueReferences, orders);
	}

	@Override
	public double[] getReal(int... valueReference) {
		return library.getReal(valueReference);
	}

	@Override
	public int[] getInteger(int... valueReference) {
		return library.getInteger(valueReference);
	}

	@Override
	public boolean[] getBoolean(int... valueReference) {
		return library.getBoolean(valueReference);
	}

	@Override
	public String[] getString(int... valueReference) {
		return library.getString(valueReference);
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
	public Status setReal(int[] valueReferences, double[] doubleValues) {
		return Status.translateStatus(library.setReal(valueReferences, doubleValues));
	}

	@Override
	public Status setInteger(int[] valueReference, int[] intValue) {
		return Status.translateStatus(library.setInteger(valueReference, intValue));
	}

	@Override
	public Status setBoolean(int[] valueReference, boolean[] booleanValue) {
		return Status.translateStatus(library.setBoolean(valueReference, booleanValue));
	}

	@Override
	public Status setString(int[] valueReference, String[] stringValue) {
		return Status.translateStatus(library.setString(valueReference, stringValue));
	}

	public State getState(State state) {
		checkCapability("getState", Capabilities.CAN_GET_AND_SET_FMU_STATE);
		return state.SetPointer(library.getFmuState(state.GetPointer()));
	}

	public Status setState(State state) {
		checkCapability("setState", Capabilities.CAN_GET_AND_SET_FMU_STATE);
		return Status.translateStatus(library.setFmuState(state.GetPointer()));
	}

	public Status freeState(State state) {
		checkCapability("freeState", Capabilities.CAN_GET_AND_SET_FMU_STATE);
		return Status.translateStatus(library.freeFmuState(state.GetPointer()));
	}

	public int getStateSize(State state) {
		checkCapability("getStateSize", Capabilities.CAN_GET_AND_SET_FMU_STATE, Capabilities.CAN_SERIALIZE_FMU_STATE);
		return library.serializedFmuStateSize(state.GetPointer());
	}

	public byte[] serializeState(State state) {
		checkCapability("serializeState", Capabilities.CAN_GET_AND_SET_FMU_STATE, Capabilities.CAN_SERIALIZE_FMU_STATE);
		return library.serializeFmuState(state.GetPointer());
	}

	public State deserializeState(byte[] serializedState) {
		checkCapability("deserializeState", Capabilities.CAN_GET_AND_SET_FMU_STATE, Capabilities.CAN_SERIALIZE_FMU_STATE);
		return State.newStateFrom(library.deSerializeFMUState(serializedState));
	}

	public void checkCapability(String method, Capability... capabilitiesToCheck) {
		for (Capability capability : capabilitiesToCheck)
			if (!modelDescription.check(capability))
				throw new UnsupportedOperationException(method + " " + modelDescription.getModelIdentifier());
	}

	public double[] getDirectionalDerivative(int[] unknownVariablesValueReferences, int[] knownVariablesValueReferences, double[] knownDifferential) {
		if (!modelDescription.check(Capabilities.PROVIDES_DIRECTIONAL_DERIVATIVE))
			throw new UnsupportedOperationException("getDirectionalDerivative: " + modelDescription.getModelIdentifier());
		return library.getDirectionalDerivative(unknownVariablesValueReferences, knownVariablesValueReferences, knownDifferential);
	}

	@Override
	public Status doStep(double communicationPoint, double stepSize) {
		return Status.translateStatus(library.doStep(communicationPoint, stepSize, false));
	}

	@Override
	public Status cancelStep() {
		return Status.translateStatus(library.cancelStep());
	}

	@Override
	public boolean isTerminated() {
		return fmuProxyState.equals(FmuProxyState.TERMINATED);
	}

	
}
