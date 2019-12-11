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
 package org.javafmi.kernel;

import java.io.File;

public class PathBuilder {

    public static String buildPath(String[] folders) {
        String path = "";
        for(String component : folders)
            path += component + File.separatorChar;
        return path;
    }

    public static String buildPath(String[] folders, String file) {
        return buildPath(folders) + file;
    }

    public static String buildPath(String folder, String file) {
        return folder + File.separator + file;
    }
}
