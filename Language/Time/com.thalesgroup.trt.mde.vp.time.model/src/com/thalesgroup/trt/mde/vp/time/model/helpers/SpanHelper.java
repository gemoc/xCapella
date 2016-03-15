package com.thalesgroup.trt.mde.vp.time.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.time.time.Span;

/**
 * @generated
 */
public class SpanHelper {

	private static final SpanHelper instance = new SpanHelper();

	/**
	 * @generated
	 */
	public static SpanHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(Span object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.common.data.helpers.modellingcore.delegates.ModelElementHelper
				.getInstance().doSwitch(object, feature);

	}

}