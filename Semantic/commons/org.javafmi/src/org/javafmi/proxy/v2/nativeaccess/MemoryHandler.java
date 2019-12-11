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
 package org.javafmi.proxy.v2.nativeaccess;

import com.sun.jna.Native;
import com.sun.jna.Pointer;

import java.util.LinkedList;
import java.util.List;

public class MemoryHandler {

    private List<Pointer> pointers = new LinkedList<>();

    public Pointer allocateMemory(int numberOfObjects, int size) {
    	int nextFreeCellIndex = pointers.size();
        pointers.add(nextFreeCellIndex, createPointer((numberOfObjects * size)));
        return pointers.get(nextFreeCellIndex);
    }

    public void freeMemory(Pointer pointer) {
        if (pointers.remove(pointer))
            freePointer(pointer);
    }

    private Pointer createPointer(int size) {
        size++;
        long peer = Native.malloc(size);
        Pointer pointer = new Pointer(peer);
        pointer.setMemory(0,size, (byte) 0);
        return pointer;
    }

    public void terminate() {
        pointers.forEach(this::freePointer);
        pointers.clear();
    }

    private void freePointer(Pointer pointer) {
        Native.free(Pointer.nativeValue(pointer));
    }
}
