/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.deployment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.deployment.DeploymentPackage
 * @generated
 */
public interface DeploymentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeploymentFactory eINSTANCE = org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.deployment.impl.DeploymentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Instance</em>'.
	 * @generated
	 */
	ComponentInstance createComponentInstance();

	/**
	 * Returns a new object of class '<em>Connection Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Instance</em>'.
	 * @generated
	 */
	ConnectionInstance createConnectionInstance();

	/**
	 * Returns a new object of class '<em>Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aspect</em>'.
	 * @generated
	 */
	DeploymentAspect createDeploymentAspect();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	DeploymentConfiguration createDeploymentConfiguration();

	/**
	 * Returns a new object of class '<em>Instance Deployment Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Deployment Link</em>'.
	 * @generated
	 */
	InstanceDeploymentLink createInstanceDeploymentLink();

	/**
	 * Returns a new object of class '<em>Part Deployment Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part Deployment Link</em>'.
	 * @generated
	 */
	PartDeploymentLink createPartDeploymentLink();

	/**
	 * Returns a new object of class '<em>Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Instance</em>'.
	 * @generated
	 */
	PortInstance createPortInstance();

	/**
	 * Returns a new object of class '<em>Type Deployment Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Deployment Link</em>'.
	 * @generated
	 */
	TypeDeploymentLink createTypeDeploymentLink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DeploymentPackage getDeploymentPackage();

} //DeploymentFactory
