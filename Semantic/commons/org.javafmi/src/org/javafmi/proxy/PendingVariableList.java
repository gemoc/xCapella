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

import java.util.ArrayList;
import java.util.List;

public class PendingVariableList<T> {
    private List<Integer> valueReferences;
    private List<T> values;

    public PendingVariableList() {
        this.valueReferences = new ArrayList<>();
        this.values = new ArrayList<>();
    }

    public int[] getValueReferences() {
        int[] valueReferencesAsVector = new int[valueReferences.size()];
        for(int i = 0; i < valueReferencesAsVector.length; i++) {
            valueReferencesAsVector[i] = valueReferences.get(i);
        }
        return valueReferencesAsVector;
    }


    public double[] getValuesAsDoubles() {
        double[] valuesAsDoubleVector = new double[values.size()];
        for(int i = 0; i < valuesAsDoubleVector.length; i++) {
            valuesAsDoubleVector[i] = (Double) values.get(i);
        }
        return valuesAsDoubleVector;
    }

    public void add(Integer valueReference, T value) {
        valueReferences.add(valueReference);
        values.add(value);
    }

    public boolean isEmpty() {
        return valueReferences.isEmpty();
    }
}
