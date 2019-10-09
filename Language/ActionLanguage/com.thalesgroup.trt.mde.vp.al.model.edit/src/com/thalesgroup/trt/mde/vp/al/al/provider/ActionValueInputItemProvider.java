package com.thalesgroup.trt.mde.vp.al.al.provider;

import com.thalesgroup.trt.mde.vp.al.al.ActionValueInput;
import com.thalesgroup.trt.mde.vp.al.al.AlPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.polarsys.kitalpha.emde.extension.ExtensionModelManager;
import org.polarsys.kitalpha.emde.extension.ModelExtensionHelper;

/**
 * This is the item provider adapter for a {@link com.thalesgroup.trt.mde.vp.al.al.ActionValueInput} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionValueInputItemProvider extends ActionInputItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
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
	public ActionValueInputItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkChildCreationExtender(Object object) {
		super.checkChildCreationExtender(object);
		if (object instanceof EObject) {
			EObject eObject = (EObject) object;
			// Process AlPackage.Literals.ACTION_VALUE_INPUT__VALUE
			if (valuePropertyDescriptor != null) {
				Object valueValue = eObject.eGet(
						AlPackage.Literals.ACTION_VALUE_INPUT__VALUE, true);
				if (valueValue != null
						&& valueValue instanceof EObject
						&& ModelExtensionHelper.getInstance((EObject)valueValue)
								.isExtensionModelDisabled((EObject) valueValue)) {
					itemPropertyDescriptors.remove(valuePropertyDescriptor);
				} else if (valueValue == null
						&& ExtensionModelManager.getAnyType(eObject,
								AlPackage.Literals.ACTION_VALUE_INPUT__VALUE) != null) {
					itemPropertyDescriptors.remove(valuePropertyDescriptor);
				} else if (itemPropertyDescriptors
						.contains(valuePropertyDescriptor) == false) {
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
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addValuePropertyDescriptor(object);
		}
		// begin-extension-code
		checkChildCreationExtender(object);
		// end-extension-code
		return itemPropertyDescriptors;
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
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ActionValueInput_value_feature"), //$NON-NLS-1$
				getString(
						"_UI_PropertyDescriptor_description", "_UI_ActionValueInput_value_feature", "_UI_ActionValueInput_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				AlPackage.Literals.ACTION_VALUE_INPUT__VALUE, true, false,
				true, null, null,
				// begin-extension-code
				null);
		itemPropertyDescriptors.add(valuePropertyDescriptor);
		// end-extension-code
	}

	/**
	 * This returns ActionValueInput.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/ActionValueInput")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {

		String label = ((ActionValueInput) object).getName();
		// begin-extension-code
		return label == null || label.length() == 0 ? "[" + getString("_UI_ActionValueInput_type") + "]" : label; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		// end-extension-code
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	protected void collectNewChildDescriptors(Collection newChildDescriptors,
			Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}