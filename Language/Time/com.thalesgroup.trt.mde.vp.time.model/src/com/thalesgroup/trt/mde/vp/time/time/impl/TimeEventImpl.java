package com.thalesgroup.trt.mde.vp.time.time.impl;

import com.thalesgroup.trt.mde.vp.time.time.Duration;
import com.thalesgroup.trt.mde.vp.time.time.TimeEvent;
import com.thalesgroup.trt.mde.vp.time.time.TimePackage;
import com.thalesgroup.trt.mde.vp.time.time.TimeValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.common.data.modellingcore.impl.AbstractTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.impl.TimeEventImpl#getWhen <em>When</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.impl.TimeEventImpl#getEvery <em>Every</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.impl.TimeEventImpl#getRepetition <em>Repetition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeEventImpl extends AbstractTypeImpl implements TimeEvent {

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected TimeValue when;

	/**
	 * The cached value of the '{@link #getEvery() <em>Every</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvery()
	 * @generated
	 * @ordered
	 */
	protected Duration every;

	/**
	 * The default value of the '{@link #getRepetition() <em>Repetition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetition()
	 * @generated
	 * @ordered
	 */
	protected static final int REPETITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRepetition() <em>Repetition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetition()
	 * @generated
	 * @ordered
	 */
	protected int repetition = REPETITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeEventImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimePackage.Literals.TIME_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public TimeValue getWhen() {

		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetWhen(TimeValue newWhen,
			NotificationChain msgs) {

		TimeValue oldWhen = when;
		when = newWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TimePackage.TIME_EVENT__WHEN, oldWhen,
					newWhen);
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

	public void setWhen(TimeValue newWhen) {

		if (newWhen != when) {
			NotificationChain msgs = null;
			if (when != null)
				msgs = ((InternalEObject) when).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TimePackage.TIME_EVENT__WHEN,
						null, msgs);
			if (newWhen != null)
				msgs = ((InternalEObject) newWhen).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TimePackage.TIME_EVENT__WHEN,
						null, msgs);
			msgs = basicSetWhen(newWhen, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TimePackage.TIME_EVENT__WHEN, newWhen, newWhen));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Duration getEvery() {

		return every;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetEvery(Duration newEvery,
			NotificationChain msgs) {

		Duration oldEvery = every;
		every = newEvery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TimePackage.TIME_EVENT__EVERY, oldEvery,
					newEvery);
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

	public void setEvery(Duration newEvery) {

		if (newEvery != every) {
			NotificationChain msgs = null;
			if (every != null)
				msgs = ((InternalEObject) every).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TimePackage.TIME_EVENT__EVERY,
						null, msgs);
			if (newEvery != null)
				msgs = ((InternalEObject) newEvery).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TimePackage.TIME_EVENT__EVERY,
						null, msgs);
			msgs = basicSetEvery(newEvery, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TimePackage.TIME_EVENT__EVERY, newEvery, newEvery));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public int getRepetition() {

		return repetition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setRepetition(int newRepetition) {

		int oldRepetition = repetition;
		repetition = newRepetition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TimePackage.TIME_EVENT__REPETITION, oldRepetition,
					repetition));

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
		case TimePackage.TIME_EVENT__WHEN:
			return basicSetWhen(null, msgs);
		case TimePackage.TIME_EVENT__EVERY:
			return basicSetEvery(null, msgs);
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
		case TimePackage.TIME_EVENT__WHEN:
			return getWhen();
		case TimePackage.TIME_EVENT__EVERY:
			return getEvery();
		case TimePackage.TIME_EVENT__REPETITION:
			return getRepetition();
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
		case TimePackage.TIME_EVENT__WHEN:
			setWhen((TimeValue) newValue);
			return;
		case TimePackage.TIME_EVENT__EVERY:
			setEvery((Duration) newValue);
			return;
		case TimePackage.TIME_EVENT__REPETITION:
			setRepetition((Integer) newValue);
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
		case TimePackage.TIME_EVENT__WHEN:
			setWhen((TimeValue) null);
			return;
		case TimePackage.TIME_EVENT__EVERY:
			setEvery((Duration) null);
			return;
		case TimePackage.TIME_EVENT__REPETITION:
			setRepetition(REPETITION_EDEFAULT);
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
		case TimePackage.TIME_EVENT__WHEN:
			return when != null;
		case TimePackage.TIME_EVENT__EVERY:
			return every != null;
		case TimePackage.TIME_EVENT__REPETITION:
			return repetition != REPETITION_EDEFAULT;
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
		result.append(" (repetition: "); //$NON-NLS-1$
		result.append(repetition);
		result.append(')');
		return result.toString();
	}

} //TimeEventImpl