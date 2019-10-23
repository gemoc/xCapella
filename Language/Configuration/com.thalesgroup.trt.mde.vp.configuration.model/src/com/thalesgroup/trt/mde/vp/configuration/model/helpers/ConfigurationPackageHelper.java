/**
 * <copyright>
 *
 * </copyright>
 */

package com.thalesgroup.trt.mde.vp.configuration.model.helpers;

import org.eclipse.emf.common.util.BasicEList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.polarsys.capella.common.model.helpers.IHelper;

import com.thalesgroup.trt.mde.vp.configuration.configuration.Configurations;
import com.thalesgroup.trt.mde.vp.configuration.configuration.SystemConfiguration;
import com.thalesgroup.trt.mde.vp.configuration.configuration.ComponentConfiguration;
import com.thalesgroup.trt.mde.vp.configuration.configuration.Deployment;
import com.thalesgroup.trt.mde.vp.configuration.configuration.ParameterValue;
import com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPort;

/**
 * @generated 
 */
public class ConfigurationPackageHelper implements IHelper {

	/**
	 * @generated
	 */
	public Object getValue(EObject object, EStructuralFeature feature, EAnnotation annotation) {
		Object ret = null;

		if (ret == null && object instanceof Configurations) {
			ret = ConfigurationsHelper.getInstance().doSwitch((Configurations) object, feature);
		}
		if (ret == null && object instanceof SystemConfiguration) {
			ret = SystemConfigurationHelper.getInstance().doSwitch((SystemConfiguration) object, feature);
		}
		if (ret == null && object instanceof ComponentConfiguration) {
			ret = ComponentConfigurationHelper.getInstance().doSwitch((ComponentConfiguration) object, feature);
		}
		if (ret == null && object instanceof Deployment) {
			ret = DeploymentHelper.getInstance().doSwitch((Deployment) object, feature);
		}
		if (ret == null && object instanceof ParameterValue) {
			ret = ParameterValueHelper.getInstance().doSwitch((ParameterValue) object, feature);
		}
		if (ret == null && object instanceof ConfigurationPort) {
			ret = ConfigurationPortHelper.getInstance().doSwitch((ConfigurationPort) object, feature);
		}
		return ret;
	}

}
