package com.thalesgroup.trt.mde.vp.expression.expression;

import org.polarsys.capella.core.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getAbstractGuard()
 * @model abstract="true"
 * @generated
 */

public interface AbstractGuard extends NamedElement {

	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */

	String asString();

	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model p_StringRequired="true"
	 * @generated
	 */

	void fromString(String p_String);

} // AbstractGuard
