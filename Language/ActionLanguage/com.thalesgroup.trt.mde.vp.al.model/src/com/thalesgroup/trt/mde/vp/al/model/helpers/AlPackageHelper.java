/**
 * <copyright>
 *
 * </copyright>
 */

package com.thalesgroup.trt.mde.vp.al.model.helpers;

import org.eclipse.emf.common.util.BasicEList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.polarsys.capella.common.model.helpers.IHelper;

import com.thalesgroup.trt.mde.vp.al.al.ActionInput;
import com.thalesgroup.trt.mde.vp.al.al.ActionValueInput;
import com.thalesgroup.trt.mde.vp.al.al.ActionOutput;
import com.thalesgroup.trt.mde.vp.al.al.ActionValueOutput;
import com.thalesgroup.trt.mde.vp.al.al.Action;
import com.thalesgroup.trt.mde.vp.al.al.CallBehaviorAction;
import com.thalesgroup.trt.mde.vp.al.al.SendEventAction;
import com.thalesgroup.trt.mde.vp.al.al.BroadcastEventAction;
import com.thalesgroup.trt.mde.vp.al.al.SendCommunicationAction;
import com.thalesgroup.trt.mde.vp.al.al.BroadcastCommunicationAction;
import com.thalesgroup.trt.mde.vp.al.al.CreateValueAction;
import com.thalesgroup.trt.mde.vp.al.al.ReadValueAction;
import com.thalesgroup.trt.mde.vp.al.al.UpdateValueAction;
import com.thalesgroup.trt.mde.vp.al.al.DeleteValueAction;

/**
 * @generated 
 */
public class AlPackageHelper implements IHelper {

	/**
	 * @generated
	 */
	public Object getValue(EObject object, EStructuralFeature feature,
			EAnnotation annotation) {
		Object ret = null;

		if (ret == null && object instanceof ActionInput) {
			ret = ActionInputHelper.getInstance().doSwitch(
					(ActionInput) object, feature);
		}
		if (ret == null && object instanceof ActionValueInput) {
			ret = ActionValueInputHelper.getInstance().doSwitch(
					(ActionValueInput) object, feature);
		}
		if (ret == null && object instanceof ActionOutput) {
			ret = ActionOutputHelper.getInstance().doSwitch(
					(ActionOutput) object, feature);
		}
		if (ret == null && object instanceof ActionValueOutput) {
			ret = ActionValueOutputHelper.getInstance().doSwitch(
					(ActionValueOutput) object, feature);
		}
		if (ret == null && object instanceof Action) {
			ret = ActionHelper.getInstance().doSwitch((Action) object, feature);
		}
		if (ret == null && object instanceof CallBehaviorAction) {
			ret = CallBehaviorActionHelper.getInstance().doSwitch(
					(CallBehaviorAction) object, feature);
		}
		if (ret == null && object instanceof SendEventAction) {
			ret = SendEventActionHelper.getInstance().doSwitch(
					(SendEventAction) object, feature);
		}
		if (ret == null && object instanceof BroadcastEventAction) {
			ret = BroadcastEventActionHelper.getInstance().doSwitch(
					(BroadcastEventAction) object, feature);
		}
		if (ret == null && object instanceof SendCommunicationAction) {
			ret = SendCommunicationActionHelper.getInstance().doSwitch(
					(SendCommunicationAction) object, feature);
		}
		if (ret == null && object instanceof BroadcastCommunicationAction) {
			ret = BroadcastCommunicationActionHelper.getInstance().doSwitch(
					(BroadcastCommunicationAction) object, feature);
		}
		if (ret == null && object instanceof CreateValueAction) {
			ret = CreateValueActionHelper.getInstance().doSwitch(
					(CreateValueAction) object, feature);
		}
		if (ret == null && object instanceof ReadValueAction) {
			ret = ReadValueActionHelper.getInstance().doSwitch(
					(ReadValueAction) object, feature);
		}
		if (ret == null && object instanceof UpdateValueAction) {
			ret = UpdateValueActionHelper.getInstance().doSwitch(
					(UpdateValueAction) object, feature);
		}
		if (ret == null && object instanceof DeleteValueAction) {
			ret = DeleteValueActionHelper.getInstance().doSwitch(
					(DeleteValueAction) object, feature);
		}
		return ret;
	}

}
