package com.thalesgroup.trt.mde.vp.expression.expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Computation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.NumericComputationExpression#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.NumericComputationExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getNumericComputationExpression()
 * @model
 * @generated
 */

public interface NumericComputationExpression extends NumericBinaryExpression {

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
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getNumericComputationExpression_Assignee()
	 * @model required="true"
	 * @generated
	 */

	Variable getAssignee();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.expression.expression.NumericComputationExpression#getAssignee <em>Assignee</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignee</em>' reference.
	 * @see #getAssignee()
	 * @generated
	 */

	void setAssignee(Variable value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link com.thalesgroup.trt.mde.vp.expression.expression.NumericComputationOperator}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.NumericComputationOperator
	 * @see #setOperator(NumericComputationOperator)
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getNumericComputationExpression_Operator()
	 * @model
	 * @generated
	 */

	NumericComputationOperator getOperator();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.expression.expression.NumericComputationExpression#getOperator <em>Operator</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.NumericComputationOperator
	 * @see #getOperator()
	 * @generated
	 */

	void setOperator(NumericComputationOperator value);

} // NumericComputationExpression
