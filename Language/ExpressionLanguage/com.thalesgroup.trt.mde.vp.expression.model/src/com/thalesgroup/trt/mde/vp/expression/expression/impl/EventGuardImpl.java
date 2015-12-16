

package com.thalesgroup.trt.mde.vp.expression.expression.impl;

import com.thalesgroup.trt.mde.vp.expression.expression.EventExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.EventGuard;
import com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Guard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.impl.EventGuardImpl#getTriggeringEvent <em>Triggering Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventGuardImpl extends AbstractGuardImpl implements EventGuard
{

	/**
	 * The cached value of the '{@link #getTriggeringEvent() <em>Triggering Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggeringEvent()
	 * @generated
	 * @ordered
	 */
	protected EventExpression triggeringEvent;



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventGuardImpl()
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
		return ExpressionPackage.Literals.EVENT_GUARD;
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EventExpression getTriggeringEvent()
	{

		return triggeringEvent;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetTriggeringEvent(EventExpression newTriggeringEvent, NotificationChain msgs)
	{

		EventExpression oldTriggeringEvent = triggeringEvent;
		triggeringEvent = newTriggeringEvent;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.EVENT_GUARD__TRIGGERING_EVENT, oldTriggeringEvent, newTriggeringEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setTriggeringEvent(EventExpression newTriggeringEvent)
	{

		if (newTriggeringEvent != triggeringEvent)
		{
			NotificationChain msgs = null;
			if (triggeringEvent != null)
				msgs = ((InternalEObject)triggeringEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.EVENT_GUARD__TRIGGERING_EVENT, null, msgs);
			if (newTriggeringEvent != null)
				msgs = ((InternalEObject)newTriggeringEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.EVENT_GUARD__TRIGGERING_EVENT, null, msgs);
			msgs = basicSetTriggeringEvent(newTriggeringEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.EVENT_GUARD__TRIGGERING_EVENT, newTriggeringEvent, newTriggeringEvent));

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
			case ExpressionPackage.EVENT_GUARD__TRIGGERING_EVENT:
				return basicSetTriggeringEvent(null, msgs);
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
			case ExpressionPackage.EVENT_GUARD__TRIGGERING_EVENT:
				return getTriggeringEvent();
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
			case ExpressionPackage.EVENT_GUARD__TRIGGERING_EVENT:
					setTriggeringEvent((EventExpression)newValue);
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
			case ExpressionPackage.EVENT_GUARD__TRIGGERING_EVENT:
				setTriggeringEvent((EventExpression)null);
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
			case ExpressionPackage.EVENT_GUARD__TRIGGERING_EVENT:
				return triggeringEvent != null;
		}
		return super.eIsSet(featureID);
	}



} //EventGuardImpl