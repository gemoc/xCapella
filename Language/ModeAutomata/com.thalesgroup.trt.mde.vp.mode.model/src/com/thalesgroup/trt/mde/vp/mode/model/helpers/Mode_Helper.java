package com.thalesgroup.trt.mde.vp.mode.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.mode.mode.Mode_;

/**
 * @generated
 */
public class Mode_Helper {

	private static final Mode_Helper instance = new Mode_Helper();

	/**
	 * @generated
	 */
	public static Mode_Helper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(Mode_ object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper
				.getInstance().doSwitch(object, feature);

	}

}