package com.thalesgroup.trt.mde.vp.mode.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.mode.mode.Final;

/**
 * @generated
 */
public class FinalHelper {

	private static final FinalHelper instance = new FinalHelper();

	/**
	 * @generated
	 */
	public static FinalHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(Final object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}