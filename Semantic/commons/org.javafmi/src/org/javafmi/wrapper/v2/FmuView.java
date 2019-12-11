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

import org.javafmi.modeldescription.v2.Capabilities.Capability;
import org.javafmi.modeldescription.v2.ModelDescription;
import org.javafmi.modeldescription.v2.ScalarVariable;

public interface FmuView {
	
	ModelDescription getModelDescription();
	
	boolean check(Capability capability);
	
	ScalarVariable[] getModelVariables();
	
	ScalarVariable getModelVariable(String varName);
}
