/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shallow History Pseudo State</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.CapellacommonPackage#getShallowHistoryPseudoState()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Shallow history represents the most recent active substate of its containing state (but not the substates of that substate).\r\nA composite state can have at most one shallow history vertex. A transition coming into the shallow history vertex is\r\nequivalent to a transition coming into the most recent active substate of a state. At most one transition may originate\r\nfrom the history connector to the default shallow history state. This transition is taken in case the composite state had\r\nnever been active before. The entry action of the state represented by the shallow history is performed.\r\n[source: UML superstructure v2.4]' usage\040guideline='n/a' used\040in\040levels='operational, system, logical, physical' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Pseudostate' explanation='none' constraints='uml::Pseudostate elements for which kind is shallowHistory'"
 * @generated
 */
public interface ShallowHistoryPseudoState extends Pseudostate {
} // ShallowHistoryPseudoState
