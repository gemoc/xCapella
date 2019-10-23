// Generated on 14.12.2015 at 03:01:59 GMT+01:00 by Viewpoint DSL Generator V 0.1

package com.thalesgroup.trt.mde.vp.configuration.ui.queries;

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
import com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage;

import com.thalesgroup.trt.mde.vp.configuration.configuration.ParameterValue;

import com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage;

/**
 * <!-- begin-user-doc -->
 * The '<em><b>[ValueAssociationQuery]</b></em>' BusinessQuery defined for 
 * '<em><b>[ConfigurationPackage.eINSTANCE.getParameterValue_Value()]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ValueAssociationQuery implements IBusinessQuery {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param element_p
	 * @generated
	 */
	public List<EObject> getAvailableElements(EObject element_p) {
		List<EObject> availableElements = new ArrayList<EObject>();

		Project project = CapellaProjectHelper.getProject(element_p);
		SystemEngineering systemEngineering = project != null ? SystemEngineeringExt.getSystemEngineering(project)
				: null;

		if (null != systemEngineering) {
			Set<EObject> all = EObjectExt.getAll(systemEngineering, ExpressionPackage.Literals.EXPRESSION);
			availableElements.addAll(all);
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
	public List<EObject> getCurrentElements(EObject element_p, boolean onlyGenerated_p) {
		ArrayList<EObject> result = new ArrayList<EObject>();
		result.add(((ParameterValue) element_p).getValue());
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClass() {
		return ConfigurationPackage.Literals.PARAMETER_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<EReference> getEStructuralFeatures() {
		List<EReference> eReferences = new ArrayList<EReference>();
		eReferences.add(ConfigurationPackage.eINSTANCE.getParameterValue_Value());
		return eReferences;
	}

}// create the extension