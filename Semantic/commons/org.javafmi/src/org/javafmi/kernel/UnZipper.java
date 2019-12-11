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


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import static org.javafmi.kernel.FileUtils.createDirectory;
import static org.javafmi.kernel.FileUtils.createFile;
import static org.javafmi.kernel.SystemUtils.*;

public class UnZipper {

    private ZipFile zip;

    public UnZipper(File file) {
        if (!file.exists()) throw new RuntimeException("File " + file.getAbsolutePath() + " does not exists");
        zip = openZipForFile(file);
    }

    private ZipFile openZipForFile(File file) {
        try {
            return new ZipFile(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public File unzip(String fileName, File outFolder) {
        createDirectory(outFolder);
        return extractEntryToFile(zip.getEntry(fileName), createFile(outFolder, fileName));
    }

    public File unzipFileWithExtension(String entryPath, String extension, File outPath) {
        Enumeration<? extends ZipEntry> entries = zip.entries();
        while (entries.hasMoreElements()) {
            ZipEntry entry = entries.nextElement();
            if (entry.getName().replace("\\", "/").startsWith(entryPath) && entry.getName().endsWith(extension))
                return unzip(entry.getName(), outPath);
        }
        throw new RuntimeException(String.format("There are no entries in %s with extension %s", entryPath, extension));
    }

    public File unzipAllFilesInDirectory(String directoryToUnZip, File workingDirectory) {
        createDirectory(workingDirectory);
        ZipEntry entryToUnzip = zip.getEntry(directoryToUnZip + '/');
        if (entryToUnzip == null)
            throw new RuntimeException(directoryToUnZip + " is not a directory inside the zip");
        if (!entryToUnzip.isDirectory()) throw new RuntimeException(directoryToUnZip + " is not a directory");
        File extractedDirectory = createDirectory(workingDirectory, directoryToUnZip);
        Enumeration<? extends ZipEntry> entries = zip.entries();
        while (entries.hasMoreElements()) {
            ZipEntry entry = entries.nextElement();
            if (entry.getName().startsWith(directoryToUnZip) && !entry.getName().equals(directoryToUnZip + "/")) {
                if (entry.isDirectory()) createDirectory(workingDirectory, entry.getName());
                else extractEntryToFile(entry, createFile(workingDirectory, entry.getName()));
            }
        }
        return extractedDirectory;
    }

    public File unzipAll(File outputDirectory) {
        createDirectory(outputDirectory);
        Enumeration<? extends ZipEntry> entries = zip.entries();
        while (entries.hasMoreElements()) {
            ZipEntry entry = entries.nextElement();
            if (entry.isDirectory()) createDirectory(outputDirectory, entry.getName());
            else extractEntryToFile(entry, createFile(outputDirectory, entry.getName()));
        }
        return outputDirectory;
    }

    private File extractEntryToFile(ZipEntry entry, File outFile) {
        try {
            BufferedInputStream source = FileUtils.bufferedInputStream(zip.getInputStream(entry));
            BufferedOutputStream target = FileUtils.bufferedOutputStream(FileUtils.fileOutputStream(outFile));
            FileUtils.copyFromTo(source, target);
            FileUtils.close(source);
            FileUtils.close(target);
            setExecutionPermission(outFile);
            return outFile;
        } catch (Exception e) {
            throw new RuntimeException("Impossible to extract " + outFile.getName(), e);
        }
    }

    private void setExecutionPermission(File outFile) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if (systemIsLinux32() || systemIsLinux64() || systemIsMac()) {
            Class<?> fspClass = Class.forName("java.util.prefs.FileSystemPreferences");
            Method chmodMethod = fspClass.getDeclaredMethod("chmod", String.class, Integer.TYPE);
            chmodMethod.setAccessible(true);
            chmodMethod.invoke(null, outFile.getAbsolutePath(), 0777);
        }
    }
}
