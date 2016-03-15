package com.thalesgroup.trt.mde.vp.expression.expression.impl;

import com.thalesgroup.trt.mde.vp.expression.expression.AbstractGuard;
import com.thalesgroup.trt.mde.vp.expression.expression.BooleanBinaryExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.BooleanBinaryOperator;
import com.thalesgroup.trt.mde.vp.expression.expression.BooleanExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.BooleanUnaryExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.BooleanUnaryOperator;
import com.thalesgroup.trt.mde.vp.expression.expression.DurationBinaryExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.DurationBinaryOperator;
import com.thalesgroup.trt.mde.vp.expression.expression.DurationExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.DurationUnaryExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.EventBinaryExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.EventBinaryOperator;
import com.thalesgroup.trt.mde.vp.expression.expression.EventExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.EventGuard;
import com.thalesgroup.trt.mde.vp.expression.expression.EventUnaryExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.EventUnaryOperator;
import com.thalesgroup.trt.mde.vp.expression.expression.Expression;
import com.thalesgroup.trt.mde.vp.expression.expression.ExpressionFactory;
import com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage;
import com.thalesgroup.trt.mde.vp.expression.expression.Guard;
import com.thalesgroup.trt.mde.vp.expression.expression.NumericBinaryExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.NumericComparisonExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.NumericComparisonOperator;
import com.thalesgroup.trt.mde.vp.expression.expression.NumericComputationExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.NumericComputationOperator;
import com.thalesgroup.trt.mde.vp.expression.expression.NumericExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.NumericUnaryExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.NumericUnaryOperator;
import com.thalesgroup.trt.mde.vp.expression.expression.TemporalGuard;
import com.thalesgroup.trt.mde.vp.expression.expression.Variable;

import com.thalesgroup.trt.mde.vp.time.time.TimePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.capella.common.data.behavior.BehaviorPackage;

import org.polarsys.capella.common.data.modellingcore.ModellingcorePackage;

import org.polarsys.capella.core.data.capellacore.CapellacorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionPackageImpl extends EPackageImpl implements
		ExpressionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractGuardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventGuardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalGuardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanUnaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanBinaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericUnaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericBinaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericComparisonExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericComputationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventUnaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventBinaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationUnaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationBinaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum booleanUnaryOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum booleanBinaryOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numericUnaryOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numericComparisonOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numericComputationOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventUnaryOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventBinaryOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum durationBinaryOperatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExpressionPackageImpl() {
		super(eNS_URI, ExpressionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ExpressionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExpressionPackage init() {
		if (isInited)
			return (ExpressionPackage) EPackage.Registry.INSTANCE
					.getEPackage(ExpressionPackage.eNS_URI);

		// Obtain or create and register package
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ExpressionPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new ExpressionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TimePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theExpressionPackage.createPackageContents();

		// Initialize created meta-data
		theExpressionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExpressionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExpressionPackage.eNS_URI,
				theExpressionPackage);
		return theExpressionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractGuard() {
		return abstractGuardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuard() {
		return guardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuard_Condition() {
		return (EReference) guardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventGuard() {
		return eventGuardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventGuard_TriggeringEvent() {
		return (EReference) eventGuardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalGuard() {
		return temporalGuardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalGuard_AfterDuration() {
		return (EReference) temporalGuardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_InitialValue() {
		return (EReference) variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_CurrentValue() {
		return (EReference) variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanExpression() {
		return booleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanExpression_Assignee() {
		return (EReference) booleanExpressionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanUnaryExpression() {
		return booleanUnaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanUnaryExpression_Operand() {
		return (EReference) booleanUnaryExpressionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanUnaryExpression_Operator() {
		return (EAttribute) booleanUnaryExpressionEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanBinaryExpression() {
		return booleanBinaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanBinaryExpression_Operand1() {
		return (EReference) booleanBinaryExpressionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanBinaryExpression_Operand2() {
		return (EReference) booleanBinaryExpressionEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanBinaryExpression_Operator() {
		return (EAttribute) booleanBinaryExpressionEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericExpression() {
		return numericExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericUnaryExpression() {
		return numericUnaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericUnaryExpression_Operand() {
		return (EReference) numericUnaryExpressionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericUnaryExpression_Operator() {
		return (EAttribute) numericUnaryExpressionEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericBinaryExpression() {
		return numericBinaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericBinaryExpression_Operand1() {
		return (EReference) numericBinaryExpressionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericBinaryExpression_Operand2() {
		return (EReference) numericBinaryExpressionEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericComparisonExpression() {
		return numericComparisonExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericComparisonExpression_Operator() {
		return (EAttribute) numericComparisonExpressionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericComputationExpression() {
		return numericComputationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericComputationExpression_Assignee() {
		return (EReference) numericComputationExpressionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericComputationExpression_Operator() {
		return (EAttribute) numericComputationExpressionEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventExpression() {
		return eventExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventUnaryExpression() {
		return eventUnaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventUnaryExpression_Operand() {
		return (EReference) eventUnaryExpressionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventUnaryExpression_Operator() {
		return (EAttribute) eventUnaryExpressionEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventBinaryExpression() {
		return eventBinaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventBinaryExpression_Operand1() {
		return (EReference) eventBinaryExpressionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventBinaryExpression_Operand2() {
		return (EReference) eventBinaryExpressionEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventBinaryExpression_Operator() {
		return (EAttribute) eventBinaryExpressionEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDurationExpression() {
		return durationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDurationUnaryExpression() {
		return durationUnaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDurationUnaryExpression_Operand() {
		return (EReference) durationUnaryExpressionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDurationBinaryExpression() {
		return durationBinaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDurationBinaryExpression_Operand1() {
		return (EReference) durationBinaryExpressionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDurationBinaryExpression_Operand2() {
		return (EReference) durationBinaryExpressionEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDurationBinaryExpression_Operator() {
		return (EAttribute) durationBinaryExpressionEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBooleanUnaryOperator() {
		return booleanUnaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBooleanBinaryOperator() {
		return booleanBinaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNumericUnaryOperator() {
		return numericUnaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNumericComparisonOperator() {
		return numericComparisonOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNumericComputationOperator() {
		return numericComputationOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventUnaryOperator() {
		return eventUnaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventBinaryOperator() {
		return eventBinaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDurationBinaryOperator() {
		return durationBinaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionFactory getExpressionFactory() {
		return (ExpressionFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		abstractGuardEClass = createEClass(ABSTRACT_GUARD);

		guardEClass = createEClass(GUARD);
		createEReference(guardEClass, GUARD__CONDITION);

		eventGuardEClass = createEClass(EVENT_GUARD);
		createEReference(eventGuardEClass, EVENT_GUARD__TRIGGERING_EVENT);

		temporalGuardEClass = createEClass(TEMPORAL_GUARD);
		createEReference(temporalGuardEClass, TEMPORAL_GUARD__AFTER_DURATION);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__INITIAL_VALUE);
		createEReference(variableEClass, VARIABLE__CURRENT_VALUE);

		expressionEClass = createEClass(EXPRESSION);

		booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);
		createEReference(booleanExpressionEClass, BOOLEAN_EXPRESSION__ASSIGNEE);

		booleanUnaryExpressionEClass = createEClass(BOOLEAN_UNARY_EXPRESSION);
		createEReference(booleanUnaryExpressionEClass,
				BOOLEAN_UNARY_EXPRESSION__OPERAND);
		createEAttribute(booleanUnaryExpressionEClass,
				BOOLEAN_UNARY_EXPRESSION__OPERATOR);

		booleanBinaryExpressionEClass = createEClass(BOOLEAN_BINARY_EXPRESSION);
		createEReference(booleanBinaryExpressionEClass,
				BOOLEAN_BINARY_EXPRESSION__OPERAND1);
		createEReference(booleanBinaryExpressionEClass,
				BOOLEAN_BINARY_EXPRESSION__OPERAND2);
		createEAttribute(booleanBinaryExpressionEClass,
				BOOLEAN_BINARY_EXPRESSION__OPERATOR);

		numericExpressionEClass = createEClass(NUMERIC_EXPRESSION);

		numericUnaryExpressionEClass = createEClass(NUMERIC_UNARY_EXPRESSION);
		createEReference(numericUnaryExpressionEClass,
				NUMERIC_UNARY_EXPRESSION__OPERAND);
		createEAttribute(numericUnaryExpressionEClass,
				NUMERIC_UNARY_EXPRESSION__OPERATOR);

		numericBinaryExpressionEClass = createEClass(NUMERIC_BINARY_EXPRESSION);
		createEReference(numericBinaryExpressionEClass,
				NUMERIC_BINARY_EXPRESSION__OPERAND1);
		createEReference(numericBinaryExpressionEClass,
				NUMERIC_BINARY_EXPRESSION__OPERAND2);

		numericComparisonExpressionEClass = createEClass(NUMERIC_COMPARISON_EXPRESSION);
		createEAttribute(numericComparisonExpressionEClass,
				NUMERIC_COMPARISON_EXPRESSION__OPERATOR);

		numericComputationExpressionEClass = createEClass(NUMERIC_COMPUTATION_EXPRESSION);
		createEReference(numericComputationExpressionEClass,
				NUMERIC_COMPUTATION_EXPRESSION__ASSIGNEE);
		createEAttribute(numericComputationExpressionEClass,
				NUMERIC_COMPUTATION_EXPRESSION__OPERATOR);

		eventExpressionEClass = createEClass(EVENT_EXPRESSION);

		eventUnaryExpressionEClass = createEClass(EVENT_UNARY_EXPRESSION);
		createEReference(eventUnaryExpressionEClass,
				EVENT_UNARY_EXPRESSION__OPERAND);
		createEAttribute(eventUnaryExpressionEClass,
				EVENT_UNARY_EXPRESSION__OPERATOR);

		eventBinaryExpressionEClass = createEClass(EVENT_BINARY_EXPRESSION);
		createEReference(eventBinaryExpressionEClass,
				EVENT_BINARY_EXPRESSION__OPERAND1);
		createEReference(eventBinaryExpressionEClass,
				EVENT_BINARY_EXPRESSION__OPERAND2);
		createEAttribute(eventBinaryExpressionEClass,
				EVENT_BINARY_EXPRESSION__OPERATOR);

		durationExpressionEClass = createEClass(DURATION_EXPRESSION);

		durationUnaryExpressionEClass = createEClass(DURATION_UNARY_EXPRESSION);
		createEReference(durationUnaryExpressionEClass,
				DURATION_UNARY_EXPRESSION__OPERAND);

		durationBinaryExpressionEClass = createEClass(DURATION_BINARY_EXPRESSION);
		createEReference(durationBinaryExpressionEClass,
				DURATION_BINARY_EXPRESSION__OPERAND1);
		createEReference(durationBinaryExpressionEClass,
				DURATION_BINARY_EXPRESSION__OPERAND2);
		createEAttribute(durationBinaryExpressionEClass,
				DURATION_BINARY_EXPRESSION__OPERATOR);

		// Create enums
		booleanUnaryOperatorEEnum = createEEnum(BOOLEAN_UNARY_OPERATOR);
		booleanBinaryOperatorEEnum = createEEnum(BOOLEAN_BINARY_OPERATOR);
		numericUnaryOperatorEEnum = createEEnum(NUMERIC_UNARY_OPERATOR);
		numericComparisonOperatorEEnum = createEEnum(NUMERIC_COMPARISON_OPERATOR);
		numericComputationOperatorEEnum = createEEnum(NUMERIC_COMPUTATION_OPERATOR);
		eventUnaryOperatorEEnum = createEEnum(EVENT_UNARY_OPERATOR);
		eventBinaryOperatorEEnum = createEEnum(EVENT_BINARY_OPERATOR);
		durationBinaryOperatorEEnum = createEEnum(DURATION_BINARY_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CapellacorePackage theCapellacorePackage = (CapellacorePackage) EPackage.Registry.INSTANCE
				.getEPackage(CapellacorePackage.eNS_URI);
		ModellingcorePackage theModellingcorePackage = (ModellingcorePackage) EPackage.Registry.INSTANCE
				.getEPackage(ModellingcorePackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage) EPackage.Registry.INSTANCE
				.getEPackage(BehaviorPackage.eNS_URI);
		TimePackage theTimePackage = (TimePackage) EPackage.Registry.INSTANCE
				.getEPackage(TimePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractGuardEClass.getESuperTypes().add(
				theCapellacorePackage.getNamedElement());
		guardEClass.getESuperTypes().add(this.getAbstractGuard());
		eventGuardEClass.getESuperTypes().add(this.getAbstractGuard());
		temporalGuardEClass.getESuperTypes().add(this.getAbstractGuard());
		variableEClass.getESuperTypes().add(
				theCapellacorePackage.getNamedElement());
		expressionEClass.getESuperTypes().add(
				theCapellacorePackage.getNamedElement());
		booleanExpressionEClass.getESuperTypes().add(this.getExpression());
		booleanUnaryExpressionEClass.getESuperTypes().add(
				this.getBooleanExpression());
		booleanBinaryExpressionEClass.getESuperTypes().add(
				this.getBooleanExpression());
		numericExpressionEClass.getESuperTypes().add(this.getExpression());
		numericUnaryExpressionEClass.getESuperTypes().add(
				this.getNumericExpression());
		numericBinaryExpressionEClass.getESuperTypes().add(
				this.getNumericExpression());
		numericComparisonExpressionEClass.getESuperTypes().add(
				this.getNumericBinaryExpression());
		numericComparisonExpressionEClass.getESuperTypes().add(
				this.getBooleanExpression());
		numericComputationExpressionEClass.getESuperTypes().add(
				this.getNumericBinaryExpression());
		eventExpressionEClass.getESuperTypes().add(
				theCapellacorePackage.getNamedElement());
		eventUnaryExpressionEClass.getESuperTypes().add(
				this.getEventExpression());
		eventBinaryExpressionEClass.getESuperTypes().add(
				this.getEventExpression());
		durationExpressionEClass.getESuperTypes().add(
				theCapellacorePackage.getNamedElement());
		durationUnaryExpressionEClass.getESuperTypes().add(
				this.getDurationExpression());
		durationBinaryExpressionEClass.getESuperTypes().add(
				this.getDurationExpression());

		// Initialize classes and features; add operations and parameters
		initEClass(
				abstractGuardEClass,
				AbstractGuard.class,
				"AbstractGuard", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(abstractGuardEClass, ecorePackage.getEString(),
				"asString", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		EOperation op = addEOperation(abstractGuardEClass, null,
				"fromString", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(),
				"p_String", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				guardEClass,
				Guard.class,
				"Guard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getGuard_Condition(),
				this.getBooleanExpression(),
				null,
				"condition", null, 1, 1, Guard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				eventGuardEClass,
				EventGuard.class,
				"EventGuard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getEventGuard_TriggeringEvent(),
				this.getEventExpression(),
				null,
				"triggeringEvent", null, 1, 1, EventGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				temporalGuardEClass,
				TemporalGuard.class,
				"TemporalGuard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getTemporalGuard_AfterDuration(),
				this.getDurationExpression(),
				null,
				"afterDuration", null, 1, 1, TemporalGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				variableEClass,
				Variable.class,
				"Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getVariable_InitialValue(),
				theModellingcorePackage.getValueSpecification(),
				null,
				"initialValue", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getVariable_CurrentValue(),
				theModellingcorePackage.getValueSpecification(),
				null,
				"currentValue", null, 1, 1, Variable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				expressionEClass,
				Expression.class,
				"Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(
				booleanExpressionEClass,
				BooleanExpression.class,
				"BooleanExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getBooleanExpression_Assignee(),
				this.getVariable(),
				null,
				"assignee", null, 1, 1, BooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				booleanUnaryExpressionEClass,
				BooleanUnaryExpression.class,
				"BooleanUnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getBooleanUnaryExpression_Operand(),
				this.getVariable(),
				null,
				"operand", null, 1, 1, BooleanUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getBooleanUnaryExpression_Operator(),
				this.getBooleanUnaryOperator(),
				"operator", null, 0, 1, BooleanUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				booleanBinaryExpressionEClass,
				BooleanBinaryExpression.class,
				"BooleanBinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getBooleanBinaryExpression_Operand1(),
				this.getBooleanExpression(),
				null,
				"operand1", null, 1, 1, BooleanBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getBooleanBinaryExpression_Operand2(),
				this.getBooleanExpression(),
				null,
				"operand2", null, 1, 1, BooleanBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getBooleanBinaryExpression_Operator(),
				this.getBooleanBinaryOperator(),
				"operator", null, 0, 1, BooleanBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				numericExpressionEClass,
				NumericExpression.class,
				"NumericExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(
				numericUnaryExpressionEClass,
				NumericUnaryExpression.class,
				"NumericUnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getNumericUnaryExpression_Operand(),
				this.getVariable(),
				null,
				"operand", null, 1, 1, NumericUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getNumericUnaryExpression_Operator(),
				this.getNumericUnaryOperator(),
				"operator", null, 0, 1, NumericUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				numericBinaryExpressionEClass,
				NumericBinaryExpression.class,
				"NumericBinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getNumericBinaryExpression_Operand1(),
				this.getNumericExpression(),
				null,
				"operand1", null, 1, 1, NumericBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getNumericBinaryExpression_Operand2(),
				this.getNumericExpression(),
				null,
				"operand2", null, 1, 1, NumericBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				numericComparisonExpressionEClass,
				NumericComparisonExpression.class,
				"NumericComparisonExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getNumericComparisonExpression_Operator(),
				this.getNumericComparisonOperator(),
				"operator", null, 0, 1, NumericComparisonExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				numericComputationExpressionEClass,
				NumericComputationExpression.class,
				"NumericComputationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getNumericComputationExpression_Assignee(),
				this.getVariable(),
				null,
				"assignee", null, 1, 1, NumericComputationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getNumericComputationExpression_Operator(),
				this.getNumericComputationOperator(),
				"operator", null, 0, 1, NumericComputationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				eventExpressionEClass,
				EventExpression.class,
				"EventExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(
				eventUnaryExpressionEClass,
				EventUnaryExpression.class,
				"EventUnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getEventUnaryExpression_Operand(),
				theBehaviorPackage.getAbstractEvent(),
				null,
				"operand", null, 1, 1, EventUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEventUnaryExpression_Operator(),
				this.getEventUnaryOperator(),
				"operator", null, 0, 1, EventUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				eventBinaryExpressionEClass,
				EventBinaryExpression.class,
				"EventBinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getEventBinaryExpression_Operand1(),
				this.getEventExpression(),
				null,
				"operand1", null, 1, 1, EventBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getEventBinaryExpression_Operand2(),
				this.getEventExpression(),
				null,
				"operand2", null, 1, 1, EventBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEventBinaryExpression_Operator(),
				this.getEventBinaryOperator(),
				"operator", null, 0, 1, EventBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				durationExpressionEClass,
				DurationExpression.class,
				"DurationExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(
				durationUnaryExpressionEClass,
				DurationUnaryExpression.class,
				"DurationUnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getDurationUnaryExpression_Operand(),
				theTimePackage.getDuration(),
				null,
				"operand", null, 1, 1, DurationUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				durationBinaryExpressionEClass,
				DurationBinaryExpression.class,
				"DurationBinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getDurationBinaryExpression_Operand1(),
				this.getDurationExpression(),
				null,
				"operand1", null, 1, 1, DurationBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getDurationBinaryExpression_Operand2(),
				this.getDurationExpression(),
				null,
				"operand2", null, 1, 1, DurationBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getDurationBinaryExpression_Operator(),
				this.getDurationBinaryOperator(),
				"operator", null, 0, 1, DurationBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(booleanUnaryOperatorEEnum, BooleanUnaryOperator.class,
				"BooleanUnaryOperator"); //$NON-NLS-1$
		addEEnumLiteral(booleanUnaryOperatorEEnum,
				BooleanUnaryOperator.UNSPECIFIED);
		addEEnumLiteral(booleanUnaryOperatorEEnum, BooleanUnaryOperator.NOT);

		initEEnum(booleanBinaryOperatorEEnum, BooleanBinaryOperator.class,
				"BooleanBinaryOperator"); //$NON-NLS-1$
		addEEnumLiteral(booleanBinaryOperatorEEnum, BooleanBinaryOperator.AND);
		addEEnumLiteral(booleanBinaryOperatorEEnum, BooleanBinaryOperator.OR);

		initEEnum(numericUnaryOperatorEEnum, NumericUnaryOperator.class,
				"NumericUnaryOperator"); //$NON-NLS-1$
		addEEnumLiteral(numericUnaryOperatorEEnum,
				NumericUnaryOperator.UNSPECIFIED);
		addEEnumLiteral(numericUnaryOperatorEEnum, NumericUnaryOperator.MINUS);

		initEEnum(numericComparisonOperatorEEnum,
				NumericComparisonOperator.class, "NumericComparisonOperator"); //$NON-NLS-1$
		addEEnumLiteral(numericComparisonOperatorEEnum,
				NumericComparisonOperator.SMALLER);
		addEEnumLiteral(numericComparisonOperatorEEnum,
				NumericComparisonOperator.SMALLER_EQUALS);
		addEEnumLiteral(numericComparisonOperatorEEnum,
				NumericComparisonOperator.EQUALS);
		addEEnumLiteral(numericComparisonOperatorEEnum,
				NumericComparisonOperator.GREATER_EQUALS);
		addEEnumLiteral(numericComparisonOperatorEEnum,
				NumericComparisonOperator.GREATER);

		initEEnum(numericComputationOperatorEEnum,
				NumericComputationOperator.class, "NumericComputationOperator"); //$NON-NLS-1$
		addEEnumLiteral(numericComputationOperatorEEnum,
				NumericComputationOperator.ADD);
		addEEnumLiteral(numericComputationOperatorEEnum,
				NumericComputationOperator.SUB);
		addEEnumLiteral(numericComputationOperatorEEnum,
				NumericComputationOperator.MUL);
		addEEnumLiteral(numericComputationOperatorEEnum,
				NumericComputationOperator.DIV);

		initEEnum(eventUnaryOperatorEEnum, EventUnaryOperator.class,
				"EventUnaryOperator"); //$NON-NLS-1$
		addEEnumLiteral(eventUnaryOperatorEEnum, EventUnaryOperator.UNSPECIFIED);
		addEEnumLiteral(eventUnaryOperatorEEnum, EventUnaryOperator.NOT);

		initEEnum(eventBinaryOperatorEEnum, EventBinaryOperator.class,
				"EventBinaryOperator"); //$NON-NLS-1$
		addEEnumLiteral(eventBinaryOperatorEEnum, EventBinaryOperator.AND);
		addEEnumLiteral(eventBinaryOperatorEEnum, EventBinaryOperator.OR);

		initEEnum(durationBinaryOperatorEEnum, DurationBinaryOperator.class,
				"DurationBinaryOperator"); //$NON-NLS-1$
		addEEnumLiteral(durationBinaryOperatorEEnum, DurationBinaryOperator.ADD);
		addEEnumLiteral(durationBinaryOperatorEEnum, DurationBinaryOperator.SUB);
		addEEnumLiteral(durationBinaryOperatorEEnum, DurationBinaryOperator.MUL);
		addEEnumLiteral(durationBinaryOperatorEEnum, DurationBinaryOperator.DIV);

		// Create resource
		createResource(eNS_URI);
	}

} //ExpressionPackageImpl
