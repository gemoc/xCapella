// Generated on 14.12.2015 at 07:00:32 GMT+01:00 by Viewpoint DSL Generator V 0.1

package com.thalesgroup.trt.mde.vp.mode.ui.queries;

import java.util.ArrayList;
import java.util.List;

import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import org.polarsys.capella.common.helpers.EObjectExt;
import org.polarsys.capella.core.business.queries.IBusinessQuery;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;
import org.polarsys.capella.core.model.helpers.query.CapellaQueries;
import org.polarsys.capella.core.model.utils.ListExt;
import org.polarsys.capella.core.model.handler.helpers.CapellaProjectHelper;
import org.polarsys.capella.core.model.helpers.SystemEngineeringExt;
import org.polarsys.capella.core.data.capellamodeller.Project;
import com.thalesgroup.trt.mde.vp.mode.mode.ModePackage;

import com.thalesgroup.trt.mde.vp.mode.mode.ModeMachine;

import com.thalesgroup.trt.mde.vp.time.time.TimePackage;

/**
 * <!-- begin-user-doc -->
 * The '<em><b>[LocalClocksAssociationQuery]</b></em>' BusinessQuery defined for 
 * '<em><b>[ModePackage.eINSTANCE.getModeMachine_LocalClocks()]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LocalClocksAssociationQuery implements IBusinessQuery {

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param elementP
	* @generated
	*/
	public List<EObject> getAvailableElements(EObject elementP) {
		List<EObject> availableElements = new ArrayList<EObject>();

		Project project = CapellaProjectHelper.getProject(elementP);
		SystemEngineering systemEngineering = project != null ? SystemEngineeringExt.getSystemEngineering(project)
				: null;

		if (null != systemEngineering) {
			Set<EObject> all = EObjectExt.getAll(systemEngineering, TimePackage.Literals.CLOCK);
			availableElements.addAll(all);
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
	public List<EObject> getCurrentElements(EObject elementP, boolean onlyGeneratedP) {
		List<EObject> currentsElements = new ArrayList<EObject>();
		if (elementP instanceof ModeMachine)
			currentsElements.addAll(((ModeMachine) elementP).getLocalClocks());
		return currentsElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClass() {
		return ModePackage.Literals.MODE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<EReference> getEStructuralFeatures() {
		List<EReference> eReferences = new ArrayList<EReference>();
		eReferences.add(ModePackage.eINSTANCE.getModeMachine_LocalClocks());
		return eReferences;
	}

}
// create the extension