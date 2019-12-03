/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction;

import org.eclipse.emf.common.util.EList;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.NamedElement;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.AbstractInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.InstanceRole#getAbstractEnds <em>Abstract Ends</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.InstanceRole#getRepresentedInstance <em>Represented Instance</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.InteractionPackage#getInstanceRole()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='InstanceRole'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Lifeline' stereotype='eng.InstanceRole'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Instance role can be compared to UML Lifeline : A lifeline represents an individual participant in the Interaction.\r\n[source:UML Superstructure v2.2]' usage\040guideline='n/a' used\040in\040levels='operational, system, logical, physical' usage\040examples='../img/usage_examples/example_instancerole.png' constraints='none' comment/notes='May be renamed Lifeline' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Lifeline' explanation='none' constraints='none'"
 * @generated
 */
public interface InstanceRole extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Abstract Ends</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.AbstractEnd}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.AbstractEnd#getCovered <em>Covered</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Ends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Ends</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.InteractionPackage#getInstanceRole_AbstractEnds()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.AbstractEnd#getCovered
	 * @model opposite="covered" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='coveredBy' featureOwner='Lifeline'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='abstractEnds'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the start/end points of interactions that are attached to this lifeline\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Lifeline::coveredBy' explanation='none' constraints='Order must be computed'"
	 * @generated
	 */
	EList<AbstractEnd> getAbstractEnds();

	/**
	 * Returns the value of the '<em><b>Represented Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represented Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represented Instance</em>' reference.
	 * @see #setRepresentedInstance(AbstractInstance)
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.InteractionPackage#getInstanceRole_RepresentedInstance()
	 * @model required="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='represents' featureOwner='Lifeline'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='representedInstance'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the instance that this lifeline represents the activity of\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Lifeline::represents' explanation='none' constraints='none'"
	 * @generated
	 */
	AbstractInstance getRepresentedInstance();

	/**
	 * Sets the value of the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.InstanceRole#getRepresentedInstance <em>Represented Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represented Instance</em>' reference.
	 * @see #getRepresentedInstance()
	 * @generated
	 */
	void setRepresentedInstance(AbstractInstance value);

} // InstanceRole
