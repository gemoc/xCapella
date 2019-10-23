package com.thalesgroup.trt.mde.vp.configuration.configuration.impl;

import java.util.Collection;
import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.AbstractFunctionalBlock;
import org.polarsys.capella.core.data.fa.ComponentFunctionalAllocation;
import org.polarsys.capella.core.data.fa.FunctionalChain;

import com.thalesgroup.trt.mde.vp.configuration.configuration.ComponentConfiguration;
import com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage;
import com.thalesgroup.trt.mde.vp.configuration.configuration.Deployment;
import com.thalesgroup.trt.mde.vp.configuration.configuration.SystemConfiguration;
import com.thalesgroup.trt.mde.vp.mode.mode.Mode_;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.configuration.configuration.impl.SystemConfigurationImpl#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.configuration.configuration.impl.SystemConfigurationImpl#getSupportedModes <em>Supported Modes</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.configuration.configuration.impl.SystemConfigurationImpl#getComponentConfigurations <em>Component Configurations</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.configuration.configuration.impl.SystemConfigurationImpl#getAvailableFunctions <em>Available Functions</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.configuration.configuration.impl.SystemConfigurationImpl#getAvailableComponents <em>Available Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemConfigurationImpl extends NamedElementImpl implements SystemConfiguration {

	/**
	 * The cached value of the '{@link #getDeployment() <em>Deployment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployment()
	 * @generated
	 * @ordered
	 */
	protected Deployment deployment;

	/**
	 * The cached value of the '{@link #getSupportedModes() <em>Supported Modes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedModes()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode_> supportedModes;

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
	protected SystemConfigurationImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.SYSTEM_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Deployment getDeployment() {

		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetDeployment(Deployment newDeployment, NotificationChain msgs) {

		Deployment oldDeployment = deployment;
		deployment = newDeployment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ConfigurationPackage.SYSTEM_CONFIGURATION__DEPLOYMENT, oldDeployment, newDeployment);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setDeployment(Deployment newDeployment) {

		if (newDeployment != deployment) {
			NotificationChain msgs = null;
			if (deployment != null)
				msgs = ((InternalEObject) deployment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ConfigurationPackage.SYSTEM_CONFIGURATION__DEPLOYMENT, null, msgs);
			if (newDeployment != null)
				msgs = ((InternalEObject) newDeployment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ConfigurationPackage.SYSTEM_CONFIGURATION__DEPLOYMENT, null, msgs);
			msgs = basicSetDeployment(newDeployment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.SYSTEM_CONFIGURATION__DEPLOYMENT,
					newDeployment, newDeployment));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<Mode_> getSupportedModes() {

		if (supportedModes == null) {
			supportedModes = new EObjectResolvingEList<Mode_>(Mode_.class, this,
					ConfigurationPackage.SYSTEM_CONFIGURATION__SUPPORTED_MODES);
		}
		return supportedModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EList<ComponentConfiguration> getComponentConfigurations() {

		if (componentConfigurations == null) {
			componentConfigurations = new EObjectResolvingEList<ComponentConfiguration>(ComponentConfiguration.class,
					this, ConfigurationPackage.SYSTEM_CONFIGURATION__COMPONENT_CONFIGURATIONS);
		}
		return componentConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */

	public EList<AbstractFunction> getAvailableFunctions() {
		HashMap<String, AbstractFunction> map = new HashMap<String, AbstractFunction>();

		EList<Mode_> supMode = this.getSupportedModes();

		for (Mode_ mode : supMode) {
			for (FunctionalChain chain : mode.getAvailableFunctionalChains()) {
				for (AbstractFunction function : chain.getEnactedFunctions()) {
					if (!map.containsKey(function.getId()))
						;
					map.put(function.getId(), function);
				}
			}
		}

		return new BasicEList<AbstractFunction>(map.values());

		// TODO: implement this method to return the 'Available Functions' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		//throw new UnsupportedOperationException();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */

	public EList<Component> getAvailableComponents() {
		EList<Component> ret = new BasicEList<Component>();
		EList<AbstractFunction> functions = this.getAvailableFunctions();

		for (AbstractFunction abstractFunction : functions) {
			for (ComponentFunctionalAllocation alloc : abstractFunction.getComponentFunctionalAllocations()) {
				AbstractFunctionalBlock block = alloc.getBlock();
				if (block instanceof Component) {
					ret.add((Component) block);
				}
			}
		}

		return ret;

		// TODO: implement this method to return the 'Available Components' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		//throw new UnsupportedOperationException();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ConfigurationPackage.SYSTEM_CONFIGURATION__DEPLOYMENT:
			return basicSetDeployment(null, msgs);
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
		case ConfigurationPackage.SYSTEM_CONFIGURATION__DEPLOYMENT:
			return getDeployment();
		case ConfigurationPackage.SYSTEM_CONFIGURATION__SUPPORTED_MODES:
			return getSupportedModes();
		case ConfigurationPackage.SYSTEM_CONFIGURATION__COMPONENT_CONFIGURATIONS:
			return getComponentConfigurations();
		case ConfigurationPackage.SYSTEM_CONFIGURATION__AVAILABLE_FUNCTIONS:
			return getAvailableFunctions();
		case ConfigurationPackage.SYSTEM_CONFIGURATION__AVAILABLE_COMPONENTS:
			return getAvailableComponents();
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
		case ConfigurationPackage.SYSTEM_CONFIGURATION__DEPLOYMENT:
			setDeployment((Deployment) newValue);
			return;
		case ConfigurationPackage.SYSTEM_CONFIGURATION__SUPPORTED_MODES:
			getSupportedModes().clear();
			getSupportedModes().addAll((Collection<? extends Mode_>) newValue);
			return;
		case ConfigurationPackage.SYSTEM_CONFIGURATION__COMPONENT_CONFIGURATIONS:
			getComponentConfigurations().clear();
			getComponentConfigurations().addAll((Collection<? extends ComponentConfiguration>) newValue);
			return;
		case ConfigurationPackage.SYSTEM_CONFIGURATION__AVAILABLE_FUNCTIONS:
			getAvailableFunctions().clear();
			getAvailableFunctions().addAll((Collection<? extends AbstractFunction>) newValue);
			return;
		case ConfigurationPackage.SYSTEM_CONFIGURATION__AVAILABLE_COMPONENTS:
			getAvailableComponents().clear();
			getAvailableComponents().addAll((Collection<? extends Component>) newValue);
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
		case ConfigurationPackage.SYSTEM_CONFIGURATION__DEPLOYMENT:
			setDeployment((Deployment) null);
			return;
		case ConfigurationPackage.SYSTEM_CONFIGURATION__SUPPORTED_MODES:
			getSupportedModes().clear();
			return;
		case ConfigurationPackage.SYSTEM_CONFIGURATION__COMPONENT_CONFIGURATIONS:
			getComponentConfigurations().clear();
			return;
		case ConfigurationPackage.SYSTEM_CONFIGURATION__AVAILABLE_FUNCTIONS:
			getAvailableFunctions().clear();
			return;
		case ConfigurationPackage.SYSTEM_CONFIGURATION__AVAILABLE_COMPONENTS:
			getAvailableComponents().clear();
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
		case ConfigurationPackage.SYSTEM_CONFIGURATION__DEPLOYMENT:
			return deployment != null;
		case ConfigurationPackage.SYSTEM_CONFIGURATION__SUPPORTED_MODES:
			return supportedModes != null && !supportedModes.isEmpty();
		case ConfigurationPackage.SYSTEM_CONFIGURATION__COMPONENT_CONFIGURATIONS:
			return componentConfigurations != null && !componentConfigurations.isEmpty();
		case ConfigurationPackage.SYSTEM_CONFIGURATION__AVAILABLE_FUNCTIONS:
			return !getAvailableFunctions().isEmpty();
		case ConfigurationPackage.SYSTEM_CONFIGURATION__AVAILABLE_COMPONENTS:
			return !getAvailableComponents().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemConfigurationImpl