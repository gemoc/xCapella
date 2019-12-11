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
 package org.javafmi.proxy.v1.nativeaccess;

import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.Pointer;

public interface NativeInterface extends Library {

    public static interface FMIStatus {

        public static final int fmiOK = 0;
        public static final int fmiWarning = 1;
        public static final int fmiDiscard = 2;
        public static final int fmiError = 3;
        public static final int fmiFatal = 4;
        public static final int fmiPending = 5;
    }

    public static interface FMIStatusKind {

        public static final int fmiDoStepStatus = 0;
        public static final int fmiPendingStatus = 1;
        public static final int fmiLastSuccessfulTime = 2;
    }

    public interface CallbackLogger extends Callback {

        void record(Pointer fmiComponent, String instanceName, int status, String category, String message, Pointer parameters);
    }

    public interface CallbackAllocateMemory extends Callback {

        Pointer allocate(Size_T numberOfObjects, Size_T size);
    }

    public interface CallbackFreeMemory extends Callback {

        void free(Pointer object);
    }

    public interface CallbackStepFinished extends Callback {

        void apply(Pointer fmiComponent, int status);
    }
}
