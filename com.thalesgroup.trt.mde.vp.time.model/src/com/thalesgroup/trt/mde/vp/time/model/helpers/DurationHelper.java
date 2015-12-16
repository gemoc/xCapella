package com.thalesgroup.trt.mde.vp.time.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.time.time.Duration;

/**
 * @generated
 */
public class DurationHelper {

	private static final DurationHelper instance = new DurationHelper();

	/**
	 * @generated
	 */
	public static DurationHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(Duration object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.common.data.helpers.modellingcore.delegates.ModelElementHelper
				.getInstance().doSwitch(object, feature);

	}

}