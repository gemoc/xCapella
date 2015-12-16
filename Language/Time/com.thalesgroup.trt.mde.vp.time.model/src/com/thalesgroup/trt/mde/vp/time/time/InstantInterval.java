package com.thalesgroup.trt.mde.vp.time.time;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instant Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.InstantInterval#getMin <em>Min</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.InstantInterval#getMax <em>Max</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.InstantInterval#isIsLowerOpen <em>Is Lower Open</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.InstantInterval#isIsUpperOpen <em>Is Upper Open</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getInstantInterval()
 * @model
 * @generated
 */

public interface InstantInterval extends Instant {

	/**
	 * Returns the value of the '<em><b>Min</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' containment reference.
	 * @see #setMin(Instant)
	 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getInstantInterval_Min()
	 * @model containment="true" required="true"
	 * @generated
	 */

	Instant getMin();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.time.time.InstantInterval#getMin <em>Min</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' containment reference.
	 * @see #getMin()
	 * @generated
	 */

	void setMin(Instant value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' containment reference.
	 * @see #setMax(Instant)
	 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getInstantInterval_Max()
	 * @model containment="true" required="true"
	 * @generated
	 */

	Instant getMax();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.time.time.InstantInterval#getMax <em>Max</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' containment reference.
	 * @see #getMax()
	 * @generated
	 */

	void setMax(Instant value);

	/**
	 * Returns the value of the '<em><b>Is Lower Open</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Lower Open</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Lower Open</em>' attribute.
	 * @see #setIsLowerOpen(boolean)
	 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getInstantInterval_IsLowerOpen()
	 * @model
	 * @generated
	 */

	boolean isIsLowerOpen();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.time.time.InstantInterval#isIsLowerOpen <em>Is Lower Open</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Lower Open</em>' attribute.
	 * @see #isIsLowerOpen()
	 * @generated
	 */

	void setIsLowerOpen(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Upper Open</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Upper Open</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Upper Open</em>' attribute.
	 * @see #setIsUpperOpen(boolean)
	 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getInstantInterval_IsUpperOpen()
	 * @model
	 * @generated
	 */

	boolean isIsUpperOpen();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.time.time.InstantInterval#isIsUpperOpen <em>Is Upper Open</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Upper Open</em>' attribute.
	 * @see #isIsUpperOpen()
	 * @generated
	 */

	void setIsUpperOpen(boolean value);

} // InstantInterval
