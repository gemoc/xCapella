package com.thalesgroup.trt.mde.vp.expression.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.expression.expression.EventGuard;

/**
 * @generated
 */
public class EventGuardHelper {

	private static final EventGuardHelper instance = new EventGuardHelper();

	/**
	 * @generated
	 */
	public static EventGuardHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(EventGuard object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper
				.getInstance().doSwitch(object, feature);

	}

}