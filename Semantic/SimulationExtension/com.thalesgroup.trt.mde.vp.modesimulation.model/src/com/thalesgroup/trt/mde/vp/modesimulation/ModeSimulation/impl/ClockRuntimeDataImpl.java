package com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl;

import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ClockRuntimeData;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ModeSimulationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clock Runtime Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ClockRuntimeDataImpl#getNumberOfTicks <em>Number Of Ticks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClockRuntimeDataImpl extends NamedElementImpl implements
		ClockRuntimeData {

	/**
	 * The default value of the '{@link #getNumberOfTicks() <em>Number Of Ticks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfTicks()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_TICKS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfTicks() <em>Number Of Ticks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfTicks()
	 * @generated
	 * @ordered
	 */
	protected int numberOfTicks = NUMBER_OF_TICKS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockRuntimeDataImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeSimulationPackage.Literals.CLOCK_RUNTIME_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public int getNumberOfTicks() {

		return numberOfTicks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setNumberOfTicks(int newNumberOfTicks) {

		int oldNumberOfTicks = numberOfTicks;
		numberOfTicks = newNumberOfTicks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModeSimulationPackage.CLOCK_RUNTIME_DATA__NUMBER_OF_TICKS,
					oldNumberOfTicks, numberOfTicks));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String ticks() {

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
		case ModeSimulationPackage.CLOCK_RUNTIME_DATA__NUMBER_OF_TICKS:
			return getNumberOfTicks();
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
		case ModeSimulationPackage.CLOCK_RUNTIME_DATA__NUMBER_OF_TICKS:
			setNumberOfTicks((Integer) newValue);
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
		case ModeSimulationPackage.CLOCK_RUNTIME_DATA__NUMBER_OF_TICKS:
			setNumberOfTicks(NUMBER_OF_TICKS_EDEFAULT);
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
		case ModeSimulationPackage.CLOCK_RUNTIME_DATA__NUMBER_OF_TICKS:
			return numberOfTicks != NUMBER_OF_TICKS_EDEFAULT;
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
		result.append(" (numberOfTicks: "); //$NON-NLS-1$
		result.append(numberOfTicks);
		result.append(')');
		return result.toString();
	}

} //ClockRuntimeDataImpl