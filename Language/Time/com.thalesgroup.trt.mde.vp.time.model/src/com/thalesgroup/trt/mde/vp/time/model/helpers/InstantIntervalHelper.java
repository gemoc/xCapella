package com.thalesgroup.trt.mde.vp.time.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.time.time.InstantInterval;

/**
 * @generated
 */
public class InstantIntervalHelper {

	private static final InstantIntervalHelper instance = new InstantIntervalHelper();

	/**
	 * @generated
	 */
	public static InstantIntervalHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(InstantInterval object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.common.data.helpers.modellingcore.delegates.ModelElementHelper
				.getInstance().doSwitch(object, feature);

	}

}