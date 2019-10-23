package com.thalesgroup.trt.mde.vp.configuration.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.configuration.configuration.Configurations;

/**
 * @generated
 */
public class ConfigurationsHelper {

	private static final ConfigurationsHelper instance = new ConfigurationsHelper();

	/**
	 * @generated
	 */
	public static ConfigurationsHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(Configurations object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}