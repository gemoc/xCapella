package com.thalesgroup.trt.mde.vp.expression.expression.impl;

import com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage;
import com.thalesgroup.trt.mde.vp.expression.expression.NumericBinaryExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.NumericExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.impl.NumericBinaryExpressionImpl#getOperand1 <em>Operand1</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.impl.NumericBinaryExpressionImpl#getOperand2 <em>Operand2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumericBinaryExpressionImpl extends NumericExpressionImpl
		implements NumericBinaryExpression {

	/**
	 * The cached value of the '{@link #getOperand1() <em>Operand1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand1()
	 * @generated
	 * @ordered
	 */
	protected NumericExpression operand1;

	/**
	 * The cached value of the '{@link #getOperand2() <em>Operand2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand2()
	 * @generated
	 * @ordered
	 */
	protected NumericExpression operand2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericBinaryExpressionImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.NUMERIC_BINARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NumericExpression getOperand1() {

		return operand1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetOperand1(NumericExpression newOperand1,
			NotificationChain msgs) {

		NumericExpression oldOperand1 = operand1;
		operand1 = newOperand1;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.NUMERIC_BINARY_EXPRESSION__OPERAND1, oldOperand1, newOperand1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setOperand1(NumericExpression newOperand1) {

		if (newOperand1 != operand1)
		{
			NotificationChain msgs = null;
			if (operand1 != null)
				msgs = ((InternalEObject)operand1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.NUMERIC_BINARY_EXPRESSION__OPERAND1, null, msgs);
			if (newOperand1 != null)
				msgs = ((InternalEObject)newOperand1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.NUMERIC_BINARY_EXPRESSION__OPERAND1, null, msgs);
			msgs = basicSetOperand1(newOperand1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.NUMERIC_BINARY_EXPRESSION__OPERAND1, newOperand1, newOperand1));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NumericExpression getOperand2() {

		return operand2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetOperand2(NumericExpression newOperand2,
			NotificationChain msgs) {

		NumericExpression oldOperand2 = operand2;
		operand2 = newOperand2;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.NUMERIC_BINARY_EXPRESSION__OPERAND2, oldOperand2, newOperand2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setOperand2(NumericExpression newOperand2) {

		if (newOperand2 != operand2)
		{
			NotificationChain msgs = null;
			if (operand2 != null)
				msgs = ((InternalEObject)operand2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.NUMERIC_BINARY_EXPRESSION__OPERAND2, null, msgs);
			if (newOperand2 != null)
				msgs = ((InternalEObject)newOperand2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.NUMERIC_BINARY_EXPRESSION__OPERAND2, null, msgs);
			msgs = basicSetOperand2(newOperand2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.NUMERIC_BINARY_EXPRESSION__OPERAND2, newOperand2, newOperand2));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID)
		{
			case ExpressionPackage.NUMERIC_BINARY_EXPRESSION__OPERAND1:
				return basicSetOperand1(null, msgs);
			case ExpressionPackage.NUMERIC_BINARY_EXPRESSION__OPERAND2:
				return basicSetOperand2(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case ExpressionPackage.NUMERIC_BINARY_EXPRESSION__OPERAND1:
				return getOperand1();
			case ExpressionPackage.NUMERIC_BINARY_EXPRESSION__OPERAND2:
				return getOperand2();
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
			case ExpressionPackage.NUMERIC_BINARY_EXPRESSION__OPERAND1:
					setOperand1((NumericExpression)newValue);
				return;
			case ExpressionPackage.NUMERIC_BINARY_EXPRESSION__OPERAND2:
					setOperand2((NumericExpression)newValue);
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
			case ExpressionPackage.NUMERIC_BINARY_EXPRESSION__OPERAND1:
				setOperand1((NumericExpression)null);
				return;
			case ExpressionPackage.NUMERIC_BINARY_EXPRESSION__OPERAND2:
				setOperand2((NumericExpression)null);
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
			case ExpressionPackage.NUMERIC_BINARY_EXPRESSION__OPERAND1:
				return operand1 != null;
			case ExpressionPackage.NUMERIC_BINARY_EXPRESSION__OPERAND2:
				return operand2 != null;
		}
		return super.eIsSet(featureID);
	}

} //NumericBinaryExpressionImpl