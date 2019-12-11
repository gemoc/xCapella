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
public class ModelExchange {

    @Attribute(required = true)
    private String modelIdentifier;
    @Attribute(required = false)
    private boolean needsExecutionTool;
    @Attribute(required = false)
    private boolean completedIntegratorStepNotNeeded;
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
    @ElementList(required = false, name = "SourceFiles")
    private List<SourceFile> sourceFiles;

    public String getModelIdentifier() {
        return modelIdentifier;
    }

    public void setModelIdentifier(String modelIdentifier) {
        this.modelIdentifier = modelIdentifier;
    }

    public boolean isNeedsExecutionTool() {
        return needsExecutionTool;
    }

    public void setNeedsExecutionTool(boolean needsExecutionTool) {
        this.needsExecutionTool = needsExecutionTool;
    }

    public boolean isCompletedIntegratorStepNotNeeded() {
        return completedIntegratorStepNotNeeded;
    }

    public void setCompletedIntegratorStepNotNeeded(boolean completedIntegratorStepNotNeeded) {
        this.completedIntegratorStepNotNeeded = completedIntegratorStepNotNeeded;
    }

    public boolean isCanBeInstantiatedOnlyOncePerProcess() {
        return canBeInstantiatedOnlyOncePerProcess;
    }

    public void setCanBeInstantiatedOnlyOncePerProcess(boolean canBeInstantiatedOnlyOncePerProcess) {
        this.canBeInstantiatedOnlyOncePerProcess = canBeInstantiatedOnlyOncePerProcess;
    }

    public boolean isCanNotUseMemoryManagementFunctions() {
        return canNotUseMemoryManagementFunctions;
    }

    public void setCanNotUseMemoryManagementFunctions(boolean canNotUseMemoryManagementFunctions) {
        this.canNotUseMemoryManagementFunctions = canNotUseMemoryManagementFunctions;
    }

    public boolean isCanGetAndSetFMUstate() {
        return canGetAndSetFMUstate;
    }

    public void setCanGetAndSetFMUstate(boolean canGetAndSetFMUstate) {
        this.canGetAndSetFMUstate = canGetAndSetFMUstate;
    }

    public boolean isCanSerializeFMUstate() {
        return canSerializeFMUstate;
    }

    public void setCanSerializeFMUstate(boolean canSerializeFMUstate) {
        this.canSerializeFMUstate = canSerializeFMUstate;
    }

    public boolean isProvidesDirectionalDerivative() {
        return providesDirectionalDerivative;
    }

    public void setProvidesDirectionalDerivative(boolean providesDirectionalDerivative) {
        this.providesDirectionalDerivative = providesDirectionalDerivative;
    }

    public List<SourceFile> getSourceFiles() {
        return sourceFiles;
    }

    public void setSourceFiles(List<SourceFile> sourceFiles) {
        this.sourceFiles = sourceFiles;
    }
}
