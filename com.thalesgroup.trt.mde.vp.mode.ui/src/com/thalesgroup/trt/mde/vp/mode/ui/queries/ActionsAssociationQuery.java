// Generated on 14.12.2015 at 07:00:32 GMT+01:00 by Viewpoint DSL Generator V 0.1

package com.thalesgroup.trt.mde.vp.mode.ui.queries;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import org.polarsys.capella.common.helpers.EObjectExt;
import org.polarsys.capella.core.business.queries.IBusinessQuery;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;
import org.polarsys.capella.core.model.helpers.query.CapellaQueries;
import org.polarsys.capella.core.model.utils.ListExt;
import com.thalesgroup.trt.mde.vp.mode.mode.ModePackage;

import com.thalesgroup.trt.mde.vp.mode.mode.Transition;

import com.thalesgroup.trt.mde.vp.al.al.AlPackage;

/**
 * <!-- begin-user-doc -->
 * The '<em><b>[ActionsAssociationQuery]</b></em>' BusinessQuery defined for 
 * '<em><b>[ModePackage.eINSTANCE.getTransition_Actions()]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ActionsAssociationQuery implements IBusinessQuery {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param elementP
	 * @generated
	 */
	public List<CapellaElement> getAvailableElements(CapellaElement elementP) {
		List<CapellaElement> availableElements = new ArrayList<CapellaElement>();
		SystemEngineering systemEngineering = CapellaQueries.getInstance()
				.getRootQueries().getSystemEngineering(elementP);
		if (null != systemEngineering) {
			for (EObject elt : EObjectExt.getAll(systemEngineering,
					AlPackage.Literals.ACTION)) {
				availableElements.add((CapellaElement) elt);
			}
		}
		availableElements = ListExt.removeDuplicates(availableElements);
		availableElements.remove(elementP);
		return availableElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param elementP
	 * @param onlyGeneratedP
	 * @generated
	 */
	public List<CapellaElement> getCurrentElements(CapellaElement elementP,
			boolean onlyGeneratedP) {
		List<CapellaElement> currentsElements = new ArrayList<CapellaElement>();
		if (elementP instanceof Transition)
			currentsElements.addAll(((Transition) elementP).getActions());
		return currentsElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClass() {
		return ModePackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<EReference> getEStructuralFeatures() {
		List<EReference> eReferences = new ArrayList<EReference>();
		eReferences.add(ModePackage.eINSTANCE.getTransition_Actions());
		return eReferences;
	}

}
// create the extension