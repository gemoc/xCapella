package com.thalesgroup.trt.mde.vp.expression.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.expression.expression.NumericBinaryExpression;

/**
 * @generated
 */
public class NumericBinaryExpressionHelper {

	private static final NumericBinaryExpressionHelper instance = new NumericBinaryExpressionHelper();

	/**
	 * @generated
	 */
	public static NumericBinaryExpressionHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(NumericBinaryExpression object,
			EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper
				.getInstance().doSwitch(object, feature);

	}

}