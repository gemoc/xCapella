/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx;

import org.eclipse.emf.common.util.EList;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.MissionPkg#getOwnedMissionPkgs <em>Owned Mission Pkgs</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.MissionPkg#getOwnedMissions <em>Owned Missions</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getMissionPkg()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='MissionPkg'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Package' stereotype='eng.MissionPkg'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Package that contains system missions\r\n[source:Capella study]' usage\040guideline='n/a' used\040in\040levels='system' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Package' explanation='none' constraints='none'"
 * @generated
 */
public interface MissionPkg extends Structure {
	/**
	 * Returns the value of the '<em><b>Owned Mission Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.MissionPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Mission Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Mission Pkgs</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getMissionPkg_OwnedMissionPkgs()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='subMissionPkgs'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Sub packages that contain system missions\r\n[Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::nestedPackage#uml::Package::packagedElement' explanation='none' constraints='uml::Package::nestedPackage elements on which MissionPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<MissionPkg> getOwnedMissionPkgs();

	/**
	 * Returns the value of the '<em><b>Owned Missions</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Mission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Missions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Missions</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getMissionPkg_OwnedMissions()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ownedMissions'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Set of system missions that are defined at that level of package\r\n[Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::nestedPackage#uml::Package::packagedElement' explanation='none' constraints='uml::Package::packagedElement elements on which Mission stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<Mission> getOwnedMissions();

} // MissionPkg
