package com.thalesgroup.trt.mde.vp.expression.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.expression.expression.DurationUnaryExpression;

/**
 * @generated
 */
public class DurationUnaryExpressionHelper {

	private static final DurationUnaryExpressionHelper instance = new DurationUnaryExpressionHelper();

	/**
	 * @generated
	 */
	public static DurationUnaryExpressionHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(DurationUnaryExpression object,
			EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper
				.getInstance().doSwitch(object, feature);

	}

}