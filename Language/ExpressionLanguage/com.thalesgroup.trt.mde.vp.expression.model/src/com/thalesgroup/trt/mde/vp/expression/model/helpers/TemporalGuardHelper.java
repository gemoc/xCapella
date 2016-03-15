package com.thalesgroup.trt.mde.vp.expression.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.expression.expression.TemporalGuard;

/**
 * @generated
 */
public class TemporalGuardHelper {

	private static final TemporalGuardHelper instance = new TemporalGuardHelper();

	/**
	 * @generated
	 */
	public static TemporalGuardHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(TemporalGuard object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper
				.getInstance().doSwitch(object, feature);

	}

}