package com.thalesgroup.trt.mde.vp.mode.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.mode.mode.HistoryNode;

/**
 * @generated
 */
public class HistoryNodeHelper {

	private static final HistoryNodeHelper instance = new HistoryNodeHelper();

	/**
	 * @generated
	 */
	public static HistoryNodeHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(HistoryNode object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}