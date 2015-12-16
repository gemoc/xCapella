package com.thalesgroup.trt.mde.vp.time.time;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.Duration#getInverval <em>Inverval</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getDuration()
 * @model
 * @generated
 */

public interface Duration extends TimeValue {

	/**
	 * Returns the value of the '<em><b>Inverval</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inverval</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverval</em>' reference.
	 * @see #setInverval(InstantInterval)
	 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getDuration_Inverval()
	 * @model required="true"
	 * @generated
	 */

	InstantInterval getInverval();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.time.time.Duration#getInverval <em>Inverval</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverval</em>' reference.
	 * @see #getInverval()
	 * @generated
	 */

	void setInverval(InstantInterval value);

} // Duration
