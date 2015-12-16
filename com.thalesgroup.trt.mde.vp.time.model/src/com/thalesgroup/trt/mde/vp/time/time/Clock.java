package com.thalesgroup.trt.mde.vp.time.time;

import org.polarsys.capella.core.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.Clock#getUnit <em>Unit</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.Clock#getResolution <em>Resolution</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.Clock#getCurrentTime <em>Current Time</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.Clock#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getClock()
 * @model
 * @generated
 */

public interface Clock extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getClock_Unit()
	 * @model
	 * @generated
	 */

	String getUnit();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.time.time.Clock#getUnit <em>Unit</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */

	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see #setResolution(float)
	 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getClock_Resolution()
	 * @model
	 * @generated
	 */

	float getResolution();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.time.time.Clock#getResolution <em>Resolution</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' attribute.
	 * @see #getResolution()
	 * @generated
	 */

	void setResolution(float value);

	/**
	 * Returns the value of the '<em><b>Current Time</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Time</em>' attribute.
	 * @see #setCurrentTime(double)
	 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getClock_CurrentTime()
	 * @model
	 * @generated
	 */

	double getCurrentTime();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.time.time.Clock#getCurrentTime <em>Current Time</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Time</em>' attribute.
	 * @see #getCurrentTime()
	 * @generated
	 */

	void setCurrentTime(double value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(double)
	 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getClock_Max()
	 * @model
	 * @generated
	 */

	double getMax();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.time.time.Clock#getMax <em>Max</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */

	void setMax(double value);

} // Clock
