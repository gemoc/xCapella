package com.thalesgroup.trt.mde.vp.configuration.configuration.impl;

import com.thalesgroup.trt.mde.vp.al.al.AlPackage;
import com.thalesgroup.trt.mde.vp.configuration.configuration.ComponentConfiguration;
import com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationFactory;
import com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage;
import com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPort;
import com.thalesgroup.trt.mde.vp.configuration.configuration.Configurations;
import com.thalesgroup.trt.mde.vp.configuration.configuration.Deployment;
import com.thalesgroup.trt.mde.vp.configuration.configuration.ParameterValue;
import com.thalesgroup.trt.mde.vp.configuration.configuration.SystemConfiguration;

import com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage;

import com.thalesgroup.trt.mde.vp.mode.mode.ModePackage;

import com.thalesgroup.trt.mde.vp.time.time.TimePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.capella.common.data.activity.ActivityPackage;
import org.polarsys.capella.common.data.behavior.BehaviorPackage;
import org.polarsys.capella.common.data.modellingcore.ModellingcorePackage;
import org.polarsys.capella.core.data.capellacommon.CapellacommonPackage;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;

import org.polarsys.capella.core.data.capellamodeller.CapellamodellerPackage;
import org.polarsys.capella.core.data.cs.CsPackage;

import org.polarsys.capella.core.data.ctx.CtxPackage;
import org.polarsys.capella.core.data.epbs.EpbsPackage;
import org.polarsys.capella.core.data.fa.FaPackage;

import org.polarsys.capella.core.data.information.InformationPackage;
import org.polarsys.capella.core.data.interaction.InteractionPackage;
import org.polarsys.capella.core.data.la.LaPackage;
import org.polarsys.capella.core.data.oa.OaPackage;
import org.polarsys.capella.core.data.pa.PaPackage;
import org.polarsys.capella.core.data.requirement.RequirementPackage;
import org.polarsys.capella.core.data.sharedmodel.SharedmodelPackage;
import org.polarsys.kitalpha.emde.model.EmdePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationPackageImpl extends EPackageImpl implements ConfigurationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationPortEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfigurationPackageImpl() {
		super(eNS_URI, ConfigurationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ConfigurationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfigurationPackage init() {
		if (isInited)
			return (ConfigurationPackage) EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredConfigurationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ConfigurationPackageImpl theConfigurationPackage = registeredConfigurationPackage instanceof ConfigurationPackageImpl
				? (ConfigurationPackageImpl) registeredConfigurationPackage
				: new ConfigurationPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EmdePackage.eINSTANCE.eClass();
		ActivityPackage.eINSTANCE.eClass();
		CapellamodellerPackage.eINSTANCE.eClass();
		CapellacorePackage.eINSTANCE.eClass();
		OaPackage.eINSTANCE.eClass();
		CtxPackage.eINSTANCE.eClass();
		LaPackage.eINSTANCE.eClass();
		PaPackage.eINSTANCE.eClass();
		EpbsPackage.eINSTANCE.eClass();
		SharedmodelPackage.eINSTANCE.eClass();
		RequirementPackage.eINSTANCE.eClass();
		CapellacommonPackage.eINSTANCE.eClass();
		InformationPackage.eINSTANCE.eClass();
		CsPackage.eINSTANCE.eClass();
		FaPackage.eINSTANCE.eClass();
		InteractionPackage.eINSTANCE.eClass();
		TimePackage.eINSTANCE.eClass();
		ModellingcorePackage.eINSTANCE.eClass();
		AlPackage.eINSTANCE.eClass();
		ModePackage.eINSTANCE.eClass();
		ExpressionPackage.eINSTANCE.eClass();
		BehaviorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theConfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConfigurationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfigurationPackage.eNS_URI, theConfigurationPackage);
		return theConfigurationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurations() {
		return configurationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurations_SystemConfigurations() {
		return (EReference) configurationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurations_ComponentConfigurations() {
		return (EReference) configurationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemConfiguration() {
		return systemConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemConfiguration_Deployment() {
		return (EReference) systemConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemConfiguration_SupportedModes() {
		return (EReference) systemConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemConfiguration_ComponentConfigurations() {
		return (EReference) systemConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemConfiguration_AvailableFunctions() {
		return (EReference) systemConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemConfiguration_AvailableComponents() {
		return (EReference) systemConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentConfiguration() {
		return componentConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentConfiguration_Component() {
		return (EReference) componentConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentConfiguration_ComponentParameters() {
		return (EReference) componentConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentConfiguration_ComponentConfigurations() {
		return (EReference) componentConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployment() {
		return deploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_DeploymentLinks() {
		return (EReference) deploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterValue() {
		return parameterValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValue_Port() {
		return (EReference) parameterValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValue_Value() {
		return (EReference) parameterValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationPort() {
		return configurationPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationFactory getConfigurationFactory() {
		return (ConfigurationFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		configurationsEClass = createEClass(CONFIGURATIONS);
		createEReference(configurationsEClass, CONFIGURATIONS__SYSTEM_CONFIGURATIONS);
		createEReference(configurationsEClass, CONFIGURATIONS__COMPONENT_CONFIGURATIONS);

		systemConfigurationEClass = createEClass(SYSTEM_CONFIGURATION);
		createEReference(systemConfigurationEClass, SYSTEM_CONFIGURATION__DEPLOYMENT);
		createEReference(systemConfigurationEClass, SYSTEM_CONFIGURATION__SUPPORTED_MODES);
		createEReference(systemConfigurationEClass, SYSTEM_CONFIGURATION__COMPONENT_CONFIGURATIONS);
		createEReference(systemConfigurationEClass, SYSTEM_CONFIGURATION__AVAILABLE_FUNCTIONS);
		createEReference(systemConfigurationEClass, SYSTEM_CONFIGURATION__AVAILABLE_COMPONENTS);

		componentConfigurationEClass = createEClass(COMPONENT_CONFIGURATION);
		createEReference(componentConfigurationEClass, COMPONENT_CONFIGURATION__COMPONENT);
		createEReference(componentConfigurationEClass, COMPONENT_CONFIGURATION__COMPONENT_PARAMETERS);
		createEReference(componentConfigurationEClass, COMPONENT_CONFIGURATION__COMPONENT_CONFIGURATIONS);

		deploymentEClass = createEClass(DEPLOYMENT);
		createEReference(deploymentEClass, DEPLOYMENT__DEPLOYMENT_LINKS);

		parameterValueEClass = createEClass(PARAMETER_VALUE);
		createEReference(parameterValueEClass, PARAMETER_VALUE__PORT);
		createEReference(parameterValueEClass, PARAMETER_VALUE__VALUE);

		configurationPortEClass = createEClass(CONFIGURATION_PORT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CapellacorePackage theCapellacorePackage = (CapellacorePackage) EPackage.Registry.INSTANCE
				.getEPackage(CapellacorePackage.eNS_URI);
		EmdePackage theEmdePackage = (EmdePackage) EPackage.Registry.INSTANCE.getEPackage(EmdePackage.eNS_URI);
		ModePackage theModePackage = (ModePackage) EPackage.Registry.INSTANCE.getEPackage(ModePackage.eNS_URI);
		FaPackage theFaPackage = (FaPackage) EPackage.Registry.INSTANCE.getEPackage(FaPackage.eNS_URI);
		CsPackage theCsPackage = (CsPackage) EPackage.Registry.INSTANCE.getEPackage(CsPackage.eNS_URI);
		ExpressionPackage theExpressionPackage = (ExpressionPackage) EPackage.Registry.INSTANCE
				.getEPackage(ExpressionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		configurationsEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		configurationsEClass.getESuperTypes().add(theEmdePackage.getElementExtension());
		systemConfigurationEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		componentConfigurationEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		componentConfigurationEClass.getESuperTypes().add(theEmdePackage.getElementExtension());
		deploymentEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		parameterValueEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		configurationPortEClass.getESuperTypes().add(theFaPackage.getComponentPort());

		// Initialize classes and features; add operations and parameters
		initEClass(configurationsEClass, Configurations.class, "Configurations", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurations_SystemConfigurations(), this.getSystemConfiguration(), null,
				"systemConfigurations", null, 0, -1, Configurations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurations_ComponentConfigurations(), this.getComponentConfiguration(), null,
				"componentConfigurations", null, 0, -1, Configurations.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemConfigurationEClass, SystemConfiguration.class, "SystemConfiguration", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemConfiguration_Deployment(), this.getDeployment(), null, "deployment", null, 0, 1, //$NON-NLS-1$
				SystemConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemConfiguration_SupportedModes(), theModePackage.getMode_(), null, "supportedModes", null, //$NON-NLS-1$
				1, -1, SystemConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemConfiguration_ComponentConfigurations(), this.getComponentConfiguration(), null,
				"componentConfigurations", null, 1, -1, SystemConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemConfiguration_AvailableFunctions(), theFaPackage.getAbstractFunction(), null,
				"availableFunctions", null, 1, -1, SystemConfiguration.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSystemConfiguration_AvailableComponents(), theCsPackage.getComponent(), null,
				"availableComponents", null, 1, -1, SystemConfiguration.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(componentConfigurationEClass, ComponentConfiguration.class, "ComponentConfiguration", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentConfiguration_Component(), theCsPackage.getComponent(), null, "component", null, 1, //$NON-NLS-1$
				1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentConfiguration_ComponentParameters(), this.getParameterValue(), null,
				"componentParameters", null, 0, -1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentConfiguration_ComponentConfigurations(), this.getComponentConfiguration(), null,
				"componentConfigurations", null, 1, -1, ComponentConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentEClass, Deployment.class, "Deployment", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeployment_DeploymentLinks(), theCsPackage.getAbstractDeploymentLink(), null,
				"deploymentLinks", null, 1, -1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterValueEClass, ParameterValue.class, "ParameterValue", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterValue_Port(), this.getConfigurationPort(), null, "port", null, 1, 1, //$NON-NLS-1$
				ParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterValue_Value(), theExpressionPackage.getExpression(), null, "value", null, 1, 1, //$NON-NLS-1$
				ParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationPortEClass, ConfigurationPort.class, "ConfigurationPort", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.polarsys.org/kitalpha/emde/1.0.0/constraint
		createConstraintAnnotations();
		// http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping
		createConstraintMappingAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/emde/1.0.0/constraint</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createConstraintAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/emde/1.0.0/constraint"; //$NON-NLS-1$
		addAnnotation(configurationsEClass, source, new String[] { "ExtendedElement", //$NON-NLS-1$
				" http://www.polarsys.org/capella/core/modeller/1.3.0#//SystemEngineering" //$NON-NLS-1$
		});
		addAnnotation(componentConfigurationEClass, source,
				new String[] { "ExtendedElement", " http://www.polarsys.org/capella/core/cs/1.3.0#//Component" //$NON-NLS-1$ //$NON-NLS-2$
				});
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createConstraintMappingAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping"; //$NON-NLS-1$
		addAnnotation(configurationsEClass, source, new String[] { "Mapping", //$NON-NLS-1$
				" platform:/plugin/org.polarsys.capella.core.data.gen/model/CapellaModeller.ecore#//SystemEngineering" //$NON-NLS-1$
		});
		addAnnotation(componentConfigurationEClass, source, new String[] { "Mapping", //$NON-NLS-1$
				" platform:/plugin/org.polarsys.capella.core.data.gen/model/CompositeStructure.ecore#//Component" //$NON-NLS-1$
		});
	}

} //ConfigurationPackageImpl
