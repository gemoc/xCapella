package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.common.data.activity.SendSignalAction;

@SuppressWarnings("all")
public class SendSignalActionAdapter extends EObjectAdapter<SendSignalAction> implements org.gemoc.scenario.xdsml.functionscenariomt.activity.SendSignalAction {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public SendSignalActionAdapter() {
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
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.ExceptionHandler> */Object ownedHandlers_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.ExceptionHandler> */Object getOwnedHandlers() {
    if (ownedHandlers_ == null)
    	ownedHandlers_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedHandlers(), adaptersFactory, eResource);
    return ownedHandlers_;
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractConstraint getLocalPrecondition() {
    return () adaptersFactory.createAdapter(adaptee.getLocalPrecondition(), eResource);
  }
  
  @Override
  public void setLocalPrecondition(final org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractConstraint o) {
    if (o != null)
    	adaptee.setLocalPrecondition(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractConstraintAdapter) o).getAdaptee());
    else adaptee.setLocalPrecondition(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractConstraint getLocalPostcondition() {
    return () adaptersFactory.createAdapter(adaptee.getLocalPostcondition(), eResource);
  }
  
  @Override
  public void setLocalPostcondition(final org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractConstraint o) {
    if (o != null)
    	adaptee.setLocalPostcondition(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractConstraintAdapter) o).getAdaptee());
    else adaptee.setLocalPostcondition(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractType getContext() {
    return () adaptersFactory.createAdapter(adaptee.getContext(), eResource);
  }
  
  @Override
  public void setContext(final org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractType o) {
    if (o != null)
    	adaptee.setContext(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractTypeAdapter) o).getAdaptee());
    else adaptee.setContext(null);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.InputPin> */Object inputs_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.InputPin> */Object getInputs() {
    if (inputs_ == null)
    	inputs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInputs(), adaptersFactory, eResource);
    return inputs_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.OutputPin> */Object outputs_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.OutputPin> */Object getOutputs() {
    if (outputs_ == null)
    	outputs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutputs(), adaptersFactory, eResource);
    return outputs_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.InputPin> */Object arguments_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.InputPin> */Object getArguments() {
    if (arguments_ == null)
    	arguments_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getArguments(), adaptersFactory, eResource);
    return arguments_;
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.activity.InputPin getTarget() {
    return () adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final org.gemoc.scenario.xdsml.functionscenariomt.activity.InputPin o) {
    if (o != null)
    	adaptee.setTarget(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.InputPinAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractSignal getSignal() {
    return () adaptersFactory.createAdapter(adaptee.getSignal(), eResource);
  }
  
  @Override
  public void setSignal(final org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractSignal o) {
    if (o != null)
    	adaptee.setSignal(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractSignalAdapter) o).getAdaptee());
    else adaptee.setSignal(null);
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
  
  @Override
  public EClass eClass() {
    return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.eINSTANCE.getSendSignalAction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__NAME:
    		return getName();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__IN_ACTIVITY_PARTITION:
    		return getInActivityPartition();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__IN_INTERRUPTIBLE_REGION:
    		return getInInterruptibleRegion();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__IN_STRUCTURED_NODE:
    		return getInStructuredNode();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__OUTGOING:
    		return getOutgoing();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__INCOMING:
    		return getIncoming();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__OWNED_HANDLERS:
    		return getOwnedHandlers();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__LOCAL_PRECONDITION:
    		return getLocalPrecondition();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__LOCAL_POSTCONDITION:
    		return getLocalPostcondition();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__CONTEXT:
    		return getContext();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__INPUTS:
    		return getInputs();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__OUTPUTS:
    		return getOutputs();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__ARGUMENTS:
    		return getArguments();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__TARGET:
    		return getTarget();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__SIGNAL:
    		return getSignal();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__IN_ACTIVITY_PARTITION:
    		return getInActivityPartition() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__IN_INTERRUPTIBLE_REGION:
    		return getInInterruptibleRegion() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__IN_STRUCTURED_NODE:
    		return getInStructuredNode() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__OUTGOING:
    		return getOutgoing() != null && !getOutgoing().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__INCOMING:
    		return getIncoming() != null && !getIncoming().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__OWNED_HANDLERS:
    		return getOwnedHandlers() != null && !getOwnedHandlers().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__LOCAL_PRECONDITION:
    		return getLocalPrecondition() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__LOCAL_POSTCONDITION:
    		return getLocalPostcondition() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__CONTEXT:
    		return getContext() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__INPUTS:
    		return getInputs() != null && !getInputs().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__OUTPUTS:
    		return getOutputs() != null && !getOutputs().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__ARGUMENTS:
    		return getArguments() != null && !getArguments().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__TARGET:
    		return getTarget() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__SIGNAL:
    		return getSignal() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__OWNED_HANDLERS:
    		getOwnedHandlers().clear();
    		getOwnedHandlers().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__LOCAL_PRECONDITION:
    		setLocalPrecondition(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractConstraint)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__LOCAL_POSTCONDITION:
    		setLocalPostcondition(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractConstraint)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__CONTEXT:
    		setContext(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractType)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__INPUTS:
    		getInputs().clear();
    		getInputs().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__OUTPUTS:
    		getOutputs().clear();
    		getOutputs().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__ARGUMENTS:
    		getArguments().clear();
    		getArguments().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__TARGET:
    		setTarget(
    		(org.gemoc.scenario.xdsml.functionscenariomt.activity.InputPin)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.SEND_SIGNAL_ACTION__SIGNAL:
    		setSignal(
    		(org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractSignal)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
