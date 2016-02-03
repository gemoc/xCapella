package com.thalesgroup.trt.mde.vp.modesimulation.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.MachineRuntimeData;

/**
 * @generated
 */
public class MachineRuntimeDataHelper {

	private static final MachineRuntimeDataHelper instance = new MachineRuntimeDataHelper();

	/**
	 * @generated
	 */
	public static MachineRuntimeDataHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(MachineRuntimeData object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper
				.getInstance().doSwitch(object, feature);

	}

}