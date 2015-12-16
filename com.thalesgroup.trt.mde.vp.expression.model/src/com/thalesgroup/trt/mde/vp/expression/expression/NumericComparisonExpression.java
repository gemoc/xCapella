package com.thalesgroup.trt.mde.vp.expression.expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Comparison Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.NumericComparisonExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getNumericComparisonExpression()
 * @model
 * @generated
 */

public interface NumericComparisonExpression extends NumericBinaryExpression,
		BooleanExpression {

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link com.thalesgroup.trt.mde.vp.expression.expression.NumericComparisonOperator}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.NumericComparisonOperator
	 * @see #setOperator(NumericComparisonOperator)
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getNumericComparisonExpression_Operator()
	 * @model
	 * @generated
	 */

	NumericComparisonOperator getOperator();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.expression.expression.NumericComparisonExpression#getOperator <em>Operator</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.NumericComparisonOperator
	 * @see #getOperator()
	 * @generated
	 */

	void setOperator(NumericComparisonOperator value);

} // NumericComparisonExpression
