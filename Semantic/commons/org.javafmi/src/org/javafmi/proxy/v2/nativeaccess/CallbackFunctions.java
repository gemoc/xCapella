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

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class CallbackFunctions extends Structure {

    public FmiV2Interface.Logger logger;
    public FmiV2Interface.MemoryAllocator memoryAllocator;
    public FmiV2Interface.MemoryLiberator memoryLiberator;
    public FmiV2Interface.StepFinished stepFinished;
    public Pointer componentEnvironment;

    public CallbackFunctions() {
        super();
        this.logger = new Logger();
        MemoryHandler memoryHandler = new MemoryHandler();
        this.memoryAllocator = memoryHandler::allocateMemory;
        this.memoryLiberator = memoryHandler::freeMemory;
        this.stepFinished = new StepFinished();
        this.componentEnvironment = null;
    }

    @Override
    protected List getFieldOrder() {
        return Arrays.asList("logger", "memoryAllocator", "memoryLiberator", "stepFinished", "componentEnvironment");
    }
}
