/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.AbstractEnd#getEvent <em>Event</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.AbstractEnd#getCovered <em>Covered</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.InteractionPackage#getAbstractEnd()
 * @model abstract="true"
 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='AbstractEnd'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='OccurrenceSpecification'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='This concept can be compared to UML OccurrenceSpecification : The semantics of an OccurrenceSpecification is just the trace of that single OccurrenceSpecification.\r\nThe understanding and deeper meaning of the OccurrenceSpecification is dependent upon the associated Message and the\r\ninformation that it conveys.\r\n[source:UML Superstructure v2.2]' usage\040guideline='n/a (Abstract)' used\040in\040levels='operational, system, logical, physical' usage\040examples='n/a' constraints='none' comment/notes='Should be renamed OccurrenceSpecification to map UML concept' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='uml::OccurrenceSpecification' constraints='none'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the scenario that this interaction endpoint is related to\r\n[source: Capella study]' constraints='none' comment/notes='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::InteractionFragment::enclosingInteraction' explanation='none' constraints='none'"
 * @generated
 */
public interface AbstractEnd extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(Event)
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.InteractionPackage#getAbstractEnd_Event()
	 * @model required="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='event' featureOwner='OccurrenceSpecification'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='event'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the Event associated to this interaction endpoint\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::OccurrenceSpecification::event' explanation='none' constraints='none'"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.AbstractEnd#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Covered</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.InstanceRole#getAbstractEnds <em>Abstract Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Covered</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covered</em>' reference.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.InteractionPackage#getAbstractEnd_Covered()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.InstanceRole#getAbstractEnds
	 * @model opposite="abstractEnds" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='covered' featureOwner='InteractionFragment'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='instanceRole'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the instance role (lifeline) to which this interaction endpoint is attached\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::InteractionFragment::covered' explanation='none' constraints='Multiplicity must be [1..1]'"
	 * @generated
	 */
	InstanceRole getCovered();

} // AbstractEnd
