package com.thalesgroup.trt.mde.vp.time.time.impl;

import com.thalesgroup.trt.mde.vp.time.time.Duration;
import com.thalesgroup.trt.mde.vp.time.time.InstantInterval;
import com.thalesgroup.trt.mde.vp.time.time.TimePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.impl.DurationImpl#getInverval <em>Inverval</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DurationImpl extends TimeValueImpl implements Duration {

	/**
	 * The cached value of the '{@link #getInverval() <em>Inverval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverval()
	 * @generated
	 * @ordered
	 */
	protected InstantInterval inverval;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DurationImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimePackage.Literals.DURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public InstantInterval getInverval() {

		if (inverval != null && inverval.eIsProxy()) {
			InternalEObject oldInverval = (InternalEObject) inverval;
			inverval = (InstantInterval) eResolveProxy(oldInverval);
			if (inverval != oldInverval) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TimePackage.DURATION__INVERVAL, oldInverval,
							inverval));
			}
		}
		return inverval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public InstantInterval basicGetInverval() {

		return inverval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setInverval(InstantInterval newInverval) {

		InstantInterval oldInverval = inverval;
		inverval = newInverval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TimePackage.DURATION__INVERVAL, oldInverval, inverval));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TimePackage.DURATION__INVERVAL:
			if (resolve)
				return getInverval();
			return basicGetInverval();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TimePackage.DURATION__INVERVAL:
			setInverval((InstantInterval) newValue);
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
		case TimePackage.DURATION__INVERVAL:
			setInverval((InstantInterval) null);
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
		case TimePackage.DURATION__INVERVAL:
			return inverval != null;
		}
		return super.eIsSet(featureID);
	}

} //DurationImpl