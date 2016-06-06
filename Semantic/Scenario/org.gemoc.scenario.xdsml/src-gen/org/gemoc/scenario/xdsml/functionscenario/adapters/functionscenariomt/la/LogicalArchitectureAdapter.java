package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.la.LogicalArchitecture;

@SuppressWarnings("all")
public class LogicalArchitectureAdapter extends EObjectAdapter<LogicalArchitecture> implements org.gemoc.scenario.xdsml.functionscenariomt.la.LogicalArchitecture {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public LogicalArchitectureAdapter() {
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
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionPkg getOwnedFunctionPkg() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedFunctionPkg(), eResource);
  }
  
  @Override
  public void setOwnedFunctionPkg(final org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionPkg o) {
    if (o != null)
    	adaptee.setOwnedFunctionPkg(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionPkgAdapter) o).getAdaptee());
    else adaptee.setOwnedFunctionPkg(null);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchange> */Object ownedComponentExchanges_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchange> */Object getOwnedComponentExchanges() {
    if (ownedComponentExchanges_ == null)
    	ownedComponentExchanges_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedComponentExchanges(), adaptersFactory, eResource);
    return ownedComponentExchanges_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeCategory> */Object ownedComponentExchangeCategories_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeCategory> */Object getOwnedComponentExchangeCategories() {
    if (ownedComponentExchangeCategories_ == null)
    	ownedComponentExchangeCategories_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedComponentExchangeCategories(), adaptersFactory, eResource);
    return ownedComponentExchangeCategories_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ExchangeLink> */Object ownedFunctionalLinks_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ExchangeLink> */Object getOwnedFunctionalLinks() {
    if (ownedFunctionalLinks_ == null)
    	ownedFunctionalLinks_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedFunctionalLinks(), adaptersFactory, eResource);
    return ownedFunctionalLinks_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentFunctionalAllocation> */Object ownedFunctionalAllocations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentFunctionalAllocation> */Object getOwnedFunctionalAllocations() {
    if (ownedFunctionalAllocations_ == null)
    	ownedFunctionalAllocations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedFunctionalAllocations(), adaptersFactory, eResource);
    return ownedFunctionalAllocations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeRealization> */Object ownedComponentExchangeRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeRealization> */Object getOwnedComponentExchangeRealizations() {
    if (ownedComponentExchangeRealizations_ == null)
    	ownedComponentExchangeRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedComponentExchangeRealizations(), adaptersFactory, eResource);
    return ownedComponentExchangeRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.requirement.RequirementsPkg> */Object ownedRequirementPkgs_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.requirement.RequirementsPkg> */Object getOwnedRequirementPkgs() {
    if (ownedRequirementPkgs_ == null)
    	ownedRequirementPkgs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedRequirementPkgs(), adaptersFactory, eResource);
    return ownedRequirementPkgs_;
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.AbstractCapabilityPkg getOwnedAbstractCapabilityPkg() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedAbstractCapabilityPkg(), eResource);
  }
  
  @Override
  public void setOwnedAbstractCapabilityPkg(final org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.AbstractCapabilityPkg o) {
    if (o != null)
    	adaptee.setOwnedAbstractCapabilityPkg(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.AbstractCapabilityPkgAdapter) o).getAdaptee());
    else adaptee.setOwnedAbstractCapabilityPkg(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfacePkg getOwnedInterfacePkg() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedInterfacePkg(), eResource);
  }
  
  @Override
  public void setOwnedInterfacePkg(final org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfacePkg o) {
    if (o != null)
    	adaptee.setOwnedInterfacePkg(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.InterfacePkgAdapter) o).getAdaptee());
    else adaptee.setOwnedInterfacePkg(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.DataPkg getOwnedDataPkg() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedDataPkg(), eResource);
  }
  
  @Override
  public void setOwnedDataPkg(final org.gemoc.scenario.xdsml.functionscenariomt.information.DataPkg o) {
    if (o != null)
    	adaptee.setOwnedDataPkg(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.DataPkgAdapter) o).getAdaptee());
    else adaptee.setOwnedDataPkg(null);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.ArchitectureAllocation> */Object provisionedArchitectureAllocations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.ArchitectureAllocation> */Object getProvisionedArchitectureAllocations() {
    if (provisionedArchitectureAllocations_ == null)
    	provisionedArchitectureAllocations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getProvisionedArchitectureAllocations(), adaptersFactory, eResource);
    return provisionedArchitectureAllocations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.ArchitectureAllocation> */Object provisioningArchitectureAllocations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.ArchitectureAllocation> */Object getProvisioningArchitectureAllocations() {
    if (provisioningArchitectureAllocations_ == null)
    	provisioningArchitectureAllocations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getProvisioningArchitectureAllocations(), adaptersFactory, eResource);
    return provisioningArchitectureAllocations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.BlockArchitecture> */Object allocatedArchitectures_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.BlockArchitecture> */Object getAllocatedArchitectures() {
    if (allocatedArchitectures_ == null)
    	allocatedArchitectures_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAllocatedArchitectures(), adaptersFactory, eResource);
    return allocatedArchitectures_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.BlockArchitecture> */Object allocatingArchitectures_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.BlockArchitecture> */Object getAllocatingArchitectures() {
    if (allocatingArchitectures_ == null)
    	allocatingArchitectures_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAllocatingArchitectures(), adaptersFactory, eResource);
    return allocatingArchitectures_;
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.la.LogicalContext getOwnedLogicalContext() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedLogicalContext(), eResource);
  }
  
  @Override
  public void setOwnedLogicalContext(final org.gemoc.scenario.xdsml.functionscenariomt.la.LogicalContext o) {
    if (o != null)
    	adaptee.setOwnedLogicalContext(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalContextAdapter) o).getAdaptee());
    else adaptee.setOwnedLogicalContext(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.la.LogicalComponent getOwnedLogicalComponent() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedLogicalComponent(), eResource);
  }
  
  @Override
  public void setOwnedLogicalComponent(final org.gemoc.scenario.xdsml.functionscenariomt.la.LogicalComponent o) {
    if (o != null)
    	adaptee.setOwnedLogicalComponent(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalComponentAdapter) o).getAdaptee());
    else adaptee.setOwnedLogicalComponent(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.la.LogicalComponentPkg getOwnedLogicalComponentPkg() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedLogicalComponentPkg(), eResource);
  }
  
  @Override
  public void setOwnedLogicalComponentPkg(final org.gemoc.scenario.xdsml.functionscenariomt.la.LogicalComponentPkg o) {
    if (o != null)
    	adaptee.setOwnedLogicalComponentPkg(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalComponentPkgAdapter) o).getAdaptee());
    else adaptee.setOwnedLogicalComponentPkg(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.la.LogicalActorPkg getOwnedLogicalActorPkg() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedLogicalActorPkg(), eResource);
  }
  
  @Override
  public void setOwnedLogicalActorPkg(final org.gemoc.scenario.xdsml.functionscenariomt.la.LogicalActorPkg o) {
    if (o != null)
    	adaptee.setOwnedLogicalActorPkg(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalActorPkgAdapter) o).getAdaptee());
    else adaptee.setOwnedLogicalActorPkg(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.la.CapabilityRealizationPkg getContainedCapabilityRealizationPkg() {
    return () adaptersFactory.createAdapter(adaptee.getContainedCapabilityRealizationPkg(), eResource);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.la.LogicalFunctionPkg getContainedLogicalFunctionPkg() {
    return () adaptersFactory.createAdapter(adaptee.getContainedLogicalFunctionPkg(), eResource);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.la.SystemAnalysisRealization> */Object ownedSystemAnalysisRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.la.SystemAnalysisRealization> */Object getOwnedSystemAnalysisRealizations() {
    if (ownedSystemAnalysisRealizations_ == null)
    	ownedSystemAnalysisRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedSystemAnalysisRealizations(), adaptersFactory, eResource);
    return ownedSystemAnalysisRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.la.SystemAnalysisRealization> */Object allocatedSystemAnalysisRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.la.SystemAnalysisRealization> */Object getAllocatedSystemAnalysisRealizations() {
    if (allocatedSystemAnalysisRealizations_ == null)
    	allocatedSystemAnalysisRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAllocatedSystemAnalysisRealizations(), adaptersFactory, eResource);
    return allocatedSystemAnalysisRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.ctx.SystemAnalysis> */Object allocatedSystemAnalyses_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.ctx.SystemAnalysis> */Object getAllocatedSystemAnalyses() {
    if (allocatedSystemAnalyses_ == null)
    	allocatedSystemAnalyses_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAllocatedSystemAnalyses(), adaptersFactory, eResource);
    return allocatedSystemAnalyses_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalArchitecture> */Object allocatingPhysicalArchitectures_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalArchitecture> */Object getAllocatingPhysicalArchitectures() {
    if (allocatingPhysicalArchitectures_ == null)
    	allocatingPhysicalArchitectures_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAllocatingPhysicalArchitectures(), adaptersFactory, eResource);
    return allocatingPhysicalArchitectures_;
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
    return org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.eINSTANCE.getLogicalArchitecture();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__NAME:
    		return getName();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__INCOMING_TRACES:
    		return getIncomingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OUTGOING_TRACES:
    		return getOutgoingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__VISIBLE_IN_DOC:
    		return isVisibleInDoc() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__VISIBLE_IN_LM:
    		return isVisibleInLM() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__SUMMARY:
    		return getSummary();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__DESCRIPTION:
    		return getDescription();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__REVIEW:
    		return getReview();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__STATUS:
    		return getStatus();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__FEATURES:
    		return getFeatures();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_TRACES:
    		return getOwnedTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_GENERIC_TRACES:
    		return getContainedGenericTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_REQUIREMENTS_TRACES:
    		return getContainedRequirementsTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__NAMING_RULES:
    		return getNamingRules();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_PROPERTY_VALUE_PKGS:
    		return getOwnedPropertyValuePkgs();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_FUNCTION_PKG:
    		return getOwnedFunctionPkg();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGES:
    		return getOwnedComponentExchanges();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
    		return getOwnedComponentExchangeCategories();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_FUNCTIONAL_LINKS:
    		return getOwnedFunctionalLinks();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_FUNCTIONAL_ALLOCATIONS:
    		return getOwnedFunctionalAllocations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
    		return getOwnedComponentExchangeRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_REQUIREMENT_PKGS:
    		return getOwnedRequirementPkgs();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_ABSTRACT_CAPABILITY_PKG:
    		return getOwnedAbstractCapabilityPkg();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_INTERFACE_PKG:
    		return getOwnedInterfacePkg();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_DATA_PKG:
    		return getOwnedDataPkg();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__PROVISIONED_ARCHITECTURE_ALLOCATIONS:
    		return getProvisionedArchitectureAllocations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__PROVISIONING_ARCHITECTURE_ALLOCATIONS:
    		return getProvisioningArchitectureAllocations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__ALLOCATED_ARCHITECTURES:
    		return getAllocatedArchitectures();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__ALLOCATING_ARCHITECTURES:
    		return getAllocatingArchitectures();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_CONTEXT:
    		return getOwnedLogicalContext();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT:
    		return getOwnedLogicalComponent();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG:
    		return getOwnedLogicalComponentPkg();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_ACTOR_PKG:
    		return getOwnedLogicalActorPkg();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG:
    		return getContainedCapabilityRealizationPkg();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_LOGICAL_FUNCTION_PKG:
    		return getContainedLogicalFunctionPkg();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_SYSTEM_ANALYSIS_REALIZATIONS:
    		return getOwnedSystemAnalysisRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__ALLOCATED_SYSTEM_ANALYSIS_REALIZATIONS:
    		return getAllocatedSystemAnalysisRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__ALLOCATED_SYSTEM_ANALYSES:
    		return getAllocatedSystemAnalyses();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__ALLOCATING_PHYSICAL_ARCHITECTURES:
    		return getAllocatingPhysicalArchitectures();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__INCOMING_TRACES:
    		return getIncomingTraces() != null && !getIncomingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OUTGOING_TRACES:
    		return getOutgoingTraces() != null && !getOutgoingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__VISIBLE_IN_DOC:
    		return isVisibleInDoc() != VISIBLE_IN_DOC_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__VISIBLE_IN_LM:
    		return isVisibleInLM() != VISIBLE_IN_LM_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__SUMMARY:
    		return getSummary() != SUMMARY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__REVIEW:
    		return getReview() != REVIEW_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues() != null && !getOwnedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes() != null && !getOwnedEnumerationPropertyTypes().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues() != null && !getAppliedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups() != null && !getOwnedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups() != null && !getAppliedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__STATUS:
    		return getStatus() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__FEATURES:
    		return getFeatures() != null && !getFeatures().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements() != null && !getAppliedRequirements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_TRACES:
    		return getOwnedTraces() != null && !getOwnedTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_GENERIC_TRACES:
    		return getContainedGenericTraces() != null && !getContainedGenericTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_REQUIREMENTS_TRACES:
    		return getContainedRequirementsTraces() != null && !getContainedRequirementsTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__NAMING_RULES:
    		return getNamingRules() != null && !getNamingRules().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_PROPERTY_VALUE_PKGS:
    		return getOwnedPropertyValuePkgs() != null && !getOwnedPropertyValuePkgs().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_FUNCTION_PKG:
    		return getOwnedFunctionPkg() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGES:
    		return getOwnedComponentExchanges() != null && !getOwnedComponentExchanges().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
    		return getOwnedComponentExchangeCategories() != null && !getOwnedComponentExchangeCategories().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_FUNCTIONAL_LINKS:
    		return getOwnedFunctionalLinks() != null && !getOwnedFunctionalLinks().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_FUNCTIONAL_ALLOCATIONS:
    		return getOwnedFunctionalAllocations() != null && !getOwnedFunctionalAllocations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
    		return getOwnedComponentExchangeRealizations() != null && !getOwnedComponentExchangeRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_REQUIREMENT_PKGS:
    		return getOwnedRequirementPkgs() != null && !getOwnedRequirementPkgs().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_ABSTRACT_CAPABILITY_PKG:
    		return getOwnedAbstractCapabilityPkg() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_INTERFACE_PKG:
    		return getOwnedInterfacePkg() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_DATA_PKG:
    		return getOwnedDataPkg() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__PROVISIONED_ARCHITECTURE_ALLOCATIONS:
    		return getProvisionedArchitectureAllocations() != null && !getProvisionedArchitectureAllocations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__PROVISIONING_ARCHITECTURE_ALLOCATIONS:
    		return getProvisioningArchitectureAllocations() != null && !getProvisioningArchitectureAllocations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__ALLOCATED_ARCHITECTURES:
    		return getAllocatedArchitectures() != null && !getAllocatedArchitectures().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__ALLOCATING_ARCHITECTURES:
    		return getAllocatingArchitectures() != null && !getAllocatingArchitectures().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_CONTEXT:
    		return getOwnedLogicalContext() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT:
    		return getOwnedLogicalComponent() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG:
    		return getOwnedLogicalComponentPkg() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_ACTOR_PKG:
    		return getOwnedLogicalActorPkg() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG:
    		return getContainedCapabilityRealizationPkg() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_LOGICAL_FUNCTION_PKG:
    		return getContainedLogicalFunctionPkg() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_SYSTEM_ANALYSIS_REALIZATIONS:
    		return getOwnedSystemAnalysisRealizations() != null && !getOwnedSystemAnalysisRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__ALLOCATED_SYSTEM_ANALYSIS_REALIZATIONS:
    		return getAllocatedSystemAnalysisRealizations() != null && !getAllocatedSystemAnalysisRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__ALLOCATED_SYSTEM_ANALYSES:
    		return getAllocatedSystemAnalyses() != null && !getAllocatedSystemAnalyses().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__ALLOCATING_PHYSICAL_ARCHITECTURES:
    		return getAllocatingPhysicalArchitectures() != null && !getAllocatingPhysicalArchitectures().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__VISIBLE_IN_DOC:
    		setVisibleInDoc(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__VISIBLE_IN_LM:
    		setVisibleInLM(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__SUMMARY:
    		setSummary(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__REVIEW:
    		setReview(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_PROPERTY_VALUES:
    		getOwnedPropertyValues().clear();
    		getOwnedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_ENUMERATION_PROPERTY_TYPES:
    		getOwnedEnumerationPropertyTypes().clear();
    		getOwnedEnumerationPropertyTypes().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__APPLIED_PROPERTY_VALUES:
    		getAppliedPropertyValues().clear();
    		getAppliedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_PROPERTY_VALUE_GROUPS:
    		getOwnedPropertyValueGroups().clear();
    		getOwnedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__APPLIED_PROPERTY_VALUE_GROUPS:
    		getAppliedPropertyValueGroups().clear();
    		getAppliedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__STATUS:
    		setStatus(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__FEATURES:
    		getFeatures().clear();
    		getFeatures().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_TRACES:
    		getOwnedTraces().clear();
    		getOwnedTraces().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__NAMING_RULES:
    		getNamingRules().clear();
    		getNamingRules().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_PROPERTY_VALUE_PKGS:
    		getOwnedPropertyValuePkgs().clear();
    		getOwnedPropertyValuePkgs().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_FUNCTION_PKG:
    		setOwnedFunctionPkg(
    		(org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionPkg)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGES:
    		getOwnedComponentExchanges().clear();
    		getOwnedComponentExchanges().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
    		getOwnedComponentExchangeCategories().clear();
    		getOwnedComponentExchangeCategories().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_FUNCTIONAL_LINKS:
    		getOwnedFunctionalLinks().clear();
    		getOwnedFunctionalLinks().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_FUNCTIONAL_ALLOCATIONS:
    		getOwnedFunctionalAllocations().clear();
    		getOwnedFunctionalAllocations().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
    		getOwnedComponentExchangeRealizations().clear();
    		getOwnedComponentExchangeRealizations().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_REQUIREMENT_PKGS:
    		getOwnedRequirementPkgs().clear();
    		getOwnedRequirementPkgs().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_ABSTRACT_CAPABILITY_PKG:
    		setOwnedAbstractCapabilityPkg(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.AbstractCapabilityPkg)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_INTERFACE_PKG:
    		setOwnedInterfacePkg(
    		(org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfacePkg)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_DATA_PKG:
    		setOwnedDataPkg(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.DataPkg)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_CONTEXT:
    		setOwnedLogicalContext(
    		(org.gemoc.scenario.xdsml.functionscenariomt.la.LogicalContext)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT:
    		setOwnedLogicalComponent(
    		(org.gemoc.scenario.xdsml.functionscenariomt.la.LogicalComponent)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG:
    		setOwnedLogicalComponentPkg(
    		(org.gemoc.scenario.xdsml.functionscenariomt.la.LogicalComponentPkg)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_ACTOR_PKG:
    		setOwnedLogicalActorPkg(
    		(org.gemoc.scenario.xdsml.functionscenariomt.la.LogicalActorPkg)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.la.LaPackage.LOGICAL_ARCHITECTURE__OWNED_SYSTEM_ANALYSIS_REALIZATIONS:
    		getOwnedSystemAnalysisRealizations().clear();
    		getOwnedSystemAnalysisRealizations().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
