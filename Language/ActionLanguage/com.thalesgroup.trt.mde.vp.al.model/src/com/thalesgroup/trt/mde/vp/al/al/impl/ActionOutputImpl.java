package com.thalesgroup.trt.mde.vp.al.al.impl;

import com.thalesgroup.trt.mde.vp.al.al.Action;
import com.thalesgroup.trt.mde.vp.al.al.ActionOutput;
import com.thalesgroup.trt.mde.vp.al.al.AlPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.al.al.impl.ActionOutputImpl#getOutputCheckingAction <em>Output Checking Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionOutputImpl extends NamedElementImpl implements ActionOutput {

	/**
	 * The cached value of the '{@link #getOutputCheckingAction() <em>Output Checking Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputCheckingAction()
	 * @generated
	 * @ordered
	 */
	protected EList outputCheckingAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionOutputImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AlPackage.Literals.ACTION_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutputCheckingAction() {

		if (outputCheckingAction == null) {
			outputCheckingAction = new EObjectResolvingEList(Action.class, this,
					AlPackage.ACTION_OUTPUT__OUTPUT_CHECKING_ACTION);
		}
		return outputCheckingAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AlPackage.ACTION_OUTPUT__OUTPUT_CHECKING_ACTION:
			return getOutputCheckingAction();
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
		case AlPackage.ACTION_OUTPUT__OUTPUT_CHECKING_ACTION:
			getOutputCheckingAction().clear();
			getOutputCheckingAction().addAll((Collection) newValue);
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
		case AlPackage.ACTION_OUTPUT__OUTPUT_CHECKING_ACTION:
			getOutputCheckingAction().clear();
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
		case AlPackage.ACTION_OUTPUT__OUTPUT_CHECKING_ACTION:
			return outputCheckingAction != null && !outputCheckingAction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActionOutputImpl