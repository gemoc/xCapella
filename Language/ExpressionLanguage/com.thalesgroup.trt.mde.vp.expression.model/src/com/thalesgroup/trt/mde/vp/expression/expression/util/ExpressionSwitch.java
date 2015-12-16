package com.thalesgroup.trt.mde.vp.expression.expression.util;

import com.thalesgroup.trt.mde.vp.expression.expression.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.polarsys.capella.common.data.modellingcore.AbstractNamedElement;
import org.polarsys.capella.common.data.modellingcore.ModelElement;
import org.polarsys.capella.common.data.modellingcore.PublishableElement;
import org.polarsys.capella.common.data.modellingcore.TraceableElement;

import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.NamedElement;

import org.polarsys.kitalpha.emde.model.Element;
import org.polarsys.kitalpha.emde.model.ExtensibleElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage
 * @generated
 */
public class ExpressionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExpressionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionSwitch() {
		if (modelPackage == null)
		{
			modelPackage = ExpressionPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID)
		{
			case ExpressionPackage.ABSTRACT_GUARD:
			{
				AbstractGuard abstractGuard = (AbstractGuard)theEObject;
				T result = caseAbstractGuard(abstractGuard);
				if (result == null) result = caseNamedElement(abstractGuard);
				if (result == null) result = caseAbstractNamedElement(abstractGuard);
				if (result == null) result = caseCapellaElement(abstractGuard);
				if (result == null) result = caseTraceableElement(abstractGuard);
				if (result == null) result = casePublishableElement(abstractGuard);
				if (result == null) result = caseModelElement(abstractGuard);
				if (result == null) result = caseExtensibleElement(abstractGuard);
				if (result == null) result = caseElement(abstractGuard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.GUARD:
			{
				Guard guard = (Guard)theEObject;
				T result = caseGuard(guard);
				if (result == null) result = caseAbstractGuard(guard);
				if (result == null) result = caseNamedElement(guard);
				if (result == null) result = caseAbstractNamedElement(guard);
				if (result == null) result = caseCapellaElement(guard);
				if (result == null) result = caseTraceableElement(guard);
				if (result == null) result = casePublishableElement(guard);
				if (result == null) result = caseModelElement(guard);
				if (result == null) result = caseExtensibleElement(guard);
				if (result == null) result = caseElement(guard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.EVENT_GUARD:
			{
				EventGuard eventGuard = (EventGuard)theEObject;
				T result = caseEventGuard(eventGuard);
				if (result == null) result = caseAbstractGuard(eventGuard);
				if (result == null) result = caseNamedElement(eventGuard);
				if (result == null) result = caseAbstractNamedElement(eventGuard);
				if (result == null) result = caseCapellaElement(eventGuard);
				if (result == null) result = caseTraceableElement(eventGuard);
				if (result == null) result = casePublishableElement(eventGuard);
				if (result == null) result = caseModelElement(eventGuard);
				if (result == null) result = caseExtensibleElement(eventGuard);
				if (result == null) result = caseElement(eventGuard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.TEMPORAL_GUARD:
			{
				TemporalGuard temporalGuard = (TemporalGuard)theEObject;
				T result = caseTemporalGuard(temporalGuard);
				if (result == null) result = caseAbstractGuard(temporalGuard);
				if (result == null) result = caseNamedElement(temporalGuard);
				if (result == null) result = caseAbstractNamedElement(temporalGuard);
				if (result == null) result = caseCapellaElement(temporalGuard);
				if (result == null) result = caseTraceableElement(temporalGuard);
				if (result == null) result = casePublishableElement(temporalGuard);
				if (result == null) result = caseModelElement(temporalGuard);
				if (result == null) result = caseExtensibleElement(temporalGuard);
				if (result == null) result = caseElement(temporalGuard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.VARIABLE:
			{
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseNamedElement(variable);
				if (result == null) result = caseAbstractNamedElement(variable);
				if (result == null) result = caseCapellaElement(variable);
				if (result == null) result = caseTraceableElement(variable);
				if (result == null) result = casePublishableElement(variable);
				if (result == null) result = caseModelElement(variable);
				if (result == null) result = caseExtensibleElement(variable);
				if (result == null) result = caseElement(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.EXPRESSION:
			{
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseNamedElement(expression);
				if (result == null) result = caseAbstractNamedElement(expression);
				if (result == null) result = caseCapellaElement(expression);
				if (result == null) result = caseTraceableElement(expression);
				if (result == null) result = casePublishableElement(expression);
				if (result == null) result = caseModelElement(expression);
				if (result == null) result = caseExtensibleElement(expression);
				if (result == null) result = caseElement(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.BOOLEAN_EXPRESSION:
			{
				BooleanExpression booleanExpression = (BooleanExpression)theEObject;
				T result = caseBooleanExpression(booleanExpression);
				if (result == null) result = caseExpression(booleanExpression);
				if (result == null) result = caseNamedElement(booleanExpression);
				if (result == null) result = caseAbstractNamedElement(booleanExpression);
				if (result == null) result = caseCapellaElement(booleanExpression);
				if (result == null) result = caseTraceableElement(booleanExpression);
				if (result == null) result = casePublishableElement(booleanExpression);
				if (result == null) result = caseModelElement(booleanExpression);
				if (result == null) result = caseExtensibleElement(booleanExpression);
				if (result == null) result = caseElement(booleanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.BOOLEAN_UNARY_EXPRESSION:
			{
				BooleanUnaryExpression booleanUnaryExpression = (BooleanUnaryExpression)theEObject;
				T result = caseBooleanUnaryExpression(booleanUnaryExpression);
				if (result == null) result = caseBooleanExpression(booleanUnaryExpression);
				if (result == null) result = caseExpression(booleanUnaryExpression);
				if (result == null) result = caseNamedElement(booleanUnaryExpression);
				if (result == null) result = caseAbstractNamedElement(booleanUnaryExpression);
				if (result == null) result = caseCapellaElement(booleanUnaryExpression);
				if (result == null) result = caseTraceableElement(booleanUnaryExpression);
				if (result == null) result = casePublishableElement(booleanUnaryExpression);
				if (result == null) result = caseModelElement(booleanUnaryExpression);
				if (result == null) result = caseExtensibleElement(booleanUnaryExpression);
				if (result == null) result = caseElement(booleanUnaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.BOOLEAN_BINARY_EXPRESSION:
			{
				BooleanBinaryExpression booleanBinaryExpression = (BooleanBinaryExpression)theEObject;
				T result = caseBooleanBinaryExpression(booleanBinaryExpression);
				if (result == null) result = caseBooleanExpression(booleanBinaryExpression);
				if (result == null) result = caseExpression(booleanBinaryExpression);
				if (result == null) result = caseNamedElement(booleanBinaryExpression);
				if (result == null) result = caseAbstractNamedElement(booleanBinaryExpression);
				if (result == null) result = caseCapellaElement(booleanBinaryExpression);
				if (result == null) result = caseTraceableElement(booleanBinaryExpression);
				if (result == null) result = casePublishableElement(booleanBinaryExpression);
				if (result == null) result = caseModelElement(booleanBinaryExpression);
				if (result == null) result = caseExtensibleElement(booleanBinaryExpression);
				if (result == null) result = caseElement(booleanBinaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.NUMERIC_EXPRESSION:
			{
				NumericExpression numericExpression = (NumericExpression)theEObject;
				T result = caseNumericExpression(numericExpression);
				if (result == null) result = caseExpression(numericExpression);
				if (result == null) result = caseNamedElement(numericExpression);
				if (result == null) result = caseAbstractNamedElement(numericExpression);
				if (result == null) result = caseCapellaElement(numericExpression);
				if (result == null) result = caseTraceableElement(numericExpression);
				if (result == null) result = casePublishableElement(numericExpression);
				if (result == null) result = caseModelElement(numericExpression);
				if (result == null) result = caseExtensibleElement(numericExpression);
				if (result == null) result = caseElement(numericExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.NUMERIC_UNARY_EXPRESSION:
			{
				NumericUnaryExpression numericUnaryExpression = (NumericUnaryExpression)theEObject;
				T result = caseNumericUnaryExpression(numericUnaryExpression);
				if (result == null) result = caseNumericExpression(numericUnaryExpression);
				if (result == null) result = caseExpression(numericUnaryExpression);
				if (result == null) result = caseNamedElement(numericUnaryExpression);
				if (result == null) result = caseAbstractNamedElement(numericUnaryExpression);
				if (result == null) result = caseCapellaElement(numericUnaryExpression);
				if (result == null) result = caseTraceableElement(numericUnaryExpression);
				if (result == null) result = casePublishableElement(numericUnaryExpression);
				if (result == null) result = caseModelElement(numericUnaryExpression);
				if (result == null) result = caseExtensibleElement(numericUnaryExpression);
				if (result == null) result = caseElement(numericUnaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.NUMERIC_BINARY_EXPRESSION:
			{
				NumericBinaryExpression numericBinaryExpression = (NumericBinaryExpression)theEObject;
				T result = caseNumericBinaryExpression(numericBinaryExpression);
				if (result == null) result = caseNumericExpression(numericBinaryExpression);
				if (result == null) result = caseExpression(numericBinaryExpression);
				if (result == null) result = caseNamedElement(numericBinaryExpression);
				if (result == null) result = caseAbstractNamedElement(numericBinaryExpression);
				if (result == null) result = caseCapellaElement(numericBinaryExpression);
				if (result == null) result = caseTraceableElement(numericBinaryExpression);
				if (result == null) result = casePublishableElement(numericBinaryExpression);
				if (result == null) result = caseModelElement(numericBinaryExpression);
				if (result == null) result = caseExtensibleElement(numericBinaryExpression);
				if (result == null) result = caseElement(numericBinaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.NUMERIC_COMPARISON_EXPRESSION:
			{
				NumericComparisonExpression numericComparisonExpression = (NumericComparisonExpression)theEObject;
				T result = caseNumericComparisonExpression(numericComparisonExpression);
				if (result == null) result = caseNumericBinaryExpression(numericComparisonExpression);
				if (result == null) result = caseBooleanExpression(numericComparisonExpression);
				if (result == null) result = caseNumericExpression(numericComparisonExpression);
				if (result == null) result = caseExpression(numericComparisonExpression);
				if (result == null) result = caseNamedElement(numericComparisonExpression);
				if (result == null) result = caseAbstractNamedElement(numericComparisonExpression);
				if (result == null) result = caseCapellaElement(numericComparisonExpression);
				if (result == null) result = caseTraceableElement(numericComparisonExpression);
				if (result == null) result = casePublishableElement(numericComparisonExpression);
				if (result == null) result = caseModelElement(numericComparisonExpression);
				if (result == null) result = caseExtensibleElement(numericComparisonExpression);
				if (result == null) result = caseElement(numericComparisonExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.NUMERIC_COMPUTATION_EXPRESSION:
			{
				NumericComputationExpression numericComputationExpression = (NumericComputationExpression)theEObject;
				T result = caseNumericComputationExpression(numericComputationExpression);
				if (result == null) result = caseNumericBinaryExpression(numericComputationExpression);
				if (result == null) result = caseNumericExpression(numericComputationExpression);
				if (result == null) result = caseExpression(numericComputationExpression);
				if (result == null) result = caseNamedElement(numericComputationExpression);
				if (result == null) result = caseAbstractNamedElement(numericComputationExpression);
				if (result == null) result = caseCapellaElement(numericComputationExpression);
				if (result == null) result = caseTraceableElement(numericComputationExpression);
				if (result == null) result = casePublishableElement(numericComputationExpression);
				if (result == null) result = caseModelElement(numericComputationExpression);
				if (result == null) result = caseExtensibleElement(numericComputationExpression);
				if (result == null) result = caseElement(numericComputationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.EVENT_EXPRESSION:
			{
				EventExpression eventExpression = (EventExpression)theEObject;
				T result = caseEventExpression(eventExpression);
				if (result == null) result = caseNamedElement(eventExpression);
				if (result == null) result = caseAbstractNamedElement(eventExpression);
				if (result == null) result = caseCapellaElement(eventExpression);
				if (result == null) result = caseTraceableElement(eventExpression);
				if (result == null) result = casePublishableElement(eventExpression);
				if (result == null) result = caseModelElement(eventExpression);
				if (result == null) result = caseExtensibleElement(eventExpression);
				if (result == null) result = caseElement(eventExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.EVENT_UNARY_EXPRESSION:
			{
				EventUnaryExpression eventUnaryExpression = (EventUnaryExpression)theEObject;
				T result = caseEventUnaryExpression(eventUnaryExpression);
				if (result == null) result = caseEventExpression(eventUnaryExpression);
				if (result == null) result = caseNamedElement(eventUnaryExpression);
				if (result == null) result = caseAbstractNamedElement(eventUnaryExpression);
				if (result == null) result = caseCapellaElement(eventUnaryExpression);
				if (result == null) result = caseTraceableElement(eventUnaryExpression);
				if (result == null) result = casePublishableElement(eventUnaryExpression);
				if (result == null) result = caseModelElement(eventUnaryExpression);
				if (result == null) result = caseExtensibleElement(eventUnaryExpression);
				if (result == null) result = caseElement(eventUnaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.EVENT_BINARY_EXPRESSION:
			{
				EventBinaryExpression eventBinaryExpression = (EventBinaryExpression)theEObject;
				T result = caseEventBinaryExpression(eventBinaryExpression);
				if (result == null) result = caseEventExpression(eventBinaryExpression);
				if (result == null) result = caseNamedElement(eventBinaryExpression);
				if (result == null) result = caseAbstractNamedElement(eventBinaryExpression);
				if (result == null) result = caseCapellaElement(eventBinaryExpression);
				if (result == null) result = caseTraceableElement(eventBinaryExpression);
				if (result == null) result = casePublishableElement(eventBinaryExpression);
				if (result == null) result = caseModelElement(eventBinaryExpression);
				if (result == null) result = caseExtensibleElement(eventBinaryExpression);
				if (result == null) result = caseElement(eventBinaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.DURATION_EXPRESSION:
			{
				DurationExpression durationExpression = (DurationExpression)theEObject;
				T result = caseDurationExpression(durationExpression);
				if (result == null) result = caseNamedElement(durationExpression);
				if (result == null) result = caseAbstractNamedElement(durationExpression);
				if (result == null) result = caseCapellaElement(durationExpression);
				if (result == null) result = caseTraceableElement(durationExpression);
				if (result == null) result = casePublishableElement(durationExpression);
				if (result == null) result = caseModelElement(durationExpression);
				if (result == null) result = caseExtensibleElement(durationExpression);
				if (result == null) result = caseElement(durationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.DURATION_UNARY_EXPRESSION:
			{
				DurationUnaryExpression durationUnaryExpression = (DurationUnaryExpression)theEObject;
				T result = caseDurationUnaryExpression(durationUnaryExpression);
				if (result == null) result = caseDurationExpression(durationUnaryExpression);
				if (result == null) result = caseNamedElement(durationUnaryExpression);
				if (result == null) result = caseAbstractNamedElement(durationUnaryExpression);
				if (result == null) result = caseCapellaElement(durationUnaryExpression);
				if (result == null) result = caseTraceableElement(durationUnaryExpression);
				if (result == null) result = casePublishableElement(durationUnaryExpression);
				if (result == null) result = caseModelElement(durationUnaryExpression);
				if (result == null) result = caseExtensibleElement(durationUnaryExpression);
				if (result == null) result = caseElement(durationUnaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.DURATION_BINARY_EXPRESSION:
			{
				DurationBinaryExpression durationBinaryExpression = (DurationBinaryExpression)theEObject;
				T result = caseDurationBinaryExpression(durationBinaryExpression);
				if (result == null) result = caseDurationExpression(durationBinaryExpression);
				if (result == null) result = caseNamedElement(durationBinaryExpression);
				if (result == null) result = caseAbstractNamedElement(durationBinaryExpression);
				if (result == null) result = caseCapellaElement(durationBinaryExpression);
				if (result == null) result = caseTraceableElement(durationBinaryExpression);
				if (result == null) result = casePublishableElement(durationBinaryExpression);
				if (result == null) result = caseModelElement(durationBinaryExpression);
				if (result == null) result = caseExtensibleElement(durationBinaryExpression);
				if (result == null) result = caseElement(durationBinaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractGuard(AbstractGuard object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuard(Guard object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventGuard(EventGuard object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalGuard(TemporalGuard object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanExpression(BooleanExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanUnaryExpression(BooleanUnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanBinaryExpression(BooleanBinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericExpression(NumericExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericUnaryExpression(NumericUnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericBinaryExpression(NumericBinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Comparison Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Comparison Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericComparisonExpression(NumericComparisonExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Computation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Computation Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericComputationExpression(
			NumericComputationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventExpression(EventExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventUnaryExpression(EventUnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBinaryExpression(EventBinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurationExpression(DurationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurationUnaryExpression(DurationUnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurationBinaryExpression(DurationBinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extensible Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extensible Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensibleElement(ExtensibleElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNamedElement(AbstractNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traceable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traceable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceableElement(TraceableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publishable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publishable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublishableElement(PublishableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capella Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capella Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapellaElement(CapellaElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ExpressionSwitch
