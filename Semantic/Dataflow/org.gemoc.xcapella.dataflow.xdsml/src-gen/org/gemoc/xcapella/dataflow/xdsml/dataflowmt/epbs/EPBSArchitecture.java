/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs;

import org.eclipse.emf.common.util.EList;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.ComponentArchitecture;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.CapabilityRealizationPkg;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalArchitecture;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPBS Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.EPBSArchitecture#getOwnedEPBSContext <em>Owned EPBS Context</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.EPBSArchitecture#getOwnedConfigurationItem <em>Owned Configuration Item</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.EPBSArchitecture#getOwnedConfigurationItemPkg <em>Owned Configuration Item Pkg</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.EPBSArchitecture#getContainedCapabilityRealizationPkg <em>Contained Capability Realization Pkg</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.EPBSArchitecture#getOwnedPhysicalArchitectureRealizations <em>Owned Physical Architecture Realizations</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.EPBSArchitecture#getAllocatedPhysicalArchitectureRealizations <em>Allocated Physical Architecture Realizations</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.EPBSArchitecture#getAllocatedPhysicalArchitectures <em>Allocated Physical Architectures</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.EpbsPackage#getEPBSArchitecture()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='EPBSArchitecture'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Package' stereotype='eng.sys.EPBSArchitecture'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='End Product Breakdown Structure. Definition of the Physical Components grouping for development subcontracting or purchase. ' usage\040guideline='n/a' used\040in\040levels='epbs' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Package' explanation='none' constraints='none'"
 * @generated
 */
public interface EPBSArchitecture extends ComponentArchitecture {
	/**
	 * Returns the value of the '<em><b>Owned EPBS Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned EPBS Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned EPBS Context</em>' containment reference.
	 * @see #setOwnedEPBSContext(EPBSContext)
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.EpbsPackage#getEPBSArchitecture_OwnedEPBSContext()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the context is the set of (epbs) parts that make the \"world\" at this abstraction level (the system part(s) and the external actor part(s))' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::packagedElement' explanation='none' constraints='uml::Package::packagedElement elements on which EPBSContext stereotype or any stereotype that inherits from it is applied'"
	 * @generated
	 */
	EPBSContext getOwnedEPBSContext();

	/**
	 * Sets the value of the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.EPBSArchitecture#getOwnedEPBSContext <em>Owned EPBS Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned EPBS Context</em>' containment reference.
	 * @see #getOwnedEPBSContext()
	 * @generated
	 */
	void setOwnedEPBSContext(EPBSContext value);

	/**
	 * Returns the value of the '<em><b>Owned Configuration Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Configuration Item</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Configuration Item</em>' containment reference.
	 * @see #setOwnedConfigurationItem(ConfigurationItem)
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.EpbsPackage#getEPBSArchitecture_OwnedConfigurationItem()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ownedConfigurationItems'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the Configuration items contained in this EPBS architecture\r\n[source: Capella study]' constraints='none' comment/notes='Even though configuration items are normally stored in a configurationItemPkg, there is this possibility to store them directly under the EPBS architecture element, the purpose being to avoid too many levels of nesting/hierarchy, to ease the navigation of the user in the model'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::packagedElement' explanation='none' constraints='uml::Package::packagedElement elements on which ConfigurationItem stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	ConfigurationItem getOwnedConfigurationItem();

	/**
	 * Sets the value of the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.EPBSArchitecture#getOwnedConfigurationItem <em>Owned Configuration Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Configuration Item</em>' containment reference.
	 * @see #getOwnedConfigurationItem()
	 * @generated
	 */
	void setOwnedConfigurationItem(ConfigurationItem value);

	/**
	 * Returns the value of the '<em><b>Owned Configuration Item Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Configuration Item Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Configuration Item Pkg</em>' containment reference.
	 * @see #setOwnedConfigurationItemPkg(ConfigurationItemPkg)
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.EpbsPackage#getEPBSArchitecture_OwnedConfigurationItemPkg()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ownedConfigurationItemPkgs'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Set of packages that contain configuration items, owned by this EPBS architecture\r\n[source:Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::nestedPackage#uml::Package::packagedElement' explanation='none' constraints='uml::Package::nestedPackage elements on which ConfigurationItemPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	ConfigurationItemPkg getOwnedConfigurationItemPkg();

	/**
	 * Sets the value of the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.EPBSArchitecture#getOwnedConfigurationItemPkg <em>Owned Configuration Item Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Configuration Item Pkg</em>' containment reference.
	 * @see #getOwnedConfigurationItemPkg()
	 * @generated
	 */
	void setOwnedConfigurationItemPkg(ConfigurationItemPkg value);

	/**
	 * Returns the value of the '<em><b>Contained Capability Realization Pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Capability Realization Pkg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Capability Realization Pkg</em>' reference.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.EpbsPackage#getEPBSArchitecture_ContainedCapabilityRealizationPkg()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic feature='ownedAbstractCapabilityPkg'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	CapabilityRealizationPkg getContainedCapabilityRealizationPkg();

	/**
	 * Returns the value of the '<em><b>Owned Physical Architecture Realizations</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.PhysicalArchitectureRealization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Physical Architecture Realizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Physical Architecture Realizations</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.EpbsPackage#getEPBSArchitecture_OwnedPhysicalArchitectureRealizations()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Set of physical architecture realization links owned by this EPBS architecture\r\n[source:Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::packagedElement' explanation='none' constraints='uml::Package::packagedElement elements on which PhysicalArchitectureRealisation stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<PhysicalArchitectureRealization> getOwnedPhysicalArchitectureRealizations();

	/**
	 * Returns the value of the '<em><b>Allocated Physical Architecture Realizations</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.PhysicalArchitectureRealization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Physical Architecture Realizations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Physical Architecture Realizations</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.EpbsPackage#getEPBSArchitecture_AllocatedPhysicalArchitectureRealizations()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='(automatically computed) the physical architecture realization links involving this EPBS architecture\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<PhysicalArchitectureRealization> getAllocatedPhysicalArchitectureRealizations();

	/**
	 * Returns the value of the '<em><b>Allocated Physical Architectures</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalArchitecture}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalArchitecture#getAllocatingEpbsArchitectures <em>Allocating Epbs Architectures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Physical Architectures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Physical Architectures</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.EpbsPackage#getEPBSArchitecture_AllocatedPhysicalArchitectures()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalArchitecture#getAllocatingEpbsArchitectures
	 * @model opposite="allocatingEpbsArchitectures" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<PhysicalArchitecture> getAllocatedPhysicalArchitectures();

} // EPBSArchitecture
