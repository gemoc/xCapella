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

import org.javafmi.kernel.FileUtils;
import org.javafmi.kernel.UnZipper;
import org.javafmi.modeldescription.FmiVersion;
import org.javafmi.modeldescription.ModelDescription;
import org.javafmi.modeldescription.ModelDescriptionDeserializer;

import java.io.File;

import static java.lang.System.getProperty;

public class FmuFile {

    public static final String BINARIES_FOLDER = "binaries";
    public static final String MAC_OS_FOLDER = "darwin";
    public static final String WINDOWS_FOLDER = "win";
    public static final String LINUX_FOLDER = "linux";
    public static final String MAC_OS_LIBRARY_EXTENSION = ".dylib";
    public static final String WINDOWS_LIBRARY_EXTENSION = ".dll";
    public static final String LINUX_LIBRARY_EXTENSION = ".so";
    public static final String ARCH_64 = "64";
    public static final String ARCH_32 = "32";
    public static final String MISSING_SYSTEM_MESSAGE = "JavaFMI is not prepared to your system";
    private static final String MODEL_DESCRIPTION_FILENAME = "modelDescription.xml";
    private final File fmuFile;
    private final File workingDirectory;
    private File libraryFile;
    private File resourcesDirectory;
    private File modelDescriptionFile;
    private UnZipper unZipper;
    private String fmiVersion;

    public FmuFile(String filePath) {
        this(new File(filePath));
    }

    public FmuFile(File fmuFile) {
        this.fmuFile = fmuFile;
        this.unZipper = new UnZipper(fmuFile);
        this.workingDirectory = createTemporal();
        unZipper.unzipAll(workingDirectory);
        //tricks for SystemC FMU
        File exeFile = new File(workingDirectory.getAbsoluteFile()+"/"+fmuFile.getName().replace(".fmu", ".x"));
        if(exeFile.exists()){
        	exeFile.setExecutable(true);
        }
        this.fmiVersion = new FmiVersionIdentifier().identify(getModelDescriptionFile());
    }

    private File createTemporal() {
        File tempDirectory = new File(System.getProperty("java.io.tmpdir") + "/fmu_" + System.currentTimeMillis() + fmuFile.getName().replace(".fmu", ""));
        tempDirectory.mkdirs();
        return tempDirectory;
    }

    public void deleteTemporal() {
        deleteAll(workingDirectory);
    }

    public String getLibraryPath() {
        if (libraryFile != null) return libraryFile.getAbsolutePath();
        this.libraryFile = unZipper.unzipFileWithExtension(libraryPathInZip(), getLibraryExtension(), workingDirectory);
        return libraryFile.getAbsolutePath();
    }

    private String libraryPathInZip() {
        return BINARIES_FOLDER + "/" + getLibraryFolder() + getSystemArchitecture();
    }

    private String getLibraryFolder() {
        if (systemIsMacOS(getSystemName())) return MAC_OS_FOLDER;
        else if (systemIsWindows(getSystemName())) return WINDOWS_FOLDER;
        else if (systemIsLinux(getSystemName())) return LINUX_FOLDER;
        throw new RuntimeException(MISSING_SYSTEM_MESSAGE);

    }


    private String getSystemArchitecture() {
        return is64bitsArchitecture(getProperty("os.arch").toLowerCase()) ? ARCH_64 : ARCH_32;
    }

    private String getLibraryExtension() {
        if (systemIsMacOS(getSystemName())) return MAC_OS_LIBRARY_EXTENSION;
        else if (systemIsWindows(getSystemName())) return WINDOWS_LIBRARY_EXTENSION;
        else if (systemIsLinux(getSystemName())) return LINUX_LIBRARY_EXTENSION;
        throw new RuntimeException(MISSING_SYSTEM_MESSAGE);
    }

    private String getSystemName() {
        return getProperty("os.name").toLowerCase();
    }

    private boolean systemIsMacOS(String operatingSystem) {
        return operatingSystem.startsWith("mac");
    }

    private boolean systemIsWindows(String operatingSystemName) {
        return operatingSystemName.startsWith("win");
    }

    private boolean systemIsLinux(String operatingSystemName) {
        return operatingSystemName.startsWith("linux");
    }

    private boolean is64bitsArchitecture(String architecture) {
        return architecture.contains(ARCH_64);
    }

    public String getWorkingDirectoryPath() {
        return workingDirectory.getAbsolutePath();
    }

    private void deleteAll(File file) {
        if (file.isDirectory())
            for (File child : file.listFiles())
                deleteAll(child);
        file.delete();
    }

    public ModelDescription getModelDescription() {
        if (fmiVersion.equals(FmiVersion.ONE))
            return ModelDescriptionDeserializer.deserialize(getModelDescriptionFile()).asV1().build();
        else return ModelDescriptionDeserializer.deserialize(getModelDescriptionFile()).asV2().build();
    }

    private File getModelDescriptionFile() {
        if (this.modelDescriptionFile == null)
            modelDescriptionFile = unZipper.unzip(MODEL_DESCRIPTION_FILENAME, workingDirectory);
        return modelDescriptionFile;
    }


    public String getResourcesDirectoryPath() {
        if (resourcesDirectory == null) resourcesDirectory = getResourcesDirectory(unZipper);
        return resourcesDirectory.getAbsolutePath();
    }

    public File getResourcesDirectory(UnZipper unZipper) {
        try {
            return unZipper.unzipAllFilesInDirectory("resources", workingDirectory);
        } catch (RuntimeException e) {
            return FileUtils.createDirectory(workingDirectory, "resources");
        }
    }
}
