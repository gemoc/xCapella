package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.capellacommon.StateTransition;

@SuppressWarnings("all")
public class StateTransitionAdapter extends EObjectAdapter<StateTransition> implements org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.StateTransition {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public StateTransitionAdapter() {
    super(org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getId() {
    return adaptee.getId();
  }
  
  @Override
  public void setId(final String o) {
    adaptee.setId(o);
  }
  
  @Override
  public String getSid() {
    return adaptee.getSid();
  }
  
  @Override
  public void setSid(final String o) {
    adaptee.setSid(o);
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public boolean isVisibleInDoc() {
    return adaptee.isVisibleInDoc();
  }
  
  @Override
  public void setVisibleInDoc(final boolean o) {
    adaptee.setVisibleInDoc(o);
  }
  
  @Override
  public boolean isVisibleInLM() {
    return adaptee.isVisibleInLM();
  }
  
  @Override
  public void setVisibleInLM(final boolean o) {
    adaptee.setVisibleInLM(o);
  }
  
  @Override
  public String getSummary() {
    return adaptee.getSummary();
  }
  
  @Override
  public void setSummary(final String o) {
    adaptee.setSummary(o);
  }
  
  @Override
  public String getDescription() {
    return adaptee.getDescription();
  }
  
  @Override
  public void setDescription(final String o) {
    adaptee.setDescription(o);
  }
  
  @Override
  public String getReview() {
    return adaptee.getReview();
  }
  
  @Override
  public void setReview(final String o) {
    adaptee.setReview(o);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.TransitionKind getKind() {
    return org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.TransitionKind.get(adaptee.getKind().getValue());
  }
  
  @Override
  public void setKind(final org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.TransitionKind o) {
    adaptee.setKind(org.polarsys.capella.core.data.capellacommon.TransitionKind.get(o.getValue()));
  }
  
  @Override
  public String getTriggerDescription() {
    return adaptee.getTriggerDescription();
  }
  
  @Override
  public void setTriggerDescription(final String o) {
    adaptee.setTriggerDescription(o);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.emde.ElementExtension> */Object ownedExtensions_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.emde.ElementExtension> */Object getOwnedExtensions() {
    if (ownedExtensions_ == null)
    	ownedExtensions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedExtensions(), adaptersFactory, eResource);
    return ownedExtensions_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractConstraint> */Object constraints_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractConstraint> */Object getConstraints() {
    if (constraints_ == null)
    	constraints_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getConstraints(), adaptersFactory, eResource);
    return constraints_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractConstraint> */Object ownedConstraints_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractConstraint> */Object getOwnedConstraints() {
    if (ownedConstraints_ == null)
    	ownedConstraints_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedConstraints(), adaptersFactory, eResource);
    return ownedConstraints_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractTrace> */Object incomingTraces_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractTrace> */Object getIncomingTraces() {
    if (incomingTraces_ == null)
    	incomingTraces_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingTraces(), adaptersFactory, eResource);
    return incomingTraces_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractTrace> */Object outgoingTraces_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractTrace> */Object getOutgoingTraces() {
    if (outgoingTraces_ == null)
    	outgoingTraces_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingTraces(), adaptersFactory, eResource);
    return outgoingTraces_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.AbstractPropertyValue> */Object ownedPropertyValues_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.AbstractPropertyValue> */Object getOwnedPropertyValues() {
    if (ownedPropertyValues_ == null)
    	ownedPropertyValues_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedPropertyValues(), adaptersFactory, eResource);
    return ownedPropertyValues_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyType> */Object ownedEnumerationPropertyTypes_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyType> */Object getOwnedEnumerationPropertyTypes() {
    if (ownedEnumerationPropertyTypes_ == null)
    	ownedEnumerationPropertyTypes_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedEnumerationPropertyTypes(), adaptersFactory, eResource);
    return ownedEnumerationPropertyTypes_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.AbstractPropertyValue> */Object appliedPropertyValues_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.AbstractPropertyValue> */Object getAppliedPropertyValues() {
    if (appliedPropertyValues_ == null)
    	appliedPropertyValues_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAppliedPropertyValues(), adaptersFactory, eResource);
    return appliedPropertyValues_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.PropertyValueGroup> */Object ownedPropertyValueGroups_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.PropertyValueGroup> */Object getOwnedPropertyValueGroups() {
    if (ownedPropertyValueGroups_ == null)
    	ownedPropertyValueGroups_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedPropertyValueGroups(), adaptersFactory, eResource);
    return ownedPropertyValueGroups_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.PropertyValueGroup> */Object appliedPropertyValueGroups_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.PropertyValueGroup> */Object getAppliedPropertyValueGroups() {
    if (appliedPropertyValueGroups_ == null)
    	appliedPropertyValueGroups_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAppliedPropertyValueGroups(), adaptersFactory, eResource);
    return appliedPropertyValueGroups_;
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral getStatus() {
    return () adaptersFactory.createAdapter(adaptee.getStatus(), eResource);
  }
  
  @Override
  public void setStatus(final org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral o) {
    if (o != null)
    	adaptee.setStatus(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.EnumerationPropertyLiteralAdapter) o).getAdaptee());
    else adaptee.setStatus(null);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral> */Object features_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral> */Object getFeatures() {
    if (features_ == null)
    	features_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getFeatures(), adaptersFactory, eResource);
    return features_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.requirement.Requirement> */Object appliedRequirements_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.requirement.Requirement> */Object getAppliedRequirements() {
    if (appliedRequirements_ == null)
    	appliedRequirements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAppliedRequirements(), adaptersFactory, eResource);
    return appliedRequirements_;
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractInformationFlow getRealizedFlow() {
    return () adaptersFactory.createAdapter(adaptee.getRealizedFlow(), eResource);
  }
  
  @Override
  public void setRealizedFlow(final org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractInformationFlow o) {
    if (o != null)
    	adaptee.setRealizedFlow(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractInformationFlowAdapter) o).getAdaptee());
    else adaptee.setRealizedFlow(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Constraint getGuard() {
    return () adaptersFactory.createAdapter(adaptee.getGuard(), eResource);
  }
  
  @Override
  public void setGuard(final org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Constraint o) {
    if (o != null)
    	adaptee.setGuard(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ConstraintAdapter) o).getAdaptee());
    else adaptee.setGuard(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.AbstractState getSource() {
    return () adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.AbstractState o) {
    if (o != null)
    	adaptee.setSource(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.AbstractStateAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.AbstractState getTarget() {
    return () adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.AbstractState o) {
    if (o != null)
    	adaptee.setTarget(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.AbstractStateAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractEvent getEffect() {
    return () adaptersFactory.createAdapter(adaptee.getEffect(), eResource);
  }
  
  @Override
  public void setEffect(final org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractEvent o) {
    if (o != null)
    	adaptee.setEffect(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractEventAdapter) o).getAdaptee());
    else adaptee.setEffect(null);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractEvent> */Object triggers_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractEvent> */Object getTriggers() {
    if (triggers_ == null)
    	triggers_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getTriggers(), adaptersFactory, eResource);
    return triggers_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.StateTransitionRealization> */Object ownedStateTransitionRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.StateTransitionRealization> */Object getOwnedStateTransitionRealizations() {
    if (ownedStateTransitionRealizations_ == null)
    	ownedStateTransitionRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedStateTransitionRealizations(), adaptersFactory, eResource);
    return ownedStateTransitionRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.StateTransition> */Object realizedStateTransitions_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.StateTransition> */Object getRealizedStateTransitions() {
    if (realizedStateTransitions_ == null)
    	realizedStateTransitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizedStateTransitions(), adaptersFactory, eResource);
    return realizedStateTransitions_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.StateTransition> */Object realizingStateTransitions_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.StateTransition> */Object getRealizingStateTransitions() {
    if (realizingStateTransitions_ == null)
    	realizingStateTransitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizingStateTransitions(), adaptersFactory, eResource);
    return realizingStateTransitions_;
  }
  
  @Override
  public void destroy() {
    adaptee.destroy();
  }
  
  @Override
  public String getFullLabel() {
    return adaptee.getFullLabel();
  }
  
  @Override
  public String getLabel() {
    return adaptee.getLabel();
  }
  
  @Override
  public boolean hasUnnamedLabel() {
    return adaptee.hasUnnamedLabel();
  }
  
  protected final static String ID_EDEFAULT = null;
  
  protected final static String SID_EDEFAULT = null;
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static boolean VISIBLE_IN_DOC_EDEFAULT = true;
  
  protected final static boolean VISIBLE_IN_LM_EDEFAULT = true;
  
  protected final static String SUMMARY_EDEFAULT = null;
  
  protected final static String DESCRIPTION_EDEFAULT = null;
  
  protected final static String REVIEW_EDEFAULT = null;
  
  protected final static org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.TransitionKind KIND_EDEFAULT = org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.TransitionKind.INTERNAL;
  
  protected final static String TRIGGER_DESCRIPTION_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.eINSTANCE.getStateTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__NAME:
    		return getName();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__INCOMING_TRACES:
    		return getIncomingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__OUTGOING_TRACES:
    		return getOutgoingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__VISIBLE_IN_DOC:
    		return isVisibleInDoc() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__VISIBLE_IN_LM:
    		return isVisibleInLM() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__SUMMARY:
    		return getSummary();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__DESCRIPTION:
    		return getDescription();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__REVIEW:
    		return getReview();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__STATUS:
    		return getStatus();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__FEATURES:
    		return getFeatures();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__REALIZED_FLOW:
    		return getRealizedFlow();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__KIND:
    		return getKind();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__TRIGGER_DESCRIPTION:
    		return getTriggerDescription();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__GUARD:
    		return getGuard();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__SOURCE:
    		return getSource();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__TARGET:
    		return getTarget();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__EFFECT:
    		return getEffect();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__TRIGGERS:
    		return getTriggers();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__OWNED_STATE_TRANSITION_REALIZATIONS:
    		return getOwnedStateTransitionRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__REALIZED_STATE_TRANSITIONS:
    		return getRealizedStateTransitions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__REALIZING_STATE_TRANSITIONS:
    		return getRealizingStateTransitions();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__INCOMING_TRACES:
    		return getIncomingTraces() != null && !getIncomingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__OUTGOING_TRACES:
    		return getOutgoingTraces() != null && !getOutgoingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__VISIBLE_IN_DOC:
    		return isVisibleInDoc() != VISIBLE_IN_DOC_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__VISIBLE_IN_LM:
    		return isVisibleInLM() != VISIBLE_IN_LM_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__SUMMARY:
    		return getSummary() != SUMMARY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__REVIEW:
    		return getReview() != REVIEW_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues() != null && !getOwnedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes() != null && !getOwnedEnumerationPropertyTypes().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues() != null && !getAppliedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups() != null && !getOwnedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups() != null && !getAppliedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__STATUS:
    		return getStatus() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__FEATURES:
    		return getFeatures() != null && !getFeatures().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements() != null && !getAppliedRequirements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__REALIZED_FLOW:
    		return getRealizedFlow() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__KIND:
    		return getKind() != KIND_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__TRIGGER_DESCRIPTION:
    		return getTriggerDescription() != TRIGGER_DESCRIPTION_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__GUARD:
    		return getGuard() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__SOURCE:
    		return getSource() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__TARGET:
    		return getTarget() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__EFFECT:
    		return getEffect() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__TRIGGERS:
    		return getTriggers() != null && !getTriggers().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__OWNED_STATE_TRANSITION_REALIZATIONS:
    		return getOwnedStateTransitionRealizations() != null && !getOwnedStateTransitionRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__REALIZED_STATE_TRANSITIONS:
    		return getRealizedStateTransitions() != null && !getRealizedStateTransitions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__REALIZING_STATE_TRANSITIONS:
    		return getRealizingStateTransitions() != null && !getRealizingStateTransitions().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__VISIBLE_IN_DOC:
    		setVisibleInDoc(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__VISIBLE_IN_LM:
    		setVisibleInLM(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__SUMMARY:
    		setSummary(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__REVIEW:
    		setReview(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__OWNED_PROPERTY_VALUES:
    		getOwnedPropertyValues().clear();
    		getOwnedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__OWNED_ENUMERATION_PROPERTY_TYPES:
    		getOwnedEnumerationPropertyTypes().clear();
    		getOwnedEnumerationPropertyTypes().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__APPLIED_PROPERTY_VALUES:
    		getAppliedPropertyValues().clear();
    		getAppliedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__OWNED_PROPERTY_VALUE_GROUPS:
    		getOwnedPropertyValueGroups().clear();
    		getOwnedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__APPLIED_PROPERTY_VALUE_GROUPS:
    		getAppliedPropertyValueGroups().clear();
    		getAppliedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__STATUS:
    		setStatus(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__FEATURES:
    		getFeatures().clear();
    		getFeatures().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__REALIZED_FLOW:
    		setRealizedFlow(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractInformationFlow)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__KIND:
    		setKind(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.TransitionKind)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__TRIGGER_DESCRIPTION:
    		setTriggerDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__GUARD:
    		setGuard(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Constraint)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__SOURCE:
    		setSource(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.AbstractState)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__TARGET:
    		setTarget(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.AbstractState)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__EFFECT:
    		setEffect(
    		(org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractEvent)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__TRIGGERS:
    		getTriggers().clear();
    		getTriggers().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__OWNED_STATE_TRANSITION_REALIZATIONS:
    		getOwnedStateTransitionRealizations().clear();
    		getOwnedStateTransitionRealizations().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractRelationship.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__REALIZED_FLOW:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_RELATIONSHIP__REALIZED_FLOW;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Relationship.class) {
    	switch (derivedFeatureID) {
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractRelationship.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_RELATIONSHIP__REALIZED_FLOW:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.STATE_TRANSITION__REALIZED_FLOW;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Relationship.class) {
    	switch (baseFeatureID) {
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
