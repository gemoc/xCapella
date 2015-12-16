// Generated on 14.12.2015 at 07:00:32 GMT+01:00 by Viewpoint DSL Generator V 0.1

package com.thalesgroup.trt.mde.vp.mode.ui.controllers;

import org.polarsys.capella.core.ui.properties.controllers.AbstractMultipleSemanticFieldController;
import org.polarsys.capella.core.business.queries.IBusinessQuery;
import org.polarsys.capella.core.business.queries.capellacore.BusinessQueriesProvider;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import com.thalesgroup.trt.mde.vp.mode.mode.ModePackage;

import com.thalesgroup.trt.mde.vp.mode.mode.AbstractMode;

/**
 * <!-- begin-user-doc -->
 * The '<em><b>[IncomingTransitionsAssociationFieldController]</b></em>' customized MultipleSemanticFieldController.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class IncomingTransitionsAssociationFieldController extends
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
				ModePackage.eINSTANCE.getAbstractMode_IncomingTransitions());
	}
}