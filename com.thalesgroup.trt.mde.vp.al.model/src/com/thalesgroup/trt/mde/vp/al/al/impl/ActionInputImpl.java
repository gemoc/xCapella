package com.thalesgroup.trt.mde.vp.al.al.impl;

import com.thalesgroup.trt.mde.vp.al.al.Action;
import com.thalesgroup.trt.mde.vp.al.al.ActionInput;
import com.thalesgroup.trt.mde.vp.al.al.AlPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.al.al.impl.ActionInputImpl#getInputCheckingAction <em>Input Checking Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionInputImpl extends NamedElementImpl implements ActionInput {

	/**
	 * The cached value of the '{@link #getInputCheckingAction() <em>Input Checking Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputCheckingAction()
	 * @generated
	 * @ordered
	 */
	protected EList inputCheckingAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionInputImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AlPackage.Literals.ACTION_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputCheckingAction() {

		if (inputCheckingAction == null) {
			inputCheckingAction = new EObjectResolvingEList(Action.class, this,
					AlPackage.ACTION_INPUT__INPUT_CHECKING_ACTION);
		}
		return inputCheckingAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AlPackage.ACTION_INPUT__INPUT_CHECKING_ACTION:
			return getInputCheckingAction();
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
		case AlPackage.ACTION_INPUT__INPUT_CHECKING_ACTION:
			getInputCheckingAction().clear();
			getInputCheckingAction().addAll((Collection) newValue);
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
		case AlPackage.ACTION_INPUT__INPUT_CHECKING_ACTION:
			getInputCheckingAction().clear();
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
		case AlPackage.ACTION_INPUT__INPUT_CHECKING_ACTION:
			return inputCheckingAction != null
					&& !inputCheckingAction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActionInputImpl