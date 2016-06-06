package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.interaction.Scenario;

@SuppressWarnings("all")
public class ScenarioAdapter extends EObjectAdapter<Scenario> implements org.gemoc.scenario.xdsml.functionscenariomt.interaction.Scenario {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public ScenarioAdapter() {
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
  public boolean isIsControlOperator() {
    return adaptee.isIsControlOperator();
  }
  
  @Override
  public void setIsControlOperator(final boolean o) {
    adaptee.setIsControlOperator(o);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.interaction.ScenarioKind getKind() {
    return org.gemoc.scenario.xdsml.functionscenariomt.interaction.ScenarioKind.get(adaptee.getKind().getValue());
  }
  
  @Override
  public void setKind(final org.gemoc.scenario.xdsml.functionscenariomt.interaction.ScenarioKind o) {
    adaptee.setKind(org.polarsys.capella.core.data.interaction.ScenarioKind.get(o.getValue()));
  }
  
  @Override
  public boolean isMerged() {
    return adaptee.isMerged();
  }
  
  @Override
  public void setMerged(final boolean o) {
    adaptee.setMerged(o);
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
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Trace> */Object ownedTraces_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Trace> */Object getOwnedTraces() {
    if (ownedTraces_ == null)
    	ownedTraces_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedTraces(), adaptersFactory, eResource);
    return ownedTraces_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.GenericTrace> */Object containedGenericTraces_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.GenericTrace> */Object getContainedGenericTraces() {
    if (containedGenericTraces_ == null)
    	containedGenericTraces_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getContainedGenericTraces(), adaptersFactory, eResource);
    return containedGenericTraces_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.requirement.RequirementsTrace> */Object containedRequirementsTraces_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.requirement.RequirementsTrace> */Object getContainedRequirementsTraces() {
    if (containedRequirementsTraces_ == null)
    	containedRequirementsTraces_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getContainedRequirementsTraces(), adaptersFactory, eResource);
    return containedRequirementsTraces_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.NamingRule> */Object namingRules_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.NamingRule> */Object getNamingRules() {
    if (namingRules_ == null)
    	namingRules_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getNamingRules(), adaptersFactory, eResource);
    return namingRules_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractParameterSet> */Object ownedParameterSet_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractParameterSet> */Object getOwnedParameterSet() {
    if (ownedParameterSet_ == null)
    	ownedParameterSet_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedParameterSet(), adaptersFactory, eResource);
    return ownedParameterSet_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractParameter> */Object ownedParameter_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractParameter> */Object getOwnedParameter() {
    if (ownedParameter_ == null)
    	ownedParameter_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedParameter(), adaptersFactory, eResource);
    return ownedParameter_;
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Constraint getPreCondition() {
    return () adaptersFactory.createAdapter(adaptee.getPreCondition(), eResource);
  }
  
  @Override
  public void setPreCondition(final org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Constraint o) {
    if (o != null)
    	adaptee.setPreCondition(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ConstraintAdapter) o).getAdaptee());
    else adaptee.setPreCondition(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Constraint getPostCondition() {
    return () adaptersFactory.createAdapter(adaptee.getPostCondition(), eResource);
  }
  
  @Override
  public void setPostCondition(final org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Constraint o) {
    if (o != null)
    	adaptee.setPostCondition(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ConstraintAdapter) o).getAdaptee());
    else adaptee.setPostCondition(null);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.InstanceRole> */Object ownedInstanceRoles_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.InstanceRole> */Object getOwnedInstanceRoles() {
    if (ownedInstanceRoles_ == null)
    	ownedInstanceRoles_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedInstanceRoles(), adaptersFactory, eResource);
    return ownedInstanceRoles_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.SequenceMessage> */Object ownedMessages_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.SequenceMessage> */Object getOwnedMessages() {
    if (ownedMessages_ == null)
    	ownedMessages_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedMessages(), adaptersFactory, eResource);
    return ownedMessages_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionFragment> */Object ownedInteractionFragments_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionFragment> */Object getOwnedInteractionFragments() {
    if (ownedInteractionFragments_ == null)
    	ownedInteractionFragments_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedInteractionFragments(), adaptersFactory, eResource);
    return ownedInteractionFragments_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.TimeLapse> */Object ownedTimeLapses_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.TimeLapse> */Object getOwnedTimeLapses() {
    if (ownedTimeLapses_ == null)
    	ownedTimeLapses_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedTimeLapses(), adaptersFactory, eResource);
    return ownedTimeLapses_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.Event> */Object ownedEvents_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.Event> */Object getOwnedEvents() {
    if (ownedEvents_ == null)
    	ownedEvents_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedEvents(), adaptersFactory, eResource);
    return ownedEvents_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.Gate> */Object ownedFormalGates_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.Gate> */Object getOwnedFormalGates() {
    if (ownedFormalGates_ == null)
    	ownedFormalGates_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedFormalGates(), adaptersFactory, eResource);
    return ownedFormalGates_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.ScenarioRealization> */Object ownedScenarioRealization_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.ScenarioRealization> */Object getOwnedScenarioRealization() {
    if (ownedScenarioRealization_ == null)
    	ownedScenarioRealization_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedScenarioRealization(), adaptersFactory, eResource);
    return ownedScenarioRealization_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.ConstraintDuration> */Object ownedConstraintDurations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.ConstraintDuration> */Object getOwnedConstraintDurations() {
    if (ownedConstraintDurations_ == null)
    	ownedConstraintDurations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedConstraintDurations(), adaptersFactory, eResource);
    return ownedConstraintDurations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.AbstractFunction> */Object containedFunctions_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.AbstractFunction> */Object getContainedFunctions() {
    if (containedFunctions_ == null)
    	containedFunctions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getContainedFunctions(), adaptersFactory, eResource);
    return containedFunctions_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Part> */Object containedParts_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Part> */Object getContainedParts() {
    if (containedParts_ == null)
    	containedParts_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getContainedParts(), adaptersFactory, eResource);
    return containedParts_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.Scenario> */Object referencedScenarios_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.Scenario> */Object getReferencedScenarios() {
    if (referencedScenarios_ == null)
    	referencedScenarios_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getReferencedScenarios(), adaptersFactory, eResource);
    return referencedScenarios_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.Scenario> */Object realizedScenarios_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.Scenario> */Object getRealizedScenarios() {
    if (realizedScenarios_ == null)
    	realizedScenarios_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizedScenarios(), adaptersFactory, eResource);
    return realizedScenarios_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.Scenario> */Object realizingScenarios_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.Scenario> */Object getRealizingScenarios() {
    if (realizingScenarios_ == null)
    	realizingScenarios_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizingScenarios(), adaptersFactory, eResource);
    return realizingScenarios_;
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
  
  protected final static boolean IS_CONTROL_OPERATOR_EDEFAULT = false;
  
  protected final static org.gemoc.scenario.xdsml.functionscenariomt.interaction.ScenarioKind KIND_EDEFAULT = org.gemoc.scenario.xdsml.functionscenariomt.interaction.ScenarioKind.UNSET;
  
  protected final static boolean MERGED_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.eINSTANCE.getScenario();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__NAME:
    		return getName();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__INCOMING_TRACES:
    		return getIncomingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OUTGOING_TRACES:
    		return getOutgoingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__VISIBLE_IN_DOC:
    		return isVisibleInDoc() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__VISIBLE_IN_LM:
    		return isVisibleInLM() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__SUMMARY:
    		return getSummary();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__DESCRIPTION:
    		return getDescription();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__REVIEW:
    		return getReview();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__STATUS:
    		return getStatus();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__FEATURES:
    		return getFeatures();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_TRACES:
    		return getOwnedTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__CONTAINED_GENERIC_TRACES:
    		return getContainedGenericTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__CONTAINED_REQUIREMENTS_TRACES:
    		return getContainedRequirementsTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__NAMING_RULES:
    		return getNamingRules();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__IS_CONTROL_OPERATOR:
    		return isIsControlOperator() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_PARAMETER_SET:
    		return getOwnedParameterSet();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_PARAMETER:
    		return getOwnedParameter();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__KIND:
    		return getKind();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__MERGED:
    		return isMerged() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__PRE_CONDITION:
    		return getPreCondition();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__POST_CONDITION:
    		return getPostCondition();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_INSTANCE_ROLES:
    		return getOwnedInstanceRoles();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_MESSAGES:
    		return getOwnedMessages();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_INTERACTION_FRAGMENTS:
    		return getOwnedInteractionFragments();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_TIME_LAPSES:
    		return getOwnedTimeLapses();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_EVENTS:
    		return getOwnedEvents();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_FORMAL_GATES:
    		return getOwnedFormalGates();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_SCENARIO_REALIZATION:
    		return getOwnedScenarioRealization();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_CONSTRAINT_DURATIONS:
    		return getOwnedConstraintDurations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__CONTAINED_FUNCTIONS:
    		return getContainedFunctions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__CONTAINED_PARTS:
    		return getContainedParts();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__REFERENCED_SCENARIOS:
    		return getReferencedScenarios();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__REALIZED_SCENARIOS:
    		return getRealizedScenarios();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__REALIZING_SCENARIOS:
    		return getRealizingScenarios();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__INCOMING_TRACES:
    		return getIncomingTraces() != null && !getIncomingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OUTGOING_TRACES:
    		return getOutgoingTraces() != null && !getOutgoingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__VISIBLE_IN_DOC:
    		return isVisibleInDoc() != VISIBLE_IN_DOC_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__VISIBLE_IN_LM:
    		return isVisibleInLM() != VISIBLE_IN_LM_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__SUMMARY:
    		return getSummary() != SUMMARY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__REVIEW:
    		return getReview() != REVIEW_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues() != null && !getOwnedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes() != null && !getOwnedEnumerationPropertyTypes().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues() != null && !getAppliedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups() != null && !getOwnedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups() != null && !getAppliedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__STATUS:
    		return getStatus() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__FEATURES:
    		return getFeatures() != null && !getFeatures().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements() != null && !getAppliedRequirements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_TRACES:
    		return getOwnedTraces() != null && !getOwnedTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__CONTAINED_GENERIC_TRACES:
    		return getContainedGenericTraces() != null && !getContainedGenericTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__CONTAINED_REQUIREMENTS_TRACES:
    		return getContainedRequirementsTraces() != null && !getContainedRequirementsTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__NAMING_RULES:
    		return getNamingRules() != null && !getNamingRules().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__IS_CONTROL_OPERATOR:
    		return isIsControlOperator() != IS_CONTROL_OPERATOR_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_PARAMETER_SET:
    		return getOwnedParameterSet() != null && !getOwnedParameterSet().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_PARAMETER:
    		return getOwnedParameter() != null && !getOwnedParameter().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__KIND:
    		return getKind() != KIND_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__MERGED:
    		return isMerged() != MERGED_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__PRE_CONDITION:
    		return getPreCondition() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__POST_CONDITION:
    		return getPostCondition() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_INSTANCE_ROLES:
    		return getOwnedInstanceRoles() != null && !getOwnedInstanceRoles().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_MESSAGES:
    		return getOwnedMessages() != null && !getOwnedMessages().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_INTERACTION_FRAGMENTS:
    		return getOwnedInteractionFragments() != null && !getOwnedInteractionFragments().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_TIME_LAPSES:
    		return getOwnedTimeLapses() != null && !getOwnedTimeLapses().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_EVENTS:
    		return getOwnedEvents() != null && !getOwnedEvents().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_FORMAL_GATES:
    		return getOwnedFormalGates() != null && !getOwnedFormalGates().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_SCENARIO_REALIZATION:
    		return getOwnedScenarioRealization() != null && !getOwnedScenarioRealization().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_CONSTRAINT_DURATIONS:
    		return getOwnedConstraintDurations() != null && !getOwnedConstraintDurations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__CONTAINED_FUNCTIONS:
    		return getContainedFunctions() != null && !getContainedFunctions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__CONTAINED_PARTS:
    		return getContainedParts() != null && !getContainedParts().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__REFERENCED_SCENARIOS:
    		return getReferencedScenarios() != null && !getReferencedScenarios().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__REALIZED_SCENARIOS:
    		return getRealizedScenarios() != null && !getRealizedScenarios().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__REALIZING_SCENARIOS:
    		return getRealizingScenarios() != null && !getRealizingScenarios().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__VISIBLE_IN_DOC:
    		setVisibleInDoc(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__VISIBLE_IN_LM:
    		setVisibleInLM(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__SUMMARY:
    		setSummary(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__REVIEW:
    		setReview(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_PROPERTY_VALUES:
    		getOwnedPropertyValues().clear();
    		getOwnedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_ENUMERATION_PROPERTY_TYPES:
    		getOwnedEnumerationPropertyTypes().clear();
    		getOwnedEnumerationPropertyTypes().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__APPLIED_PROPERTY_VALUES:
    		getAppliedPropertyValues().clear();
    		getAppliedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_PROPERTY_VALUE_GROUPS:
    		getOwnedPropertyValueGroups().clear();
    		getOwnedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__APPLIED_PROPERTY_VALUE_GROUPS:
    		getAppliedPropertyValueGroups().clear();
    		getAppliedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__STATUS:
    		setStatus(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__FEATURES:
    		getFeatures().clear();
    		getFeatures().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_TRACES:
    		getOwnedTraces().clear();
    		getOwnedTraces().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__NAMING_RULES:
    		getNamingRules().clear();
    		getNamingRules().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__IS_CONTROL_OPERATOR:
    		setIsControlOperator(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_PARAMETER_SET:
    		getOwnedParameterSet().clear();
    		getOwnedParameterSet().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_PARAMETER:
    		getOwnedParameter().clear();
    		getOwnedParameter().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__KIND:
    		setKind(
    		(org.gemoc.scenario.xdsml.functionscenariomt.interaction.ScenarioKind)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__MERGED:
    		setMerged(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__PRE_CONDITION:
    		setPreCondition(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Constraint)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__POST_CONDITION:
    		setPostCondition(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Constraint)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_INSTANCE_ROLES:
    		getOwnedInstanceRoles().clear();
    		getOwnedInstanceRoles().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_MESSAGES:
    		getOwnedMessages().clear();
    		getOwnedMessages().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_INTERACTION_FRAGMENTS:
    		getOwnedInteractionFragments().clear();
    		getOwnedInteractionFragments().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_TIME_LAPSES:
    		getOwnedTimeLapses().clear();
    		getOwnedTimeLapses().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_EVENTS:
    		getOwnedEvents().clear();
    		getOwnedEvents().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_FORMAL_GATES:
    		getOwnedFormalGates().clear();
    		getOwnedFormalGates().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_SCENARIO_REALIZATION:
    		getOwnedScenarioRealization().clear();
    		getOwnedScenarioRealization().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_CONSTRAINT_DURATIONS:
    		getOwnedConstraintDurations().clear();
    		getOwnedConstraintDurations().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractBehavior.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__IS_CONTROL_OPERATOR:
    			return org.gemoc.scenario.xdsml.functionscenariomt.behavior.BehaviorPackage.ABSTRACT_BEHAVIOR__IS_CONTROL_OPERATOR;
    		case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_PARAMETER_SET:
    			return org.gemoc.scenario.xdsml.functionscenariomt.behavior.BehaviorPackage.ABSTRACT_BEHAVIOR__OWNED_PARAMETER_SET;
    		case org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_PARAMETER:
    			return org.gemoc.scenario.xdsml.functionscenariomt.behavior.BehaviorPackage.ABSTRACT_BEHAVIOR__OWNED_PARAMETER;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractBehavior.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.behavior.BehaviorPackage.ABSTRACT_BEHAVIOR__IS_CONTROL_OPERATOR:
    			return org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__IS_CONTROL_OPERATOR;
    		case org.gemoc.scenario.xdsml.functionscenariomt.behavior.BehaviorPackage.ABSTRACT_BEHAVIOR__OWNED_PARAMETER_SET:
    			return org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_PARAMETER_SET;
    		case org.gemoc.scenario.xdsml.functionscenariomt.behavior.BehaviorPackage.ABSTRACT_BEHAVIOR__OWNED_PARAMETER:
    			return org.gemoc.scenario.xdsml.functionscenariomt.interaction.InteractionPackage.SCENARIO__OWNED_PARAMETER;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
