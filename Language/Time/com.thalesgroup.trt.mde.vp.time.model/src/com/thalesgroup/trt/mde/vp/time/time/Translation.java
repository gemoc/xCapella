package com.thalesgroup.trt.mde.vp.time.time;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Translation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.Translation#getStart <em>Start</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.Translation#getOffset <em>Offset</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.Translation#isIsBackward <em>Is Backward</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getTranslation()
 * @model
 * @generated
 */

public interface Translation extends Instant {

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Instant)
	 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getTranslation_Start()
	 * @model containment="true" required="true"
	 * @generated
	 */

	Instant getStart();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.time.time.Translation#getStart <em>Start</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */

	void setStart(Instant value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' containment reference.
	 * @see #setOffset(Duration)
	 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getTranslation_Offset()
	 * @model containment="true" required="true"
	 * @generated
	 */

	Duration getOffset();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.time.time.Translation#getOffset <em>Offset</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' containment reference.
	 * @see #getOffset()
	 * @generated
	 */

	void setOffset(Duration value);

	/**
	 * Returns the value of the '<em><b>Is Backward</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Backward</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Backward</em>' attribute.
	 * @see #setIsBackward(boolean)
	 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getTranslation_IsBackward()
	 * @model
	 * @generated
	 */

	boolean isIsBackward();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.time.time.Translation#isIsBackward <em>Is Backward</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Backward</em>' attribute.
	 * @see #isIsBackward()
	 * @generated
	 */

	void setIsBackward(boolean value);

} // Translation
