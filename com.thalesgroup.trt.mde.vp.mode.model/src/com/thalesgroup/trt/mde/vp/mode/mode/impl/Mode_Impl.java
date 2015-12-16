package com.thalesgroup.trt.mde.vp.mode.mode.impl;

import com.thalesgroup.trt.mde.vp.al.al.Action;

import com.thalesgroup.trt.mde.vp.mode.mode.ModeMachine;
import com.thalesgroup.trt.mde.vp.mode.mode.ModePackage;
import com.thalesgroup.trt.mde.vp.mode.mode.Mode_;

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

import org.polarsys.capella.core.data.fa.FunctionalChain;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode </b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.impl.Mode_Impl#getEnterActions <em>Enter Actions</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.impl.Mode_Impl#getDoActions <em>Do Actions</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.impl.Mode_Impl#getExitActions <em>Exit Actions</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.impl.Mode_Impl#getAvailableFunctionalChains <em>Available Functional Chains</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.impl.Mode_Impl#getSubModeMachine <em>Sub Mode Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Mode_Impl extends AbstractModeImpl implements Mode_ {

	/**
	 * The cached value of the '{@link #getEnterActions() <em>Enter Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> enterActions;

	/**
	 * The cached value of the '{@link #getDoActions() <em>Do Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> doActions;

	/**
	 * The cached value of the '{@link #getExitActions() <em>Exit Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> exitActions;

	/**
	 * The cached value of the '{@link #getAvailableFunctionalChains() <em>Available Functional Chains</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableFunctionalChains()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalChain> availableFunctionalChains;

	/**
	 * The cached value of the '{@link #getSubModeMachine() <em>Sub Mode Machine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubModeMachine()
	 * @generated
	 * @ordered
	 */
	protected ModeMachine subModeMachine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Mode_Impl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModePackage.Literals.MODE_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Action> getEnterActions() {

		if (enterActions == null) {
			enterActions = new EObjectContainmentEList<Action>(Action.class,
					this, ModePackage.MODE___ENTER_ACTIONS);
		}
		return enterActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Action> getDoActions() {

		if (doActions == null) {
			doActions = new EObjectContainmentEList<Action>(Action.class, this,
					ModePackage.MODE___DO_ACTIONS);
		}
		return doActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Action> getExitActions() {

		if (exitActions == null) {
			exitActions = new EObjectContainmentEList<Action>(Action.class,
					this, ModePackage.MODE___EXIT_ACTIONS);
		}
		return exitActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<FunctionalChain> getAvailableFunctionalChains() {

		if (availableFunctionalChains == null) {
			availableFunctionalChains = new EObjectResolvingEList<FunctionalChain>(
					FunctionalChain.class, this,
					ModePackage.MODE___AVAILABLE_FUNCTIONAL_CHAINS);
		}
		return availableFunctionalChains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public ModeMachine getSubModeMachine() {

		return subModeMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetSubModeMachine(
			ModeMachine newSubModeMachine, NotificationChain msgs) {

		ModeMachine oldSubModeMachine = subModeMachine;
		subModeMachine = newSubModeMachine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, ModePackage.MODE___SUB_MODE_MACHINE,
					oldSubModeMachine, newSubModeMachine);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setSubModeMachine(ModeMachine newSubModeMachine) {

		if (newSubModeMachine != subModeMachine) {
			NotificationChain msgs = null;
			if (subModeMachine != null)
				msgs = ((InternalEObject) subModeMachine).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ModePackage.MODE___SUB_MODE_MACHINE, null,
						msgs);
			if (newSubModeMachine != null)
				msgs = ((InternalEObject) newSubModeMachine).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ModePackage.MODE___SUB_MODE_MACHINE, null,
						msgs);
			msgs = basicSetSubModeMachine(newSubModeMachine, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModePackage.MODE___SUB_MODE_MACHINE, newSubModeMachine,
					newSubModeMachine));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModePackage.MODE___ENTER_ACTIONS:
			return ((InternalEList<?>) getEnterActions()).basicRemove(otherEnd,
					msgs);
		case ModePackage.MODE___DO_ACTIONS:
			return ((InternalEList<?>) getDoActions()).basicRemove(otherEnd,
					msgs);
		case ModePackage.MODE___EXIT_ACTIONS:
			return ((InternalEList<?>) getExitActions()).basicRemove(otherEnd,
					msgs);
		case ModePackage.MODE___SUB_MODE_MACHINE:
			return basicSetSubModeMachine(null, msgs);
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
		case ModePackage.MODE___ENTER_ACTIONS:
			return getEnterActions();
		case ModePackage.MODE___DO_ACTIONS:
			return getDoActions();
		case ModePackage.MODE___EXIT_ACTIONS:
			return getExitActions();
		case ModePackage.MODE___AVAILABLE_FUNCTIONAL_CHAINS:
			return getAvailableFunctionalChains();
		case ModePackage.MODE___SUB_MODE_MACHINE:
			return getSubModeMachine();
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
		case ModePackage.MODE___ENTER_ACTIONS:
			getEnterActions().clear();
			getEnterActions().addAll((Collection<? extends Action>) newValue);
			return;
		case ModePackage.MODE___DO_ACTIONS:
			getDoActions().clear();
			getDoActions().addAll((Collection<? extends Action>) newValue);
			return;
		case ModePackage.MODE___EXIT_ACTIONS:
			getExitActions().clear();
			getExitActions().addAll((Collection<? extends Action>) newValue);
			return;
		case ModePackage.MODE___AVAILABLE_FUNCTIONAL_CHAINS:
			getAvailableFunctionalChains().clear();
			getAvailableFunctionalChains().addAll(
					(Collection<? extends FunctionalChain>) newValue);
			return;
		case ModePackage.MODE___SUB_MODE_MACHINE:
			setSubModeMachine((ModeMachine) newValue);
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
		case ModePackage.MODE___ENTER_ACTIONS:
			getEnterActions().clear();
			return;
		case ModePackage.MODE___DO_ACTIONS:
			getDoActions().clear();
			return;
		case ModePackage.MODE___EXIT_ACTIONS:
			getExitActions().clear();
			return;
		case ModePackage.MODE___AVAILABLE_FUNCTIONAL_CHAINS:
			getAvailableFunctionalChains().clear();
			return;
		case ModePackage.MODE___SUB_MODE_MACHINE:
			setSubModeMachine((ModeMachine) null);
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
		case ModePackage.MODE___ENTER_ACTIONS:
			return enterActions != null && !enterActions.isEmpty();
		case ModePackage.MODE___DO_ACTIONS:
			return doActions != null && !doActions.isEmpty();
		case ModePackage.MODE___EXIT_ACTIONS:
			return exitActions != null && !exitActions.isEmpty();
		case ModePackage.MODE___AVAILABLE_FUNCTIONAL_CHAINS:
			return availableFunctionalChains != null
					&& !availableFunctionalChains.isEmpty();
		case ModePackage.MODE___SUB_MODE_MACHINE:
			return subModeMachine != null;
		}
		return super.eIsSet(featureID);
	}

} //Mode_Impl