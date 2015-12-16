package com.thalesgroup.trt.mde.vp.expression.expression.impl;

import com.thalesgroup.trt.mde.vp.expression.expression.BooleanBinaryExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.BooleanBinaryOperator;
import com.thalesgroup.trt.mde.vp.expression.expression.BooleanExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.impl.BooleanBinaryExpressionImpl#getOperand1 <em>Operand1</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.impl.BooleanBinaryExpressionImpl#getOperand2 <em>Operand2</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.impl.BooleanBinaryExpressionImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanBinaryExpressionImpl extends BooleanExpressionImpl
		implements BooleanBinaryExpression {

	/**
	 * The cached value of the '{@link #getOperand1() <em>Operand1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand1()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpression operand1;

	/**
	 * The cached value of the '{@link #getOperand2() <em>Operand2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand2()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpression operand2;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final BooleanBinaryOperator OPERATOR_EDEFAULT = BooleanBinaryOperator.AND;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected BooleanBinaryOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanBinaryExpressionImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.BOOLEAN_BINARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public BooleanExpression getOperand1() {

		if (operand1 != null && operand1.eIsProxy())
		{
			InternalEObject oldOperand1 = (InternalEObject)operand1;
			operand1 = (BooleanExpression)eResolveProxy(oldOperand1);
			if (operand1 != oldOperand1)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionPackage.BOOLEAN_BINARY_EXPRESSION__OPERAND1, oldOperand1, operand1));
			}
		}
		return operand1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public BooleanExpression basicGetOperand1() {

		return operand1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setOperand1(BooleanExpression newOperand1) {

		BooleanExpression oldOperand1 = operand1;
		operand1 = newOperand1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.BOOLEAN_BINARY_EXPRESSION__OPERAND1, oldOperand1, operand1));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public BooleanExpression getOperand2() {

		if (operand2 != null && operand2.eIsProxy())
		{
			InternalEObject oldOperand2 = (InternalEObject)operand2;
			operand2 = (BooleanExpression)eResolveProxy(oldOperand2);
			if (operand2 != oldOperand2)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionPackage.BOOLEAN_BINARY_EXPRESSION__OPERAND2, oldOperand2, operand2));
			}
		}
		return operand2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public BooleanExpression basicGetOperand2() {

		return operand2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setOperand2(BooleanExpression newOperand2) {

		BooleanExpression oldOperand2 = operand2;
		operand2 = newOperand2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.BOOLEAN_BINARY_EXPRESSION__OPERAND2, oldOperand2, operand2));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public BooleanBinaryOperator getOperator() {

		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setOperator(BooleanBinaryOperator newOperator) {

		BooleanBinaryOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.BOOLEAN_BINARY_EXPRESSION__OPERATOR, oldOperator, operator));

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
			case ExpressionPackage.BOOLEAN_BINARY_EXPRESSION__OPERAND1:
				if (resolve) return getOperand1();
				return basicGetOperand1();
			case ExpressionPackage.BOOLEAN_BINARY_EXPRESSION__OPERAND2:
				if (resolve) return getOperand2();
				return basicGetOperand2();
			case ExpressionPackage.BOOLEAN_BINARY_EXPRESSION__OPERATOR:
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
			case ExpressionPackage.BOOLEAN_BINARY_EXPRESSION__OPERAND1:
					setOperand1((BooleanExpression)newValue);
				return;
			case ExpressionPackage.BOOLEAN_BINARY_EXPRESSION__OPERAND2:
					setOperand2((BooleanExpression)newValue);
				return;
			case ExpressionPackage.BOOLEAN_BINARY_EXPRESSION__OPERATOR:
					setOperator((BooleanBinaryOperator)newValue);
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
			case ExpressionPackage.BOOLEAN_BINARY_EXPRESSION__OPERAND1:
				setOperand1((BooleanExpression)null);
				return;
			case ExpressionPackage.BOOLEAN_BINARY_EXPRESSION__OPERAND2:
				setOperand2((BooleanExpression)null);
				return;
			case ExpressionPackage.BOOLEAN_BINARY_EXPRESSION__OPERATOR:
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
			case ExpressionPackage.BOOLEAN_BINARY_EXPRESSION__OPERAND1:
				return operand1 != null;
			case ExpressionPackage.BOOLEAN_BINARY_EXPRESSION__OPERAND2:
				return operand2 != null;
			case ExpressionPackage.BOOLEAN_BINARY_EXPRESSION__OPERATOR:
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

} //BooleanBinaryExpressionImpl