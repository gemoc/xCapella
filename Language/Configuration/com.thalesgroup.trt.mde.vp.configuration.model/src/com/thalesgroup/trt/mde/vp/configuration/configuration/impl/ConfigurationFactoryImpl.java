package com.thalesgroup.trt.mde.vp.configuration.configuration.impl;

import com.thalesgroup.trt.mde.vp.configuration.configuration.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.polarsys.capella.common.lib.IdGenerator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationFactoryImpl extends EFactoryImpl implements ConfigurationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfigurationFactory init() {
		try {
			ConfigurationFactory theConfigurationFactory = (ConfigurationFactory) EPackage.Registry.INSTANCE
					.getEFactory(ConfigurationPackage.eNS_URI);
			if (theConfigurationFactory != null) {
				return theConfigurationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConfigurationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ConfigurationPackage.CONFIGURATIONS:
			return createConfigurations();
		case ConfigurationPackage.SYSTEM_CONFIGURATION:
			return createSystemConfiguration();
		case ConfigurationPackage.COMPONENT_CONFIGURATION:
			return createComponentConfiguration();
		case ConfigurationPackage.DEPLOYMENT:
			return createDeployment();
		case ConfigurationPackage.PARAMETER_VALUE:
			return createParameterValue();
		case ConfigurationPackage.CONFIGURATION_PORT:
			return createConfigurationPort();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configurations createConfigurations() {
		ConfigurationsImpl configurations = new ConfigurationsImpl();
		//begin-capella-code

		configurations.setId(IdGenerator.createId());

		//end-capella-code
		return configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemConfiguration createSystemConfiguration() {
		SystemConfigurationImpl systemConfiguration = new SystemConfigurationImpl();
		//begin-capella-code

		systemConfiguration.setId(IdGenerator.createId());

		//end-capella-code
		return systemConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentConfiguration createComponentConfiguration() {
		ComponentConfigurationImpl componentConfiguration = new ComponentConfigurationImpl();
		//begin-capella-code

		componentConfiguration.setId(IdGenerator.createId());

		//end-capella-code
		return componentConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment createDeployment() {
		DeploymentImpl deployment = new DeploymentImpl();
		//begin-capella-code

		deployment.setId(IdGenerator.createId());

		//end-capella-code
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValue createParameterValue() {
		ParameterValueImpl parameterValue = new ParameterValueImpl();
		//begin-capella-code

		parameterValue.setId(IdGenerator.createId());

		//end-capella-code
		return parameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationPort createConfigurationPort() {
		ConfigurationPortImpl configurationPort = new ConfigurationPortImpl();
		//begin-capella-code

		configurationPort.setId(IdGenerator.createId());

		//end-capella-code
		return configurationPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationPackage getConfigurationPackage() {
		return (ConfigurationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConfigurationPackage getPackage() {
		return ConfigurationPackage.eINSTANCE;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public Configurations createConfigurations(String name_p) {
		Configurations configurations = createConfigurations();
		configurations.setName(name_p);
		return configurations;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public SystemConfiguration createSystemConfiguration(String name_p) {
		SystemConfiguration systemConfiguration = createSystemConfiguration();
		systemConfiguration.setName(name_p);
		return systemConfiguration;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public ComponentConfiguration createComponentConfiguration(String name_p) {
		ComponentConfiguration componentConfiguration = createComponentConfiguration();
		componentConfiguration.setName(name_p);
		return componentConfiguration;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public Deployment createDeployment(String name_p) {
		Deployment deployment = createDeployment();
		deployment.setName(name_p);
		return deployment;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public ParameterValue createParameterValue(String name_p) {
		ParameterValue parameterValue = createParameterValue();
		parameterValue.setName(name_p);
		return parameterValue;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public ConfigurationPort createConfigurationPort(String name_p) {
		ConfigurationPort configurationPort = createConfigurationPort();
		configurationPort.setName(name_p);
		return configurationPort;
	}

} //ConfigurationFactoryImpl
