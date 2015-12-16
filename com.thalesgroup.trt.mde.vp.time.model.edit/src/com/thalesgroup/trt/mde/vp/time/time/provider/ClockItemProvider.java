package com.thalesgroup.trt.mde.vp.time.time.provider;

import com.thalesgroup.trt.mde.vp.time.time.Clock;
import com.thalesgroup.trt.mde.vp.time.time.TimePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.capella.core.data.capellacore.provider.NamedElementItemProvider;

/**
 * This is the item provider adapter for a {@link com.thalesgroup.trt.mde.vp.time.time.Clock} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClockItemProvider extends NamedElementItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockItemProvider(AdapterFactory adapterFactory) {
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

			addUnitPropertyDescriptor(object);
			addResolutionPropertyDescriptor(object);
			addCurrentTimePropertyDescriptor(object);
			addMaxPropertyDescriptor(object);
		}
		// begin-extension-code
		checkChildCreationExtender(object);
		// end-extension-code
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnitPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor
				// end-extension-code
				(((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Clock_unit_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Clock_unit_feature", "_UI_Clock_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						TimePackage.Literals.CLOCK__UNIT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
						// begin-extension-code
						null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Resolution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResolutionPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor
				// end-extension-code
				(((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Clock_resolution_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Clock_resolution_feature", "_UI_Clock_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						TimePackage.Literals.CLOCK__RESOLUTION, true, false,
						false, ItemPropertyDescriptor.REAL_VALUE_IMAGE, null,
						// begin-extension-code
						null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Current Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentTimePropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor
				// end-extension-code
				(((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Clock_currentTime_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Clock_currentTime_feature", "_UI_Clock_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						TimePackage.Literals.CLOCK__CURRENT_TIME, true, false,
						false, ItemPropertyDescriptor.REAL_VALUE_IMAGE, null,
						// begin-extension-code
						null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Max feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor
				// end-extension-code
				(((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Clock_max_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_Clock_max_feature", "_UI_Clock_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						TimePackage.Literals.CLOCK__MAX, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null,
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
	 * This returns Clock.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/Clock")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		String label = ((Clock) object).getName();
		// begin-extension-code
		return label == null || label.length() == 0 ? "[" + getString("_UI_Clock_type") + "]" : label; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
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

		switch (notification.getFeatureID(Clock.class)) {
		case TimePackage.CLOCK__UNIT:
		case TimePackage.CLOCK__RESOLUTION:
		case TimePackage.CLOCK__CURRENT_TIME:
		case TimePackage.CLOCK__MAX:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
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
	}

}