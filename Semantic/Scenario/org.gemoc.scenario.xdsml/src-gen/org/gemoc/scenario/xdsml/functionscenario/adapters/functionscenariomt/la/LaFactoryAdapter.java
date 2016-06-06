package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.la.LaFactory;

@SuppressWarnings("all")
public class LaFactoryAdapter extends EFactoryImpl implements org.gemoc.scenario.xdsml.functionscenariomt.la.LaFactory {
  private FunctionScenarioMTAdaptersFactory adaptersFactory = org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory.getInstance();
  
  private LaFactory laAdaptee = org.polarsys.capella.core.data.la.LaFactory.eINSTANCE;
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.la.LogicalArchitecturePkg createLogicalArchitecturePkg() {
    return adaptersFactory.createLogicalArchitecturePkgAdapter(laAdaptee.createLogicalArchitecturePkg(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.la.LogicalArchitecture createLogicalArchitecture() {
    return adaptersFactory.createLogicalArchitectureAdapter(laAdaptee.createLogicalArchitecture(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.la.LogicalFunction createLogicalFunction() {
    return adaptersFactory.createLogicalFunctionAdapter(laAdaptee.createLogicalFunction(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.la.LogicalFunctionPkg createLogicalFunctionPkg() {
    return adaptersFactory.createLogicalFunctionPkgAdapter(laAdaptee.createLogicalFunctionPkg(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.la.LogicalComponent createLogicalComponent() {
    return adaptersFactory.createLogicalComponentAdapter(laAdaptee.createLogicalComponent(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.la.LogicalComponentPkg createLogicalComponentPkg() {
    return adaptersFactory.createLogicalComponentPkgAdapter(laAdaptee.createLogicalComponentPkg(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.la.CapabilityRealization createCapabilityRealization() {
    return adaptersFactory.createCapabilityRealizationAdapter(laAdaptee.createCapabilityRealization(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.la.CapabilityRealizationPkg createCapabilityRealizationPkg() {
    return adaptersFactory.createCapabilityRealizationPkgAdapter(laAdaptee.createCapabilityRealizationPkg(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.la.SystemAnalysisRealization createSystemAnalysisRealization() {
    return adaptersFactory.createSystemAnalysisRealizationAdapter(laAdaptee.createSystemAnalysisRealization(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.la.SystemRealization createSystemRealization() {
    return adaptersFactory.createSystemRealizationAdapter(laAdaptee.createSystemRealization(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.la.ContextInterfaceRealization createContextInterfaceRealization() {
    return adaptersFactory.createContextInterfaceRealizationAdapter(laAdaptee.createContextInterfaceRealization(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.la.LogicalActorPkg createLogicalActorPkg() {
    return adaptersFactory.createLogicalActorPkgAdapter(laAdaptee.createLogicalActorPkg(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.la.LogicalActor createLogicalActor() {
    return adaptersFactory.createLogicalActorAdapter(laAdaptee.createLogicalActor(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.la.SystemActorRealization createSystemActorRealization() {
    return adaptersFactory.createSystemActorRealizationAdapter(laAdaptee.createSystemActorRealization(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.la.LogicalContext createLogicalContext() {
    return adaptersFactory.createLogicalContextAdapter(laAdaptee.createLogicalContext(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getLaPackage();
  }
  
  public org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage getLaPackage() {
    return org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.eINSTANCE;
  }
}
