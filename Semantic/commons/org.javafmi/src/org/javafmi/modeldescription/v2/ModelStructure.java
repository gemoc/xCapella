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

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root
public class ModelStructure {

    @ElementList(name = "Outputs", required = false)
    List<Unknown> outputs;
    @ElementList(name = "Derivatives", required = false)
    List<Unknown> derivatives;
    @ElementList(name = "InitialUnknowns", required = false)
    private List<Unknown> unknowns;

    public List<Unknown> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<Unknown> outputs) {
        this.outputs = outputs;
    }

    public List<Unknown> getDerivatives() {
        return derivatives;
    }

    public void setDerivatives(List<Unknown> derivatives) {
        this.derivatives = derivatives;
    }

    public List<Unknown> getUnknowns() {
        return unknowns;
    }

    public void setUnknowns(List<Unknown> unknowns) {
        this.unknowns = unknowns;
    }
}
