package com.thalesgroup.trt.mde.vp.expression.expression.impl;

import com.thalesgroup.trt.mde.vp.expression.expression.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionFactoryImpl extends EFactoryImpl implements
		ExpressionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExpressionFactory init() {
		try
		{
			ExpressionFactory theExpressionFactory = (ExpressionFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.thalesgroup.com/trt/expression/1.0.0"); //$NON-NLS-1$ 
			if (theExpressionFactory != null)
			{
				return theExpressionFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExpressionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID())
		{
			case ExpressionPackage.GUARD: return createGuard();
			case ExpressionPackage.EVENT_GUARD: return createEventGuard();
			case ExpressionPackage.TEMPORAL_GUARD: return createTemporalGuard();
			case ExpressionPackage.VARIABLE: return createVariable();
			case ExpressionPackage.BOOLEAN_UNARY_EXPRESSION: return createBooleanUnaryExpression();
			case ExpressionPackage.BOOLEAN_BINARY_EXPRESSION: return createBooleanBinaryExpression();
			case ExpressionPackage.NUMERIC_UNARY_EXPRESSION: return createNumericUnaryExpression();
			case ExpressionPackage.NUMERIC_BINARY_EXPRESSION: return createNumericBinaryExpression();
			case ExpressionPackage.NUMERIC_COMPARISON_EXPRESSION: return createNumericComparisonExpression();
			case ExpressionPackage.NUMERIC_COMPUTATION_EXPRESSION: return createNumericComputationExpression();
			case ExpressionPackage.EVENT_UNARY_EXPRESSION: return createEventUnaryExpression();
			case ExpressionPackage.EVENT_BINARY_EXPRESSION: return createEventBinaryExpression();
			case ExpressionPackage.DURATION_UNARY_EXPRESSION: return createDurationUnaryExpression();
			case ExpressionPackage.DURATION_BINARY_EXPRESSION: return createDurationBinaryExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID())
		{
			case ExpressionPackage.BOOLEAN_UNARY_OPERATOR:
				return createBooleanUnaryOperatorFromString(eDataType, initialValue);
			case ExpressionPackage.BOOLEAN_BINARY_OPERATOR:
				return createBooleanBinaryOperatorFromString(eDataType, initialValue);
			case ExpressionPackage.NUMERIC_UNARY_OPERATOR:
				return createNumericUnaryOperatorFromString(eDataType, initialValue);
			case ExpressionPackage.NUMERIC_COMPARISON_OPERATOR:
				return createNumericComparisonOperatorFromString(eDataType, initialValue);
			case ExpressionPackage.NUMERIC_COMPUTATION_OPERATOR:
				return createNumericComputationOperatorFromString(eDataType, initialValue);
			case ExpressionPackage.EVENT_UNARY_OPERATOR:
				return createEventUnaryOperatorFromString(eDataType, initialValue);
			case ExpressionPackage.EVENT_BINARY_OPERATOR:
				return createEventBinaryOperatorFromString(eDataType, initialValue);
			case ExpressionPackage.DURATION_BINARY_OPERATOR:
				return createDurationBinaryOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID())
		{
			case ExpressionPackage.BOOLEAN_UNARY_OPERATOR:
				return convertBooleanUnaryOperatorToString(eDataType, instanceValue);
			case ExpressionPackage.BOOLEAN_BINARY_OPERATOR:
				return convertBooleanBinaryOperatorToString(eDataType, instanceValue);
			case ExpressionPackage.NUMERIC_UNARY_OPERATOR:
				return convertNumericUnaryOperatorToString(eDataType, instanceValue);
			case ExpressionPackage.NUMERIC_COMPARISON_OPERATOR:
				return convertNumericComparisonOperatorToString(eDataType, instanceValue);
			case ExpressionPackage.NUMERIC_COMPUTATION_OPERATOR:
				return convertNumericComputationOperatorToString(eDataType, instanceValue);
			case ExpressionPackage.EVENT_UNARY_OPERATOR:
				return convertEventUnaryOperatorToString(eDataType, instanceValue);
			case ExpressionPackage.EVENT_BINARY_OPERATOR:
				return convertEventBinaryOperatorToString(eDataType, instanceValue);
			case ExpressionPackage.DURATION_BINARY_OPERATOR:
				return convertDurationBinaryOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guard createGuard()
	{
		GuardImpl guard = new GuardImpl();
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventGuard createEventGuard()
	{
		EventGuardImpl eventGuard = new EventGuardImpl();
		return eventGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalGuard createTemporalGuard()
	{
		TemporalGuardImpl temporalGuard = new TemporalGuardImpl();
		return temporalGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanUnaryExpression createBooleanUnaryExpression() {
		BooleanUnaryExpressionImpl booleanUnaryExpression = new BooleanUnaryExpressionImpl();
		return booleanUnaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanBinaryExpression createBooleanBinaryExpression() {
		BooleanBinaryExpressionImpl booleanBinaryExpression = new BooleanBinaryExpressionImpl();
		return booleanBinaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericUnaryExpression createNumericUnaryExpression() {
		NumericUnaryExpressionImpl numericUnaryExpression = new NumericUnaryExpressionImpl();
		return numericUnaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericBinaryExpression createNumericBinaryExpression() {
		NumericBinaryExpressionImpl numericBinaryExpression = new NumericBinaryExpressionImpl();
		return numericBinaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericComparisonExpression createNumericComparisonExpression() {
		NumericComparisonExpressionImpl numericComparisonExpression = new NumericComparisonExpressionImpl();
		return numericComparisonExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericComputationExpression createNumericComputationExpression() {
		NumericComputationExpressionImpl numericComputationExpression = new NumericComputationExpressionImpl();
		return numericComputationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventUnaryExpression createEventUnaryExpression() {
		EventUnaryExpressionImpl eventUnaryExpression = new EventUnaryExpressionImpl();
		return eventUnaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBinaryExpression createEventBinaryExpression() {
		EventBinaryExpressionImpl eventBinaryExpression = new EventBinaryExpressionImpl();
		return eventBinaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationUnaryExpression createDurationUnaryExpression() {
		DurationUnaryExpressionImpl durationUnaryExpression = new DurationUnaryExpressionImpl();
		return durationUnaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationBinaryExpression createDurationBinaryExpression() {
		DurationBinaryExpressionImpl durationBinaryExpression = new DurationBinaryExpressionImpl();
		return durationBinaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanUnaryOperator createBooleanUnaryOperatorFromString(
			EDataType eDataType, String initialValue) {
		BooleanUnaryOperator result = BooleanUnaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanUnaryOperatorToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanBinaryOperator createBooleanBinaryOperatorFromString(
			EDataType eDataType, String initialValue) {
		BooleanBinaryOperator result = BooleanBinaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanBinaryOperatorToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericUnaryOperator createNumericUnaryOperatorFromString(
			EDataType eDataType, String initialValue) {
		NumericUnaryOperator result = NumericUnaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumericUnaryOperatorToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericComparisonOperator createNumericComparisonOperatorFromString(
			EDataType eDataType, String initialValue) {
		NumericComparisonOperator result = NumericComparisonOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumericComparisonOperatorToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericComputationOperator createNumericComputationOperatorFromString(
			EDataType eDataType, String initialValue) {
		NumericComputationOperator result = NumericComputationOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumericComputationOperatorToString(
			EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventUnaryOperator createEventUnaryOperatorFromString(
			EDataType eDataType, String initialValue) {
		EventUnaryOperator result = EventUnaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventUnaryOperatorToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBinaryOperator createEventBinaryOperatorFromString(
			EDataType eDataType, String initialValue) {
		EventBinaryOperator result = EventBinaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventBinaryOperatorToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationBinaryOperator createDurationBinaryOperatorFromString(
			EDataType eDataType, String initialValue) {
		DurationBinaryOperator result = DurationBinaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurationBinaryOperatorToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionPackage getExpressionPackage() {
		return (ExpressionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExpressionPackage getPackage() {
		return ExpressionPackage.eINSTANCE;
	}

} //ExpressionFactoryImpl
