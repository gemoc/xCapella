package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.epbs;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.epbs.EpbsFactory;

@SuppressWarnings("all")
public class EpbsFactoryAdapter extends EFactoryImpl implements org.gemoc.scenario.xdsml.functionscenariomt.epbs.EpbsFactory {
  private FunctionScenarioMTAdaptersFactory adaptersFactory = org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory.getInstance();
  
  private EpbsFactory epbsAdaptee = org.polarsys.capella.core.data.epbs.EpbsFactory.eINSTANCE;
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.epbs.EPBSArchitecturePkg createEPBSArchitecturePkg() {
    return adaptersFactory.createEPBSArchitecturePkgAdapter(epbsAdaptee.createEPBSArchitecturePkg(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.epbs.EPBSArchitecture createEPBSArchitecture() {
    return adaptersFactory.createEPBSArchitectureAdapter(epbsAdaptee.createEPBSArchitecture(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.epbs.EPBSContext createEPBSContext() {
    return adaptersFactory.createEPBSContextAdapter(epbsAdaptee.createEPBSContext(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.epbs.ConfigurationItemPkg createConfigurationItemPkg() {
    return adaptersFactory.createConfigurationItemPkgAdapter(epbsAdaptee.createConfigurationItemPkg(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.epbs.ConfigurationItem createConfigurationItem() {
    return adaptersFactory.createConfigurationItemAdapter(epbsAdaptee.createConfigurationItem(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.epbs.PhysicalArchitectureRealization createPhysicalArchitectureRealization() {
    return adaptersFactory.createPhysicalArchitectureRealizationAdapter(epbsAdaptee.createPhysicalArchitectureRealization(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.epbs.PhysicalArtifactRealization createPhysicalArtifactRealization() {
    return adaptersFactory.createPhysicalArtifactRealizationAdapter(epbsAdaptee.createPhysicalArtifactRealization(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getEpbsPackage();
  }
  
  public org.gemoc.scenario.xdsml.functionscenariomt.epbs.EpbsPackage getEpbsPackage() {
    return org.gemoc.scenario.xdsml.functionscenariomt.epbs.EpbsPackage.eINSTANCE;
  }
}
