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

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class CallbackFunctionsStructure extends Structure {

    public NativeInterface.CallbackLogger logger;
    public NativeInterface.CallbackAllocateMemory allocateMemory;
    public NativeInterface.CallbackFreeMemory freeMemory;
    public NativeInterface.CallbackStepFinished stepFinished;

    public CallbackFunctionsStructure() {
        super();
        this.logger = new Native.Logger();
        this.allocateMemory = new Native.AllocateMemory();
        this.freeMemory = new Native.FreeMemory();
        this.stepFinished = new Native.StepFinished();
        setAlignType(Structure.ALIGN_GNUC);
    }

    @Override
    protected List getFieldOrder() {
        return Arrays.asList("logger", "allocateMemory", "freeMemory", "stepFinished");
    }

    public static class ByValue extends CallbackFunctionsStructure implements Structure.ByValue {

        public ByValue() {
            super();
        }
    }
}
