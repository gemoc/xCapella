package com.thalesgroup.trt.mde.vp.mode.mode.util;

import com.thalesgroup.trt.mde.vp.mode.mode.*;

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
 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage
 * @generated
 */
public class ModeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeSwitch() {
		if (modelPackage == null) {
			modelPackage = ModePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
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
		case ModePackage.MODE_MACHINE: {
			ModeMachine modeMachine = (ModeMachine) theEObject;
			T result = caseModeMachine(modeMachine);
			if (result == null)
				result = caseNamedElement(modeMachine);
			if (result == null)
				result = caseElementExtension(modeMachine);
			if (result == null)
				result = caseAbstractNamedElement(modeMachine);
			if (result == null)
				result = caseCapellaElement(modeMachine);
			if (result == null)
				result = caseTraceableElement(modeMachine);
			if (result == null)
				result = casePublishableElement(modeMachine);
			if (result == null)
				result = caseModelElement(modeMachine);
			if (result == null)
				result = caseExtensibleElement(modeMachine);
			if (result == null)
				result = caseElement(modeMachine);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModePackage.ABSTRACT_MODE: {
			AbstractMode abstractMode = (AbstractMode) theEObject;
			T result = caseAbstractMode(abstractMode);
			if (result == null)
				result = caseNamedElement(abstractMode);
			if (result == null)
				result = caseAbstractNamedElement(abstractMode);
			if (result == null)
				result = caseCapellaElement(abstractMode);
			if (result == null)
				result = caseTraceableElement(abstractMode);
			if (result == null)
				result = casePublishableElement(abstractMode);
			if (result == null)
				result = caseModelElement(abstractMode);
			if (result == null)
				result = caseExtensibleElement(abstractMode);
			if (result == null)
				result = caseElement(abstractMode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModePackage.MODE_: {
			Mode_ mode_ = (Mode_) theEObject;
			T result = caseMode_(mode_);
			if (result == null)
				result = caseAbstractMode(mode_);
			if (result == null)
				result = caseNamedElement(mode_);
			if (result == null)
				result = caseAbstractNamedElement(mode_);
			if (result == null)
				result = caseCapellaElement(mode_);
			if (result == null)
				result = caseTraceableElement(mode_);
			if (result == null)
				result = casePublishableElement(mode_);
			if (result == null)
				result = caseModelElement(mode_);
			if (result == null)
				result = caseExtensibleElement(mode_);
			if (result == null)
				result = caseElement(mode_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModePackage.CONTROL_NODE: {
			ControlNode controlNode = (ControlNode) theEObject;
			T result = caseControlNode(controlNode);
			if (result == null)
				result = caseAbstractMode(controlNode);
			if (result == null)
				result = caseNamedElement(controlNode);
			if (result == null)
				result = caseAbstractNamedElement(controlNode);
			if (result == null)
				result = caseCapellaElement(controlNode);
			if (result == null)
				result = caseTraceableElement(controlNode);
			if (result == null)
				result = casePublishableElement(controlNode);
			if (result == null)
				result = caseModelElement(controlNode);
			if (result == null)
				result = caseExtensibleElement(controlNode);
			if (result == null)
				result = caseElement(controlNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModePackage.INITIAL: {
			Initial initial = (Initial) theEObject;
			T result = caseInitial(initial);
			if (result == null)
				result = caseControlNode(initial);
			if (result == null)
				result = caseAbstractMode(initial);
			if (result == null)
				result = caseNamedElement(initial);
			if (result == null)
				result = caseAbstractNamedElement(initial);
			if (result == null)
				result = caseCapellaElement(initial);
			if (result == null)
				result = caseTraceableElement(initial);
			if (result == null)
				result = casePublishableElement(initial);
			if (result == null)
				result = caseModelElement(initial);
			if (result == null)
				result = caseExtensibleElement(initial);
			if (result == null)
				result = caseElement(initial);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModePackage.FINAL: {
			Final final_ = (Final) theEObject;
			T result = caseFinal(final_);
			if (result == null)
				result = caseControlNode(final_);
			if (result == null)
				result = caseAbstractMode(final_);
			if (result == null)
				result = caseNamedElement(final_);
			if (result == null)
				result = caseAbstractNamedElement(final_);
			if (result == null)
				result = caseCapellaElement(final_);
			if (result == null)
				result = caseTraceableElement(final_);
			if (result == null)
				result = casePublishableElement(final_);
			if (result == null)
				result = caseModelElement(final_);
			if (result == null)
				result = caseExtensibleElement(final_);
			if (result == null)
				result = caseElement(final_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModePackage.TRANSITION_JUNCTION: {
			TransitionJunction transitionJunction = (TransitionJunction) theEObject;
			T result = caseTransitionJunction(transitionJunction);
			if (result == null)
				result = caseControlNode(transitionJunction);
			if (result == null)
				result = caseAbstractMode(transitionJunction);
			if (result == null)
				result = caseNamedElement(transitionJunction);
			if (result == null)
				result = caseAbstractNamedElement(transitionJunction);
			if (result == null)
				result = caseCapellaElement(transitionJunction);
			if (result == null)
				result = caseTraceableElement(transitionJunction);
			if (result == null)
				result = casePublishableElement(transitionJunction);
			if (result == null)
				result = caseModelElement(transitionJunction);
			if (result == null)
				result = caseExtensibleElement(transitionJunction);
			if (result == null)
				result = caseElement(transitionJunction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModePackage.HISTORY_NODE: {
			HistoryNode historyNode = (HistoryNode) theEObject;
			T result = caseHistoryNode(historyNode);
			if (result == null)
				result = caseControlNode(historyNode);
			if (result == null)
				result = caseAbstractMode(historyNode);
			if (result == null)
				result = caseNamedElement(historyNode);
			if (result == null)
				result = caseAbstractNamedElement(historyNode);
			if (result == null)
				result = caseCapellaElement(historyNode);
			if (result == null)
				result = caseTraceableElement(historyNode);
			if (result == null)
				result = casePublishableElement(historyNode);
			if (result == null)
				result = caseModelElement(historyNode);
			if (result == null)
				result = caseExtensibleElement(historyNode);
			if (result == null)
				result = caseElement(historyNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModePackage.TRANSITION: {
			Transition transition = (Transition) theEObject;
			T result = caseTransition(transition);
			if (result == null)
				result = caseNamedElement(transition);
			if (result == null)
				result = caseAbstractNamedElement(transition);
			if (result == null)
				result = caseCapellaElement(transition);
			if (result == null)
				result = caseTraceableElement(transition);
			if (result == null)
				result = casePublishableElement(transition);
			if (result == null)
				result = caseModelElement(transition);
			if (result == null)
				result = caseExtensibleElement(transition);
			if (result == null)
				result = caseElement(transition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeMachine(ModeMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMode(AbstractMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMode_(Mode_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlNode(ControlNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitial(Initial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinal(Final object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Junction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Junction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionJunction(TransitionJunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryNode(HistoryNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
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

} //ModeSwitch
