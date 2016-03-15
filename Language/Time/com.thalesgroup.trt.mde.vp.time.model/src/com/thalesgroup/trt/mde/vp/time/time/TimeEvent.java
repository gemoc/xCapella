package com.thalesgroup.trt.mde.vp.time.time;

import org.polarsys.capella.common.data.behavior.AbstractEvent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.TimeEvent#getWhen <em>When</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.TimeEvent#getEvery <em>Every</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.TimeEvent#getRepetition <em>Repetition</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getTimeEvent()
 * @model
 * @generated
 */

public interface TimeEvent extends AbstractEvent {

	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference.
	 * @see #setWhen(TimeValue)
	 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getTimeEvent_When()
	 * @model containment="true" required="true"
	 * @generated
	 */

	TimeValue getWhen();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.time.time.TimeEvent#getWhen <em>When</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' containment reference.
	 * @see #getWhen()
	 * @generated
	 */

	void setWhen(TimeValue value);

	/**
	 * Returns the value of the '<em><b>Every</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Every</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Every</em>' containment reference.
	 * @see #setEvery(Duration)
	 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getTimeEvent_Every()
	 * @model containment="true"
	 * @generated
	 */

	Duration getEvery();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.time.time.TimeEvent#getEvery <em>Every</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Every</em>' containment reference.
	 * @see #getEvery()
	 * @generated
	 */

	void setEvery(Duration value);

	/**
	 * Returns the value of the '<em><b>Repetition</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repetition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repetition</em>' attribute.
	 * @see #setRepetition(int)
	 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getTimeEvent_Repetition()
	 * @model
	 * @generated
	 */

	int getRepetition();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.time.time.TimeEvent#getRepetition <em>Repetition</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repetition</em>' attribute.
	 * @see #getRepetition()
	 * @generated
	 */

	void setRepetition(int value);

} // TimeEvent
