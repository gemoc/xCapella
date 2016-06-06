package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.fa.FunctionInputPort;

@SuppressWarnings("all")
public class FunctionInputPortAdapter extends EObjectAdapter<FunctionInputPort> implements org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionInputPort {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public FunctionInputPortAdapter() {
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
  public boolean isIsControlType() {
    return adaptee.isIsControlType();
  }
  
  @Override
  public void setIsControlType(final boolean o) {
    adaptee.setIsControlType(o);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.activity.ObjectNodeKind getKindOfNode() {
    return org.gemoc.scenario.xdsml.functionscenariomt.activity.ObjectNodeKind.get(adaptee.getKindOfNode().getValue());
  }
  
  @Override
  public void setKindOfNode(final org.gemoc.scenario.xdsml.functionscenariomt.activity.ObjectNodeKind o) {
    adaptee.setKindOfNode(org.polarsys.capella.common.data.activity.ObjectNodeKind.get(o.getValue()));
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.activity.ObjectNodeOrderingKind getOrdering() {
    return org.gemoc.scenario.xdsml.functionscenariomt.activity.ObjectNodeOrderingKind.get(adaptee.getOrdering().getValue());
  }
  
  @Override
  public void setOrdering(final org.gemoc.scenario.xdsml.functionscenariomt.activity.ObjectNodeOrderingKind o) {
    adaptee.setOrdering(org.polarsys.capella.common.data.activity.ObjectNodeOrderingKind.get(o.getValue()));
  }
  
  @Override
  public boolean isIsControl() {
    return adaptee.isIsControl();
  }
  
  @Override
  public void setIsControl(final boolean o) {
    adaptee.setIsControl(o);
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
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.PortRealization> */Object incomingPortRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.PortRealization> */Object getIncomingPortRealizations() {
    if (incomingPortRealizations_ == null)
    	incomingPortRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingPortRealizations(), adaptersFactory, eResource);
    return incomingPortRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.PortRealization> */Object outgoingPortRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.PortRealization> */Object getOutgoingPortRealizations() {
    if (outgoingPortRealizations_ == null)
    	outgoingPortRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingPortRealizations(), adaptersFactory, eResource);
    return outgoingPortRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.StateMachine> */Object ownedProtocols_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.capellacommon.StateMachine> */Object getOwnedProtocols() {
    if (ownedProtocols_ == null)
    	ownedProtocols_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedProtocols(), adaptersFactory, eResource);
    return ownedProtocols_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.PortAllocation> */Object incomingPortAllocations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.PortAllocation> */Object getIncomingPortAllocations() {
    if (incomingPortAllocations_ == null)
    	incomingPortAllocations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingPortAllocations(), adaptersFactory, eResource);
    return incomingPortAllocations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.PortAllocation> */Object outgoingPortAllocations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.PortAllocation> */Object getOutgoingPortAllocations() {
    if (outgoingPortAllocations_ == null)
    	outgoingPortAllocations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingPortAllocations(), adaptersFactory, eResource);
    return outgoingPortAllocations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object providedInterfaces_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object getProvidedInterfaces() {
    if (providedInterfaces_ == null)
    	providedInterfaces_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getProvidedInterfaces(), adaptersFactory, eResource);
    return providedInterfaces_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object requiredInterfaces_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.cs.Interface> */Object getRequiredInterfaces() {
    if (requiredInterfaces_ == null)
    	requiredInterfaces_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRequiredInterfaces(), adaptersFactory, eResource);
    return requiredInterfaces_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.PortRealization> */Object ownedPortRealizations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.PortRealization> */Object getOwnedPortRealizations() {
    if (ownedPortRealizations_ == null)
    	ownedPortRealizations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedPortRealizations(), adaptersFactory, eResource);
    return ownedPortRealizations_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.PortAllocation> */Object ownedPortAllocations_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.PortAllocation> */Object getOwnedPortAllocations() {
    if (ownedPortAllocations_ == null)
    	ownedPortAllocations_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedPortAllocations(), adaptersFactory, eResource);
    return ownedPortAllocations_;
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractType getAbstractType() {
    return () adaptersFactory.createAdapter(adaptee.getAbstractType(), eResource);
  }
  
  @Override
  public void setAbstractType(final org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractType o) {
    if (o != null)
    	adaptee.setAbstractType(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractTypeAdapter) o).getAdaptee());
    else adaptee.setAbstractType(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Type getType() {
    return () adaptersFactory.createAdapter(adaptee.getType(), eResource);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentPort getRepresentedComponentPort() {
    return () adaptersFactory.createAdapter(adaptee.getRepresentedComponentPort(), eResource);
  }
  
  @Override
  public void setRepresentedComponentPort(final org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentPort o) {
    if (o != null)
    	adaptee.setRepresentedComponentPort(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentPortAdapter) o).getAdaptee());
    else adaptee.setRepresentedComponentPort(null);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentPort> */Object allocatorComponentPorts_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentPort> */Object getAllocatorComponentPorts() {
    if (allocatorComponentPorts_ == null)
    	allocatorComponentPorts_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAllocatorComponentPorts(), adaptersFactory, eResource);
    return allocatorComponentPorts_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionPort> */Object realizedFunctionPorts_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionPort> */Object getRealizedFunctionPorts() {
    if (realizedFunctionPorts_ == null)
    	realizedFunctionPorts_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizedFunctionPorts(), adaptersFactory, eResource);
    return realizedFunctionPorts_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionPort> */Object realizingFunctionPorts_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionPort> */Object getRealizingFunctionPorts() {
    if (realizingFunctionPorts_ == null)
    	realizingFunctionPorts_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getRealizingFunctionPorts(), adaptersFactory, eResource);
    return realizingFunctionPorts_;
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
  public org.gemoc.scenario.xdsml.functionscenariomt.activity.InterruptibleActivityRegion getInStructuredNode() {
    return () adaptersFactory.createAdapter(adaptee.getInStructuredNode(), eResource);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityEdge> */Object outgoing_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityEdge> */Object getOutgoing() {
    if (outgoing_ == null)
    	outgoing_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoing(), adaptersFactory, eResource);
    return outgoing_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityEdge> */Object incoming_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityEdge> */Object getIncoming() {
    if (incoming_ == null)
    	incoming_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncoming(), adaptersFactory, eResource);
    return incoming_;
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ValueSpecification getUpperBound() {
    return () adaptersFactory.createAdapter(adaptee.getUpperBound(), eResource);
  }
  
  @Override
  public void setUpperBound(final org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ValueSpecification o) {
    if (o != null)
    	adaptee.setUpperBound(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.ValueSpecificationAdapter) o).getAdaptee());
    else adaptee.setUpperBound(null);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.IState> */Object inState_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.IState> */Object getInState() {
    if (inState_ == null)
    	inState_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInState(), adaptersFactory, eResource);
    return inState_;
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
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.activity.AbstractAction getInputEvaluationAction() {
    return () adaptersFactory.createAdapter(adaptee.getInputEvaluationAction(), eResource);
  }
  
  @Override
  public void setInputEvaluationAction(final org.gemoc.scenario.xdsml.functionscenariomt.activity.AbstractAction o) {
    if (o != null)
    	adaptee.setInputEvaluationAction(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.AbstractActionAdapter) o).getAdaptee());
    else adaptee.setInputEvaluationAction(null);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.ExchangeItem> */Object incomingExchangeItems_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.information.ExchangeItem> */Object getIncomingExchangeItems() {
    if (incomingExchangeItems_ == null)
    	incomingExchangeItems_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingExchangeItems(), adaptersFactory, eResource);
    return incomingExchangeItems_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalExchange> */Object incomingFunctionalExchanges_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.fa.FunctionalExchange> */Object getIncomingFunctionalExchanges() {
    if (incomingFunctionalExchanges_ == null)
    	incomingFunctionalExchanges_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingFunctionalExchanges(), adaptersFactory, eResource);
    return incomingFunctionalExchanges_;
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
  
  protected final static boolean IS_CONTROL_TYPE_EDEFAULT = false;
  
  protected final static org.gemoc.scenario.xdsml.functionscenariomt.activity.ObjectNodeKind KIND_OF_NODE_EDEFAULT = org.gemoc.scenario.xdsml.functionscenariomt.activity.ObjectNodeKind.UNSPECIFIED;
  
  protected final static org.gemoc.scenario.xdsml.functionscenariomt.activity.ObjectNodeOrderingKind ORDERING_EDEFAULT = org.gemoc.scenario.xdsml.functionscenariomt.activity.ObjectNodeOrderingKind.FIFO;
  
  protected final static boolean IS_CONTROL_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.eINSTANCE.getFunctionInputPort();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__NAME:
    		return getName();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__INCOMING_TRACES:
    		return getIncomingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OUTGOING_TRACES:
    		return getOutgoingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__VISIBLE_IN_DOC:
    		return isVisibleInDoc() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__VISIBLE_IN_LM:
    		return isVisibleInLM() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__SUMMARY:
    		return getSummary();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__DESCRIPTION:
    		return getDescription();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__REVIEW:
    		return getReview();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__STATUS:
    		return getStatus();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__FEATURES:
    		return getFeatures();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__INCOMING_PORT_REALIZATIONS:
    		return getIncomingPortRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OUTGOING_PORT_REALIZATIONS:
    		return getOutgoingPortRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OWNED_PROTOCOLS:
    		return getOwnedProtocols();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__INCOMING_PORT_ALLOCATIONS:
    		return getIncomingPortAllocations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OUTGOING_PORT_ALLOCATIONS:
    		return getOutgoingPortAllocations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__PROVIDED_INTERFACES:
    		return getProvidedInterfaces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__REQUIRED_INTERFACES:
    		return getRequiredInterfaces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OWNED_PORT_REALIZATIONS:
    		return getOwnedPortRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OWNED_PORT_ALLOCATIONS:
    		return getOwnedPortAllocations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__ABSTRACT_TYPE:
    		return getAbstractType();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__TYPE:
    		return getType();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__REPRESENTED_COMPONENT_PORT:
    		return getRepresentedComponentPort();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__ALLOCATOR_COMPONENT_PORTS:
    		return getAllocatorComponentPorts();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__REALIZED_FUNCTION_PORTS:
    		return getRealizedFunctionPorts();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__REALIZING_FUNCTION_PORTS:
    		return getRealizingFunctionPorts();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__IN_ACTIVITY_PARTITION:
    		return getInActivityPartition();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__IN_INTERRUPTIBLE_REGION:
    		return getInInterruptibleRegion();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__IN_STRUCTURED_NODE:
    		return getInStructuredNode();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OUTGOING:
    		return getOutgoing();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__INCOMING:
    		return getIncoming();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__IS_CONTROL_TYPE:
    		return isIsControlType() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__KIND_OF_NODE:
    		return getKindOfNode();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__ORDERING:
    		return getOrdering();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__UPPER_BOUND:
    		return getUpperBound();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__IN_STATE:
    		return getInState();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__SELECTION:
    		return getSelection();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__IS_CONTROL:
    		return isIsControl() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__INPUT_EVALUATION_ACTION:
    		return getInputEvaluationAction();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__INCOMING_EXCHANGE_ITEMS:
    		return getIncomingExchangeItems();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__INCOMING_FUNCTIONAL_EXCHANGES:
    		return getIncomingFunctionalExchanges();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__INCOMING_TRACES:
    		return getIncomingTraces() != null && !getIncomingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OUTGOING_TRACES:
    		return getOutgoingTraces() != null && !getOutgoingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__VISIBLE_IN_DOC:
    		return isVisibleInDoc() != VISIBLE_IN_DOC_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__VISIBLE_IN_LM:
    		return isVisibleInLM() != VISIBLE_IN_LM_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__SUMMARY:
    		return getSummary() != SUMMARY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__DESCRIPTION:
    		return getDescription() != DESCRIPTION_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__REVIEW:
    		return getReview() != REVIEW_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OWNED_PROPERTY_VALUES:
    		return getOwnedPropertyValues() != null && !getOwnedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OWNED_ENUMERATION_PROPERTY_TYPES:
    		return getOwnedEnumerationPropertyTypes() != null && !getOwnedEnumerationPropertyTypes().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__APPLIED_PROPERTY_VALUES:
    		return getAppliedPropertyValues() != null && !getAppliedPropertyValues().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OWNED_PROPERTY_VALUE_GROUPS:
    		return getOwnedPropertyValueGroups() != null && !getOwnedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__APPLIED_PROPERTY_VALUE_GROUPS:
    		return getAppliedPropertyValueGroups() != null && !getAppliedPropertyValueGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__STATUS:
    		return getStatus() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__FEATURES:
    		return getFeatures() != null && !getFeatures().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__APPLIED_REQUIREMENTS:
    		return getAppliedRequirements() != null && !getAppliedRequirements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__INCOMING_PORT_REALIZATIONS:
    		return getIncomingPortRealizations() != null && !getIncomingPortRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OUTGOING_PORT_REALIZATIONS:
    		return getOutgoingPortRealizations() != null && !getOutgoingPortRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OWNED_PROTOCOLS:
    		return getOwnedProtocols() != null && !getOwnedProtocols().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__INCOMING_PORT_ALLOCATIONS:
    		return getIncomingPortAllocations() != null && !getIncomingPortAllocations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OUTGOING_PORT_ALLOCATIONS:
    		return getOutgoingPortAllocations() != null && !getOutgoingPortAllocations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__PROVIDED_INTERFACES:
    		return getProvidedInterfaces() != null && !getProvidedInterfaces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__REQUIRED_INTERFACES:
    		return getRequiredInterfaces() != null && !getRequiredInterfaces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OWNED_PORT_REALIZATIONS:
    		return getOwnedPortRealizations() != null && !getOwnedPortRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OWNED_PORT_ALLOCATIONS:
    		return getOwnedPortAllocations() != null && !getOwnedPortAllocations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__ABSTRACT_TYPE:
    		return getAbstractType() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__TYPE:
    		return getType() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__REPRESENTED_COMPONENT_PORT:
    		return getRepresentedComponentPort() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__ALLOCATOR_COMPONENT_PORTS:
    		return getAllocatorComponentPorts() != null && !getAllocatorComponentPorts().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__REALIZED_FUNCTION_PORTS:
    		return getRealizedFunctionPorts() != null && !getRealizedFunctionPorts().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__REALIZING_FUNCTION_PORTS:
    		return getRealizingFunctionPorts() != null && !getRealizingFunctionPorts().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__IN_ACTIVITY_PARTITION:
    		return getInActivityPartition() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__IN_INTERRUPTIBLE_REGION:
    		return getInInterruptibleRegion() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__IN_STRUCTURED_NODE:
    		return getInStructuredNode() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OUTGOING:
    		return getOutgoing() != null && !getOutgoing().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__INCOMING:
    		return getIncoming() != null && !getIncoming().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__IS_CONTROL_TYPE:
    		return isIsControlType() != IS_CONTROL_TYPE_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__KIND_OF_NODE:
    		return getKindOfNode() != KIND_OF_NODE_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__ORDERING:
    		return getOrdering() != ORDERING_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__UPPER_BOUND:
    		return getUpperBound() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__IN_STATE:
    		return getInState() != null && !getInState().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__SELECTION:
    		return getSelection() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__IS_CONTROL:
    		return isIsControl() != IS_CONTROL_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__INPUT_EVALUATION_ACTION:
    		return getInputEvaluationAction() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__INCOMING_EXCHANGE_ITEMS:
    		return getIncomingExchangeItems() != null && !getIncomingExchangeItems().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__INCOMING_FUNCTIONAL_EXCHANGES:
    		return getIncomingFunctionalExchanges() != null && !getIncomingFunctionalExchanges().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__VISIBLE_IN_DOC:
    		setVisibleInDoc(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__VISIBLE_IN_LM:
    		setVisibleInLM(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__SUMMARY:
    		setSummary(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__DESCRIPTION:
    		setDescription(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__REVIEW:
    		setReview(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OWNED_PROPERTY_VALUES:
    		getOwnedPropertyValues().clear();
    		getOwnedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OWNED_ENUMERATION_PROPERTY_TYPES:
    		getOwnedEnumerationPropertyTypes().clear();
    		getOwnedEnumerationPropertyTypes().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__APPLIED_PROPERTY_VALUES:
    		getAppliedPropertyValues().clear();
    		getAppliedPropertyValues().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OWNED_PROPERTY_VALUE_GROUPS:
    		getOwnedPropertyValueGroups().clear();
    		getOwnedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__APPLIED_PROPERTY_VALUE_GROUPS:
    		getAppliedPropertyValueGroups().clear();
    		getAppliedPropertyValueGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__STATUS:
    		setStatus(
    		(org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__FEATURES:
    		getFeatures().clear();
    		getFeatures().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OWNED_PROTOCOLS:
    		getOwnedProtocols().clear();
    		getOwnedProtocols().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__PROVIDED_INTERFACES:
    		getProvidedInterfaces().clear();
    		getProvidedInterfaces().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__REQUIRED_INTERFACES:
    		getRequiredInterfaces().clear();
    		getRequiredInterfaces().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OWNED_PORT_REALIZATIONS:
    		getOwnedPortRealizations().clear();
    		getOwnedPortRealizations().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OWNED_PORT_ALLOCATIONS:
    		getOwnedPortAllocations().clear();
    		getOwnedPortAllocations().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__ABSTRACT_TYPE:
    		setAbstractType(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractType)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__REPRESENTED_COMPONENT_PORT:
    		setRepresentedComponentPort(
    		(org.gemoc.scenario.xdsml.functionscenariomt.fa.ComponentPort)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__IS_CONTROL_TYPE:
    		setIsControlType(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__KIND_OF_NODE:
    		setKindOfNode(
    		(org.gemoc.scenario.xdsml.functionscenariomt.activity.ObjectNodeKind)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__ORDERING:
    		setOrdering(
    		(org.gemoc.scenario.xdsml.functionscenariomt.activity.ObjectNodeOrderingKind)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__UPPER_BOUND:
    		setUpperBound(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ValueSpecification)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__IN_STATE:
    		getInState().clear();
    		getInState().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__SELECTION:
    		setSelection(
    		(org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractBehavior)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__IS_CONTROL:
    		setIsControl(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__INPUT_EVALUATION_ACTION:
    		setInputEvaluationAction(
    		(org.gemoc.scenario.xdsml.functionscenariomt.activity.AbstractAction)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__INCOMING_EXCHANGE_ITEMS:
    		getIncomingExchangeItems().clear();
    		getIncomingExchangeItems().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityNode.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__IN_ACTIVITY_PARTITION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_NODE__IN_ACTIVITY_PARTITION;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__IN_INTERRUPTIBLE_REGION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__IN_STRUCTURED_NODE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OUTGOING:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_NODE__OUTGOING;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__INCOMING:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_NODE__INCOMING;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.activity.ObjectNode.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__IS_CONTROL_TYPE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_NODE__IS_CONTROL_TYPE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__KIND_OF_NODE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_NODE__KIND_OF_NODE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__ORDERING:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_NODE__ORDERING;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__UPPER_BOUND:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_NODE__UPPER_BOUND;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__IN_STATE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_NODE__IN_STATE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__SELECTION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_NODE__SELECTION;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.activity.Pin.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__IS_CONTROL:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.PIN__IS_CONTROL;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.activity.InputPin.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__INPUT_EVALUATION_ACTION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INPUT_PIN__INPUT_EVALUATION_ACTION;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityNode.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_NODE__IN_ACTIVITY_PARTITION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__IN_ACTIVITY_PARTITION;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__IN_INTERRUPTIBLE_REGION;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__IN_STRUCTURED_NODE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_NODE__OUTGOING:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__OUTGOING;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_NODE__INCOMING:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__INCOMING;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.activity.ObjectNode.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_NODE__IS_CONTROL_TYPE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__IS_CONTROL_TYPE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_NODE__KIND_OF_NODE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__KIND_OF_NODE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_NODE__ORDERING:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__ORDERING;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_NODE__UPPER_BOUND:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__UPPER_BOUND;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_NODE__IN_STATE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__IN_STATE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_NODE__SELECTION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__SELECTION;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.activity.Pin.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.PIN__IS_CONTROL:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__IS_CONTROL;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.activity.InputPin.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INPUT_PIN__INPUT_EVALUATION_ACTION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.fa.FaPackage.FUNCTION_INPUT_PORT__INPUT_EVALUATION_ACTION;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
