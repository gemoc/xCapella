/**
 * <copyright>
 *
 * </copyright>
 */

package com.thalesgroup.trt.mde.vp.expression.model.helpers;

import org.eclipse.emf.common.util.BasicEList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.polarsys.capella.common.model.helpers.IHelper;

import com.thalesgroup.trt.mde.vp.expression.expression.AbstractGuard;
import com.thalesgroup.trt.mde.vp.expression.expression.Guard;
import com.thalesgroup.trt.mde.vp.expression.expression.EventGuard;
import com.thalesgroup.trt.mde.vp.expression.expression.TemporalGuard;
import com.thalesgroup.trt.mde.vp.expression.expression.Variable;
import com.thalesgroup.trt.mde.vp.expression.expression.Expression;
import com.thalesgroup.trt.mde.vp.expression.expression.BooleanExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.BooleanUnaryExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.BooleanBinaryExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.NumericExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.NumericUnaryExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.NumericBinaryExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.NumericComparisonExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.NumericComputationExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.EventExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.EventUnaryExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.EventBinaryExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.DurationExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.DurationUnaryExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.DurationBinaryExpression;

/**
 * @generated 
 */
public class ExpressionPackageHelper implements IHelper {

	/**
	 * @generated
	 */
	public Object getValue(EObject object, EStructuralFeature feature,
			EAnnotation annotation) {
		Object ret = null;

		if (ret == null && object instanceof AbstractGuard) {
			ret = AbstractGuardHelper.getInstance().doSwitch(
					(AbstractGuard) object, feature);
		}
		if (ret == null && object instanceof Guard) {
			ret = GuardHelper.getInstance().doSwitch((Guard) object, feature);
		}
		if (ret == null && object instanceof EventGuard) {
			ret = EventGuardHelper.getInstance().doSwitch((EventGuard) object,
					feature);
		}
		if (ret == null && object instanceof TemporalGuard) {
			ret = TemporalGuardHelper.getInstance().doSwitch(
					(TemporalGuard) object, feature);
		}
		if (ret == null && object instanceof Variable) {
			ret = VariableHelper.getInstance().doSwitch((Variable) object,
					feature);
		}
		if (ret == null && object instanceof Expression) {
			ret = ExpressionHelper.getInstance().doSwitch((Expression) object,
					feature);
		}
		if (ret == null && object instanceof BooleanExpression) {
			ret = BooleanExpressionHelper.getInstance().doSwitch(
					(BooleanExpression) object, feature);
		}
		if (ret == null && object instanceof BooleanUnaryExpression) {
			ret = BooleanUnaryExpressionHelper.getInstance().doSwitch(
					(BooleanUnaryExpression) object, feature);
		}
		if (ret == null && object instanceof BooleanBinaryExpression) {
			ret = BooleanBinaryExpressionHelper.getInstance().doSwitch(
					(BooleanBinaryExpression) object, feature);
		}
		if (ret == null && object instanceof NumericExpression) {
			ret = NumericExpressionHelper.getInstance().doSwitch(
					(NumericExpression) object, feature);
		}
		if (ret == null && object instanceof NumericUnaryExpression) {
			ret = NumericUnaryExpressionHelper.getInstance().doSwitch(
					(NumericUnaryExpression) object, feature);
		}
		if (ret == null && object instanceof NumericBinaryExpression) {
			ret = NumericBinaryExpressionHelper.getInstance().doSwitch(
					(NumericBinaryExpression) object, feature);
		}
		if (ret == null && object instanceof NumericComparisonExpression) {
			ret = NumericComparisonExpressionHelper.getInstance().doSwitch(
					(NumericComparisonExpression) object, feature);
		}
		if (ret == null && object instanceof NumericComputationExpression) {
			ret = NumericComputationExpressionHelper.getInstance().doSwitch(
					(NumericComputationExpression) object, feature);
		}
		if (ret == null && object instanceof EventExpression) {
			ret = EventExpressionHelper.getInstance().doSwitch(
					(EventExpression) object, feature);
		}
		if (ret == null && object instanceof EventUnaryExpression) {
			ret = EventUnaryExpressionHelper.getInstance().doSwitch(
					(EventUnaryExpression) object, feature);
		}
		if (ret == null && object instanceof EventBinaryExpression) {
			ret = EventBinaryExpressionHelper.getInstance().doSwitch(
					(EventBinaryExpression) object, feature);
		}
		if (ret == null && object instanceof DurationExpression) {
			ret = DurationExpressionHelper.getInstance().doSwitch(
					(DurationExpression) object, feature);
		}
		if (ret == null && object instanceof DurationUnaryExpression) {
			ret = DurationUnaryExpressionHelper.getInstance().doSwitch(
					(DurationUnaryExpression) object, feature);
		}
		if (ret == null && object instanceof DurationBinaryExpression) {
			ret = DurationBinaryExpressionHelper.getInstance().doSwitch(
					(DurationBinaryExpression) object, feature);
		}
		return ret;
	}

}
