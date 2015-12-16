package com.thalesgroup.trt.mde.vp.configuration.configuration;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.capellacore.NamedElement;

import org.polarsys.capella.core.data.cs.Component;

import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.configuration.configuration.ComponentConfiguration#getComponent <em>Component</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.configuration.configuration.ComponentConfiguration#getComponentParameters <em>Component Parameters</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.configuration.configuration.ComponentConfiguration#getComponentConfigurations <em>Component Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage#getComponentConfiguration()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement=' http://www.polarsys.org/capella/core/cs/0.8.0#//Component'"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping Mapping=' platform:/plugin/org.polarsys.capella.core.data.gen/model/CompositeStructure.ecore#//Component'"
 * @generated
 */

public interface ComponentConfiguration extends NamedElement, ElementExtension {

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(Component)
	 * @see com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage#getComponentConfiguration_Component()
	 * @model required="true"
	 * @generated
	 */

	Component getComponent();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.configuration.configuration.ComponentConfiguration#getComponent <em>Component</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */

	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Component Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link com.thalesgroup.trt.mde.vp.configuration.configuration.ParameterValue}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Parameters</em>' containment reference list.
	 * @see com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage#getComponentConfiguration_ComponentParameters()
	 * @model containment="true"
	 * @generated
	 */

	EList<ParameterValue> getComponentParameters();

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
	 * @see com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage#getComponentConfiguration_ComponentConfigurations()
	 * @model required="true"
	 * @generated
	 */

	EList<ComponentConfiguration> getComponentConfigurations();

} // ComponentConfiguration
