package com.thalesgroup.trt.mde.vp.expression.expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.EventGuard#getTriggeringEvent <em>Triggering Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getEventGuard()
 * @model
 * @generated
 */

public interface EventGuard extends AbstractGuard {

	/**
	 * Returns the value of the '<em><b>Triggering Event</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggering Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggering Event</em>' containment reference.
	 * @see #setTriggeringEvent(EventExpression)
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getEventGuard_TriggeringEvent()
	 * @model containment="true" required="true"
	 * @generated
	 */

	EventExpression getTriggeringEvent();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.expression.expression.EventGuard#getTriggeringEvent <em>Triggering Event</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggering Event</em>' containment reference.
	 * @see #getTriggeringEvent()
	 * @generated
	 */

	void setTriggeringEvent(EventExpression value);

} // EventGuard
