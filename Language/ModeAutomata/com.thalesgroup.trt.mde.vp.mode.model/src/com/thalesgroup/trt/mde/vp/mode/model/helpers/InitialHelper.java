package com.thalesgroup.trt.mde.vp.mode.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.mode.mode.Initial;

/**
 * @generated
 */
public class InitialHelper {

	private static final InitialHelper instance = new InitialHelper();

	/**
	 * @generated
	 */
	public static InitialHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(Initial object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}