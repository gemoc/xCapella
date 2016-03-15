package com.thalesgroup.trt.mde.vp.time.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.time.time.TimeEvent;

/**
 * @generated
 */
public class TimeEventHelper {

	private static final TimeEventHelper instance = new TimeEventHelper();

	/**
	 * @generated
	 */
	public static TimeEventHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(TimeEvent object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.common.data.helpers.modellingcore.delegates.AbstractTypeHelper
				.getInstance().doSwitch(object, feature);

	}

}