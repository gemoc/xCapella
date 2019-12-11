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
import org.javafmi.proxy.Status;

public class VariableWriter {

    private final ModelDescription modelDescription;
    private FmuProxy fmuProxy;

    public VariableWriter(FmuProxy fmuProxy, ModelDescription modelDescription) {
        this.fmuProxy = fmuProxy;
        this.modelDescription = modelDescription;
    }

    public Status write(String name, Object value) {
        ScalarVariable modelVariable = modelDescription.getModelVariable(name);
        int valueReference = modelVariable.getValueReference();
        switch(modelVariable.getTypeName()) {
            case "Real":
                return fmuProxy.setReal(new int[]{valueReference}, new double[]{getDoubleValue(value)});
            case "Integer":
                return fmuProxy.setInteger(new int[]{valueReference}, new int[]{getIntValue(value)});
            case "Boolean":
                return fmuProxy.setBoolean(new int[]{valueReference}, new boolean[]{getBooleanValue(value)});
            case "String":
                return fmuProxy.setString(new int[]{valueReference}, new String[]{getStringValue(value)});
            default:
                break;
        }
        return Status.ERROR;
    }

    public void write(Variable... variablesToWrite) {
        double[] values = extractValues(variablesToWrite);
        int[] valueReferences = modelDescription.getValueReferences(extractNames(variablesToWrite));
        fmuProxy.setReal(valueReferences, values);
    }

    private String[] extractNames(Variable[] variablesToWrite) {
        String[] names = new String[variablesToWrite.length];
        for(int i = 0; i < names.length; i++) {
            names[i] = variablesToWrite[i].getName();
        }
        return names;
    }

    private double[] extractValues(Variable[] variablesToWrite) {
        double[] values = new double[variablesToWrite.length];
        for(int i = 0; i < values.length; i++) {
            values[i] = (Double) variablesToWrite[i].getValue();
        }
        return values;
    }

    private double getDoubleValue(Object value) {
        return Double.parseDouble(getStringValue(value));
    }

    private Integer getIntValue(Object value) {
        return Integer.parseInt(getStringValue(value));
    }

    private Boolean getBooleanValue(Object value) {
        return Boolean.parseBoolean(getStringValue(value));
    }

    private String getStringValue(Object value) {
        return String.valueOf(value);
    }
}
