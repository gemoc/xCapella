package com.thalesgroup.trt.mde.vp.expression.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.expression.expression.NumericExpression;

/**
 * @generated
 */
public class NumericExpressionHelper {

	private static final NumericExpressionHelper instance = new NumericExpressionHelper();

	/**
	 * @generated
	 */
	public static NumericExpressionHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(NumericExpression object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper
				.getInstance().doSwitch(object, feature);

	}

}