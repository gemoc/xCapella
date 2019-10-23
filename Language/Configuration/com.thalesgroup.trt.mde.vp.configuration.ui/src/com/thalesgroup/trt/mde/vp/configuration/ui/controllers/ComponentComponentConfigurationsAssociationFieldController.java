
// Generated on 23.10.2019 at 02:32:25 CEST by Viewpoint DSL Generator V 0.1

package com.thalesgroup.trt.mde.vp.configuration.ui.controllers;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.ui.properties.controllers.AbstractMultipleSemanticFieldController;
import org.polarsys.capella.core.business.queries.IBusinessQuery;
import org.polarsys.capella.core.business.queries.capellacore.BusinessQueriesProvider;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage;

import com.thalesgroup.trt.mde.vp.configuration.configuration.ComponentConfiguration;

/**
* <!-- begin-user-doc -->
* The '<em><b>[ComponentComponentConfigurationsAssociationFieldController]</b></em>' customized MultipleSemanticFieldController.
* <!-- end-user-doc -->
* <p>
* </p>
*
* @generated
*/

public class ComponentComponentConfigurationsAssociationFieldController
		extends AbstractMultipleSemanticFieldController {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.capella.core.ui.properties.controllers.AbstractMultipleSemanticFieldController#getReadOpenValuesQuery(org.polarsys.capella.core.data.capellacore.CapellaElement)
	 * @param semanticElement_p
	 * @generated
	 */
	@Override
	protected IBusinessQuery getReadOpenValuesQuery(EObject semanticElement_p) {
		return BusinessQueriesProvider.getInstance().getContribution(semanticElement_p.eClass(),
				ConfigurationPackage.eINSTANCE.getComponentConfiguration_ComponentConfigurations());
	}
}