package com.thalesgroup.trt.mde.vp.mode.mode;

import com.thalesgroup.trt.mde.vp.al.al.Action;

import com.thalesgroup.trt.mde.vp.expression.expression.AbstractGuard;
import com.thalesgroup.trt.mde.vp.expression.expression.DurationExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.EventExpression;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.common.data.behavior.AbstractEvent;

import org.polarsys.capella.core.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.Transition#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.Transition#getGuard <em>Guard</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.Transition#getActions <em>Actions</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.Transition#getTimeBudget <em>Time Budget</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.Transition#getGeneratedEvents <em>Generated Events</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.Transition#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#getTransition()
 * @model
 * @generated
 */

public interface Transition extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(AbstractMode)
	 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#getTransition_Source()
	 * @model required="true"
	 * @generated
	 */

	AbstractMode getSource();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.mode.mode.Transition#getSource <em>Source</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */

	void setSource(AbstractMode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(AbstractMode)
	 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#getTransition_Target()
	 * @model required="true"
	 * @generated
	 */

	AbstractMode getTarget();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.mode.mode.Transition#getTarget <em>Target</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */

	void setTarget(AbstractMode value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference.
	 * @see #setTrigger(EventExpression)
	 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#getTransition_Trigger()
	 * @model containment="true"
	 * @generated
	 */

	EventExpression getTrigger();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.mode.mode.Transition#getTrigger <em>Trigger</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' containment reference.
	 * @see #getTrigger()
	 * @generated
	 */

	void setTrigger(EventExpression value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(AbstractGuard)
	 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#getTransition_Guard()
	 * @model containment="true"
	 * @generated
	 */

	AbstractGuard getGuard();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.mode.mode.Transition#getGuard <em>Guard</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */

	void setGuard(AbstractGuard value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link com.thalesgroup.trt.mde.vp.al.al.Action}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#getTransition_Actions()
	 * @model containment="true"
	 * @generated
	 */

	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Time Budget</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Budget</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Budget</em>' containment reference.
	 * @see #setTimeBudget(DurationExpression)
	 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#getTransition_TimeBudget()
	 * @model containment="true"
	 * @generated
	 */

	DurationExpression getTimeBudget();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.mode.mode.Transition#getTimeBudget <em>Time Budget</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Budget</em>' containment reference.
	 * @see #getTimeBudget()
	 * @generated
	 */

	void setTimeBudget(DurationExpression value);

	/**
	 * Returns the value of the '<em><b>Generated Events</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.common.data.behavior.AbstractEvent}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generated Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Events</em>' reference list.
	 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#getTransition_GeneratedEvents()
	 * @model
	 * @generated
	 */

	EList<AbstractEvent> getGeneratedEvents();

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#getTransition_Priority()
	 * @model
	 * @generated
	 */

	int getPriority();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.mode.mode.Transition#getPriority <em>Priority</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */

	void setPriority(int value);

} // Transition
