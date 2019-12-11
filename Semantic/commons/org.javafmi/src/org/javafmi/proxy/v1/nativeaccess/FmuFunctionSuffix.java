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

public class FmuFunctionSuffix {

    public static final String SET_DEBUG = "_fmiSetDebugLogging";
    public static final String GET_REAL = "_fmiGetReal";
    public static final String GET_INTEGER = "_fmiGetInteger";
    public static final String GET_BOOLEAN = "_fmiGetBoolean";
    public static final String GET_STRING = "_fmiGetString";
    public static final String SET_REAL = "_fmiSetReal";
    public static final String SET_INTEGER = "_fmiSetInteger";
    public static final String SET_BOOLEAN = "_fmiSetBoolean";
    public static final String SET_STRING = "_fmiSetString";
    public static final String INSTANTIATE = "_fmiInstantiateSlave";
    public static final String INITIALIZE = "_fmiInitializeSlave";
    public static final String TERMINATE = "_fmiTerminateSlave";
    public static final String FREE = "_fmiFreeSlaveInstance";
    public static final String RESET = "_fmiResetSlave";
    public static final String DO_STEP = "_fmiDoStep";
    public static final String CANCEL_STEP = "_fmiCancelStep";

    public static String[] getFunctionsSuffix() {
        return new String[]{SET_DEBUG, GET_REAL, GET_INTEGER, GET_BOOLEAN, GET_STRING, SET_REAL, SET_INTEGER, SET_BOOLEAN, SET_STRING, INSTANTIATE, INITIALIZE, TERMINATE, FREE, RESET, DO_STEP, CANCEL_STEP};
    }
}
