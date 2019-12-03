/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Involvement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Mission Involvement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemMissionInvolvement#getMission <em>Mission</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemMissionInvolvement#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getSystemMissionInvolvement()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='MissionSupplierLink'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Dependency' stereotype='eng.MissionSupplierLink'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Link between a system and a mission meaning that the system is involved in the mission\r\n[source:Capella study]' usage\040guideline='n/a' used\040in\040levels='system' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Dependency' explanation='none' constraints='none'"
 * @generated
 */
public interface SystemMissionInvolvement extends Involvement {
	/**
	 * Returns the value of the '<em><b>Mission</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Mission#getInvolvedSystem <em>Involved System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission</em>' reference.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getSystemMissionInvolvement_Mission()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Mission#getInvolvedSystem
	 * @model opposite="involvedSystem" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='client' featureOwner='Dependency'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='mission'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Link to a Mission that the System is involved in\r\n[source:Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	Mission getMission();

	/**
	 * Returns the value of the '<em><b>System</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.System#getParticipationsInMissions <em>Participations In Missions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' reference.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getSystemMissionInvolvement_System()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.System#getParticipationsInMissions
	 * @model opposite="participationsInMissions" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='supplier' featureOwner='Dependency'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='system'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Link to a system that is involved in the system mission\r\n[source:Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.System getSystem();

} // SystemMissionInvolvement
