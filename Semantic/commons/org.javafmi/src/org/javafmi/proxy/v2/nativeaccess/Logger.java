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

public class Logger implements FmiV2Interface.Logger {
    @Override
    public void logMessage(Pointer componentEnvironment, String instanceName, int status, String category, String message, Pointer args) {
        System.out.println("[" + instanceName + getCategory(category) + "] " + message);
    }

    private String getCategory(String category) {
        return category.isEmpty() ? "" : ":" + category;
    }
}
