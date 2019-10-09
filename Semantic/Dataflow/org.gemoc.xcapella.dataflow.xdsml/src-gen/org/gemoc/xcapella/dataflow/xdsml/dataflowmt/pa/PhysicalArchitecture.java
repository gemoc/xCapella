/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa;

import org.eclipse.emf.common.util.EList;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.AbstractDeploymentLink;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.ComponentArchitecture;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.EPBSArchitecture;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.CapabilityRealizationPkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.LogicalArchitecture;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalArchitecture#getOwnedPhysicalContext <em>Owned Physical Context</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalArchitecture#getOwnedPhysicalComponent <em>Owned Physical Component</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalArchitecture#getOwnedPhysicalComponentPkg <em>Owned Physical Component Pkg</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalArchitecture#getOwnedPhysicalActorPkg <em>Owned Physical Actor Pkg</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalArchitecture#getContainedCapabilityRealizationPkg <em>Contained Capability Realization Pkg</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalArchitecture#getContainedPhysicalFunctionPkg <em>Contained Physical Function Pkg</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalArchitecture#getOwnedDeployments <em>Owned Deployments</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalArchitecture#getOwnedLogicalArchitectureRealizations <em>Owned Logical Architecture Realizations</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalArchitecture#getAllocatedLogicalArchitectureRealizations <em>Allocated Logical Architecture Realizations</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalArchitecture#getAllocatedLogicalArchitectures <em>Allocated Logical Architectures</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalArchitecture#getAllocatingEpbsArchitectures <em>Allocating Epbs Architectures</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PaPackage#getPhysicalArchitecture()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='Physical Architecture'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Package' stereotype='eng.PhysicalArchitecture'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Model describing physical architecture part - hardware components &amp; related items -  associated to (created during) a modelling phase' usage\040guideline='n/a' used\040in\040levels='physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Package' explanation='none' constraints='none'"
 * @generated
 */
public interface PhysicalArchitecture extends ComponentArchitecture {
	/**
	 * Returns the value of the '<em><b>Owned Physical Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Physical Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Physical Context</em>' containment reference.
	 * @see #setOwnedPhysicalContext(PhysicalContext)
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PaPackage#getPhysicalArchitecture_OwnedPhysicalContext()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the context is the set of (physical) parts that make the \"world\" at this abstraction level (the system part(s) and the external actor part(s))\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::packagedElement' explanation='none' constraints='uml::Package::packagedElement elements on which PhysicalContext stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [0..1]'"
	 * @generated
	 */
	PhysicalContext getOwnedPhysicalContext();

	/**
	 * Sets the value of the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalArchitecture#getOwnedPhysicalContext <em>Owned Physical Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Physical Context</em>' containment reference.
	 * @see #getOwnedPhysicalContext()
	 * @generated
	 */
	void setOwnedPhysicalContext(PhysicalContext value);

	/**
	 * Returns the value of the '<em><b>Owned Physical Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Physical Component</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Physical Component</em>' containment reference.
	 * @see #setOwnedPhysicalComponent(PhysicalComponent)
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PaPackage#getPhysicalArchitecture_OwnedPhysicalComponent()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ownedComponents'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the physical component that represents the System\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::packagedElement' explanation='none' constraints='uml::Package::packagedElement elements on which PhysicalComponent stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [0..1]'"
	 * @generated
	 */
	PhysicalComponent getOwnedPhysicalComponent();

	/**
	 * Sets the value of the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalArchitecture#getOwnedPhysicalComponent <em>Owned Physical Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Physical Component</em>' containment reference.
	 * @see #getOwnedPhysicalComponent()
	 * @generated
	 */
	void setOwnedPhysicalComponent(PhysicalComponent value);

	/**
	 * Returns the value of the '<em><b>Owned Physical Component Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Physical Component Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Physical Component Pkg</em>' containment reference.
	 * @see #setOwnedPhysicalComponentPkg(PhysicalComponentPkg)
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PaPackage#getPhysicalArchitecture_OwnedPhysicalComponentPkg()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ownedComponentPkgs'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='a package containing the physical components involved in this physical architecture\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::nestedPackage#uml::Package::packagedElement' explanation='none' constraints='uml::Package::nestedPackage elements on which PhysicalComponentPkg stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [0..1]'"
	 * @generated
	 */
	PhysicalComponentPkg getOwnedPhysicalComponentPkg();

	/**
	 * Sets the value of the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalArchitecture#getOwnedPhysicalComponentPkg <em>Owned Physical Component Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Physical Component Pkg</em>' containment reference.
	 * @see #getOwnedPhysicalComponentPkg()
	 * @generated
	 */
	void setOwnedPhysicalComponentPkg(PhysicalComponentPkg value);

	/**
	 * Returns the value of the '<em><b>Owned Physical Actor Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Physical Actor Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Physical Actor Pkg</em>' containment reference.
	 * @see #setOwnedPhysicalActorPkg(PhysicalActorPkg)
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PaPackage#getPhysicalArchitecture_OwnedPhysicalActorPkg()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ownedActorPkg'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='a package containing the physical actors involved in this physical architecture\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::nestedPackage#uml::Package::packagedElement' explanation='none' constraints='uml::Package::nestedPackage elements on which PhysicalActorPkg stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [0..1]'"
	 * @generated
	 */
	PhysicalActorPkg getOwnedPhysicalActorPkg();

	/**
	 * Sets the value of the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalArchitecture#getOwnedPhysicalActorPkg <em>Owned Physical Actor Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Physical Actor Pkg</em>' containment reference.
	 * @see #getOwnedPhysicalActorPkg()
	 * @generated
	 */
	void setOwnedPhysicalActorPkg(PhysicalActorPkg value);

	/**
	 * Returns the value of the '<em><b>Contained Capability Realization Pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Capability Realization Pkg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Capability Realization Pkg</em>' reference.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PaPackage#getPhysicalArchitecture_ContainedCapabilityRealizationPkg()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic feature='ownedAbstractCapabilityPkg'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	CapabilityRealizationPkg getContainedCapabilityRealizationPkg();

	/**
	 * Returns the value of the '<em><b>Contained Physical Function Pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Physical Function Pkg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Physical Function Pkg</em>' reference.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PaPackage#getPhysicalArchitecture_ContainedPhysicalFunctionPkg()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic feature='ownedFunctionPkg'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	PhysicalFunctionPkg getContainedPhysicalFunctionPkg();

	/**
	 * Returns the value of the '<em><b>Owned Deployments</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.AbstractDeploymentLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Deployments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Deployments</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PaPackage#getPhysicalArchitecture_OwnedDeployments()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ownedDeployments'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the various deployments associated with this physical architecture\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::packagedElement' explanation='none' constraints='uml::Package::packagedElement elements on which AbstractDeployment stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<AbstractDeploymentLink> getOwnedDeployments();

	/**
	 * Returns the value of the '<em><b>Owned Logical Architecture Realizations</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.LogicalArchitectureRealization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Logical Architecture Realizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Logical Architecture Realizations</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PaPackage#getPhysicalArchitecture_OwnedLogicalArchitectureRealizations()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the list of a relationships between physical architectures and the logical architectures that they realize, stored/owned by this architecture\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::packagedElement' explanation='none' constraints='uml::Package::packagedElement elements on which LogicalArchitectureRealisation stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<LogicalArchitectureRealization> getOwnedLogicalArchitectureRealizations();

	/**
	 * Returns the value of the '<em><b>Allocated Logical Architecture Realizations</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.LogicalArchitectureRealization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Logical Architecture Realizations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Logical Architecture Realizations</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PaPackage#getPhysicalArchitecture_AllocatedLogicalArchitectureRealizations()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='clientDependency' featureOwner='NamedElement'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='allocatedLogicalArchitectureImplementations'"
	 *        annotation="http://www.polarsys.org/capella/derived derive='self.ownedPartitions.representedElement.oclIsKindOf(PhysicalComponent) -&gt; oclAsType(PhysicalComponent)'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the list of relationships between this physical architecture and the logical architectures to which it is allocated\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<LogicalArchitectureRealization> getAllocatedLogicalArchitectureRealizations();

	/**
	 * Returns the value of the '<em><b>Allocated Logical Architectures</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.LogicalArchitecture}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.LogicalArchitecture#getAllocatingPhysicalArchitectures <em>Allocating Physical Architectures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Logical Architectures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Logical Architectures</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PaPackage#getPhysicalArchitecture_AllocatedLogicalArchitectures()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.LogicalArchitecture#getAllocatingPhysicalArchitectures
	 * @model opposite="allocatingPhysicalArchitectures" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<LogicalArchitecture> getAllocatedLogicalArchitectures();

	/**
	 * Returns the value of the '<em><b>Allocating Epbs Architectures</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.EPBSArchitecture}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.EPBSArchitecture#getAllocatedPhysicalArchitectures <em>Allocated Physical Architectures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocating Epbs Architectures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocating Epbs Architectures</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PaPackage#getPhysicalArchitecture_AllocatingEpbsArchitectures()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.EPBSArchitecture#getAllocatedPhysicalArchitectures
	 * @model opposite="allocatedPhysicalArchitectures" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 * @generated
	 */
	EList<EPBSArchitecture> getAllocatingEpbsArchitectures();

} // PhysicalArchitecture
