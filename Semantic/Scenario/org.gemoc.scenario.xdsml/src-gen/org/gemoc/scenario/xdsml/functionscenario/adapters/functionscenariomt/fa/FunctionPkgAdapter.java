package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.fa.FunctionPkg;

@SuppressWarnings("all")
public class FunctionPkgAdapter extends EObjectAdapter<FunctionPkg> implements org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionPkg {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public FunctionPkgAdapter() {
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
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ExchangeLink> */Object ownedFunctionalLinks_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ExchangeLink> */Object getOwnedFunctionalLinks() {
    if (ownedFunctionalLinks_ == null)
    	ownedFunctionalLinks_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedFunctionalLinks(), adaptersFactory, eResource);
    return ownedFunctionalLinks_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalExchangeSpecification> */Object ownedExchanges_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalExchangeSpecification> */Object getOwnedExchanges() {
    if (ownedExchanges_ == null)
    	ownedExchanges_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedExchanges(), adaptersFactory, eResource);
    return ownedExchanges_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ExchangeSpecificationRealization> */Object ownedExchangeSpecificationRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ExchangeSpecificationRealization> */Object getOwnedExchangeSpecificationRealizations() {
    if (ownedExchangeSpecificationRealizations_ == null)
    	ownedExchangeSpecificationRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedExchangeSpecificationRealizations(), adaptersFactory, eResource);
    return ownedExchangeSpecificationRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ExchangeCategory> */Object ownedCategories_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ExchangeCategory> */Object getOwnedCategories() {
    if (ownedCategories_ == null)
    	ownedCategories_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedCategories(), adaptersFactory, eResource);
    return ownedCategories_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionSpecification> */Object ownedFunctionSpecifications_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionSpecification> */Object getOwnedFunctionSpecifications() {
    if (ownedFunctionSpecifications_ == null)
    	ownedFunctionSpecifications_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedFunctionSpecifications(), adaptersFactory, eResource);
    return ownedFunctionSpecifications_;
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
    return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.eINSTANCE.getFunctionPkg();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__NAME:
    		return getName();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__INCOMING_TRACES:
    		return getIncomingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OUTGOING_TRACES:
    		return getOutgoingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__VISIBLE_IN_DOC:
    		return isVisibleInDoc() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__VISIBLE_IN_LM:
    		return isVisibleInLM() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__SUMMARY:
    		return getSummary();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__DESCRIPTION:
    		return getDescription();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__REVIEW:
    		return getReview();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__STATUS:
    		return getStatus();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__FEATURES:
    		return getFeatures();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_TRACES:
    		return getOwnedTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__CONTAINED_GENERIC_TRACES:
    		return getContainedGenericTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__CONTAINED_REQUIREMENTS_TRACES:
    		return getContainedRequirementsTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__NAMING_RULES:
    		return getNamingRules();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_PROPERTY_VALUE_PKGS:
    		return getOwnedPropertyValuePkgs();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_FUNCTIONAL_LINKS:
    		return getOwnedFunctionalLinks();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_EXCHANGES:
    		return getOwnedExchanges();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_EXCHANGE_SPECIFICATION_REALIZATIONS:
    		return getOwnedExchangeSpecificationRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_CATEGORIES:
    		return getOwnedCategories();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_FUNCTION_SPECIFICATIONS:
    		return getOwnedFunctionSpecifications();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__INCOMING_TRACES:
    		return getIncomingTraces() != null && !getIncomingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OUTGOING_TRACES:
    		return getOutgoingTraces() != null && !getOutgoingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__VISIBLE_IN_DOC:
    		return isVisibleInDoc() != VISIBLE_IN_DOC_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__VISIBLE_IN_LM:
    		return isVisibleInLM() != VISIBLE_IN_LM_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__SUMMARY:
    		return getSummary() != SUMMARY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__REVIEW:
    		return getReview() != REVIEW_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues() != null && !getOwnedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes() != null && !getOwnedEnumerationPropertyTypes().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues() != null && !getAppliedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups() != null && !getOwnedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups() != null && !getAppliedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__STATUS:
    		return getStatus() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__FEATURES:
    		return getFeatures() != null && !getFeatures().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements() != null && !getAppliedRequirements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_TRACES:
    		return getOwnedTraces() != null && !getOwnedTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__CONTAINED_GENERIC_TRACES:
    		return getContainedGenericTraces() != null && !getContainedGenericTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__CONTAINED_REQUIREMENTS_TRACES:
    		return getContainedRequirementsTraces() != null && !getContainedRequirementsTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__NAMING_RULES:
    		return getNamingRules() != null && !getNamingRules().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_PROPERTY_VALUE_PKGS:
    		return getOwnedPropertyValuePkgs() != null && !getOwnedPropertyValuePkgs().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_FUNCTIONAL_LINKS:
    		return getOwnedFunctionalLinks() != null && !getOwnedFunctionalLinks().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_EXCHANGES:
    		return getOwnedExchanges() != null && !getOwnedExchanges().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_EXCHANGE_SPECIFICATION_REALIZATIONS:
    		return getOwnedExchangeSpecificationRealizations() != null && !getOwnedExchangeSpecificationRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_CATEGORIES:
    		return getOwnedCategories() != null && !getOwnedCategories().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_FUNCTION_SPECIFICATIONS:
    		return getOwnedFunctionSpecifications() != null && !getOwnedFunctionSpecifications().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__VISIBLE_IN_DOC:
    		setVisibleInDoc(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__VISIBLE_IN_LM:
    		setVisibleInLM(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__SUMMARY:
    		setSummary(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__REVIEW:
    		setReview(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_PROPERTY_VALUES:
    		getOwnedPropertyValues().clear();
    		getOwnedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_ENUMERATION_PROPERTY_TYPES:
    		getOwnedEnumerationPropertyTypes().clear();
    		getOwnedEnumerationPropertyTypes().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__APPLIED_PROPERTY_VALUES:
    		getAppliedPropertyValues().clear();
    		getAppliedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_PROPERTY_VALUE_GROUPS:
    		getOwnedPropertyValueGroups().clear();
    		getOwnedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__APPLIED_PROPERTY_VALUE_GROUPS:
    		getAppliedPropertyValueGroups().clear();
    		getAppliedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__STATUS:
    		setStatus(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__FEATURES:
    		getFeatures().clear();
    		getFeatures().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_TRACES:
    		getOwnedTraces().clear();
    		getOwnedTraces().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__NAMING_RULES:
    		getNamingRules().clear();
    		getNamingRules().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_PROPERTY_VALUE_PKGS:
    		getOwnedPropertyValuePkgs().clear();
    		getOwnedPropertyValuePkgs().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_FUNCTIONAL_LINKS:
    		getOwnedFunctionalLinks().clear();
    		getOwnedFunctionalLinks().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_EXCHANGES:
    		getOwnedExchanges().clear();
    		getOwnedExchanges().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_EXCHANGE_SPECIFICATION_REALIZATIONS:
    		getOwnedExchangeSpecificationRealizations().clear();
    		getOwnedExchangeSpecificationRealizations().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_CATEGORIES:
    		getOwnedCategories().clear();
    		getOwnedCategories().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_PKG__OWNED_FUNCTION_SPECIFICATIONS:
    		getOwnedFunctionSpecifications().clear();
    		getOwnedFunctionSpecifications().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
