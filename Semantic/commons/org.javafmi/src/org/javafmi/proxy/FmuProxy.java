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
 package org.javafmi.proxy;

import org.javafmi.modeldescription.ScalarVariable;

public interface FmuProxy {

	void instantiate(String resourcesPath);

	Status initialize(double startTime, double stopTime);

	Status initialize(double startTime, double stopTime, double solverTolerance);
	
	Status doStep(double communicationPoint, double stepSize);

	Status cancelStep();

	Status terminate();

	void freeInstance();

	Status reset();

	String getVersion();

	double[] getReal(int... valueReference);

	int[] getInteger(int... valueReference);

	boolean[] getBoolean(int... valueReference);

	String[] getString(int... valueReference);

	Object getEnumeration(ScalarVariable modelVariable);

	Status setReal(int[] valueReference, double[] doubleValue);

	Status setInteger(int[] valueReference, int[] intValue);

	Status setBoolean(int[] valueReference, boolean[] booleanValue);

	Status setString(int[] valueReference, String[] stringValue);

	boolean isTerminated();
}
