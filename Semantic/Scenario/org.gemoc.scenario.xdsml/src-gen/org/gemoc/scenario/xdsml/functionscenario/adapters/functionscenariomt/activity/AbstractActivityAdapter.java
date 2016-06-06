package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.common.data.activity.AbstractActivity;

@SuppressWarnings("all")
public class AbstractActivityAdapter extends EObjectAdapter<AbstractActivity> implements org.gemoc.scenario.xdsml.functionscenariomt.activity.AbstractActivity {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public AbstractActivityAdapter() {
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
  
  protected final static boolean IS_CONTROL_OPERATOR_EDEFAULT = false;
  
  protected final static boolean IS_READ_ONLY_EDEFAULT = false;
  
  protected final static boolean IS_SINGLE_EXECUTION_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.eINSTANCE.getAbstractActivity();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__NAME:
    		return getName();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__IS_CONTROL_OPERATOR:
    		return isIsControlOperator() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_PARAMETER_SET:
    		return getOwnedParameterSet();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_PARAMETER:
    		return getOwnedParameter();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__INCOMING_TRACES:
    		return getIncomingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OUTGOING_TRACES:
    		return getOutgoingTraces();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__IS_READ_ONLY:
    		return isIsReadOnly() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__IS_SINGLE_EXECUTION:
    		return isIsSingleExecution() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_NODES:
    		return getOwnedNodes();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_EDGES:
    		return getOwnedEdges();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_GROUPS:
    		return getOwnedGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_STRUCTURED_NODES:
    		return getOwnedStructuredNodes();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__IS_CONTROL_OPERATOR:
    		return isIsControlOperator() != IS_CONTROL_OPERATOR_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_PARAMETER_SET:
    		return getOwnedParameterSet() != null && !getOwnedParameterSet().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_PARAMETER:
    		return getOwnedParameter() != null && !getOwnedParameter().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__INCOMING_TRACES:
    		return getIncomingTraces() != null && !getIncomingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OUTGOING_TRACES:
    		return getOutgoingTraces() != null && !getOutgoingTraces().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__IS_READ_ONLY:
    		return isIsReadOnly() != IS_READ_ONLY_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__IS_SINGLE_EXECUTION:
    		return isIsSingleExecution() != IS_SINGLE_EXECUTION_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_NODES:
    		return getOwnedNodes() != null && !getOwnedNodes().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_EDGES:
    		return getOwnedEdges() != null && !getOwnedEdges().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_GROUPS:
    		return getOwnedGroups() != null && !getOwnedGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_STRUCTURED_NODES:
    		return getOwnedStructuredNodes() != null && !getOwnedStructuredNodes().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__IS_CONTROL_OPERATOR:
    		setIsControlOperator(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_PARAMETER_SET:
    		getOwnedParameterSet().clear();
    		getOwnedParameterSet().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_PARAMETER:
    		getOwnedParameter().clear();
    		getOwnedParameter().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__IS_READ_ONLY:
    		setIsReadOnly(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__IS_SINGLE_EXECUTION:
    		setIsSingleExecution(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_NODES:
    		getOwnedNodes().clear();
    		getOwnedNodes().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_EDGES:
    		getOwnedEdges().clear();
    		getOwnedEdges().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OWNED_GROUPS:
    		getOwnedGroups().clear();
    		getOwnedGroups().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
    if (baseClass == org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.TraceableElement.class) {
    	switch (derivedFeatureID) {
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__INCOMING_TRACES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.TRACEABLE_ELEMENT__INCOMING_TRACES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OUTGOING_TRACES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.TRACEABLE_ELEMENT__OUTGOING_TRACES;
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
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__INCOMING_TRACES;
    		case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.TRACEABLE_ELEMENT__OUTGOING_TRACES:
    			return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ABSTRACT_ACTIVITY__OUTGOING_TRACES;
    		default: return -1;
    	}
    }
    
    
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }
}
