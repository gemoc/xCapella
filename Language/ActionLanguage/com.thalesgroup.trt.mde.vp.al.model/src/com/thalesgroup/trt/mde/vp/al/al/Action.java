package com.thalesgroup.trt.mde.vp.al.al;

import org.polarsys.capella.core.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.al.al.Action#getExecutionSuccess <em>Execution Success</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.al.al.AlPackage#getAction()
 * @model abstract="true"
 * @generated
 */

public interface Action extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Execution Success</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Success</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Success</em>' containment reference.
	 * @see #setExecutionSuccess(ActionValueOutput)
	 * @see com.thalesgroup.trt.mde.vp.al.al.AlPackage#getAction_ExecutionSuccess()
	 * @model containment="true" transient="true"
	 * @generated
	 */

	ActionValueOutput getExecutionSuccess();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.al.al.Action#getExecutionSuccess <em>Execution Success</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Success</em>' containment reference.
	 * @see #getExecutionSuccess()
	 * @generated
	 */

	void setExecutionSuccess(ActionValueOutput value);

} // Action
