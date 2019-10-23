package com.thalesgroup.trt.mde.vp.configuration.configuration.provider.sections;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.core.properties.sections.NamedElementSection;
import org.polarsys.capella.core.model.handler.helpers.CapellaAdapterHelper;
import com.thalesgroup.trt.mde.vp.configuration.configuration.Configurations;

/**
 * This is the item provider adapter for a {@link ConfigurationsSection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationsSection extends NamedElementSection {
	/**
	 * @generated
	 */
	@Override
	public boolean select(Object toTest) {
		EObject obj = CapellaAdapterHelper.resolveSemanticObject(toTest);

		return obj != null && obj.eClass()
				.equals(com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage.eINSTANCE
						.getConfigurations());
	}
}
