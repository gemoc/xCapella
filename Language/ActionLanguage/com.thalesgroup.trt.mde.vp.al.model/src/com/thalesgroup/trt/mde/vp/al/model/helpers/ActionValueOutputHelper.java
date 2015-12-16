package com.thalesgroup.trt.mde.vp.al.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.al.al.ActionValueOutput;

/**
 * @generated
 */
public class ActionValueOutputHelper {

	private static final ActionValueOutputHelper instance = new ActionValueOutputHelper();

	/**
	 * @generated
	 */
	public static ActionValueOutputHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(ActionValueOutput object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper
				.getInstance().doSwitch(object, feature);

	}

}