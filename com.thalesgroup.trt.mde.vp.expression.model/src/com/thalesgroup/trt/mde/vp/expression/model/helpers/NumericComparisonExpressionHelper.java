package com.thalesgroup.trt.mde.vp.expression.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.expression.expression.NumericComparisonExpression;

/**
 * @generated
 */
public class NumericComparisonExpressionHelper {

	private static final NumericComparisonExpressionHelper instance = new NumericComparisonExpressionHelper();

	/**
	 * @generated
	 */
	public static NumericComparisonExpressionHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(NumericComparisonExpression object,
			EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper
				.getInstance().doSwitch(object, feature);

	}

}