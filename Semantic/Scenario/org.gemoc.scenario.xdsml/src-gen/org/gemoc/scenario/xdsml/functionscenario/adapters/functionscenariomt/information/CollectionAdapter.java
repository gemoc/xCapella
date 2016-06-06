package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.information.Collection;

@SuppressWarnings("all")
public class CollectionAdapter extends EObjectAdapter<Collection> implements org.gemoc.scenario.xdsml.functionscenariomt.information.Collection {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public CollectionAdapter() {
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
  public boolean isOrdered() {
    return adaptee.isOrdered();
  }
  
  @Override
  public void setOrdered(final boolean o) {
    adaptee.setOrdered(o);
  }
  
  @Override
  public boolean isUnique() {
    return adaptee.isUnique();
  }
  
  @Override
  public void setUnique(final boolean o) {
    adaptee.setUnique(o);
  }
  
  @Override
  public boolean isMinInclusive() {
    return adaptee.isMinInclusive();
  }
  
  @Override
  public void setMinInclusive(final boolean o) {
    adaptee.setMinInclusive(o);
  }
  
  @Override
  public boolean isMaxInclusive() {
    return adaptee.isMaxInclusive();
  }
  
  @Override
  public void setMaxInclusive(final boolean o) {
    adaptee.setMaxInclusive(o);
  }
  
  @Override
  public boolean isFinal() {
    return adaptee.isFinal();
  }
  
  @Override
  public void setFinal(final boolean o) {
    adaptee.setFinal(o);
  }
  
  @Override
  public boolean isIsPrimitive() {
    return adaptee.isIsPrimitive();
  }
  
  @Override
  public void setIsPrimitive(final boolean o) {
    adaptee.setIsPrimitive(o);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacore.VisibilityKind getVisibility() {
    return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.VisibilityKind.get(adaptee.getVisibility().getValue());
  }
  
  @Override
  public void setVisibility(final org.gemoc.scenario.xdsml.functionscenariomt.capellacore.VisibilityKind o) {
    adaptee.setVisibility(org.polarsys.capella.core.data.capellacore.VisibilityKind.get(o.getValue()));
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.CollectionKind getKind() {
    return org.gemoc.scenario.xdsml.functionscenariomt.information.CollectionKind.get(adaptee.getKind().getValue());
  }
  
  @Override
  public void setKind(final org.gemoc.scenario.xdsml.functionscenariomt.information.CollectionKind o) {
    adaptee.setKind(org.polarsys.capella.core.data.information.CollectionKind.get(o.getValue()));
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.AggregationKind getAggregationKind() {
    return org.gemoc.scenario.xdsml.functionscenariomt.information.AggregationKind.get(adaptee.getAggregationKind().getValue());
  }
  
  @Override
  public void setAggregationKind(final org.gemoc.scenario.xdsml.functionscenariomt.information.AggregationKind o) {
    adaptee.setAggregationKind(org.polarsys.capella.core.data.information.AggregationKind.get(o.getValue()));
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
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue getOwnedDefaultValue() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedDefaultValue(), eResource);
  }
  
  @Override
  public void setOwnedDefaultValue(final org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue o) {
    if (o != null)
    	adaptee.setOwnedDefaultValue(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.DataValueAdapter) o).getAdaptee());
    else adaptee.setOwnedDefaultValue(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue getOwnedMinValue() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedMinValue(), eResource);
  }
  
  @Override
  public void setOwnedMinValue(final org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue o) {
    if (o != null)
    	adaptee.setOwnedMinValue(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.DataValueAdapter) o).getAdaptee());
    else adaptee.setOwnedMinValue(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue getOwnedMaxValue() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedMaxValue(), eResource);
  }
  
  @Override
  public void setOwnedMaxValue(final org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue o) {
    if (o != null)
    	adaptee.setOwnedMaxValue(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.DataValueAdapter) o).getAdaptee());
    else adaptee.setOwnedMaxValue(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue getOwnedNullValue() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedNullValue(), eResource);
  }
  
  @Override
  public void setOwnedNullValue(final org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue o) {
    if (o != null)
    	adaptee.setOwnedNullValue(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.DataValueAdapter) o).getAdaptee());
    else adaptee.setOwnedNullValue(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue getOwnedMinCard() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedMinCard(), eResource);
  }
  
  @Override
  public void setOwnedMinCard(final org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue o) {
    if (o != null)
    	adaptee.setOwnedMinCard(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.NumericValueAdapter) o).getAdaptee());
    else adaptee.setOwnedMinCard(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue getOwnedMinLength() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedMinLength(), eResource);
  }
  
  @Override
  public void setOwnedMinLength(final org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue o) {
    if (o != null)
    	adaptee.setOwnedMinLength(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.NumericValueAdapter) o).getAdaptee());
    else adaptee.setOwnedMinLength(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue getOwnedMaxCard() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedMaxCard(), eResource);
  }
  
  @Override
  public void setOwnedMaxCard(final org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue o) {
    if (o != null)
    	adaptee.setOwnedMaxCard(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.NumericValueAdapter) o).getAdaptee());
    else adaptee.setOwnedMaxCard(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue getOwnedMaxLength() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedMaxLength(), eResource);
  }
  
  @Override
  public void setOwnedMaxLength(final org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue o) {
    if (o != null)
    	adaptee.setOwnedMaxLength(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.NumericValueAdapter) o).getAdaptee());
    else adaptee.setOwnedMaxLength(null);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.PropertyValuePkg> */Object ownedPropertyValuePkgs_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.PropertyValuePkg> */Object getOwnedPropertyValuePkgs() {
    if (ownedPropertyValuePkgs_ == null)
    	ownedPropertyValuePkgs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedPropertyValuePkgs(), adaptersFactory, eResource);
    return ownedPropertyValuePkgs_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue> */Object ownedDataValues_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue> */Object getOwnedDataValues() {
    if (ownedDataValues_ == null)
    	ownedDataValues_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedDataValues(), adaptersFactory, eResource);
    return ownedDataValues_;
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Type getType() {
    return () adaptersFactory.createAdapter(adaptee.getType(), eResource);
  }
  
  @Override
  public void setType(final org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Type o) {
    if (o != null)
    	adaptee.setType(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.TypeAdapter) o).getAdaptee());
    else adaptee.setType(null);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.datatype.DataType> */Object index_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.datatype.DataType> */Object getIndex() {
    if (index_ == null)
    	index_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIndex(), adaptersFactory, eResource);
    return index_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.Operation> */Object containedOperations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.Operation> */Object getContainedOperations() {
    if (containedOperations_ == null)
    	containedOperations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getContainedOperations(), adaptersFactory, eResource);
    return containedOperations_;
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
  
  protected final static boolean ABSTRACT_EDEFAULT = false;
  
  protected final static boolean ORDERED_EDEFAULT = false;
  
  protected final static boolean UNIQUE_EDEFAULT = false;
  
  protected final static boolean MIN_INCLUSIVE_EDEFAULT = false;
  
  protected final static boolean MAX_INCLUSIVE_EDEFAULT = false;
  
  protected final static boolean FINAL_EDEFAULT = false;
  
  protected final static boolean IS_PRIMITIVE_EDEFAULT = false;
  
  protected final static org.gemoc.scenario.xdsml.functionscenariomt.capellacore.VisibilityKind VISIBILITY_EDEFAULT = org.gemoc.scenario.xdsml.functionscenariomt.capellacore.VisibilityKind.UNSET;
  
  protected final static org.gemoc.scenario.xdsml.functionscenariomt.information.CollectionKind KIND_EDEFAULT = org.gemoc.scenario.xdsml.functionscenariomt.information.CollectionKind.ARRAY;
  
  protected final static org.gemoc.scenario.xdsml.functionscenariomt.information.AggregationKind AGGREGATION_KIND_EDEFAULT = org.gemoc.scenario.xdsml.functionscenariomt.information.AggregationKind.UNSET;
  
  @Override
  public EClass eClass() {
    return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.eINSTANCE.getCollection();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__NAME:
    		return getName();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__ABSTRACT_TYPED_ELEMENTS:
    		return getAbstractTypedElements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__INCOMING_TRACES:
    		return getIncomingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OUTGOING_TRACES:
    		return getOutgoingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__VISIBLE_IN_DOC:
    		return isVisibleInDoc() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__VISIBLE_IN_LM:
    		return isVisibleInLM() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__SUMMARY:
    		return getSummary();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__DESCRIPTION:
    		return getDescription();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__REVIEW:
    		return getReview();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__STATUS:
    		return getStatus();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__FEATURES:
    		return getFeatures();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_TRACES:
    		return getOwnedTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__CONTAINED_GENERIC_TRACES:
    		return getContainedGenericTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__CONTAINED_REQUIREMENTS_TRACES:
    		return getContainedRequirementsTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__NAMING_RULES:
    		return getNamingRules();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__TYPED_ELEMENTS:
    		return getTypedElements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__ABSTRACT:
    		return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_GENERALIZATIONS:
    		return getOwnedGeneralizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__SUPER_GENERALIZATIONS:
    		return getSuperGeneralizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__SUB_GENERALIZATIONS:
    		return getSubGeneralizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__SUPER:
    		return getSuper();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__SUB:
    		return getSub();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_FEATURES:
    		return getOwnedFeatures();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__CONTAINED_PROPERTIES:
    		return getContainedProperties();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__ORDERED:
    		return isOrdered() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__UNIQUE:
    		return isUnique() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__MIN_INCLUSIVE:
    		return isMinInclusive() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__MAX_INCLUSIVE:
    		return isMaxInclusive() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_DEFAULT_VALUE:
    		return getOwnedDefaultValue();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_MIN_VALUE:
    		return getOwnedMinValue();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_MAX_VALUE:
    		return getOwnedMaxValue();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_NULL_VALUE:
    		return getOwnedNullValue();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_MIN_CARD:
    		return getOwnedMinCard();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_MIN_LENGTH:
    		return getOwnedMinLength();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_MAX_CARD:
    		return getOwnedMaxCard();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_MAX_LENGTH:
    		return getOwnedMaxLength();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_PROPERTY_VALUE_PKGS:
    		return getOwnedPropertyValuePkgs();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_DATA_VALUES:
    		return getOwnedDataValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__FINAL:
    		return isFinal() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__IS_PRIMITIVE:
    		return isIsPrimitive() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__VISIBILITY:
    		return getVisibility();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__KIND:
    		return getKind();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__AGGREGATION_KIND:
    		return getAggregationKind();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__TYPE:
    		return getType();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__INDEX:
    		return getIndex();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__CONTAINED_OPERATIONS:
    		return getContainedOperations();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__ABSTRACT_TYPED_ELEMENTS:
    		return getAbstractTypedElements() != null && !getAbstractTypedElements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__INCOMING_TRACES:
    		return getIncomingTraces() != null && !getIncomingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OUTGOING_TRACES:
    		return getOutgoingTraces() != null && !getOutgoingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__VISIBLE_IN_DOC:
    		return isVisibleInDoc() != VISIBLE_IN_DOC_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__VISIBLE_IN_LM:
    		return isVisibleInLM() != VISIBLE_IN_LM_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__SUMMARY:
    		return getSummary() != SUMMARY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__REVIEW:
    		return getReview() != REVIEW_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues() != null && !getOwnedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes() != null && !getOwnedEnumerationPropertyTypes().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues() != null && !getAppliedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups() != null && !getOwnedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups() != null && !getAppliedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__STATUS:
    		return getStatus() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__FEATURES:
    		return getFeatures() != null && !getFeatures().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements() != null && !getAppliedRequirements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_TRACES:
    		return getOwnedTraces() != null && !getOwnedTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__CONTAINED_GENERIC_TRACES:
    		return getContainedGenericTraces() != null && !getContainedGenericTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__CONTAINED_REQUIREMENTS_TRACES:
    		return getContainedRequirementsTraces() != null && !getContainedRequirementsTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__NAMING_RULES:
    		return getNamingRules() != null && !getNamingRules().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__TYPED_ELEMENTS:
    		return getTypedElements() != null && !getTypedElements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__ABSTRACT:
    		return isAbstract() != ABSTRACT_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_GENERALIZATIONS:
    		return getOwnedGeneralizations() != null && !getOwnedGeneralizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__SUPER_GENERALIZATIONS:
    		return getSuperGeneralizations() != null && !getSuperGeneralizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__SUB_GENERALIZATIONS:
    		return getSubGeneralizations() != null && !getSubGeneralizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__SUPER:
    		return getSuper() != null && !getSuper().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__SUB:
    		return getSub() != null && !getSub().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_FEATURES:
    		return getOwnedFeatures() != null && !getOwnedFeatures().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__CONTAINED_PROPERTIES:
    		return getContainedProperties() != null && !getContainedProperties().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__ORDERED:
    		return isOrdered() != ORDERED_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__UNIQUE:
    		return isUnique() != UNIQUE_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__MIN_INCLUSIVE:
    		return isMinInclusive() != MIN_INCLUSIVE_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__MAX_INCLUSIVE:
    		return isMaxInclusive() != MAX_INCLUSIVE_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_DEFAULT_VALUE:
    		return getOwnedDefaultValue() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_MIN_VALUE:
    		return getOwnedMinValue() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_MAX_VALUE:
    		return getOwnedMaxValue() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_NULL_VALUE:
    		return getOwnedNullValue() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_MIN_CARD:
    		return getOwnedMinCard() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_MIN_LENGTH:
    		return getOwnedMinLength() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_MAX_CARD:
    		return getOwnedMaxCard() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_MAX_LENGTH:
    		return getOwnedMaxLength() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_PROPERTY_VALUE_PKGS:
    		return getOwnedPropertyValuePkgs() != null && !getOwnedPropertyValuePkgs().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_DATA_VALUES:
    		return getOwnedDataValues() != null && !getOwnedDataValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__FINAL:
    		return isFinal() != FINAL_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__IS_PRIMITIVE:
    		return isIsPrimitive() != IS_PRIMITIVE_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__VISIBILITY:
    		return getVisibility() != VISIBILITY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__KIND:
    		return getKind() != KIND_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__AGGREGATION_KIND:
    		return getAggregationKind() != AGGREGATION_KIND_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__TYPE:
    		return getType() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__INDEX:
    		return getIndex() != null && !getIndex().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__CONTAINED_OPERATIONS:
    		return getContainedOperations() != null && !getContainedOperations().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((java.util.Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((java.util.Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__VISIBLE_IN_DOC:
    		setVisibleInDoc(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__VISIBLE_IN_LM:
    		setVisibleInLM(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__SUMMARY:
    		setSummary(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__REVIEW:
    		setReview(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_PROPERTY_VALUES:
    		getOwnedPropertyValues().clear();
    		getOwnedPropertyValues().addAll((java.util.Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_ENUMERATION_PROPERTY_TYPES:
    		getOwnedEnumerationPropertyTypes().clear();
    		getOwnedEnumerationPropertyTypes().addAll((java.util.Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__APPLIED_PROPERTY_VALUES:
    		getAppliedPropertyValues().clear();
    		getAppliedPropertyValues().addAll((java.util.Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_PROPERTY_VALUE_GROUPS:
    		getOwnedPropertyValueGroups().clear();
    		getOwnedPropertyValueGroups().addAll((java.util.Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__APPLIED_PROPERTY_VALUE_GROUPS:
    		getAppliedPropertyValueGroups().clear();
    		getAppliedPropertyValueGroups().addAll((java.util.Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__STATUS:
    		setStatus(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__FEATURES:
    		getFeatures().clear();
    		getFeatures().addAll((java.util.Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_TRACES:
    		getOwnedTraces().clear();
    		getOwnedTraces().addAll((java.util.Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__NAMING_RULES:
    		getNamingRules().clear();
    		getNamingRules().addAll((java.util.Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__ABSTRACT:
    		setAbstract(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_GENERALIZATIONS:
    		getOwnedGeneralizations().clear();
    		getOwnedGeneralizations().addAll((java.util.Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_FEATURES:
    		getOwnedFeatures().clear();
    		getOwnedFeatures().addAll((java.util.Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__ORDERED:
    		setOrdered(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__UNIQUE:
    		setUnique(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__MIN_INCLUSIVE:
    		setMinInclusive(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__MAX_INCLUSIVE:
    		setMaxInclusive(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_DEFAULT_VALUE:
    		setOwnedDefaultValue(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_MIN_VALUE:
    		setOwnedMinValue(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_MAX_VALUE:
    		setOwnedMaxValue(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_NULL_VALUE:
    		setOwnedNullValue(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_MIN_CARD:
    		setOwnedMinCard(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_MIN_LENGTH:
    		setOwnedMinLength(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_MAX_CARD:
    		setOwnedMaxCard(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_MAX_LENGTH:
    		setOwnedMaxLength(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.NumericValue)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_PROPERTY_VALUE_PKGS:
    		getOwnedPropertyValuePkgs().clear();
    		getOwnedPropertyValuePkgs().addAll((java.util.Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_DATA_VALUES:
    		getOwnedDataValues().clear();
    		getOwnedDataValues().addAll((java.util.Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__FINAL:
    		setFinal(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__IS_PRIMITIVE:
    		setIsPrimitive(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__VISIBILITY:
    		setVisibility(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.VisibilityKind)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__KIND:
    		setKind(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.CollectionKind)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__AGGREGATION_KIND:
    		setAggregationKind(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.AggregationKind)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__TYPE:
    		setType(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Type)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__INDEX:
    		getIndex().clear();
    		getIndex().addAll((java.util.Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.information.MultiplicityElement.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__ORDERED:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__ORDERED;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__UNIQUE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__UNIQUE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__MIN_INCLUSIVE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__MIN_INCLUSIVE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__MAX_INCLUSIVE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__MAX_INCLUSIVE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_DEFAULT_VALUE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_MIN_VALUE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_MAX_VALUE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_NULL_VALUE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_MIN_CARD:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_CARD;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_MIN_LENGTH:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_LENGTH;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_MAX_CARD:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_CARD;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_MAX_LENGTH:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_LENGTH;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Structure.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_PROPERTY_VALUE_PKGS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUE_PKGS;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValueContainer.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_DATA_VALUES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.DATA_VALUE_CONTAINER__OWNED_DATA_VALUES;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.FinalizableElement.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__FINAL:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.FINALIZABLE_ELEMENT__FINAL;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.information.MultiplicityElement.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__ORDERED:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__ORDERED;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__UNIQUE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__UNIQUE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__MIN_INCLUSIVE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__MIN_INCLUSIVE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__MAX_INCLUSIVE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__MAX_INCLUSIVE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_DEFAULT_VALUE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_MIN_VALUE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_MAX_VALUE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_NULL_VALUE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_CARD:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_MIN_CARD;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_LENGTH:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_MIN_LENGTH;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_CARD:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_MAX_CARD;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_LENGTH:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_MAX_LENGTH;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Structure.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUE_PKGS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_PROPERTY_VALUE_PKGS;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DataValueContainer.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.datavalue.DatavaluePackage.DATA_VALUE_CONTAINER__OWNED_DATA_VALUES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__OWNED_DATA_VALUES;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.FinalizableElement.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.FINALIZABLE_ELEMENT__FINAL:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.COLLECTION__FINAL;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
