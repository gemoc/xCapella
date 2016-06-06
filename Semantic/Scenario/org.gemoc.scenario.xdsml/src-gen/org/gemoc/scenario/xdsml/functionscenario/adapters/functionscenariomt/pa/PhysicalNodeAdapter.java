package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.pa.PhysicalNode;

@SuppressWarnings("all")
public class PhysicalNodeAdapter extends EObjectAdapter<PhysicalNode> implements org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalNode {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public PhysicalNodeAdapter() {
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
  public boolean isAbstract() {
    return adaptee.isAbstract();
  }
  
  @Override
  public void setAbstract(final boolean o) {
    adaptee.setAbstract(o);
  }
  
  @Override
  public boolean isDataComponent() {
    return adaptee.isDataComponent();
  }
  
  @Override
  public void setDataComponent(final boolean o) {
    adaptee.setDataComponent(o);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalComponentKind getKind() {
    return org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalComponentKind.get(adaptee.getKind().getValue());
  }
  
  @Override
  public void setKind(final org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalComponentKind o) {
    adaptee.setKind(org.polarsys.capella.core.data.pa.PhysicalComponentKind.get(o.getValue()));
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalComponentNature getNature() {
    return org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalComponentNature.get(adaptee.getNature().getValue());
  }
  
  @Override
  public void setNature(final org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalComponentNature o) {
    adaptee.setNature(org.polarsys.capella.core.data.pa.PhysicalComponentNature.get(o.getValue()));
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
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractTypedElement> */Object abstractTypedElements_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractTypedElement> */Object getAbstractTypedElements() {
    if (abstractTypedElements_ == null)
    	abstractTypedElements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAbstractTypedElements(), adaptersFactory, eResource);
    return abstractTypedElements_;
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
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.TypedElement> */Object typedElements_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.TypedElement> */Object getTypedElements() {
    if (typedElements_ == null)
    	typedElements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getTypedElements(), adaptersFactory, eResource);
    return typedElements_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentFunctionalAllocation> */Object ownedFunctionalAllocation_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentFunctionalAllocation> */Object getOwnedFunctionalAllocation() {
    if (ownedFunctionalAllocation_ == null)
    	ownedFunctionalAllocation_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedFunctionalAllocation(), adaptersFactory, eResource);
    return ownedFunctionalAllocation_;
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
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentFunctionalAllocation> */Object functionalAllocations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentFunctionalAllocation> */Object getFunctionalAllocations() {
    if (functionalAllocations_ == null)
    	functionalAllocations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getFunctionalAllocations(), adaptersFactory, eResource);
    return functionalAllocations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.AbstractFunction> */Object allocatedFunctions_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.AbstractFunction> */Object getAllocatedFunctions() {
    if (allocatedFunctions_ == null)
    	allocatedFunctions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAllocatedFunctions(), adaptersFactory, eResource);
    return allocatedFunctions_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ExchangeLink> */Object inExchangeLinks_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ExchangeLink> */Object getInExchangeLinks() {
    if (inExchangeLinks_ == null)
    	inExchangeLinks_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInExchangeLinks(), adaptersFactory, eResource);
    return inExchangeLinks_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ExchangeLink> */Object outExchangeLinks_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ExchangeLink> */Object getOutExchangeLinks() {
    if (outExchangeLinks_ == null)
    	outExchangeLinks_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutExchangeLinks(), adaptersFactory, eResource);
    return outExchangeLinks_;
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
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.StateMachine> */Object ownedStateMachines_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.StateMachine> */Object getOwnedStateMachines() {
    if (ownedStateMachines_ == null)
    	ownedStateMachines_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedStateMachines(), adaptersFactory, eResource);
    return ownedStateMachines_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Generalization> */Object ownedGeneralizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Generalization> */Object getOwnedGeneralizations() {
    if (ownedGeneralizations_ == null)
    	ownedGeneralizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedGeneralizations(), adaptersFactory, eResource);
    return ownedGeneralizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Generalization> */Object superGeneralizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Generalization> */Object getSuperGeneralizations() {
    if (superGeneralizations_ == null)
    	superGeneralizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSuperGeneralizations(), adaptersFactory, eResource);
    return superGeneralizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Generalization> */Object subGeneralizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Generalization> */Object getSubGeneralizations() {
    if (subGeneralizations_ == null)
    	subGeneralizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSubGeneralizations(), adaptersFactory, eResource);
    return subGeneralizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.GeneralizableElement> */Object super_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.GeneralizableElement> */Object getSuper() {
    if (super_ == null)
    	super_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSuper(), adaptersFactory, eResource);
    return super_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.GeneralizableElement> */Object sub_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.GeneralizableElement> */Object getSub() {
    if (sub_ == null)
    	sub_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSub(), adaptersFactory, eResource);
    return sub_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Feature> */Object ownedFeatures_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Feature> */Object getOwnedFeatures() {
    if (ownedFeatures_ == null)
    	ownedFeatures_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedFeatures(), adaptersFactory, eResource);
    return ownedFeatures_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.Property> */Object containedProperties_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.Property> */Object getContainedProperties() {
    if (containedProperties_ == null)
    	containedProperties_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getContainedProperties(), adaptersFactory, eResource);
    return containedProperties_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.Partition> */Object ownedPartitions_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.Partition> */Object getOwnedPartitions() {
    if (ownedPartitions_ == null)
    	ownedPartitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedPartitions(), adaptersFactory, eResource);
    return ownedPartitions_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.Partition> */Object representingPartitions_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.Partition> */Object getRepresentingPartitions() {
    if (representingPartitions_ == null)
    	representingPartitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRepresentingPartitions(), adaptersFactory, eResource);
    return representingPartitions_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfaceAllocation> */Object ownedInterfaceAllocations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfaceAllocation> */Object getOwnedInterfaceAllocations() {
    if (ownedInterfaceAllocations_ == null)
    	ownedInterfaceAllocations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedInterfaceAllocations(), adaptersFactory, eResource);
    return ownedInterfaceAllocations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfaceAllocation> */Object provisionedInterfaceAllocations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfaceAllocation> */Object getProvisionedInterfaceAllocations() {
    if (provisionedInterfaceAllocations_ == null)
    	provisionedInterfaceAllocations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getProvisionedInterfaceAllocations(), adaptersFactory, eResource);
    return provisionedInterfaceAllocations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object allocatedInterfaces_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object getAllocatedInterfaces() {
    if (allocatedInterfaces_ == null)
    	allocatedInterfaces_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAllocatedInterfaces(), adaptersFactory, eResource);
    return allocatedInterfaces_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object ownedCommunicationLinks_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object getOwnedCommunicationLinks() {
    if (ownedCommunicationLinks_ == null)
    	ownedCommunicationLinks_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedCommunicationLinks(), adaptersFactory, eResource);
    return ownedCommunicationLinks_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object produce_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object getProduce() {
    if (produce_ == null)
    	produce_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getProduce(), adaptersFactory, eResource);
    return produce_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object consume_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object getConsume() {
    if (consume_ == null)
    	consume_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getConsume(), adaptersFactory, eResource);
    return consume_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object send_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object getSend() {
    if (send_ == null)
    	send_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSend(), adaptersFactory, eResource);
    return send_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object receive_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object getReceive() {
    if (receive_ == null)
    	receive_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getReceive(), adaptersFactory, eResource);
    return receive_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object call_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object getCall() {
    if (call_ == null)
    	call_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getCall(), adaptersFactory, eResource);
    return call_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object execute_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object getExecute() {
    if (execute_ == null)
    	execute_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getExecute(), adaptersFactory, eResource);
    return execute_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object write_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object getWrite() {
    if (write_ == null)
    	write_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getWrite(), adaptersFactory, eResource);
    return write_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object access_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object getAccess() {
    if (access_ == null)
    	access_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAccess(), adaptersFactory, eResource);
    return access_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object acquire_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object getAcquire() {
    if (acquire_ == null)
    	acquire_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAcquire(), adaptersFactory, eResource);
    return acquire_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object transmit_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object getTransmit() {
    if (transmit_ == null)
    	transmit_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getTransmit(), adaptersFactory, eResource);
    return transmit_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfaceUse> */Object ownedInterfaceUses_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfaceUse> */Object getOwnedInterfaceUses() {
    if (ownedInterfaceUses_ == null)
    	ownedInterfaceUses_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedInterfaceUses(), adaptersFactory, eResource);
    return ownedInterfaceUses_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfaceUse> */Object usedInterfaceLinks_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfaceUse> */Object getUsedInterfaceLinks() {
    if (usedInterfaceLinks_ == null)
    	usedInterfaceLinks_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getUsedInterfaceLinks(), adaptersFactory, eResource);
    return usedInterfaceLinks_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object usedInterfaces_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object getUsedInterfaces() {
    if (usedInterfaces_ == null)
    	usedInterfaces_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getUsedInterfaces(), adaptersFactory, eResource);
    return usedInterfaces_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfaceImplementation> */Object ownedInterfaceImplementations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfaceImplementation> */Object getOwnedInterfaceImplementations() {
    if (ownedInterfaceImplementations_ == null)
    	ownedInterfaceImplementations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedInterfaceImplementations(), adaptersFactory, eResource);
    return ownedInterfaceImplementations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfaceImplementation> */Object implementedInterfaceLinks_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfaceImplementation> */Object getImplementedInterfaceLinks() {
    if (implementedInterfaceLinks_ == null)
    	implementedInterfaceLinks_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getImplementedInterfaceLinks(), adaptersFactory, eResource);
    return implementedInterfaceLinks_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object implementedInterfaces_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object getImplementedInterfaces() {
    if (implementedInterfaces_ == null)
    	implementedInterfaces_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getImplementedInterfaces(), adaptersFactory, eResource);
    return implementedInterfaces_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.ComponentAllocation> */Object provisionedComponentAllocations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.ComponentAllocation> */Object getProvisionedComponentAllocations() {
    if (provisionedComponentAllocations_ == null)
    	provisionedComponentAllocations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getProvisionedComponentAllocations(), adaptersFactory, eResource);
    return provisionedComponentAllocations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.ComponentAllocation> */Object provisioningComponentAllocations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.ComponentAllocation> */Object getProvisioningComponentAllocations() {
    if (provisioningComponentAllocations_ == null)
    	provisioningComponentAllocations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getProvisioningComponentAllocations(), adaptersFactory, eResource);
    return provisioningComponentAllocations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Component> */Object allocatedComponents_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Component> */Object getAllocatedComponents() {
    if (allocatedComponents_ == null)
    	allocatedComponents_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAllocatedComponents(), adaptersFactory, eResource);
    return allocatedComponents_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Component> */Object allocatingComponents_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Component> */Object getAllocatingComponents() {
    if (allocatingComponents_ == null)
    	allocatingComponents_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAllocatingComponents(), adaptersFactory, eResource);
    return allocatingComponents_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object providedInterfaces_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object getProvidedInterfaces() {
    if (providedInterfaces_ == null)
    	providedInterfaces_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getProvidedInterfaces(), adaptersFactory, eResource);
    return providedInterfaces_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object requiredInterfaces_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object getRequiredInterfaces() {
    if (requiredInterfaces_ == null)
    	requiredInterfaces_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRequiredInterfaces(), adaptersFactory, eResource);
    return requiredInterfaces_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentPort> */Object containedComponentPorts_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentPort> */Object getContainedComponentPorts() {
    if (containedComponentPorts_ == null)
    	containedComponentPorts_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getContainedComponentPorts(), adaptersFactory, eResource);
    return containedComponentPorts_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Part> */Object containedParts_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Part> */Object getContainedParts() {
    if (containedParts_ == null)
    	containedParts_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getContainedParts(), adaptersFactory, eResource);
    return containedParts_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.PhysicalPort> */Object containedPhysicalPorts_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.PhysicalPort> */Object getContainedPhysicalPorts() {
    if (containedPhysicalPorts_ == null)
    	containedPhysicalPorts_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getContainedPhysicalPorts(), adaptersFactory, eResource);
    return containedPhysicalPorts_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.PhysicalPath> */Object ownedPhysicalPath_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.PhysicalPath> */Object getOwnedPhysicalPath() {
    if (ownedPhysicalPath_ == null)
    	ownedPhysicalPath_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedPhysicalPath(), adaptersFactory, eResource);
    return ownedPhysicalPath_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.PhysicalLink> */Object ownedPhysicalLinks_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.PhysicalLink> */Object getOwnedPhysicalLinks() {
    if (ownedPhysicalLinks_ == null)
    	ownedPhysicalLinks_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedPhysicalLinks(), adaptersFactory, eResource);
    return ownedPhysicalLinks_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.PhysicalLinkCategory> */Object ownedPhysicalLinkCategories_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.PhysicalLinkCategory> */Object getOwnedPhysicalLinkCategories() {
    if (ownedPhysicalLinkCategories_ == null)
    	ownedPhysicalLinkCategories_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedPhysicalLinkCategories(), adaptersFactory, eResource);
    return ownedPhysicalLinkCategories_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Involvement> */Object involvingInvolvements_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Involvement> */Object getInvolvingInvolvements() {
    if (involvingInvolvements_ == null)
    	involvingInvolvements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInvolvingInvolvements(), adaptersFactory, eResource);
    return involvingInvolvements_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapabilityRealizationInvolvement> */Object involvingCapabilityRealizationInvolvements_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapabilityRealizationInvolvement> */Object getInvolvingCapabilityRealizationInvolvements() {
    if (involvingCapabilityRealizationInvolvements_ == null)
    	involvingCapabilityRealizationInvolvements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInvolvingCapabilityRealizationInvolvements(), adaptersFactory, eResource);
    return involvingCapabilityRealizationInvolvements_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Classifier> */Object dataType_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Classifier> */Object getDataType() {
    if (dataType_ == null)
    	dataType_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDataType(), adaptersFactory, eResource);
    return dataType_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.SystemComponentCapabilityRealizationInvolvement> */Object participationsInCapabilityRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.SystemComponentCapabilityRealizationInvolvement> */Object getParticipationsInCapabilityRealizations() {
    if (participationsInCapabilityRealizations_ == null)
    	participationsInCapabilityRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getParticipationsInCapabilityRealizations(), adaptersFactory, eResource);
    return participationsInCapabilityRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.AbstractDeploymentLink> */Object deployingLinks_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.AbstractDeploymentLink> */Object getDeployingLinks() {
    if (deployingLinks_ == null)
    	deployingLinks_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDeployingLinks(), adaptersFactory, eResource);
    return deployingLinks_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.AbstractDeploymentLink> */Object deploymentLinks_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.AbstractDeploymentLink> */Object getDeploymentLinks() {
    if (deploymentLinks_ == null)
    	deploymentLinks_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDeploymentLinks(), adaptersFactory, eResource);
    return deploymentLinks_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.AbstractDeploymentLink> */Object ownedDeploymentLinks_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.AbstractDeploymentLink> */Object getOwnedDeploymentLinks() {
    if (ownedDeploymentLinks_ == null)
    	ownedDeploymentLinks_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedDeploymentLinks(), adaptersFactory, eResource);
    return ownedDeploymentLinks_;
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.deployment.DeploymentAspect getOwnedDeploymentAspect() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedDeploymentAspect(), eResource);
  }
  
  @Override
  public void setOwnedDeploymentAspect(final org.gemoc.scenario.xdsml.functionscenariomt.deployment.DeploymentAspect o) {
    if (o != null)
    	adaptee.setOwnedDeploymentAspect(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.DeploymentAspectAdapter) o).getAdaptee());
    else adaptee.setOwnedDeploymentAspect(null);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.epbs.ConfigurationItem> */Object allocatorConfigurationItems_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.epbs.ConfigurationItem> */Object getAllocatorConfigurationItems() {
    if (allocatorConfigurationItems_ == null)
    	allocatorConfigurationItems_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAllocatorConfigurationItems(), adaptersFactory, eResource);
    return allocatorConfigurationItems_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalComponent> */Object ownedPhysicalComponents_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalComponent> */Object getOwnedPhysicalComponents() {
    if (ownedPhysicalComponents_ == null)
    	ownedPhysicalComponents_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedPhysicalComponents(), adaptersFactory, eResource);
    return ownedPhysicalComponents_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalComponentPkg> */Object ownedPhysicalComponentPkgs_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalComponentPkg> */Object getOwnedPhysicalComponentPkgs() {
    if (ownedPhysicalComponentPkgs_ == null)
    	ownedPhysicalComponentPkgs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedPhysicalComponentPkgs(), adaptersFactory, eResource);
    return ownedPhysicalComponentPkgs_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.pa.LogicalComponentRealization> */Object ownedLogicalComponentRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.pa.LogicalComponentRealization> */Object getOwnedLogicalComponentRealizations() {
    if (ownedLogicalComponentRealizations_ == null)
    	ownedLogicalComponentRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedLogicalComponentRealizations(), adaptersFactory, eResource);
    return ownedLogicalComponentRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.pa.LogicalComponentRealization> */Object logicalComponentRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.pa.LogicalComponentRealization> */Object getLogicalComponentRealizations() {
    if (logicalComponentRealizations_ == null)
    	logicalComponentRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getLogicalComponentRealizations(), adaptersFactory, eResource);
    return logicalComponentRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.pa.LogicalInterfaceRealization> */Object logicalInterfaceRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.pa.LogicalInterfaceRealization> */Object getLogicalInterfaceRealizations() {
    if (logicalInterfaceRealizations_ == null)
    	logicalInterfaceRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getLogicalInterfaceRealizations(), adaptersFactory, eResource);
    return logicalInterfaceRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalComponent> */Object subPhysicalComponents_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalComponent> */Object getSubPhysicalComponents() {
    if (subPhysicalComponents_ == null)
    	subPhysicalComponents_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSubPhysicalComponents(), adaptersFactory, eResource);
    return subPhysicalComponents_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.la.LogicalComponent> */Object realizedLogicalComponents_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.la.LogicalComponent> */Object getRealizedLogicalComponents() {
    if (realizedLogicalComponents_ == null)
    	realizedLogicalComponents_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizedLogicalComponents(), adaptersFactory, eResource);
    return realizedLogicalComponents_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalFunction> */Object allocatedPhysicalFunctions_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalFunction> */Object getAllocatedPhysicalFunctions() {
    if (allocatedPhysicalFunctions_ == null)
    	allocatedPhysicalFunctions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAllocatedPhysicalFunctions(), adaptersFactory, eResource);
    return allocatedPhysicalFunctions_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalComponent> */Object deployedPhysicalComponents_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalComponent> */Object getDeployedPhysicalComponents() {
    if (deployedPhysicalComponents_ == null)
    	deployedPhysicalComponents_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDeployedPhysicalComponents(), adaptersFactory, eResource);
    return deployedPhysicalComponents_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalComponent> */Object deployingPhysicalComponents_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalComponent> */Object getDeployingPhysicalComponents() {
    if (deployingPhysicalComponents_ == null)
    	deployingPhysicalComponents_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDeployingPhysicalComponents(), adaptersFactory, eResource);
    return deployingPhysicalComponents_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalActor> */Object deployingPhysicalActors_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalActor> */Object getDeployingPhysicalActors() {
    if (deployingPhysicalActors_ == null)
    	deployingPhysicalActors_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDeployingPhysicalActors(), adaptersFactory, eResource);
    return deployingPhysicalActors_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalNode> */Object subPhysicalNodes_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalNode> */Object getSubPhysicalNodes() {
    if (subPhysicalNodes_ == null)
    	subPhysicalNodes_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSubPhysicalNodes(), adaptersFactory, eResource);
    return subPhysicalNodes_;
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
  
  @Override
  public boolean isDecomposed() {
    return adaptee.isDecomposed();
  }
  
  protected final static String ID_EDEFAULT = null;
  
  protected final static String SID_EDEFAULT = null;
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static boolean VISIBLE_IN_DOC_EDEFAULT = true;
  
  protected final static boolean VISIBLE_IN_LM_EDEFAULT = true;
  
  protected final static String SUMMARY_EDEFAULT = null;
  
  protected final static String DESCRIPTION_EDEFAULT = null;
  
  protected final static String REVIEW_EDEFAULT = null;
  
  protected final static boolean ABSTRACT_EDEFAULT = false;
  
  protected final static boolean DATA_COMPONENT_EDEFAULT = false;
  
  protected final static org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalComponentKind KIND_EDEFAULT = org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalComponentKind.UNSET;
  
  protected final static org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalComponentNature NATURE_EDEFAULT = org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalComponentNature.UNSET;
  
  @Override
  public EClass eClass() {
    return org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.eINSTANCE.getPhysicalNode();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__NAME:
    		return getName();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__ABSTRACT_TYPED_ELEMENTS:
    		return getAbstractTypedElements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__INCOMING_TRACES:
    		return getIncomingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OUTGOING_TRACES:
    		return getOutgoingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__VISIBLE_IN_DOC:
    		return isVisibleInDoc() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__VISIBLE_IN_LM:
    		return isVisibleInLM() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__SUMMARY:
    		return getSummary();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__DESCRIPTION:
    		return getDescription();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__REVIEW:
    		return getReview();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__STATUS:
    		return getStatus();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__FEATURES:
    		return getFeatures();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_TRACES:
    		return getOwnedTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__CONTAINED_GENERIC_TRACES:
    		return getContainedGenericTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__CONTAINED_REQUIREMENTS_TRACES:
    		return getContainedRequirementsTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__NAMING_RULES:
    		return getNamingRules();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__TYPED_ELEMENTS:
    		return getTypedElements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_FUNCTIONAL_ALLOCATION:
    		return getOwnedFunctionalAllocation();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_COMPONENT_EXCHANGES:
    		return getOwnedComponentExchanges();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
    		return getOwnedComponentExchangeCategories();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__FUNCTIONAL_ALLOCATIONS:
    		return getFunctionalAllocations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__ALLOCATED_FUNCTIONS:
    		return getAllocatedFunctions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__IN_EXCHANGE_LINKS:
    		return getInExchangeLinks();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OUT_EXCHANGE_LINKS:
    		return getOutExchangeLinks();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_ABSTRACT_CAPABILITY_PKG:
    		return getOwnedAbstractCapabilityPkg();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_INTERFACE_PKG:
    		return getOwnedInterfacePkg();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_DATA_PKG:
    		return getOwnedDataPkg();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_STATE_MACHINES:
    		return getOwnedStateMachines();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__ABSTRACT:
    		return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_GENERALIZATIONS:
    		return getOwnedGeneralizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__SUPER_GENERALIZATIONS:
    		return getSuperGeneralizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__SUB_GENERALIZATIONS:
    		return getSubGeneralizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__SUPER:
    		return getSuper();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__SUB:
    		return getSub();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_FEATURES:
    		return getOwnedFeatures();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__CONTAINED_PROPERTIES:
    		return getContainedProperties();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_PARTITIONS:
    		return getOwnedPartitions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__REPRESENTING_PARTITIONS:
    		return getRepresentingPartitions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_INTERFACE_ALLOCATIONS:
    		return getOwnedInterfaceAllocations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__PROVISIONED_INTERFACE_ALLOCATIONS:
    		return getProvisionedInterfaceAllocations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__ALLOCATED_INTERFACES:
    		return getAllocatedInterfaces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_COMMUNICATION_LINKS:
    		return getOwnedCommunicationLinks();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__PRODUCE:
    		return getProduce();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__CONSUME:
    		return getConsume();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__SEND:
    		return getSend();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__RECEIVE:
    		return getReceive();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__CALL:
    		return getCall();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__EXECUTE:
    		return getExecute();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__WRITE:
    		return getWrite();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__ACCESS:
    		return getAccess();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__ACQUIRE:
    		return getAcquire();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__TRANSMIT:
    		return getTransmit();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_INTERFACE_USES:
    		return getOwnedInterfaceUses();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__USED_INTERFACE_LINKS:
    		return getUsedInterfaceLinks();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__USED_INTERFACES:
    		return getUsedInterfaces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_INTERFACE_IMPLEMENTATIONS:
    		return getOwnedInterfaceImplementations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__IMPLEMENTED_INTERFACE_LINKS:
    		return getImplementedInterfaceLinks();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__IMPLEMENTED_INTERFACES:
    		return getImplementedInterfaces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__PROVISIONED_COMPONENT_ALLOCATIONS:
    		return getProvisionedComponentAllocations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__PROVISIONING_COMPONENT_ALLOCATIONS:
    		return getProvisioningComponentAllocations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__ALLOCATED_COMPONENTS:
    		return getAllocatedComponents();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__ALLOCATING_COMPONENTS:
    		return getAllocatingComponents();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__PROVIDED_INTERFACES:
    		return getProvidedInterfaces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__REQUIRED_INTERFACES:
    		return getRequiredInterfaces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__CONTAINED_COMPONENT_PORTS:
    		return getContainedComponentPorts();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__CONTAINED_PARTS:
    		return getContainedParts();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__CONTAINED_PHYSICAL_PORTS:
    		return getContainedPhysicalPorts();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_PHYSICAL_PATH:
    		return getOwnedPhysicalPath();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_PHYSICAL_LINKS:
    		return getOwnedPhysicalLinks();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_PHYSICAL_LINK_CATEGORIES:
    		return getOwnedPhysicalLinkCategories();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__INVOLVING_INVOLVEMENTS:
    		return getInvolvingInvolvements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__INVOLVING_CAPABILITY_REALIZATION_INVOLVEMENTS:
    		return getInvolvingCapabilityRealizationInvolvements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__DATA_COMPONENT:
    		return isDataComponent() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__DATA_TYPE:
    		return getDataType();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__PARTICIPATIONS_IN_CAPABILITY_REALIZATIONS:
    		return getParticipationsInCapabilityRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__DEPLOYING_LINKS:
    		return getDeployingLinks();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__DEPLOYMENT_LINKS:
    		return getDeploymentLinks();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__KIND:
    		return getKind();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__NATURE:
    		return getNature();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_DEPLOYMENT_LINKS:
    		return getOwnedDeploymentLinks();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_DEPLOYMENT_ASPECT:
    		return getOwnedDeploymentAspect();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__ALLOCATOR_CONFIGURATION_ITEMS:
    		return getAllocatorConfigurationItems();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_PHYSICAL_COMPONENTS:
    		return getOwnedPhysicalComponents();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_PHYSICAL_COMPONENT_PKGS:
    		return getOwnedPhysicalComponentPkgs();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_LOGICAL_COMPONENT_REALIZATIONS:
    		return getOwnedLogicalComponentRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__LOGICAL_COMPONENT_REALIZATIONS:
    		return getLogicalComponentRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__LOGICAL_INTERFACE_REALIZATIONS:
    		return getLogicalInterfaceRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__SUB_PHYSICAL_COMPONENTS:
    		return getSubPhysicalComponents();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__REALIZED_LOGICAL_COMPONENTS:
    		return getRealizedLogicalComponents();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__ALLOCATED_PHYSICAL_FUNCTIONS:
    		return getAllocatedPhysicalFunctions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__DEPLOYED_PHYSICAL_COMPONENTS:
    		return getDeployedPhysicalComponents();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__DEPLOYING_PHYSICAL_COMPONENTS:
    		return getDeployingPhysicalComponents();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__DEPLOYING_PHYSICAL_ACTORS:
    		return getDeployingPhysicalActors();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__SUB_PHYSICAL_NODES:
    		return getSubPhysicalNodes();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__ABSTRACT_TYPED_ELEMENTS:
    		return getAbstractTypedElements() != null && !getAbstractTypedElements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__INCOMING_TRACES:
    		return getIncomingTraces() != null && !getIncomingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OUTGOING_TRACES:
    		return getOutgoingTraces() != null && !getOutgoingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__VISIBLE_IN_DOC:
    		return isVisibleInDoc() != VISIBLE_IN_DOC_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__VISIBLE_IN_LM:
    		return isVisibleInLM() != VISIBLE_IN_LM_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__SUMMARY:
    		return getSummary() != SUMMARY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__REVIEW:
    		return getReview() != REVIEW_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues() != null && !getOwnedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes() != null && !getOwnedEnumerationPropertyTypes().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues() != null && !getAppliedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups() != null && !getOwnedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups() != null && !getAppliedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__STATUS:
    		return getStatus() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__FEATURES:
    		return getFeatures() != null && !getFeatures().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements() != null && !getAppliedRequirements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_TRACES:
    		return getOwnedTraces() != null && !getOwnedTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__CONTAINED_GENERIC_TRACES:
    		return getContainedGenericTraces() != null && !getContainedGenericTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__CONTAINED_REQUIREMENTS_TRACES:
    		return getContainedRequirementsTraces() != null && !getContainedRequirementsTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__NAMING_RULES:
    		return getNamingRules() != null && !getNamingRules().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__TYPED_ELEMENTS:
    		return getTypedElements() != null && !getTypedElements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_FUNCTIONAL_ALLOCATION:
    		return getOwnedFunctionalAllocation() != null && !getOwnedFunctionalAllocation().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_COMPONENT_EXCHANGES:
    		return getOwnedComponentExchanges() != null && !getOwnedComponentExchanges().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
    		return getOwnedComponentExchangeCategories() != null && !getOwnedComponentExchangeCategories().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__FUNCTIONAL_ALLOCATIONS:
    		return getFunctionalAllocations() != null && !getFunctionalAllocations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__ALLOCATED_FUNCTIONS:
    		return getAllocatedFunctions() != null && !getAllocatedFunctions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__IN_EXCHANGE_LINKS:
    		return getInExchangeLinks() != null && !getInExchangeLinks().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OUT_EXCHANGE_LINKS:
    		return getOutExchangeLinks() != null && !getOutExchangeLinks().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_ABSTRACT_CAPABILITY_PKG:
    		return getOwnedAbstractCapabilityPkg() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_INTERFACE_PKG:
    		return getOwnedInterfacePkg() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_DATA_PKG:
    		return getOwnedDataPkg() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_STATE_MACHINES:
    		return getOwnedStateMachines() != null && !getOwnedStateMachines().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__ABSTRACT:
    		return isAbstract() != ABSTRACT_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_GENERALIZATIONS:
    		return getOwnedGeneralizations() != null && !getOwnedGeneralizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__SUPER_GENERALIZATIONS:
    		return getSuperGeneralizations() != null && !getSuperGeneralizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__SUB_GENERALIZATIONS:
    		return getSubGeneralizations() != null && !getSubGeneralizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__SUPER:
    		return getSuper() != null && !getSuper().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__SUB:
    		return getSub() != null && !getSub().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_FEATURES:
    		return getOwnedFeatures() != null && !getOwnedFeatures().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__CONTAINED_PROPERTIES:
    		return getContainedProperties() != null && !getContainedProperties().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_PARTITIONS:
    		return getOwnedPartitions() != null && !getOwnedPartitions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__REPRESENTING_PARTITIONS:
    		return getRepresentingPartitions() != null && !getRepresentingPartitions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_INTERFACE_ALLOCATIONS:
    		return getOwnedInterfaceAllocations() != null && !getOwnedInterfaceAllocations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__PROVISIONED_INTERFACE_ALLOCATIONS:
    		return getProvisionedInterfaceAllocations() != null && !getProvisionedInterfaceAllocations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__ALLOCATED_INTERFACES:
    		return getAllocatedInterfaces() != null && !getAllocatedInterfaces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_COMMUNICATION_LINKS:
    		return getOwnedCommunicationLinks() != null && !getOwnedCommunicationLinks().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__PRODUCE:
    		return getProduce() != null && !getProduce().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__CONSUME:
    		return getConsume() != null && !getConsume().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__SEND:
    		return getSend() != null && !getSend().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__RECEIVE:
    		return getReceive() != null && !getReceive().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__CALL:
    		return getCall() != null && !getCall().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__EXECUTE:
    		return getExecute() != null && !getExecute().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__WRITE:
    		return getWrite() != null && !getWrite().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__ACCESS:
    		return getAccess() != null && !getAccess().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__ACQUIRE:
    		return getAcquire() != null && !getAcquire().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__TRANSMIT:
    		return getTransmit() != null && !getTransmit().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_INTERFACE_USES:
    		return getOwnedInterfaceUses() != null && !getOwnedInterfaceUses().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__USED_INTERFACE_LINKS:
    		return getUsedInterfaceLinks() != null && !getUsedInterfaceLinks().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__USED_INTERFACES:
    		return getUsedInterfaces() != null && !getUsedInterfaces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_INTERFACE_IMPLEMENTATIONS:
    		return getOwnedInterfaceImplementations() != null && !getOwnedInterfaceImplementations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__IMPLEMENTED_INTERFACE_LINKS:
    		return getImplementedInterfaceLinks() != null && !getImplementedInterfaceLinks().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__IMPLEMENTED_INTERFACES:
    		return getImplementedInterfaces() != null && !getImplementedInterfaces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__PROVISIONED_COMPONENT_ALLOCATIONS:
    		return getProvisionedComponentAllocations() != null && !getProvisionedComponentAllocations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__PROVISIONING_COMPONENT_ALLOCATIONS:
    		return getProvisioningComponentAllocations() != null && !getProvisioningComponentAllocations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__ALLOCATED_COMPONENTS:
    		return getAllocatedComponents() != null && !getAllocatedComponents().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__ALLOCATING_COMPONENTS:
    		return getAllocatingComponents() != null && !getAllocatingComponents().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__PROVIDED_INTERFACES:
    		return getProvidedInterfaces() != null && !getProvidedInterfaces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__REQUIRED_INTERFACES:
    		return getRequiredInterfaces() != null && !getRequiredInterfaces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__CONTAINED_COMPONENT_PORTS:
    		return getContainedComponentPorts() != null && !getContainedComponentPorts().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__CONTAINED_PARTS:
    		return getContainedParts() != null && !getContainedParts().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__CONTAINED_PHYSICAL_PORTS:
    		return getContainedPhysicalPorts() != null && !getContainedPhysicalPorts().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_PHYSICAL_PATH:
    		return getOwnedPhysicalPath() != null && !getOwnedPhysicalPath().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_PHYSICAL_LINKS:
    		return getOwnedPhysicalLinks() != null && !getOwnedPhysicalLinks().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_PHYSICAL_LINK_CATEGORIES:
    		return getOwnedPhysicalLinkCategories() != null && !getOwnedPhysicalLinkCategories().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__INVOLVING_INVOLVEMENTS:
    		return getInvolvingInvolvements() != null && !getInvolvingInvolvements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__INVOLVING_CAPABILITY_REALIZATION_INVOLVEMENTS:
    		return getInvolvingCapabilityRealizationInvolvements() != null && !getInvolvingCapabilityRealizationInvolvements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__DATA_COMPONENT:
    		return isDataComponent() != DATA_COMPONENT_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__DATA_TYPE:
    		return getDataType() != null && !getDataType().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__PARTICIPATIONS_IN_CAPABILITY_REALIZATIONS:
    		return getParticipationsInCapabilityRealizations() != null && !getParticipationsInCapabilityRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__DEPLOYING_LINKS:
    		return getDeployingLinks() != null && !getDeployingLinks().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__DEPLOYMENT_LINKS:
    		return getDeploymentLinks() != null && !getDeploymentLinks().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__KIND:
    		return getKind() != KIND_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__NATURE:
    		return getNature() != NATURE_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_DEPLOYMENT_LINKS:
    		return getOwnedDeploymentLinks() != null && !getOwnedDeploymentLinks().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_DEPLOYMENT_ASPECT:
    		return getOwnedDeploymentAspect() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__ALLOCATOR_CONFIGURATION_ITEMS:
    		return getAllocatorConfigurationItems() != null && !getAllocatorConfigurationItems().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_PHYSICAL_COMPONENTS:
    		return getOwnedPhysicalComponents() != null && !getOwnedPhysicalComponents().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_PHYSICAL_COMPONENT_PKGS:
    		return getOwnedPhysicalComponentPkgs() != null && !getOwnedPhysicalComponentPkgs().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_LOGICAL_COMPONENT_REALIZATIONS:
    		return getOwnedLogicalComponentRealizations() != null && !getOwnedLogicalComponentRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__LOGICAL_COMPONENT_REALIZATIONS:
    		return getLogicalComponentRealizations() != null && !getLogicalComponentRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__LOGICAL_INTERFACE_REALIZATIONS:
    		return getLogicalInterfaceRealizations() != null && !getLogicalInterfaceRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__SUB_PHYSICAL_COMPONENTS:
    		return getSubPhysicalComponents() != null && !getSubPhysicalComponents().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__REALIZED_LOGICAL_COMPONENTS:
    		return getRealizedLogicalComponents() != null && !getRealizedLogicalComponents().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__ALLOCATED_PHYSICAL_FUNCTIONS:
    		return getAllocatedPhysicalFunctions() != null && !getAllocatedPhysicalFunctions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__DEPLOYED_PHYSICAL_COMPONENTS:
    		return getDeployedPhysicalComponents() != null && !getDeployedPhysicalComponents().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__DEPLOYING_PHYSICAL_COMPONENTS:
    		return getDeployingPhysicalComponents() != null && !getDeployingPhysicalComponents().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__DEPLOYING_PHYSICAL_ACTORS:
    		return getDeployingPhysicalActors() != null && !getDeployingPhysicalActors().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__SUB_PHYSICAL_NODES:
    		return getSubPhysicalNodes() != null && !getSubPhysicalNodes().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__VISIBLE_IN_DOC:
    		setVisibleInDoc(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__VISIBLE_IN_LM:
    		setVisibleInLM(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__SUMMARY:
    		setSummary(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__REVIEW:
    		setReview(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_PROPERTY_VALUES:
    		getOwnedPropertyValues().clear();
    		getOwnedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_ENUMERATION_PROPERTY_TYPES:
    		getOwnedEnumerationPropertyTypes().clear();
    		getOwnedEnumerationPropertyTypes().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__APPLIED_PROPERTY_VALUES:
    		getAppliedPropertyValues().clear();
    		getAppliedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_PROPERTY_VALUE_GROUPS:
    		getOwnedPropertyValueGroups().clear();
    		getOwnedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__APPLIED_PROPERTY_VALUE_GROUPS:
    		getAppliedPropertyValueGroups().clear();
    		getAppliedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__STATUS:
    		setStatus(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__FEATURES:
    		getFeatures().clear();
    		getFeatures().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_TRACES:
    		getOwnedTraces().clear();
    		getOwnedTraces().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__NAMING_RULES:
    		getNamingRules().clear();
    		getNamingRules().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_FUNCTIONAL_ALLOCATION:
    		getOwnedFunctionalAllocation().clear();
    		getOwnedFunctionalAllocation().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_COMPONENT_EXCHANGES:
    		getOwnedComponentExchanges().clear();
    		getOwnedComponentExchanges().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
    		getOwnedComponentExchangeCategories().clear();
    		getOwnedComponentExchangeCategories().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__IN_EXCHANGE_LINKS:
    		getInExchangeLinks().clear();
    		getInExchangeLinks().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OUT_EXCHANGE_LINKS:
    		getOutExchangeLinks().clear();
    		getOutExchangeLinks().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_ABSTRACT_CAPABILITY_PKG:
    		setOwnedAbstractCapabilityPkg(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.AbstractCapabilityPkg)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_INTERFACE_PKG:
    		setOwnedInterfacePkg(
    		(org.gemoc.scenario.xdsml.functionscenariomt.cs.InterfacePkg)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_DATA_PKG:
    		setOwnedDataPkg(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.DataPkg)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_STATE_MACHINES:
    		getOwnedStateMachines().clear();
    		getOwnedStateMachines().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__ABSTRACT:
    		setAbstract(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_GENERALIZATIONS:
    		getOwnedGeneralizations().clear();
    		getOwnedGeneralizations().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_FEATURES:
    		getOwnedFeatures().clear();
    		getOwnedFeatures().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_INTERFACE_ALLOCATIONS:
    		getOwnedInterfaceAllocations().clear();
    		getOwnedInterfaceAllocations().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_COMMUNICATION_LINKS:
    		getOwnedCommunicationLinks().clear();
    		getOwnedCommunicationLinks().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_INTERFACE_USES:
    		getOwnedInterfaceUses().clear();
    		getOwnedInterfaceUses().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_INTERFACE_IMPLEMENTATIONS:
    		getOwnedInterfaceImplementations().clear();
    		getOwnedInterfaceImplementations().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_PHYSICAL_PATH:
    		getOwnedPhysicalPath().clear();
    		getOwnedPhysicalPath().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_PHYSICAL_LINKS:
    		getOwnedPhysicalLinks().clear();
    		getOwnedPhysicalLinks().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_PHYSICAL_LINK_CATEGORIES:
    		getOwnedPhysicalLinkCategories().clear();
    		getOwnedPhysicalLinkCategories().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__DATA_COMPONENT:
    		setDataComponent(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__DATA_TYPE:
    		getDataType().clear();
    		getDataType().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__DEPLOYMENT_LINKS:
    		getDeploymentLinks().clear();
    		getDeploymentLinks().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__KIND:
    		setKind(
    		(org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalComponentKind)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__NATURE:
    		setNature(
    		(org.gemoc.scenario.xdsml.functionscenariomt.pa.PhysicalComponentNature)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_DEPLOYMENT_LINKS:
    		getOwnedDeploymentLinks().clear();
    		getOwnedDeploymentLinks().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_DEPLOYMENT_ASPECT:
    		setOwnedDeploymentAspect(
    		(org.gemoc.scenario.xdsml.functionscenariomt.deployment.DeploymentAspect)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_PHYSICAL_COMPONENTS:
    		getOwnedPhysicalComponents().clear();
    		getOwnedPhysicalComponents().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_PHYSICAL_COMPONENT_PKGS:
    		getOwnedPhysicalComponentPkgs().clear();
    		getOwnedPhysicalComponentPkgs().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.pa.PaPackage.PHYSICAL_NODE__OWNED_LOGICAL_COMPONENT_REALIZATIONS:
    		getOwnedLogicalComponentRealizations().clear();
    		getOwnedLogicalComponentRealizations().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
