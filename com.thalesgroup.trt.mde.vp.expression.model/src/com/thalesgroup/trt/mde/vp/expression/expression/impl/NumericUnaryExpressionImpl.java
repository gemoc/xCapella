package com.thalesgroup.trt.mde.vp.expression.expression.impl;

import com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage;
import com.thalesgroup.trt.mde.vp.expression.expression.NumericUnaryExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.NumericUnaryOperator;
import com.thalesgroup.trt.mde.vp.expression.expression.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.impl.NumericUnaryExpressionImpl#getOperand <em>Operand</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.impl.NumericUnaryExpressionImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumericUnaryExpressionImpl extends NumericExpressionImpl implements
		NumericUnaryExpression {

	/**
	 * The cached value of the '{@link #getOperand() <em>Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand()
	 * @generated
	 * @ordered
	 */
	protected Variable operand;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final NumericUnaryOperator OPERATOR_EDEFAULT = NumericUnaryOperator.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected NumericUnaryOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericUnaryExpressionImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.NUMERIC_UNARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Variable getOperand() {

		if (operand != null && operand.eIsProxy())
		{
			InternalEObject oldOperand = (InternalEObject)operand;
			operand = (Variable)eResolveProxy(oldOperand);
			if (operand != oldOperand)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionPackage.NUMERIC_UNARY_EXPRESSION__OPERAND, oldOperand, operand));
			}
		}
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Variable basicGetOperand() {

		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setOperand(Variable newOperand) {

		Variable oldOperand = operand;
		operand = newOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.NUMERIC_UNARY_EXPRESSION__OPERAND, oldOperand, operand));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NumericUnaryOperator getOperator() {

		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setOperator(NumericUnaryOperator newOperator) {

		NumericUnaryOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.NUMERIC_UNARY_EXPRESSION__OPERATOR, oldOperator, operator));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID)
		{
			case ExpressionPackage.NUMERIC_UNARY_EXPRESSION__OPERAND:
				if (resolve) return getOperand();
				return basicGetOperand();
			case ExpressionPackage.NUMERIC_UNARY_EXPRESSION__OPERATOR:
				return getOperator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID)
		{
			case ExpressionPackage.NUMERIC_UNARY_EXPRESSION__OPERAND:
					setOperand((Variable)newValue);
				return;
			case ExpressionPackage.NUMERIC_UNARY_EXPRESSION__OPERATOR:
					setOperator((NumericUnaryOperator)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID)
		{
			case ExpressionPackage.NUMERIC_UNARY_EXPRESSION__OPERAND:
				setOperand((Variable)null);
				return;
			case ExpressionPackage.NUMERIC_UNARY_EXPRESSION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID)
		{
			case ExpressionPackage.NUMERIC_UNARY_EXPRESSION__OPERAND:
				return operand != null;
			case ExpressionPackage.NUMERIC_UNARY_EXPRESSION__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operator: "); //$NON-NLS-1$
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //NumericUnaryExpressionImpl