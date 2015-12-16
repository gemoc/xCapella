package com.thalesgroup.trt.mde.vp.expression.expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.Guard#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getGuard()
 * @model
 * @generated
 */

public interface Guard extends AbstractGuard {

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(BooleanExpression)
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getGuard_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */

	BooleanExpression getCondition();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.expression.expression.Guard#getCondition <em>Condition</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */

	void setCondition(BooleanExpression value);

} // Guard
