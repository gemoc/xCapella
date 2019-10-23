package com.thalesgroup.trt.mde.vp.configuration.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.configuration.configuration.Deployment;

/**
 * @generated
 */
public class DeploymentHelper {

	private static final DeploymentHelper instance = new DeploymentHelper();

	/**
	 * @generated
	 */
	public static DeploymentHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(Deployment object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}