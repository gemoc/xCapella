package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.pa.PaFactory;

@SuppressWarnings("all")
public class PaFactoryAdapter extends EFactoryImpl implements org.gemoc.scenario.xdsml.functionscenariomt.pa.PaFactory {
  private FunctionScenarioMTAdaptersFactory adaptersFactory = org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory.getInstance();
  
  private PaFactory paAdaptee = org.polarsys.capella.core.data.pa.PaFactory.eINSTANCE;
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalArchitecturePkg createPhysicalArchitecturePkg() {
    return adaptersFactory.createPhysicalArchitecturePkgAdapter(paAdaptee.createPhysicalArchitecturePkg(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalArchitecture createPhysicalArchitecture() {
    return adaptersFactory.createPhysicalArchitectureAdapter(paAdaptee.createPhysicalArchitecture(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalFunction createPhysicalFunction() {
    return adaptersFactory.createPhysicalFunctionAdapter(paAdaptee.createPhysicalFunction(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalFunctionPkg createPhysicalFunctionPkg() {
    return adaptersFactory.createPhysicalFunctionPkgAdapter(paAdaptee.createPhysicalFunctionPkg(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalComponent createPhysicalComponent() {
    return adaptersFactory.createPhysicalComponentAdapter(paAdaptee.createPhysicalComponent(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalActorPkg createPhysicalActorPkg() {
    return adaptersFactory.createPhysicalActorPkgAdapter(paAdaptee.createPhysicalActorPkg(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalComponentPkg createPhysicalComponentPkg() {
    return adaptersFactory.createPhysicalComponentPkgAdapter(paAdaptee.createPhysicalComponentPkg(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalActor createPhysicalActor() {
    return adaptersFactory.createPhysicalActorAdapter(paAdaptee.createPhysicalActor(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.pa.LogicalActorRealization createLogicalActorRealization() {
    return adaptersFactory.createLogicalActorRealizationAdapter(paAdaptee.createLogicalActorRealization(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalNode createPhysicalNode() {
    return adaptersFactory.createPhysicalNodeAdapter(paAdaptee.createPhysicalNode(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.pa.LogicalArchitectureRealization createLogicalArchitectureRealization() {
    return adaptersFactory.createLogicalArchitectureRealizationAdapter(paAdaptee.createLogicalArchitectureRealization(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.pa.LogicalComponentRealization createLogicalComponentRealization() {
    return adaptersFactory.createLogicalComponentRealizationAdapter(paAdaptee.createLogicalComponentRealization(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.pa.LogicalInterfaceRealization createLogicalInterfaceRealization() {
    return adaptersFactory.createLogicalInterfaceRealizationAdapter(paAdaptee.createLogicalInterfaceRealization(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalContext createPhysicalContext() {
    return adaptersFactory.createPhysicalContextAdapter(paAdaptee.createPhysicalContext(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getPaPackage();
  }
  
  public org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage getPaPackage() {
    return org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.eINSTANCE;
  }
}
