package com.thalesgroup.trt.mde.vp.mode.mode.provider;

import com.thalesgroup.trt.mde.vp.mode.mode.AbstractMode;
import com.thalesgroup.trt.mde.vp.mode.mode.ModeFactory;
import com.thalesgroup.trt.mde.vp.mode.mode.ModePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.command.CommandParameter;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.polarsys.capella.core.data.capellacore.provider.NamedElementItemProvider;

import org.polarsys.kitalpha.emde.model.EmdePackage;

import org.polarsys.kitalpha.emde.model.edit.provider.NewChildDescriptorHelper;

/**
 * This is the item provider adapter for a {@link com.thalesgroup.trt.mde.vp.mode.mode.AbstractMode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractModeItemProvider extends NamedElementItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractModeItemProvider(AdapterFactory adapterFactory) {
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

			addOutgoingTransitionsPropertyDescriptor(object);
			addIncomingTransitionsPropertyDescriptor(object);
		}
		// begin-extension-code
		checkChildCreationExtender(object);
		// end-extension-code
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Outgoing Transitions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutgoingTransitionsPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AbstractMode_outgoingTransitions_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_AbstractMode_outgoingTransitions_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_AbstractMode_type"), //$NON-NLS-1$
				ModePackage.Literals.ABSTRACT_MODE__OUTGOING_TRANSITIONS, true, false, true, null, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Incoming Transitions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncomingTransitionsPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AbstractMode_incomingTransitions_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_AbstractMode_incomingTransitions_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_AbstractMode_type"), //$NON-NLS-1$
				ModePackage.Literals.ABSTRACT_MODE__INCOMING_TRANSITIONS, true, false, true, null, null,
				// begin-extension-code
				null));
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		String label = ((AbstractMode) object).getName();
		// begin-extension-code
		return label == null || label.length() == 0 ? "[" + getString("_UI_AbstractMode_type") + "]" : label; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
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
					ModeFactory.eINSTANCE.createModeMachine());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

	}

}