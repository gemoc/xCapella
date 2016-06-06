package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.common.data.activity.StructuredActivityNode;

@SuppressWarnings("all")
public class StructuredActivityNodeAdapter extends EObjectAdapter<StructuredActivityNode> implements org.gemoc.scenario.xdsml.functionscenariomt.activity.StructuredActivityNode {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public StructuredActivityNodeAdapter() {
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
  public org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityGroup getSuperGroup() {
    return () adaptersFactory.createAdapter(adaptee.getSuperGroup(), eResource);
  }
  
  @Override
  public void setSuperGroup(final org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityGroup o) {
    if (o != null)
    	adaptee.setSuperGroup(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ActivityGroupAdapter) o).getAdaptee());
    else adaptee.setSuperGroup(null);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityGroup> */Object subGroups_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityGroup> */Object getSubGroups() {
    if (subGroups_ == null)
    	subGroups_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSubGroups(), adaptersFactory, eResource);
    return subGroups_;
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
    return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.eINSTANCE.getStructuredActivityNode();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP:
    		return getSuperGroup();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__SUB_GROUPS:
    		return getSubGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__OWNED_NODES:
    		return getOwnedNodes();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__OWNED_EDGES:
    		return getOwnedEdges();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__NAME:
    		return getName();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY_PARTITION:
    		return getInActivityPartition();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
    		return getInInterruptibleRegion();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE:
    		return getInStructuredNode();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING:
    		return getOutgoing();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__INCOMING:
    		return getIncoming();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__OWNED_HANDLERS:
    		return getOwnedHandlers();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION:
    		return getLocalPrecondition();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION:
    		return getLocalPostcondition();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__CONTEXT:
    		return getContext();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__INPUTS:
    		return getInputs();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__OUTPUTS:
    		return getOutputs();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP:
    		return getSuperGroup() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__SUB_GROUPS:
    		return getSubGroups() != null && !getSubGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__OWNED_NODES:
    		return getOwnedNodes() != null && !getOwnedNodes().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__OWNED_EDGES:
    		return getOwnedEdges() != null && !getOwnedEdges().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY_PARTITION:
    		return getInActivityPartition() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
    		return getInInterruptibleRegion() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE:
    		return getInStructuredNode() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING:
    		return getOutgoing() != null && !getOutgoing().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__INCOMING:
    		return getIncoming() != null && !getIncoming().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__OWNED_HANDLERS:
    		return getOwnedHandlers() != null && !getOwnedHandlers().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION:
    		return getLocalPrecondition() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION:
    		return getLocalPostcondition() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__CONTEXT:
    		return getContext() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__INPUTS:
    		return getInputs() != null && !getInputs().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__OUTPUTS:
    		return getOutputs() != null && !getOutputs().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP:
    		setSuperGroup(
    		(org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityGroup)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__SUB_GROUPS:
    		getSubGroups().clear();
    		getSubGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__OWNED_NODES:
    		getOwnedNodes().clear();
    		getOwnedNodes().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__OWNED_EDGES:
    		getOwnedEdges().clear();
    		getOwnedEdges().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__OWNED_HANDLERS:
    		getOwnedHandlers().clear();
    		getOwnedHandlers().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION:
    		setLocalPrecondition(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractConstraint)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION:
    		setLocalPostcondition(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractConstraint)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__CONTEXT:
    		setContext(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractType)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__INPUTS:
    		getInputs().clear();
    		getInputs().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__OUTPUTS:
    		getOutputs().clear();
    		getOutputs().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractNamedElement.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__NAME:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__NAME;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityNode.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY_PARTITION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_NODE__IN_ACTIVITY_PARTITION;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_NODE__OUTGOING;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__INCOMING:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_NODE__INCOMING;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.activity.ExecutableNode.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__OWNED_HANDLERS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.EXECUTABLE_NODE__OWNED_HANDLERS;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.activity.AbstractAction.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTION__LOCAL_PRECONDITION;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTION__LOCAL_POSTCONDITION;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__CONTEXT:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTION__CONTEXT;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__INPUTS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTION__INPUTS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__OUTPUTS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTION__OUTPUTS;
    		default: return -1;
    	}
    }
    
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }
  
  @Override
  public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractNamedElement.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__NAME:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__NAME;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityNode.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_NODE__IN_ACTIVITY_PARTITION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY_PARTITION;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_NODE__OUTGOING:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_NODE__INCOMING:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__INCOMING;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.activity.ExecutableNode.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.EXECUTABLE_NODE__OWNED_HANDLERS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__OWNED_HANDLERS;
    		default: return -1;
    	}
    }
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.activity.AbstractAction.class) {
    	switch (baseFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTION__LOCAL_PRECONDITION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTION__LOCAL_POSTCONDITION:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTION__CONTEXT:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__CONTEXT;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTION__INPUTS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__INPUTS;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTION__OUTPUTS:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.STRUCTURED_ACTIVITY_NODE__OUTPUTS;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
