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

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class SimpleType implements org.javafmi.modeldescription.SimpleType {

    @Attribute(required = false)
    private String name;
    @Attribute(required = false)
    private String description;
    @Attribute(required = false)
    private String quantity;
    @Attribute(required = false)
    private double min;
    @Attribute(required = false)
    private double max;
    @Attribute(required = false)
    private String declaredType;
    @Attribute(required = false)
    private boolean fixed;
    @Element(name = "RealType", required = false)
    private RealType realType;
    @Element(name = "BooleanType", required = false)
    private BooleanType booleanType;
    @Element(name = "IntegerType", required = false)
    private IntegerType integerType;
    @Element(name = "StringType", required = false)
    private StringType stringType;
    @Element(name = "EnumerationType", required = false)
    private EnumerationType enumerationType;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getQuantity() {
        return quantity;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public String getDeclaredType() {
        return declaredType;
    }

    public boolean isFixed() {
        return fixed;
    }

    public SimpleType getType() {
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

    public Object getStart() {
        return null;
    }
}
