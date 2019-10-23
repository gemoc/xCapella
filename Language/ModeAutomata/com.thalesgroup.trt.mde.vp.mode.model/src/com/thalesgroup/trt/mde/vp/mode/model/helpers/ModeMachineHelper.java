package com.thalesgroup.trt.mde.vp.mode.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.mode.mode.ModeMachine;

/**
 * @generated
 */
public class ModeMachineHelper {

	private static final ModeMachineHelper instance = new ModeMachineHelper();

	/**
	 * @generated
	 */
	public static ModeMachineHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(ModeMachine object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}