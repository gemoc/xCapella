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
 package org.javafmi.wrapper.variables;

import org.javafmi.proxy.FmuProxy;

public class BatchRead {

    private final FmuProxy proxy;
    private final int[] valueReferences;

    public BatchRead(FmuProxy proxy, int[] valueReferences) {
        this.proxy = proxy;
        this.valueReferences = valueReferences;
    }

    public int[] asInteger() {
        return proxy.getInteger(valueReferences);
    }

    public boolean[] AsBoolean() {
        return proxy.getBoolean(valueReferences);
    }

    public String[] AsString() {
        return proxy.getString(valueReferences);
    }

    public double[] asDoubles() {
        return proxy.getReal(valueReferences);
    }
}
