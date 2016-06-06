package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.requirement.RequirementFactory;

@SuppressWarnings("all")
public class RequirementFactoryAdapter extends EFactoryImpl implements org.gemoc.scenario.xdsml.functionscenariomt.requirement.RequirementFactory {
  private FunctionScenarioMTAdaptersFactory adaptersFactory = org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory.getInstance();
  
  private RequirementFactory requirementAdaptee = org.polarsys.capella.core.data.requirement.RequirementFactory.eINSTANCE;
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.requirement.RequirementsPkg createRequirementsPkg() {
    return adaptersFactory.createRequirementsPkgAdapter(requirementAdaptee.createRequirementsPkg(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.requirement.RequirementsTrace createRequirementsTrace() {
    return adaptersFactory.createRequirementsTraceAdapter(requirementAdaptee.createRequirementsTrace(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.requirement.SystemFunctionalInterfaceRequirement createSystemFunctionalInterfaceRequirement() {
    return adaptersFactory.createSystemFunctionalInterfaceRequirementAdapter(requirementAdaptee.createSystemFunctionalInterfaceRequirement(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.requirement.SystemFunctionalRequirement createSystemFunctionalRequirement() {
    return adaptersFactory.createSystemFunctionalRequirementAdapter(requirementAdaptee.createSystemFunctionalRequirement(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.requirement.SystemNonFunctionalInterfaceRequirement createSystemNonFunctionalInterfaceRequirement() {
    return adaptersFactory.createSystemNonFunctionalInterfaceRequirementAdapter(requirementAdaptee.createSystemNonFunctionalInterfaceRequirement(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.requirement.SystemNonFunctionalRequirement createSystemNonFunctionalRequirement() {
    return adaptersFactory.createSystemNonFunctionalRequirementAdapter(requirementAdaptee.createSystemNonFunctionalRequirement(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.requirement.SystemUserRequirement createSystemUserRequirement() {
    return adaptersFactory.createSystemUserRequirementAdapter(requirementAdaptee.createSystemUserRequirement(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getRequirementPackage();
  }
  
  public org.gemoc.scenario.xdsml.functionscenariomt.requirement.RequirementPackage getRequirementPackage() {
    return org.gemoc.scenario.xdsml.functionscenariomt.requirement.RequirementPackage.eINSTANCE;
  }
}
