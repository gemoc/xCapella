package com.thalesgroup.trt.mde.vp.modesimulation.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.EventRuntimeData;

/**
 * @generated
 */
public class EventRuntimeDataHelper {

	private static final EventRuntimeDataHelper instance = new EventRuntimeDataHelper();

	/**
	 * @generated
	 */
	public static EventRuntimeDataHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(EventRuntimeData object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper
				.getInstance().doSwitch(object, feature);

	}

}