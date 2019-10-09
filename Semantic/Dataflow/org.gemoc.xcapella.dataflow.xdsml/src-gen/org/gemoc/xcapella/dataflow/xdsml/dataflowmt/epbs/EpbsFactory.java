/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.EpbsPackage
 * @generated
 */
public interface EpbsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EpbsFactory eINSTANCE = org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.impl.EpbsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EPBS Architecture Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EPBS Architecture Pkg</em>'.
	 * @generated
	 */
	EPBSArchitecturePkg createEPBSArchitecturePkg();

	/**
	 * Returns a new object of class '<em>EPBS Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EPBS Architecture</em>'.
	 * @generated
	 */
	EPBSArchitecture createEPBSArchitecture();

	/**
	 * Returns a new object of class '<em>EPBS Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EPBS Context</em>'.
	 * @generated
	 */
	EPBSContext createEPBSContext();

	/**
	 * Returns a new object of class '<em>Configuration Item Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Item Pkg</em>'.
	 * @generated
	 */
	ConfigurationItemPkg createConfigurationItemPkg();

	/**
	 * Returns a new object of class '<em>Configuration Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Item</em>'.
	 * @generated
	 */
	ConfigurationItem createConfigurationItem();

	/**
	 * Returns a new object of class '<em>Physical Architecture Realization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Architecture Realization</em>'.
	 * @generated
	 */
	PhysicalArchitectureRealization createPhysicalArchitectureRealization();

	/**
	 * Returns a new object of class '<em>Physical Artifact Realization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Artifact Realization</em>'.
	 * @generated
	 */
	PhysicalArtifactRealization createPhysicalArtifactRealization();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EpbsPackage getEpbsPackage();

} //EpbsFactory
