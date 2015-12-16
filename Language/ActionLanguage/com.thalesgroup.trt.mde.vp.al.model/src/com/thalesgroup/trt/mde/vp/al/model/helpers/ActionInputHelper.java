package com.thalesgroup.trt.mde.vp.al.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.al.al.ActionInput;

/**
 * @generated
 */
public class ActionInputHelper {

	private static final ActionInputHelper instance = new ActionInputHelper();

	/**
	 * @generated
	 */
	public static ActionInputHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(ActionInput object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper
				.getInstance().doSwitch(object, feature);

	}

}