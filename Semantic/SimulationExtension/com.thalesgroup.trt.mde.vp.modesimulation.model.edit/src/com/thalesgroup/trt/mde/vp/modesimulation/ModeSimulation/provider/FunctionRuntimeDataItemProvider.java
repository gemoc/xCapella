package com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.provider;

import com.thalesgroup.trt.mde.vp.mode.mode.ModeFactory;

import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionRuntimeData;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ModeSimulationFactory;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ModeSimulationPackage;

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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.capella.core.data.capellacore.provider.NamedElementItemProvider;

import org.polarsys.kitalpha.emde.model.EmdePackage;

import org.polarsys.kitalpha.emde.model.edit.provider.NewChildDescriptorHelper;

/**
 * This is the item provider adapter for a {@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionRuntimeData} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionRuntimeDataItemProvider extends NamedElementItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionRuntimeDataItemProvider(AdapterFactory adapterFactory) {
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

			addIsActivePropertyDescriptor(object);
			addIsStartedPropertyDescriptor(object);
			addIsRunningPropertyDescriptor(object);
		}
		// begin-extension-code
		checkChildCreationExtender(object);
		// end-extension-code
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Active feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsActivePropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor
				// end-extension-code
				(((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_FunctionRuntimeData_isActive_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_FunctionRuntimeData_isActive_feature", "_UI_FunctionRuntimeData_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						ModeSimulationPackage.Literals.FUNCTION_RUNTIME_DATA__IS_ACTIVE,
						true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null,
						// begin-extension-code
						null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Is Started feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsStartedPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor
				// end-extension-code
				(((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_FunctionRuntimeData_isStarted_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_FunctionRuntimeData_isStarted_feature", "_UI_FunctionRuntimeData_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						ModeSimulationPackage.Literals.FUNCTION_RUNTIME_DATA__IS_STARTED,
						true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null,
						// begin-extension-code
						null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Is Running feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsRunningPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor
				// end-extension-code
				(((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_FunctionRuntimeData_isRunning_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_FunctionRuntimeData_isRunning_feature", "_UI_FunctionRuntimeData_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						ModeSimulationPackage.Literals.FUNCTION_RUNTIME_DATA__IS_RUNNING,
						true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null,
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
	 * This returns FunctionRuntimeData.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/FunctionRuntimeData")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		String label = ((FunctionRuntimeData) object).getName();
		// begin-extension-code
		return label == null || label.length() == 0 ? "[" + getString("_UI_FunctionRuntimeData_type") + "]" : label; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
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

		switch (notification.getFeatureID(FunctionRuntimeData.class)) {
		case ModeSimulationPackage.FUNCTION_RUNTIME_DATA__IS_ACTIVE:
		case ModeSimulationPackage.FUNCTION_RUNTIME_DATA__IS_STARTED:
		case ModeSimulationPackage.FUNCTION_RUNTIME_DATA__IS_RUNNING:
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
		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS,
					ModeSimulationFactory.eINSTANCE
							.createTransitionRuntimeData());
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
					ModeSimulationFactory.eINSTANCE.createModeRuntimeData());
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
					ModeSimulationFactory.eINSTANCE.createGuardRuntimeData());
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
					ModeSimulationFactory.eINSTANCE.createMachineRuntimeData());
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
					ModeSimulationFactory.eINSTANCE
							.createComponentRuntimeData());
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
					ModeSimulationFactory.eINSTANCE.createFunctionRuntimeData());
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
					ModeSimulationFactory.eINSTANCE
							.createFunctionalChainRuntimeData());
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
					ModeSimulationFactory.eINSTANCE
							.createExpressionRuntimeData());
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
					ModeSimulationFactory.eINSTANCE.createClockRuntimeData());
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
					ModeSimulationFactory.eINSTANCE.createEventRuntimeData());
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
					ModeSimulationFactory.eINSTANCE.createActionRuntimeData());
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

	}

}