package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.pa.deployment.DeploymentFactory;

@SuppressWarnings("all")
public class DeploymentFactoryAdapter extends EFactoryImpl implements org.gemoc.scenario.xdsml.functionscenariomt.deployment.DeploymentFactory {
  private FunctionScenarioMTAdaptersFactory adaptersFactory = org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory.getInstance();
  
  private DeploymentFactory deploymentAdaptee = org.polarsys.capella.core.data.pa.deployment.DeploymentFactory.eINSTANCE;
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.deployment.ComponentInstance createComponentInstance() {
    return adaptersFactory.createComponentInstanceAdapter(deploymentAdaptee.createComponentInstance(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.deployment.ConnectionInstance createConnectionInstance() {
    return adaptersFactory.createConnectionInstanceAdapter(deploymentAdaptee.createConnectionInstance(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.deployment.DeploymentAspect createDeploymentAspect() {
    return adaptersFactory.createDeploymentAspectAdapter(deploymentAdaptee.createDeploymentAspect(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.deployment.DeploymentConfiguration createDeploymentConfiguration() {
    return adaptersFactory.createDeploymentConfigurationAdapter(deploymentAdaptee.createDeploymentConfiguration(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.deployment.InstanceDeploymentLink createInstanceDeploymentLink() {
    return adaptersFactory.createInstanceDeploymentLinkAdapter(deploymentAdaptee.createInstanceDeploymentLink(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.deployment.PartDeploymentLink createPartDeploymentLink() {
    return adaptersFactory.createPartDeploymentLinkAdapter(deploymentAdaptee.createPartDeploymentLink(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.deployment.PortInstance createPortInstance() {
    return adaptersFactory.createPortInstanceAdapter(deploymentAdaptee.createPortInstance(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.deployment.TypeDeploymentLink createTypeDeploymentLink() {
    return adaptersFactory.createTypeDeploymentLinkAdapter(deploymentAdaptee.createTypeDeploymentLink(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getDeploymentPackage();
  }
  
  public org.gemoc.scenario.xdsml.functionscenariomt.deployment.DeploymentPackage getDeploymentPackage() {
    return org.gemoc.scenario.xdsml.functionscenariomt.deployment.DeploymentPackage.eINSTANCE;
  }
}
