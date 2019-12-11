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

import java.util.ArrayList;
import java.util.List;

public class Capabilities {
    public static final Capability NEEDS_EXECUTION_TOOL = new Capability("needsExecutionTool");
    public static final Capability CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE = new Capability("canHandleVariableCommunicationStepSize");
    public static final Capability CAN_INTERPOLATE_INPUTS = new Capability("canInterpolateInputs");
    public static final Capability CAN_RUN_ASYNCHRONOUSLY = new Capability("canRunAsynchronously");
    public static final Capability CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS = new Capability("canBeInstantiatedOnlyOncePerProcess");
    public static final Capability CAN_NOT_USE_MEMORY_MANAGEMENT_FUNCTIONS = new Capability("canNotUseMemoryManagementFunctions");
    public static final Capability CAN_GET_AND_SET_FMU_STATE = new Capability("canGetAndSetFmuState");
    public static final Capability CAN_SERIALIZE_FMU_STATE = new Capability("canSerializeFmuState");
    public static final Capability PROVIDES_DIRECTIONAL_DERIVATIVE = new Capability("providesDirectionalDerivatives");
    private List<Capability> capabilities;

    public Capabilities() {
        this.capabilities = new ArrayList<>();
    }

    public boolean check(Capability capability) {
        return capabilities.contains(capability);
    }

    public void add(Capability capability) {
        capabilities.add(capability);
    }

    public static class Capability {
        private String name;

        public Capability(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
