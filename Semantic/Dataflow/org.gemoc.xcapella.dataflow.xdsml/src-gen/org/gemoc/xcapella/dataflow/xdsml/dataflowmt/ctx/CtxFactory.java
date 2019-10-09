/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage
 * @generated
 */
public interface CtxFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CtxFactory eINSTANCE = org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.impl.CtxFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Analysis</em>'.
	 * @generated
	 */
	SystemAnalysis createSystemAnalysis();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

	/**
	 * Returns a new object of class '<em>System Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Function</em>'.
	 * @generated
	 */
	SystemFunction createSystemFunction();

	/**
	 * Returns a new object of class '<em>System Function Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Function Pkg</em>'.
	 * @generated
	 */
	SystemFunctionPkg createSystemFunctionPkg();

	/**
	 * Returns a new object of class '<em>System Communication Hook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Communication Hook</em>'.
	 * @generated
	 */
	SystemCommunicationHook createSystemCommunicationHook();

	/**
	 * Returns a new object of class '<em>System Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Communication</em>'.
	 * @generated
	 */
	SystemCommunication createSystemCommunication();

	/**
	 * Returns a new object of class '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor</em>'.
	 * @generated
	 */
	Actor createActor();

	/**
	 * Returns a new object of class '<em>Actor Capability Involvement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor Capability Involvement</em>'.
	 * @generated
	 */
	ActorCapabilityInvolvement createActorCapabilityInvolvement();

	/**
	 * Returns a new object of class '<em>Actor Mission Involvement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor Mission Involvement</em>'.
	 * @generated
	 */
	ActorMissionInvolvement createActorMissionInvolvement();

	/**
	 * Returns a new object of class '<em>Actor Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor Pkg</em>'.
	 * @generated
	 */
	ActorPkg createActorPkg();

	/**
	 * Returns a new object of class '<em>Mission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mission</em>'.
	 * @generated
	 */
	Mission createMission();

	/**
	 * Returns a new object of class '<em>Mission Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mission Pkg</em>'.
	 * @generated
	 */
	MissionPkg createMissionPkg();

	/**
	 * Returns a new object of class '<em>System Mission Involvement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Mission Involvement</em>'.
	 * @generated
	 */
	SystemMissionInvolvement createSystemMissionInvolvement();

	/**
	 * Returns a new object of class '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability</em>'.
	 * @generated
	 */
	Capability createCapability();

	/**
	 * Returns a new object of class '<em>Capability Exploitation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability Exploitation</em>'.
	 * @generated
	 */
	CapabilityExploitation createCapabilityExploitation();

	/**
	 * Returns a new object of class '<em>Capability Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability Pkg</em>'.
	 * @generated
	 */
	CapabilityPkg createCapabilityPkg();

	/**
	 * Returns a new object of class '<em>System Capability Involvement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Capability Involvement</em>'.
	 * @generated
	 */
	SystemCapabilityInvolvement createSystemCapabilityInvolvement();

	/**
	 * Returns a new object of class '<em>Operational Actor Realization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operational Actor Realization</em>'.
	 * @generated
	 */
	OperationalActorRealization createOperationalActorRealization();

	/**
	 * Returns a new object of class '<em>Operational Analysis Realization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operational Analysis Realization</em>'.
	 * @generated
	 */
	OperationalAnalysisRealization createOperationalAnalysisRealization();

	/**
	 * Returns a new object of class '<em>Operational Entity Realization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operational Entity Realization</em>'.
	 * @generated
	 */
	OperationalEntityRealization createOperationalEntityRealization();

	/**
	 * Returns a new object of class '<em>System Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Context</em>'.
	 * @generated
	 */
	SystemContext createSystemContext();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CtxPackage getCtxPackage();

} //CtxFactory
