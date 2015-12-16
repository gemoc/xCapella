package com.thalesgroup.trt.mde.vp.configuration.configuration.impl;

import com.thalesgroup.trt.mde.vp.configuration.configuration.ComponentConfiguration;
import com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage;
import com.thalesgroup.trt.mde.vp.configuration.configuration.ParameterValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

import org.polarsys.capella.core.data.cs.Component;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.configuration.configuration.impl.ComponentConfigurationImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.configuration.configuration.impl.ComponentConfigurationImpl#getComponentParameters <em>Component Parameters</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.configuration.configuration.impl.ComponentConfigurationImpl#getComponentConfigurations <em>Component Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentConfigurationImpl extends NamedElementImpl implements
		ComponentConfiguration {

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected Component component;

	/**
	 * The cached value of the '{@link #getComponentParameters() <em>Component Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterValue> componentParameters;

	/**
	 * The cached value of the '{@link #getComponentConfigurations() <em>Component Configurations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentConfiguration> componentConfigurations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentConfigurationImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.COMPONENT_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Component getComponent() {

		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject) component;
			component = (Component) eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
							this,
							Notification.RESOLVE,
							ConfigurationPackage.COMPONENT_CONFIGURATION__COMPONENT,
							oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Component basicGetComponent() {

		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setComponent(Component newComponent) {

		Component oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ConfigurationPackage.COMPONENT_CONFIGURATION__COMPONENT,
					oldComponent, component));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<ParameterValue> getComponentParameters() {

		if (componentParameters == null) {
			componentParameters = new EObjectContainmentEList<ParameterValue>(
					ParameterValue.class,
					this,
					ConfigurationPackage.COMPONENT_CONFIGURATION__COMPONENT_PARAMETERS);
		}
		return componentParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<ComponentConfiguration> getComponentConfigurations() {

		if (componentConfigurations == null) {
			componentConfigurations = new EObjectResolvingEList<ComponentConfiguration>(
					ComponentConfiguration.class,
					this,
					ConfigurationPackage.COMPONENT_CONFIGURATION__COMPONENT_CONFIGURATIONS);
		}
		return componentConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ConfigurationPackage.COMPONENT_CONFIGURATION__COMPONENT_PARAMETERS:
			return ((InternalEList<?>) getComponentParameters()).basicRemove(
					otherEnd, msgs);
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
		switch (featureID) {
		case ConfigurationPackage.COMPONENT_CONFIGURATION__COMPONENT:
			if (resolve)
				return getComponent();
			return basicGetComponent();
		case ConfigurationPackage.COMPONENT_CONFIGURATION__COMPONENT_PARAMETERS:
			return getComponentParameters();
		case ConfigurationPackage.COMPONENT_CONFIGURATION__COMPONENT_CONFIGURATIONS:
			return getComponentConfigurations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ConfigurationPackage.COMPONENT_CONFIGURATION__COMPONENT:
			setComponent((Component) newValue);
			return;
		case ConfigurationPackage.COMPONENT_CONFIGURATION__COMPONENT_PARAMETERS:
			getComponentParameters().clear();
			getComponentParameters().addAll(
					(Collection<? extends ParameterValue>) newValue);
			return;
		case ConfigurationPackage.COMPONENT_CONFIGURATION__COMPONENT_CONFIGURATIONS:
			getComponentConfigurations().clear();
			getComponentConfigurations().addAll(
					(Collection<? extends ComponentConfiguration>) newValue);
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
		case ConfigurationPackage.COMPONENT_CONFIGURATION__COMPONENT:
			setComponent((Component) null);
			return;
		case ConfigurationPackage.COMPONENT_CONFIGURATION__COMPONENT_PARAMETERS:
			getComponentParameters().clear();
			return;
		case ConfigurationPackage.COMPONENT_CONFIGURATION__COMPONENT_CONFIGURATIONS:
			getComponentConfigurations().clear();
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
		case ConfigurationPackage.COMPONENT_CONFIGURATION__COMPONENT:
			return component != null;
		case ConfigurationPackage.COMPONENT_CONFIGURATION__COMPONENT_PARAMETERS:
			return componentParameters != null
					&& !componentParameters.isEmpty();
		case ConfigurationPackage.COMPONENT_CONFIGURATION__COMPONENT_CONFIGURATIONS:
			return componentConfigurations != null
					&& !componentConfigurations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentConfigurationImpl