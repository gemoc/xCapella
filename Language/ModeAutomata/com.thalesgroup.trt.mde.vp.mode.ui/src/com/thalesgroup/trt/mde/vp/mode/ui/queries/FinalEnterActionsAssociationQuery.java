
// Generated on 23.10.2019 at 02:27:34 CEST by Viewpoint DSL Generator V 0.1

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

import com.thalesgroup.trt.mde.vp.mode.mode.Final;

import com.thalesgroup.trt.mde.vp.al.al.AlPackage;

/**
* <!-- begin-user-doc -->
* The '<em><b>[FinalEnterActionsAssociationQuery]</b></em>' BusinessQuery defined for 
* '<em><b>[ModePackage.eINSTANCE.getFinal_EnterActions()]</b></em>'.
* <!-- end-user-doc -->
* <p>
* </p>
*
* @generated
*/
public class FinalEnterActionsAssociationQuery implements IBusinessQuery {

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
			Set<EObject> all = EObjectExt.getAll(systemEngineering, AlPackage.Literals.ACTION);
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
		if (elementP instanceof Final)
			currentsElements.addAll(((Final) elementP).getEnterActions());
		return currentsElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClass() {
		return ModePackage.Literals.FINAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<EReference> getEStructuralFeatures() {
		List<EReference> eReferences = new ArrayList<EReference>();
		eReferences.add(ModePackage.eINSTANCE.getFinal_EnterActions());
		return eReferences;
	}
}
// create the extension