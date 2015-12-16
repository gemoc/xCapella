package com.thalesgroup.trt.mde.vp.time.time.impl;

import com.thalesgroup.trt.mde.vp.time.time.Instant;
import com.thalesgroup.trt.mde.vp.time.time.Span;
import com.thalesgroup.trt.mde.vp.time.time.TimePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Span</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.impl.SpanImpl#getBegin <em>Begin</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.impl.SpanImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpanImpl extends DurationImpl implements Span {

	/**
	 * The cached value of the '{@link #getBegin() <em>Begin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegin()
	 * @generated
	 * @ordered
	 */
	protected Instant begin;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Instant end;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpanImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimePackage.Literals.SPAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Instant getBegin() {

		return begin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetBegin(Instant newBegin,
			NotificationChain msgs) {

		Instant oldBegin = begin;
		begin = newBegin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TimePackage.SPAN__BEGIN, oldBegin,
					newBegin);
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

	public void setBegin(Instant newBegin) {

		if (newBegin != begin) {
			NotificationChain msgs = null;
			if (begin != null)
				msgs = ((InternalEObject) begin).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TimePackage.SPAN__BEGIN, null,
						msgs);
			if (newBegin != null)
				msgs = ((InternalEObject) newBegin).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TimePackage.SPAN__BEGIN, null,
						msgs);
			msgs = basicSetBegin(newBegin, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TimePackage.SPAN__BEGIN, newBegin, newBegin));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Instant getEnd() {

		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetEnd(Instant newEnd, NotificationChain msgs) {

		Instant oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TimePackage.SPAN__END, oldEnd, newEnd);
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

	public void setEnd(Instant newEnd) {

		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject) end).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TimePackage.SPAN__END, null,
						msgs);
			if (newEnd != null)
				msgs = ((InternalEObject) newEnd).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TimePackage.SPAN__END, null,
						msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TimePackage.SPAN__END, newEnd, newEnd));

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
		case TimePackage.SPAN__BEGIN:
			return basicSetBegin(null, msgs);
		case TimePackage.SPAN__END:
			return basicSetEnd(null, msgs);
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
		case TimePackage.SPAN__BEGIN:
			return getBegin();
		case TimePackage.SPAN__END:
			return getEnd();
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
		case TimePackage.SPAN__BEGIN:
			setBegin((Instant) newValue);
			return;
		case TimePackage.SPAN__END:
			setEnd((Instant) newValue);
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
		case TimePackage.SPAN__BEGIN:
			setBegin((Instant) null);
			return;
		case TimePackage.SPAN__END:
			setEnd((Instant) null);
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
		case TimePackage.SPAN__BEGIN:
			return begin != null;
		case TimePackage.SPAN__END:
			return end != null;
		}
		return super.eIsSet(featureID);
	}

} //SpanImpl