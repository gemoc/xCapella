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

import com.thalesgroup.trt.mde.vp.mode.mode.Mode_;

import com.thalesgroup.trt.mde.vp.mode.mode.ModePackage;

/**
 * <!-- begin-user-doc -->
 * The '<em><b>[SubModeMachineAssociationQuery]</b></em>' BusinessQuery defined for 
 * '<em><b>[ModePackage.eINSTANCE.getMode__SubModeMachine()]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SubModeMachineAssociationQuery implements IBusinessQuery {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param element_p
	 * @generated
	 */
	public List<CapellaElement> getAvailableElements(CapellaElement element_p) {
		List<CapellaElement> availableElements = new ArrayList<CapellaElement>();
		SystemEngineering systemEngineering = CapellaQueries.getInstance()
				.getRootQueries().getSystemEngineering(element_p);
		if (null != systemEngineering) {
			for (EObject elt : EObjectExt.getAll(systemEngineering,
					ModePackage.Literals.MODE_MACHINE)) {
				availableElements.add((CapellaElement) elt);
			}
		}
		availableElements = ListExt.removeDuplicates(availableElements);
		availableElements.remove(element_p);
		return availableElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param element_p
	 * @param onlyGenerated_p
	 * @generated
	 */
	public List<CapellaElement> getCurrentElements(CapellaElement element_p,
			boolean onlyGenerated_p) {
		ArrayList<CapellaElement> result = new ArrayList<CapellaElement>();
		result.add(((Mode_) element_p).getSubModeMachine());
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClass() {
		return ModePackage.Literals.MODE_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<EReference> getEStructuralFeatures() {
		List<EReference> eReferences = new ArrayList<EReference>();
		eReferences.add(ModePackage.eINSTANCE.getMode__SubModeMachine());
		return eReferences;
	}

}// create the extension