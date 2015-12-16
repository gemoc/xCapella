package com.thalesgroup.trt.mde.vp.expression.expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.BooleanExpression#getAssignee <em>Assignee</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getBooleanExpression()
 * @model abstract="true"
 * @generated
 */

public interface BooleanExpression extends Expression {

	/**
	 * Returns the value of the '<em><b>Assignee</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignee</em>' reference.
	 * @see #setAssignee(Variable)
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getBooleanExpression_Assignee()
	 * @model required="true"
	 * @generated
	 */

	Variable getAssignee();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.expression.expression.BooleanExpression#getAssignee <em>Assignee</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignee</em>' reference.
	 * @see #getAssignee()
	 * @generated
	 */

	void setAssignee(Variable value);

} // BooleanExpression
