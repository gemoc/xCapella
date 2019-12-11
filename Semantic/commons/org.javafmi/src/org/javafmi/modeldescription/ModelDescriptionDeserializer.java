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
 package org.javafmi.modeldescription;

import java.io.File;

import org.simpleframework.xml.core.Persister;

public class ModelDescriptionDeserializer {
	
	public static DeserializeRequest deserialize(File modelDescriptionFile) {
		return new DeserializeRequest(modelDescriptionFile);
	}
	
	public static class DeserializeRequest {
		private final File modelDescriptionFile;
		
		public DeserializeRequest(File modelDescriptionFile) {
			this.modelDescriptionFile = modelDescriptionFile;
		}
		
		public org.javafmi.modeldescription.v2.ModelDescription asV2() {
			return (org.javafmi.modeldescription.v2.ModelDescription) read(org.javafmi.modeldescription.v2.ModelDescription.class);
		}
		
		public org.javafmi.modeldescription.v1.ModelDescription asV1() {
			return (org.javafmi.modeldescription.v1.ModelDescription) read(org.javafmi.modeldescription.v1.ModelDescription.class);
		}

		private ModelDescription read(Class<? extends ModelDescription> modelDescription) {
			try {
				return new Persister().read(modelDescription, modelDescriptionFile).build();
			} catch (Exception e) {
				throw new RuntimeException("impossible to deserialize model description file", e);
			}
		}

		public ModelDescription as(String version) {
			return (FmiVersion.ONE.equals(version)) ? asV1() : asV2();
		}
	}
}
