package com.thalesgroup.trt.mde.vp.configuration.configuration.provider;

import com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationFactory;
import com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage;
import com.thalesgroup.trt.mde.vp.configuration.configuration.ParameterValue;

import com.thalesgroup.trt.mde.vp.mode.mode.ModeFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.command.CommandParameter;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.polarsys.capella.core.data.capellacore.provider.NamedElementItemProvider;

import org.polarsys.kitalpha.emde.extension.ExtensionModelManager;
import org.polarsys.kitalpha.emde.extension.ModelExtensionHelper;

import org.polarsys.kitalpha.emde.model.EmdePackage;

import org.polarsys.kitalpha.emde.model.edit.provider.NewChildDescriptorHelper;

/**
 * This is the item provider adapter for a {@link com.thalesgroup.trt.mde.vp.configuration.configuration.ParameterValue} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterValueItemProvider extends NamedElementItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IItemPropertyDescriptor portPropertyDescriptor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IItemPropertyDescriptor valuePropertyDescriptor;

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValueItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void checkChildCreationExtender(Object object) {
		super.checkChildCreationExtender(object);
		if (object instanceof EObject) {
			EObject eObject = (EObject) object;
			// Process ConfigurationPackage.Literals.PARAMETER_VALUE__PORT
			if (portPropertyDescriptor != null) {
				Object portValue = eObject.eGet(ConfigurationPackage.Literals.PARAMETER_VALUE__PORT, true);
				if (portValue != null && portValue instanceof EObject
						&& ModelExtensionHelper.getInstance(eObject).isExtensionModelDisabled((EObject) portValue)) {
					itemPropertyDescriptors.remove(portPropertyDescriptor);
				} else if (portValue == null && ExtensionModelManager.getAnyType(eObject,
						ConfigurationPackage.Literals.PARAMETER_VALUE__PORT) != null) {
					itemPropertyDescriptors.remove(portPropertyDescriptor);
				} else if (itemPropertyDescriptors.contains(portPropertyDescriptor) == false) {
					itemPropertyDescriptors.add(portPropertyDescriptor);
				}
			}
			// Process ConfigurationPackage.Literals.PARAMETER_VALUE__VALUE
			if (valuePropertyDescriptor != null) {
				Object valueValue = eObject.eGet(ConfigurationPackage.Literals.PARAMETER_VALUE__VALUE, true);
				if (valueValue != null && valueValue instanceof EObject
						&& ModelExtensionHelper.getInstance(eObject).isExtensionModelDisabled((EObject) valueValue)) {
					itemPropertyDescriptors.remove(valuePropertyDescriptor);
				} else if (valueValue == null && ExtensionModelManager.getAnyType(eObject,
						ConfigurationPackage.Literals.PARAMETER_VALUE__VALUE) != null) {
					itemPropertyDescriptors.remove(valuePropertyDescriptor);
				} else if (itemPropertyDescriptors.contains(valuePropertyDescriptor) == false) {
					itemPropertyDescriptors.add(valuePropertyDescriptor);
				}
			}
		}
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

			addPortPropertyDescriptor(object);
			addValuePropertyDescriptor(object);
		}
		// begin-extension-code
		checkChildCreationExtender(object);
		// end-extension-code
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortPropertyDescriptor(Object object) {
		// begin-extension-code
		portPropertyDescriptor = createItemPropertyDescriptor
		// end-extension-code		
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ParameterValue_port_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_ParameterValue_port_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_ParameterValue_type"), //$NON-NLS-1$
				ConfigurationPackage.Literals.PARAMETER_VALUE__PORT, true, false, true, null, null,
				// begin-extension-code
				null);
		itemPropertyDescriptors.add(portPropertyDescriptor);
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		// begin-extension-code
		valuePropertyDescriptor = createItemPropertyDescriptor
		// end-extension-code		
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ParameterValue_value_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_ParameterValue_value_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_ParameterValue_type"), //$NON-NLS-1$
				ConfigurationPackage.Literals.PARAMETER_VALUE__VALUE, true, false, true, null, null,
				// begin-extension-code
				null);
		itemPropertyDescriptors.add(valuePropertyDescriptor);
		// end-extension-code
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
	 * This returns ParameterValue.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ParameterValue")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		String label = ((ParameterValue) object).getName();
		// begin-extension-code
		return label == null || label.length() == 0 ? "[" + getString("_UI_ParameterValue_type") + "]" : label; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS,
					ConfigurationFactory.eINSTANCE.createConfigurations());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS,
					ConfigurationFactory.eINSTANCE.createComponentConfiguration());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS,
					ModeFactory.eINSTANCE.createModeMachine());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

	}

}