/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.LiteralBooleanValue#isValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.DatavaluePackage#getLiteralBooleanValue()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='LiteralBooleanValue'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='LiteralBoolean' stereotype='eng.LiteralBooleanValue'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='A literal Boolean is a specification of a Boolean value\r\n[source: UML superstructure v2.2]' usage\040guideline='n/a' used\040in\040levels='n/a' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::LiteralBoolean' explanation='none' constraints='none'"
 * @generated
 */
public interface LiteralBooleanValue extends AbstractBooleanValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.DatavaluePackage#getLiteralBooleanValue_Value()
	 * @model annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='value' featureOwner='LiteralBoolean'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the value \"true\" or \"false\"\r\n[source: Capella study]' constraints='none' type='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::LiteralBoolean::value' explanation='none' constraints='none'"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.LiteralBooleanValue#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

} // LiteralBooleanValue
