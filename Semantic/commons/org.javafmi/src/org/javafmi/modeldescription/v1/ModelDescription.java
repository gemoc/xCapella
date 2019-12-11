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
 package org.javafmi.modeldescription.v1;

import org.javafmi.modeldescription.NoSuchVariableException;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.*;

@Root(name = "fmiModelDescription", strict = false)
public class ModelDescription implements org.javafmi.modeldescription.ModelDescription {
	
	@Attribute
	private String fmiVersion;
	@Attribute
	private String modelName;
	@Attribute
	private String modelIdentifier;
	@Attribute
	private String guid;
	@Attribute(required = false)
	private String description;
	@Attribute(required = false)
	private String author;
	@Attribute(required = false)
	private String version;
	@Attribute(required = false)
	private String generationTool;
	@Attribute(required = false)
	private String generationDateAndTime;
	@Attribute(required = false)
	private String variableNamingConvention;
	@Attribute
	private String numberOfContinuousStates;
	@Attribute
	private String numberOfEventIndicators;
	@ElementList(name = "UnitDefinitions", required = false)
	private List<BaseUnit> unitDefinitions;
	@ElementList(name = "TypeDefinitions", required = false)
	private List<SimpleType> simpleTypeDefinitions;
	@Element(name = "DefaultExperiment", required = false)
	private DefaultExperiment defaultExperiment;
	@ElementList(name = "ModelVariables", required = false)
	private List<ScalarVariable> modelVariablesList = new ArrayList<>();
	private Map<String, ScalarVariable> modelVariables = new HashMap<>();
	private String[] variablesNames;

	@Override
	public String getFmiVersion() {
		return fmiVersion;
	}
	
	public String getModelName() {
		return modelName;
	}
	
	public int[] getValueReferences(String... variablesNames) {
		int variablesValueReferences[] = new int[variablesNames.length];
		for (int i = 0; i < variablesNames.length; i++) {
			variablesValueReferences[i] = modelVariables.get(variablesNames[i]).getValueReference();
		}
		return variablesValueReferences;
	}
	
	@Override
	public int getValueReference(String variableName) {
		return modelVariables.get(variableName).getValueReference();
	}
	
	@Override
	public String[] getModelVariablesNames() {
		if (variablesNames != null) return variablesNames;
		variablesNames = new String[modelVariablesList.size()];
		for (int i = 0; i < variablesNames.length; i++) {
			variablesNames[i] = modelVariablesList.get(i).getName();
		}
		return variablesNames;
	}
	
	public String getModelIdentifier() {
		return modelIdentifier;
	}
	
	public String getGuid() {
		return guid;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getVersion() {
		return version;
	}
	
	public String getGenerationTool() {
		return generationTool;
	}
	
	public String getGenerationDateAndTime() {
		return generationDateAndTime;
	}
	
	public String getVariableNamingConvention() {
		return variableNamingConvention;
	}
	
	public String getNumberOfContinuousStates() {
		return numberOfContinuousStates;
	}
	
	public String getNumberOfEventIndicators() {
		return numberOfEventIndicators;
	}
	
	public List<BaseUnit> getUnitDefinitions() {
		return unitDefinitions;
	}
	
	public List<SimpleType> getSimpleTypeDefinitions() {
		return simpleTypeDefinitions;
	}
	
	public SimpleType getTypeFromTypeDefinition(String name) {
		for (SimpleType simpleType : simpleTypeDefinitions)
			if (simpleType.getName().equals(name)) return simpleType.getType();
		return null;
	}
	
	public DefaultExperiment getDefaultExperiment() {
		return defaultExperiment;
	}
	
	public ScalarVariable[] getModelVariables() {
		return modelVariablesList.toArray(new ScalarVariable[modelVariablesList.size()]);
	}
	
	@Override
	public ScalarVariable getModelVariable(String name) {
		ScalarVariable scalarVariable = modelVariables.get(name);
		if (scalarVariable == null) throw new NoSuchVariableException(name);
		else return scalarVariable;
	}
	
	@Override
	public ModelDescription build() {
		for (ScalarVariable scalarVariable : modelVariablesList) {
			scalarVariable.buildAttributes();
			modelVariables.put(scalarVariable.getName(), scalarVariable);
		}
		return this;
	}
}
