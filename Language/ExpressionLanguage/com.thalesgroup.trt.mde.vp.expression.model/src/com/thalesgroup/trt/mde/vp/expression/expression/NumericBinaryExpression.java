package com.thalesgroup.trt.mde.vp.expression.expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.NumericBinaryExpression#getOperand1 <em>Operand1</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.NumericBinaryExpression#getOperand2 <em>Operand2</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getNumericBinaryExpression()
 * @model
 * @generated
 */

public interface NumericBinaryExpression extends NumericExpression {

	/**
	 * Returns the value of the '<em><b>Operand1</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand1</em>' containment reference.
	 * @see #setOperand1(NumericExpression)
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getNumericBinaryExpression_Operand1()
	 * @model containment="true" required="true"
	 * @generated
	 */

	NumericExpression getOperand1();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.expression.expression.NumericBinaryExpression#getOperand1 <em>Operand1</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand1</em>' containment reference.
	 * @see #getOperand1()
	 * @generated
	 */

	void setOperand1(NumericExpression value);

	/**
	 * Returns the value of the '<em><b>Operand2</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand2</em>' containment reference.
	 * @see #setOperand2(NumericExpression)
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getNumericBinaryExpression_Operand2()
	 * @model containment="true" required="true"
	 * @generated
	 */

	NumericExpression getOperand2();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.expression.expression.NumericBinaryExpression#getOperand2 <em>Operand2</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand2</em>' containment reference.
	 * @see #getOperand2()
	 * @generated
	 */

	void setOperand2(NumericExpression value);

} // NumericBinaryExpression
