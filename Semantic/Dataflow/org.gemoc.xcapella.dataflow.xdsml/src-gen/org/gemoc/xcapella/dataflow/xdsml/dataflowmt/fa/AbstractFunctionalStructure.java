/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa;

import org.eclipse.emf.common.util.EList;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Functional Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.AbstractFunctionalStructure#getOwnedComponentExchanges <em>Owned Component Exchanges</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.AbstractFunctionalStructure#getOwnedComponentExchangeCategories <em>Owned Component Exchange Categories</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.AbstractFunctionalStructure#getOwnedFunctionalLinks <em>Owned Functional Links</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.AbstractFunctionalStructure#getOwnedFunctionalAllocations <em>Owned Functional Allocations</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.AbstractFunctionalStructure#getOwnedComponentExchangeRealizations <em>Owned Component Exchange Realizations</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FaPackage#getAbstractFunctionalStructure()
 * @model abstract="true"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='a specialized structure containing links of a functional nature between components\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='operational,system,logical,physical,epbs' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='none' constraints='none'"
 * @generated
 */
public interface AbstractFunctionalStructure extends Structure {
	/**
	 * Returns the value of the '<em><b>Owned Component Exchanges</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.ComponentExchange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Component Exchanges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Component Exchanges</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FaPackage#getAbstractFunctionalStructure_OwnedComponentExchanges()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='ownedConnector' featureOwner='StructuredClassifier'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the connections between components, contained in this structure\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::packagedElement' explanation='none' constraints='uml::Package::packagedElement elements on which ComponentExchange stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<ComponentExchange> getOwnedComponentExchanges();

	/**
	 * Returns the value of the '<em><b>Owned Component Exchange Categories</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.ComponentExchangeCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Component Exchange Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Component Exchange Categories</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FaPackage#getAbstractFunctionalStructure_OwnedComponentExchangeCategories()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='none' constraints='none' comment/notes='none'"
	 * @generated
	 */
	EList<ComponentExchangeCategory> getOwnedComponentExchangeCategories();

	/**
	 * Returns the value of the '<em><b>Owned Functional Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.ExchangeLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Functional Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Functional Links</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FaPackage#getAbstractFunctionalStructure_OwnedFunctionalLinks()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Component'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ownedFunctionalLinks'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the (functional) exchange links defined in the context of this structure\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::packagedElement' explanation='none' constraints='uml::Package::packagedElement elements on which ExchangeLink stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<ExchangeLink> getOwnedFunctionalLinks();

	/**
	 * Returns the value of the '<em><b>Owned Functional Allocations</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.ComponentFunctionalAllocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Functional Allocations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Functional Allocations</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FaPackage#getAbstractFunctionalStructure_OwnedFunctionalAllocations()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the list of component &lt;=&gt; function allocation links defined in this structure\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::packagedElement' explanation='none' constraints='uml::Package::packagedElement elements on which ComponentFunctionalAllocation stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<ComponentFunctionalAllocation> getOwnedFunctionalAllocations();

	/**
	 * Returns the value of the '<em><b>Owned Component Exchange Realizations</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.ComponentExchangeRealization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Component Exchange Realizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Component Exchange Realizations</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FaPackage#getAbstractFunctionalStructure_OwnedComponentExchangeRealizations()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='ownedConnector' featureOwner='StructuredClassifier'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the list of realizations links between component exchanges, defined in this structure\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::packagedElement' explanation='none' constraints='uml::Package::packagedElement elements on which ComponentExchangeRealisation stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<ComponentExchangeRealization> getOwnedComponentExchangeRealizations();

} // AbstractFunctionalStructure
