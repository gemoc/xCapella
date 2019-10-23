package com.thalesgroup.trt.mde.vp.mode.mode.impl;

import com.thalesgroup.trt.mde.vp.al.al.Action;

import com.thalesgroup.trt.mde.vp.expression.expression.AbstractGuard;
import com.thalesgroup.trt.mde.vp.expression.expression.DurationExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.EventExpression;

import com.thalesgroup.trt.mde.vp.mode.mode.AbstractMode;
import com.thalesgroup.trt.mde.vp.mode.mode.ModePackage;
import com.thalesgroup.trt.mde.vp.mode.mode.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.common.data.behavior.AbstractEvent;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.impl.TransitionImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.impl.TransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.impl.TransitionImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.impl.TransitionImpl#getTimeBudget <em>Time Budget</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.impl.TransitionImpl#getGeneratedEvents <em>Generated Events</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.impl.TransitionImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends NamedElementImpl implements Transition {

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected AbstractMode source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected AbstractMode target;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected EventExpression trigger;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected AbstractGuard guard;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getTimeBudget() <em>Time Budget</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeBudget()
	 * @generated
	 * @ordered
	 */
	protected DurationExpression timeBudget;

	/**
	 * The cached value of the '{@link #getGeneratedEvents() <em>Generated Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractEvent> generatedEvents;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModePackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public AbstractMode getSource() {

		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (AbstractMode) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModePackage.TRANSITION__SOURCE, oldSource,
							source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public AbstractMode basicGetSource() {

		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setSource(AbstractMode newSource) {

		AbstractMode oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModePackage.TRANSITION__SOURCE, oldSource, source));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public AbstractMode getTarget() {

		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (AbstractMode) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModePackage.TRANSITION__TARGET, oldTarget,
							target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public AbstractMode basicGetTarget() {

		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setTarget(AbstractMode newTarget) {

		AbstractMode oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModePackage.TRANSITION__TARGET, oldTarget, target));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EventExpression getTrigger() {

		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetTrigger(EventExpression newTrigger, NotificationChain msgs) {

		EventExpression oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ModePackage.TRANSITION__TRIGGER, oldTrigger, newTrigger);
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

	public void setTrigger(EventExpression newTrigger) {

		if (newTrigger != trigger) {
			NotificationChain msgs = null;
			if (trigger != null)
				msgs = ((InternalEObject) trigger).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ModePackage.TRANSITION__TRIGGER, null, msgs);
			if (newTrigger != null)
				msgs = ((InternalEObject) newTrigger).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ModePackage.TRANSITION__TRIGGER, null, msgs);
			msgs = basicSetTrigger(newTrigger, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModePackage.TRANSITION__TRIGGER, newTrigger,
					newTrigger));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public AbstractGuard getGuard() {

		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetGuard(AbstractGuard newGuard, NotificationChain msgs) {

		AbstractGuard oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ModePackage.TRANSITION__GUARD, oldGuard, newGuard);
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

	public void setGuard(AbstractGuard newGuard) {

		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject) guard).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ModePackage.TRANSITION__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject) newGuard).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ModePackage.TRANSITION__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModePackage.TRANSITION__GUARD, newGuard, newGuard));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Action> getActions() {

		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, ModePackage.TRANSITION__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public DurationExpression getTimeBudget() {

		return timeBudget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetTimeBudget(DurationExpression newTimeBudget, NotificationChain msgs) {

		DurationExpression oldTimeBudget = timeBudget;
		timeBudget = newTimeBudget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ModePackage.TRANSITION__TIME_BUDGET, oldTimeBudget, newTimeBudget);
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

	public void setTimeBudget(DurationExpression newTimeBudget) {

		if (newTimeBudget != timeBudget) {
			NotificationChain msgs = null;
			if (timeBudget != null)
				msgs = ((InternalEObject) timeBudget).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ModePackage.TRANSITION__TIME_BUDGET, null, msgs);
			if (newTimeBudget != null)
				msgs = ((InternalEObject) newTimeBudget).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ModePackage.TRANSITION__TIME_BUDGET, null, msgs);
			msgs = basicSetTimeBudget(newTimeBudget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModePackage.TRANSITION__TIME_BUDGET, newTimeBudget,
					newTimeBudget));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<AbstractEvent> getGeneratedEvents() {

		if (generatedEvents == null) {
			generatedEvents = new EObjectResolvingEList<AbstractEvent>(AbstractEvent.class, this,
					ModePackage.TRANSITION__GENERATED_EVENTS);
		}
		return generatedEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public int getPriority() {

		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setPriority(int newPriority) {

		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModePackage.TRANSITION__PRIORITY, oldPriority,
					priority));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModePackage.TRANSITION__TRIGGER:
			return basicSetTrigger(null, msgs);
		case ModePackage.TRANSITION__GUARD:
			return basicSetGuard(null, msgs);
		case ModePackage.TRANSITION__ACTIONS:
			return ((InternalEList<?>) getActions()).basicRemove(otherEnd, msgs);
		case ModePackage.TRANSITION__TIME_BUDGET:
			return basicSetTimeBudget(null, msgs);
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
		case ModePackage.TRANSITION__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case ModePackage.TRANSITION__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case ModePackage.TRANSITION__TRIGGER:
			return getTrigger();
		case ModePackage.TRANSITION__GUARD:
			return getGuard();
		case ModePackage.TRANSITION__ACTIONS:
			return getActions();
		case ModePackage.TRANSITION__TIME_BUDGET:
			return getTimeBudget();
		case ModePackage.TRANSITION__GENERATED_EVENTS:
			return getGeneratedEvents();
		case ModePackage.TRANSITION__PRIORITY:
			return getPriority();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModePackage.TRANSITION__SOURCE:
			setSource((AbstractMode) newValue);
			return;
		case ModePackage.TRANSITION__TARGET:
			setTarget((AbstractMode) newValue);
			return;
		case ModePackage.TRANSITION__TRIGGER:
			setTrigger((EventExpression) newValue);
			return;
		case ModePackage.TRANSITION__GUARD:
			setGuard((AbstractGuard) newValue);
			return;
		case ModePackage.TRANSITION__ACTIONS:
			getActions().clear();
			getActions().addAll((Collection<? extends Action>) newValue);
			return;
		case ModePackage.TRANSITION__TIME_BUDGET:
			setTimeBudget((DurationExpression) newValue);
			return;
		case ModePackage.TRANSITION__GENERATED_EVENTS:
			getGeneratedEvents().clear();
			getGeneratedEvents().addAll((Collection<? extends AbstractEvent>) newValue);
			return;
		case ModePackage.TRANSITION__PRIORITY:
			setPriority((Integer) newValue);
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
		case ModePackage.TRANSITION__SOURCE:
			setSource((AbstractMode) null);
			return;
		case ModePackage.TRANSITION__TARGET:
			setTarget((AbstractMode) null);
			return;
		case ModePackage.TRANSITION__TRIGGER:
			setTrigger((EventExpression) null);
			return;
		case ModePackage.TRANSITION__GUARD:
			setGuard((AbstractGuard) null);
			return;
		case ModePackage.TRANSITION__ACTIONS:
			getActions().clear();
			return;
		case ModePackage.TRANSITION__TIME_BUDGET:
			setTimeBudget((DurationExpression) null);
			return;
		case ModePackage.TRANSITION__GENERATED_EVENTS:
			getGeneratedEvents().clear();
			return;
		case ModePackage.TRANSITION__PRIORITY:
			setPriority(PRIORITY_EDEFAULT);
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
		case ModePackage.TRANSITION__SOURCE:
			return source != null;
		case ModePackage.TRANSITION__TARGET:
			return target != null;
		case ModePackage.TRANSITION__TRIGGER:
			return trigger != null;
		case ModePackage.TRANSITION__GUARD:
			return guard != null;
		case ModePackage.TRANSITION__ACTIONS:
			return actions != null && !actions.isEmpty();
		case ModePackage.TRANSITION__TIME_BUDGET:
			return timeBudget != null;
		case ModePackage.TRANSITION__GENERATED_EVENTS:
			return generatedEvents != null && !generatedEvents.isEmpty();
		case ModePackage.TRANSITION__PRIORITY:
			return priority != PRIORITY_EDEFAULT;
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
		result.append(" (priority: "); //$NON-NLS-1$
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl