package com.thalesgroup.trt.mde.vp.mode.mode.impl;

import com.thalesgroup.trt.mde.vp.mode.mode.AbstractMode;
import com.thalesgroup.trt.mde.vp.mode.mode.ModePackage;
import com.thalesgroup.trt.mde.vp.mode.mode.Transition;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.impl.AbstractModeImpl#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.impl.AbstractModeImpl#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractModeImpl extends NamedElementImpl implements
		AbstractMode {

	/**
	 * The cached value of the '{@link #getOutgoingTransitions() <em>Outgoing Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outgoingTransitions;

	/**
	 * The cached value of the '{@link #getIncomingTransitions() <em>Incoming Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> incomingTransitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractModeImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModePackage.Literals.ABSTRACT_MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Transition> getOutgoingTransitions() {

		if (outgoingTransitions == null) {
			outgoingTransitions = new EObjectResolvingEList<Transition>(
					Transition.class, this,
					ModePackage.ABSTRACT_MODE__OUTGOING_TRANSITIONS);
		}
		return outgoingTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Transition> getIncomingTransitions() {

		if (incomingTransitions == null) {
			incomingTransitions = new EObjectResolvingEList<Transition>(
					Transition.class, this,
					ModePackage.ABSTRACT_MODE__INCOMING_TRANSITIONS);
		}
		return incomingTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModePackage.ABSTRACT_MODE__OUTGOING_TRANSITIONS:
			return getOutgoingTransitions();
		case ModePackage.ABSTRACT_MODE__INCOMING_TRANSITIONS:
			return getIncomingTransitions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModePackage.ABSTRACT_MODE__OUTGOING_TRANSITIONS:
			getOutgoingTransitions().clear();
			getOutgoingTransitions().addAll(
					(Collection<? extends Transition>) newValue);
			return;
		case ModePackage.ABSTRACT_MODE__INCOMING_TRANSITIONS:
			getIncomingTransitions().clear();
			getIncomingTransitions().addAll(
					(Collection<? extends Transition>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ModePackage.ABSTRACT_MODE__OUTGOING_TRANSITIONS:
			getOutgoingTransitions().clear();
			return;
		case ModePackage.ABSTRACT_MODE__INCOMING_TRANSITIONS:
			getIncomingTransitions().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ModePackage.ABSTRACT_MODE__OUTGOING_TRANSITIONS:
			return outgoingTransitions != null
					&& !outgoingTransitions.isEmpty();
		case ModePackage.ABSTRACT_MODE__INCOMING_TRANSITIONS:
			return incomingTransitions != null
					&& !incomingTransitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractModeImpl