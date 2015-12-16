package com.thalesgroup.trt.mde.vp.configuration.configuration.provider;

import com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationFactory;
import com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage;
import com.thalesgroup.trt.mde.vp.configuration.configuration.SystemConfiguration;

import com.thalesgroup.trt.mde.vp.mode.mode.ModeFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.command.CommandParameter;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.capella.core.data.capellacore.provider.NamedElementItemProvider;

import org.polarsys.kitalpha.emde.model.EmdePackage;

import org.polarsys.kitalpha.emde.model.edit.provider.NewChildDescriptorHelper;

/**
 * This is the item provider adapter for a {@link com.thalesgroup.trt.mde.vp.configuration.configuration.SystemConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemConfigurationItemProvider extends NamedElementItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemConfigurationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSupportedModesPropertyDescriptor(object);
			addComponentConfigurationsPropertyDescriptor(object);
			addAvailableFunctionsPropertyDescriptor(object);
			addAvailableComponentsPropertyDescriptor(object);
		}
		// begin-extension-code
		checkChildCreationExtender(object);
		// end-extension-code
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Supported Modes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupportedModesPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor
				// end-extension-code
				(((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_SystemConfiguration_supportedModes_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_SystemConfiguration_supportedModes_feature", "_UI_SystemConfiguration_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						ConfigurationPackage.Literals.SYSTEM_CONFIGURATION__SUPPORTED_MODES,
						true, false, true, null, null,
						// begin-extension-code
						null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Component Configurations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentConfigurationsPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor
				// end-extension-code
				(((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_SystemConfiguration_componentConfigurations_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_SystemConfiguration_componentConfigurations_feature", "_UI_SystemConfiguration_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						ConfigurationPackage.Literals.SYSTEM_CONFIGURATION__COMPONENT_CONFIGURATIONS,
						true, false, true, null, null,
						// begin-extension-code
						null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Available Functions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvailableFunctionsPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor
				// end-extension-code
				(((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_SystemConfiguration_availableFunctions_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_SystemConfiguration_availableFunctions_feature", "_UI_SystemConfiguration_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						ConfigurationPackage.Literals.SYSTEM_CONFIGURATION__AVAILABLE_FUNCTIONS,
						true, false, true, null, null,
						// begin-extension-code
						null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Available Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvailableComponentsPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor
				// end-extension-code
				(((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_SystemConfiguration_availableComponents_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_SystemConfiguration_availableComponents_feature", "_UI_SystemConfiguration_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						ConfigurationPackage.Literals.SYSTEM_CONFIGURATION__AVAILABLE_COMPONENTS,
						true, false, true, null, null,
						// begin-extension-code
						null));
		// end-extension-code
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
					.add(ConfigurationPackage.Literals.SYSTEM_CONFIGURATION__DEPLOYMENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean hasChildren(Object object) {
		return hasChildren(object, true);
	}

	/**
	 * This returns SystemConfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/SystemConfiguration")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		String label = ((SystemConfiguration) object).getName();
		// begin-extension-code
		return label == null || label.length() == 0 ? "[" + getString("_UI_SystemConfiguration_type") + "]" : label; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		// end-extension-code
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SystemConfiguration.class)) {
		case ConfigurationPackage.SYSTEM_CONFIGURATION__DEPLOYMENT:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS,
					ConfigurationFactory.eINSTANCE.createConfigurations());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS,
					ConfigurationFactory.eINSTANCE
							.createComponentConfiguration());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS,
					ModeFactory.eINSTANCE.createModeMachine());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ConfigurationPackage.Literals.SYSTEM_CONFIGURATION__DEPLOYMENT,
					ConfigurationFactory.eINSTANCE.createDeployment());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

	}

}