package com.thalesgroup.trt.mde.vp.configuration.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPort;

/**
 * @generated
 */
public class ConfigurationPortHelper {

	private static final ConfigurationPortHelper instance = new ConfigurationPortHelper();

	/**
	 * @generated
	 */
	public static ConfigurationPortHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(ConfigurationPort object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.fa.delegates.ComponentPortHelper.getInstance().doSwitch(object,
				feature);

	}

}