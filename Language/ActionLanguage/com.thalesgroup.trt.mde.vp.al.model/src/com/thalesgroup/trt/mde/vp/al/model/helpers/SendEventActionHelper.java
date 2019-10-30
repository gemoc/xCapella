package com.thalesgroup.trt.mde.vp.al.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.al.al.SendEventAction;

/**
 * @generated
 */
public class SendEventActionHelper {

	private static final SendEventActionHelper instance = new SendEventActionHelper();

	/**
	 * @generated
	 */
	public static SendEventActionHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(SendEventAction object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}