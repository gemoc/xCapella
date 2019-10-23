
// Generated on 23.10.2019 at 02:27:36 CEST by Viewpoint DSL Generator V 0.1

package com.thalesgroup.trt.mde.vp.mode.contextual.explorer.queries.modemachine;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.amalgam.explorer.contextual.core.query.IQuery;

import com.thalesgroup.trt.mde.vp.mode.mode.ModeMachine;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OwnedExternalElementQuery implements IQuery {

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * Default constructor
	   * @generated
	   */
	public OwnedExternalElementQuery() {
		// TODO Auto-generated constructor stub
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param object_p: The model element for which the Contextual Explorer extension is generated
	* @return List of object to display in the parent category
	* @generated
	*/
	public List<Object> compute(Object object_p) {
		List<Object> result = new ArrayList<Object>();
		ModeMachine object = (ModeMachine) object_p;

		for (EObject eObject : object.getLocalClocks())
			result.add(eObject);

		for (EObject eObject : object.getLocalVariables())
			result.add(eObject);

		return result;
	}

}