/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.TypedElement;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Parameter#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Parameter#getPassingMode <em>Passing Mode</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.InformationPackage#getParameter()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='Parameter'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Parameter' stereotype='eng.Parameter'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='A parameter is a specification of an argument used to pass information into or out of an invocation of a behavioral\r\nfeature.\r\n[source: UML superstructure v2.2]' usage\040guideline='n/a' used\040in\040levels='system,logical,physical,epbs' usage\040examples='../img/usage_examples/operation_parameters.png' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Parameter' explanation='none' constraints='none'"
 * @generated
 */
public interface Parameter extends TypedElement, MultiplicityElement, AbstractParameter {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ParameterDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ParameterDirection
	 * @see #setDirection(ParameterDirection)
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.InformationPackage#getParameter_Direction()
	 * @model annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='direction' featureOwner='Parameter'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='specifies whether the parameter is an input, an output, or both.\r\n[source: Capella study]' constraints='none' type='see ParameterDirection definition' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Parameter::direction' explanation='none' constraints='none'"
	 * @generated
	 */
	ParameterDirection getDirection();

	/**
	 * Sets the value of the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Parameter#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ParameterDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(ParameterDirection value);

	/**
	 * Returns the value of the '<em><b>Passing Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.PassingMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passing Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passing Mode</em>' attribute.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.PassingMode
	 * @see #setPassingMode(PassingMode)
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.InformationPackage#getParameter_PassingMode()
	 * @model annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='passingMode' fromStereotype='true' featureOwner='eng.Parameter'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='specifies the way the parameter is passed along from the caller to the callee\r\n[source: Capella study]' constraints='none' type='see PassingMode enumeration definition for possible values' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	PassingMode getPassingMode();

	/**
	 * Sets the value of the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Parameter#getPassingMode <em>Passing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passing Mode</em>' attribute.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.PassingMode
	 * @see #getPassingMode()
	 * @generated
	 */
	void setPassingMode(PassingMode value);

} // Parameter
