package com.thalesgroup.trt.mde.vp.configuration.configuration;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.capellacore.NamedElement;

import org.polarsys.capella.core.data.cs.AbstractDeploymentLink;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.configuration.configuration.Deployment#getDeploymentLinks <em>Deployment Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage#getDeployment()
 * @model
 * @generated
 */

public interface Deployment extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Deployment Links</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.data.cs.AbstractDeploymentLink}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Links</em>' reference list.
	 * @see com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage#getDeployment_DeploymentLinks()
	 * @model required="true"
	 * @generated
	 */

	EList<AbstractDeploymentLink> getDeploymentLinks();

} // Deployment
