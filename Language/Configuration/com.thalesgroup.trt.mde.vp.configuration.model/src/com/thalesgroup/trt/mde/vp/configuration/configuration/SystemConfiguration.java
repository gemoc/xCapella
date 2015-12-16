package com.thalesgroup.trt.mde.vp.configuration.configuration;

import com.thalesgroup.trt.mde.vp.mode.mode.Mode_;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.capellacore.NamedElement;

import org.polarsys.capella.core.data.cs.Component;

import org.polarsys.capella.core.data.fa.AbstractFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.configuration.configuration.SystemConfiguration#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.configuration.configuration.SystemConfiguration#getSupportedModes <em>Supported Modes</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.configuration.configuration.SystemConfiguration#getComponentConfigurations <em>Component Configurations</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.configuration.configuration.SystemConfiguration#getAvailableFunctions <em>Available Functions</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.configuration.configuration.SystemConfiguration#getAvailableComponents <em>Available Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage#getSystemConfiguration()
 * @model
 * @generated
 */

public interface SystemConfiguration extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment</em>' containment reference.
	 * @see #setDeployment(Deployment)
	 * @see com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage#getSystemConfiguration_Deployment()
	 * @model containment="true"
	 * @generated
	 */

	Deployment getDeployment();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.configuration.configuration.SystemConfiguration#getDeployment <em>Deployment</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment</em>' containment reference.
	 * @see #getDeployment()
	 * @generated
	 */

	void setDeployment(Deployment value);

	/**
	 * Returns the value of the '<em><b>Supported Modes</b></em>' reference list.
	 * The list contents are of type {@link com.thalesgroup.trt.mde.vp.mode.mode.Mode_}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Modes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Modes</em>' reference list.
	 * @see com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage#getSystemConfiguration_SupportedModes()
	 * @model required="true"
	 * @generated
	 */

	EList<Mode_> getSupportedModes();

	/**
	 * Returns the value of the '<em><b>Component Configurations</b></em>' reference list.
	 * The list contents are of type {@link com.thalesgroup.trt.mde.vp.configuration.configuration.ComponentConfiguration}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Configurations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Configurations</em>' reference list.
	 * @see com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage#getSystemConfiguration_ComponentConfigurations()
	 * @model required="true"
	 * @generated
	 */

	EList<ComponentConfiguration> getComponentConfigurations();

	/**
	 * Returns the value of the '<em><b>Available Functions</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.data.fa.AbstractFunction}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Functions</em>' reference list.
	 * @see com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage#getSystemConfiguration_AvailableFunctions()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */

	EList<AbstractFunction> getAvailableFunctions();

	/**
	 * Returns the value of the '<em><b>Available Components</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.data.cs.Component}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Components</em>' reference list.
	 * @see com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage#getSystemConfiguration_AvailableComponents()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */

	EList<Component> getAvailableComponents();

} // SystemConfiguration
