package com.thalesgroup.trt.mde.vp.configuration.configuration;

import com.thalesgroup.trt.mde.vp.expression.expression.Expression;

import org.polarsys.capella.core.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.configuration.configuration.ParameterValue#getPort <em>Port</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.configuration.configuration.ParameterValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage#getParameterValue()
 * @model
 * @generated
 */

public interface ParameterValue extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(ConfigurationPort)
	 * @see com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage#getParameterValue_Port()
	 * @model required="true"
	 * @generated
	 */

	ConfigurationPort getPort();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.configuration.configuration.ParameterValue#getPort <em>Port</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */

	void setPort(ConfigurationPort value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Expression)
	 * @see com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage#getParameterValue_Value()
	 * @model required="true"
	 * @generated
	 */

	Expression getValue();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.configuration.configuration.ParameterValue#getValue <em>Value</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */

	void setValue(Expression value);

} // ParameterValue
