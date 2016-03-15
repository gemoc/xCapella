package com.thalesgroup.trt.mde.vp.time.time.impl;

import com.thalesgroup.trt.mde.vp.time.time.Clock;
import com.thalesgroup.trt.mde.vp.time.time.TimePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clock</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.impl.ClockImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.impl.ClockImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.impl.ClockImpl#getCurrentTime <em>Current Time</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.impl.ClockImpl#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClockImpl extends NamedElementImpl implements Clock {

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected static final float RESOLUTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected float resolution = RESOLUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentTime() <em>Current Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentTime()
	 * @generated
	 * @ordered
	 */
	protected static final double CURRENT_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCurrentTime() <em>Current Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentTime()
	 * @generated
	 * @ordered
	 */
	protected double currentTime = CURRENT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected double max = MAX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimePackage.Literals.CLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public String getUnit() {

		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setUnit(String newUnit) {

		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TimePackage.CLOCK__UNIT, oldUnit, unit));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public float getResolution() {

		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setResolution(float newResolution) {

		float oldResolution = resolution;
		resolution = newResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TimePackage.CLOCK__RESOLUTION, oldResolution, resolution));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public double getCurrentTime() {

		return currentTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setCurrentTime(double newCurrentTime) {

		double oldCurrentTime = currentTime;
		currentTime = newCurrentTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TimePackage.CLOCK__CURRENT_TIME, oldCurrentTime,
					currentTime));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public double getMax() {

		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setMax(double newMax) {

		double oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TimePackage.CLOCK__MAX, oldMax, max));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TimePackage.CLOCK__UNIT:
			return getUnit();
		case TimePackage.CLOCK__RESOLUTION:
			return getResolution();
		case TimePackage.CLOCK__CURRENT_TIME:
			return getCurrentTime();
		case TimePackage.CLOCK__MAX:
			return getMax();
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
		case TimePackage.CLOCK__UNIT:
			setUnit((String) newValue);
			return;
		case TimePackage.CLOCK__RESOLUTION:
			setResolution((Float) newValue);
			return;
		case TimePackage.CLOCK__CURRENT_TIME:
			setCurrentTime((Double) newValue);
			return;
		case TimePackage.CLOCK__MAX:
			setMax((Double) newValue);
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
		case TimePackage.CLOCK__UNIT:
			setUnit(UNIT_EDEFAULT);
			return;
		case TimePackage.CLOCK__RESOLUTION:
			setResolution(RESOLUTION_EDEFAULT);
			return;
		case TimePackage.CLOCK__CURRENT_TIME:
			setCurrentTime(CURRENT_TIME_EDEFAULT);
			return;
		case TimePackage.CLOCK__MAX:
			setMax(MAX_EDEFAULT);
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
		case TimePackage.CLOCK__UNIT:
			return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT
					.equals(unit);
		case TimePackage.CLOCK__RESOLUTION:
			return resolution != RESOLUTION_EDEFAULT;
		case TimePackage.CLOCK__CURRENT_TIME:
			return currentTime != CURRENT_TIME_EDEFAULT;
		case TimePackage.CLOCK__MAX:
			return max != MAX_EDEFAULT;
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
		result.append(" (unit: "); //$NON-NLS-1$
		result.append(unit);
		result.append(", resolution: "); //$NON-NLS-1$
		result.append(resolution);
		result.append(", currentTime: "); //$NON-NLS-1$
		result.append(currentTime);
		result.append(", max: "); //$NON-NLS-1$
		result.append(max);
		result.append(')');
		return result.toString();
	}

} //ClockImpl