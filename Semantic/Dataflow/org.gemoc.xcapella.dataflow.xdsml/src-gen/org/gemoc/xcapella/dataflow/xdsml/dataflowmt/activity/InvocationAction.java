/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invocation Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.InvocationAction#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityPackage#getInvocationAction()
 * @model abstract="true"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='In addition to targeting an object, invocation actions can also invoke behavioral features on ports from where the\r\ninvocation requests are routed onwards on links deriving from attached connectors. Invocation actions may also be sent to\r\na target via a given port, either on the sending object or on another object.\r\n[source: UML superstructure v2.2]' usage\040guideline='n/a' used\040in\040levels='n/a' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='uml::InvocationAction' constraints='none'"
 * @generated
 */
public interface InvocationAction extends AbstractAction {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.InputPin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityPackage#getInvocationAction_Arguments()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='port(s) of the receiver object on which the behavioral feature is invoked\r\n[source: UML superstructure v2.2]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::InvocationAction::argument' explanation='none' constraints='none'"
	 * @generated
	 */
	EList<InputPin> getArguments();

} // InvocationAction
