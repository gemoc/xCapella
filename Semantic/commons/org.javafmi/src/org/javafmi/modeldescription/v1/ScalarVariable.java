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

import org.javafmi.modeldescription.SimpleType;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

public class ScalarVariable implements org.javafmi.modeldescription.ScalarVariable {

    @Attribute
    private String name;
    @Attribute
    private int valueReference;
    @Attribute(required = false)
    private String description;
    @Attribute(required = false)
    private String variability;
    @Attribute(required = false)
    private String causality;
    @Attribute(required = false)
    private String alias;
    @Element(name = "Real", required = false)
    private RealType realType;
    @Element(name = "Integer", required = false)
    private IntegerType integerType;
    @Element(name = "Boolean", required = false)
    private BooleanType booleanType;
    @Element(name = "String", required = false)
    private StringType stringType;
    @Element(name = "Enumeration", required = false)
    private EnumerationType enumerationType;
    @Element(name = "DirectDependency", required = false)
    private DirectDependency direcDependency;
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

    public SimpleType getType() {
        return type;
    }

    public String getTypeName() {
        return typeName;
    }

    @Override
    public boolean isEnumeration() {
        return getType() instanceof EnumerationType;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getValueReference() {
        return valueReference;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public String getVariability() {
        return variability;
    }

    @Override
    public String getCausality() {
        return causality;
    }

    @Override
    public Object getStart() {
        return null;
    }

    @Override
    public boolean hasStartValue() {
        return getStart() != null;
    }

    @Override
    public String getInitial() {
        throw new UnsupportedOperationException();
    }

    private SimpleType buildType() {
        if(realType != null)
            return realType;
        if(integerType != null)
            return integerType;
        if(booleanType != null)
            return booleanType;
        if(stringType != null)
            return stringType;
        if(enumerationType != null)
            return enumerationType;
        return null;
    }

    private String buildTypeName() {
        if(realType != null)
            return "Real";
        if(integerType != null)
            return "Integer";
        if(booleanType != null)
            return "Boolean";
        if(stringType != null)
            return "String";
        if(enumerationType != null)
            return "Enumeration";
        return "UndefinedType";
    }

    public ScalarVariable withValueReference(Integer valueReference) {
        this.valueReference = valueReference;
        return this;
    }

    public void defineAsReal() {
        this.realType = new RealType();
        this.typeName = RealType.DECLARED_TYPE;
        buildAttributes();
    }

    public void defineAsInteger() {
        this.integerType = new IntegerType();
        this.typeName = IntegerType.DECLARED_TYPE;
        buildAttributes();
    }

    public void defineAsBoolean() {
        this.booleanType = new BooleanType();
        this.typeName = BooleanType.DECLARED_TYPE;
        buildAttributes();
    }

    public void defineAsString() {
        this.stringType = new StringType();
        this.typeName = StringType.DECLARED_TYPE;
        buildAttributes();
    }
}
