/**
 * <copyright>
 *
 * </copyright>
 */

package com.thalesgroup.trt.mde.vp.time.model.helpers;

import org.eclipse.emf.common.util.BasicEList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.polarsys.capella.common.model.helpers.IHelper;

import com.thalesgroup.trt.mde.vp.time.time.Clock;
import com.thalesgroup.trt.mde.vp.time.time.TimeValue;
import com.thalesgroup.trt.mde.vp.time.time.Duration;
import com.thalesgroup.trt.mde.vp.time.time.DurationInterval;
import com.thalesgroup.trt.mde.vp.time.time.Span;
import com.thalesgroup.trt.mde.vp.time.time.Instant;
import com.thalesgroup.trt.mde.vp.time.time.InstantInterval;
import com.thalesgroup.trt.mde.vp.time.time.Translation;
import com.thalesgroup.trt.mde.vp.time.time.TimeEvent;

/**
 * @generated 
 */
public class TimePackageHelper implements IHelper {

	/**
	 * @generated
	 */
	public Object getValue(EObject object, EStructuralFeature feature,
			EAnnotation annotation) {
		Object ret = null;

		if (ret == null && object instanceof Clock) {
			ret = ClockHelper.getInstance().doSwitch((Clock) object, feature);
		}
		if (ret == null && object instanceof TimeValue) {
			ret = TimeValueHelper.getInstance().doSwitch((TimeValue) object,
					feature);
		}
		if (ret == null && object instanceof Duration) {
			ret = DurationHelper.getInstance().doSwitch((Duration) object,
					feature);
		}
		if (ret == null && object instanceof DurationInterval) {
			ret = DurationIntervalHelper.getInstance().doSwitch(
					(DurationInterval) object, feature);
		}
		if (ret == null && object instanceof Span) {
			ret = SpanHelper.getInstance().doSwitch((Span) object, feature);
		}
		if (ret == null && object instanceof Instant) {
			ret = InstantHelper.getInstance().doSwitch((Instant) object,
					feature);
		}
		if (ret == null && object instanceof InstantInterval) {
			ret = InstantIntervalHelper.getInstance().doSwitch(
					(InstantInterval) object, feature);
		}
		if (ret == null && object instanceof Translation) {
			ret = TranslationHelper.getInstance().doSwitch(
					(Translation) object, feature);
		}
		if (ret == null && object instanceof TimeEvent) {
			ret = TimeEventHelper.getInstance().doSwitch((TimeEvent) object,
					feature);
		}
		return ret;
	}

}
