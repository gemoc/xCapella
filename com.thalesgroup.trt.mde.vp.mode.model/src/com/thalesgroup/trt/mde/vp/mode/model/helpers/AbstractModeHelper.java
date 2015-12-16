package com.thalesgroup.trt.mde.vp.mode.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.mode.mode.AbstractMode;

/**
 * @generated
 */
public class AbstractModeHelper {

	private static final AbstractModeHelper instance = new AbstractModeHelper();

	/**
	 * @generated
	 */
	public static AbstractModeHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(AbstractMode object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper
				.getInstance().doSwitch(object, feature);

	}

}