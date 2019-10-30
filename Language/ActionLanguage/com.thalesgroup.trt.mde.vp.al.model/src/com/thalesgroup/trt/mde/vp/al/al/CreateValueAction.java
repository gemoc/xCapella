package com.thalesgroup.trt.mde.vp.al.al;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Value Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.al.al.CreateValueAction#getObject <em>Object</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.al.al.CreateValueAction#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.trt.mde.vp.al.al.AlPackage#getCreateValueAction()
 * @model
 * @generated
 */

public interface CreateValueAction extends Action {

	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.data.capellacore.CapellaElement}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference list.
	 * @see com.thalesgroup.trt.mde.vp.al.al.AlPackage#getCreateValueAction_Object()
	 * @model type="org.polarsys.capella.core.data.capellacore.CapellaElement" required="true"
	 * @generated
	 */

	EList getObject();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link com.thalesgroup.trt.mde.vp.al.al.ActionValueInput}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see com.thalesgroup.trt.mde.vp.al.al.AlPackage#getCreateValueAction_Value()
	 * @model type="com.thalesgroup.trt.mde.vp.al.al.ActionValueInput" containment="true" required="true"
	 * @generated
	 */

	EList getValue();

} // CreateValueAction
