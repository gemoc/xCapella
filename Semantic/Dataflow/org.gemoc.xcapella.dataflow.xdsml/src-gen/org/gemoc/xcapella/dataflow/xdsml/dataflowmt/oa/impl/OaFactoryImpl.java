/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OaFactoryImpl extends EFactoryImpl implements OaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OaFactory init() {
		try {
			OaFactory theOaFactory = (OaFactory)EPackage.Registry.INSTANCE.getEFactory(OaPackage.eNS_URI);
			if (theOaFactory != null) {
				return theOaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OaPackage.OPERATIONAL_ANALYSIS: return createOperationalAnalysis();
			case OaPackage.OPERATIONAL_ACTIVITY_PKG: return createOperationalActivityPkg();
			case OaPackage.OPERATIONAL_ACTIVITY: return createOperationalActivity();
			case OaPackage.OPERATIONAL_PROCESS: return createOperationalProcess();
			case OaPackage.SWIMLANE: return createSwimlane();
			case OaPackage.OPERATIONAL_CAPABILITY_PKG: return createOperationalCapabilityPkg();
			case OaPackage.OPERATIONAL_CAPABILITY: return createOperationalCapability();
			case OaPackage.ACTIVITY_ALLOCATION: return createActivityAllocation();
			case OaPackage.ROLE_PKG: return createRolePkg();
			case OaPackage.ROLE: return createRole();
			case OaPackage.ROLE_ASSEMBLY_USAGE: return createRoleAssemblyUsage();
			case OaPackage.ROLE_ALLOCATION: return createRoleAllocation();
			case OaPackage.ENTITY_PKG: return createEntityPkg();
			case OaPackage.ENTITY: return createEntity();
			case OaPackage.CONCEPT_PKG: return createConceptPkg();
			case OaPackage.CONCEPT: return createConcept();
			case OaPackage.CONCEPT_COMPLIANCE: return createConceptCompliance();
			case OaPackage.ITEM_IN_CONCEPT: return createItemInConcept();
			case OaPackage.OPERATIONAL_ACTOR: return createOperationalActor();
			case OaPackage.COMMUNITY_OF_INTEREST: return createCommunityOfInterest();
			case OaPackage.COMMUNITY_OF_INTEREST_COMPOSITION: return createCommunityOfInterestComposition();
			case OaPackage.ORGANISATIONAL_UNIT: return createOrganisationalUnit();
			case OaPackage.ORGANISATIONAL_UNIT_COMPOSITION: return createOrganisationalUnitComposition();
			case OaPackage.LOCATION: return createLocation();
			case OaPackage.CAPABILITY_CONFIGURATION: return createCapabilityConfiguration();
			case OaPackage.COMMUNICATION_MEAN: return createCommunicationMean();
			case OaPackage.ENTITY_OPERATIONAL_CAPABILITY_INVOLVEMENT: return createEntityOperationalCapabilityInvolvement();
			case OaPackage.OPERATIONAL_CONTEXT: return createOperationalContext();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalAnalysis createOperationalAnalysis() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalActivityPkg createOperationalActivityPkg() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalActivity createOperationalActivity() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalProcess createOperationalProcess() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Swimlane createSwimlane() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalCapabilityPkg createOperationalCapabilityPkg() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalCapability createOperationalCapability() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityAllocation createActivityAllocation() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolePkg createRolePkg() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleAssemblyUsage createRoleAssemblyUsage() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleAllocation createRoleAllocation() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityPkg createEntityPkg() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptPkg createConceptPkg() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept createConcept() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptCompliance createConceptCompliance() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemInConcept createItemInConcept() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalActor createOperationalActor() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunityOfInterest createCommunityOfInterest() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunityOfInterestComposition createCommunityOfInterestComposition() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganisationalUnit createOrganisationalUnit() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganisationalUnitComposition createOrganisationalUnitComposition() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityConfiguration createCapabilityConfiguration() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationMean createCommunicationMean() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOperationalCapabilityInvolvement createEntityOperationalCapabilityInvolvement() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalContext createOperationalContext() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OaPackage getOaPackage() {
		return (OaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OaPackage getPackage() {
		return OaPackage.eINSTANCE;
	}

} //OaFactoryImpl
