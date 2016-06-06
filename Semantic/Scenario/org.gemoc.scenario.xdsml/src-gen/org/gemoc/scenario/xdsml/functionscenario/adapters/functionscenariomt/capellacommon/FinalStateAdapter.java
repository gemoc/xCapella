package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.capellacommon.FinalState;

@SuppressWarnings("all")
public class FinalStateAdapter extends EObjectAdapter<FinalState> implements org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.FinalState {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public FinalStateAdapter() {
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
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.IState> */Object referencedStates_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.IState> */Object getReferencedStates() {
    if (referencedStates_ == null)
    	referencedStates_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getReferencedStates(), adaptersFactory, eResource);
    return referencedStates_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.IState> */Object availableInStates_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.IState> */Object getAvailableInStates() {
    if (availableInStates_ == null)
    	availableInStates_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAvailableInStates(), adaptersFactory, eResource);
    return availableInStates_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.AbstractStateRealization> */Object ownedAbstractStateRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.AbstractStateRealization> */Object getOwnedAbstractStateRealizations() {
    if (ownedAbstractStateRealizations_ == null)
    	ownedAbstractStateRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedAbstractStateRealizations(), adaptersFactory, eResource);
    return ownedAbstractStateRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.AbstractState> */Object realizedAbstractStates_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.AbstractState> */Object getRealizedAbstractStates() {
    if (realizedAbstractStates_ == null)
    	realizedAbstractStates_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizedAbstractStates(), adaptersFactory, eResource);
    return realizedAbstractStates_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.AbstractState> */Object realizingAbstractStates_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.AbstractState> */Object getRealizingAbstractStates() {
    if (realizingAbstractStates_ == null)
    	realizingAbstractStates_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizingAbstractStates(), adaptersFactory, eResource);
    return realizingAbstractStates_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.StateTransition> */Object outgoing_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.StateTransition> */Object getOutgoing() {
    if (outgoing_ == null)
    	outgoing_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoing(), adaptersFactory, eResource);
    return outgoing_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.StateTransition> */Object incoming_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.StateTransition> */Object getIncoming() {
    if (incoming_ == null)
    	incoming_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncoming(), adaptersFactory, eResource);
    return incoming_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.Region> */Object involverRegions_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.Region> */Object getInvolverRegions() {
    if (involverRegions_ == null)
    	involverRegions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInvolverRegions(), adaptersFactory, eResource);
    return involverRegions_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.Region> */Object ownedRegions_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.Region> */Object getOwnedRegions() {
    if (ownedRegions_ == null)
    	ownedRegions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedRegions(), adaptersFactory, eResource);
    return ownedRegions_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.AbstractFunction> */Object availableAbstractFunctions_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.AbstractFunction> */Object getAvailableAbstractFunctions() {
    if (availableAbstractFunctions_ == null)
    	availableAbstractFunctions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAvailableAbstractFunctions(), adaptersFactory, eResource);
    return availableAbstractFunctions_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChain> */Object availableFunctionalChains_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChain> */Object getAvailableFunctionalChains() {
    if (availableFunctionalChains_ == null)
    	availableFunctionalChains_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAvailableFunctionalChains(), adaptersFactory, eResource);
    return availableFunctionalChains_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapability> */Object availableAbstractCapabilities_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.AbstractCapability> */Object getAvailableAbstractCapabilities() {
    if (availableAbstractCapabilities_ == null)
    	availableAbstractCapabilities_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAvailableAbstractCapabilities(), adaptersFactory, eResource);
    return availableAbstractCapabilities_;
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractEvent getEntry() {
    return () adaptersFactory.createAdapter(adaptee.getEntry(), eResource);
  }
  
  @Override
  public void setEntry(final org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractEvent o) {
    if (o != null)
    	adaptee.setEntry(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractEventAdapter) o).getAdaptee());
    else adaptee.setEntry(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractEvent getDoActivity() {
    return () adaptersFactory.createAdapter(adaptee.getDoActivity(), eResource);
  }
  
  @Override
  public void setDoActivity(final org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractEvent o) {
    if (o != null)
    	adaptee.setDoActivity(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractEventAdapter) o).getAdaptee());
    else adaptee.setDoActivity(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractEvent getExit() {
    return () adaptersFactory.createAdapter(adaptee.getExit(), eResource);
  }
  
  @Override
  public void setExit(final org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractEvent o) {
    if (o != null)
    	adaptee.setExit(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractEventAdapter) o).getAdaptee());
    else adaptee.setExit(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractConstraint getStateInvariant() {
    return () adaptersFactory.createAdapter(adaptee.getStateInvariant(), eResource);
  }
  
  @Override
  public void setStateInvariant(final org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractConstraint o) {
    if (o != null)
    	adaptee.setStateInvariant(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractConstraintAdapter) o).getAdaptee());
    else adaptee.setStateInvariant(null);
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
    return org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.eINSTANCE.getFinalState();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__NAME:
    		return getName();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__INCOMING_TRACES:
    		return getIncomingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__OUTGOING_TRACES:
    		return getOutgoingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__VISIBLE_IN_DOC:
    		return isVisibleInDoc() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__VISIBLE_IN_LM:
    		return isVisibleInLM() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__SUMMARY:
    		return getSummary();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__DESCRIPTION:
    		return getDescription();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__REVIEW:
    		return getReview();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__STATUS:
    		return getStatus();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__FEATURES:
    		return getFeatures();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__REFERENCED_STATES:
    		return getReferencedStates();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__AVAILABLE_IN_STATES:
    		return getAvailableInStates();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__OWNED_ABSTRACT_STATE_REALIZATIONS:
    		return getOwnedAbstractStateRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__REALIZED_ABSTRACT_STATES:
    		return getRealizedAbstractStates();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__REALIZING_ABSTRACT_STATES:
    		return getRealizingAbstractStates();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__OUTGOING:
    		return getOutgoing();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__INCOMING:
    		return getIncoming();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__INVOLVER_REGIONS:
    		return getInvolverRegions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__OWNED_REGIONS:
    		return getOwnedRegions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__AVAILABLE_ABSTRACT_FUNCTIONS:
    		return getAvailableAbstractFunctions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__AVAILABLE_FUNCTIONAL_CHAINS:
    		return getAvailableFunctionalChains();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__AVAILABLE_ABSTRACT_CAPABILITIES:
    		return getAvailableAbstractCapabilities();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__ENTRY:
    		return getEntry();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__DO_ACTIVITY:
    		return getDoActivity();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__EXIT:
    		return getExit();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__STATE_INVARIANT:
    		return getStateInvariant();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__INCOMING_TRACES:
    		return getIncomingTraces() != null && !getIncomingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__OUTGOING_TRACES:
    		return getOutgoingTraces() != null && !getOutgoingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__VISIBLE_IN_DOC:
    		return isVisibleInDoc() != VISIBLE_IN_DOC_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__VISIBLE_IN_LM:
    		return isVisibleInLM() != VISIBLE_IN_LM_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__SUMMARY:
    		return getSummary() != SUMMARY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__REVIEW:
    		return getReview() != REVIEW_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues() != null && !getOwnedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes() != null && !getOwnedEnumerationPropertyTypes().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues() != null && !getAppliedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups() != null && !getOwnedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups() != null && !getAppliedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__STATUS:
    		return getStatus() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__FEATURES:
    		return getFeatures() != null && !getFeatures().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements() != null && !getAppliedRequirements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__REFERENCED_STATES:
    		return getReferencedStates() != null && !getReferencedStates().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__AVAILABLE_IN_STATES:
    		return getAvailableInStates() != null && !getAvailableInStates().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__OWNED_ABSTRACT_STATE_REALIZATIONS:
    		return getOwnedAbstractStateRealizations() != null && !getOwnedAbstractStateRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__REALIZED_ABSTRACT_STATES:
    		return getRealizedAbstractStates() != null && !getRealizedAbstractStates().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__REALIZING_ABSTRACT_STATES:
    		return getRealizingAbstractStates() != null && !getRealizingAbstractStates().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__OUTGOING:
    		return getOutgoing() != null && !getOutgoing().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__INCOMING:
    		return getIncoming() != null && !getIncoming().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__INVOLVER_REGIONS:
    		return getInvolverRegions() != null && !getInvolverRegions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__OWNED_REGIONS:
    		return getOwnedRegions() != null && !getOwnedRegions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__AVAILABLE_ABSTRACT_FUNCTIONS:
    		return getAvailableAbstractFunctions() != null && !getAvailableAbstractFunctions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__AVAILABLE_FUNCTIONAL_CHAINS:
    		return getAvailableFunctionalChains() != null && !getAvailableFunctionalChains().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__AVAILABLE_ABSTRACT_CAPABILITIES:
    		return getAvailableAbstractCapabilities() != null && !getAvailableAbstractCapabilities().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__ENTRY:
    		return getEntry() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__DO_ACTIVITY:
    		return getDoActivity() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__EXIT:
    		return getExit() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__STATE_INVARIANT:
    		return getStateInvariant() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__VISIBLE_IN_DOC:
    		setVisibleInDoc(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__VISIBLE_IN_LM:
    		setVisibleInLM(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__SUMMARY:
    		setSummary(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__REVIEW:
    		setReview(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__OWNED_PROPERTY_VALUES:
    		getOwnedPropertyValues().clear();
    		getOwnedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__OWNED_ENUMERATION_PROPERTY_TYPES:
    		getOwnedEnumerationPropertyTypes().clear();
    		getOwnedEnumerationPropertyTypes().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__APPLIED_PROPERTY_VALUES:
    		getAppliedPropertyValues().clear();
    		getAppliedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__OWNED_PROPERTY_VALUE_GROUPS:
    		getOwnedPropertyValueGroups().clear();
    		getOwnedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__APPLIED_PROPERTY_VALUE_GROUPS:
    		getAppliedPropertyValueGroups().clear();
    		getAppliedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__STATUS:
    		setStatus(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__FEATURES:
    		getFeatures().clear();
    		getFeatures().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__REFERENCED_STATES:
    		getReferencedStates().clear();
    		getReferencedStates().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__AVAILABLE_IN_STATES:
    		getAvailableInStates().clear();
    		getAvailableInStates().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__OWNED_ABSTRACT_STATE_REALIZATIONS:
    		getOwnedAbstractStateRealizations().clear();
    		getOwnedAbstractStateRealizations().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__OUTGOING:
    		getOutgoing().clear();
    		getOutgoing().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__INCOMING:
    		getIncoming().clear();
    		getIncoming().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__OWNED_REGIONS:
    		getOwnedRegions().clear();
    		getOwnedRegions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__ENTRY:
    		setEntry(
    		(org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractEvent)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__DO_ACTIVITY:
    		setDoActivity(
    		(org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractEvent)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__EXIT:
    		setExit(
    		(org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractEvent)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.CapellacommonPackage.FINAL_STATE__STATE_INVARIANT:
    		setStateInvariant(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractConstraint)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
