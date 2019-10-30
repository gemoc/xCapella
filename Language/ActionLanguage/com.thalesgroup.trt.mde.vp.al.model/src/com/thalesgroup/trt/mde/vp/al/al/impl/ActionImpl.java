package com.thalesgroup.trt.mde.vp.al.al.impl;

import com.thalesgroup.trt.mde.vp.al.al.Action;
import com.thalesgroup.trt.mde.vp.al.al.ActionValueOutput;
import com.thalesgroup.trt.mde.vp.al.al.AlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.al.al.impl.ActionImpl#getExecutionSuccess <em>Execution Success</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActionImpl extends NamedElementImpl implements Action {

	/**
	 * The cached value of the '{@link #getExecutionSuccess() <em>Execution Success</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionSuccess()
	 * @generated
	 * @ordered
	 */
	protected ActionValueOutput executionSuccess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AlPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionValueOutput getExecutionSuccess() {

		return executionSuccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutionSuccess(ActionValueOutput newExecutionSuccess, NotificationChain msgs) {

		ActionValueOutput oldExecutionSuccess = executionSuccess;
		executionSuccess = newExecutionSuccess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AlPackage.ACTION__EXECUTION_SUCCESS, oldExecutionSuccess, newExecutionSuccess);
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
	public void setExecutionSuccess(ActionValueOutput newExecutionSuccess) {

		if (newExecutionSuccess != executionSuccess) {
			NotificationChain msgs = null;
			if (executionSuccess != null)
				msgs = ((InternalEObject) executionSuccess).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AlPackage.ACTION__EXECUTION_SUCCESS, null, msgs);
			if (newExecutionSuccess != null)
				msgs = ((InternalEObject) newExecutionSuccess).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AlPackage.ACTION__EXECUTION_SUCCESS, null, msgs);
			msgs = basicSetExecutionSuccess(newExecutionSuccess, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlPackage.ACTION__EXECUTION_SUCCESS,
					newExecutionSuccess, newExecutionSuccess));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AlPackage.ACTION__EXECUTION_SUCCESS:
			return basicSetExecutionSuccess(null, msgs);
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
		case AlPackage.ACTION__EXECUTION_SUCCESS:
			return getExecutionSuccess();
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
		case AlPackage.ACTION__EXECUTION_SUCCESS:
			setExecutionSuccess((ActionValueOutput) newValue);
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
		case AlPackage.ACTION__EXECUTION_SUCCESS:
			setExecutionSuccess((ActionValueOutput) null);
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
		case AlPackage.ACTION__EXECUTION_SUCCESS:
			return executionSuccess != null;
		}
		return super.eIsSet(featureID);
	}

} //ActionImpl