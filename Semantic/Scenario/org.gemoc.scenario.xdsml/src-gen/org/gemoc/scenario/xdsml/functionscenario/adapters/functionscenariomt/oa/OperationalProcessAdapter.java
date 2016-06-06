package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.oa.OperationalProcess;

@SuppressWarnings("all")
public class OperationalProcessAdapter extends EObjectAdapter<OperationalProcess> implements org.gemoc.scenario.xdsml.functionscenariomt.oa.OperationalProcess {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public OperationalProcessAdapter() {
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
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChainKind getKind() {
    return org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChainKind.get(adaptee.getKind().getValue());
  }
  
  @Override
  public void setKind(final org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChainKind o) {
    adaptee.setKind(org.polarsys.capella.core.data.fa.FunctionalChainKind.get(o.getValue()));
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
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Involvement> */Object involvedInvolvements_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Involvement> */Object getInvolvedInvolvements() {
    if (involvedInvolvements_ == null)
    	involvedInvolvements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInvolvedInvolvements(), adaptersFactory, eResource);
    return involvedInvolvements_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Involvement> */Object involvingInvolvements_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Involvement> */Object getInvolvingInvolvements() {
    if (involvingInvolvements_ == null)
    	involvingInvolvements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInvolvingInvolvements(), adaptersFactory, eResource);
    return involvingInvolvements_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChainInvolvement> */Object ownedFunctionalChainInvolvements_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChainInvolvement> */Object getOwnedFunctionalChainInvolvements() {
    if (ownedFunctionalChainInvolvements_ == null)
    	ownedFunctionalChainInvolvements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedFunctionalChainInvolvements(), adaptersFactory, eResource);
    return ownedFunctionalChainInvolvements_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChainRealization> */Object ownedFunctionalChainRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChainRealization> */Object getOwnedFunctionalChainRealizations() {
    if (ownedFunctionalChainRealizations_ == null)
    	ownedFunctionalChainRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedFunctionalChainRealizations(), adaptersFactory, eResource);
    return ownedFunctionalChainRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChainInvolvement> */Object involvedFunctionalChainInvolvements_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChainInvolvement> */Object getInvolvedFunctionalChainInvolvements() {
    if (involvedFunctionalChainInvolvements_ == null)
    	involvedFunctionalChainInvolvements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInvolvedFunctionalChainInvolvements(), adaptersFactory, eResource);
    return involvedFunctionalChainInvolvements_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.AbstractFunction> */Object involvedFunctions_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.AbstractFunction> */Object getInvolvedFunctions() {
    if (involvedFunctions_ == null)
    	involvedFunctions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInvolvedFunctions(), adaptersFactory, eResource);
    return involvedFunctions_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalExchange> */Object involvedFunctionalExchanges_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalExchange> */Object getInvolvedFunctionalExchanges() {
    if (involvedFunctionalExchanges_ == null)
    	involvedFunctionalExchanges_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInvolvedFunctionalExchanges(), adaptersFactory, eResource);
    return involvedFunctionalExchanges_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.InvolvedElement> */Object involvedElements_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.InvolvedElement> */Object getInvolvedElements() {
    if (involvedElements_ == null)
    	involvedElements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInvolvedElements(), adaptersFactory, eResource);
    return involvedElements_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.AbstractFunction> */Object enactedFunctions_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.AbstractFunction> */Object getEnactedFunctions() {
    if (enactedFunctions_ == null)
    	enactedFunctions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getEnactedFunctions(), adaptersFactory, eResource);
    return enactedFunctions_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.AbstractFunctionalBlock> */Object enactedFunctionalBlocks_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.AbstractFunctionalBlock> */Object getEnactedFunctionalBlocks() {
    if (enactedFunctionalBlocks_ == null)
    	enactedFunctionalBlocks_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getEnactedFunctionalBlocks(), adaptersFactory, eResource);
    return enactedFunctionalBlocks_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.State> */Object availableInStates_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.State> */Object getAvailableInStates() {
    if (availableInStates_ == null)
    	availableInStates_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAvailableInStates(), adaptersFactory, eResource);
    return availableInStates_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChainInvolvement> */Object firstFunctionalChainInvolvements_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChainInvolvement> */Object getFirstFunctionalChainInvolvements() {
    if (firstFunctionalChainInvolvements_ == null)
    	firstFunctionalChainInvolvements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getFirstFunctionalChainInvolvements(), adaptersFactory, eResource);
    return firstFunctionalChainInvolvements_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.ctx.Capability> */Object involvingCapabilities_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.ctx.Capability> */Object getInvolvingCapabilities() {
    if (involvingCapabilities_ == null)
    	involvingCapabilities_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInvolvingCapabilities(), adaptersFactory, eResource);
    return involvingCapabilities_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.la.CapabilityRealization> */Object involvingCapabilityRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.la.CapabilityRealization> */Object getInvolvingCapabilityRealizations() {
    if (involvingCapabilityRealizations_ == null)
    	involvingCapabilityRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInvolvingCapabilityRealizations(), adaptersFactory, eResource);
    return involvingCapabilityRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChain> */Object realizedFunctionalChains_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChain> */Object getRealizedFunctionalChains() {
    if (realizedFunctionalChains_ == null)
    	realizedFunctionalChains_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizedFunctionalChains(), adaptersFactory, eResource);
    return realizedFunctionalChains_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChain> */Object realizingFunctionalChains_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChain> */Object getRealizingFunctionalChains() {
    if (realizingFunctionalChains_ == null)
    	realizingFunctionalChains_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizingFunctionalChains(), adaptersFactory, eResource);
    return realizingFunctionalChains_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.oa.OperationalCapability> */Object involvingOperationalCapabilities_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.oa.OperationalCapability> */Object getInvolvingOperationalCapabilities() {
    if (involvingOperationalCapabilities_ == null)
    	involvingOperationalCapabilities_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInvolvingOperationalCapabilities(), adaptersFactory, eResource);
    return involvingOperationalCapabilities_;
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
  
  protected final static org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChainKind KIND_EDEFAULT = org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChainKind.SIMPLE;
  
  @Override
  public EClass eClass() {
    return org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.eINSTANCE.getOperationalProcess();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__NAME:
    		return getName();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__INCOMING_TRACES:
    		return getIncomingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__OUTGOING_TRACES:
    		return getOutgoingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__VISIBLE_IN_DOC:
    		return isVisibleInDoc() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__VISIBLE_IN_LM:
    		return isVisibleInLM() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__SUMMARY:
    		return getSummary();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__DESCRIPTION:
    		return getDescription();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__REVIEW:
    		return getReview();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__STATUS:
    		return getStatus();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__FEATURES:
    		return getFeatures();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__INVOLVED_INVOLVEMENTS:
    		return getInvolvedInvolvements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__INVOLVING_INVOLVEMENTS:
    		return getInvolvingInvolvements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__KIND:
    		return getKind();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__OWNED_FUNCTIONAL_CHAIN_INVOLVEMENTS:
    		return getOwnedFunctionalChainInvolvements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__OWNED_FUNCTIONAL_CHAIN_REALIZATIONS:
    		return getOwnedFunctionalChainRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__INVOLVED_FUNCTIONAL_CHAIN_INVOLVEMENTS:
    		return getInvolvedFunctionalChainInvolvements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__INVOLVED_FUNCTIONS:
    		return getInvolvedFunctions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__INVOLVED_FUNCTIONAL_EXCHANGES:
    		return getInvolvedFunctionalExchanges();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__INVOLVED_ELEMENTS:
    		return getInvolvedElements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__ENACTED_FUNCTIONS:
    		return getEnactedFunctions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__ENACTED_FUNCTIONAL_BLOCKS:
    		return getEnactedFunctionalBlocks();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__AVAILABLE_IN_STATES:
    		return getAvailableInStates();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__FIRST_FUNCTIONAL_CHAIN_INVOLVEMENTS:
    		return getFirstFunctionalChainInvolvements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__INVOLVING_CAPABILITIES:
    		return getInvolvingCapabilities();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__INVOLVING_CAPABILITY_REALIZATIONS:
    		return getInvolvingCapabilityRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__REALIZED_FUNCTIONAL_CHAINS:
    		return getRealizedFunctionalChains();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__REALIZING_FUNCTIONAL_CHAINS:
    		return getRealizingFunctionalChains();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__INVOLVING_OPERATIONAL_CAPABILITIES:
    		return getInvolvingOperationalCapabilities();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__INCOMING_TRACES:
    		return getIncomingTraces() != null && !getIncomingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__OUTGOING_TRACES:
    		return getOutgoingTraces() != null && !getOutgoingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__VISIBLE_IN_DOC:
    		return isVisibleInDoc() != VISIBLE_IN_DOC_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__VISIBLE_IN_LM:
    		return isVisibleInLM() != VISIBLE_IN_LM_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__SUMMARY:
    		return getSummary() != SUMMARY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__REVIEW:
    		return getReview() != REVIEW_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues() != null && !getOwnedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes() != null && !getOwnedEnumerationPropertyTypes().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues() != null && !getAppliedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups() != null && !getOwnedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups() != null && !getAppliedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__STATUS:
    		return getStatus() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__FEATURES:
    		return getFeatures() != null && !getFeatures().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements() != null && !getAppliedRequirements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__INVOLVED_INVOLVEMENTS:
    		return getInvolvedInvolvements() != null && !getInvolvedInvolvements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__INVOLVING_INVOLVEMENTS:
    		return getInvolvingInvolvements() != null && !getInvolvingInvolvements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__KIND:
    		return getKind() != KIND_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__OWNED_FUNCTIONAL_CHAIN_INVOLVEMENTS:
    		return getOwnedFunctionalChainInvolvements() != null && !getOwnedFunctionalChainInvolvements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__OWNED_FUNCTIONAL_CHAIN_REALIZATIONS:
    		return getOwnedFunctionalChainRealizations() != null && !getOwnedFunctionalChainRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__INVOLVED_FUNCTIONAL_CHAIN_INVOLVEMENTS:
    		return getInvolvedFunctionalChainInvolvements() != null && !getInvolvedFunctionalChainInvolvements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__INVOLVED_FUNCTIONS:
    		return getInvolvedFunctions() != null && !getInvolvedFunctions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__INVOLVED_FUNCTIONAL_EXCHANGES:
    		return getInvolvedFunctionalExchanges() != null && !getInvolvedFunctionalExchanges().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__INVOLVED_ELEMENTS:
    		return getInvolvedElements() != null && !getInvolvedElements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__ENACTED_FUNCTIONS:
    		return getEnactedFunctions() != null && !getEnactedFunctions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__ENACTED_FUNCTIONAL_BLOCKS:
    		return getEnactedFunctionalBlocks() != null && !getEnactedFunctionalBlocks().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__AVAILABLE_IN_STATES:
    		return getAvailableInStates() != null && !getAvailableInStates().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__FIRST_FUNCTIONAL_CHAIN_INVOLVEMENTS:
    		return getFirstFunctionalChainInvolvements() != null && !getFirstFunctionalChainInvolvements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__INVOLVING_CAPABILITIES:
    		return getInvolvingCapabilities() != null && !getInvolvingCapabilities().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__INVOLVING_CAPABILITY_REALIZATIONS:
    		return getInvolvingCapabilityRealizations() != null && !getInvolvingCapabilityRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__REALIZED_FUNCTIONAL_CHAINS:
    		return getRealizedFunctionalChains() != null && !getRealizedFunctionalChains().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__REALIZING_FUNCTIONAL_CHAINS:
    		return getRealizingFunctionalChains() != null && !getRealizingFunctionalChains().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__INVOLVING_OPERATIONAL_CAPABILITIES:
    		return getInvolvingOperationalCapabilities() != null && !getInvolvingOperationalCapabilities().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__VISIBLE_IN_DOC:
    		setVisibleInDoc(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__VISIBLE_IN_LM:
    		setVisibleInLM(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__SUMMARY:
    		setSummary(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__REVIEW:
    		setReview(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__OWNED_PROPERTY_VALUES:
    		getOwnedPropertyValues().clear();
    		getOwnedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__OWNED_ENUMERATION_PROPERTY_TYPES:
    		getOwnedEnumerationPropertyTypes().clear();
    		getOwnedEnumerationPropertyTypes().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__APPLIED_PROPERTY_VALUES:
    		getAppliedPropertyValues().clear();
    		getAppliedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__OWNED_PROPERTY_VALUE_GROUPS:
    		getOwnedPropertyValueGroups().clear();
    		getOwnedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__APPLIED_PROPERTY_VALUE_GROUPS:
    		getAppliedPropertyValueGroups().clear();
    		getAppliedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__STATUS:
    		setStatus(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__FEATURES:
    		getFeatures().clear();
    		getFeatures().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__KIND:
    		setKind(
    		(org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChainKind)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__OWNED_FUNCTIONAL_CHAIN_INVOLVEMENTS:
    		getOwnedFunctionalChainInvolvements().clear();
    		getOwnedFunctionalChainInvolvements().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__OWNED_FUNCTIONAL_CHAIN_REALIZATIONS:
    		getOwnedFunctionalChainRealizations().clear();
    		getOwnedFunctionalChainRealizations().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.oa.OaPackage.OPERATIONAL_PROCESS__AVAILABLE_IN_STATES:
    		getAvailableInStates().clear();
    		getAvailableInStates().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
