/**
 * <copyright>
 *
 * </copyright>
 */

package com.thalesgroup.trt.mde.vp.modesimulation.model.helpers;

import org.eclipse.emf.common.util.BasicEList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.polarsys.capella.common.model.helpers.IHelper;

import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.TransitionRuntimeData;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ModeRuntimeData;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.GuardRuntimeData;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.MachineRuntimeData;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ComponentRuntimeData;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionRuntimeData;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionalChainRuntimeData;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ExpressionRuntimeData;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ClockRuntimeData;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.EventRuntimeData;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ActionRuntimeData;

/**
 * @generated 
 */
public class ModeSimulationPackageHelper implements IHelper {

	/**
	 * @generated
	 */
	public Object getValue(EObject object, EStructuralFeature feature,
			EAnnotation annotation) {
		Object ret = null;

		if (ret == null && object instanceof TransitionRuntimeData) {
			ret = TransitionRuntimeDataHelper.getInstance().doSwitch(
					(TransitionRuntimeData) object, feature);
		}
		if (ret == null && object instanceof ModeRuntimeData) {
			ret = ModeRuntimeDataHelper.getInstance().doSwitch(
					(ModeRuntimeData) object, feature);
		}
		if (ret == null && object instanceof GuardRuntimeData) {
			ret = GuardRuntimeDataHelper.getInstance().doSwitch(
					(GuardRuntimeData) object, feature);
		}
		if (ret == null && object instanceof MachineRuntimeData) {
			ret = MachineRuntimeDataHelper.getInstance().doSwitch(
					(MachineRuntimeData) object, feature);
		}
		if (ret == null && object instanceof ComponentRuntimeData) {
			ret = ComponentRuntimeDataHelper.getInstance().doSwitch(
					(ComponentRuntimeData) object, feature);
		}
		if (ret == null && object instanceof FunctionRuntimeData) {
			ret = FunctionRuntimeDataHelper.getInstance().doSwitch(
					(FunctionRuntimeData) object, feature);
		}
		if (ret == null && object instanceof FunctionalChainRuntimeData) {
			ret = FunctionalChainRuntimeDataHelper.getInstance().doSwitch(
					(FunctionalChainRuntimeData) object, feature);
		}
		if (ret == null && object instanceof ExpressionRuntimeData) {
			ret = ExpressionRuntimeDataHelper.getInstance().doSwitch(
					(ExpressionRuntimeData) object, feature);
		}
		if (ret == null && object instanceof ClockRuntimeData) {
			ret = ClockRuntimeDataHelper.getInstance().doSwitch(
					(ClockRuntimeData) object, feature);
		}
		if (ret == null && object instanceof EventRuntimeData) {
			ret = EventRuntimeDataHelper.getInstance().doSwitch(
					(EventRuntimeData) object, feature);
		}
		if (ret == null && object instanceof ActionRuntimeData) {
			ret = ActionRuntimeDataHelper.getInstance().doSwitch(
					(ActionRuntimeData) object, feature);
		}
		return ret;
	}

}
