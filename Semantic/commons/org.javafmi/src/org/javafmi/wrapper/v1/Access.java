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
 package org.javafmi.wrapper.v1;

import org.javafmi.modeldescription.v1.Capabilities;
import org.javafmi.modeldescription.v1.ModelDescription;
import org.javafmi.modeldescription.v1.ScalarVariable;
import org.javafmi.proxy.FmuFile;
import org.javafmi.proxy.Status;
import org.javafmi.proxy.v1.FmuProxy;
import org.javafmi.wrapper.generic.Simulation2;

public class Access implements FmuView {

	private final ModelDescription modelDescription;
	private final FmuFile fmuFile;
	private final FmuProxy proxy;

	public Access(Simulation2 simulation) {
		this(new ProxyRetriever(simulation).proxy,
				(ModelDescription) simulation.getModelDescription(),
				simulation.getFmuFile());
	}

	Access(FmuProxy proxy, ModelDescription modelDescription, FmuFile fmuFile) {
		this.proxy = proxy;
		this.modelDescription = modelDescription;
		this.fmuFile = fmuFile;
	}
	
	@Override
	public ModelDescription getModelDescription() {
		return modelDescription;
	}

	@Override
	public boolean check(Capabilities.Capability capability) {
		throw new UnsupportedOperationException();
	}

	@Override
	public ScalarVariable[] getModelVariables() {
		return modelDescription.getModelVariables();
	}

	@Override
	public ScalarVariable getModelVariable(String varName) {
		return modelDescription.getModelVariable(varName);
	}

	public String getVersion() {
		return proxy.getVersion();
	}

	public void instantiate(double timeout) {
		proxy.instantiate(fmuFile.getResourcesDirectoryPath());
	}

	public Status terminate() {
		return proxy.terminate();
	}

	public Status reset() {
		return proxy.reset();
	}

	public void freeInstance() {
		proxy.freeInstance();

	}

	public Status doStep(double simulationTime, double stepSize) {
		return proxy.doStep(simulationTime, stepSize);
	}

	public Status cancelStep() {
		return proxy.cancelStep();
	}

	public Object getEnumeration(ScalarVariable modelVariable) {
		return proxy.getEnumeration(modelVariable);
	}

	public double[] getReal(int... valueReference) {
		return proxy.getReal(valueReference);
	}

	public int[] getInteger(int... valueReference) {
		return proxy.getInteger(valueReference);
	}

	public boolean[] getBoolean(int... valueReference) {
		return proxy.getBoolean(valueReference);
	}

	public String[] getString(int... valueReference) {
		return proxy.getString(valueReference);
	}

	public Status setReal(int[] valueReference, double[] newValue) {
		return proxy.setReal(valueReference, newValue);
	}

	public Status setInteger(int[] valueReference, int[] newValue) {
		return proxy.setInteger(valueReference, newValue);
	}

	public Status setBoolean(int[] valueReference, boolean[] newValue) {
		return proxy.setBoolean(valueReference, newValue);
	}

	public Status setString(int[] valueReference, String[] newValue) {
		return proxy.setString(valueReference, newValue);
	}

	public Status setIsDoingLogging(boolean isDoingLogging) {
		return proxy.setIsDoingLogging(isDoingLogging);
	}

	public boolean isTerminated() {
		return proxy.isTerminated();
	}
	
	private static class ProxyRetriever extends Simulation2 {
		private final FmuProxy proxy;

		private ProxyRetriever(Simulation2 simulation) {
			checkVersion(simulation);
			this.proxy = (FmuProxy) getProxy(simulation);
		}

		private void checkVersion(Simulation2 simulation) {
			if (getProxy(simulation) instanceof FmuProxy) return;
			throw new RuntimeException("Access to FMU does not match with Simulation version");
		}
	}
}
