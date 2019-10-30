package com.thalesgroup.trt.mde.vp.al.al;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.al.al.ActionInput#getInputCheckingAction <em>Input Checking Action</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.trt.mde.vp.al.al.AlPackage#getActionInput()
 * @model
 * @generated
 */

public interface ActionInput extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Input Checking Action</b></em>' reference list.
	 * The list contents are of type {@link com.thalesgroup.trt.mde.vp.al.al.Action}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Checking Action</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Checking Action</em>' reference list.
	 * @see com.thalesgroup.trt.mde.vp.al.al.AlPackage#getActionInput_InputCheckingAction()
	 * @model type="com.thalesgroup.trt.mde.vp.al.al.Action"
	 * @generated
	 */

	EList getInputCheckingAction();

} // ActionInput
