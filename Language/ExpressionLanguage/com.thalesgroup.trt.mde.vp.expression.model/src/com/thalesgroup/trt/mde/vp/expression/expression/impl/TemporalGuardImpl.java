

package com.thalesgroup.trt.mde.vp.expression.expression.impl;

import com.thalesgroup.trt.mde.vp.expression.expression.DurationExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage;
import com.thalesgroup.trt.mde.vp.expression.expression.TemporalGuard;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporal Guard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.impl.TemporalGuardImpl#getAfterDuration <em>After Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemporalGuardImpl extends AbstractGuardImpl implements TemporalGuard
{

	/**
	 * The cached value of the '{@link #getAfterDuration() <em>After Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterDuration()
	 * @generated
	 * @ordered
	 */
	protected DurationExpression afterDuration;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalGuardImpl()
	{

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ExpressionPackage.Literals.TEMPORAL_GUARD;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public DurationExpression getAfterDuration()
	{

		return afterDuration;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetAfterDuration(DurationExpression newAfterDuration, NotificationChain msgs)
	{

		DurationExpression oldAfterDuration = afterDuration;
		afterDuration = newAfterDuration;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.TEMPORAL_GUARD__AFTER_DURATION, oldAfterDuration, newAfterDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setAfterDuration(DurationExpression newAfterDuration)
	{

		if (newAfterDuration != afterDuration)
		{
			NotificationChain msgs = null;
			if (afterDuration != null)
				msgs = ((InternalEObject)afterDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.TEMPORAL_GUARD__AFTER_DURATION, null, msgs);
			if (newAfterDuration != null)
				msgs = ((InternalEObject)newAfterDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.TEMPORAL_GUARD__AFTER_DURATION, null, msgs);
			msgs = basicSetAfterDuration(newAfterDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.TEMPORAL_GUARD__AFTER_DURATION, newAfterDuration, newAfterDuration));

	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ExpressionPackage.TEMPORAL_GUARD__AFTER_DURATION:
				return basicSetAfterDuration(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case ExpressionPackage.TEMPORAL_GUARD__AFTER_DURATION:
				return getAfterDuration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case ExpressionPackage.TEMPORAL_GUARD__AFTER_DURATION:
					setAfterDuration((DurationExpression)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case ExpressionPackage.TEMPORAL_GUARD__AFTER_DURATION:
				setAfterDuration((DurationExpression)null);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case ExpressionPackage.TEMPORAL_GUARD__AFTER_DURATION:
				return afterDuration != null;
		}
		return super.eIsSet(featureID);
	}



} //TemporalGuardImpl