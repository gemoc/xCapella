package com.thalesgroup.trt.mde.vp.al.al;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Value Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.al.al.UpdateValueAction#getUpdateableValue <em>Updateable Value</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.al.al.UpdateValueAction#getNewValue <em>New Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.al.al.AlPackage#getUpdateValueAction()
 * @model
 * @generated
 */

public interface UpdateValueAction extends Action {

	/**
	 * Returns the value of the '<em><b>Updateable Value</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updateable Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updateable Value</em>' containment reference.
	 * @see #setUpdateableValue(ActionValueInput)
	 * @see com.thalesgroup.trt.mde.vp.al.al.AlPackage#getUpdateValueAction_UpdateableValue()
	 * @model containment="true" required="true"
	 * @generated
	 */

	ActionValueInput getUpdateableValue();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.al.al.UpdateValueAction#getUpdateableValue <em>Updateable Value</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updateable Value</em>' containment reference.
	 * @see #getUpdateableValue()
	 * @generated
	 */

	void setUpdateableValue(ActionValueInput value);

	/**
	 * Returns the value of the '<em><b>New Value</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Value</em>' containment reference.
	 * @see #setNewValue(ActionValueInput)
	 * @see com.thalesgroup.trt.mde.vp.al.al.AlPackage#getUpdateValueAction_NewValue()
	 * @model containment="true" required="true"
	 * @generated
	 */

	ActionValueInput getNewValue();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.al.al.UpdateValueAction#getNewValue <em>New Value</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value</em>' containment reference.
	 * @see #getNewValue()
	 * @generated
	 */

	void setNewValue(ActionValueInput value);

} // UpdateValueAction
