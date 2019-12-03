/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.deployment;

import org.eclipse.emf.common.util.EList;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.NamedElement;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.AbstractDeploymentLink;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.deployment.DeploymentConfiguration#getOwnedDeploymentLinks <em>Owned Deployment Links</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.deployment.DeploymentConfiguration#getOwnedPhysicalInstances <em>Owned Physical Instances</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.deployment.DeploymentPackage#getDeploymentConfiguration()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='DeploymentConfiguration'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Package' stereotype='eng.DeploymentConfiguration'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='a consistent set of deployment specifications\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Package' explanation='none' constraints='none'"
 * @generated
 */
public interface DeploymentConfiguration extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Deployment Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.AbstractDeploymentLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Deployment Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Deployment Links</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.deployment.DeploymentPackage#getDeploymentConfiguration_OwnedDeploymentLinks()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='elementImport' featureOwner='Namespace'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='deployments'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the deployment specifications that are part of this deployment configuration\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Namespace::elementImport' explanation='none' constraints='uml::Namespace::elementImport elements on which AbstractDeployment stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<AbstractDeploymentLink> getOwnedDeploymentLinks();

	/**
	 * Returns the value of the '<em><b>Owned Physical Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.deployment.AbstractPhysicalInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Physical Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Physical Instances</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.deployment.DeploymentPackage#getDeploymentConfiguration_OwnedPhysicalInstances()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	EList<AbstractPhysicalInstance> getOwnedPhysicalInstances();

} // DeploymentConfiguration
