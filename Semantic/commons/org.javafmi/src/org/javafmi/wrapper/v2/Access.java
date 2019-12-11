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
 package org.javafmi.wrapper.v2;

import java.util.List;

import org.javafmi.modeldescription.v2.Capabilities;
import org.javafmi.modeldescription.v2.ModelDescription;
import org.javafmi.modeldescription.v2.ScalarVariable;
import org.javafmi.proxy.FmuFile;
import org.javafmi.proxy.State;
import org.javafmi.proxy.Status;
import org.javafmi.proxy.v2.FmuProxy;
import org.javafmi.wrapper.generic.Simulation2;

import static java.util.Arrays.fill;

public class Access implements FmuView {
	private FmuProxy proxy;
	private ModelDescription modelDescription;
	private FmuFile fmuFile;

	public Access(String fmuPath) {
		this(new Simulation2(fmuPath));
	}

	public Access(Simulation2 simulation) {
		this(new ProxyRetriever(simulation).proxy, (ModelDescription) simulation.getModelDescription(), simulation.getFmuFile());
	}

	Access(FmuProxy proxy, ModelDescription modelDescription, FmuFile fmuFile) {
		this.proxy = proxy;
		this.modelDescription = modelDescription;
		this.fmuFile = fmuFile;
	}

	public String getVersion() {
		return proxy.getVersion();
	}

	@Deprecated
	public double[][] getDirectionalDerivatives(String[] unknownVariables, String[] knownVariables) {
		double[][] directionalMatrix = new double[unknownVariables.length][knownVariables.length];
		for (int i = 0; i < unknownVariables.length; i++) {
			for (int j = 0; j < knownVariables.length; j++) {
				directionalMatrix[i][j] = getDirectionalDerivative(unknownVariables[j],
						knownVariables[i])[0];
			}
		}
		return directionalMatrix;
	}

	@Deprecated
	public double[] getDirectionalDerivative(String knownVariable, String... unknownVariables) {
		int unknownVariablesValueReferences[] = modelDescription.getValueReferences(unknownVariables);
		int knownVariablesValueReferences[] = modelDescription.getValueReferences(knownVariable);
		return proxy.getDirectionalDerivative(unknownVariablesValueReferences, knownVariablesValueReferences, new double[]{1.0});
	}

	public String getModelName() {
		return modelDescription.getModelName();
	}

	public Status doStep(double simulationTime, double stepSize) {
		return proxy.doStep(simulationTime, stepSize);
	}

	public Status cancelStep() {
		return proxy.cancelStep();
	}

	public Status terminate() {
		return proxy.terminate();
	}

	public void freeInstance() {
		proxy.freeInstance();
		fmuFile.deleteTemporal();
	}

	public Status reset() {
		return proxy.reset();
	}

	public double[] getReal(int... valueReference) {
		return proxy.getReal(valueReference);
	}
	
	public double[] getReal(String[] variableNames) {
    	int valueReferences[] = getValueReferences(variableNames);
        return proxy.getReal(valueReferences);
    }

	public int[] getInteger(int... valueReference) {
		return proxy.getInteger(valueReference);
	}

	public boolean[] getBoolean(int... valueReference) {
		return proxy.getBoolean(valueReference);
	}
	
	public boolean[] getBoolean(String[] variableNames) {
    	int valueReferences[] = getValueReferences(variableNames);
        return proxy.getBoolean(valueReferences);
    }

	public String[] getString(int... valueReference) {
		return proxy.getString(valueReference);
	}

	public Object getEnumeration(ScalarVariable modelVariable) {
		return proxy.getEnumeration(modelVariable);
	}

	public Status setReal(int[] valueReference, double[] doubleValue) {
		return proxy.setReal(valueReference, doubleValue);
	}
	
	public Status setReal(String[] variableNames, double [] doubleValues){
    	int valueReferences[] = getValueReferences(variableNames);
    	return proxy.setReal(valueReferences, doubleValues);
    }

	public Status setInteger(int[] valueReference, int[] intValue) {
		return proxy.setInteger(valueReference, intValue);
	}

	public Status setBoolean(int[] valueReference, boolean[] booleanValue) {
		return proxy.setBoolean(valueReference, booleanValue);
	}
	
	public Status setBoolean(String[] variableNames, boolean [] booleanValues){
    	int valueReferences[] = getValueReferences(variableNames);
    	return proxy.setBoolean(valueReferences, booleanValues);
    }

	public Status setString(int[] valueReference, String[] stringValue) {
		return proxy.setString(valueReference, stringValue);
	}

	public Status enterInitializationMode() {
		return proxy.enterInitializationMode();
	}

	public Status exitInitializationMode() {
		return proxy.exitInitializationMode();
	}

	public Status setUpExperiment(boolean toleranceDefined, double tolerance, double startTime, boolean stopTimeDefined, double stopTime) {
		return proxy.setUpExperiment(toleranceDefined, tolerance, startTime, stopTimeDefined, stopTime);
	}

	public Status setDebugLogging(boolean loggingOn, int numberOfCategories, String[] categories) {
		return proxy.setDebugLogging(loggingOn, categories);
	}

	public State getState(State state) {
		return proxy.getState(state);
	}

	public Status setState(State state) {
		return proxy.setState(state);
	}

	public Status freeState(State state) {
		return proxy.freeState(state);
	}

	public int getStateSize(State state) {
		return proxy.getStateSize(state);
	}

	public byte[] serializeState(State state) {
		return proxy.serializeState(state);
	}

	public State deserializeState(byte[] serializedState) {
		return proxy.deserializeState(serializedState);
	}

	public void instantiate(double timeout) {
		proxy.instantiate(fmuFile.getResourcesDirectoryPath());
	}

	public Status setRealInputDerivatives(String[] realInputNames, double[] derivatives) {
		return proxy.setRealInputDerivatives(modelDescription.getValueReferences(realInputNames), getDefaultOrders(derivatives.length), derivatives);
	}
	
	public Status setRealInputDerivatives(String[] realInputNames,int[] Order, double[] derivatives) {
    	return proxy.setRealInputDerivatives(modelDescription.getValueReferences(realInputNames), Order, derivatives);		
	}

	public double[] getRealOutputDerivatives(String[] realInputNames) {
		return proxy.getRealOutputDerivatives(modelDescription.getValueReferences(realInputNames), getDefaultOrders(realInputNames.length));
	}

	private int[] getDefaultOrders(int length) {
		int[] orders = new int[length];
		fill(orders, 1);
		return orders;
	}

	public int[] getValueReferences(String[] variables) {
		return modelDescription.getValueReferences(variables);
	}

	public int getValueReference(String variable) {
		return modelDescription.getValueReference(variable);
	}

	public double[] getDirectionalDerivative(int[] unknownValueReferences, int[] knownValueReferences, double[] knownDerivative) {
		return proxy.getDirectionalDerivative(unknownValueReferences, knownValueReferences, knownDerivative);
	}
	
	public double[] getDirectionalDerivative(List<String> independentContinuousTimeVariables, List<String> stateDerivativesOrOutputsVariables, double[] knownDerivatives) {
        int independentContinuousTimeVariablesValueReferences[] = modelDescription.getValueReferences(independentContinuousTimeVariables.toArray(new String[independentContinuousTimeVariables.size()]));
        int stateDerivativesOrOutputsVariablesValueReferences[] = modelDescription.getValueReferences(stateDerivativesOrOutputsVariables.toArray(new String[stateDerivativesOrOutputsVariables.size()]));
        return proxy.getDirectionalDerivative(independentContinuousTimeVariablesValueReferences, stateDerivativesOrOutputsVariablesValueReferences, knownDerivatives);
    }

	@Override
	public ModelDescription getModelDescription() {
		return modelDescription;
	}

	@Override
	public boolean check(Capabilities.Capability capability) {
		return modelDescription.check(capability);
	}

	@Override
	public ScalarVariable[] getModelVariables() {
		return modelDescription.getModelVariables();
	}

	@Override
	public ScalarVariable getModelVariable(String varName) {
		return modelDescription.getModelVariable(varName);
	}

	private static class ProxyRetriever extends Simulation2 {
		private final FmuProxy proxy;

		public ProxyRetriever(Simulation2 simulation) {
			checkVersion(simulation);
			this.proxy = (FmuProxy) getProxy(simulation);
		}

		private void checkVersion(Simulation2 simulation) {
			if (getProxy(simulation) instanceof FmuProxy) return;
			throw new RuntimeException("Access to FMU does not match with Simulation version");
		}
	}
}
