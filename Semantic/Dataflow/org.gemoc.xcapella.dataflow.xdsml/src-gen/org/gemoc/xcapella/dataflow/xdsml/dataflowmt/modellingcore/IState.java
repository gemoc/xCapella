/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IState</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.IState#getReferencedStates <em>Referenced States</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.IState#getExploitedStates <em>Exploited States</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.ModellingcorePackage#getIState()
 * @model interface="true" abstract="true"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='A vertex is an abstraction of a node in a state machine graph. In general, it can be the source or destination of any number\r\nof transitions.\r\n[source:UML Superstructure v2.2]' usage\040guideline='n/a (abstract)' used\040in\040levels='operational,system,logical,physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='uml::Vertex' constraints='none'"
 * @generated
 */
public interface IState extends AbstractNamedElement {
	/**
	 * Returns the value of the '<em><b>Referenced States</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.IState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced States</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.ModellingcorePackage#getIState_ReferencedStates()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='none' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='none' constraints='none'"
	 * @generated
	 */
	EList<IState> getReferencedStates();

	/**
	 * Returns the value of the '<em><b>Exploited States</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.IState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exploited States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exploited States</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.ModellingcorePackage#getIState_ExploitedStates()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='none' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='none' constraints='none'"
	 * @generated
	 */
	EList<IState> getExploitedStates();

} // IState
