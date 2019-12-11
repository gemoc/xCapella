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
 package org.javafmi.proxy.v1.nativeaccess;

import com.sun.jna.Memory;
import com.sun.jna.Pointer;

import java.util.HashSet;
import java.util.Set;

public interface Native extends NativeInterface {

    public class Logger implements CallbackLogger {

        @Override
        public void record(Pointer fmiComponent, String logSource, int status, String category, String message, Pointer parameters) {
            System.out.print(logSource + " reports: " + category);
            System.out.format(" with status %d \n", status);
            if (parameters != null)
                System.out.println("There was a problem inside the fmu, but some information cannot be retrieved");
            System.out.println(message);
        }
    }

    public class AllocateMemory implements CallbackAllocateMemory {

        public static Set<Pointer> onMemoryAllocatedObjects = new HashSet<>();
        private int MEMORY_OFFSET = 4;

        @Override
        public Pointer allocate(Size_T numberOfObjects, Size_T objectSize) {
            Memory memoryToShare = new Memory(fixNumberOfObjects(numberOfObjects.intValue()) * objectSize.intValue());
            memoryToShare.align(MEMORY_OFFSET);
            memoryToShare.clear();
            onMemoryAllocatedObjects.add(memoryToShare);
            return memoryToShare;
        }

        private int fixNumberOfObjects(int numberOfObjects) {
            return (numberOfObjects <= 0) ? 1 : numberOfObjects;
        }
    }

    public class FreeMemory implements CallbackFreeMemory {

        @Override
        public void free(Pointer object) {
            AllocateMemory.onMemoryAllocatedObjects.remove(object);
            System.gc();
        }
    }

    public class StepFinished implements CallbackStepFinished {

        @Override
        public void apply(Pointer fmiComponent, int status) {
        }
    }
}
