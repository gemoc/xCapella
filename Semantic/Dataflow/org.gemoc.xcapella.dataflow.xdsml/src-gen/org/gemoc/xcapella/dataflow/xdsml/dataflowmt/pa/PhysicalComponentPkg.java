/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa;

import org.eclipse.emf.common.util.EList;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.AbstractDeploymentLink;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.AbstractFunctionalStructure;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.AssociationPkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.KeyPart;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Component Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalComponentPkg#getOwnedComponents <em>Owned Components</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalComponentPkg#getOwnedPhysicalComponentPkgs <em>Owned Physical Component Pkgs</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalComponentPkg#getOwnedKeyParts <em>Owned Key Parts</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalComponentPkg#getOwnedDeployments <em>Owned Deployments</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PaPackage#getPhysicalComponentPkg()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='PhysicalComponentPkg'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Package' stereotype='eng.PhysicalComponentPkg'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='a container for physical component entities\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Package' explanation='none' constraints='none'"
 * @generated
 */
public interface PhysicalComponentPkg extends AbstractFunctionalStructure, AssociationPkg {
	/**
	 * Returns the value of the '<em><b>Owned Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Components</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PaPackage#getPhysicalComponentPkg_OwnedComponents()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ownedComponents'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the physical components stored in this package\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::packagedElement' explanation='none' constraints='uml::Package::packagedElement elements on which PhysicalComponent stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<PhysicalComponent> getOwnedComponents();

	/**
	 * Returns the value of the '<em><b>Owned Physical Component Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalComponentPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Physical Component Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Physical Component Pkgs</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PaPackage#getPhysicalComponentPkg_OwnedPhysicalComponentPkgs()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='subPhysicalComponentPkgs'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the sub-(physical component) packages contained in this package\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::nestedPackage#uml::Package::packagedElement' explanation='none' constraints='uml::Package::nestedPackage elements on which PhysicalComponentPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<PhysicalComponentPkg> getOwnedPhysicalComponentPkgs();

	/**
	 * Returns the value of the '<em><b>Owned Key Parts</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.KeyPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Key Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Key Parts</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PaPackage#getPhysicalComponentPkg_OwnedKeyParts()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ownedKeyParts'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the key parts contained in this package\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::packagedElement' explanation='none' constraints='uml::Package::packagedElement elements on which KeyPart stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<KeyPart> getOwnedKeyParts();

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
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PaPackage#getPhysicalComponentPkg_OwnedDeployments()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ownedDeployments'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the physical deployment definitions stored in this package\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::packagedElement' explanation='none' constraints='uml::Package::packagedElement elements on which AbstractDeployment stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<AbstractDeploymentLink> getOwnedDeployments();

} // PhysicalComponentPkg
