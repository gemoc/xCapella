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

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(strict = false)
public class RealType extends SimpleType {

    public static final String REAL_TYPE = "Real";
    @Attribute(required = false)
    private String declaredType;
    @Attribute(required = false)
    private String quantity;
    @Attribute(required = false)
    private String unit;
    @Attribute(required = false)
    private String displayUnit;
    @Attribute(required = false)
    private boolean relativeQuantity;
    @Attribute(required = false)
    private double min;
    @Attribute(required = false)
    private double max;
    @Attribute(required = false)
    private double nominal;
    @Attribute(required = false)
    private boolean unbounded;
    @Attribute(required = false)
    private Double start;
    @Attribute(required = false)
    private int derivative;
    @Attribute(required = false)
    private boolean reinit;

    public RealType() {
        this.declaredType = REAL_TYPE;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof RealType)) return false;
        RealType realType = (RealType) o;
        return declaredType.equals(realType.declaredType);
    }

    @Override
    public int hashCode() {
        return declaredType.hashCode();
    }

    public String getDeclaredType() {
        return declaredType;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

    public String getDisplayUnit() {
        return displayUnit;
    }

    public boolean isRelativeQuantity() {
        return relativeQuantity;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public double getNominal() {
        return nominal;
    }

    public boolean isUnbounded() {
        return unbounded;
    }

    public Double getStart() {
        return start;
    }

    public int getDerivative() {
        return derivative;
    }

    public boolean isReinit() {
        return reinit;
    }
}
