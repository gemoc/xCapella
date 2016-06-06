package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.oa.OaFactory;

@SuppressWarnings("all")
public class OaFactoryAdapter extends EFactoryImpl implements org.gemoc.scenario.xdsml.functionscenariomt.oa.OaFactory {
  private FunctionScenarioMTAdaptersFactory adaptersFactory = org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory.getInstance();
  
  private OaFactory oaAdaptee = org.polarsys.capella.core.data.oa.OaFactory.eINSTANCE;
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.oa.OperationalAnalysis createOperationalAnalysis() {
    return adaptersFactory.createOperationalAnalysisAdapter(oaAdaptee.createOperationalAnalysis(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.oa.OperationalActivityPkg createOperationalActivityPkg() {
    return adaptersFactory.createOperationalActivityPkgAdapter(oaAdaptee.createOperationalActivityPkg(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.oa.OperationalActivity createOperationalActivity() {
    return adaptersFactory.createOperationalActivityAdapter(oaAdaptee.createOperationalActivity(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.oa.OperationalProcess createOperationalProcess() {
    return adaptersFactory.createOperationalProcessAdapter(oaAdaptee.createOperationalProcess(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.oa.Swimlane createSwimlane() {
    return adaptersFactory.createSwimlaneAdapter(oaAdaptee.createSwimlane(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.oa.OperationalCapabilityPkg createOperationalCapabilityPkg() {
    return adaptersFactory.createOperationalCapabilityPkgAdapter(oaAdaptee.createOperationalCapabilityPkg(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.oa.OperationalCapability createOperationalCapability() {
    return adaptersFactory.createOperationalCapabilityAdapter(oaAdaptee.createOperationalCapability(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.oa.ActivityAllocation createActivityAllocation() {
    return adaptersFactory.createActivityAllocationAdapter(oaAdaptee.createActivityAllocation(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.oa.RolePkg createRolePkg() {
    return adaptersFactory.createRolePkgAdapter(oaAdaptee.createRolePkg(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.oa.Role createRole() {
    return adaptersFactory.createRoleAdapter(oaAdaptee.createRole(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.oa.RoleAssemblyUsage createRoleAssemblyUsage() {
    return adaptersFactory.createRoleAssemblyUsageAdapter(oaAdaptee.createRoleAssemblyUsage(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.oa.RoleAllocation createRoleAllocation() {
    return adaptersFactory.createRoleAllocationAdapter(oaAdaptee.createRoleAllocation(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.oa.EntityPkg createEntityPkg() {
    return adaptersFactory.createEntityPkgAdapter(oaAdaptee.createEntityPkg(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.oa.Entity createEntity() {
    return adaptersFactory.createEntityAdapter(oaAdaptee.createEntity(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.oa.ConceptPkg createConceptPkg() {
    return adaptersFactory.createConceptPkgAdapter(oaAdaptee.createConceptPkg(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.oa.Concept createConcept() {
    return adaptersFactory.createConceptAdapter(oaAdaptee.createConcept(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.oa.ConceptCompliance createConceptCompliance() {
    return adaptersFactory.createConceptComplianceAdapter(oaAdaptee.createConceptCompliance(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.oa.ItemInConcept createItemInConcept() {
    return adaptersFactory.createItemInConceptAdapter(oaAdaptee.createItemInConcept(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.oa.OperationalActor createOperationalActor() {
    return adaptersFactory.createOperationalActorAdapter(oaAdaptee.createOperationalActor(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.oa.CommunityOfInterest createCommunityOfInterest() {
    return adaptersFactory.createCommunityOfInterestAdapter(oaAdaptee.createCommunityOfInterest(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.oa.CommunityOfInterestComposition createCommunityOfInterestComposition() {
    return adaptersFactory.createCommunityOfInterestCompositionAdapter(oaAdaptee.createCommunityOfInterestComposition(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.oa.OrganisationalUnit createOrganisationalUnit() {
    return adaptersFactory.createOrganisationalUnitAdapter(oaAdaptee.createOrganisationalUnit(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.oa.OrganisationalUnitComposition createOrganisationalUnitComposition() {
    return adaptersFactory.createOrganisationalUnitCompositionAdapter(oaAdaptee.createOrganisationalUnitComposition(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.oa.Location createLocation() {
    return adaptersFactory.createLocationAdapter(oaAdaptee.createLocation(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.oa.CapabilityConfiguration createCapabilityConfiguration() {
    return adaptersFactory.createCapabilityConfigurationAdapter(oaAdaptee.createCapabilityConfiguration(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.oa.CommunicationMean createCommunicationMean() {
    return adaptersFactory.createCommunicationMeanAdapter(oaAdaptee.createCommunicationMean(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.oa.EntityOperationalCapabilityInvolvement createEntityOperationalCapabilityInvolvement() {
    return adaptersFactory.createEntityOperationalCapabilityInvolvementAdapter(oaAdaptee.createEntityOperationalCapabilityInvolvement(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.oa.OperationalContext createOperationalContext() {
    return adaptersFactory.createOperationalContextAdapter(oaAdaptee.createOperationalContext(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getOaPackage();
  }
  
  public org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage getOaPackage() {
    return org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.eINSTANCE;
  }
}
