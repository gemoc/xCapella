package com.thalesgroup.trt.mde.vp.expression.expression.impl;

import com.thalesgroup.trt.mde.vp.expression.expression.EventBinaryExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.EventBinaryOperator;
import com.thalesgroup.trt.mde.vp.expression.expression.EventExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.impl.EventBinaryExpressionImpl#getOperand1 <em>Operand1</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.impl.EventBinaryExpressionImpl#getOperand2 <em>Operand2</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.expression.expression.impl.EventBinaryExpressionImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventBinaryExpressionImpl extends EventExpressionImpl implements
		EventBinaryExpression {

	/**
	 * The cached value of the '{@link #getOperand1() <em>Operand1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand1()
	 * @generated
	 * @ordered
	 */
	protected EventExpression operand1;

	/**
	 * The cached value of the '{@link #getOperand2() <em>Operand2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand2()
	 * @generated
	 * @ordered
	 */
	protected EventExpression operand2;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final EventBinaryOperator OPERATOR_EDEFAULT = EventBinaryOperator.AND;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected EventBinaryOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventBinaryExpressionImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.EVENT_BINARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EventExpression getOperand1() {

		return operand1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetOperand1(EventExpression newOperand1,
			NotificationChain msgs) {

		EventExpression oldOperand1 = operand1;
		operand1 = newOperand1;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.EVENT_BINARY_EXPRESSION__OPERAND1, oldOperand1, newOperand1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setOperand1(EventExpression newOperand1) {

		if (newOperand1 != operand1)
		{
			NotificationChain msgs = null;
			if (operand1 != null)
				msgs = ((InternalEObject)operand1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.EVENT_BINARY_EXPRESSION__OPERAND1, null, msgs);
			if (newOperand1 != null)
				msgs = ((InternalEObject)newOperand1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.EVENT_BINARY_EXPRESSION__OPERAND1, null, msgs);
			msgs = basicSetOperand1(newOperand1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.EVENT_BINARY_EXPRESSION__OPERAND1, newOperand1, newOperand1));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EventExpression getOperand2() {

		return operand2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetOperand2(EventExpression newOperand2,
			NotificationChain msgs) {

		EventExpression oldOperand2 = operand2;
		operand2 = newOperand2;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.EVENT_BINARY_EXPRESSION__OPERAND2, oldOperand2, newOperand2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setOperand2(EventExpression newOperand2) {

		if (newOperand2 != operand2)
		{
			NotificationChain msgs = null;
			if (operand2 != null)
				msgs = ((InternalEObject)operand2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.EVENT_BINARY_EXPRESSION__OPERAND2, null, msgs);
			if (newOperand2 != null)
				msgs = ((InternalEObject)newOperand2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.EVENT_BINARY_EXPRESSION__OPERAND2, null, msgs);
			msgs = basicSetOperand2(newOperand2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.EVENT_BINARY_EXPRESSION__OPERAND2, newOperand2, newOperand2));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EventBinaryOperator getOperator() {

		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setOperator(EventBinaryOperator newOperator) {

		EventBinaryOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.EVENT_BINARY_EXPRESSION__OPERATOR, oldOperator, operator));

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
			case ExpressionPackage.EVENT_BINARY_EXPRESSION__OPERAND1:
				return basicSetOperand1(null, msgs);
			case ExpressionPackage.EVENT_BINARY_EXPRESSION__OPERAND2:
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
			case ExpressionPackage.EVENT_BINARY_EXPRESSION__OPERAND1:
				return getOperand1();
			case ExpressionPackage.EVENT_BINARY_EXPRESSION__OPERAND2:
				return getOperand2();
			case ExpressionPackage.EVENT_BINARY_EXPRESSION__OPERATOR:
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
			case ExpressionPackage.EVENT_BINARY_EXPRESSION__OPERAND1:
					setOperand1((EventExpression)newValue);
				return;
			case ExpressionPackage.EVENT_BINARY_EXPRESSION__OPERAND2:
					setOperand2((EventExpression)newValue);
				return;
			case ExpressionPackage.EVENT_BINARY_EXPRESSION__OPERATOR:
					setOperator((EventBinaryOperator)newValue);
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
			case ExpressionPackage.EVENT_BINARY_EXPRESSION__OPERAND1:
				setOperand1((EventExpression)null);
				return;
			case ExpressionPackage.EVENT_BINARY_EXPRESSION__OPERAND2:
				setOperand2((EventExpression)null);
				return;
			case ExpressionPackage.EVENT_BINARY_EXPRESSION__OPERATOR:
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
			case ExpressionPackage.EVENT_BINARY_EXPRESSION__OPERAND1:
				return operand1 != null;
			case ExpressionPackage.EVENT_BINARY_EXPRESSION__OPERAND2:
				return operand2 != null;
			case ExpressionPackage.EVENT_BINARY_EXPRESSION__OPERATOR:
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

} //EventBinaryExpressionImpl