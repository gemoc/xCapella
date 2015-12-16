package com.thalesgroup.trt.mde.vp.time.time;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Span</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.Span#getBegin <em>Begin</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.Span#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getSpan()
 * @model
 * @generated
 */

public interface Span extends Duration {

	/**
	 * Returns the value of the '<em><b>Begin</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Begin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin</em>' containment reference.
	 * @see #setBegin(Instant)
	 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getSpan_Begin()
	 * @model containment="true" required="true"
	 * @generated
	 */

	Instant getBegin();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.time.time.Span#getBegin <em>Begin</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin</em>' containment reference.
	 * @see #getBegin()
	 * @generated
	 */

	void setBegin(Instant value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(Instant)
	 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getSpan_End()
	 * @model containment="true" required="true"
	 * @generated
	 */

	Instant getEnd();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.time.time.Span#getEnd <em>End</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */

	void setEnd(Instant value);

} // Span
