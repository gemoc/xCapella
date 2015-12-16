package com.thalesgroup.trt.mde.vp.expression.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.expression.expression.AbstractGuard;

/**
 * @generated
 */
public class AbstractGuardHelper {

	private static final AbstractGuardHelper instance = new AbstractGuardHelper();

	/**
	 * @generated
	 */
	public static AbstractGuardHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(AbstractGuard object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper
				.getInstance().doSwitch(object, feature);

	}

}