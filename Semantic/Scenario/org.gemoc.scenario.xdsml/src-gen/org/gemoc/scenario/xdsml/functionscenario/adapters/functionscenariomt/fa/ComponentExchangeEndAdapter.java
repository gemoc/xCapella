package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.fa.ComponentExchangeEnd;

@SuppressWarnings("all")
public class ComponentExchangeEndAdapter extends EObjectAdapter<ComponentExchangeEnd> implements org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeEnd {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public ComponentExchangeEndAdapter() {
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
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractInformationFlow> */Object incomingInformationFlows_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractInformationFlow> */Object getIncomingInformationFlows() {
    if (incomingInformationFlows_ == null)
    	incomingInformationFlows_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingInformationFlows(), adaptersFactory, eResource);
    return incomingInformationFlows_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractInformationFlow> */Object outgoingInformationFlows_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractInformationFlow> */Object getOutgoingInformationFlows() {
    if (outgoingInformationFlows_ == null)
    	outgoingInformationFlows_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingInformationFlows(), adaptersFactory, eResource);
    return outgoingInformationFlows_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractInformationFlow> */Object informationFlows_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractInformationFlow> */Object getInformationFlows() {
    if (informationFlows_ == null)
    	informationFlows_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInformationFlows(), adaptersFactory, eResource);
    return informationFlows_;
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
  public org.gemoc.scenario.xdsml.functionscenariomt.information.Port getPort() {
    return () adaptersFactory.createAdapter(adaptee.getPort(), eResource);
  }
  
  @Override
  public void setPort(final org.gemoc.scenario.xdsml.functionscenariomt.information.Port o) {
    if (o != null)
    	adaptee.setPort(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.PortAdapter) o).getAdaptee());
    else adaptee.setPort(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.Partition getPart() {
    return () adaptersFactory.createAdapter(adaptee.getPart(), eResource);
  }
  
  @Override
  public void setPart(final org.gemoc.scenario.xdsml.functionscenariomt.information.Partition o) {
    if (o != null)
    	adaptee.setPart(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.PartitionAdapter) o).getAdaptee());
    else adaptee.setPart(null);
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
  
  protected final static boolean VISIBLE_IN_DOC_EDEFAULT = true;
  
  protected final static boolean VISIBLE_IN_LM_EDEFAULT = true;
  
  protected final static String SUMMARY_EDEFAULT = null;
  
  protected final static String DESCRIPTION_EDEFAULT = null;
  
  protected final static String REVIEW_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.eINSTANCE.getComponentExchangeEnd();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__INCOMING_INFORMATION_FLOWS:
    		return getIncomingInformationFlows();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__OUTGOING_INFORMATION_FLOWS:
    		return getOutgoingInformationFlows();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__INFORMATION_FLOWS:
    		return getInformationFlows();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__INCOMING_TRACES:
    		return getIncomingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__OUTGOING_TRACES:
    		return getOutgoingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__VISIBLE_IN_DOC:
    		return isVisibleInDoc() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__VISIBLE_IN_LM:
    		return isVisibleInLM() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__SUMMARY:
    		return getSummary();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__DESCRIPTION:
    		return getDescription();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__REVIEW:
    		return getReview();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__STATUS:
    		return getStatus();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__FEATURES:
    		return getFeatures();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__PORT:
    		return getPort();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__PART:
    		return getPart();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__INCOMING_INFORMATION_FLOWS:
    		return getIncomingInformationFlows() != null && !getIncomingInformationFlows().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__OUTGOING_INFORMATION_FLOWS:
    		return getOutgoingInformationFlows() != null && !getOutgoingInformationFlows().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__INFORMATION_FLOWS:
    		return getInformationFlows() != null && !getInformationFlows().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__INCOMING_TRACES:
    		return getIncomingTraces() != null && !getIncomingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__OUTGOING_TRACES:
    		return getOutgoingTraces() != null && !getOutgoingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__VISIBLE_IN_DOC:
    		return isVisibleInDoc() != VISIBLE_IN_DOC_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__VISIBLE_IN_LM:
    		return isVisibleInLM() != VISIBLE_IN_LM_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__SUMMARY:
    		return getSummary() != SUMMARY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__REVIEW:
    		return getReview() != REVIEW_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues() != null && !getOwnedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes() != null && !getOwnedEnumerationPropertyTypes().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues() != null && !getAppliedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups() != null && !getOwnedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups() != null && !getAppliedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__STATUS:
    		return getStatus() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__FEATURES:
    		return getFeatures() != null && !getFeatures().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements() != null && !getAppliedRequirements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__PORT:
    		return getPort() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__PART:
    		return getPart() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__VISIBLE_IN_DOC:
    		setVisibleInDoc(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__VISIBLE_IN_LM:
    		setVisibleInLM(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__SUMMARY:
    		setSummary(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__REVIEW:
    		setReview(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__OWNED_PROPERTY_VALUES:
    		getOwnedPropertyValues().clear();
    		getOwnedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__OWNED_ENUMERATION_PROPERTY_TYPES:
    		getOwnedEnumerationPropertyTypes().clear();
    		getOwnedEnumerationPropertyTypes().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__APPLIED_PROPERTY_VALUES:
    		getAppliedPropertyValues().clear();
    		getAppliedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__OWNED_PROPERTY_VALUE_GROUPS:
    		getOwnedPropertyValueGroups().clear();
    		getOwnedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__APPLIED_PROPERTY_VALUE_GROUPS:
    		getAppliedPropertyValueGroups().clear();
    		getAppliedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__STATUS:
    		setStatus(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__FEATURES:
    		getFeatures().clear();
    		getFeatures().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__PORT:
    		setPort(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.Port)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__PART:
    		setPart(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.Partition)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.TraceableElement.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__INCOMING_TRACES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.TRACEABLE_ELEMENT__INCOMING_TRACES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__OUTGOING_TRACES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.TRACEABLE_ELEMENT__OUTGOING_TRACES;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.PublishableElement.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__VISIBLE_IN_DOC:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_DOC;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__VISIBLE_IN_LM:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_LM;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellaElement.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__SUMMARY:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__SUMMARY;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__DESCRIPTION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__DESCRIPTION;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__REVIEW:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__REVIEW;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__OWNED_PROPERTY_VALUES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__OWNED_ENUMERATION_PROPERTY_TYPES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__APPLIED_PROPERTY_VALUES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__OWNED_PROPERTY_VALUE_GROUPS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__APPLIED_PROPERTY_VALUE_GROUPS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__STATUS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__STATUS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__FEATURES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__FEATURES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__APPLIED_REQUIREMENTS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__APPLIED_REQUIREMENTS;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.TraceableElement.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.TRACEABLE_ELEMENT__INCOMING_TRACES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__INCOMING_TRACES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.TRACEABLE_ELEMENT__OUTGOING_TRACES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__OUTGOING_TRACES;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.PublishableElement.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_DOC:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__VISIBLE_IN_DOC;
    		case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_LM:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__VISIBLE_IN_LM;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellaElement.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__SUMMARY:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__SUMMARY;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__DESCRIPTION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__DESCRIPTION;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__REVIEW:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__REVIEW;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__OWNED_PROPERTY_VALUES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__OWNED_ENUMERATION_PROPERTY_TYPES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__APPLIED_PROPERTY_VALUES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__OWNED_PROPERTY_VALUE_GROUPS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__APPLIED_PROPERTY_VALUE_GROUPS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__STATUS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__STATUS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__FEATURES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__FEATURES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__APPLIED_REQUIREMENTS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE_END__APPLIED_REQUIREMENTS;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
