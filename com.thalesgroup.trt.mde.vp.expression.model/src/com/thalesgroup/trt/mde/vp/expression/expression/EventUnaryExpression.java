package com.thalesgroup.trt.mde.vp.expression.expression;

import org.polarsys.capella.common.data.behavior.AbstractEvent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.EventUnaryExpression#getOperand <em>Operand</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.EventUnaryExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getEventUnaryExpression()
 * @model
 * @generated
 */

public interface EventUnaryExpression extends EventExpression {

	/**
	 * Returns the value of the '<em><b>Operand</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' reference.
	 * @see #setOperand(AbstractEvent)
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getEventUnaryExpression_Operand()
	 * @model required="true"
	 * @generated
	 */

	AbstractEvent getOperand();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.expression.expression.EventUnaryExpression#getOperand <em>Operand</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' reference.
	 * @see #getOperand()
	 * @generated
	 */

	void setOperand(AbstractEvent value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link com.thalesgroup.trt.mde.vp.expression.expression.EventUnaryOperator}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.EventUnaryOperator
	 * @see #setOperator(EventUnaryOperator)
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getEventUnaryExpression_Operator()
	 * @model
	 * @generated
	 */

	EventUnaryOperator getOperator();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.expression.expression.EventUnaryExpression#getOperator <em>Operator</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.EventUnaryOperator
	 * @see #getOperator()
	 * @generated
	 */

	void setOperator(EventUnaryOperator value);

} // EventUnaryExpression
