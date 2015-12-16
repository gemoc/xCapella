package com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.util;

import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.*;

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
import org.polarsys.kitalpha.emde.model.ElementExtension;
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
 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ModeSimulationPackage
 * @generated
 */
public class ModeSimulationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModeSimulationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeSimulationSwitch() {
		if (modelPackage == null) {
			modelPackage = ModeSimulationPackage.eINSTANCE;
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
		switch (classifierID) {
		case ModeSimulationPackage.TRANSITION_RUNTIME_DATA: {
			TransitionRuntimeData transitionRuntimeData = (TransitionRuntimeData) theEObject;
			T result = caseTransitionRuntimeData(transitionRuntimeData);
			if (result == null)
				result = caseNamedElement(transitionRuntimeData);
			if (result == null)
				result = caseElementExtension(transitionRuntimeData);
			if (result == null)
				result = caseAbstractNamedElement(transitionRuntimeData);
			if (result == null)
				result = caseCapellaElement(transitionRuntimeData);
			if (result == null)
				result = caseTraceableElement(transitionRuntimeData);
			if (result == null)
				result = casePublishableElement(transitionRuntimeData);
			if (result == null)
				result = caseModelElement(transitionRuntimeData);
			if (result == null)
				result = caseExtensibleElement(transitionRuntimeData);
			if (result == null)
				result = caseElement(transitionRuntimeData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModeSimulationPackage.MODE_RUNTIME_DATA: {
			ModeRuntimeData modeRuntimeData = (ModeRuntimeData) theEObject;
			T result = caseModeRuntimeData(modeRuntimeData);
			if (result == null)
				result = caseNamedElement(modeRuntimeData);
			if (result == null)
				result = caseElementExtension(modeRuntimeData);
			if (result == null)
				result = caseAbstractNamedElement(modeRuntimeData);
			if (result == null)
				result = caseCapellaElement(modeRuntimeData);
			if (result == null)
				result = caseTraceableElement(modeRuntimeData);
			if (result == null)
				result = casePublishableElement(modeRuntimeData);
			if (result == null)
				result = caseModelElement(modeRuntimeData);
			if (result == null)
				result = caseExtensibleElement(modeRuntimeData);
			if (result == null)
				result = caseElement(modeRuntimeData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModeSimulationPackage.GUARD_RUNTIME_DATA: {
			GuardRuntimeData guardRuntimeData = (GuardRuntimeData) theEObject;
			T result = caseGuardRuntimeData(guardRuntimeData);
			if (result == null)
				result = caseNamedElement(guardRuntimeData);
			if (result == null)
				result = caseElementExtension(guardRuntimeData);
			if (result == null)
				result = caseAbstractNamedElement(guardRuntimeData);
			if (result == null)
				result = caseCapellaElement(guardRuntimeData);
			if (result == null)
				result = caseTraceableElement(guardRuntimeData);
			if (result == null)
				result = casePublishableElement(guardRuntimeData);
			if (result == null)
				result = caseModelElement(guardRuntimeData);
			if (result == null)
				result = caseExtensibleElement(guardRuntimeData);
			if (result == null)
				result = caseElement(guardRuntimeData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModeSimulationPackage.MACHINE_RUNTIME_DATA: {
			MachineRuntimeData machineRuntimeData = (MachineRuntimeData) theEObject;
			T result = caseMachineRuntimeData(machineRuntimeData);
			if (result == null)
				result = caseNamedElement(machineRuntimeData);
			if (result == null)
				result = caseElementExtension(machineRuntimeData);
			if (result == null)
				result = caseAbstractNamedElement(machineRuntimeData);
			if (result == null)
				result = caseCapellaElement(machineRuntimeData);
			if (result == null)
				result = caseTraceableElement(machineRuntimeData);
			if (result == null)
				result = casePublishableElement(machineRuntimeData);
			if (result == null)
				result = caseModelElement(machineRuntimeData);
			if (result == null)
				result = caseExtensibleElement(machineRuntimeData);
			if (result == null)
				result = caseElement(machineRuntimeData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModeSimulationPackage.COMPONENT_RUNTIME_DATA: {
			ComponentRuntimeData componentRuntimeData = (ComponentRuntimeData) theEObject;
			T result = caseComponentRuntimeData(componentRuntimeData);
			if (result == null)
				result = caseNamedElement(componentRuntimeData);
			if (result == null)
				result = caseElementExtension(componentRuntimeData);
			if (result == null)
				result = caseAbstractNamedElement(componentRuntimeData);
			if (result == null)
				result = caseCapellaElement(componentRuntimeData);
			if (result == null)
				result = caseTraceableElement(componentRuntimeData);
			if (result == null)
				result = casePublishableElement(componentRuntimeData);
			if (result == null)
				result = caseModelElement(componentRuntimeData);
			if (result == null)
				result = caseExtensibleElement(componentRuntimeData);
			if (result == null)
				result = caseElement(componentRuntimeData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModeSimulationPackage.FUNCTION_RUNTIME_DATA: {
			FunctionRuntimeData functionRuntimeData = (FunctionRuntimeData) theEObject;
			T result = caseFunctionRuntimeData(functionRuntimeData);
			if (result == null)
				result = caseNamedElement(functionRuntimeData);
			if (result == null)
				result = caseElementExtension(functionRuntimeData);
			if (result == null)
				result = caseAbstractNamedElement(functionRuntimeData);
			if (result == null)
				result = caseCapellaElement(functionRuntimeData);
			if (result == null)
				result = caseTraceableElement(functionRuntimeData);
			if (result == null)
				result = casePublishableElement(functionRuntimeData);
			if (result == null)
				result = caseModelElement(functionRuntimeData);
			if (result == null)
				result = caseExtensibleElement(functionRuntimeData);
			if (result == null)
				result = caseElement(functionRuntimeData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModeSimulationPackage.FUNCTIONAL_CHAIN_RUNTIME_DATA: {
			FunctionalChainRuntimeData functionalChainRuntimeData = (FunctionalChainRuntimeData) theEObject;
			T result = caseFunctionalChainRuntimeData(functionalChainRuntimeData);
			if (result == null)
				result = caseNamedElement(functionalChainRuntimeData);
			if (result == null)
				result = caseElementExtension(functionalChainRuntimeData);
			if (result == null)
				result = caseAbstractNamedElement(functionalChainRuntimeData);
			if (result == null)
				result = caseCapellaElement(functionalChainRuntimeData);
			if (result == null)
				result = caseTraceableElement(functionalChainRuntimeData);
			if (result == null)
				result = casePublishableElement(functionalChainRuntimeData);
			if (result == null)
				result = caseModelElement(functionalChainRuntimeData);
			if (result == null)
				result = caseExtensibleElement(functionalChainRuntimeData);
			if (result == null)
				result = caseElement(functionalChainRuntimeData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModeSimulationPackage.EXPRESSION_RUNTIME_DATA: {
			ExpressionRuntimeData expressionRuntimeData = (ExpressionRuntimeData) theEObject;
			T result = caseExpressionRuntimeData(expressionRuntimeData);
			if (result == null)
				result = caseNamedElement(expressionRuntimeData);
			if (result == null)
				result = caseElementExtension(expressionRuntimeData);
			if (result == null)
				result = caseAbstractNamedElement(expressionRuntimeData);
			if (result == null)
				result = caseCapellaElement(expressionRuntimeData);
			if (result == null)
				result = caseTraceableElement(expressionRuntimeData);
			if (result == null)
				result = casePublishableElement(expressionRuntimeData);
			if (result == null)
				result = caseModelElement(expressionRuntimeData);
			if (result == null)
				result = caseExtensibleElement(expressionRuntimeData);
			if (result == null)
				result = caseElement(expressionRuntimeData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModeSimulationPackage.CLOCK_RUNTIME_DATA: {
			ClockRuntimeData clockRuntimeData = (ClockRuntimeData) theEObject;
			T result = caseClockRuntimeData(clockRuntimeData);
			if (result == null)
				result = caseNamedElement(clockRuntimeData);
			if (result == null)
				result = caseElementExtension(clockRuntimeData);
			if (result == null)
				result = caseAbstractNamedElement(clockRuntimeData);
			if (result == null)
				result = caseCapellaElement(clockRuntimeData);
			if (result == null)
				result = caseTraceableElement(clockRuntimeData);
			if (result == null)
				result = casePublishableElement(clockRuntimeData);
			if (result == null)
				result = caseModelElement(clockRuntimeData);
			if (result == null)
				result = caseExtensibleElement(clockRuntimeData);
			if (result == null)
				result = caseElement(clockRuntimeData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModeSimulationPackage.EVENT_RUNTIME_DATA: {
			EventRuntimeData eventRuntimeData = (EventRuntimeData) theEObject;
			T result = caseEventRuntimeData(eventRuntimeData);
			if (result == null)
				result = caseNamedElement(eventRuntimeData);
			if (result == null)
				result = caseElementExtension(eventRuntimeData);
			if (result == null)
				result = caseAbstractNamedElement(eventRuntimeData);
			if (result == null)
				result = caseCapellaElement(eventRuntimeData);
			if (result == null)
				result = caseTraceableElement(eventRuntimeData);
			if (result == null)
				result = casePublishableElement(eventRuntimeData);
			if (result == null)
				result = caseModelElement(eventRuntimeData);
			if (result == null)
				result = caseExtensibleElement(eventRuntimeData);
			if (result == null)
				result = caseElement(eventRuntimeData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModeSimulationPackage.ACTION_RUNTIME_DATA: {
			ActionRuntimeData actionRuntimeData = (ActionRuntimeData) theEObject;
			T result = caseActionRuntimeData(actionRuntimeData);
			if (result == null)
				result = caseNamedElement(actionRuntimeData);
			if (result == null)
				result = caseElementExtension(actionRuntimeData);
			if (result == null)
				result = caseAbstractNamedElement(actionRuntimeData);
			if (result == null)
				result = caseCapellaElement(actionRuntimeData);
			if (result == null)
				result = caseTraceableElement(actionRuntimeData);
			if (result == null)
				result = casePublishableElement(actionRuntimeData);
			if (result == null)
				result = caseModelElement(actionRuntimeData);
			if (result == null)
				result = caseExtensibleElement(actionRuntimeData);
			if (result == null)
				result = caseElement(actionRuntimeData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Runtime Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Runtime Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionRuntimeData(TransitionRuntimeData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Runtime Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Runtime Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeRuntimeData(ModeRuntimeData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guard Runtime Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guard Runtime Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuardRuntimeData(GuardRuntimeData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine Runtime Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine Runtime Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachineRuntimeData(MachineRuntimeData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Runtime Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Runtime Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentRuntimeData(ComponentRuntimeData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Runtime Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Runtime Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionRuntimeData(FunctionRuntimeData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Chain Runtime Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Chain Runtime Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalChainRuntimeData(FunctionalChainRuntimeData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Runtime Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Runtime Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionRuntimeData(ExpressionRuntimeData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Runtime Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Runtime Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClockRuntimeData(ClockRuntimeData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Runtime Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Runtime Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventRuntimeData(EventRuntimeData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Runtime Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Runtime Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionRuntimeData(ActionRuntimeData object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Element Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementExtension(ElementExtension object) {
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

} //ModeSimulationSwitch
