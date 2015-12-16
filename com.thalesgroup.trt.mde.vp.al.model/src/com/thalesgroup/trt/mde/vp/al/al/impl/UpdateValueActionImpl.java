package com.thalesgroup.trt.mde.vp.al.al.impl;

import com.thalesgroup.trt.mde.vp.al.al.ActionValueInput;
import com.thalesgroup.trt.mde.vp.al.al.AlPackage;
import com.thalesgroup.trt.mde.vp.al.al.UpdateValueAction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Value Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.al.al.impl.UpdateValueActionImpl#getUpdateableValue <em>Updateable Value</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.al.al.impl.UpdateValueActionImpl#getNewValue <em>New Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UpdateValueActionImpl extends ActionImpl implements
		UpdateValueAction {

	/**
	 * The cached value of the '{@link #getUpdateableValue() <em>Updateable Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateableValue()
	 * @generated
	 * @ordered
	 */
	protected ActionValueInput updateableValue;

	/**
	 * The cached value of the '{@link #getNewValue() <em>New Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewValue()
	 * @generated
	 * @ordered
	 */
	protected ActionValueInput newValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateValueActionImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AlPackage.Literals.UPDATE_VALUE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionValueInput getUpdateableValue() {

		return updateableValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateableValue(
			ActionValueInput newUpdateableValue, NotificationChain msgs) {

		ActionValueInput oldUpdateableValue = updateableValue;
		updateableValue = newUpdateableValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					AlPackage.UPDATE_VALUE_ACTION__UPDATEABLE_VALUE,
					oldUpdateableValue, newUpdateableValue);
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
	public void setUpdateableValue(ActionValueInput newUpdateableValue) {

		if (newUpdateableValue != updateableValue) {
			NotificationChain msgs = null;
			if (updateableValue != null)
				msgs = ((InternalEObject) updateableValue)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- AlPackage.UPDATE_VALUE_ACTION__UPDATEABLE_VALUE,
								null, msgs);
			if (newUpdateableValue != null)
				msgs = ((InternalEObject) newUpdateableValue)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- AlPackage.UPDATE_VALUE_ACTION__UPDATEABLE_VALUE,
								null, msgs);
			msgs = basicSetUpdateableValue(newUpdateableValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AlPackage.UPDATE_VALUE_ACTION__UPDATEABLE_VALUE,
					newUpdateableValue, newUpdateableValue));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionValueInput getNewValue() {

		return newValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewValue(ActionValueInput newNewValue,
			NotificationChain msgs) {

		ActionValueInput oldNewValue = newValue;
		newValue = newNewValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, AlPackage.UPDATE_VALUE_ACTION__NEW_VALUE,
					oldNewValue, newNewValue);
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
	public void setNewValue(ActionValueInput newNewValue) {

		if (newNewValue != newValue) {
			NotificationChain msgs = null;
			if (newValue != null)
				msgs = ((InternalEObject) newValue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- AlPackage.UPDATE_VALUE_ACTION__NEW_VALUE,
						null, msgs);
			if (newNewValue != null)
				msgs = ((InternalEObject) newNewValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- AlPackage.UPDATE_VALUE_ACTION__NEW_VALUE,
						null, msgs);
			msgs = basicSetNewValue(newNewValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AlPackage.UPDATE_VALUE_ACTION__NEW_VALUE, newNewValue,
					newNewValue));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AlPackage.UPDATE_VALUE_ACTION__UPDATEABLE_VALUE:
			return basicSetUpdateableValue(null, msgs);
		case AlPackage.UPDATE_VALUE_ACTION__NEW_VALUE:
			return basicSetNewValue(null, msgs);
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
		case AlPackage.UPDATE_VALUE_ACTION__UPDATEABLE_VALUE:
			return getUpdateableValue();
		case AlPackage.UPDATE_VALUE_ACTION__NEW_VALUE:
			return getNewValue();
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
		case AlPackage.UPDATE_VALUE_ACTION__UPDATEABLE_VALUE:
			setUpdateableValue((ActionValueInput) newValue);
			return;
		case AlPackage.UPDATE_VALUE_ACTION__NEW_VALUE:
			setNewValue((ActionValueInput) newValue);
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
		case AlPackage.UPDATE_VALUE_ACTION__UPDATEABLE_VALUE:
			setUpdateableValue((ActionValueInput) null);
			return;
		case AlPackage.UPDATE_VALUE_ACTION__NEW_VALUE:
			setNewValue((ActionValueInput) null);
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
		case AlPackage.UPDATE_VALUE_ACTION__UPDATEABLE_VALUE:
			return updateableValue != null;
		case AlPackage.UPDATE_VALUE_ACTION__NEW_VALUE:
			return newValue != null;
		}
		return super.eIsSet(featureID);
	}

} //UpdateValueActionImpl