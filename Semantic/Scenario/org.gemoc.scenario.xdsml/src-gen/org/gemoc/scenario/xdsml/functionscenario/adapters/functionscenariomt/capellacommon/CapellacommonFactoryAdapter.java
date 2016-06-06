package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.capellacommon.CapellacommonFactory;

@SuppressWarnings("all")
public class CapellacommonFactoryAdapter extends EFactoryImpl implements org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonFactory {
  private FunctionScenarioMTAdaptersFactory adaptersFactory = org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory.getInstance();
  
  private CapellacommonFactory capellacommonAdaptee = org.polarsys.capella.core.data.capellacommon.CapellacommonFactory.eINSTANCE;
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.GenericTrace createGenericTrace() {
    return adaptersFactory.createGenericTraceAdapter(capellacommonAdaptee.createGenericTrace(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.TransfoLink createTransfoLink() {
    return adaptersFactory.createTransfoLinkAdapter(capellacommonAdaptee.createTransfoLink(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.JustificationLink createJustificationLink() {
    return adaptersFactory.createJustificationLinkAdapter(capellacommonAdaptee.createJustificationLink(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.StateMachine createStateMachine() {
    return adaptersFactory.createStateMachineAdapter(capellacommonAdaptee.createStateMachine(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.Region createRegion() {
    return adaptersFactory.createRegionAdapter(capellacommonAdaptee.createRegion(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.State createState() {
    return adaptersFactory.createStateAdapter(capellacommonAdaptee.createState(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.Mode createMode() {
    return adaptersFactory.createModeAdapter(capellacommonAdaptee.createMode(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.FinalState createFinalState() {
    return adaptersFactory.createFinalStateAdapter(capellacommonAdaptee.createFinalState(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.StateTransition createStateTransition() {
    return adaptersFactory.createStateTransitionAdapter(capellacommonAdaptee.createStateTransition(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.InitialPseudoState createInitialPseudoState() {
    return adaptersFactory.createInitialPseudoStateAdapter(capellacommonAdaptee.createInitialPseudoState(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.JoinPseudoState createJoinPseudoState() {
    return adaptersFactory.createJoinPseudoStateAdapter(capellacommonAdaptee.createJoinPseudoState(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.ForkPseudoState createForkPseudoState() {
    return adaptersFactory.createForkPseudoStateAdapter(capellacommonAdaptee.createForkPseudoState(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.ChoicePseudoState createChoicePseudoState() {
    return adaptersFactory.createChoicePseudoStateAdapter(capellacommonAdaptee.createChoicePseudoState(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.TerminatePseudoState createTerminatePseudoState() {
    return adaptersFactory.createTerminatePseudoStateAdapter(capellacommonAdaptee.createTerminatePseudoState(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.AbstractStateRealization createAbstractStateRealization() {
    return adaptersFactory.createAbstractStateRealizationAdapter(capellacommonAdaptee.createAbstractStateRealization(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.StateTransitionRealization createStateTransitionRealization() {
    return adaptersFactory.createStateTransitionRealizationAdapter(capellacommonAdaptee.createStateTransitionRealization(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.ShallowHistoryPseudoState createShallowHistoryPseudoState() {
    return adaptersFactory.createShallowHistoryPseudoStateAdapter(capellacommonAdaptee.createShallowHistoryPseudoState(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.DeepHistoryPseudoState createDeepHistoryPseudoState() {
    return adaptersFactory.createDeepHistoryPseudoStateAdapter(capellacommonAdaptee.createDeepHistoryPseudoState(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.EntryPointPseudoState createEntryPointPseudoState() {
    return adaptersFactory.createEntryPointPseudoStateAdapter(capellacommonAdaptee.createEntryPointPseudoState(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.ExitPointPseudoState createExitPointPseudoState() {
    return adaptersFactory.createExitPointPseudoStateAdapter(capellacommonAdaptee.createExitPointPseudoState(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.StateEventRealization createStateEventRealization() {
    return adaptersFactory.createStateEventRealizationAdapter(capellacommonAdaptee.createStateEventRealization(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.ChangeEvent createChangeEvent() {
    return adaptersFactory.createChangeEventAdapter(capellacommonAdaptee.createChangeEvent(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.TimeEvent createTimeEvent() {
    return adaptersFactory.createTimeEventAdapter(capellacommonAdaptee.createTimeEvent(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getCapellacommonPackage();
  }
  
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage getCapellacommonPackage() {
    return org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.eINSTANCE;
  }
}
