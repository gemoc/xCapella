package com.thalesgroup.trt.mde.vp.expression.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.expression.expression.NumericComputationExpression;

/**
 * @generated
 */
public class NumericComputationExpressionHelper {

	private static final NumericComputationExpressionHelper instance = new NumericComputationExpressionHelper();

	/**
	 * @generated
	 */
	public static NumericComputationExpressionHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(NumericComputationExpression object,
			EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper
				.getInstance().doSwitch(object, feature);

	}

}