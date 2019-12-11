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
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import static org.javafmi.kernel.FileUtils.*;

public class Zipper {

    public File zipDirectory(File directory, String zipName) {
        File zipFile = new File(Paths.get(zipName).toUri());
        ZipOutputStream out = new ZipOutputStream(fileOutputStream(zipFile));
        addDir(directory, out, directory.toPath());
        close(out);
        return zipFile;
    }

    private void addDir(File dirObj, ZipOutputStream out, Path basePath) {
        try {
            for(File file : dirObj.listFiles()) {
                if(file.isDirectory()) {
                    putNextEntry(out, new ZipEntry(relativizePath(basePath, file).replace(File.separatorChar, '/') + "/"));
                    addDir(file, out, basePath);
                    out.closeEntry();
                    continue;
                }
                putNextEntry(out, new ZipEntry(relativizePath(basePath, file).replace(File.separatorChar, '/')));
                BufferedInputStream source = bufferedInputStream(fileInputStream(file));
                copyFromTo(source, out);
                out.closeEntry();
                close(source);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    private String relativizePath(Path basePath, File file) {
        return basePath.relativize(file.toPath()).toString();
    }

    private void putNextEntry(ZipOutputStream out, ZipEntry zipEntry) {
        try {
            out.putNextEntry(zipEntry);
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}
