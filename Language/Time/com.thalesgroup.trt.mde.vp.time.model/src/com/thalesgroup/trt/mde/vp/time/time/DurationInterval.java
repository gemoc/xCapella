package com.thalesgroup.trt.mde.vp.time.time;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.DurationInterval#getMin <em>Min</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.DurationInterval#getMax <em>Max</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.DurationInterval#isIsLowerOpen <em>Is Lower Open</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.DurationInterval#isIsUpperOpen <em>Is Upper Open</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getDurationInterval()
 * @model
 * @generated
 */

public interface DurationInterval extends Duration {

	/**
	 * Returns the value of the '<em><b>Min</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' containment reference.
	 * @see #setMin(Duration)
	 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getDurationInterval_Min()
	 * @model containment="true" required="true"
	 * @generated
	 */

	Duration getMin();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.time.time.DurationInterval#getMin <em>Min</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' containment reference.
	 * @see #getMin()
	 * @generated
	 */

	void setMin(Duration value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' containment reference.
	 * @see #setMax(Duration)
	 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getDurationInterval_Max()
	 * @model containment="true" required="true"
	 * @generated
	 */

	Duration getMax();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.time.time.DurationInterval#getMax <em>Max</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' containment reference.
	 * @see #getMax()
	 * @generated
	 */

	void setMax(Duration value);

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
	 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getDurationInterval_IsLowerOpen()
	 * @model
	 * @generated
	 */

	boolean isIsLowerOpen();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.time.time.DurationInterval#isIsLowerOpen <em>Is Lower Open</em>}' attribute.

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
	 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getDurationInterval_IsUpperOpen()
	 * @model
	 * @generated
	 */

	boolean isIsUpperOpen();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.time.time.DurationInterval#isIsUpperOpen <em>Is Upper Open</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Upper Open</em>' attribute.
	 * @see #isIsUpperOpen()
	 * @generated
	 */

	void setIsUpperOpen(boolean value);

} // DurationInterval
