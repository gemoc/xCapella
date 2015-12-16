package com.thalesgroup.trt.mde.vp.expression.expression;

import org.polarsys.capella.common.data.modellingcore.ValueSpecification;

import org.polarsys.capella.core.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.Variable#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.Variable#getCurrentValue <em>Current Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getVariable()
 * @model
 * @generated
 */

public interface Variable extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' containment reference.
	 * @see #setInitialValue(ValueSpecification)
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getVariable_InitialValue()
	 * @model containment="true" required="true"
	 * @generated
	 */

	ValueSpecification getInitialValue();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.expression.expression.Variable#getInitialValue <em>Initial Value</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' containment reference.
	 * @see #getInitialValue()
	 * @generated
	 */

	void setInitialValue(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Current Value</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Value</em>' containment reference.
	 * @see #setCurrentValue(ValueSpecification)
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getVariable_CurrentValue()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */

	ValueSpecification getCurrentValue();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.expression.expression.Variable#getCurrentValue <em>Current Value</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Value</em>' containment reference.
	 * @see #getCurrentValue()
	 * @generated
	 */

	void setCurrentValue(ValueSpecification value);

} // Variable
