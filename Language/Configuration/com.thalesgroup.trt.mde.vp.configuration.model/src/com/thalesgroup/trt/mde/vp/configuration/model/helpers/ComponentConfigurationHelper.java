package com.thalesgroup.trt.mde.vp.configuration.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.configuration.configuration.ComponentConfiguration;

/**
 * @generated
 */
public class ComponentConfigurationHelper {

	private static final ComponentConfigurationHelper instance = new ComponentConfigurationHelper();

	/**
	 * @generated
	 */
	public static ComponentConfigurationHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(ComponentConfiguration object,
			EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper
				.getInstance().doSwitch(object, feature);

	}

}