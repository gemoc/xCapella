package com.thalesgroup.trt.mde.vp.al.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.al.al.BroadcastCommunicationAction;

/**
 * @generated
 */
public class BroadcastCommunicationActionHelper {

	private static final BroadcastCommunicationActionHelper instance = new BroadcastCommunicationActionHelper();

	/**
	 * @generated
	 */
	public static BroadcastCommunicationActionHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(BroadcastCommunicationAction object,
			EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper
				.getInstance().doSwitch(object, feature);

	}

}