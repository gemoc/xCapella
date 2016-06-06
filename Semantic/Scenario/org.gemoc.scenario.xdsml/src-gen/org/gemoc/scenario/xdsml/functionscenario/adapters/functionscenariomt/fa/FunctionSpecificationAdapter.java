package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.fa.FunctionSpecification;

@SuppressWarnings("all")
public class FunctionSpecificationAdapter extends EObjectAdapter<FunctionSpecification> implements org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionSpecification {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public FunctionSpecificationAdapter() {
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
  public boolean isIsReadOnly() {
    return adaptee.isIsReadOnly();
  }
  
  @Override
  public void setIsReadOnly(final boolean o) {
    adaptee.setIsReadOnly(o);
  }
  
  @Override
  public boolean isIsSingleExecution() {
    return adaptee.isIsSingleExecution();
  }
  
  @Override
  public void setIsSingleExecution(final boolean o) {
    adaptee.setIsSingleExecution(o);
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
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityNode> */Object ownedNodes_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityNode> */Object getOwnedNodes() {
    if (ownedNodes_ == null)
    	ownedNodes_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedNodes(), adaptersFactory, eResource);
    return ownedNodes_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityEdge> */Object ownedEdges_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityEdge> */Object getOwnedEdges() {
    if (ownedEdges_ == null)
    	ownedEdges_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedEdges(), adaptersFactory, eResource);
    return ownedEdges_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityGroup> */Object ownedGroups_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityGroup> */Object getOwnedGroups() {
    if (ownedGroups_ == null)
    	ownedGroups_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedGroups(), adaptersFactory, eResource);
    return ownedGroups_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.StructuredActivityNode> */Object ownedStructuredNodes_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.StructuredActivityNode> */Object getOwnedStructuredNodes() {
    if (ownedStructuredNodes_ == null)
    	ownedStructuredNodes_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedStructuredNodes(), adaptersFactory, eResource);
    return ownedStructuredNodes_;
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
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionPort> */Object ownedFunctionPorts_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionPort> */Object getOwnedFunctionPorts() {
    if (ownedFunctionPorts_ == null)
    	ownedFunctionPorts_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedFunctionPorts(), adaptersFactory, eResource);
    return ownedFunctionPorts_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionSpecification> */Object subFunctionSpecifications_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionSpecification> */Object getSubFunctionSpecifications() {
    if (subFunctionSpecifications_ == null)
    	subFunctionSpecifications_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSubFunctionSpecifications(), adaptersFactory, eResource);
    return subFunctionSpecifications_;
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
  
  protected final static boolean IS_READ_ONLY_EDEFAULT = false;
  
  protected final static boolean IS_SINGLE_EXECUTION_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.eINSTANCE.getFunctionSpecification();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__NAME:
    		return getName();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__INCOMING_TRACES:
    		return getIncomingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OUTGOING_TRACES:
    		return getOutgoingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__VISIBLE_IN_DOC:
    		return isVisibleInDoc() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__VISIBLE_IN_LM:
    		return isVisibleInLM() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__SUMMARY:
    		return getSummary();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__DESCRIPTION:
    		return getDescription();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__REVIEW:
    		return getReview();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__STATUS:
    		return getStatus();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__FEATURES:
    		return getFeatures();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_TRACES:
    		return getOwnedTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__CONTAINED_GENERIC_TRACES:
    		return getContainedGenericTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__CONTAINED_REQUIREMENTS_TRACES:
    		return getContainedRequirementsTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__NAMING_RULES:
    		return getNamingRules();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__IS_CONTROL_OPERATOR:
    		return isIsControlOperator() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_PARAMETER_SET:
    		return getOwnedParameterSet();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_PARAMETER:
    		return getOwnedParameter();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__IS_READ_ONLY:
    		return isIsReadOnly() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__IS_SINGLE_EXECUTION:
    		return isIsSingleExecution() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_NODES:
    		return getOwnedNodes();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_EDGES:
    		return getOwnedEdges();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_GROUPS:
    		return getOwnedGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_STRUCTURED_NODES:
    		return getOwnedStructuredNodes();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__IN_EXCHANGE_LINKS:
    		return getInExchangeLinks();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OUT_EXCHANGE_LINKS:
    		return getOutExchangeLinks();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_FUNCTION_PORTS:
    		return getOwnedFunctionPorts();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__SUB_FUNCTION_SPECIFICATIONS:
    		return getSubFunctionSpecifications();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__INCOMING_TRACES:
    		return getIncomingTraces() != null && !getIncomingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OUTGOING_TRACES:
    		return getOutgoingTraces() != null && !getOutgoingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__VISIBLE_IN_DOC:
    		return isVisibleInDoc() != VISIBLE_IN_DOC_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__VISIBLE_IN_LM:
    		return isVisibleInLM() != VISIBLE_IN_LM_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__SUMMARY:
    		return getSummary() != SUMMARY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__REVIEW:
    		return getReview() != REVIEW_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues() != null && !getOwnedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes() != null && !getOwnedEnumerationPropertyTypes().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues() != null && !getAppliedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups() != null && !getOwnedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups() != null && !getAppliedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__STATUS:
    		return getStatus() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__FEATURES:
    		return getFeatures() != null && !getFeatures().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements() != null && !getAppliedRequirements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_TRACES:
    		return getOwnedTraces() != null && !getOwnedTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__CONTAINED_GENERIC_TRACES:
    		return getContainedGenericTraces() != null && !getContainedGenericTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__CONTAINED_REQUIREMENTS_TRACES:
    		return getContainedRequirementsTraces() != null && !getContainedRequirementsTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__NAMING_RULES:
    		return getNamingRules() != null && !getNamingRules().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__IS_CONTROL_OPERATOR:
    		return isIsControlOperator() != IS_CONTROL_OPERATOR_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_PARAMETER_SET:
    		return getOwnedParameterSet() != null && !getOwnedParameterSet().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_PARAMETER:
    		return getOwnedParameter() != null && !getOwnedParameter().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__IS_READ_ONLY:
    		return isIsReadOnly() != IS_READ_ONLY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__IS_SINGLE_EXECUTION:
    		return isIsSingleExecution() != IS_SINGLE_EXECUTION_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_NODES:
    		return getOwnedNodes() != null && !getOwnedNodes().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_EDGES:
    		return getOwnedEdges() != null && !getOwnedEdges().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_GROUPS:
    		return getOwnedGroups() != null && !getOwnedGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_STRUCTURED_NODES:
    		return getOwnedStructuredNodes() != null && !getOwnedStructuredNodes().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__IN_EXCHANGE_LINKS:
    		return getInExchangeLinks() != null && !getInExchangeLinks().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OUT_EXCHANGE_LINKS:
    		return getOutExchangeLinks() != null && !getOutExchangeLinks().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_FUNCTION_PORTS:
    		return getOwnedFunctionPorts() != null && !getOwnedFunctionPorts().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__SUB_FUNCTION_SPECIFICATIONS:
    		return getSubFunctionSpecifications() != null && !getSubFunctionSpecifications().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__VISIBLE_IN_DOC:
    		setVisibleInDoc(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__VISIBLE_IN_LM:
    		setVisibleInLM(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__SUMMARY:
    		setSummary(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__REVIEW:
    		setReview(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_PROPERTY_VALUES:
    		getOwnedPropertyValues().clear();
    		getOwnedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_ENUMERATION_PROPERTY_TYPES:
    		getOwnedEnumerationPropertyTypes().clear();
    		getOwnedEnumerationPropertyTypes().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__APPLIED_PROPERTY_VALUES:
    		getAppliedPropertyValues().clear();
    		getAppliedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_PROPERTY_VALUE_GROUPS:
    		getOwnedPropertyValueGroups().clear();
    		getOwnedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__APPLIED_PROPERTY_VALUE_GROUPS:
    		getAppliedPropertyValueGroups().clear();
    		getAppliedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__STATUS:
    		setStatus(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__FEATURES:
    		getFeatures().clear();
    		getFeatures().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_TRACES:
    		getOwnedTraces().clear();
    		getOwnedTraces().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__NAMING_RULES:
    		getNamingRules().clear();
    		getNamingRules().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__IS_CONTROL_OPERATOR:
    		setIsControlOperator(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_PARAMETER_SET:
    		getOwnedParameterSet().clear();
    		getOwnedParameterSet().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_PARAMETER:
    		getOwnedParameter().clear();
    		getOwnedParameter().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__IS_READ_ONLY:
    		setIsReadOnly(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__IS_SINGLE_EXECUTION:
    		setIsSingleExecution(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_NODES:
    		getOwnedNodes().clear();
    		getOwnedNodes().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_EDGES:
    		getOwnedEdges().clear();
    		getOwnedEdges().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_GROUPS:
    		getOwnedGroups().clear();
    		getOwnedGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__IN_EXCHANGE_LINKS:
    		getInExchangeLinks().clear();
    		getInExchangeLinks().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OUT_EXCHANGE_LINKS:
    		getOutExchangeLinks().clear();
    		getOutExchangeLinks().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_FUNCTION_PORTS:
    		getOwnedFunctionPorts().clear();
    		getOwnedFunctionPorts().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractBehavior.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__IS_CONTROL_OPERATOR:
    			return org.gemoc.scenario.xdsml.functionscenariomt.behavior.BehaviorPackage.ABSTRACT_BEHAVIOR__IS_CONTROL_OPERATOR;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_PARAMETER_SET:
    			return org.gemoc.scenario.xdsml.functionscenariomt.behavior.BehaviorPackage.ABSTRACT_BEHAVIOR__OWNED_PARAMETER_SET;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_PARAMETER:
    			return org.gemoc.scenario.xdsml.functionscenariomt.behavior.BehaviorPackage.ABSTRACT_BEHAVIOR__OWNED_PARAMETER;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.activity.AbstractActivity.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__IS_READ_ONLY:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__IS_READ_ONLY;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__IS_SINGLE_EXECUTION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__IS_SINGLE_EXECUTION;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_NODES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_NODES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_EDGES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_EDGES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_GROUPS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_GROUPS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_STRUCTURED_NODES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_STRUCTURED_NODES;
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
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__IS_CONTROL_OPERATOR;
    		case org.gemoc.scenario.xdsml.functionscenariomt.behavior.BehaviorPackage.ABSTRACT_BEHAVIOR__OWNED_PARAMETER_SET:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_PARAMETER_SET;
    		case org.gemoc.scenario.xdsml.functionscenariomt.behavior.BehaviorPackage.ABSTRACT_BEHAVIOR__OWNED_PARAMETER:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_PARAMETER;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.activity.AbstractActivity.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__IS_READ_ONLY:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__IS_READ_ONLY;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__IS_SINGLE_EXECUTION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__IS_SINGLE_EXECUTION;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_NODES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_NODES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_EDGES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_EDGES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_GROUPS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_GROUPS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_STRUCTURED_NODES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_SPECIFICATION__OWNED_STRUCTURED_NODES;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
