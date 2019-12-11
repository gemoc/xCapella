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
 package org.javafmi.modeldescription.v2;

import org.javafmi.modeldescription.SimpleType;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

public class ScalarVariable implements org.javafmi.modeldescription.ScalarVariable {

	private static final String DEFAULT_CAUSALITY = "local";
	@Attribute(required = false)
	private String causality = DEFAULT_CAUSALITY;
	private static final String DEFAULT_VARIABILITY = "continuous";
	@Attribute(required = false)
	private String variability = DEFAULT_VARIABILITY;
	@Attribute(required = true)
	private String name;
	@Attribute(required = false)
	private int valueReference;
	@Attribute(required = false)
	private String description;
	@Attribute(required = false)
	private String initial;
	@Attribute(required = false)
	private int previous;
	@Attribute(required = false)
	private boolean canHandleMultipleSetPerTimeInstant;

	@Element(name = "Real", required = false)
	private RealType real;
	@Element(name = "Integer", required = false)
	private IntegerType integer;
	@Element(name = "Boolean", required = false)
	private BooleanType booleann;
	@Element(name = "String", required = false)
	private StringType string;
	@Element(name = "Enumeration", required = false)
	private EnumerationType enumeration;
	@ElementList(name = "Annotations", required = false)
	private List<Tool> annotations;
	private SimpleType type;
	private String typeName;

	public ScalarVariable() {
	}

	public ScalarVariable(String name) {
		this.name = name;
	}

	public void buildAttributes() {
		this.type = buildType();
		this.typeName = buildTypeName();
	}

	public String getName() {
		return name;
	}

	public Integer getValueReference() {
		return valueReference;
	}

	@Override
	public String getTypeName() {
		return typeName;
	}

	@Override
	public boolean isEnumeration() {
		return getType() instanceof EnumerationType;
	}

	public SimpleType getType() {
		return type;
	}

	@Override
	public String getVariability() {
		return variability;
	}

	@Override
	public String getCausality() {
		return causality;
	}

	@Override
	public Object getStart() {
		return getType().getStart();
	}

	@Override
	public boolean hasStartValue() {
		return getStart() != null;
	}

	private SimpleType buildType() {
		if (real != null)
			return real;
		if (integer != null)
			return integer;
		if (booleann != null)
			return booleann;
		if (string != null)
			return string;
		if (enumeration != null)
			return enumeration;
		return null;
	}

	private String buildTypeName() {
		if (real != null)
			return "Real";
		if (integer != null)
			return "Integer";
		if (booleann != null)
			return "Boolean";
		if (string != null)
			return "String";
		if (enumeration != null)
			return "Enumeration";
		return "UndefinedType";
	}

	public void defineAsReal() {
		this.real = new RealType();
		this.typeName = RealType.REAL_TYPE;
	}

	public ScalarVariable withValueReference(Integer valueReference) {
		this.valueReference = valueReference;
		return this;
	}

	public void defineAsInteger() {
		this.type = new IntegerType();
		this.typeName = IntegerType.INTEGER_TYPE;
	}

	public void defineAsBoolean() {
		this.type = new BooleanType();
		this.typeName = BooleanType.BOOLEAN_TYPE;
	}

	public void defineAsString() {
		this.type = new StringType();
		this.typeName = StringType.STRING_TYPE;
	}

	@Override
	public String getDescription() {
		return description;
	}

	public String getInitial() {
		if (initial != null) return initial;
		return initial = new UndefinedInitial().defineFrom(causality, variability);
	}

	public int getPrevious() {
		return previous;
	}

	public boolean canHandleMultipleSetPerTimeInstant() {
		return canHandleMultipleSetPerTimeInstant;
	}

	public List<Tool> getAnnotations() {
		return annotations;
	}
}
