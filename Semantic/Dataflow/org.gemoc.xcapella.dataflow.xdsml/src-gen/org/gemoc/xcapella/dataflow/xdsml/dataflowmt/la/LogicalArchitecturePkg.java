/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la;

import org.eclipse.emf.common.util.EList;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.BlockArchitecturePkg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Architecture Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.LogicalArchitecturePkg#getOwnedLogicalArchitectures <em>Owned Logical Architectures</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.LaPackage#getLogicalArchitecturePkg()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='LogicalArchitecturePkg'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Package' stereotype='eng.LogicalArchitecturePkg'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Package that contains LogicalArchitecture elements\r\n[source:Capella study]' usage\040guideline='n/a' used\040in\040levels='logical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Package' explanation='none' constraints='none'"
 * @generated
 */
public interface LogicalArchitecturePkg extends BlockArchitecturePkg {
	/**
	 * Returns the value of the '<em><b>Owned Logical Architectures</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.LogicalArchitecture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Logical Architectures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Logical Architectures</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.LaPackage#getLogicalArchitecturePkg_OwnedLogicalArchitectures()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ownedLogicalArchitectures'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Logical architectures set\r\n[source:Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::nestedPackage#uml::Package::packagedElement' explanation='none' constraints='uml::Package::packagedElement elements on which LogicalArchitecture stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<LogicalArchitecture> getOwnedLogicalArchitectures();

} // LogicalArchitecturePkg
