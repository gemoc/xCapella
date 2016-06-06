package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.fa.ComponentExchange;

@SuppressWarnings("all")
public class ComponentExchangeAdapter extends EObjectAdapter<ComponentExchange> implements org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchange {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public ComponentExchangeAdapter() {
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
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeKind getKind() {
    return org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeKind.get(adaptee.getKind().getValue());
  }
  
  @Override
  public void setKind(final org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeKind o) {
    adaptee.setKind(org.polarsys.capella.core.data.fa.ComponentExchangeKind.get(o.getValue()));
  }
  
  @Override
  public boolean isOriented() {
    return adaptee.isOriented();
  }
  
  @Override
  public void setOriented(final boolean o) {
    adaptee.setOriented(o);
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
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.SequenceMessage> */Object invokingSequenceMessages_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.interaction.SequenceMessage> */Object getInvokingSequenceMessages() {
    if (invokingSequenceMessages_ == null)
    	invokingSequenceMessages_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInvokingSequenceMessages(), adaptersFactory, eResource);
    return invokingSequenceMessages_;
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
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractRelationship> */Object realizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractRelationship> */Object getRealizations() {
    if (realizations_ == null)
    	realizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizations(), adaptersFactory, eResource);
    return realizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractExchangeItem> */Object convoyedInformations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractExchangeItem> */Object getConvoyedInformations() {
    if (convoyedInformations_ == null)
    	convoyedInformations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getConvoyedInformations(), adaptersFactory, eResource);
    return convoyedInformations_;
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.InformationsExchanger getSource() {
    return () adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.InformationsExchanger o) {
    if (o != null)
    	adaptee.setSource(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.InformationsExchangerAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.InformationsExchanger getTarget() {
    return () adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.InformationsExchanger o) {
    if (o != null)
    	adaptee.setTarget(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.InformationsExchangerAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityEdge> */Object realizingActivityFlows_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityEdge> */Object getRealizingActivityFlows() {
    if (realizingActivityFlows_ == null)
    	realizingActivityFlows_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizingActivityFlows(), adaptersFactory, eResource);
    return realizingActivityFlows_;
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.ExchangeLink getContainingLink() {
    return () adaptersFactory.createAdapter(adaptee.getContainingLink(), eResource);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.ExchangeContainment getLink() {
    return () adaptersFactory.createAdapter(adaptee.getLink(), eResource);
  }
  
  @Override
  public void setLink(final org.gemoc.scenario.xdsml.functionscenariomt.fa.ExchangeContainment o) {
    if (o != null)
    	adaptee.setLink(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ExchangeContainmentAdapter) o).getAdaptee());
    else adaptee.setLink(null);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ExchangeSpecificationRealization> */Object outgoingExchangeSpecificationRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ExchangeSpecificationRealization> */Object getOutgoingExchangeSpecificationRealizations() {
    if (outgoingExchangeSpecificationRealizations_ == null)
    	outgoingExchangeSpecificationRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingExchangeSpecificationRealizations(), adaptersFactory, eResource);
    return outgoingExchangeSpecificationRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ExchangeSpecificationRealization> */Object incomingExchangeSpecificationRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ExchangeSpecificationRealization> */Object getIncomingExchangeSpecificationRealizations() {
    if (incomingExchangeSpecificationRealizations_ == null)
    	incomingExchangeSpecificationRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingExchangeSpecificationRealizations(), adaptersFactory, eResource);
    return incomingExchangeSpecificationRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalExchange> */Object allocatedFunctionalExchanges_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalExchange> */Object getAllocatedFunctionalExchanges() {
    if (allocatedFunctionalExchanges_ == null)
    	allocatedFunctionalExchanges_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAllocatedFunctionalExchanges(), adaptersFactory, eResource);
    return allocatedFunctionalExchanges_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeRealization> */Object incomingComponentExchangeRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeRealization> */Object getIncomingComponentExchangeRealizations() {
    if (incomingComponentExchangeRealizations_ == null)
    	incomingComponentExchangeRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingComponentExchangeRealizations(), adaptersFactory, eResource);
    return incomingComponentExchangeRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeRealization> */Object outgoingComponentExchangeRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeRealization> */Object getOutgoingComponentExchangeRealizations() {
    if (outgoingComponentExchangeRealizations_ == null)
    	outgoingComponentExchangeRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingComponentExchangeRealizations(), adaptersFactory, eResource);
    return outgoingComponentExchangeRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeFunctionalExchangeAllocation> */Object outgoingComponentExchangeFunctionalExchangeAllocations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeFunctionalExchangeAllocation> */Object getOutgoingComponentExchangeFunctionalExchangeAllocations() {
    if (outgoingComponentExchangeFunctionalExchangeAllocations_ == null)
    	outgoingComponentExchangeFunctionalExchangeAllocations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingComponentExchangeFunctionalExchangeAllocations(), adaptersFactory, eResource);
    return outgoingComponentExchangeFunctionalExchangeAllocations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeFunctionalExchangeAllocation> */Object ownedComponentExchangeFunctionalExchangeAllocations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeFunctionalExchangeAllocation> */Object getOwnedComponentExchangeFunctionalExchangeAllocations() {
    if (ownedComponentExchangeFunctionalExchangeAllocations_ == null)
    	ownedComponentExchangeFunctionalExchangeAllocations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedComponentExchangeFunctionalExchangeAllocations(), adaptersFactory, eResource);
    return ownedComponentExchangeFunctionalExchangeAllocations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeRealization> */Object ownedComponentExchangeRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeRealization> */Object getOwnedComponentExchangeRealizations() {
    if (ownedComponentExchangeRealizations_ == null)
    	ownedComponentExchangeRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedComponentExchangeRealizations(), adaptersFactory, eResource);
    return ownedComponentExchangeRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeEnd> */Object ownedComponentExchangeEnds_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeEnd> */Object getOwnedComponentExchangeEnds() {
    if (ownedComponentExchangeEnds_ == null)
    	ownedComponentExchangeEnds_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedComponentExchangeEnds(), adaptersFactory, eResource);
    return ownedComponentExchangeEnds_;
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.Port getSourcePort() {
    return () adaptersFactory.createAdapter(adaptee.getSourcePort(), eResource);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.cs.Part getSourcePart() {
    return () adaptersFactory.createAdapter(adaptee.getSourcePart(), eResource);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.Port getTargetPort() {
    return () adaptersFactory.createAdapter(adaptee.getTargetPort(), eResource);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.cs.Part getTargetPart() {
    return () adaptersFactory.createAdapter(adaptee.getTargetPart(), eResource);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeCategory> */Object categories_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeCategory> */Object getCategories() {
    if (categories_ == null)
    	categories_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getCategories(), adaptersFactory, eResource);
    return categories_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.PhysicalLink> */Object allocatorPhysicalLinks_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.PhysicalLink> */Object getAllocatorPhysicalLinks() {
    if (allocatorPhysicalLinks_ == null)
    	allocatorPhysicalLinks_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAllocatorPhysicalLinks(), adaptersFactory, eResource);
    return allocatorPhysicalLinks_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchange> */Object realizedComponentExchanges_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchange> */Object getRealizedComponentExchanges() {
    if (realizedComponentExchanges_ == null)
    	realizedComponentExchanges_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizedComponentExchanges(), adaptersFactory, eResource);
    return realizedComponentExchanges_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchange> */Object realizingComponentExchanges_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchange> */Object getRealizingComponentExchanges() {
    if (realizingComponentExchanges_ == null)
    	realizingComponentExchanges_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizingComponentExchanges(), adaptersFactory, eResource);
    return realizingComponentExchanges_;
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
  
  protected final static org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeKind KIND_EDEFAULT = org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeKind.UNSET;
  
  protected final static boolean ORIENTED_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.eINSTANCE.getComponentExchange();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__NAME:
    		return getName();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__ABSTRACT_TYPED_ELEMENTS:
    		return getAbstractTypedElements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__INCOMING_TRACES:
    		return getIncomingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OUTGOING_TRACES:
    		return getOutgoingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_DOC:
    		return isVisibleInDoc() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_LM:
    		return isVisibleInLM() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__SUMMARY:
    		return getSummary();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__DESCRIPTION:
    		return getDescription();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__REVIEW:
    		return getReview();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__STATUS:
    		return getStatus();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__FEATURES:
    		return getFeatures();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__INVOKING_SEQUENCE_MESSAGES:
    		return getInvokingSequenceMessages();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__REALIZED_FLOW:
    		return getRealizedFlow();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__REALIZATIONS:
    		return getRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__CONVOYED_INFORMATIONS:
    		return getConvoyedInformations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__SOURCE:
    		return getSource();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__TARGET:
    		return getTarget();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__REALIZING_ACTIVITY_FLOWS:
    		return getRealizingActivityFlows();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__CONTAINING_LINK:
    		return getContainingLink();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__LINK:
    		return getLink();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS:
    		return getOutgoingExchangeSpecificationRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS:
    		return getIncomingExchangeSpecificationRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__KIND:
    		return getKind();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__ORIENTED:
    		return isOriented() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__ALLOCATED_FUNCTIONAL_EXCHANGES:
    		return getAllocatedFunctionalExchanges();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__INCOMING_COMPONENT_EXCHANGE_REALIZATIONS:
    		return getIncomingComponentExchangeRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OUTGOING_COMPONENT_EXCHANGE_REALIZATIONS:
    		return getOutgoingComponentExchangeRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OUTGOING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
    		return getOutgoingComponentExchangeFunctionalExchangeAllocations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
    		return getOwnedComponentExchangeFunctionalExchangeAllocations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
    		return getOwnedComponentExchangeRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_ENDS:
    		return getOwnedComponentExchangeEnds();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__SOURCE_PORT:
    		return getSourcePort();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__SOURCE_PART:
    		return getSourcePart();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__TARGET_PORT:
    		return getTargetPort();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__TARGET_PART:
    		return getTargetPart();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__CATEGORIES:
    		return getCategories();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__ALLOCATOR_PHYSICAL_LINKS:
    		return getAllocatorPhysicalLinks();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__REALIZED_COMPONENT_EXCHANGES:
    		return getRealizedComponentExchanges();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__REALIZING_COMPONENT_EXCHANGES:
    		return getRealizingComponentExchanges();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__ABSTRACT_TYPED_ELEMENTS:
    		return getAbstractTypedElements() != null && !getAbstractTypedElements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__INCOMING_TRACES:
    		return getIncomingTraces() != null && !getIncomingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OUTGOING_TRACES:
    		return getOutgoingTraces() != null && !getOutgoingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_DOC:
    		return isVisibleInDoc() != VISIBLE_IN_DOC_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_LM:
    		return isVisibleInLM() != VISIBLE_IN_LM_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__SUMMARY:
    		return getSummary() != SUMMARY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__REVIEW:
    		return getReview() != REVIEW_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues() != null && !getOwnedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes() != null && !getOwnedEnumerationPropertyTypes().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues() != null && !getAppliedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups() != null && !getOwnedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups() != null && !getAppliedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__STATUS:
    		return getStatus() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__FEATURES:
    		return getFeatures() != null && !getFeatures().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements() != null && !getAppliedRequirements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__INVOKING_SEQUENCE_MESSAGES:
    		return getInvokingSequenceMessages() != null && !getInvokingSequenceMessages().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__REALIZED_FLOW:
    		return getRealizedFlow() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__REALIZATIONS:
    		return getRealizations() != null && !getRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__CONVOYED_INFORMATIONS:
    		return getConvoyedInformations() != null && !getConvoyedInformations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__SOURCE:
    		return getSource() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__TARGET:
    		return getTarget() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__REALIZING_ACTIVITY_FLOWS:
    		return getRealizingActivityFlows() != null && !getRealizingActivityFlows().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__CONTAINING_LINK:
    		return getContainingLink() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__LINK:
    		return getLink() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS:
    		return getOutgoingExchangeSpecificationRealizations() != null && !getOutgoingExchangeSpecificationRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS:
    		return getIncomingExchangeSpecificationRealizations() != null && !getIncomingExchangeSpecificationRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__KIND:
    		return getKind() != KIND_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__ORIENTED:
    		return isOriented() != ORIENTED_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__ALLOCATED_FUNCTIONAL_EXCHANGES:
    		return getAllocatedFunctionalExchanges() != null && !getAllocatedFunctionalExchanges().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__INCOMING_COMPONENT_EXCHANGE_REALIZATIONS:
    		return getIncomingComponentExchangeRealizations() != null && !getIncomingComponentExchangeRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OUTGOING_COMPONENT_EXCHANGE_REALIZATIONS:
    		return getOutgoingComponentExchangeRealizations() != null && !getOutgoingComponentExchangeRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OUTGOING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
    		return getOutgoingComponentExchangeFunctionalExchangeAllocations() != null && !getOutgoingComponentExchangeFunctionalExchangeAllocations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
    		return getOwnedComponentExchangeFunctionalExchangeAllocations() != null && !getOwnedComponentExchangeFunctionalExchangeAllocations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
    		return getOwnedComponentExchangeRealizations() != null && !getOwnedComponentExchangeRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_ENDS:
    		return getOwnedComponentExchangeEnds() != null && !getOwnedComponentExchangeEnds().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__SOURCE_PORT:
    		return getSourcePort() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__SOURCE_PART:
    		return getSourcePart() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__TARGET_PORT:
    		return getTargetPort() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__TARGET_PART:
    		return getTargetPart() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__CATEGORIES:
    		return getCategories() != null && !getCategories().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__ALLOCATOR_PHYSICAL_LINKS:
    		return getAllocatorPhysicalLinks() != null && !getAllocatorPhysicalLinks().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__REALIZED_COMPONENT_EXCHANGES:
    		return getRealizedComponentExchanges() != null && !getRealizedComponentExchanges().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__REALIZING_COMPONENT_EXCHANGES:
    		return getRealizingComponentExchanges() != null && !getRealizingComponentExchanges().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_DOC:
    		setVisibleInDoc(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_LM:
    		setVisibleInLM(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__SUMMARY:
    		setSummary(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__REVIEW:
    		setReview(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUES:
    		getOwnedPropertyValues().clear();
    		getOwnedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OWNED_ENUMERATION_PROPERTY_TYPES:
    		getOwnedEnumerationPropertyTypes().clear();
    		getOwnedEnumerationPropertyTypes().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUES:
    		getAppliedPropertyValues().clear();
    		getAppliedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUE_GROUPS:
    		getOwnedPropertyValueGroups().clear();
    		getOwnedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUE_GROUPS:
    		getAppliedPropertyValueGroups().clear();
    		getAppliedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__STATUS:
    		setStatus(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__FEATURES:
    		getFeatures().clear();
    		getFeatures().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__REALIZED_FLOW:
    		setRealizedFlow(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractInformationFlow)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__REALIZATIONS:
    		getRealizations().clear();
    		getRealizations().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__CONVOYED_INFORMATIONS:
    		getConvoyedInformations().clear();
    		getConvoyedInformations().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__SOURCE:
    		setSource(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.InformationsExchanger)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__TARGET:
    		setTarget(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.InformationsExchanger)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__LINK:
    		setLink(
    		(org.gemoc.scenario.xdsml.functionscenariomt.fa.ExchangeContainment)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__KIND:
    		setKind(
    		(org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentExchangeKind)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__ORIENTED:
    		setOriented(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
    		getOwnedComponentExchangeFunctionalExchangeAllocations().clear();
    		getOwnedComponentExchangeFunctionalExchangeAllocations().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
    		getOwnedComponentExchangeRealizations().clear();
    		getOwnedComponentExchangeRealizations().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_ENDS:
    		getOwnedComponentExchangeEnds().clear();
    		getOwnedComponentExchangeEnds().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__CATEGORIES:
    		getCategories().clear();
    		getCategories().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.TraceableElement.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__INCOMING_TRACES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.TRACEABLE_ELEMENT__INCOMING_TRACES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OUTGOING_TRACES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.TRACEABLE_ELEMENT__OUTGOING_TRACES;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.PublishableElement.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_DOC:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_DOC;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_LM:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_LM;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellaElement.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__SUMMARY:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__SUMMARY;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__DESCRIPTION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__DESCRIPTION;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__REVIEW:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__REVIEW;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OWNED_ENUMERATION_PROPERTY_TYPES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUE_GROUPS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUE_GROUPS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__STATUS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__STATUS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__FEATURES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__FEATURES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__APPLIED_REQUIREMENTS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__APPLIED_REQUIREMENTS;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.capellacore.NamedElement.class) {
    	switch (derivedFeatureID) {
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.information.AbstractEventOperation.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__INVOKING_SEQUENCE_MESSAGES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.ABSTRACT_EVENT_OPERATION__INVOKING_SEQUENCE_MESSAGES;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractRelationship.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__REALIZED_FLOW:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_RELATIONSHIP__REALIZED_FLOW;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractInformationFlow.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__REALIZATIONS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__REALIZATIONS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__CONVOYED_INFORMATIONS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__CONVOYED_INFORMATIONS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__SOURCE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__SOURCE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__TARGET:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__TARGET;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityExchange.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__REALIZING_ACTIVITY_FLOWS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__REALIZING_ACTIVITY_FLOWS;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.fa.ExchangeSpecification.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__CONTAINING_LINK:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.EXCHANGE_SPECIFICATION__CONTAINING_LINK;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__LINK:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.EXCHANGE_SPECIFICATION__LINK;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.EXCHANGE_SPECIFICATION__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.EXCHANGE_SPECIFICATION__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS;
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
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__INCOMING_TRACES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.TRACEABLE_ELEMENT__OUTGOING_TRACES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OUTGOING_TRACES;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.PublishableElement.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_DOC:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_DOC;
    		case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_LM:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_LM;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellaElement.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__SUMMARY:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__SUMMARY;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__DESCRIPTION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__DESCRIPTION;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__REVIEW:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__REVIEW;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OWNED_ENUMERATION_PROPERTY_TYPES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUE_GROUPS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUE_GROUPS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__STATUS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__STATUS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__FEATURES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__FEATURES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.CAPELLA_ELEMENT__APPLIED_REQUIREMENTS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__APPLIED_REQUIREMENTS;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.capellacore.NamedElement.class) {
    	switch (baseFeatureID) {
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.information.AbstractEventOperation.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.ABSTRACT_EVENT_OPERATION__INVOKING_SEQUENCE_MESSAGES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__INVOKING_SEQUENCE_MESSAGES;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractRelationship.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_RELATIONSHIP__REALIZED_FLOW:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__REALIZED_FLOW;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractInformationFlow.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__REALIZATIONS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__REALIZATIONS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__CONVOYED_INFORMATIONS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__CONVOYED_INFORMATIONS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__SOURCE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__SOURCE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__TARGET:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__TARGET;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityExchange.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__REALIZING_ACTIVITY_FLOWS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__REALIZING_ACTIVITY_FLOWS;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.fa.ExchangeSpecification.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.EXCHANGE_SPECIFICATION__CONTAINING_LINK:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__CONTAINING_LINK;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.EXCHANGE_SPECIFICATION__LINK:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__LINK;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.EXCHANGE_SPECIFICATION__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.EXCHANGE_SPECIFICATION__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.COMPONENT_EXCHANGE__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
