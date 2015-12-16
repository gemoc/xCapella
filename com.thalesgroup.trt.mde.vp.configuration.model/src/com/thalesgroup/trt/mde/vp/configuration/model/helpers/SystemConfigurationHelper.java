package com.thalesgroup.trt.mde.vp.configuration.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.configuration.configuration.SystemConfiguration;

/**
 * @generated
 */
public class SystemConfigurationHelper {

	private static final SystemConfigurationHelper instance = new SystemConfigurationHelper();

	/**
	 * @generated
	 */
	public static SystemConfigurationHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(SystemConfiguration object,
			EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper
				.getInstance().doSwitch(object, feature);

	}

}