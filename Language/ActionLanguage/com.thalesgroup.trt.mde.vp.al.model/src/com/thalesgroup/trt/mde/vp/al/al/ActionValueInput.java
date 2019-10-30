package com.thalesgroup.trt.mde.vp.al.al;

import org.polarsys.capella.common.data.modellingcore.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Value Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.al.al.ActionValueInput#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.trt.mde.vp.al.al.AlPackage#getActionValueInput()
 * @model
 * @generated
 */

public interface ActionValueInput extends ActionInput {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(ValueSpecification)
	 * @see com.thalesgroup.trt.mde.vp.al.al.AlPackage#getActionValueInput_Value()
	 * @model required="true"
	 * @generated
	 */

	ValueSpecification getValue();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.al.al.ActionValueInput#getValue <em>Value</em>}' reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */

	void setValue(ValueSpecification value);

} // ActionValueInput
