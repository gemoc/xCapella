package com.thalesgroup.trt.mde.vp.mode.mode.impl;

import com.thalesgroup.trt.mde.vp.expression.expression.Variable;

import com.thalesgroup.trt.mde.vp.mode.mode.AbstractMode;
import com.thalesgroup.trt.mde.vp.mode.mode.Initial;
import com.thalesgroup.trt.mde.vp.mode.mode.ModeMachine;
import com.thalesgroup.trt.mde.vp.mode.mode.ModePackage;
import com.thalesgroup.trt.mde.vp.mode.mode.Transition;

import com.thalesgroup.trt.mde.vp.time.time.Clock;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.common.data.behavior.AbstractEvent;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.core.data.information.communication.Signal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.impl.ModeMachineImpl#getOwnedModes <em>Owned Modes</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.impl.ModeMachineImpl#getOwnedTransitions <em>Owned Transitions</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.impl.ModeMachineImpl#getInputEvents <em>Input Events</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.impl.ModeMachineImpl#getInputSignals <em>Input Signals</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.impl.ModeMachineImpl#getOutputEvents <em>Output Events</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.impl.ModeMachineImpl#getOutputSignals <em>Output Signals</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.impl.ModeMachineImpl#getLocalClocks <em>Local Clocks</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.impl.ModeMachineImpl#getLocalVariables <em>Local Variables</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.impl.ModeMachineImpl#getInitial <em>Initial</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModeMachineImpl extends NamedElementImpl implements ModeMachine {

	/**
	 * The cached value of the '{@link #getOwnedModes() <em>Owned Modes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedModes()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractMode> ownedModes;

	/**
	 * The cached value of the '{@link #getOwnedTransitions() <em>Owned Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> ownedTransitions;

	/**
	 * The cached value of the '{@link #getInputEvents() <em>Input Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractEvent> inputEvents;

	/**
	 * The cached value of the '{@link #getInputSignals() <em>Input Signals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputSignals()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal> inputSignals;

	/**
	 * The cached value of the '{@link #getOutputEvents() <em>Output Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractEvent> outputEvents;

	/**
	 * The cached value of the '{@link #getOutputSignals() <em>Output Signals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputSignals()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal> outputSignals;

	/**
	 * The cached value of the '{@link #getLocalClocks() <em>Local Clocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalClocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Clock> localClocks;

	/**
	 * The cached value of the '{@link #getLocalVariables() <em>Local Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> localVariables;

	/**
	 * The cached value of the '{@link #getInitial() <em>Initial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial()
	 * @generated
	 * @ordered
	 */
	protected Initial initial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeMachineImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModePackage.Literals.MODE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<AbstractMode> getOwnedModes() {

		if (ownedModes == null) {
			ownedModes = new EObjectContainmentEList<AbstractMode>(AbstractMode.class, this,
					ModePackage.MODE_MACHINE__OWNED_MODES);
		}
		return ownedModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Transition> getOwnedTransitions() {

		if (ownedTransitions == null) {
			ownedTransitions = new EObjectContainmentEList<Transition>(Transition.class, this,
					ModePackage.MODE_MACHINE__OWNED_TRANSITIONS);
		}
		return ownedTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<AbstractEvent> getInputEvents() {

		if (inputEvents == null) {
			inputEvents = new EObjectResolvingEList<AbstractEvent>(AbstractEvent.class, this,
					ModePackage.MODE_MACHINE__INPUT_EVENTS);
		}
		return inputEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Signal> getInputSignals() {

		if (inputSignals == null) {
			inputSignals = new EObjectResolvingEList<Signal>(Signal.class, this,
					ModePackage.MODE_MACHINE__INPUT_SIGNALS);
		}
		return inputSignals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<AbstractEvent> getOutputEvents() {

		if (outputEvents == null) {
			outputEvents = new EObjectResolvingEList<AbstractEvent>(AbstractEvent.class, this,
					ModePackage.MODE_MACHINE__OUTPUT_EVENTS);
		}
		return outputEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Signal> getOutputSignals() {

		if (outputSignals == null) {
			outputSignals = new EObjectResolvingEList<Signal>(Signal.class, this,
					ModePackage.MODE_MACHINE__OUTPUT_SIGNALS);
		}
		return outputSignals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Clock> getLocalClocks() {

		if (localClocks == null) {
			localClocks = new EObjectContainmentEList<Clock>(Clock.class, this, ModePackage.MODE_MACHINE__LOCAL_CLOCKS);
		}
		return localClocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Variable> getLocalVariables() {

		if (localVariables == null) {
			localVariables = new EObjectContainmentEList<Variable>(Variable.class, this,
					ModePackage.MODE_MACHINE__LOCAL_VARIABLES);
		}
		return localVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Initial getInitial() {

		if (initial != null && initial.eIsProxy()) {
			InternalEObject oldInitial = (InternalEObject) initial;
			initial = (Initial) eResolveProxy(oldInitial);
			if (initial != oldInitial) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModePackage.MODE_MACHINE__INITIAL,
							oldInitial, initial));
			}
		}
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Initial basicGetInitial() {

		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setInitial(Initial newInitial) {

		Initial oldInitial = initial;
		initial = newInitial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModePackage.MODE_MACHINE__INITIAL, oldInitial,
					initial));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModePackage.MODE_MACHINE__OWNED_MODES:
			return ((InternalEList<?>) getOwnedModes()).basicRemove(otherEnd, msgs);
		case ModePackage.MODE_MACHINE__OWNED_TRANSITIONS:
			return ((InternalEList<?>) getOwnedTransitions()).basicRemove(otherEnd, msgs);
		case ModePackage.MODE_MACHINE__LOCAL_CLOCKS:
			return ((InternalEList<?>) getLocalClocks()).basicRemove(otherEnd, msgs);
		case ModePackage.MODE_MACHINE__LOCAL_VARIABLES:
			return ((InternalEList<?>) getLocalVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModePackage.MODE_MACHINE__OWNED_MODES:
			return getOwnedModes();
		case ModePackage.MODE_MACHINE__OWNED_TRANSITIONS:
			return getOwnedTransitions();
		case ModePackage.MODE_MACHINE__INPUT_EVENTS:
			return getInputEvents();
		case ModePackage.MODE_MACHINE__INPUT_SIGNALS:
			return getInputSignals();
		case ModePackage.MODE_MACHINE__OUTPUT_EVENTS:
			return getOutputEvents();
		case ModePackage.MODE_MACHINE__OUTPUT_SIGNALS:
			return getOutputSignals();
		case ModePackage.MODE_MACHINE__LOCAL_CLOCKS:
			return getLocalClocks();
		case ModePackage.MODE_MACHINE__LOCAL_VARIABLES:
			return getLocalVariables();
		case ModePackage.MODE_MACHINE__INITIAL:
			if (resolve)
				return getInitial();
			return basicGetInitial();
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
		case ModePackage.MODE_MACHINE__OWNED_MODES:
			getOwnedModes().clear();
			getOwnedModes().addAll((Collection<? extends AbstractMode>) newValue);
			return;
		case ModePackage.MODE_MACHINE__OWNED_TRANSITIONS:
			getOwnedTransitions().clear();
			getOwnedTransitions().addAll((Collection<? extends Transition>) newValue);
			return;
		case ModePackage.MODE_MACHINE__INPUT_EVENTS:
			getInputEvents().clear();
			getInputEvents().addAll((Collection<? extends AbstractEvent>) newValue);
			return;
		case ModePackage.MODE_MACHINE__INPUT_SIGNALS:
			getInputSignals().clear();
			getInputSignals().addAll((Collection<? extends Signal>) newValue);
			return;
		case ModePackage.MODE_MACHINE__OUTPUT_EVENTS:
			getOutputEvents().clear();
			getOutputEvents().addAll((Collection<? extends AbstractEvent>) newValue);
			return;
		case ModePackage.MODE_MACHINE__OUTPUT_SIGNALS:
			getOutputSignals().clear();
			getOutputSignals().addAll((Collection<? extends Signal>) newValue);
			return;
		case ModePackage.MODE_MACHINE__LOCAL_CLOCKS:
			getLocalClocks().clear();
			getLocalClocks().addAll((Collection<? extends Clock>) newValue);
			return;
		case ModePackage.MODE_MACHINE__LOCAL_VARIABLES:
			getLocalVariables().clear();
			getLocalVariables().addAll((Collection<? extends Variable>) newValue);
			return;
		case ModePackage.MODE_MACHINE__INITIAL:
			setInitial((Initial) newValue);
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
		case ModePackage.MODE_MACHINE__OWNED_MODES:
			getOwnedModes().clear();
			return;
		case ModePackage.MODE_MACHINE__OWNED_TRANSITIONS:
			getOwnedTransitions().clear();
			return;
		case ModePackage.MODE_MACHINE__INPUT_EVENTS:
			getInputEvents().clear();
			return;
		case ModePackage.MODE_MACHINE__INPUT_SIGNALS:
			getInputSignals().clear();
			return;
		case ModePackage.MODE_MACHINE__OUTPUT_EVENTS:
			getOutputEvents().clear();
			return;
		case ModePackage.MODE_MACHINE__OUTPUT_SIGNALS:
			getOutputSignals().clear();
			return;
		case ModePackage.MODE_MACHINE__LOCAL_CLOCKS:
			getLocalClocks().clear();
			return;
		case ModePackage.MODE_MACHINE__LOCAL_VARIABLES:
			getLocalVariables().clear();
			return;
		case ModePackage.MODE_MACHINE__INITIAL:
			setInitial((Initial) null);
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
		case ModePackage.MODE_MACHINE__OWNED_MODES:
			return ownedModes != null && !ownedModes.isEmpty();
		case ModePackage.MODE_MACHINE__OWNED_TRANSITIONS:
			return ownedTransitions != null && !ownedTransitions.isEmpty();
		case ModePackage.MODE_MACHINE__INPUT_EVENTS:
			return inputEvents != null && !inputEvents.isEmpty();
		case ModePackage.MODE_MACHINE__INPUT_SIGNALS:
			return inputSignals != null && !inputSignals.isEmpty();
		case ModePackage.MODE_MACHINE__OUTPUT_EVENTS:
			return outputEvents != null && !outputEvents.isEmpty();
		case ModePackage.MODE_MACHINE__OUTPUT_SIGNALS:
			return outputSignals != null && !outputSignals.isEmpty();
		case ModePackage.MODE_MACHINE__LOCAL_CLOCKS:
			return localClocks != null && !localClocks.isEmpty();
		case ModePackage.MODE_MACHINE__LOCAL_VARIABLES:
			return localVariables != null && !localVariables.isEmpty();
		case ModePackage.MODE_MACHINE__INITIAL:
			return initial != null;
		}
		return super.eIsSet(featureID);
	}

} //ModeMachineImpl