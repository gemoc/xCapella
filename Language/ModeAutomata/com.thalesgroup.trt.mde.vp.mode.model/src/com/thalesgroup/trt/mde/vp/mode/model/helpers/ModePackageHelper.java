/**
 * <copyright>
 *
 * </copyright>
 */

package com.thalesgroup.trt.mde.vp.mode.model.helpers;

import org.eclipse.emf.common.util.BasicEList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.polarsys.capella.common.model.helpers.IHelper;

import com.thalesgroup.trt.mde.vp.mode.mode.ModeMachine;
import com.thalesgroup.trt.mde.vp.mode.mode.AbstractMode;
import com.thalesgroup.trt.mde.vp.mode.mode.Mode_;
import com.thalesgroup.trt.mde.vp.mode.mode.ControlNode;
import com.thalesgroup.trt.mde.vp.mode.mode.Initial;
import com.thalesgroup.trt.mde.vp.mode.mode.Final;
import com.thalesgroup.trt.mde.vp.mode.mode.TransitionJunction;
import com.thalesgroup.trt.mde.vp.mode.mode.HistoryNode;
import com.thalesgroup.trt.mde.vp.mode.mode.Transition;

/**
 * @generated 
 */
public class ModePackageHelper implements IHelper {

	/**
	 * @generated
	 */
	public Object getValue(EObject object, EStructuralFeature feature, EAnnotation annotation) {
		Object ret = null;

		if (ret == null && object instanceof ModeMachine) {
			ret = ModeMachineHelper.getInstance().doSwitch((ModeMachine) object, feature);
		}
		if (ret == null && object instanceof AbstractMode) {
			ret = AbstractModeHelper.getInstance().doSwitch((AbstractMode) object, feature);
		}
		if (ret == null && object instanceof Mode_) {
			ret = Mode_Helper.getInstance().doSwitch((Mode_) object, feature);
		}
		if (ret == null && object instanceof ControlNode) {
			ret = ControlNodeHelper.getInstance().doSwitch((ControlNode) object, feature);
		}
		if (ret == null && object instanceof Initial) {
			ret = InitialHelper.getInstance().doSwitch((Initial) object, feature);
		}
		if (ret == null && object instanceof Final) {
			ret = FinalHelper.getInstance().doSwitch((Final) object, feature);
		}
		if (ret == null && object instanceof TransitionJunction) {
			ret = TransitionJunctionHelper.getInstance().doSwitch((TransitionJunction) object, feature);
		}
		if (ret == null && object instanceof HistoryNode) {
			ret = HistoryNodeHelper.getInstance().doSwitch((HistoryNode) object, feature);
		}
		if (ret == null && object instanceof Transition) {
			ret = TransitionHelper.getInstance().doSwitch((Transition) object, feature);
		}
		return ret;
	}

}
