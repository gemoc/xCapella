/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la;

import org.eclipse.emf.common.util.EList;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.AbstractFunctionalStructure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Actor Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.LogicalActorPkg#getOwnedLogicalActorPkgs <em>Owned Logical Actor Pkgs</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.LogicalActorPkg#getOwnedLogicalActors <em>Owned Logical Actors</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.LaPackage#getLogicalActorPkg()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Package that contains LogicalActor elements' usage\040guideline='n/a' used\040in\040levels='logical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Package' explanation='none' constraints='none'"
 * @generated
 */
public interface LogicalActorPkg extends AbstractFunctionalStructure {
	/**
	 * Returns the value of the '<em><b>Owned Logical Actor Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.LogicalActorPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Logical Actor Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Logical Actor Pkgs</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.LaPackage#getLogicalActorPkg_OwnedLogicalActorPkgs()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='sub-(logical actor) packages contained in this package\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::nestedPackage#uml::Package::packagedElement' explanation='none' constraints='uml::Package::nestedPackage elements on which LogicalActorPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<LogicalActorPkg> getOwnedLogicalActorPkgs();

	/**
	 * Returns the value of the '<em><b>Owned Logical Actors</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.LogicalActor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Logical Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Logical Actors</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.LaPackage#getLogicalActorPkg_OwnedLogicalActors()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='logical actors contained in this package\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::packagedElement' explanation='none' constraints='uml::Package::packagedElement elements on which LogicalActor stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<LogicalActor> getOwnedLogicalActors();

} // LogicalActorPkg
