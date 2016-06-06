package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.information.ExchangeItem;

@SuppressWarnings("all")
public class ExchangeItemAdapter extends EObjectAdapter<ExchangeItem> implements org.gemoc.scenario.xdsml.functionscenariomt.information.ExchangeItem {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public ExchangeItemAdapter() {
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
  public boolean isFinal() {
    return adaptee.isFinal();
  }
  
  @Override
  public void setFinal(final boolean o) {
    adaptee.setFinal(o);
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
  public org.gemoc.scenario.xdsml.functionscenariomt.information.ExchangeMechanism getExchangeMechanism() {
    return org.gemoc.scenario.xdsml.functionscenariomt.information.ExchangeMechanism.get(adaptee.getExchangeMechanism().getValue());
  }
  
  @Override
  public void setExchangeMechanism(final org.gemoc.scenario.xdsml.functionscenariomt.information.ExchangeMechanism o) {
    adaptee.setExchangeMechanism(org.polarsys.capella.core.data.information.ExchangeMechanism.get(o.getValue()));
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
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.ExchangeItemElement> */Object ownedElements_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.ExchangeItemElement> */Object getOwnedElements() {
    if (ownedElements_ == null)
    	ownedElements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedElements(), adaptersFactory, eResource);
    return ownedElements_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.InformationRealization> */Object ownedInformationRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.InformationRealization> */Object getOwnedInformationRealizations() {
    if (ownedInformationRealizations_ == null)
    	ownedInformationRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedInformationRealizations(), adaptersFactory, eResource);
    return ownedInformationRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.ExchangeItemInstance> */Object ownedExchangeItemInstances_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.ExchangeItemInstance> */Object getOwnedExchangeItemInstances() {
    if (ownedExchangeItemInstances_ == null)
    	ownedExchangeItemInstances_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedExchangeItemInstances(), adaptersFactory, eResource);
    return ownedExchangeItemInstances_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object allocatorInterfaces_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object getAllocatorInterfaces() {
    if (allocatorInterfaces_ == null)
    	allocatorInterfaces_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAllocatorInterfaces(), adaptersFactory, eResource);
    return allocatorInterfaces_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.ExchangeItem> */Object realizedExchangeItems_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.ExchangeItem> */Object getRealizedExchangeItems() {
    if (realizedExchangeItems_ == null)
    	realizedExchangeItems_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizedExchangeItems(), adaptersFactory, eResource);
    return realizedExchangeItems_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.ExchangeItem> */Object realizingExchangeItems_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.ExchangeItem> */Object getRealizingExchangeItems() {
    if (realizingExchangeItems_ == null)
    	realizingExchangeItems_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizingExchangeItems(), adaptersFactory, eResource);
    return realizingExchangeItems_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.Operation> */Object realizingOperations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.Operation> */Object getRealizingOperations() {
    if (realizingOperations_ == null)
    	realizingOperations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizingOperations(), adaptersFactory, eResource);
    return realizingOperations_;
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
  
  protected final static boolean FINAL_EDEFAULT = false;
  
  protected final static boolean VISIBLE_IN_DOC_EDEFAULT = true;
  
  protected final static boolean VISIBLE_IN_LM_EDEFAULT = true;
  
  protected final static String SUMMARY_EDEFAULT = null;
  
  protected final static String DESCRIPTION_EDEFAULT = null;
  
  protected final static String REVIEW_EDEFAULT = null;
  
  protected final static boolean ABSTRACT_EDEFAULT = false;
  
  protected final static org.gemoc.scenario.xdsml.functionscenariomt.information.ExchangeMechanism EXCHANGE_MECHANISM_EDEFAULT = org.gemoc.scenario.xdsml.functionscenariomt.information.ExchangeMechanism.UNSET;
  
  @Override
  public EClass eClass() {
    return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.eINSTANCE.getExchangeItem();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__NAME:
    		return getName();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__ABSTRACT_TYPED_ELEMENTS:
    		return getAbstractTypedElements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__FINAL:
    		return isFinal() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__INCOMING_TRACES:
    		return getIncomingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OUTGOING_TRACES:
    		return getOutgoingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__VISIBLE_IN_DOC:
    		return isVisibleInDoc() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__VISIBLE_IN_LM:
    		return isVisibleInLM() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__SUMMARY:
    		return getSummary();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__DESCRIPTION:
    		return getDescription();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__REVIEW:
    		return getReview();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__STATUS:
    		return getStatus();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__FEATURES:
    		return getFeatures();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_TRACES:
    		return getOwnedTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__CONTAINED_GENERIC_TRACES:
    		return getContainedGenericTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__CONTAINED_REQUIREMENTS_TRACES:
    		return getContainedRequirementsTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__NAMING_RULES:
    		return getNamingRules();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__TYPED_ELEMENTS:
    		return getTypedElements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__ABSTRACT:
    		return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_GENERALIZATIONS:
    		return getOwnedGeneralizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__SUPER_GENERALIZATIONS:
    		return getSuperGeneralizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__SUB_GENERALIZATIONS:
    		return getSubGeneralizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__SUPER:
    		return getSuper();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__SUB:
    		return getSub();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__EXCHANGE_MECHANISM:
    		return getExchangeMechanism();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_ELEMENTS:
    		return getOwnedElements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_INFORMATION_REALIZATIONS:
    		return getOwnedInformationRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_EXCHANGE_ITEM_INSTANCES:
    		return getOwnedExchangeItemInstances();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__ALLOCATOR_INTERFACES:
    		return getAllocatorInterfaces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__REALIZED_EXCHANGE_ITEMS:
    		return getRealizedExchangeItems();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__REALIZING_EXCHANGE_ITEMS:
    		return getRealizingExchangeItems();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__REALIZING_OPERATIONS:
    		return getRealizingOperations();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__ABSTRACT_TYPED_ELEMENTS:
    		return getAbstractTypedElements() != null && !getAbstractTypedElements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__FINAL:
    		return isFinal() != FINAL_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__INCOMING_TRACES:
    		return getIncomingTraces() != null && !getIncomingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OUTGOING_TRACES:
    		return getOutgoingTraces() != null && !getOutgoingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__VISIBLE_IN_DOC:
    		return isVisibleInDoc() != VISIBLE_IN_DOC_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__VISIBLE_IN_LM:
    		return isVisibleInLM() != VISIBLE_IN_LM_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__SUMMARY:
    		return getSummary() != SUMMARY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__REVIEW:
    		return getReview() != REVIEW_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues() != null && !getOwnedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes() != null && !getOwnedEnumerationPropertyTypes().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues() != null && !getAppliedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups() != null && !getOwnedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups() != null && !getAppliedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__STATUS:
    		return getStatus() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__FEATURES:
    		return getFeatures() != null && !getFeatures().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements() != null && !getAppliedRequirements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_TRACES:
    		return getOwnedTraces() != null && !getOwnedTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__CONTAINED_GENERIC_TRACES:
    		return getContainedGenericTraces() != null && !getContainedGenericTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__CONTAINED_REQUIREMENTS_TRACES:
    		return getContainedRequirementsTraces() != null && !getContainedRequirementsTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__NAMING_RULES:
    		return getNamingRules() != null && !getNamingRules().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__TYPED_ELEMENTS:
    		return getTypedElements() != null && !getTypedElements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__ABSTRACT:
    		return isAbstract() != ABSTRACT_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_GENERALIZATIONS:
    		return getOwnedGeneralizations() != null && !getOwnedGeneralizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__SUPER_GENERALIZATIONS:
    		return getSuperGeneralizations() != null && !getSuperGeneralizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__SUB_GENERALIZATIONS:
    		return getSubGeneralizations() != null && !getSubGeneralizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__SUPER:
    		return getSuper() != null && !getSuper().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__SUB:
    		return getSub() != null && !getSub().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__EXCHANGE_MECHANISM:
    		return getExchangeMechanism() != EXCHANGE_MECHANISM_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_ELEMENTS:
    		return getOwnedElements() != null && !getOwnedElements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_INFORMATION_REALIZATIONS:
    		return getOwnedInformationRealizations() != null && !getOwnedInformationRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_EXCHANGE_ITEM_INSTANCES:
    		return getOwnedExchangeItemInstances() != null && !getOwnedExchangeItemInstances().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__ALLOCATOR_INTERFACES:
    		return getAllocatorInterfaces() != null && !getAllocatorInterfaces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__REALIZED_EXCHANGE_ITEMS:
    		return getRealizedExchangeItems() != null && !getRealizedExchangeItems().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__REALIZING_EXCHANGE_ITEMS:
    		return getRealizingExchangeItems() != null && !getRealizingExchangeItems().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__REALIZING_OPERATIONS:
    		return getRealizingOperations() != null && !getRealizingOperations().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__FINAL:
    		setFinal(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__VISIBLE_IN_DOC:
    		setVisibleInDoc(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__VISIBLE_IN_LM:
    		setVisibleInLM(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__SUMMARY:
    		setSummary(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__REVIEW:
    		setReview(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_PROPERTY_VALUES:
    		getOwnedPropertyValues().clear();
    		getOwnedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_ENUMERATION_PROPERTY_TYPES:
    		getOwnedEnumerationPropertyTypes().clear();
    		getOwnedEnumerationPropertyTypes().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__APPLIED_PROPERTY_VALUES:
    		getAppliedPropertyValues().clear();
    		getAppliedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_PROPERTY_VALUE_GROUPS:
    		getOwnedPropertyValueGroups().clear();
    		getOwnedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__APPLIED_PROPERTY_VALUE_GROUPS:
    		getAppliedPropertyValueGroups().clear();
    		getAppliedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__STATUS:
    		setStatus(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__FEATURES:
    		getFeatures().clear();
    		getFeatures().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_TRACES:
    		getOwnedTraces().clear();
    		getOwnedTraces().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__NAMING_RULES:
    		getNamingRules().clear();
    		getNamingRules().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__ABSTRACT:
    		setAbstract(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_GENERALIZATIONS:
    		getOwnedGeneralizations().clear();
    		getOwnedGeneralizations().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__EXCHANGE_MECHANISM:
    		setExchangeMechanism(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.ExchangeMechanism)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_ELEMENTS:
    		getOwnedElements().clear();
    		getOwnedElements().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_INFORMATION_REALIZATIONS:
    		getOwnedInformationRealizations().clear();
    		getOwnedInformationRealizations().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_EXCHANGE_ITEM_INSTANCES:
    		getOwnedExchangeItemInstances().clear();
    		getOwnedExchangeItemInstances().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractEvent.class) {
    	switch (derivedFeatureID) {
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractSignal.class) {
    	switch (derivedFeatureID) {
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.FinalizableElement.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__FINAL:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.FINALIZABLE_ELEMENT__FINAL;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.TraceableElement.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__INCOMING_TRACES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.TRACEABLE_ELEMENT__INCOMING_TRACES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OUTGOING_TRACES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.TRACEABLE_ELEMENT__OUTGOING_TRACES;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.PublishableElement.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__VISIBLE_IN_DOC:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_DOC;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__VISIBLE_IN_LM:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_LM;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellaElement.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__SUMMARY:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__SUMMARY;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__DESCRIPTION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__DESCRIPTION;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__REVIEW:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__REVIEW;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_PROPERTY_VALUES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_ENUMERATION_PROPERTY_TYPES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__APPLIED_PROPERTY_VALUES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_PROPERTY_VALUE_GROUPS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__APPLIED_PROPERTY_VALUE_GROUPS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__STATUS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__STATUS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__FEATURES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__FEATURES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__APPLIED_REQUIREMENTS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__APPLIED_REQUIREMENTS;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.capellacore.NamedElement.class) {
    	switch (derivedFeatureID) {
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Namespace.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_TRACES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.NAMESPACE__OWNED_TRACES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__CONTAINED_GENERIC_TRACES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.NAMESPACE__CONTAINED_GENERIC_TRACES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__CONTAINED_REQUIREMENTS_TRACES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.NAMESPACE__CONTAINED_REQUIREMENTS_TRACES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__NAMING_RULES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.NAMESPACE__NAMING_RULES;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Type.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__TYPED_ELEMENTS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.TYPE__TYPED_ELEMENTS;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.capellacore.GeneralizableElement.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__ABSTRACT:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.GENERALIZABLE_ELEMENT__ABSTRACT;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_GENERALIZATIONS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.GENERALIZABLE_ELEMENT__OWNED_GENERALIZATIONS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__SUPER_GENERALIZATIONS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER_GENERALIZATIONS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__SUB_GENERALIZATIONS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.GENERALIZABLE_ELEMENT__SUB_GENERALIZATIONS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__SUPER:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER;
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__SUB:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.GENERALIZABLE_ELEMENT__SUB;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractEvent.class) {
    	switch (baseFeatureID) {
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractSignal.class) {
    	switch (baseFeatureID) {
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.FinalizableElement.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.FINALIZABLE_ELEMENT__FINAL:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__FINAL;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.TraceableElement.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.TRACEABLE_ELEMENT__INCOMING_TRACES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__INCOMING_TRACES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.TRACEABLE_ELEMENT__OUTGOING_TRACES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OUTGOING_TRACES;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.PublishableElement.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_DOC:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__VISIBLE_IN_DOC;
    		case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_LM:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__VISIBLE_IN_LM;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellaElement.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__SUMMARY:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__SUMMARY;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__DESCRIPTION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__DESCRIPTION;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__REVIEW:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__REVIEW;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_PROPERTY_VALUES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_ENUMERATION_PROPERTY_TYPES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__APPLIED_PROPERTY_VALUES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_PROPERTY_VALUE_GROUPS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__APPLIED_PROPERTY_VALUE_GROUPS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__STATUS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__STATUS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__FEATURES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__FEATURES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__APPLIED_REQUIREMENTS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__APPLIED_REQUIREMENTS;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.capellacore.NamedElement.class) {
    	switch (baseFeatureID) {
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Namespace.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.NAMESPACE__OWNED_TRACES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_TRACES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.NAMESPACE__CONTAINED_GENERIC_TRACES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__CONTAINED_GENERIC_TRACES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.NAMESPACE__CONTAINED_REQUIREMENTS_TRACES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__CONTAINED_REQUIREMENTS_TRACES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.NAMESPACE__NAMING_RULES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__NAMING_RULES;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Type.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.TYPE__TYPED_ELEMENTS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__TYPED_ELEMENTS;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.capellacore.GeneralizableElement.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.GENERALIZABLE_ELEMENT__ABSTRACT:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__ABSTRACT;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.GENERALIZABLE_ELEMENT__OWNED_GENERALIZATIONS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__OWNED_GENERALIZATIONS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER_GENERALIZATIONS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__SUPER_GENERALIZATIONS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.GENERALIZABLE_ELEMENT__SUB_GENERALIZATIONS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__SUB_GENERALIZATIONS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__SUPER;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.GENERALIZABLE_ELEMENT__SUB:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.EXCHANGE_ITEM__SUB;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
