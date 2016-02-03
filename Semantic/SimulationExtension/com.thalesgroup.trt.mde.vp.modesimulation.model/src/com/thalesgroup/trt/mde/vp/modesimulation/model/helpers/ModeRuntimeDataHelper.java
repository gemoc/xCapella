package com.thalesgroup.trt.mde.vp.modesimulation.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ModeRuntimeData;

/**
 * @generated
 */
public class ModeRuntimeDataHelper {

	private static final ModeRuntimeDataHelper instance = new ModeRuntimeDataHelper();

	/**
	 * @generated
	 */
	public static ModeRuntimeDataHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(ModeRuntimeData object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper
				.getInstance().doSwitch(object, feature);

	}

}