package com.thalesgroup.trt.mde.vp.time.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.time.time.Clock;

/**
 * @generated
 */
public class ClockHelper {

	private static final ClockHelper instance = new ClockHelper();

	/**
	 * @generated
	 */
	public static ClockHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(Clock object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper
				.getInstance().doSwitch(object, feature);

	}

}