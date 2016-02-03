package com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl;

import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionRuntimeData;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ModeSimulationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Runtime Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.FunctionRuntimeDataImpl#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.FunctionRuntimeDataImpl#isIsStarted <em>Is Started</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.FunctionRuntimeDataImpl#isIsRunning <em>Is Running</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionRuntimeDataImpl extends NamedElementImpl implements
		FunctionRuntimeData {

	/**
	 * The default value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected boolean isActive = IS_ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsStarted() <em>Is Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStarted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STARTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStarted() <em>Is Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStarted()
	 * @generated
	 * @ordered
	 */
	protected boolean isStarted = IS_STARTED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsRunning() <em>Is Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRunning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RUNNING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRunning() <em>Is Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRunning()
	 * @generated
	 * @ordered
	 */
	protected boolean isRunning = IS_RUNNING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionRuntimeDataImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeSimulationPackage.Literals.FUNCTION_RUNTIME_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isIsActive() {

		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setIsActive(boolean newIsActive) {

		boolean oldIsActive = isActive;
		isActive = newIsActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModeSimulationPackage.FUNCTION_RUNTIME_DATA__IS_ACTIVE,
					oldIsActive, isActive));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isIsStarted() {

		return isStarted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setIsStarted(boolean newIsStarted) {

		boolean oldIsStarted = isStarted;
		isStarted = newIsStarted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModeSimulationPackage.FUNCTION_RUNTIME_DATA__IS_STARTED,
					oldIsStarted, isStarted));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isIsRunning() {

		return isRunning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setIsRunning(boolean newIsRunning) {

		boolean oldIsRunning = isRunning;
		isRunning = newIsRunning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModeSimulationPackage.FUNCTION_RUNTIME_DATA__IS_RUNNING,
					oldIsRunning, isRunning));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String activate() {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String start() {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String run() {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String stop() {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String deactivate() {

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
		case ModeSimulationPackage.FUNCTION_RUNTIME_DATA__IS_ACTIVE:
			return isIsActive();
		case ModeSimulationPackage.FUNCTION_RUNTIME_DATA__IS_STARTED:
			return isIsStarted();
		case ModeSimulationPackage.FUNCTION_RUNTIME_DATA__IS_RUNNING:
			return isIsRunning();
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
		case ModeSimulationPackage.FUNCTION_RUNTIME_DATA__IS_ACTIVE:
			setIsActive((Boolean) newValue);
			return;
		case ModeSimulationPackage.FUNCTION_RUNTIME_DATA__IS_STARTED:
			setIsStarted((Boolean) newValue);
			return;
		case ModeSimulationPackage.FUNCTION_RUNTIME_DATA__IS_RUNNING:
			setIsRunning((Boolean) newValue);
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
		case ModeSimulationPackage.FUNCTION_RUNTIME_DATA__IS_ACTIVE:
			setIsActive(IS_ACTIVE_EDEFAULT);
			return;
		case ModeSimulationPackage.FUNCTION_RUNTIME_DATA__IS_STARTED:
			setIsStarted(IS_STARTED_EDEFAULT);
			return;
		case ModeSimulationPackage.FUNCTION_RUNTIME_DATA__IS_RUNNING:
			setIsRunning(IS_RUNNING_EDEFAULT);
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
		case ModeSimulationPackage.FUNCTION_RUNTIME_DATA__IS_ACTIVE:
			return isActive != IS_ACTIVE_EDEFAULT;
		case ModeSimulationPackage.FUNCTION_RUNTIME_DATA__IS_STARTED:
			return isStarted != IS_STARTED_EDEFAULT;
		case ModeSimulationPackage.FUNCTION_RUNTIME_DATA__IS_RUNNING:
			return isRunning != IS_RUNNING_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isActive: "); //$NON-NLS-1$
		result.append(isActive);
		result.append(", isStarted: "); //$NON-NLS-1$
		result.append(isStarted);
		result.append(", isRunning: "); //$NON-NLS-1$
		result.append(isRunning);
		result.append(')');
		return result.toString();
	}

} //FunctionRuntimeDataImpl