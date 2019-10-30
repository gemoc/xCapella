package com.thalesgroup.trt.mde.vp.al.al.impl;

import com.thalesgroup.trt.mde.vp.al.al.ActionInput;
import com.thalesgroup.trt.mde.vp.al.al.AlPackage;
import com.thalesgroup.trt.mde.vp.al.al.CallBehaviorAction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.common.data.behavior.AbstractBehavior;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Behavior Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.al.al.impl.CallBehaviorActionImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.al.al.impl.CallBehaviorActionImpl#getBehavior <em>Behavior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallBehaviorActionImpl extends ActionImpl implements CallBehaviorAction {

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList arguments;

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected AbstractBehavior behavior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallBehaviorActionImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AlPackage.Literals.CALL_BEHAVIOR_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getArguments() {

		if (arguments == null) {
			arguments = new EObjectContainmentEList(ActionInput.class, this, AlPackage.CALL_BEHAVIOR_ACTION__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractBehavior getBehavior() {

		if (behavior != null && behavior.eIsProxy()) {
			InternalEObject oldBehavior = (InternalEObject) behavior;
			behavior = (AbstractBehavior) eResolveProxy(oldBehavior);
			if (behavior != oldBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlPackage.CALL_BEHAVIOR_ACTION__BEHAVIOR,
							oldBehavior, behavior));
			}
		}
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractBehavior basicGetBehavior() {

		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(AbstractBehavior newBehavior) {

		AbstractBehavior oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlPackage.CALL_BEHAVIOR_ACTION__BEHAVIOR, oldBehavior,
					behavior));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AlPackage.CALL_BEHAVIOR_ACTION__ARGUMENTS:
			return ((InternalEList) getArguments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AlPackage.CALL_BEHAVIOR_ACTION__ARGUMENTS:
			return getArguments();
		case AlPackage.CALL_BEHAVIOR_ACTION__BEHAVIOR:
			if (resolve)
				return getBehavior();
			return basicGetBehavior();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AlPackage.CALL_BEHAVIOR_ACTION__ARGUMENTS:
			getArguments().clear();
			getArguments().addAll((Collection) newValue);
			return;
		case AlPackage.CALL_BEHAVIOR_ACTION__BEHAVIOR:
			setBehavior((AbstractBehavior) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
		case AlPackage.CALL_BEHAVIOR_ACTION__ARGUMENTS:
			getArguments().clear();
			return;
		case AlPackage.CALL_BEHAVIOR_ACTION__BEHAVIOR:
			setBehavior((AbstractBehavior) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AlPackage.CALL_BEHAVIOR_ACTION__ARGUMENTS:
			return arguments != null && !arguments.isEmpty();
		case AlPackage.CALL_BEHAVIOR_ACTION__BEHAVIOR:
			return behavior != null;
		}
		return super.eIsSet(featureID);
	}

} //CallBehaviorActionImpl