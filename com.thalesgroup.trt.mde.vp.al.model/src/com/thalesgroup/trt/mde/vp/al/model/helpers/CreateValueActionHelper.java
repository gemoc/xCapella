package com.thalesgroup.trt.mde.vp.al.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.al.al.CreateValueAction;

/**
 * @generated
 */
public class CreateValueActionHelper {

	private static final CreateValueActionHelper instance = new CreateValueActionHelper();

	/**
	 * @generated
	 */
	public static CreateValueActionHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(CreateValueAction object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper
				.getInstance().doSwitch(object, feature);

	}

}