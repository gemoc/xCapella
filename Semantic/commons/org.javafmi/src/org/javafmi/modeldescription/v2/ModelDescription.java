package org.javafmi.modeldescription.v2;

import org.javafmi.modeldescription.NoSuchVariableException;
import org.javafmi.modeldescription.v2.Capabilities.Capability;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Root(name = "fmiModelDescription")
public class ModelDescription implements org.javafmi.modeldescription.ModelDescription {

	@Attribute(required = true)
	private String fmiVersion;
	@Attribute(required = true)
	private String modelName;
	@Attribute(required = true)
	private String guid;
	@Attribute(required = false)
	private String description;
	@Attribute(required = false)
	private String author;
	@Attribute(required = false)
	private String version;
	@Attribute(required = false)
	private String copyright;
	@Attribute(required = false)
	private String licence;
	@Attribute(required = false)
	private String generationTool;
	@Attribute(required = false)
	private String generationDateAndTime;
	@Attribute(required = false)
	private String variableNamingConvention;
	@Attribute(required = false)
	private int numberOfEventIndicators;

	@ElementList(name = "UnitDefinitions", required = false)
	private List<Unit> unitDefinitions;
	@ElementList(name = "TypeDefinitions", required = false)
	private List<SimpleType> typeDefinitions;
	@ElementList(name = "LogCategories", required = false)
	private List<Category> logCategories;
	@Element(name = "DefaultExperiment", required = false)
	private DefaultExperiment defaultExperiment;
	@ElementList(name = "VendorAnnotations", required = false)
	private List<Tool> vendorAnnotations;
	@ElementList(name = "ModelVariables", required = true)
	private List<ScalarVariable> modelVariablesList = new ArrayList<>();
	@Element(name = "ModelStructure", required = true)
	private ModelStructure modelStructure;
	@Element(name = "ModelExchange", required = false)
	private ModelExchange modelExchange;
	@Element(name = "CoSimulation", required = false)
	private CoSimulation coSimulation;

	private Map<String, ScalarVariable> modelVariables = new HashMap<>();
	private String[] variablesNames;

	@Override
	public String getFmiVersion() {
		return fmiVersion;
	}

	public String getModelIdentifier() {
		return coSimulation.getModelIdentifier();
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

	public String getCopyright() {
		return copyright;
	}

	public String getLicence() {
		return licence;
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

	public int getNumberOfEventIndicators() {
		return numberOfEventIndicators;
	}

	public List<Unit> getUnitDefinitions() {
		return unitDefinitions;
	}

	public List<SimpleType> getTypeDefinitions() {
		return typeDefinitions;
	}

	public List<Category> getLogCategories() {
		return logCategories;
	}

	public List<Tool> getVendorAnnotations() {
		return vendorAnnotations;
	}

	public ModelStructure getModelStructure() {
		return modelStructure;
	}

	public ModelExchange getModelExchange() {
		return modelExchange;
	}

	public ScalarVariable[] getModelVariables() {
		return modelVariablesList.toArray(new ScalarVariable[modelVariablesList.size()]);
	}

	public SimpleType getTypeFromTypeDefinition(String name) {
		for (SimpleType type : typeDefinitions)
			if (type.getName().equals(name)) return type.getType();
		return null;
	}

	@Override
	public ScalarVariable getModelVariable(String variableName) {
		ScalarVariable scalarVariable = modelVariables.get(variableName);
		if (scalarVariable == null) throw new NoSuchVariableException(variableName);
		else return scalarVariable;
	}

	public String getModelName() {
		return modelName;
	}

	@Override
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

	public String getGuid() {
		return guid;
	}

	public CoSimulation getCoSimulation() {
		return coSimulation;
	}

	@Override
	public ModelDescription build() {
		for (ScalarVariable scalarVariable : modelVariablesList) {
			scalarVariable.buildAttributes();
			modelVariables.put(scalarVariable.getName(), scalarVariable);
		}
		return this;
	}

	public DefaultExperiment getDefaultExperiment() {
		return defaultExperiment;
	}

	public boolean check(Capability capability) {
		return coSimulation.capabilities().check(capability);
	}
	
	
}
