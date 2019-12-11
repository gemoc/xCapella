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
 package org.javafmi.wrapper;


import org.javafmi.modeldescription.ModelDescription;
import org.javafmi.modeldescription.ScalarVariable;
import org.javafmi.proxy.FmuProxy;

public class VariableReader {

    private final ModelDescription modelDescription;
    private FmuProxy fmuProxy;

    public VariableReader(FmuProxy fmuProxy, ModelDescription modelDescription) {
        this.fmuProxy = fmuProxy;
        this.modelDescription = modelDescription;
    }

    public Variable read(String variableName) {
        ScalarVariable modelVariable = modelDescription.getModelVariable(variableName);
        if (modelVariable.isEnumeration())
            return buildEnumerationVariable(modelVariable);
        else
            return buildVariable(modelVariable);
    }

    public Variable[] read(String[] variableNames) {
        double[] realValues = fmuProxy.getReal(modelDescription.getValueReferences(variableNames));
        Variable[] valuesAsVariables = new Variable[realValues.length];
        for (int i = 0; i < valuesAsVariables.length; i++) {
            valuesAsVariables[i] = new Variable<>(variableNames[i], realValues[i]);
        }
        return valuesAsVariables;
    }

    private Variable buildEnumerationVariable(ScalarVariable modelVariable) {
        return new Variable(modelVariable.getName(), fmuProxy.getEnumeration(modelVariable));
    }

    private Variable buildVariable(ScalarVariable modelVariable) {
        String name = modelVariable.getName();
        int valueReference = modelVariable.getValueReference();
        switch (modelVariable.getTypeName()) {
            case "Real":
                return new Variable<>(name, fmuProxy.getReal(valueReference)[0]);
            case "Integer":
                return new Variable<>(name, fmuProxy.getInteger(valueReference)[0]);//modif
            case "Boolean":
                return new Variable<>(name, fmuProxy.getBoolean(valueReference)[0]);//modif
            case "String":
                return new Variable<>(name, fmuProxy.getString(valueReference)[0]);//modif
            default:
                break;
        }
        throw new RuntimeException("Unknown variable type: " + modelVariable.getTypeName());
    }
}
