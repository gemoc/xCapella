package com.thalesgroup.trt.mde.vp.configuration.configuration.impl;

import com.thalesgroup.trt.mde.vp.configuration.configuration.ComponentConfiguration;
import com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage;
import com.thalesgroup.trt.mde.vp.configuration.configuration.Configurations;
import com.thalesgroup.trt.mde.vp.configuration.configuration.SystemConfiguration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configurations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.configuration.configuration.impl.ConfigurationsImpl#getSystemConfigurations <em>System Configurations</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.configuration.configuration.impl.ConfigurationsImpl#getComponentConfigurations <em>Component Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationsImpl extends NamedElementImpl implements
		Configurations {

	/**
	 * The cached value of the '{@link #getSystemConfigurations() <em>System Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemConfiguration> systemConfigurations;

	/**
	 * The cached value of the '{@link #getComponentConfigurations() <em>Component Configurations</em>}' containment reference list.
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
	protected ConfigurationsImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.CONFIGURATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<SystemConfiguration> getSystemConfigurations() {

		if (systemConfigurations == null) {
			systemConfigurations = new EObjectContainmentEList<SystemConfiguration>(
					SystemConfiguration.class, this,
					ConfigurationPackage.CONFIGURATIONS__SYSTEM_CONFIGURATIONS);
		}
		return systemConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<ComponentConfiguration> getComponentConfigurations() {

		if (componentConfigurations == null) {
			componentConfigurations = new EObjectContainmentEList<ComponentConfiguration>(
					ComponentConfiguration.class,
					this,
					ConfigurationPackage.CONFIGURATIONS__COMPONENT_CONFIGURATIONS);
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
		case ConfigurationPackage.CONFIGURATIONS__SYSTEM_CONFIGURATIONS:
			return ((InternalEList<?>) getSystemConfigurations()).basicRemove(
					otherEnd, msgs);
		case ConfigurationPackage.CONFIGURATIONS__COMPONENT_CONFIGURATIONS:
			return ((InternalEList<?>) getComponentConfigurations())
					.basicRemove(otherEnd, msgs);
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
		case ConfigurationPackage.CONFIGURATIONS__SYSTEM_CONFIGURATIONS:
			return getSystemConfigurations();
		case ConfigurationPackage.CONFIGURATIONS__COMPONENT_CONFIGURATIONS:
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
		case ConfigurationPackage.CONFIGURATIONS__SYSTEM_CONFIGURATIONS:
			getSystemConfigurations().clear();
			getSystemConfigurations().addAll(
					(Collection<? extends SystemConfiguration>) newValue);
			return;
		case ConfigurationPackage.CONFIGURATIONS__COMPONENT_CONFIGURATIONS:
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
		case ConfigurationPackage.CONFIGURATIONS__SYSTEM_CONFIGURATIONS:
			getSystemConfigurations().clear();
			return;
		case ConfigurationPackage.CONFIGURATIONS__COMPONENT_CONFIGURATIONS:
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
		case ConfigurationPackage.CONFIGURATIONS__SYSTEM_CONFIGURATIONS:
			return systemConfigurations != null
					&& !systemConfigurations.isEmpty();
		case ConfigurationPackage.CONFIGURATIONS__COMPONENT_CONFIGURATIONS:
			return componentConfigurations != null
					&& !componentConfigurations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationsImpl