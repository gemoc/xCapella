/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information;

import org.eclipse.emf.common.util.EList;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.InstanceRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.AbstractInstance#getRepresentingInstanceRoles <em>Representing Instance Roles</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.InformationPackage#getAbstractInstance()
 * @model abstract="true"
 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='AbstractInstance'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Property'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Base class used to derive specific types of instances of classifiers (e.g very high-level/generic class)\r\n[source: Capella study]' usage\040guideline='n/a (Abstract)' used\040in\040levels='n/a' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='uml::Property' constraints='none'"
 * @generated
 */
public interface AbstractInstance extends Property {
	/**
	 * Returns the value of the '<em><b>Representing Instance Roles</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.InstanceRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representing Instance Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representing Instance Roles</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.InformationPackage#getAbstractInstance_RepresentingInstanceRoles()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<InstanceRole> getRepresentingInstanceRoles();

} // AbstractInstance
