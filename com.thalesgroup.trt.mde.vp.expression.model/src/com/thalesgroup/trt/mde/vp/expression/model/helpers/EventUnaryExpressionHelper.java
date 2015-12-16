package com.thalesgroup.trt.mde.vp.expression.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.expression.expression.EventUnaryExpression;

/**
 * @generated
 */
public class EventUnaryExpressionHelper {

	private static final EventUnaryExpressionHelper instance = new EventUnaryExpressionHelper();

	/**
	 * @generated
	 */
	public static EventUnaryExpressionHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(EventUnaryExpression object,
			EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper
				.getInstance().doSwitch(object, feature);

	}

}