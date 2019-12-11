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
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(strict = false)
public class CoSimulation {

    @Attribute(required = true)
    private String modelIdentifier;
    @Attribute(required = false)
    private boolean needsExecutionTool;
    @Attribute(required = false)
    private boolean canHandleVariableCommunicationStepSize;
    @Attribute(required = false)
    private boolean canInterpolateInputs;
    @Attribute(required = false)
    private int maxOutputDerivativeOrder;
    @Attribute(required = false)
    private boolean canRunAsynchronuously;
    @Attribute(required = false)
    private boolean canBeInstantiatedOnlyOncePerProcess;
    @Attribute(required = false)
    private boolean canNotUseMemoryManagementFunctions;
    @Attribute(required = false)
    private boolean canGetAndSetFMUstate;
    @Attribute(required = false)
    private boolean canSerializeFMUstate;
    @Attribute(required = false)
    private boolean providesDirectionalDerivative;
    @ElementList(required = false)
    private List<SourceFile> sourceFiles;
    private Capabilities capabilities;

    public String getModelIdentifier() {
        return modelIdentifier;
    }

    public Capabilities capabilities() {
        if(capabilities != null) return capabilities;
        capabilities = new Capabilities();
        if(needsExecutionTool) capabilities.add(Capabilities.NEEDS_EXECUTION_TOOL);
        if(canHandleVariableCommunicationStepSize)
            capabilities.add(Capabilities.CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE);
        if(canInterpolateInputs) capabilities.add(Capabilities.CAN_INTERPOLATE_INPUTS);
        if(canRunAsynchronuously) capabilities.add(Capabilities.CAN_RUN_ASYNCHRONOUSLY);
        if(canBeInstantiatedOnlyOncePerProcess)
            capabilities.add(Capabilities.CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS);
        if(canNotUseMemoryManagementFunctions) capabilities.add(Capabilities.CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS);
        if(canGetAndSetFMUstate) capabilities.add(Capabilities.CAN_GET_AND_SET_FMU_STATE);
        if(canSerializeFMUstate) capabilities.add(Capabilities.CAN_SERIALIZE_FMU_STATE);
        if(providesDirectionalDerivative) capabilities.add(Capabilities.PROVIDES_DIRECTIONAL_DERIVATIVE);
        return capabilities;
    }

    public int getMaxOutputDerivativeOrder() {
        return maxOutputDerivativeOrder;
    }

    public List<SourceFile> getSourceFiles() {
        return sourceFiles;
    }
}
