package com.thalesgroup.trt.mde.vp.expression.expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.NumericUnaryExpression#getOperand <em>Operand</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.NumericUnaryExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getNumericUnaryExpression()
 * @model
 * @generated
 */

public interface NumericUnaryExpression extends NumericExpression {

	/**
	 * Returns the value of the '<em><b>Operand</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' reference.
	 * @see #setOperand(Variable)
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getNumericUnaryExpression_Operand()
	 * @model required="true"
	 * @generated
	 */

	Variable getOperand();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.expression.expression.NumericUnaryExpression#getOperand <em>Operand</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' reference.
	 * @see #getOperand()
	 * @generated
	 */

	void setOperand(Variable value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link com.thalesgroup.trt.mde.vp.expression.expression.NumericUnaryOperator}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.NumericUnaryOperator
	 * @see #setOperator(NumericUnaryOperator)
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getNumericUnaryExpression_Operator()
	 * @model
	 * @generated
	 */

	NumericUnaryOperator getOperator();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.expression.expression.NumericUnaryExpression#getOperator <em>Operator</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.NumericUnaryOperator
	 * @see #getOperator()
	 * @generated
	 */

	void setOperator(NumericUnaryOperator value);

} // NumericUnaryExpression
