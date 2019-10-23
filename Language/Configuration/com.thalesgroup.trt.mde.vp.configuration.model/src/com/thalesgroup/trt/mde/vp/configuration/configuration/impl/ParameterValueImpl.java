package com.thalesgroup.trt.mde.vp.configuration.configuration.impl;

import com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage;
import com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPort;
import com.thalesgroup.trt.mde.vp.configuration.configuration.ParameterValue;

import com.thalesgroup.trt.mde.vp.expression.expression.Expression;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.configuration.configuration.impl.ParameterValueImpl#getPort <em>Port</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.configuration.configuration.impl.ParameterValueImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterValueImpl extends NamedElementImpl implements ParameterValue {

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationPort port;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Expression value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterValueImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.PARAMETER_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public ConfigurationPort getPort() {

		if (port != null && port.eIsProxy()) {
			InternalEObject oldPort = (InternalEObject) port;
			port = (ConfigurationPort) eResolveProxy(oldPort);
			if (port != oldPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ConfigurationPackage.PARAMETER_VALUE__PORT, oldPort, port));
			}
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public ConfigurationPort basicGetPort() {

		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setPort(ConfigurationPort newPort) {

		ConfigurationPort oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.PARAMETER_VALUE__PORT, oldPort,
					port));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Expression getValue() {

		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject) value;
			value = (Expression) eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ConfigurationPackage.PARAMETER_VALUE__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Expression basicGetValue() {

		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setValue(Expression newValue) {

		Expression oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.PARAMETER_VALUE__VALUE, oldValue,
					value));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ConfigurationPackage.PARAMETER_VALUE__PORT:
			if (resolve)
				return getPort();
			return basicGetPort();
		case ConfigurationPackage.PARAMETER_VALUE__VALUE:
			if (resolve)
				return getValue();
			return basicGetValue();
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
		switch (featureID) {
		case ConfigurationPackage.PARAMETER_VALUE__PORT:
			setPort((ConfigurationPort) newValue);
			return;
		case ConfigurationPackage.PARAMETER_VALUE__VALUE:
			setValue((Expression) newValue);
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
		switch (featureID) {
		case ConfigurationPackage.PARAMETER_VALUE__PORT:
			setPort((ConfigurationPort) null);
			return;
		case ConfigurationPackage.PARAMETER_VALUE__VALUE:
			setValue((Expression) null);
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
		switch (featureID) {
		case ConfigurationPackage.PARAMETER_VALUE__PORT:
			return port != null;
		case ConfigurationPackage.PARAMETER_VALUE__VALUE:
			return value != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterValueImpl