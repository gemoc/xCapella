package com.thalesgroup.trt.mde.vp.configuration.configuration.provider;

import com.thalesgroup.trt.mde.vp.al.al.provider.AlEditPlugin;

import com.thalesgroup.trt.mde.vp.expression.expression.provider.ExpressionEditPlugin;

import com.thalesgroup.trt.mde.vp.mode.mode.provider.ModeEditPlugin;

import com.thalesgroup.trt.mde.vp.time.time.provider.TimeEditPlugin;

import java.util.MissingResourceException;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.polarsys.capella.common.data.activity.provider.ActivityEditPlugin;

import org.polarsys.capella.common.data.behavior.provider.BehaviorEditPlugin;

import org.polarsys.capella.common.data.modellingcore.provider.ModellingCoreEditPlugin;

import org.polarsys.capella.core.data.capellamodeller.provider.CapellaModellerEditPlugin;

import org.polarsys.kitalpha.emde.model.edit.provider.EmdeEditPlugin;

/**
 * This is the central singleton for the Configuration edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class ConfigurationEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ConfigurationEditPlugin INSTANCE = new ConfigurationEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationEditPlugin() {
		super(new ResourceLocator[] { EmdeEditPlugin.INSTANCE, ActivityEditPlugin.INSTANCE,
				CapellaModellerEditPlugin.INSTANCE, TimeEditPlugin.INSTANCE, ModellingCoreEditPlugin.INSTANCE,
				AlEditPlugin.INSTANCE, ModeEditPlugin.INSTANCE, ExpressionEditPlugin.INSTANCE,
				BehaviorEditPlugin.INSTANCE, });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

	/**
	 * @generated
	 */
	@Override
	public Object getImage(String key) {
		Object image = super.getImage(key);
		if (image == null)
			return delegatedGetImage(key);
		return image;
	}

	/**
	 * @generated
	 */
	@Override
	protected Object delegatedGetImage(String key) throws MissingResourceException {
		for (int i = 0; i < delegateResourceLocators.length; ++i) {
			try {
				Object image = delegateResourceLocators[i].getImage(key);
				if (image != null)
					return image;
			} catch (MissingResourceException exception) {
			}
		}
		return null;
	}

}
