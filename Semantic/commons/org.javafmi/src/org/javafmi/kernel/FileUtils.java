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

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.jar.JarOutputStream;
import java.util.zip.ZipFile;

public class FileUtils {
	public static File createDirectory(File root, String outPath) {
		return createDirectory(new File(root + "/" + outPath));
	}

	public static File createDirectory(File folderToCreate) {
		if (folderToCreate.exists() && folderToCreate.isDirectory()) return folderToCreate;
		if (!folderToCreate.mkdirs())
			throw new RuntimeException("Impossible to create the folder: " + folderToCreate.getAbsolutePath());
		return folderToCreate;
	}

	public static File createTempDirectory(String name) {
		try {
			return Files.createTempDirectory(name).toFile();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static File createFile(File outFolder, String outFileName) {
		File outFile = new File(outFolder.getPath() + "/" + outFileName).getAbsoluteFile();
		if (!outFile.getParentFile().exists()) outFile.getParentFile().mkdirs();
		return createFile(outFile);
	}

	private static File createFile(File outFile) {
		try {
			outFile.createNewFile();
			return outFile;
		} catch (IOException e) {
			throw new RuntimeException("Impossible to create the file: " + outFile, e);
		}
	}

	public static void deleteAll(File file) {
		if (file.isDirectory())
			for (File child : file.listFiles())
				deleteAll(child);
		try {
			Files.deleteIfExists(Paths.get(file.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static FileInputStream fileInputStream(File file) {
		try {
			return new FileInputStream(file);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(file.getAbsolutePath(), e);
		}
	}

	public static FileOutputStream fileOutputStream(File outFile) {
		try {
			return new FileOutputStream(outFile);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	public static BufferedInputStream bufferedInputStream(InputStream inputStream) {
		return new BufferedInputStream(inputStream);
	}

	public static BufferedOutputStream bufferedOutputStream(FileOutputStream outputStream) {
		return new BufferedOutputStream(outputStream);
	}


	public static void copyFromTo(InputStream source, OutputStream target) {
		try {
			byte[] buffer = new byte[2048];
			int readBytes;
			while ((readBytes = source.read(buffer)) != -1) {
				target.write(buffer, 0, readBytes);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static void close(OutputStream outputStream) {
		try {
			outputStream.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static void close(InputStream inputStream) {
		try {
			inputStream.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static void flush(OutputStream out) {
		try {
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static JarOutputStream jarOutputStream(OutputStream out) {
		try {
			return new JarOutputStream(out);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static ZipFile createZipFile(String pathToZip) {
		try {
			return new ZipFile(pathToZip);
		} catch (IOException e) {
			throw new RuntimeException("Impossible to create zip for " + pathToZip);
		}
	}
}
