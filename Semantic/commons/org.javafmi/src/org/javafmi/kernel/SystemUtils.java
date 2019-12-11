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

public class SystemUtils {

    public static final String MAC = "Mac";
    public static final String WINDOWS = "Windows";
    public static final String LINUX = "Linux";

    public static void deleteAll(String fileName) {
        File file = new File(fileName);
        if (file.isDirectory()) {
            for (File subFile : file.listFiles()) {
                deleteAll(subFile.getAbsolutePath());
            }
        }
        file.delete();
    }

    public static boolean systemIsWin32() {
        return (getOSName().equals(WINDOWS) && getOSArch().contains("86"));
    }

    public static boolean systemIsWin64() {
        return (getOSName().equals(WINDOWS) && getOSArch().contains("64"));
    }

    public static boolean systemIsLinux32() {
        return (getOSName().equals(LINUX) && getOSArch().contains("86"));
    }

    public static boolean systemIsLinux64() {
        return (getOSName().contains(LINUX) && getOSArch().contains("64"));
    }

    public static boolean systemIsMac() {
        return (getOSName().equals(MAC));
    }

    public static String getOSArch() {
        return normalizeOsArch(System.getProperty("os.arch"));
    }

    private static String normalizeOsArch(String arch) {
        return arch.contains("64") ? "64" : "32";
    }

    public static String getOSName() {
        return normalizeOsName(System.getProperty("os.name"));
    }

    private static String normalizeOsName(String osName) {
        if (osName.contains(MAC)) return MAC;
        if (osName.contains(WINDOWS)) return WINDOWS;
        if (osName.contains(LINUX)) return LINUX;
        return "Unknown System";
    }
}
