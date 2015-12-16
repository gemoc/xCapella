package com.thalesgroup.trt.mde.vp.configuration.configuration;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.capellacore.NamedElement;

import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configurations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.configuration.configuration.Configurations#getSystemConfigurations <em>System Configurations</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.configuration.configuration.Configurations#getComponentConfigurations <em>Component Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage#getConfigurations()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement=' http://www.polarsys.org/capella/core/modeller/0.8.0#//SystemEngineering'"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping Mapping=' platform:/plugin/org.polarsys.capella.core.data.gen/model/CapellaModeller.ecore#//SystemEngineering'"
 * @generated
 */

public interface Configurations extends NamedElement, ElementExtension {

	/**
	 * Returns the value of the '<em><b>System Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link com.thalesgroup.trt.mde.vp.configuration.configuration.SystemConfiguration}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Configurations</em>' containment reference list.
	 * @see com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage#getConfigurations_SystemConfigurations()
	 * @model containment="true"
	 * @generated
	 */

	EList<SystemConfiguration> getSystemConfigurations();

	/**
	 * Returns the value of the '<em><b>Component Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link com.thalesgroup.trt.mde.vp.configuration.configuration.ComponentConfiguration}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Configurations</em>' containment reference list.
	 * @see com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage#getConfigurations_ComponentConfigurations()
	 * @model containment="true"
	 * @generated
	 */

	EList<ComponentConfiguration> getComponentConfigurations();

} // Configurations
