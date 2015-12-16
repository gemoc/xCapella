package com.thalesgroup.trt.mde.vp.al.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.al.al.ReadValueAction;

/**
 * @generated
 */
public class ReadValueActionHelper {

	private static final ReadValueActionHelper instance = new ReadValueActionHelper();

	/**
	 * @generated
	 */
	public static ReadValueActionHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(ReadValueAction object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper
				.getInstance().doSwitch(object, feature);

	}

}