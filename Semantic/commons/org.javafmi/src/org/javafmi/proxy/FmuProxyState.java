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

public class FmuProxyState {

    public static final FmuProxyState INSTANTIATED = new FmuProxyState("instantiated");
    public static final FmuProxyState INITTING = new FmuProxyState("initting");
    public static final FmuProxyState INITED = new FmuProxyState("inited");
    public static final FmuProxyState TERMINATED = new FmuProxyState("terminated");
    private String name;

    private FmuProxyState(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof FmuProxyState)) return false;
        FmuProxyState that = (FmuProxyState) o;
        return !(name != null ? !name.equals(that.name) : that.name != null);
    }

    @Override
    public String toString() {
        return name;
    }
}
