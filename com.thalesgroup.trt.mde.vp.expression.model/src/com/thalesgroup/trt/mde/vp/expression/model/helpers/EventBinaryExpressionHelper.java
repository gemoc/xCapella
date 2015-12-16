package com.thalesgroup.trt.mde.vp.expression.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.expression.expression.EventBinaryExpression;

/**
 * @generated
 */
public class EventBinaryExpressionHelper {

	private static final EventBinaryExpressionHelper instance = new EventBinaryExpressionHelper();

	/**
	 * @generated
	 */
	public static EventBinaryExpressionHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(EventBinaryExpression object,
			EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper
				.getInstance().doSwitch(object, feature);

	}

}