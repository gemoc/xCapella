/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa;

import org.eclipse.emf.common.util.EList;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FunctionPkg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Activity Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalActivityPkg#getOwnedOperationalActivities <em>Owned Operational Activities</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalActivityPkg#getOwnedOperationalActivityPkgs <em>Owned Operational Activity Pkgs</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getOperationalActivityPkg()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='container for operational activity elements\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='operational' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Package' explanation='none' constraints='none'"
 * @generated
 */
public interface OperationalActivityPkg extends FunctionPkg {
	/**
	 * Returns the value of the '<em><b>Owned Operational Activities</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operational Activities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operational Activities</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getOperationalActivityPkg_OwnedOperationalActivities()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the operational activities contained in this package\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::packagedElement' explanation='none' constraints='uml::Package::packagedElement elements on which OperationalActivity stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<OperationalActivity> getOwnedOperationalActivities();

	/**
	 * Returns the value of the '<em><b>Owned Operational Activity Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalActivityPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operational Activity Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operational Activity Pkgs</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getOperationalActivityPkg_OwnedOperationalActivityPkgs()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='sub-packages of operational activities, contained in this package\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::nestedPackage#uml::Package::packagedElement' explanation='none' constraints='uml::Package::nestedPackage elements on which OperationalActivityPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<OperationalActivityPkg> getOwnedOperationalActivityPkgs();

} // OperationalActivityPkg
