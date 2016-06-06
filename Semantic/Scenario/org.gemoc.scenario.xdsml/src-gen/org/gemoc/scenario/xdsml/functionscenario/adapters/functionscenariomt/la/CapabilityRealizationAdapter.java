package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.la.CapabilityRealization;

@SuppressWarnings("all")
public class CapabilityRealizationAdapter extends EObjectAdapter<CapabilityRealization> implements org.gemoc.scenario.xdsml.functionscenariomt.la.CapabilityRealization {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public CapabilityRealizationAdapter() {
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
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.PropertyValuePkg> */Object ownedPropertyValuePkgs_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.PropertyValuePkg> */Object getOwnedPropertyValuePkgs() {
    if (ownedPropertyValuePkgs_ == null)
    	ownedPropertyValuePkgs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedPropertyValuePkgs(), adaptersFactory, eResource);
    return ownedPropertyValuePkgs_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Involvement> */Object involvedInvolvements_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Involvement> */Object getInvolvedInvolvements() {
    if (involvedInvolvements_ == null)
    	involvedInvolvements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInvolvedInvolvements(), adaptersFactory, eResource);
    return involvedInvolvements_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChain> */Object ownedFunctionalChains_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChain> */Object getOwnedFunctionalChains() {
    if (ownedFunctionalChains_ == null)
    	ownedFunctionalChains_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedFunctionalChains(), adaptersFactory, eResource);
    return ownedFunctionalChains_;
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
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.Scenario> */Object ownedScenarios_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.Scenario> */Object getOwnedScenarios() {
    if (ownedScenarios_ == null)
    	ownedScenarios_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedScenarios(), adaptersFactory, eResource);
    return ownedScenarios_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapabilityRealization> */Object incomingCapabilityAllocation_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapabilityRealization> */Object getIncomingCapabilityAllocation() {
    if (incomingCapabilityAllocation_ == null)
    	incomingCapabilityAllocation_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingCapabilityAllocation(), adaptersFactory, eResource);
    return incomingCapabilityAllocation_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapabilityRealization> */Object outgoingCapabilityAllocation_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapabilityRealization> */Object getOutgoingCapabilityAllocation() {
    if (outgoingCapabilityAllocation_ == null)
    	outgoingCapabilityAllocation_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingCapabilityAllocation(), adaptersFactory, eResource);
    return outgoingCapabilityAllocation_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapabilityExtend> */Object extends_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapabilityExtend> */Object getExtends() {
    if (extends_ == null)
    	extends_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getExtends(), adaptersFactory, eResource);
    return extends_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapabilityExtend> */Object extending_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapabilityExtend> */Object getExtending() {
    if (extending_ == null)
    	extending_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getExtending(), adaptersFactory, eResource);
    return extending_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapabilityExtensionPoint> */Object abstractCapabilityExtensionPoints_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapabilityExtensionPoint> */Object getAbstractCapabilityExtensionPoints() {
    if (abstractCapabilityExtensionPoints_ == null)
    	abstractCapabilityExtensionPoints_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAbstractCapabilityExtensionPoints(), adaptersFactory, eResource);
    return abstractCapabilityExtensionPoints_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapabilityGeneralization> */Object superGeneralizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapabilityGeneralization> */Object getSuperGeneralizations() {
    if (superGeneralizations_ == null)
    	superGeneralizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSuperGeneralizations(), adaptersFactory, eResource);
    return superGeneralizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapabilityGeneralization> */Object subGeneralizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapabilityGeneralization> */Object getSubGeneralizations() {
    if (subGeneralizations_ == null)
    	subGeneralizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSubGeneralizations(), adaptersFactory, eResource);
    return subGeneralizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapabilityInclude> */Object includes_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapabilityInclude> */Object getIncludes() {
    if (includes_ == null)
    	includes_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncludes(), adaptersFactory, eResource);
    return includes_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapabilityInclude> */Object including_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapabilityInclude> */Object getIncluding() {
    if (including_ == null)
    	including_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncluding(), adaptersFactory, eResource);
    return including_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapability> */Object super_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapability> */Object getSuper() {
    if (super_ == null)
    	super_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSuper(), adaptersFactory, eResource);
    return super_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapability> */Object sub_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapability> */Object getSub() {
    if (sub_ == null)
    	sub_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSub(), adaptersFactory, eResource);
    return sub_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapability> */Object includedAbstractCapabilities_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapability> */Object getIncludedAbstractCapabilities() {
    if (includedAbstractCapabilities_ == null)
    	includedAbstractCapabilities_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncludedAbstractCapabilities(), adaptersFactory, eResource);
    return includedAbstractCapabilities_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapability> */Object includingAbstractCapabilities_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapability> */Object getIncludingAbstractCapabilities() {
    if (includingAbstractCapabilities_ == null)
    	includingAbstractCapabilities_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncludingAbstractCapabilities(), adaptersFactory, eResource);
    return includingAbstractCapabilities_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapability> */Object extendedAbstractCapabilities_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapability> */Object getExtendedAbstractCapabilities() {
    if (extendedAbstractCapabilities_ == null)
    	extendedAbstractCapabilities_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getExtendedAbstractCapabilities(), adaptersFactory, eResource);
    return extendedAbstractCapabilities_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapability> */Object extendingAbstractCapabilities_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapability> */Object getExtendingAbstractCapabilities() {
    if (extendingAbstractCapabilities_ == null)
    	extendingAbstractCapabilities_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getExtendingAbstractCapabilities(), adaptersFactory, eResource);
    return extendingAbstractCapabilities_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.FunctionalChainAbstractCapabilityInvolvement> */Object ownedFunctionalChainAbstractCapabilityInvolvements_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.FunctionalChainAbstractCapabilityInvolvement> */Object getOwnedFunctionalChainAbstractCapabilityInvolvements() {
    if (ownedFunctionalChainAbstractCapabilityInvolvements_ == null)
    	ownedFunctionalChainAbstractCapabilityInvolvements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedFunctionalChainAbstractCapabilityInvolvements(), adaptersFactory, eResource);
    return ownedFunctionalChainAbstractCapabilityInvolvements_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractFunctionAbstractCapabilityInvolvement> */Object ownedAbstractFunctionAbstractCapabilityInvolvements_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractFunctionAbstractCapabilityInvolvement> */Object getOwnedAbstractFunctionAbstractCapabilityInvolvements() {
    if (ownedAbstractFunctionAbstractCapabilityInvolvements_ == null)
    	ownedAbstractFunctionAbstractCapabilityInvolvements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedAbstractFunctionAbstractCapabilityInvolvements(), adaptersFactory, eResource);
    return ownedAbstractFunctionAbstractCapabilityInvolvements_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.State> */Object availableInStates_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.State> */Object getAvailableInStates() {
    if (availableInStates_ == null)
    	availableInStates_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAvailableInStates(), adaptersFactory, eResource);
    return availableInStates_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapabilityRealization> */Object ownedAbstractCapabilityRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapabilityRealization> */Object getOwnedAbstractCapabilityRealizations() {
    if (ownedAbstractCapabilityRealizations_ == null)
    	ownedAbstractCapabilityRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedAbstractCapabilityRealizations(), adaptersFactory, eResource);
    return ownedAbstractCapabilityRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.AbstractFunction> */Object involvedAbstractFunctions_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.AbstractFunction> */Object getInvolvedAbstractFunctions() {
    if (involvedAbstractFunctions_ == null)
    	involvedAbstractFunctions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInvolvedAbstractFunctions(), adaptersFactory, eResource);
    return involvedAbstractFunctions_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChain> */Object involvedFunctionalChains_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChain> */Object getInvolvedFunctionalChains() {
    if (involvedFunctionalChains_ == null)
    	involvedFunctionalChains_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInvolvedFunctionalChains(), adaptersFactory, eResource);
    return involvedFunctionalChains_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.ActorCapabilityRealizationInvolvement> */Object ownedActorCapabilityRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.ActorCapabilityRealizationInvolvement> */Object getOwnedActorCapabilityRealizations() {
    if (ownedActorCapabilityRealizations_ == null)
    	ownedActorCapabilityRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedActorCapabilityRealizations(), adaptersFactory, eResource);
    return ownedActorCapabilityRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.SystemComponentCapabilityRealizationInvolvement> */Object ownedSystemComponentCapabilityRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.SystemComponentCapabilityRealizationInvolvement> */Object getOwnedSystemComponentCapabilityRealizations() {
    if (ownedSystemComponentCapabilityRealizations_ == null)
    	ownedSystemComponentCapabilityRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedSystemComponentCapabilityRealizations(), adaptersFactory, eResource);
    return ownedSystemComponentCapabilityRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.AbstractActor> */Object participatingActors_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.AbstractActor> */Object getParticipatingActors() {
    if (participatingActors_ == null)
    	participatingActors_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getParticipatingActors(), adaptersFactory, eResource);
    return participatingActors_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.SystemComponent> */Object participatingSystemComponents_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.SystemComponent> */Object getParticipatingSystemComponents() {
    if (participatingSystemComponents_ == null)
    	participatingSystemComponents_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getParticipatingSystemComponents(), adaptersFactory, eResource);
    return participatingSystemComponents_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.ActorCapabilityRealizationInvolvement> */Object involvedActors_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.ActorCapabilityRealizationInvolvement> */Object getInvolvedActors() {
    if (involvedActors_ == null)
    	involvedActors_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInvolvedActors(), adaptersFactory, eResource);
    return involvedActors_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.SystemComponentCapabilityRealizationInvolvement> */Object involvedSystemComponents_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.SystemComponentCapabilityRealizationInvolvement> */Object getInvolvedSystemComponents() {
    if (involvedSystemComponents_ == null)
    	involvedSystemComponents_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInvolvedSystemComponents(), adaptersFactory, eResource);
    return involvedSystemComponents_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.ctx.Capability> */Object realizedCapabilities_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.ctx.Capability> */Object getRealizedCapabilities() {
    if (realizedCapabilities_ == null)
    	realizedCapabilities_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizedCapabilities(), adaptersFactory, eResource);
    return realizedCapabilities_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.la.CapabilityRealization> */Object realizedCapabilityRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.la.CapabilityRealization> */Object getRealizedCapabilityRealizations() {
    if (realizedCapabilityRealizations_ == null)
    	realizedCapabilityRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizedCapabilityRealizations(), adaptersFactory, eResource);
    return realizedCapabilityRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.la.CapabilityRealization> */Object realizingCapabilityRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.la.CapabilityRealization> */Object getRealizingCapabilityRealizations() {
    if (realizingCapabilityRealizations_ == null)
    	realizingCapabilityRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizingCapabilityRealizations(), adaptersFactory, eResource);
    return realizingCapabilityRealizations_;
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
  
  @Override
  public EClass eClass() {
    return org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.eINSTANCE.getCapabilityRealization();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__NAME:
    		return getName();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__INCOMING_TRACES:
    		return getIncomingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OUTGOING_TRACES:
    		return getOutgoingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__VISIBLE_IN_DOC:
    		return isVisibleInDoc() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__VISIBLE_IN_LM:
    		return isVisibleInLM() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__SUMMARY:
    		return getSummary();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__DESCRIPTION:
    		return getDescription();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__REVIEW:
    		return getReview();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__STATUS:
    		return getStatus();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__FEATURES:
    		return getFeatures();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_TRACES:
    		return getOwnedTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__CONTAINED_GENERIC_TRACES:
    		return getContainedGenericTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__CONTAINED_REQUIREMENTS_TRACES:
    		return getContainedRequirementsTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__NAMING_RULES:
    		return getNamingRules();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_PROPERTY_VALUE_PKGS:
    		return getOwnedPropertyValuePkgs();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__INVOLVED_INVOLVEMENTS:
    		return getInvolvedInvolvements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_FUNCTIONAL_CHAINS:
    		return getOwnedFunctionalChains();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__PRE_CONDITION:
    		return getPreCondition();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__POST_CONDITION:
    		return getPostCondition();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_SCENARIOS:
    		return getOwnedScenarios();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__INCOMING_CAPABILITY_ALLOCATION:
    		return getIncomingCapabilityAllocation();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OUTGOING_CAPABILITY_ALLOCATION:
    		return getOutgoingCapabilityAllocation();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__EXTENDS:
    		return getExtends();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__EXTENDING:
    		return getExtending();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__ABSTRACT_CAPABILITY_EXTENSION_POINTS:
    		return getAbstractCapabilityExtensionPoints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__SUPER_GENERALIZATIONS:
    		return getSuperGeneralizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__SUB_GENERALIZATIONS:
    		return getSubGeneralizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__INCLUDES:
    		return getIncludes();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__INCLUDING:
    		return getIncluding();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__SUPER:
    		return getSuper();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__SUB:
    		return getSub();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__INCLUDED_ABSTRACT_CAPABILITIES:
    		return getIncludedAbstractCapabilities();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__INCLUDING_ABSTRACT_CAPABILITIES:
    		return getIncludingAbstractCapabilities();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__EXTENDED_ABSTRACT_CAPABILITIES:
    		return getExtendedAbstractCapabilities();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__EXTENDING_ABSTRACT_CAPABILITIES:
    		return getExtendingAbstractCapabilities();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_FUNCTIONAL_CHAIN_ABSTRACT_CAPABILITY_INVOLVEMENTS:
    		return getOwnedFunctionalChainAbstractCapabilityInvolvements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENTS:
    		return getOwnedAbstractFunctionAbstractCapabilityInvolvements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__AVAILABLE_IN_STATES:
    		return getAvailableInStates();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_ABSTRACT_CAPABILITY_REALIZATIONS:
    		return getOwnedAbstractCapabilityRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__INVOLVED_ABSTRACT_FUNCTIONS:
    		return getInvolvedAbstractFunctions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__INVOLVED_FUNCTIONAL_CHAINS:
    		return getInvolvedFunctionalChains();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_ACTOR_CAPABILITY_REALIZATIONS:
    		return getOwnedActorCapabilityRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_SYSTEM_COMPONENT_CAPABILITY_REALIZATIONS:
    		return getOwnedSystemComponentCapabilityRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__PARTICIPATING_ACTORS:
    		return getParticipatingActors();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__PARTICIPATING_SYSTEM_COMPONENTS:
    		return getParticipatingSystemComponents();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__INVOLVED_ACTORS:
    		return getInvolvedActors();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__INVOLVED_SYSTEM_COMPONENTS:
    		return getInvolvedSystemComponents();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__REALIZED_CAPABILITIES:
    		return getRealizedCapabilities();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__REALIZED_CAPABILITY_REALIZATIONS:
    		return getRealizedCapabilityRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__REALIZING_CAPABILITY_REALIZATIONS:
    		return getRealizingCapabilityRealizations();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__INCOMING_TRACES:
    		return getIncomingTraces() != null && !getIncomingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OUTGOING_TRACES:
    		return getOutgoingTraces() != null && !getOutgoingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__VISIBLE_IN_DOC:
    		return isVisibleInDoc() != VISIBLE_IN_DOC_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__VISIBLE_IN_LM:
    		return isVisibleInLM() != VISIBLE_IN_LM_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__SUMMARY:
    		return getSummary() != SUMMARY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__REVIEW:
    		return getReview() != REVIEW_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues() != null && !getOwnedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes() != null && !getOwnedEnumerationPropertyTypes().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues() != null && !getAppliedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups() != null && !getOwnedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups() != null && !getAppliedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__STATUS:
    		return getStatus() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__FEATURES:
    		return getFeatures() != null && !getFeatures().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements() != null && !getAppliedRequirements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_TRACES:
    		return getOwnedTraces() != null && !getOwnedTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__CONTAINED_GENERIC_TRACES:
    		return getContainedGenericTraces() != null && !getContainedGenericTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__CONTAINED_REQUIREMENTS_TRACES:
    		return getContainedRequirementsTraces() != null && !getContainedRequirementsTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__NAMING_RULES:
    		return getNamingRules() != null && !getNamingRules().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_PROPERTY_VALUE_PKGS:
    		return getOwnedPropertyValuePkgs() != null && !getOwnedPropertyValuePkgs().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__INVOLVED_INVOLVEMENTS:
    		return getInvolvedInvolvements() != null && !getInvolvedInvolvements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_FUNCTIONAL_CHAINS:
    		return getOwnedFunctionalChains() != null && !getOwnedFunctionalChains().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__PRE_CONDITION:
    		return getPreCondition() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__POST_CONDITION:
    		return getPostCondition() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_SCENARIOS:
    		return getOwnedScenarios() != null && !getOwnedScenarios().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__INCOMING_CAPABILITY_ALLOCATION:
    		return getIncomingCapabilityAllocation() != null && !getIncomingCapabilityAllocation().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OUTGOING_CAPABILITY_ALLOCATION:
    		return getOutgoingCapabilityAllocation() != null && !getOutgoingCapabilityAllocation().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__EXTENDS:
    		return getExtends() != null && !getExtends().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__EXTENDING:
    		return getExtending() != null && !getExtending().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__ABSTRACT_CAPABILITY_EXTENSION_POINTS:
    		return getAbstractCapabilityExtensionPoints() != null && !getAbstractCapabilityExtensionPoints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__SUPER_GENERALIZATIONS:
    		return getSuperGeneralizations() != null && !getSuperGeneralizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__SUB_GENERALIZATIONS:
    		return getSubGeneralizations() != null && !getSubGeneralizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__INCLUDES:
    		return getIncludes() != null && !getIncludes().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__INCLUDING:
    		return getIncluding() != null && !getIncluding().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__SUPER:
    		return getSuper() != null && !getSuper().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__SUB:
    		return getSub() != null && !getSub().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__INCLUDED_ABSTRACT_CAPABILITIES:
    		return getIncludedAbstractCapabilities() != null && !getIncludedAbstractCapabilities().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__INCLUDING_ABSTRACT_CAPABILITIES:
    		return getIncludingAbstractCapabilities() != null && !getIncludingAbstractCapabilities().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__EXTENDED_ABSTRACT_CAPABILITIES:
    		return getExtendedAbstractCapabilities() != null && !getExtendedAbstractCapabilities().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__EXTENDING_ABSTRACT_CAPABILITIES:
    		return getExtendingAbstractCapabilities() != null && !getExtendingAbstractCapabilities().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_FUNCTIONAL_CHAIN_ABSTRACT_CAPABILITY_INVOLVEMENTS:
    		return getOwnedFunctionalChainAbstractCapabilityInvolvements() != null && !getOwnedFunctionalChainAbstractCapabilityInvolvements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENTS:
    		return getOwnedAbstractFunctionAbstractCapabilityInvolvements() != null && !getOwnedAbstractFunctionAbstractCapabilityInvolvements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__AVAILABLE_IN_STATES:
    		return getAvailableInStates() != null && !getAvailableInStates().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_ABSTRACT_CAPABILITY_REALIZATIONS:
    		return getOwnedAbstractCapabilityRealizations() != null && !getOwnedAbstractCapabilityRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__INVOLVED_ABSTRACT_FUNCTIONS:
    		return getInvolvedAbstractFunctions() != null && !getInvolvedAbstractFunctions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__INVOLVED_FUNCTIONAL_CHAINS:
    		return getInvolvedFunctionalChains() != null && !getInvolvedFunctionalChains().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_ACTOR_CAPABILITY_REALIZATIONS:
    		return getOwnedActorCapabilityRealizations() != null && !getOwnedActorCapabilityRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_SYSTEM_COMPONENT_CAPABILITY_REALIZATIONS:
    		return getOwnedSystemComponentCapabilityRealizations() != null && !getOwnedSystemComponentCapabilityRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__PARTICIPATING_ACTORS:
    		return getParticipatingActors() != null && !getParticipatingActors().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__PARTICIPATING_SYSTEM_COMPONENTS:
    		return getParticipatingSystemComponents() != null && !getParticipatingSystemComponents().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__INVOLVED_ACTORS:
    		return getInvolvedActors() != null && !getInvolvedActors().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__INVOLVED_SYSTEM_COMPONENTS:
    		return getInvolvedSystemComponents() != null && !getInvolvedSystemComponents().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__REALIZED_CAPABILITIES:
    		return getRealizedCapabilities() != null && !getRealizedCapabilities().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__REALIZED_CAPABILITY_REALIZATIONS:
    		return getRealizedCapabilityRealizations() != null && !getRealizedCapabilityRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__REALIZING_CAPABILITY_REALIZATIONS:
    		return getRealizingCapabilityRealizations() != null && !getRealizingCapabilityRealizations().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__VISIBLE_IN_DOC:
    		setVisibleInDoc(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__VISIBLE_IN_LM:
    		setVisibleInLM(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__SUMMARY:
    		setSummary(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__REVIEW:
    		setReview(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_PROPERTY_VALUES:
    		getOwnedPropertyValues().clear();
    		getOwnedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_ENUMERATION_PROPERTY_TYPES:
    		getOwnedEnumerationPropertyTypes().clear();
    		getOwnedEnumerationPropertyTypes().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__APPLIED_PROPERTY_VALUES:
    		getAppliedPropertyValues().clear();
    		getAppliedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_PROPERTY_VALUE_GROUPS:
    		getOwnedPropertyValueGroups().clear();
    		getOwnedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__APPLIED_PROPERTY_VALUE_GROUPS:
    		getAppliedPropertyValueGroups().clear();
    		getAppliedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__STATUS:
    		setStatus(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__FEATURES:
    		getFeatures().clear();
    		getFeatures().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_TRACES:
    		getOwnedTraces().clear();
    		getOwnedTraces().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__NAMING_RULES:
    		getNamingRules().clear();
    		getNamingRules().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_PROPERTY_VALUE_PKGS:
    		getOwnedPropertyValuePkgs().clear();
    		getOwnedPropertyValuePkgs().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_FUNCTIONAL_CHAINS:
    		getOwnedFunctionalChains().clear();
    		getOwnedFunctionalChains().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__PRE_CONDITION:
    		setPreCondition(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Constraint)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__POST_CONDITION:
    		setPostCondition(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Constraint)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_SCENARIOS:
    		getOwnedScenarios().clear();
    		getOwnedScenarios().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__EXTENDS:
    		getExtends().clear();
    		getExtends().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__EXTENDING:
    		getExtending().clear();
    		getExtending().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__ABSTRACT_CAPABILITY_EXTENSION_POINTS:
    		getAbstractCapabilityExtensionPoints().clear();
    		getAbstractCapabilityExtensionPoints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__SUPER_GENERALIZATIONS:
    		getSuperGeneralizations().clear();
    		getSuperGeneralizations().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__SUB_GENERALIZATIONS:
    		getSubGeneralizations().clear();
    		getSubGeneralizations().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__INCLUDES:
    		getIncludes().clear();
    		getIncludes().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__INCLUDING:
    		getIncluding().clear();
    		getIncluding().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_FUNCTIONAL_CHAIN_ABSTRACT_CAPABILITY_INVOLVEMENTS:
    		getOwnedFunctionalChainAbstractCapabilityInvolvements().clear();
    		getOwnedFunctionalChainAbstractCapabilityInvolvements().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENTS:
    		getOwnedAbstractFunctionAbstractCapabilityInvolvements().clear();
    		getOwnedAbstractFunctionAbstractCapabilityInvolvements().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__AVAILABLE_IN_STATES:
    		getAvailableInStates().clear();
    		getAvailableInStates().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_ABSTRACT_CAPABILITY_REALIZATIONS:
    		getOwnedAbstractCapabilityRealizations().clear();
    		getOwnedAbstractCapabilityRealizations().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_ACTOR_CAPABILITY_REALIZATIONS:
    		getOwnedActorCapabilityRealizations().clear();
    		getOwnedActorCapabilityRealizations().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.CAPABILITY_REALIZATION__OWNED_SYSTEM_COMPONENT_CAPABILITY_REALIZATIONS:
    		getOwnedSystemComponentCapabilityRealizations().clear();
    		getOwnedSystemComponentCapabilityRealizations().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
