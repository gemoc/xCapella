package org.gemoc.scenario.xdsml;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface FunctionScenarioMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonFactory getCapellacommonFactory();
  
  public abstract org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityFactory getActivityFactory();
  
  public abstract org.gemoc.scenario.xdsml.functionscenariomt.epbs.EpbsFactory getEpbsFactory();
  
  public abstract org.gemoc.scenario.xdsml.functionscenariomt.deployment.DeploymentFactory getDeploymentFactory();
  
  public abstract org.gemoc.scenario.xdsml.functionscenariomt.pa.PaFactory getPaFactory();
  
  public abstract org.gemoc.scenario.xdsml.functionscenariomt.behavior.BehaviorFactory getBehaviorFactory();
  
  public abstract org.gemoc.scenario.xdsml.functionscenariomt.sharedmodel.SharedmodelFactory getSharedmodelFactory();
  
  public abstract org.gemoc.scenario.xdsml.functionscenariomt.oa.OaFactory getOaFactory();
  
  public abstract org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionFactory getInteractionFactory();
  
  public abstract org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacoreFactory getCapellacoreFactory();
  
  public abstract org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationFactory getCommunicationFactory();
  
  public abstract org.gemoc.scenario.xdsml.functionscenariomt.la.LaFactory getLaFactory();
  
  public abstract org.gemoc.scenario.xdsml.functionscenariomt.capellamodeller.CapellamodellerFactory getCapellamodellerFactory();
  
  public abstract org.gemoc.scenario.xdsml.functionscenariomt.information.InformationFactory getInformationFactory();
  
  public abstract org.gemoc.scenario.xdsml.functionscenariomt.information.datatype.DatatypeFactory getDatatypeFactory();
  
  public abstract org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavalueFactory getDatavalueFactory();
  
  public abstract org.gemoc.scenario.xdsml.functionscenariomt.cs.CsFactory getCsFactory();
  
  public abstract org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcoreFactory getModellingcoreFactory();
  
  public abstract org.gemoc.scenario.xdsml.functionscenariomt.ctx.CtxFactory getCtxFactory();
  
  public abstract org.gemoc.scenario.xdsml.functionscenariomt.requirement.RequirementFactory getRequirementFactory();
  
  public abstract org.gemoc.scenario.xdsml.functionscenariomt.fa.FaFactory getFaFactory();
  
  public abstract org.gemoc.scenario.xdsml.functionscenariomt.emde.EmdeFactory getEmdeFactory();
  
  public abstract void save(final String uri) throws IOException;
}
