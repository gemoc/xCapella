package com.thalesgroup.trt.mde.vp.modesimulation.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ExpressionRuntimeData;

/**
 * @generated
 */
public class ExpressionRuntimeDataHelper {

	private static final ExpressionRuntimeDataHelper instance = new ExpressionRuntimeDataHelper();

	/**
	 * @generated
	 */
	public static ExpressionRuntimeDataHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(ExpressionRuntimeData object,
			EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper
				.getInstance().doSwitch(object, feature);

	}

}