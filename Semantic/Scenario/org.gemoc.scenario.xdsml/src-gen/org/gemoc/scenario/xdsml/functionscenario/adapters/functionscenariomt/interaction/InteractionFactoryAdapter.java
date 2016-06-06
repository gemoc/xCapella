package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.interaction.InteractionFactory;

@SuppressWarnings("all")
public class InteractionFactoryAdapter extends EFactoryImpl implements org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionFactory {
  private FunctionScenarioMTAdaptersFactory adaptersFactory = org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory.getInstance();
  
  private InteractionFactory interactionAdaptee = org.polarsys.capella.core.data.interaction.InteractionFactory.eINSTANCE;
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.SequenceMessage createSequenceMessage() {
    return adaptersFactory.createSequenceMessageAdapter(interactionAdaptee.createSequenceMessage(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.Scenario createScenario() {
    return adaptersFactory.createScenarioAdapter(interactionAdaptee.createScenario(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.MessageEnd createMessageEnd() {
    return adaptersFactory.createMessageEndAdapter(interactionAdaptee.createMessageEnd(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.Execution createExecution() {
    return adaptersFactory.createExecutionAdapter(interactionAdaptee.createExecution(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.ExecutionEnd createExecutionEnd() {
    return adaptersFactory.createExecutionEndAdapter(interactionAdaptee.createExecutionEnd(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.CreationEvent createCreationEvent() {
    return adaptersFactory.createCreationEventAdapter(interactionAdaptee.createCreationEvent(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.DestructionEvent createDestructionEvent() {
    return adaptersFactory.createDestructionEventAdapter(interactionAdaptee.createDestructionEvent(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.ExecutionEvent createExecutionEvent() {
    return adaptersFactory.createExecutionEventAdapter(interactionAdaptee.createExecutionEvent(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.InstanceRole createInstanceRole() {
    return adaptersFactory.createInstanceRoleAdapter(interactionAdaptee.createInstanceRole(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.EventReceiptOperation createEventReceiptOperation() {
    return adaptersFactory.createEventReceiptOperationAdapter(interactionAdaptee.createEventReceiptOperation(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.EventSentOperation createEventSentOperation() {
    return adaptersFactory.createEventSentOperationAdapter(interactionAdaptee.createEventSentOperation(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.MergeLink createMergeLink() {
    return adaptersFactory.createMergeLinkAdapter(interactionAdaptee.createMergeLink(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.RefinementLink createRefinementLink() {
    return adaptersFactory.createRefinementLinkAdapter(interactionAdaptee.createRefinementLink(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapabilityRealization createAbstractCapabilityRealization() {
    return adaptersFactory.createAbstractCapabilityRealizationAdapter(interactionAdaptee.createAbstractCapabilityRealization(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapabilityExtend createAbstractCapabilityExtend() {
    return adaptersFactory.createAbstractCapabilityExtendAdapter(interactionAdaptee.createAbstractCapabilityExtend(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapabilityExtensionPoint createAbstractCapabilityExtensionPoint() {
    return adaptersFactory.createAbstractCapabilityExtensionPointAdapter(interactionAdaptee.createAbstractCapabilityExtensionPoint(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapabilityGeneralization createAbstractCapabilityGeneralization() {
    return adaptersFactory.createAbstractCapabilityGeneralizationAdapter(interactionAdaptee.createAbstractCapabilityGeneralization(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapabilityInclude createAbstractCapabilityInclude() {
    return adaptersFactory.createAbstractCapabilityIncludeAdapter(interactionAdaptee.createAbstractCapabilityInclude(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionState createInteractionState() {
    return adaptersFactory.createInteractionStateAdapter(interactionAdaptee.createInteractionState(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionUse createInteractionUse() {
    return adaptersFactory.createInteractionUseAdapter(interactionAdaptee.createInteractionUse(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.CombinedFragment createCombinedFragment() {
    return adaptersFactory.createCombinedFragmentAdapter(interactionAdaptee.createCombinedFragment(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.Gate createGate() {
    return adaptersFactory.createGateAdapter(interactionAdaptee.createGate(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionOperand createInteractionOperand() {
    return adaptersFactory.createInteractionOperandAdapter(interactionAdaptee.createInteractionOperand(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.FragmentEnd createFragmentEnd() {
    return adaptersFactory.createFragmentEndAdapter(interactionAdaptee.createFragmentEnd(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.FunctionalChainAbstractCapabilityInvolvement createFunctionalChainAbstractCapabilityInvolvement() {
    return adaptersFactory.createFunctionalChainAbstractCapabilityInvolvementAdapter(interactionAdaptee.createFunctionalChainAbstractCapabilityInvolvement(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractFunctionAbstractCapabilityInvolvement createAbstractFunctionAbstractCapabilityInvolvement() {
    return adaptersFactory.createAbstractFunctionAbstractCapabilityInvolvementAdapter(interactionAdaptee.createAbstractFunctionAbstractCapabilityInvolvement(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.ScenarioRealization createScenarioRealization() {
    return adaptersFactory.createScenarioRealizationAdapter(interactionAdaptee.createScenarioRealization(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.StateFragment createStateFragment() {
    return adaptersFactory.createStateFragmentAdapter(interactionAdaptee.createStateFragment(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.ArmTimerEvent createArmTimerEvent() {
    return adaptersFactory.createArmTimerEventAdapter(interactionAdaptee.createArmTimerEvent(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.CancelTimerEvent createCancelTimerEvent() {
    return adaptersFactory.createCancelTimerEventAdapter(interactionAdaptee.createCancelTimerEvent(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.ConstraintDuration createConstraintDuration() {
    return adaptersFactory.createConstraintDurationAdapter(interactionAdaptee.createConstraintDuration(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.SequenceMessageValuation createSequenceMessageValuation() {
    return adaptersFactory.createSequenceMessageValuationAdapter(interactionAdaptee.createSequenceMessageValuation(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getInteractionPackage();
  }
  
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage getInteractionPackage() {
    return org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.eINSTANCE;
  }
}
