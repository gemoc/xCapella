/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Allocation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.OperationAllocation#getAllocatedOperation <em>Allocated Operation</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.OperationAllocation#getAllocatingOperation <em>Allocating Operation</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.InformationPackage#getOperationAllocation()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='Operation Allocation'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Mediator class supporting the implementation of the allocation link between two Operations\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='n/a' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='SysML::Allocations::Allocate' explanation='none' constraints='none'"
 * @generated
 */
public interface OperationAllocation extends Allocation {
	/**
	 * Returns the value of the '<em><b>Allocated Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Operation</em>' reference.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.InformationPackage#getOperationAllocation_AllocatedOperation()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='contains the \"target\" of the allocation link\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	Operation getAllocatedOperation();

	/**
	 * Returns the value of the '<em><b>Allocating Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocating Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocating Operation</em>' reference.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.InformationPackage#getOperationAllocation_AllocatingOperation()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='contains the \"source\" of the allocation link\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	Operation getAllocatingOperation();

} // OperationAllocation
