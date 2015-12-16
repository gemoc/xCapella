package com.thalesgroup.trt.mde.vp.expression.expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.DurationBinaryExpression#getOperand1 <em>Operand1</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.DurationBinaryExpression#getOperand2 <em>Operand2</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.DurationBinaryExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getDurationBinaryExpression()
 * @model
 * @generated
 */

public interface DurationBinaryExpression extends DurationExpression {

	/**
	 * Returns the value of the '<em><b>Operand1</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand1</em>' containment reference.
	 * @see #setOperand1(DurationExpression)
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getDurationBinaryExpression_Operand1()
	 * @model containment="true" required="true"
	 * @generated
	 */

	DurationExpression getOperand1();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.expression.expression.DurationBinaryExpression#getOperand1 <em>Operand1</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand1</em>' containment reference.
	 * @see #getOperand1()
	 * @generated
	 */

	void setOperand1(DurationExpression value);

	/**
	 * Returns the value of the '<em><b>Operand2</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand2</em>' containment reference.
	 * @see #setOperand2(DurationExpression)
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getDurationBinaryExpression_Operand2()
	 * @model containment="true" required="true"
	 * @generated
	 */

	DurationExpression getOperand2();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.expression.expression.DurationBinaryExpression#getOperand2 <em>Operand2</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand2</em>' containment reference.
	 * @see #getOperand2()
	 * @generated
	 */

	void setOperand2(DurationExpression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link com.thalesgroup.trt.mde.vp.expression.expression.DurationBinaryOperator}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.DurationBinaryOperator
	 * @see #setOperator(DurationBinaryOperator)
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getDurationBinaryExpression_Operator()
	 * @model
	 * @generated
	 */

	DurationBinaryOperator getOperator();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.expression.expression.DurationBinaryExpression#getOperator <em>Operator</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.DurationBinaryOperator
	 * @see #getOperator()
	 * @generated
	 */

	void setOperator(DurationBinaryOperator value);

} // DurationBinaryExpression
