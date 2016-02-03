package com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl;

import com.thalesgroup.trt.mde.vp.mode.mode.Transition;

import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.EventRuntimeData;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ModeSimulationPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Runtime Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.EventRuntimeDataImpl#getSollicitingTransitions <em>Solliciting Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventRuntimeDataImpl extends NamedElementImpl implements
		EventRuntimeData {

	/**
	 * The cached value of the '{@link #getSollicitingTransitions() <em>Solliciting Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSollicitingTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> sollicitingTransitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventRuntimeDataImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeSimulationPackage.Literals.EVENT_RUNTIME_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Transition> getSollicitingTransitions() {

		if (sollicitingTransitions == null) {
			sollicitingTransitions = new EObjectResolvingEList<Transition>(
					Transition.class,
					this,
					ModeSimulationPackage.EVENT_RUNTIME_DATA__SOLLICITING_TRANSITIONS);
		}
		return sollicitingTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String occurs() {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModeSimulationPackage.EVENT_RUNTIME_DATA__SOLLICITING_TRANSITIONS:
			return getSollicitingTransitions();
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
		case ModeSimulationPackage.EVENT_RUNTIME_DATA__SOLLICITING_TRANSITIONS:
			getSollicitingTransitions().clear();
			getSollicitingTransitions().addAll(
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
		case ModeSimulationPackage.EVENT_RUNTIME_DATA__SOLLICITING_TRANSITIONS:
			getSollicitingTransitions().clear();
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
		case ModeSimulationPackage.EVENT_RUNTIME_DATA__SOLLICITING_TRANSITIONS:
			return sollicitingTransitions != null
					&& !sollicitingTransitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EventRuntimeDataImpl