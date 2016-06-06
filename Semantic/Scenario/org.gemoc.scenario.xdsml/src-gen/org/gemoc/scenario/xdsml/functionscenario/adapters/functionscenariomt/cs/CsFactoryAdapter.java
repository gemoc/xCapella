package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.cs.CsFactory;

@SuppressWarnings("all")
public class CsFactoryAdapter extends EFactoryImpl implements org.gemoc.scenario.xdsml.functionscenariomt.cs.CsFactory {
  private FunctionScenarioMTAdaptersFactory adaptersFactory = org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory.getInstance();
  
  private CsFactory csAdaptee = org.polarsys.capella.core.data.cs.CsFactory.eINSTANCE;
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.cs.Part createPart() {
    return adaptersFactory.createPartAdapter(csAdaptee.createPart(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfacePkg createInterfacePkg() {
    return adaptersFactory.createInterfacePkgAdapter(csAdaptee.createInterfacePkg(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface createInterface() {
    return adaptersFactory.createInterfaceAdapter(csAdaptee.createInterface(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfaceImplementation createInterfaceImplementation() {
    return adaptersFactory.createInterfaceImplementationAdapter(csAdaptee.createInterfaceImplementation(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfaceUse createInterfaceUse() {
    return adaptersFactory.createInterfaceUseAdapter(csAdaptee.createInterfaceUse(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.cs.ActorCapabilityRealizationInvolvement createActorCapabilityRealizationInvolvement() {
    return adaptersFactory.createActorCapabilityRealizationInvolvementAdapter(csAdaptee.createActorCapabilityRealizationInvolvement(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.cs.SystemComponentCapabilityRealizationInvolvement createSystemComponentCapabilityRealizationInvolvement() {
    return adaptersFactory.createSystemComponentCapabilityRealizationInvolvementAdapter(csAdaptee.createSystemComponentCapabilityRealizationInvolvement(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.cs.ExchangeItemAllocation createExchangeItemAllocation() {
    return adaptersFactory.createExchangeItemAllocationAdapter(csAdaptee.createExchangeItemAllocation(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.cs.PhysicalLink createPhysicalLink() {
    return adaptersFactory.createPhysicalLinkAdapter(csAdaptee.createPhysicalLink(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.cs.PhysicalLinkCategory createPhysicalLinkCategory() {
    return adaptersFactory.createPhysicalLinkCategoryAdapter(csAdaptee.createPhysicalLinkCategory(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.cs.PhysicalLinkEnd createPhysicalLinkEnd() {
    return adaptersFactory.createPhysicalLinkEndAdapter(csAdaptee.createPhysicalLinkEnd(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.cs.PhysicalLinkRealization createPhysicalLinkRealization() {
    return adaptersFactory.createPhysicalLinkRealizationAdapter(csAdaptee.createPhysicalLinkRealization(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.cs.PhysicalPath createPhysicalPath() {
    return adaptersFactory.createPhysicalPathAdapter(csAdaptee.createPhysicalPath(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.cs.PhysicalPathInvolvement createPhysicalPathInvolvement() {
    return adaptersFactory.createPhysicalPathInvolvementAdapter(csAdaptee.createPhysicalPathInvolvement(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.cs.PhysicalPathReference createPhysicalPathReference() {
    return adaptersFactory.createPhysicalPathReferenceAdapter(csAdaptee.createPhysicalPathReference(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.cs.PhysicalPathRealization createPhysicalPathRealization() {
    return adaptersFactory.createPhysicalPathRealizationAdapter(csAdaptee.createPhysicalPathRealization(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.cs.PhysicalPort createPhysicalPort() {
    return adaptersFactory.createPhysicalPortAdapter(csAdaptee.createPhysicalPort(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.cs.PhysicalPortRealization createPhysicalPortRealization() {
    return adaptersFactory.createPhysicalPortRealizationAdapter(csAdaptee.createPhysicalPortRealization(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getCsPackage();
  }
  
  public org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage getCsPackage() {
    return org.gemoc.scenario.xdsml.functionscenariomt.cs.CsPackage.eINSTANCE;
  }
}
