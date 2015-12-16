package com.thalesgroup.trt.mde.vp.expression.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.expression.expression.DurationBinaryExpression;

/**
 * @generated
 */
public class DurationBinaryExpressionHelper {

	private static final DurationBinaryExpressionHelper instance = new DurationBinaryExpressionHelper();

	/**
	 * @generated
	 */
	public static DurationBinaryExpressionHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(DurationBinaryExpression object,
			EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper
				.getInstance().doSwitch(object, feature);

	}

}