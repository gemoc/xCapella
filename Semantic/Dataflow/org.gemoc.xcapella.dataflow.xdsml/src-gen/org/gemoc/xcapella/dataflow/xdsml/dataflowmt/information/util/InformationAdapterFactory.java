/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.behavior.AbstractEvent;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.behavior.AbstractSignal;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.AbstractDependenciesPkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.AbstractExchangeItemPkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Allocation;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.CapellaElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Classifier;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Feature;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.GeneralClass;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.GeneralizableElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.NamedElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.NamedRelationship;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Namespace;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Relationship;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Structure;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Type;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.TypedElement;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.Element;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.ExtensibleElement;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.AbstractCollectionValue;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.AbstractEventOperation;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.AbstractInstance;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Association;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.AssociationPkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Collection;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.CollectionValue;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.CollectionValueReference;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.DataPkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.DomainElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ExchangeItem;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ExchangeItemElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ExchangeItemInstance;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ExchangeItemRealization;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.InformationPackage;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.InformationRealization;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.KeyPart;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.MultiplicityElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Operation;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.OperationAllocation;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Parameter;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Partition;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.PartitionableElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Port;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.PortAllocation;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.PortRealization;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Property;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Service;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Union;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.UnionProperty;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Unit;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.MessageReferencePkg;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.DataValue;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.DataValueContainer;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractExchangeItem;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractNamedElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractParameter;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractRelationship;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractTrace;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractType;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractTypedElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.FinalizableElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.ModelElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.PublishableElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.TraceableElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.InformationPackage
 * @generated
 */
public class InformationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InformationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InformationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationSwitch<Adapter> modelSwitch =
		new InformationSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractInstance(AbstractInstance object) {
				return createAbstractInstanceAdapter();
			}
			@Override
			public Adapter caseAssociationPkg(AssociationPkg object) {
				return createAssociationPkgAdapter();
			}
			@Override
			public Adapter caseAssociation(Association object) {
				return createAssociationAdapter();
			}
			@Override
			public Adapter caseClass(org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseCollection(Collection object) {
				return createCollectionAdapter();
			}
			@Override
			public Adapter caseAbstractCollectionValue(AbstractCollectionValue object) {
				return createAbstractCollectionValueAdapter();
			}
			@Override
			public Adapter caseCollectionValue(CollectionValue object) {
				return createCollectionValueAdapter();
			}
			@Override
			public Adapter caseCollectionValueReference(CollectionValueReference object) {
				return createCollectionValueReferenceAdapter();
			}
			@Override
			public Adapter caseDataPkg(DataPkg object) {
				return createDataPkgAdapter();
			}
			@Override
			public Adapter caseDomainElement(DomainElement object) {
				return createDomainElementAdapter();
			}
			@Override
			public Adapter caseKeyPart(KeyPart object) {
				return createKeyPartAdapter();
			}
			@Override
			public Adapter caseMultiplicityElement(MultiplicityElement object) {
				return createMultiplicityElementAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseOperationAllocation(OperationAllocation object) {
				return createOperationAllocationAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseUnion(Union object) {
				return createUnionAdapter();
			}
			@Override
			public Adapter caseUnionProperty(UnionProperty object) {
				return createUnionPropertyAdapter();
			}
			@Override
			public Adapter caseUnit(Unit object) {
				return createUnitAdapter();
			}
			@Override
			public Adapter casePartitionableElement(PartitionableElement object) {
				return createPartitionableElementAdapter();
			}
			@Override
			public Adapter casePartition(Partition object) {
				return createPartitionAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter casePortRealization(PortRealization object) {
				return createPortRealizationAdapter();
			}
			@Override
			public Adapter casePortAllocation(PortAllocation object) {
				return createPortAllocationAdapter();
			}
			@Override
			public Adapter caseExchangeItem(ExchangeItem object) {
				return createExchangeItemAdapter();
			}
			@Override
			public Adapter caseExchangeItemElement(ExchangeItemElement object) {
				return createExchangeItemElementAdapter();
			}
			@Override
			public Adapter caseExchangeItemInstance(ExchangeItemInstance object) {
				return createExchangeItemInstanceAdapter();
			}
			@Override
			public Adapter caseInformationRealization(InformationRealization object) {
				return createInformationRealizationAdapter();
			}
			@Override
			public Adapter caseExchangeItemRealization(ExchangeItemRealization object) {
				return createExchangeItemRealizationAdapter();
			}
			@Override
			public Adapter caseAbstractEventOperation(AbstractEventOperation object) {
				return createAbstractEventOperationAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseExtensibleElement(ExtensibleElement object) {
				return createExtensibleElementAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseAbstractNamedElement(AbstractNamedElement object) {
				return createAbstractNamedElementAdapter();
			}
			@Override
			public Adapter caseTraceableElement(TraceableElement object) {
				return createTraceableElementAdapter();
			}
			@Override
			public Adapter casePublishableElement(PublishableElement object) {
				return createPublishableElementAdapter();
			}
			@Override
			public Adapter caseCapellaElement(CapellaElement object) {
				return createCapellaElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseAbstractTypedElement(AbstractTypedElement object) {
				return createAbstractTypedElementAdapter();
			}
			@Override
			public Adapter caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			@Override
			public Adapter caseFinalizableElement(FinalizableElement object) {
				return createFinalizableElementAdapter();
			}
			@Override
			public Adapter caseNamespace(Namespace object) {
				return createNamespaceAdapter();
			}
			@Override
			public Adapter caseStructure(Structure object) {
				return createStructureAdapter();
			}
			@Override
			public Adapter caseAbstractRelationship(AbstractRelationship object) {
				return createAbstractRelationshipAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseNamedRelationship(NamedRelationship object) {
				return createNamedRelationshipAdapter();
			}
			@Override
			public Adapter caseAbstractType(AbstractType object) {
				return createAbstractTypeAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseGeneralizableElement(GeneralizableElement object) {
				return createGeneralizableElementAdapter();
			}
			@Override
			public Adapter caseClassifier(Classifier object) {
				return createClassifierAdapter();
			}
			@Override
			public Adapter caseGeneralClass(GeneralClass object) {
				return createGeneralClassAdapter();
			}
			@Override
			public Adapter caseDataValueContainer(DataValueContainer object) {
				return createDataValueContainerAdapter();
			}
			@Override
			public Adapter caseValueSpecification(ValueSpecification object) {
				return createValueSpecificationAdapter();
			}
			@Override
			public Adapter caseDataValue(DataValue object) {
				return createDataValueAdapter();
			}
			@Override
			public Adapter caseAbstractDependenciesPkg(AbstractDependenciesPkg object) {
				return createAbstractDependenciesPkgAdapter();
			}
			@Override
			public Adapter caseAbstractExchangeItemPkg(AbstractExchangeItemPkg object) {
				return createAbstractExchangeItemPkgAdapter();
			}
			@Override
			public Adapter caseMessageReferencePkg(MessageReferencePkg object) {
				return createMessageReferencePkgAdapter();
			}
			@Override
			public Adapter caseAbstractEvent(AbstractEvent object) {
				return createAbstractEventAdapter();
			}
			@Override
			public Adapter caseAbstractTrace(AbstractTrace object) {
				return createAbstractTraceAdapter();
			}
			@Override
			public Adapter caseAllocation(Allocation object) {
				return createAllocationAdapter();
			}
			@Override
			public Adapter caseAbstractParameter(AbstractParameter object) {
				return createAbstractParameterAdapter();
			}
			@Override
			public Adapter caseAbstractExchangeItem(AbstractExchangeItem object) {
				return createAbstractExchangeItemAdapter();
			}
			@Override
			public Adapter caseAbstractSignal(AbstractSignal object) {
				return createAbstractSignalAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.AbstractInstance <em>Abstract Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.AbstractInstance
	 * @generated
	 */
	public Adapter createAbstractInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.AssociationPkg <em>Association Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.AssociationPkg
	 * @generated
	 */
	public Adapter createAssociationPkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Collection
	 * @generated
	 */
	public Adapter createCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.AbstractCollectionValue <em>Abstract Collection Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.AbstractCollectionValue
	 * @generated
	 */
	public Adapter createAbstractCollectionValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.CollectionValue <em>Collection Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.CollectionValue
	 * @generated
	 */
	public Adapter createCollectionValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.CollectionValueReference <em>Collection Value Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.CollectionValueReference
	 * @generated
	 */
	public Adapter createCollectionValueReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.DataPkg <em>Data Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.DataPkg
	 * @generated
	 */
	public Adapter createDataPkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.DomainElement <em>Domain Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.DomainElement
	 * @generated
	 */
	public Adapter createDomainElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.KeyPart <em>Key Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.KeyPart
	 * @generated
	 */
	public Adapter createKeyPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.MultiplicityElement
	 * @generated
	 */
	public Adapter createMultiplicityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.OperationAllocation <em>Operation Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.OperationAllocation
	 * @generated
	 */
	public Adapter createOperationAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Union <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Union
	 * @generated
	 */
	public Adapter createUnionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.UnionProperty <em>Union Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.UnionProperty
	 * @generated
	 */
	public Adapter createUnionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Unit
	 * @generated
	 */
	public Adapter createUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.PartitionableElement <em>Partitionable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.PartitionableElement
	 * @generated
	 */
	public Adapter createPartitionableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Partition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Partition
	 * @generated
	 */
	public Adapter createPartitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.PortRealization <em>Port Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.PortRealization
	 * @generated
	 */
	public Adapter createPortRealizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.PortAllocation <em>Port Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.PortAllocation
	 * @generated
	 */
	public Adapter createPortAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ExchangeItem <em>Exchange Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ExchangeItem
	 * @generated
	 */
	public Adapter createExchangeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ExchangeItemElement <em>Exchange Item Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ExchangeItemElement
	 * @generated
	 */
	public Adapter createExchangeItemElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ExchangeItemInstance <em>Exchange Item Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ExchangeItemInstance
	 * @generated
	 */
	public Adapter createExchangeItemInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.InformationRealization <em>Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.InformationRealization
	 * @generated
	 */
	public Adapter createInformationRealizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ExchangeItemRealization <em>Exchange Item Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ExchangeItemRealization
	 * @generated
	 */
	public Adapter createExchangeItemRealizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.AbstractEventOperation <em>Abstract Event Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.AbstractEventOperation
	 * @generated
	 */
	public Adapter createAbstractEventOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.ExtensibleElement <em>Extensible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.ExtensibleElement
	 * @generated
	 */
	public Adapter createExtensibleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractNamedElement <em>Abstract Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractNamedElement
	 * @generated
	 */
	public Adapter createAbstractNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.TraceableElement <em>Traceable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.TraceableElement
	 * @generated
	 */
	public Adapter createTraceableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.PublishableElement <em>Publishable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.PublishableElement
	 * @generated
	 */
	public Adapter createPublishableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.CapellaElement <em>Capella Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.CapellaElement
	 * @generated
	 */
	public Adapter createCapellaElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractTypedElement <em>Abstract Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractTypedElement
	 * @generated
	 */
	public Adapter createAbstractTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.FinalizableElement <em>Finalizable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.FinalizableElement
	 * @generated
	 */
	public Adapter createFinalizableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Structure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Structure
	 * @generated
	 */
	public Adapter createStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractRelationship <em>Abstract Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractRelationship
	 * @generated
	 */
	public Adapter createAbstractRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.NamedRelationship <em>Named Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.NamedRelationship
	 * @generated
	 */
	public Adapter createNamedRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractType <em>Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractType
	 * @generated
	 */
	public Adapter createAbstractTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.GeneralizableElement <em>Generalizable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.GeneralizableElement
	 * @generated
	 */
	public Adapter createGeneralizableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Classifier
	 * @generated
	 */
	public Adapter createClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.GeneralClass <em>General Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.GeneralClass
	 * @generated
	 */
	public Adapter createGeneralClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.DataValueContainer <em>Data Value Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.DataValueContainer
	 * @generated
	 */
	public Adapter createDataValueContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.ValueSpecification
	 * @generated
	 */
	public Adapter createValueSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.DataValue <em>Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.DataValue
	 * @generated
	 */
	public Adapter createDataValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.AbstractDependenciesPkg <em>Abstract Dependencies Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.AbstractDependenciesPkg
	 * @generated
	 */
	public Adapter createAbstractDependenciesPkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.AbstractExchangeItemPkg <em>Abstract Exchange Item Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.AbstractExchangeItemPkg
	 * @generated
	 */
	public Adapter createAbstractExchangeItemPkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.MessageReferencePkg <em>Message Reference Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.MessageReferencePkg
	 * @generated
	 */
	public Adapter createMessageReferencePkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.behavior.AbstractEvent <em>Abstract Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.behavior.AbstractEvent
	 * @generated
	 */
	public Adapter createAbstractEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractTrace <em>Abstract Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractTrace
	 * @generated
	 */
	public Adapter createAbstractTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Allocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Allocation
	 * @generated
	 */
	public Adapter createAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractParameter <em>Abstract Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractParameter
	 * @generated
	 */
	public Adapter createAbstractParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractExchangeItem <em>Abstract Exchange Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractExchangeItem
	 * @generated
	 */
	public Adapter createAbstractExchangeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.behavior.AbstractSignal <em>Abstract Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.behavior.AbstractSignal
	 * @generated
	 */
	public Adapter createAbstractSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //InformationAdapterFactory
