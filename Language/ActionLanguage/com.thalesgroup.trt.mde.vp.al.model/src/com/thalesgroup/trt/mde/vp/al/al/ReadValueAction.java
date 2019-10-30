package com.thalesgroup.trt.mde.vp.al.al;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Value Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.al.al.ReadValueAction#getValue <em>Value</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.al.al.ReadValueAction#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.trt.mde.vp.al.al.AlPackage#getReadValueAction()
 * @model
 * @generated
 */

public interface ReadValueAction extends Action {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(ActionValueInput)
	 * @see com.thalesgroup.trt.mde.vp.al.al.AlPackage#getReadValueAction_Value()
	 * @model required="true"
	 * @generated
	 */

	ActionValueInput getValue();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.al.al.ReadValueAction#getValue <em>Value</em>}' reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */

	void setValue(ActionValueInput value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(String)
	 * @see com.thalesgroup.trt.mde.vp.al.al.AlPackage#getReadValueAction_Result()
	 * @model transient="true" derived="true"
	 * @generated
	 */

	String getResult();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.al.al.ReadValueAction#getResult <em>Result</em>}' attribute.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #getResult()
	 * @generated
	 */

	void setResult(String value);

} // ReadValueAction
