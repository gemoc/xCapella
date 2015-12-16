package com.thalesgroup.trt.mde.vp.modesimulation.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionalChainRuntimeData;

/**
 * @generated
 */
public class FunctionalChainRuntimeDataHelper {

	private static final FunctionalChainRuntimeDataHelper instance = new FunctionalChainRuntimeDataHelper();

	/**
	 * @generated
	 */
	public static FunctionalChainRuntimeDataHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(FunctionalChainRuntimeData object,
			EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper
				.getInstance().doSwitch(object, feature);

	}

}