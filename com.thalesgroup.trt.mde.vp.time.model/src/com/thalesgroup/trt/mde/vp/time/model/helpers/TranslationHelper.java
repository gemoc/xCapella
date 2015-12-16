package com.thalesgroup.trt.mde.vp.time.model.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import com.thalesgroup.trt.mde.vp.time.time.Translation;

/**
 * @generated
 */
public class TranslationHelper {

	private static final TranslationHelper instance = new TranslationHelper();

	/**
	 * @generated
	 */
	public static TranslationHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(Translation object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.common.data.helpers.modellingcore.delegates.ModelElementHelper
				.getInstance().doSwitch(object, feature);

	}

}