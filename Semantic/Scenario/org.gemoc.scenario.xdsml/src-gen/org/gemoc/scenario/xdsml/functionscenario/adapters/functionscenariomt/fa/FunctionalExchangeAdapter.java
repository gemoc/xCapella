package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.fa.FunctionalExchange;

@SuppressWarnings("all")
public class FunctionalExchangeAdapter extends EObjectAdapter<FunctionalExchange> implements org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalExchange {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public FunctionalExchangeAdapter() {
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
  public org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.RateKind getKindOfRate() {
    return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.RateKind.get(adaptee.getKindOfRate().getValue());
  }
  
  @Override
  public void setKindOfRate(final org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.RateKind o) {
    adaptee.setKindOfRate(org.polarsys.capella.common.data.modellingcore.RateKind.get(o.getValue()));
  }
  
  @Override
  public boolean isIsMulticast() {
    return adaptee.isIsMulticast();
  }
  
  @Override
  public void setIsMulticast(final boolean o) {
    adaptee.setIsMulticast(o);
  }
  
  @Override
  public boolean isIsMultireceive() {
    return adaptee.isIsMultireceive();
  }
  
  @Override
  public void setIsMultireceive(final boolean o) {
    adaptee.setIsMultireceive(o);
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
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractInformationFlow getRealizedFlow() {
    return () adaptersFactory.createAdapter(adaptee.getRealizedFlow(), eResource);
  }
  
  @Override
  public void setRealizedFlow(final org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractInformationFlow o) {
    if (o != null)
    	adaptee.setRealizedFlow(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractInformationFlowAdapter) o).getAdaptee());
    else adaptee.setRealizedFlow(null);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Involvement> */Object involvingInvolvements_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Involvement> */Object getInvolvingInvolvements() {
    if (involvingInvolvements_ == null)
    	involvingInvolvements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInvolvingInvolvements(), adaptersFactory, eResource);
    return involvingInvolvements_;
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPartition getInActivityPartition() {
    return () adaptersFactory.createAdapter(adaptee.getInActivityPartition(), eResource);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.activity.InterruptibleActivityRegion getInInterruptibleRegion() {
    return () adaptersFactory.createAdapter(adaptee.getInInterruptibleRegion(), eResource);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.activity.StructuredActivityNode getInStructuredNode() {
    return () adaptersFactory.createAdapter(adaptee.getInStructuredNode(), eResource);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ValueSpecification getRate() {
    return () adaptersFactory.createAdapter(adaptee.getRate(), eResource);
  }
  
  @Override
  public void setRate(final org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ValueSpecification o) {
    if (o != null)
    	adaptee.setRate(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.ValueSpecificationAdapter) o).getAdaptee());
    else adaptee.setRate(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ValueSpecification getProbability() {
    return () adaptersFactory.createAdapter(adaptee.getProbability(), eResource);
  }
  
  @Override
  public void setProbability(final org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ValueSpecification o) {
    if (o != null)
    	adaptee.setProbability(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.ValueSpecificationAdapter) o).getAdaptee());
    else adaptee.setProbability(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityNode getTarget() {
    return () adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityNode o) {
    if (o != null)
    	adaptee.setTarget(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ActivityNodeAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityNode getSource() {
    return () adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityNode o) {
    if (o != null)
    	adaptee.setSource(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ActivityNodeAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ValueSpecification getGuard() {
    return () adaptersFactory.createAdapter(adaptee.getGuard(), eResource);
  }
  
  @Override
  public void setGuard(final org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ValueSpecification o) {
    if (o != null)
    	adaptee.setGuard(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.ValueSpecificationAdapter) o).getAdaptee());
    else adaptee.setGuard(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ValueSpecification getWeight() {
    return () adaptersFactory.createAdapter(adaptee.getWeight(), eResource);
  }
  
  @Override
  public void setWeight(final org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ValueSpecification o) {
    if (o != null)
    	adaptee.setWeight(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.ValueSpecificationAdapter) o).getAdaptee());
    else adaptee.setWeight(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.activity.InterruptibleActivityRegion getInterrupts() {
    return () adaptersFactory.createAdapter(adaptee.getInterrupts(), eResource);
  }
  
  @Override
  public void setInterrupts(final org.gemoc.scenario.xdsml.functionscenariomt.activity.InterruptibleActivityRegion o) {
    if (o != null)
    	adaptee.setInterrupts(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.InterruptibleActivityRegionAdapter) o).getAdaptee());
    else adaptee.setInterrupts(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractBehavior getTransformation() {
    return () adaptersFactory.createAdapter(adaptee.getTransformation(), eResource);
  }
  
  @Override
  public void setTransformation(final org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractBehavior o) {
    if (o != null)
    	adaptee.setTransformation(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractBehaviorAdapter) o).getAdaptee());
    else adaptee.setTransformation(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractBehavior getSelection() {
    return () adaptersFactory.createAdapter(adaptee.getSelection(), eResource);
  }
  
  @Override
  public void setSelection(final org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractBehavior o) {
    if (o != null)
    	adaptee.setSelection(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractBehaviorAdapter) o).getAdaptee());
    else adaptee.setSelection(null);
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
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalExchangeSpecification> */Object exchangeSpecifications_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalExchangeSpecification> */Object getExchangeSpecifications() {
    if (exchangeSpecifications_ == null)
    	exchangeSpecifications_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getExchangeSpecifications(), adaptersFactory, eResource);
    return exchangeSpecifications_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChain> */Object involvingFunctionalChains_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalChain> */Object getInvolvingFunctionalChains() {
    if (involvingFunctionalChains_ == null)
    	involvingFunctionalChains_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInvolvingFunctionalChains(), adaptersFactory, eResource);
    return involvingFunctionalChains_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.ExchangeItem> */Object exchangedItems_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.ExchangeItem> */Object getExchangedItems() {
    if (exchangedItems_ == null)
    	exchangedItems_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getExchangedItems(), adaptersFactory, eResource);
    return exchangedItems_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchange> */Object allocatingComponentExchanges_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchange> */Object getAllocatingComponentExchanges() {
    if (allocatingComponentExchanges_ == null)
    	allocatingComponentExchanges_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAllocatingComponentExchanges(), adaptersFactory, eResource);
    return allocatingComponentExchanges_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeFunctionalExchangeAllocation> */Object incomingComponentExchangeFunctionalExchangeRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeFunctionalExchangeAllocation> */Object getIncomingComponentExchangeFunctionalExchangeRealizations() {
    if (incomingComponentExchangeFunctionalExchangeRealizations_ == null)
    	incomingComponentExchangeFunctionalExchangeRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingComponentExchangeFunctionalExchangeRealizations(), adaptersFactory, eResource);
    return incomingComponentExchangeFunctionalExchangeRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalExchangeRealization> */Object incomingFunctionalExchangeRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalExchangeRealization> */Object getIncomingFunctionalExchangeRealizations() {
    if (incomingFunctionalExchangeRealizations_ == null)
    	incomingFunctionalExchangeRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingFunctionalExchangeRealizations(), adaptersFactory, eResource);
    return incomingFunctionalExchangeRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalExchangeRealization> */Object outgoingFunctionalExchangeRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalExchangeRealization> */Object getOutgoingFunctionalExchangeRealizations() {
    if (outgoingFunctionalExchangeRealizations_ == null)
    	outgoingFunctionalExchangeRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingFunctionalExchangeRealizations(), adaptersFactory, eResource);
    return outgoingFunctionalExchangeRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ExchangeCategory> */Object categories_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ExchangeCategory> */Object getCategories() {
    if (categories_ == null)
    	categories_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getCategories(), adaptersFactory, eResource);
    return categories_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalExchangeRealization> */Object ownedFunctionalExchangeRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalExchangeRealization> */Object getOwnedFunctionalExchangeRealizations() {
    if (ownedFunctionalExchangeRealizations_ == null)
    	ownedFunctionalExchangeRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedFunctionalExchangeRealizations(), adaptersFactory, eResource);
    return ownedFunctionalExchangeRealizations_;
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionOutputPort getSourceFunctionOutputPort() {
    return () adaptersFactory.createAdapter(adaptee.getSourceFunctionOutputPort(), eResource);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionInputPort getTargetFunctionInputPort() {
    return () adaptersFactory.createAdapter(adaptee.getTargetFunctionInputPort(), eResource);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalExchange> */Object realizedFunctionalExchanges_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalExchange> */Object getRealizedFunctionalExchanges() {
    if (realizedFunctionalExchanges_ == null)
    	realizedFunctionalExchanges_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizedFunctionalExchanges(), adaptersFactory, eResource);
    return realizedFunctionalExchanges_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalExchange> */Object realizingFunctionalExchanges_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalExchange> */Object getRealizingFunctionalExchanges() {
    if (realizingFunctionalExchanges_ == null)
    	realizingFunctionalExchanges_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizingFunctionalExchanges(), adaptersFactory, eResource);
    return realizingFunctionalExchanges_;
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
  
  protected final static org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.RateKind KIND_OF_RATE_EDEFAULT = org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.RateKind.UNSPECIFIED;
  
  protected final static boolean IS_MULTICAST_EDEFAULT = false;
  
  protected final static boolean IS_MULTIRECEIVE_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.eINSTANCE.getFunctionalExchange();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__NAME:
    		return getName();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__INCOMING_TRACES:
    		return getIncomingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__OUTGOING_TRACES:
    		return getOutgoingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__VISIBLE_IN_DOC:
    		return isVisibleInDoc() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__VISIBLE_IN_LM:
    		return isVisibleInLM() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__SUMMARY:
    		return getSummary();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__DESCRIPTION:
    		return getDescription();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__REVIEW:
    		return getReview();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__STATUS:
    		return getStatus();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__FEATURES:
    		return getFeatures();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FLOW:
    		return getRealizedFlow();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__INVOLVING_INVOLVEMENTS:
    		return getInvolvingInvolvements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__KIND_OF_RATE:
    		return getKindOfRate();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__IN_ACTIVITY_PARTITION:
    		return getInActivityPartition();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__IN_INTERRUPTIBLE_REGION:
    		return getInInterruptibleRegion();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__IN_STRUCTURED_NODE:
    		return getInStructuredNode();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__RATE:
    		return getRate();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY:
    		return getProbability();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__TARGET:
    		return getTarget();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__SOURCE:
    		return getSource();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__GUARD:
    		return getGuard();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT:
    		return getWeight();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__INTERRUPTS:
    		return getInterrupts();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTICAST:
    		return isIsMulticast() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTIRECEIVE:
    		return isIsMultireceive() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__TRANSFORMATION:
    		return getTransformation();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__SELECTION:
    		return getSelection();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__ABSTRACT_TYPED_ELEMENTS:
    		return getAbstractTypedElements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__INVOKING_SEQUENCE_MESSAGES:
    		return getInvokingSequenceMessages();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGE_SPECIFICATIONS:
    		return getExchangeSpecifications();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__INVOLVING_FUNCTIONAL_CHAINS:
    		return getInvolvingFunctionalChains();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGED_ITEMS:
    		return getExchangedItems();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__ALLOCATING_COMPONENT_EXCHANGES:
    		return getAllocatingComponentExchanges();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__INCOMING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_REALIZATIONS:
    		return getIncomingComponentExchangeFunctionalExchangeRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__INCOMING_FUNCTIONAL_EXCHANGE_REALIZATIONS:
    		return getIncomingFunctionalExchangeRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__OUTGOING_FUNCTIONAL_EXCHANGE_REALIZATIONS:
    		return getOutgoingFunctionalExchangeRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__CATEGORIES:
    		return getCategories();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__OWNED_FUNCTIONAL_EXCHANGE_REALIZATIONS:
    		return getOwnedFunctionalExchangeRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__SOURCE_FUNCTION_OUTPUT_PORT:
    		return getSourceFunctionOutputPort();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__TARGET_FUNCTION_INPUT_PORT:
    		return getTargetFunctionInputPort();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FUNCTIONAL_EXCHANGES:
    		return getRealizedFunctionalExchanges();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__REALIZING_FUNCTIONAL_EXCHANGES:
    		return getRealizingFunctionalExchanges();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__INCOMING_TRACES:
    		return getIncomingTraces() != null && !getIncomingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__OUTGOING_TRACES:
    		return getOutgoingTraces() != null && !getOutgoingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__VISIBLE_IN_DOC:
    		return isVisibleInDoc() != VISIBLE_IN_DOC_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__VISIBLE_IN_LM:
    		return isVisibleInLM() != VISIBLE_IN_LM_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__SUMMARY:
    		return getSummary() != SUMMARY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__REVIEW:
    		return getReview() != REVIEW_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues() != null && !getOwnedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes() != null && !getOwnedEnumerationPropertyTypes().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues() != null && !getAppliedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups() != null && !getOwnedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups() != null && !getAppliedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__STATUS:
    		return getStatus() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__FEATURES:
    		return getFeatures() != null && !getFeatures().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements() != null && !getAppliedRequirements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FLOW:
    		return getRealizedFlow() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__INVOLVING_INVOLVEMENTS:
    		return getInvolvingInvolvements() != null && !getInvolvingInvolvements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__KIND_OF_RATE:
    		return getKindOfRate() != KIND_OF_RATE_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__IN_ACTIVITY_PARTITION:
    		return getInActivityPartition() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__IN_INTERRUPTIBLE_REGION:
    		return getInInterruptibleRegion() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__IN_STRUCTURED_NODE:
    		return getInStructuredNode() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__RATE:
    		return getRate() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY:
    		return getProbability() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__TARGET:
    		return getTarget() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__SOURCE:
    		return getSource() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__GUARD:
    		return getGuard() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT:
    		return getWeight() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__INTERRUPTS:
    		return getInterrupts() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTICAST:
    		return isIsMulticast() != IS_MULTICAST_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTIRECEIVE:
    		return isIsMultireceive() != IS_MULTIRECEIVE_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__TRANSFORMATION:
    		return getTransformation() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__SELECTION:
    		return getSelection() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__ABSTRACT_TYPED_ELEMENTS:
    		return getAbstractTypedElements() != null && !getAbstractTypedElements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__INVOKING_SEQUENCE_MESSAGES:
    		return getInvokingSequenceMessages() != null && !getInvokingSequenceMessages().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGE_SPECIFICATIONS:
    		return getExchangeSpecifications() != null && !getExchangeSpecifications().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__INVOLVING_FUNCTIONAL_CHAINS:
    		return getInvolvingFunctionalChains() != null && !getInvolvingFunctionalChains().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGED_ITEMS:
    		return getExchangedItems() != null && !getExchangedItems().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__ALLOCATING_COMPONENT_EXCHANGES:
    		return getAllocatingComponentExchanges() != null && !getAllocatingComponentExchanges().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__INCOMING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_REALIZATIONS:
    		return getIncomingComponentExchangeFunctionalExchangeRealizations() != null && !getIncomingComponentExchangeFunctionalExchangeRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__INCOMING_FUNCTIONAL_EXCHANGE_REALIZATIONS:
    		return getIncomingFunctionalExchangeRealizations() != null && !getIncomingFunctionalExchangeRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__OUTGOING_FUNCTIONAL_EXCHANGE_REALIZATIONS:
    		return getOutgoingFunctionalExchangeRealizations() != null && !getOutgoingFunctionalExchangeRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__CATEGORIES:
    		return getCategories() != null && !getCategories().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__OWNED_FUNCTIONAL_EXCHANGE_REALIZATIONS:
    		return getOwnedFunctionalExchangeRealizations() != null && !getOwnedFunctionalExchangeRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__SOURCE_FUNCTION_OUTPUT_PORT:
    		return getSourceFunctionOutputPort() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__TARGET_FUNCTION_INPUT_PORT:
    		return getTargetFunctionInputPort() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FUNCTIONAL_EXCHANGES:
    		return getRealizedFunctionalExchanges() != null && !getRealizedFunctionalExchanges().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__REALIZING_FUNCTIONAL_EXCHANGES:
    		return getRealizingFunctionalExchanges() != null && !getRealizingFunctionalExchanges().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__VISIBLE_IN_DOC:
    		setVisibleInDoc(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__VISIBLE_IN_LM:
    		setVisibleInLM(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__SUMMARY:
    		setSummary(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__REVIEW:
    		setReview(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__OWNED_PROPERTY_VALUES:
    		getOwnedPropertyValues().clear();
    		getOwnedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__OWNED_ENUMERATION_PROPERTY_TYPES:
    		getOwnedEnumerationPropertyTypes().clear();
    		getOwnedEnumerationPropertyTypes().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__APPLIED_PROPERTY_VALUES:
    		getAppliedPropertyValues().clear();
    		getAppliedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__OWNED_PROPERTY_VALUE_GROUPS:
    		getOwnedPropertyValueGroups().clear();
    		getOwnedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__APPLIED_PROPERTY_VALUE_GROUPS:
    		getAppliedPropertyValueGroups().clear();
    		getAppliedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__STATUS:
    		setStatus(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__FEATURES:
    		getFeatures().clear();
    		getFeatures().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FLOW:
    		setRealizedFlow(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractInformationFlow)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__KIND_OF_RATE:
    		setKindOfRate(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.RateKind)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__RATE:
    		setRate(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ValueSpecification)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY:
    		setProbability(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ValueSpecification)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__TARGET:
    		setTarget(
    		(org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityNode)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__SOURCE:
    		setSource(
    		(org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityNode)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__GUARD:
    		setGuard(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ValueSpecification)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT:
    		setWeight(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ValueSpecification)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__INTERRUPTS:
    		setInterrupts(
    		(org.gemoc.scenario.xdsml.functionscenariomt.activity.InterruptibleActivityRegion)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTICAST:
    		setIsMulticast(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTIRECEIVE:
    		setIsMultireceive(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__TRANSFORMATION:
    		setTransformation(
    		(org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractBehavior)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__SELECTION:
    		setSelection(
    		(org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractBehavior)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGE_SPECIFICATIONS:
    		getExchangeSpecifications().clear();
    		getExchangeSpecifications().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGED_ITEMS:
    		getExchangedItems().clear();
    		getExchangedItems().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__CATEGORIES:
    		getCategories().clear();
    		getCategories().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__OWNED_FUNCTIONAL_EXCHANGE_REALIZATIONS:
    		getOwnedFunctionalExchangeRealizations().clear();
    		getOwnedFunctionalExchangeRealizations().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractRelationship.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FLOW:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_RELATIONSHIP__REALIZED_FLOW;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Relationship.class) {
    	switch (derivedFeatureID) {
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.capellacore.InvolvedElement.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__INVOLVING_INVOLVEMENTS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityEdge.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__KIND_OF_RATE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EDGE__KIND_OF_RATE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__IN_ACTIVITY_PARTITION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EDGE__IN_ACTIVITY_PARTITION;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__IN_INTERRUPTIBLE_REGION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EDGE__IN_INTERRUPTIBLE_REGION;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__IN_STRUCTURED_NODE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__RATE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EDGE__RATE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EDGE__PROBABILITY;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__TARGET:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EDGE__TARGET;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__SOURCE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EDGE__SOURCE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__GUARD:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EDGE__GUARD;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EDGE__WEIGHT;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__INTERRUPTS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EDGE__INTERRUPTS;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.activity.ObjectFlow.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTICAST:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__IS_MULTICAST;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTIRECEIVE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__IS_MULTIRECEIVE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__TRANSFORMATION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__TRANSFORMATION;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__SELECTION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__SELECTION;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractType.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__ABSTRACT_TYPED_ELEMENTS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_TYPE__ABSTRACT_TYPED_ELEMENTS;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractEvent.class) {
    	switch (derivedFeatureID) {
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.information.AbstractEventOperation.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__INVOKING_SEQUENCE_MESSAGES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.ABSTRACT_EVENT_OPERATION__INVOKING_SEQUENCE_MESSAGES;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractRelationship.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_RELATIONSHIP__REALIZED_FLOW:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FLOW;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Relationship.class) {
    	switch (baseFeatureID) {
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.capellacore.InvolvedElement.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__INVOLVING_INVOLVEMENTS;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityEdge.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EDGE__KIND_OF_RATE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__KIND_OF_RATE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EDGE__IN_ACTIVITY_PARTITION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__IN_ACTIVITY_PARTITION;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EDGE__IN_INTERRUPTIBLE_REGION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__IN_INTERRUPTIBLE_REGION;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__IN_STRUCTURED_NODE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EDGE__RATE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__RATE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EDGE__PROBABILITY:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EDGE__TARGET:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__TARGET;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EDGE__SOURCE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__SOURCE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EDGE__GUARD:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__GUARD;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EDGE__WEIGHT:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EDGE__INTERRUPTS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__INTERRUPTS;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.activity.ObjectFlow.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__IS_MULTICAST:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTICAST;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__IS_MULTIRECEIVE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTIRECEIVE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__TRANSFORMATION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__TRANSFORMATION;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__SELECTION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__SELECTION;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractType.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_TYPE__ABSTRACT_TYPED_ELEMENTS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__ABSTRACT_TYPED_ELEMENTS;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractEvent.class) {
    	switch (baseFeatureID) {
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.information.AbstractEventOperation.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.ABSTRACT_EVENT_OPERATION__INVOKING_SEQUENCE_MESSAGES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTIONAL_EXCHANGE__INVOKING_SEQUENCE_MESSAGES;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
