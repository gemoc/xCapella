/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.LaPackage
 * @generated
 */
public interface LaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LaFactory eINSTANCE = org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.impl.LaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Logical Architecture Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Architecture Pkg</em>'.
	 * @generated
	 */
	LogicalArchitecturePkg createLogicalArchitecturePkg();

	/**
	 * Returns a new object of class '<em>Logical Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Architecture</em>'.
	 * @generated
	 */
	LogicalArchitecture createLogicalArchitecture();

	/**
	 * Returns a new object of class '<em>Logical Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Function</em>'.
	 * @generated
	 */
	LogicalFunction createLogicalFunction();

	/**
	 * Returns a new object of class '<em>Logical Function Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Function Pkg</em>'.
	 * @generated
	 */
	LogicalFunctionPkg createLogicalFunctionPkg();

	/**
	 * Returns a new object of class '<em>Logical Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Component</em>'.
	 * @generated
	 */
	LogicalComponent createLogicalComponent();

	/**
	 * Returns a new object of class '<em>Logical Component Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Component Pkg</em>'.
	 * @generated
	 */
	LogicalComponentPkg createLogicalComponentPkg();

	/**
	 * Returns a new object of class '<em>Capability Realization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability Realization</em>'.
	 * @generated
	 */
	CapabilityRealization createCapabilityRealization();

	/**
	 * Returns a new object of class '<em>Capability Realization Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability Realization Pkg</em>'.
	 * @generated
	 */
	CapabilityRealizationPkg createCapabilityRealizationPkg();

	/**
	 * Returns a new object of class '<em>System Analysis Realization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Analysis Realization</em>'.
	 * @generated
	 */
	SystemAnalysisRealization createSystemAnalysisRealization();

	/**
	 * Returns a new object of class '<em>System Realization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Realization</em>'.
	 * @generated
	 */
	SystemRealization createSystemRealization();

	/**
	 * Returns a new object of class '<em>Context Interface Realization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Interface Realization</em>'.
	 * @generated
	 */
	ContextInterfaceRealization createContextInterfaceRealization();

	/**
	 * Returns a new object of class '<em>Logical Actor Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Actor Pkg</em>'.
	 * @generated
	 */
	LogicalActorPkg createLogicalActorPkg();

	/**
	 * Returns a new object of class '<em>Logical Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Actor</em>'.
	 * @generated
	 */
	LogicalActor createLogicalActor();

	/**
	 * Returns a new object of class '<em>System Actor Realization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Actor Realization</em>'.
	 * @generated
	 */
	SystemActorRealization createSystemActorRealization();

	/**
	 * Returns a new object of class '<em>Logical Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Context</em>'.
	 * @generated
	 */
	LogicalContext createLogicalContext();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LaPackage getLaPackage();

} //LaFactory
