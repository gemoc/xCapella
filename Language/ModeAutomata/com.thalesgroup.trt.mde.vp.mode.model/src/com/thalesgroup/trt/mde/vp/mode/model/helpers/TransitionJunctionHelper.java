package com.thalesgroup.trt.mde.vp.mode.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.mode.mode.TransitionJunction;

/**
 * @generated
 */
public class TransitionJunctionHelper {

	private static final TransitionJunctionHelper instance = new TransitionJunctionHelper();

	/**
	 * @generated
	 */
	public static TransitionJunctionHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(TransitionJunction object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}