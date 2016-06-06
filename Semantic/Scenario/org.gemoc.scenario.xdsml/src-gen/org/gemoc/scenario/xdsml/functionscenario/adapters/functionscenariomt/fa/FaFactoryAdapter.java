package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.fa.FaFactory;

@SuppressWarnings("all")
public class FaFactoryAdapter extends EFactoryImpl implements org.gemoc.scenario.xdsml.functionscenariomt.fa.FaFactory {
  private FunctionScenarioMTAdaptersFactory adaptersFactory = org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory.getInstance();
  
  private FaFactory faAdaptee = org.polarsys.capella.core.data.fa.FaFactory.eINSTANCE;
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionSpecification createFunctionSpecification() {
    return adaptersFactory.createFunctionSpecificationAdapter(faAdaptee.createFunctionSpecification(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.ExchangeCategory createExchangeCategory() {
    return adaptersFactory.createExchangeCategoryAdapter(faAdaptee.createExchangeCategory(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.ExchangeLink createExchangeLink() {
    return adaptersFactory.createExchangeLinkAdapter(faAdaptee.createExchangeLink(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.ExchangeContainment createExchangeContainment() {
    return adaptersFactory.createExchangeContainmentAdapter(faAdaptee.createExchangeContainment(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalExchangeSpecification createFunctionalExchangeSpecification() {
    return adaptersFactory.createFunctionalExchangeSpecificationAdapter(faAdaptee.createFunctionalExchangeSpecification(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChain createFunctionalChain() {
    return adaptersFactory.createFunctionalChainAdapter(faAdaptee.createFunctionalChain(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChainInvolvement createFunctionalChainInvolvement() {
    return adaptersFactory.createFunctionalChainInvolvementAdapter(faAdaptee.createFunctionalChainInvolvement(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChainReference createFunctionalChainReference() {
    return adaptersFactory.createFunctionalChainReferenceAdapter(faAdaptee.createFunctionalChainReference(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionInputPort createFunctionInputPort() {
    return adaptersFactory.createFunctionInputPortAdapter(faAdaptee.createFunctionInputPort(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionOutputPort createFunctionOutputPort() {
    return adaptersFactory.createFunctionOutputPortAdapter(faAdaptee.createFunctionOutputPort(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentFunctionalAllocation createComponentFunctionalAllocation() {
    return adaptersFactory.createComponentFunctionalAllocationAdapter(faAdaptee.createComponentFunctionalAllocation(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChainRealization createFunctionalChainRealization() {
    return adaptersFactory.createFunctionalChainRealizationAdapter(faAdaptee.createFunctionalChainRealization(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalExchangeRealization createFunctionalExchangeRealization() {
    return adaptersFactory.createFunctionalExchangeRealizationAdapter(faAdaptee.createFunctionalExchangeRealization(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionRealization createFunctionRealization() {
    return adaptersFactory.createFunctionRealizationAdapter(faAdaptee.createFunctionRealization(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalExchange createFunctionalExchange() {
    return adaptersFactory.createFunctionalExchangeAdapter(faAdaptee.createFunctionalExchange(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchange createComponentExchange() {
    return adaptersFactory.createComponentExchangeAdapter(faAdaptee.createComponentExchange(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeAllocation createComponentExchangeAllocation() {
    return adaptersFactory.createComponentExchangeAllocationAdapter(faAdaptee.createComponentExchangeAllocation(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeCategory createComponentExchangeCategory() {
    return adaptersFactory.createComponentExchangeCategoryAdapter(faAdaptee.createComponentExchangeCategory(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeEnd createComponentExchangeEnd() {
    return adaptersFactory.createComponentExchangeEndAdapter(faAdaptee.createComponentExchangeEnd(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeFunctionalExchangeAllocation createComponentExchangeFunctionalExchangeAllocation() {
    return adaptersFactory.createComponentExchangeFunctionalExchangeAllocationAdapter(faAdaptee.createComponentExchangeFunctionalExchangeAllocation(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeRealization createComponentExchangeRealization() {
    return adaptersFactory.createComponentExchangeRealizationAdapter(faAdaptee.createComponentExchangeRealization(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentPort createComponentPort() {
    return adaptersFactory.createComponentPortAdapter(faAdaptee.createComponentPort(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentPortAllocation createComponentPortAllocation() {
    return adaptersFactory.createComponentPortAllocationAdapter(faAdaptee.createComponentPortAllocation(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentPortAllocationEnd createComponentPortAllocationEnd() {
    return adaptersFactory.createComponentPortAllocationEndAdapter(faAdaptee.createComponentPortAllocationEnd(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getFaPackage();
  }
  
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage getFaPackage() {
    return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.eINSTANCE;
  }
}
