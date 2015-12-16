package com.thalesgroup.trt.mde.vp.expression.expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.TemporalGuard#getAfterDuration <em>After Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getTemporalGuard()
 * @model
 * @generated
 */

public interface TemporalGuard extends AbstractGuard {

	/**
	 * Returns the value of the '<em><b>After Duration</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After Duration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Duration</em>' containment reference.
	 * @see #setAfterDuration(DurationExpression)
	 * @see com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage#getTemporalGuard_AfterDuration()
	 * @model containment="true" required="true"
	 * @generated
	 */

	DurationExpression getAfterDuration();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.expression.expression.TemporalGuard#getAfterDuration <em>After Duration</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Duration</em>' containment reference.
	 * @see #getAfterDuration()
	 * @generated
	 */

	void setAfterDuration(DurationExpression value);

} // TemporalGuard
