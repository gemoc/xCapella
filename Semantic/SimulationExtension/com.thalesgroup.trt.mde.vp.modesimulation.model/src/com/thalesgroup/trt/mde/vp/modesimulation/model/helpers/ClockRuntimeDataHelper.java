package com.thalesgroup.trt.mde.vp.modesimulation.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ClockRuntimeData;

/**
 * @generated
 */
public class ClockRuntimeDataHelper {

	private static final ClockRuntimeDataHelper instance = new ClockRuntimeDataHelper();

	/**
	 * @generated
	 */
	public static ClockRuntimeDataHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(ClockRuntimeData object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper
				.getInstance().doSwitch(object, feature);

	}

}