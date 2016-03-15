// Generated on 14.12.2015 at 03:01:58 GMT+01:00 by Viewpoint DSL Generator V 0.1

package com.thalesgroup.trt.mde.vp.configuration.ui.controllers;

import org.polarsys.capella.core.ui.properties.controllers.AbstractMultipleSemanticFieldController;
import org.polarsys.capella.core.business.queries.IBusinessQuery;
import org.polarsys.capella.core.business.queries.capellacore.BusinessQueriesProvider;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage;

import com.thalesgroup.trt.mde.vp.configuration.configuration.Configurations;

/**
 * <!-- begin-user-doc -->
 * The '<em><b>[SystemConfigurationsAssociationFieldController]</b></em>' customized MultipleSemanticFieldController.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class SystemConfigurationsAssociationFieldController extends
		AbstractMultipleSemanticFieldController {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.ui.properties.controllers.AbstractMultipleSemanticFieldController#getReadOpenValuesQuery(org.polarsys.capella.core.data.capellacore.CapellaElement)
	 * @param semanticElement_p
	 * @generated
	 */
	@Override
	protected IBusinessQuery getReadOpenValuesQuery(
			CapellaElement semanticElement_p) {
		return BusinessQueriesProvider.getInstance().getContribution(
				semanticElement_p.eClass(),
				ConfigurationPackage.eINSTANCE
						.getConfigurations_SystemConfigurations());
	}
}