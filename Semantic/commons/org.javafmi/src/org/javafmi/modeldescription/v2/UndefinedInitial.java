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

public class UndefinedInitial {

    public static final String UNDEFINED = "undefined";

    public String defineFrom(String causality, String variability) {
        if (isInput(causality)) return UNDEFINED;
        if (isIndependent(causality)) return UNDEFINED;
        if (isParameter(causality)) return whenCausalityIsParameter(variability);
        if (isCalculatedParameter(causality)) return whenCausalityIsCalculatedParameter(variability);
        if (isOutput(causality)) return whenCausalityIsOutput(variability);
        if (isLocal(causality)) return whenCausalityIsLocal(variability);
        return UNDEFINED;
    }

    private boolean isInput(String causality) {
        return "input".equals(causality);
    }

    private boolean isIndependent(String causality) {
        return "independent".equals(causality);
    }

    private boolean isParameter(String causality) {
        return "parameter".equals(causality);
    }

    private String whenCausalityIsParameter(String variability) {
        return isFixed(variability) || isTunable(variability) ? "exact" : UNDEFINED;
    }

    private boolean isCalculatedParameter(String causality) {
        return "calculatedParameter".equals(causality);
    }

    private String whenCausalityIsCalculatedParameter(String variability) {
        return isFixed(variability) || isTunable(variability) ? "calculated" : UNDEFINED;
    }

    private boolean isFixed(String variability) {
        return "fixed".equals(variability);
    }

    private boolean isTunable(String variability) {
        return "tunable".equals(variability);
    }

    private boolean isOutput(String causality) {
        return "output".equals(causality);
    }

    private String whenCausalityIsOutput(String variability) {
        if (isConstant(variability)) return "exact";
        if (isDiscrete(variability) || isContinuous(variability)) return "calculated";
        return UNDEFINED;
    }

    private boolean isLocal(String causality) {
        return "local".equals(causality);
    }

    private String whenCausalityIsLocal(String variability) {
        return (isConstant(variability)) ? "exact" : "calculated";
    }

    private boolean isConstant(String variability) {
        return "constant".equals(variability);
    }

    private boolean isDiscrete(String variability) {
        return "discrete".equals(variability);
    }

    private boolean isContinuous(String variability) {
        return "continuous".equals(variability);
    }
}