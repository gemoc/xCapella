package com.thalesgroup.trt.mde.vp.time.time.impl;

import com.thalesgroup.trt.mde.vp.time.time.Duration;
import com.thalesgroup.trt.mde.vp.time.time.Instant;
import com.thalesgroup.trt.mde.vp.time.time.TimePackage;
import com.thalesgroup.trt.mde.vp.time.time.Translation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Translation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.impl.TranslationImpl#getStart <em>Start</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.impl.TranslationImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.impl.TranslationImpl#isIsBackward <em>Is Backward</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TranslationImpl extends InstantImpl implements Translation {

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Instant start;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected Duration offset;

	/**
	 * The default value of the '{@link #isIsBackward() <em>Is Backward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBackward()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BACKWARD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBackward() <em>Is Backward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBackward()
	 * @generated
	 * @ordered
	 */
	protected boolean isBackward = IS_BACKWARD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TranslationImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimePackage.Literals.TRANSLATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Instant getStart() {

		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetStart(Instant newStart,
			NotificationChain msgs) {

		Instant oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TimePackage.TRANSLATION__START, oldStart,
					newStart);
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

	public void setStart(Instant newStart) {

		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject) start)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- TimePackage.TRANSLATION__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject) newStart)
						.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
								- TimePackage.TRANSLATION__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TimePackage.TRANSLATION__START, newStart, newStart));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Duration getOffset() {

		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetOffset(Duration newOffset,
			NotificationChain msgs) {

		Duration oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TimePackage.TRANSLATION__OFFSET,
					oldOffset, newOffset);
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

	public void setOffset(Duration newOffset) {

		if (newOffset != offset) {
			NotificationChain msgs = null;
			if (offset != null)
				msgs = ((InternalEObject) offset).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- TimePackage.TRANSLATION__OFFSET, null, msgs);
			if (newOffset != null)
				msgs = ((InternalEObject) newOffset).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- TimePackage.TRANSLATION__OFFSET, null, msgs);
			msgs = basicSetOffset(newOffset, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TimePackage.TRANSLATION__OFFSET, newOffset, newOffset));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public boolean isIsBackward() {

		return isBackward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setIsBackward(boolean newIsBackward) {

		boolean oldIsBackward = isBackward;
		isBackward = newIsBackward;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TimePackage.TRANSLATION__IS_BACKWARD, oldIsBackward,
					isBackward));

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
		case TimePackage.TRANSLATION__START:
			return basicSetStart(null, msgs);
		case TimePackage.TRANSLATION__OFFSET:
			return basicSetOffset(null, msgs);
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
		case TimePackage.TRANSLATION__START:
			return getStart();
		case TimePackage.TRANSLATION__OFFSET:
			return getOffset();
		case TimePackage.TRANSLATION__IS_BACKWARD:
			return isIsBackward();
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
		case TimePackage.TRANSLATION__START:
			setStart((Instant) newValue);
			return;
		case TimePackage.TRANSLATION__OFFSET:
			setOffset((Duration) newValue);
			return;
		case TimePackage.TRANSLATION__IS_BACKWARD:
			setIsBackward((Boolean) newValue);
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
		case TimePackage.TRANSLATION__START:
			setStart((Instant) null);
			return;
		case TimePackage.TRANSLATION__OFFSET:
			setOffset((Duration) null);
			return;
		case TimePackage.TRANSLATION__IS_BACKWARD:
			setIsBackward(IS_BACKWARD_EDEFAULT);
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
		case TimePackage.TRANSLATION__START:
			return start != null;
		case TimePackage.TRANSLATION__OFFSET:
			return offset != null;
		case TimePackage.TRANSLATION__IS_BACKWARD:
			return isBackward != IS_BACKWARD_EDEFAULT;
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
		result.append(" (isBackward: "); //$NON-NLS-1$
		result.append(isBackward);
		result.append(')');
		return result.toString();
	}

} //TranslationImpl