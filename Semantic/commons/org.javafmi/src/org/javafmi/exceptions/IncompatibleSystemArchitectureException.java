/*

 Copyright 2013, 2014 SIANI - ULPGC
 Jose Juan Hernandez Cabrera
 Jose Evora Gomez
 Johan Sebastian Cortes Montenegro

 This File is Part of JavaFMI Project

 JavaFMI Project is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 JavaFMI Project is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with JavaFMI Library.  If not, see <http://www.gnu.org/licenses/>.

 */
package org.javafmi.exceptions;

public class IncompatibleSystemArchitectureException extends JavaFmiException {

    public IncompatibleSystemArchitectureException(String systemName) {
        super("System name: " + systemName);
    }
}
