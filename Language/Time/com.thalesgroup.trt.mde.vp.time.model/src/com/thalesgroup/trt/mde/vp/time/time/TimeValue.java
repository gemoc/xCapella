package com.thalesgroup.trt.mde.vp.time.time;

import org.polarsys.capella.common.data.modellingcore.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.TimeValue#getClock <em>Clock</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.time.time.TimeValue#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getTimeValue()
 * @model
 * @generated
 */

public interface TimeValue extends ValueSpecification {

	/**
	 * Returns the value of the '<em><b>Clock</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock</em>' reference.
	 * @see #setClock(Clock)
	 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getTimeValue_Clock()
	 * @model required="true"
	 * @generated
	 */

	Clock getClock();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.time.time.TimeValue#getClock <em>Clock</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock</em>' reference.
	 * @see #getClock()
	 * @generated
	 */

	void setClock(Clock value);

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
	 * @see com.thalesgroup.trt.mde.vp.time.time.TimePackage#getTimeValue_Unit()
	 * @model
	 * @generated
	 */

	String getUnit();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.time.time.TimeValue#getUnit <em>Unit</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */

	void setUnit(String value);

} // TimeValue
