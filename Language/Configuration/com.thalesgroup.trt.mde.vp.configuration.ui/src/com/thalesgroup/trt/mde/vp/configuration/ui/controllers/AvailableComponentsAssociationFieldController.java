// Generated on 14.12.2015 at 03:01:58 GMT+01:00 by Viewpoint DSL Generator V 0.1

package com.thalesgroup.trt.mde.vp.configuration.ui.controllers;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.business.queries.IBusinessQuery;
import org.polarsys.capella.core.business.queries.capellacore.BusinessQueriesProvider;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.ui.properties.controllers.AbstractMultipleSemanticFieldController;

import com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * The '<em><b>[AvailableComponentsAssociationFieldController]</b></em>' customized MultipleSemanticFieldController.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class AvailableComponentsAssociationFieldController extends
		AbstractMultipleSemanticFieldController {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.ui.properties.controllers.AbstractMultipleSemanticFieldController#getReadOpenValuesQuery(org.polarsys.capella.core.data.capellacore.CapellaElement)
	 * @param semanticElement_p
	 * @generated
	 */
	@Override
	protected IBusinessQuery getReadOpenValueQuery(
			CapellaElement semanticElement_p) {
		return BusinessQueriesProvider.getInstance().getContribution(
				semanticElement_p.eClass(),
				ConfigurationPackage.eINSTANCE
						.getSystemConfiguration_AvailableComponents());
	}

	@Override
	protected IBusinessQuery getReadOpenValuesQuery(EObject arg0) {
		// TODO Auto-generated method stub
		return null;
	}
}