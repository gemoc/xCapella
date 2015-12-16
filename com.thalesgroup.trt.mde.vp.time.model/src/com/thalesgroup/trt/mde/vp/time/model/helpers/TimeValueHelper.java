package com.thalesgroup.trt.mde.vp.time.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.time.time.TimeValue;

/**
 * @generated
 */
public class TimeValueHelper {

	private static final TimeValueHelper instance = new TimeValueHelper();

	/**
	 * @generated
	 */
	public static TimeValueHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(TimeValue object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.common.data.helpers.modellingcore.delegates.ModelElementHelper
				.getInstance().doSwitch(object, feature);

	}

}