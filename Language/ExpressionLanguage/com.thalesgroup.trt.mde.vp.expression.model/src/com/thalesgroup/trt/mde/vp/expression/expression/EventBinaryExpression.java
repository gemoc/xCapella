package com.thalesgroup.trt.mde.vp.expression.expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.EventBinaryExpression#getOperand1 <em>Operand1</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.EventBinaryExpression#getOperand2 <em>Operand2</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.EventBinaryExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getEventBinaryExpression()
 * @model
 * @generated
 */

public interface EventBinaryExpression extends EventExpression {

	/**
	 * Returns the value of the '<em><b>Operand1</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand1</em>' containment reference.
	 * @see #setOperand1(EventExpression)
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getEventBinaryExpression_Operand1()
	 * @model containment="true" required="true"
	 * @generated
	 */

	EventExpression getOperand1();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.expression.expression.EventBinaryExpression#getOperand1 <em>Operand1</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand1</em>' containment reference.
	 * @see #getOperand1()
	 * @generated
	 */

	void setOperand1(EventExpression value);

	/**
	 * Returns the value of the '<em><b>Operand2</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand2</em>' containment reference.
	 * @see #setOperand2(EventExpression)
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getEventBinaryExpression_Operand2()
	 * @model containment="true" required="true"
	 * @generated
	 */

	EventExpression getOperand2();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.expression.expression.EventBinaryExpression#getOperand2 <em>Operand2</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand2</em>' containment reference.
	 * @see #getOperand2()
	 * @generated
	 */

	void setOperand2(EventExpression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link com.thalesgroup.trt.mde.vp.expression.expression.EventBinaryOperator}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.EventBinaryOperator
	 * @see #setOperator(EventBinaryOperator)
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getEventBinaryExpression_Operator()
	 * @model
	 * @generated
	 */

	EventBinaryOperator getOperator();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.expression.expression.EventBinaryExpression#getOperator <em>Operator</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.EventBinaryOperator
	 * @see #getOperator()
	 * @generated
	 */

	void setOperator(EventBinaryOperator value);

} // EventBinaryExpression
