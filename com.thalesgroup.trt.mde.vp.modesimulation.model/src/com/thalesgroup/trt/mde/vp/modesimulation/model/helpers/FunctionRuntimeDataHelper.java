package com.thalesgroup.trt.mde.vp.modesimulation.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionRuntimeData;

/**
 * @generated
 */
public class FunctionRuntimeDataHelper {

	private static final FunctionRuntimeDataHelper instance = new FunctionRuntimeDataHelper();

	/**
	 * @generated
	 */
	public static FunctionRuntimeDataHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(FunctionRuntimeData object,
			EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper
				.getInstance().doSwitch(object, feature);

	}

}