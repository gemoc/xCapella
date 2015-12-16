package com.thalesgroup.trt.mde.vp.expression.expression;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage
 * @generated
 */
public interface ExpressionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionFactory eINSTANCE = com.thalesgroup.trt.mde.vp.expression.expression.impl.ExpressionFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guard</em>'.
	 * @generated
	 */
	Guard createGuard();

	/**
	 * Returns a new object of class '<em>Event Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Guard</em>'.
	 * @generated
	 */
	EventGuard createEventGuard();

	/**
	 * Returns a new object of class '<em>Temporal Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal Guard</em>'.
	 * @generated
	 */
	TemporalGuard createTemporalGuard();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Boolean Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Unary Expression</em>'.
	 * @generated
	 */
	BooleanUnaryExpression createBooleanUnaryExpression();

	/**
	 * Returns a new object of class '<em>Boolean Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Binary Expression</em>'.
	 * @generated
	 */
	BooleanBinaryExpression createBooleanBinaryExpression();

	/**
	 * Returns a new object of class '<em>Numeric Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Unary Expression</em>'.
	 * @generated
	 */
	NumericUnaryExpression createNumericUnaryExpression();

	/**
	 * Returns a new object of class '<em>Numeric Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Binary Expression</em>'.
	 * @generated
	 */
	NumericBinaryExpression createNumericBinaryExpression();

	/**
	 * Returns a new object of class '<em>Numeric Comparison Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Comparison Expression</em>'.
	 * @generated
	 */
	NumericComparisonExpression createNumericComparisonExpression();

	/**
	 * Returns a new object of class '<em>Numeric Computation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Computation Expression</em>'.
	 * @generated
	 */
	NumericComputationExpression createNumericComputationExpression();

	/**
	 * Returns a new object of class '<em>Event Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Unary Expression</em>'.
	 * @generated
	 */
	EventUnaryExpression createEventUnaryExpression();

	/**
	 * Returns a new object of class '<em>Event Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Binary Expression</em>'.
	 * @generated
	 */
	EventBinaryExpression createEventBinaryExpression();

	/**
	 * Returns a new object of class '<em>Duration Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Duration Unary Expression</em>'.
	 * @generated
	 */
	DurationUnaryExpression createDurationUnaryExpression();

	/**
	 * Returns a new object of class '<em>Duration Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Duration Binary Expression</em>'.
	 * @generated
	 */
	DurationBinaryExpression createDurationBinaryExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExpressionPackage getExpressionPackage();

} //ExpressionFactory
