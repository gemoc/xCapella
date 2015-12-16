package com.thalesgroup.trt.mde.vp.expression.expression;

import com.thalesgroup.trt.mde.vp.time.time.Duration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.DurationUnaryExpression#getOperand <em>Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getDurationUnaryExpression()
 * @model
 * @generated
 */

public interface DurationUnaryExpression extends DurationExpression {

	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(Duration)
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getDurationUnaryExpression_Operand()
	 * @model containment="true" required="true"
	 * @generated
	 */

	Duration getOperand();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.expression.expression.DurationUnaryExpression#getOperand <em>Operand</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */

	void setOperand(Duration value);

} // DurationUnaryExpression
