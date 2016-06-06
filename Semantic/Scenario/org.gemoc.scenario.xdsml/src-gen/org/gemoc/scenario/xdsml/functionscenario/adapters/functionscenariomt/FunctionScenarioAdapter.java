package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.gemoc.scenario.xdsml.FunctionScenarioMT;

@SuppressWarnings("all")
public class FunctionScenarioAdapter extends ResourceAdapter implements FunctionScenarioMT {
  public FunctionScenarioAdapter() {
    super(org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory.getInstance());
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonFactory getCapellacommonFactory() {
    return new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.CapellacommonFactoryAdapter();
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityFactory getActivityFactory() {
    return new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ActivityFactoryAdapter();
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.epbs.EpbsFactory getEpbsFactory() {
    return new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.epbs.EpbsFactoryAdapter();
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.deployment.DeploymentFactory getDeploymentFactory() {
    return new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.DeploymentFactoryAdapter();
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.pa.PaFactory getPaFactory() {
    return new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PaFactoryAdapter();
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.behavior.BehaviorFactory getBehaviorFactory() {
    return new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.BehaviorFactoryAdapter();
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.sharedmodel.SharedmodelFactory getSharedmodelFactory() {
    return new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.sharedmodel.SharedmodelFactoryAdapter();
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.oa.OaFactory getOaFactory() {
    return new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OaFactoryAdapter();
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionFactory getInteractionFactory() {
    return new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.InteractionFactoryAdapter();
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacoreFactory getCapellacoreFactory() {
    return new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.CapellacoreFactoryAdapter();
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationFactory getCommunicationFactory() {
    return new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.CommunicationFactoryAdapter();
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.la.LaFactory getLaFactory() {
    return new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LaFactoryAdapter();
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellamodeller.CapellamodellerFactory getCapellamodellerFactory() {
    return new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellamodeller.CapellamodellerFactoryAdapter();
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.InformationFactory getInformationFactory() {
    return new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.InformationFactoryAdapter();
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datatype.DatatypeFactory getDatatypeFactory() {
    return new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datatype.DatatypeFactoryAdapter();
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavalueFactory getDatavalueFactory() {
    return new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.DatavalueFactoryAdapter();
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.cs.CsFactory getCsFactory() {
    return new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.CsFactoryAdapter();
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcoreFactory getModellingcoreFactory() {
    return new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.ModellingcoreFactoryAdapter();
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxFactory getCtxFactory() {
    return new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.CtxFactoryAdapter();
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.requirement.RequirementFactory getRequirementFactory() {
    return new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.RequirementFactoryAdapter();
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.FaFactory getFaFactory() {
    return new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FaFactoryAdapter();
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.emde.EmdeFactory getEmdeFactory() {
    return new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.emde.EmdeFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getCapellacommonFactory());
    res.add(getActivityFactory());
    res.add(getEpbsFactory());
    res.add(getDeploymentFactory());
    res.add(getPaFactory());
    res.add(getBehaviorFactory());
    res.add(getSharedmodelFactory());
    res.add(getOaFactory());
    res.add(getInteractionFactory());
    res.add(getCapellacoreFactory());
    res.add(getCommunicationFactory());
    res.add(getLaFactory());
    res.add(getCapellamodellerFactory());
    res.add(getInformationFactory());
    res.add(getDatatypeFactory());
    res.add(getDatavalueFactory());
    res.add(getCsFactory());
    res.add(getModellingcoreFactory());
    res.add(getCtxFactory());
    res.add(getRequirementFactory());
    res.add(getFaFactory());
    res.add(getEmdeFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
