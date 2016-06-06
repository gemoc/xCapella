package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.information.Service;

@SuppressWarnings("all")
public class ServiceAdapter extends EObjectAdapter<Service> implements org.gemoc.scenario.xdsml.functionscenariomt.information.Service {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public ServiceAdapter() {
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
  public boolean isIsAbstract() {
    return adaptee.isIsAbstract();
  }
  
  @Override
  public void setIsAbstract(final boolean o) {
    adaptee.setIsAbstract(o);
  }
  
  @Override
  public boolean isIsStatic() {
    return adaptee.isIsStatic();
  }
  
  @Override
  public void setIsStatic(final boolean o) {
    adaptee.setIsStatic(o);
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
  public org.gemoc.scenario.xdsml.functionscenariomt.information.SynchronismKind getSynchronismKind() {
    return org.gemoc.scenario.xdsml.functionscenariomt.information.SynchronismKind.get(adaptee.getSynchronismKind().getValue());
  }
  
  @Override
  public void setSynchronismKind(final org.gemoc.scenario.xdsml.functionscenariomt.information.SynchronismKind o) {
    adaptee.setSynchronismKind(org.polarsys.capella.core.data.information.SynchronismKind.get(o.getValue()));
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
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractTypedElement> */Object abstractTypedElements_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractTypedElement> */Object getAbstractTypedElements() {
    if (abstractTypedElements_ == null)
    	abstractTypedElements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAbstractTypedElements(), adaptersFactory, eResource);
    return abstractTypedElements_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.SequenceMessage> */Object invokingSequenceMessages_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.SequenceMessage> */Object getInvokingSequenceMessages() {
    if (invokingSequenceMessages_ == null)
    	invokingSequenceMessages_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInvokingSequenceMessages(), adaptersFactory, eResource);
    return invokingSequenceMessages_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.Parameter> */Object ownedParameters_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.Parameter> */Object getOwnedParameters() {
    if (ownedParameters_ == null)
    	ownedParameters_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedParameters(), adaptersFactory, eResource);
    return ownedParameters_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.Operation> */Object allocatingOperations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.Operation> */Object getAllocatingOperations() {
    if (allocatingOperations_ == null)
    	allocatingOperations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAllocatingOperations(), adaptersFactory, eResource);
    return allocatingOperations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.Operation> */Object allocatedOperations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.Operation> */Object getAllocatedOperations() {
    if (allocatedOperations_ == null)
    	allocatedOperations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAllocatedOperations(), adaptersFactory, eResource);
    return allocatedOperations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.OperationAllocation> */Object ownedOperationAllocation_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.OperationAllocation> */Object getOwnedOperationAllocation() {
    if (ownedOperationAllocation_ == null)
    	ownedOperationAllocation_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedOperationAllocation(), adaptersFactory, eResource);
    return ownedOperationAllocation_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.ExchangeItemRealization> */Object ownedExchangeItemRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.ExchangeItemRealization> */Object getOwnedExchangeItemRealizations() {
    if (ownedExchangeItemRealizations_ == null)
    	ownedExchangeItemRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedExchangeItemRealizations(), adaptersFactory, eResource);
    return ownedExchangeItemRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.ExchangeItem> */Object realizedExchangeItems_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.ExchangeItem> */Object getRealizedExchangeItems() {
    if (realizedExchangeItems_ == null)
    	realizedExchangeItems_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizedExchangeItems(), adaptersFactory, eResource);
    return realizedExchangeItems_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.Exception> */Object thrownExceptions_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.Exception> */Object getThrownExceptions() {
    if (thrownExceptions_ == null)
    	thrownExceptions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getThrownExceptions(), adaptersFactory, eResource);
    return thrownExceptions_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.Message> */Object messages_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.Message> */Object getMessages() {
    if (messages_ == null)
    	messages_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getMessages(), adaptersFactory, eResource);
    return messages_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.MessageReference> */Object messageReferences_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.MessageReference> */Object getMessageReferences() {
    if (messageReferences_ == null)
    	messageReferences_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getMessageReferences(), adaptersFactory, eResource);
    return messageReferences_;
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
  
  protected final static boolean IS_ABSTRACT_EDEFAULT = false;
  
  protected final static boolean IS_STATIC_EDEFAULT = false;
  
  protected final static org.gemoc.scenario.xdsml.functionscenariomt.capellacore.VisibilityKind VISIBILITY_EDEFAULT = org.gemoc.scenario.xdsml.functionscenariomt.capellacore.VisibilityKind.UNSET;
  
  protected final static org.gemoc.scenario.xdsml.functionscenariomt.information.SynchronismKind SYNCHRONISM_KIND_EDEFAULT = org.gemoc.scenario.xdsml.functionscenariomt.information.SynchronismKind.UNSET;
  
  @Override
  public EClass eClass() {
    return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.eINSTANCE.getService();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__NAME:
    		return getName();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__INCOMING_TRACES:
    		return getIncomingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__OUTGOING_TRACES:
    		return getOutgoingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__VISIBLE_IN_DOC:
    		return isVisibleInDoc() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__VISIBLE_IN_LM:
    		return isVisibleInLM() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__SUMMARY:
    		return getSummary();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__DESCRIPTION:
    		return getDescription();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__REVIEW:
    		return getReview();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__STATUS:
    		return getStatus();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__FEATURES:
    		return getFeatures();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__IS_ABSTRACT:
    		return isIsAbstract() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__IS_STATIC:
    		return isIsStatic() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__VISIBILITY:
    		return getVisibility();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__ABSTRACT_TYPED_ELEMENTS:
    		return getAbstractTypedElements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__INVOKING_SEQUENCE_MESSAGES:
    		return getInvokingSequenceMessages();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__OWNED_PARAMETERS:
    		return getOwnedParameters();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__ALLOCATING_OPERATIONS:
    		return getAllocatingOperations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__ALLOCATED_OPERATIONS:
    		return getAllocatedOperations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__OWNED_OPERATION_ALLOCATION:
    		return getOwnedOperationAllocation();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__OWNED_EXCHANGE_ITEM_REALIZATIONS:
    		return getOwnedExchangeItemRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__REALIZED_EXCHANGE_ITEMS:
    		return getRealizedExchangeItems();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__SYNCHRONISM_KIND:
    		return getSynchronismKind();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__THROWN_EXCEPTIONS:
    		return getThrownExceptions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__MESSAGES:
    		return getMessages();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__MESSAGE_REFERENCES:
    		return getMessageReferences();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__INCOMING_TRACES:
    		return getIncomingTraces() != null && !getIncomingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__OUTGOING_TRACES:
    		return getOutgoingTraces() != null && !getOutgoingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__VISIBLE_IN_DOC:
    		return isVisibleInDoc() != VISIBLE_IN_DOC_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__VISIBLE_IN_LM:
    		return isVisibleInLM() != VISIBLE_IN_LM_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__SUMMARY:
    		return getSummary() != SUMMARY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__REVIEW:
    		return getReview() != REVIEW_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues() != null && !getOwnedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes() != null && !getOwnedEnumerationPropertyTypes().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues() != null && !getAppliedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups() != null && !getOwnedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups() != null && !getAppliedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__STATUS:
    		return getStatus() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__FEATURES:
    		return getFeatures() != null && !getFeatures().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements() != null && !getAppliedRequirements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__IS_ABSTRACT:
    		return isIsAbstract() != IS_ABSTRACT_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__IS_STATIC:
    		return isIsStatic() != IS_STATIC_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__VISIBILITY:
    		return getVisibility() != VISIBILITY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__ABSTRACT_TYPED_ELEMENTS:
    		return getAbstractTypedElements() != null && !getAbstractTypedElements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__INVOKING_SEQUENCE_MESSAGES:
    		return getInvokingSequenceMessages() != null && !getInvokingSequenceMessages().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__OWNED_PARAMETERS:
    		return getOwnedParameters() != null && !getOwnedParameters().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__ALLOCATING_OPERATIONS:
    		return getAllocatingOperations() != null && !getAllocatingOperations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__ALLOCATED_OPERATIONS:
    		return getAllocatedOperations() != null && !getAllocatedOperations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__OWNED_OPERATION_ALLOCATION:
    		return getOwnedOperationAllocation() != null && !getOwnedOperationAllocation().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__OWNED_EXCHANGE_ITEM_REALIZATIONS:
    		return getOwnedExchangeItemRealizations() != null && !getOwnedExchangeItemRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__REALIZED_EXCHANGE_ITEMS:
    		return getRealizedExchangeItems() != null && !getRealizedExchangeItems().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__SYNCHRONISM_KIND:
    		return getSynchronismKind() != SYNCHRONISM_KIND_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__THROWN_EXCEPTIONS:
    		return getThrownExceptions() != null && !getThrownExceptions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__MESSAGES:
    		return getMessages() != null && !getMessages().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__MESSAGE_REFERENCES:
    		return getMessageReferences() != null && !getMessageReferences().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__VISIBLE_IN_DOC:
    		setVisibleInDoc(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__VISIBLE_IN_LM:
    		setVisibleInLM(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__SUMMARY:
    		setSummary(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__REVIEW:
    		setReview(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__OWNED_PROPERTY_VALUES:
    		getOwnedPropertyValues().clear();
    		getOwnedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__OWNED_ENUMERATION_PROPERTY_TYPES:
    		getOwnedEnumerationPropertyTypes().clear();
    		getOwnedEnumerationPropertyTypes().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__APPLIED_PROPERTY_VALUES:
    		getAppliedPropertyValues().clear();
    		getAppliedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__OWNED_PROPERTY_VALUE_GROUPS:
    		getOwnedPropertyValueGroups().clear();
    		getOwnedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__APPLIED_PROPERTY_VALUE_GROUPS:
    		getAppliedPropertyValueGroups().clear();
    		getAppliedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__STATUS:
    		setStatus(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__FEATURES:
    		getFeatures().clear();
    		getFeatures().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__IS_ABSTRACT:
    		setIsAbstract(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__IS_STATIC:
    		setIsStatic(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__VISIBILITY:
    		setVisibility(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.VisibilityKind)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__OWNED_PARAMETERS:
    		getOwnedParameters().clear();
    		getOwnedParameters().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__OWNED_OPERATION_ALLOCATION:
    		getOwnedOperationAllocation().clear();
    		getOwnedOperationAllocation().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__OWNED_EXCHANGE_ITEM_REALIZATIONS:
    		getOwnedExchangeItemRealizations().clear();
    		getOwnedExchangeItemRealizations().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__SYNCHRONISM_KIND:
    		setSynchronismKind(
    		(org.gemoc.scenario.xdsml.functionscenariomt.information.SynchronismKind)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__THROWN_EXCEPTIONS:
    		getThrownExceptions().clear();
    		getThrownExceptions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.SERVICE__MESSAGE_REFERENCES:
    		getMessageReferences().clear();
    		getMessageReferences().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
