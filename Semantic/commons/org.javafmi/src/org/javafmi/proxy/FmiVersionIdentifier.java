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

import org.javafmi.modeldescription.FmiVersion;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class FmiVersionIdentifier {

    public static final String FMI_VERSION_LABEL = "fmiVersion";
    public static final String VERSION_ONE_LABEL = "1.0";
    public static final String VERSION_TWO_LABEL = "2.0";
    private static final Map<String, String> versions;

    static {
        versions = new LinkedHashMap<>();
        versions.put(VERSION_ONE_LABEL, FmiVersion.ONE);
        versions.put(VERSION_TWO_LABEL, FmiVersion.TWO);
    }

    public String identify(File modelDescriptionFile) {
        return versions.get(readVersionFromFile(modelDescriptionFile));
    }

    private String readVersionFromFile(File modelDescriptionFile) {
        BufferedReader reader = getBufferedReader(modelDescriptionFile);
        String line;
        while(!(line = readLine(reader)).contains(FMI_VERSION_LABEL)) ;
        closeReader(reader);
        return (line.contains(VERSION_ONE_LABEL)) ? VERSION_ONE_LABEL : VERSION_TWO_LABEL;
    }

    private void closeReader(BufferedReader reader) {
        try {
            reader.close();
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String readLine(BufferedReader reader) {
        try {
            return reader.readLine();
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

    private BufferedReader getBufferedReader(File modelDescriptionFile) {
        try {
            return new BufferedReader(new FileReader(modelDescriptionFile));
        } catch(FileNotFoundException e) {
            throw new RuntimeException("Can not read the version from file " + modelDescriptionFile.getPath(), e);
        }
    }
}
