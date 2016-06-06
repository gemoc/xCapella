package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.common.data.activity.ValuePin;

@SuppressWarnings("all")
public class ValuePinAdapter extends EObjectAdapter<ValuePin> implements org.gemoc.scenario.xdsml.functionscenariomt.activity.ValuePin {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public ValuePinAdapter() {
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
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ValueSpecification getValue() {
    return () adaptersFactory.createAdapter(adaptee.getValue(), eResource);
  }
  
  @Override
  public void setValue(final org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ValueSpecification o) {
    if (o != null)
    	adaptee.setValue(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.ValueSpecificationAdapter) o).getAdaptee());
    else adaptee.setValue(null);
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
  
  protected final static boolean IS_CONTROL_TYPE_EDEFAULT = false;
  
  protected final static org.gemoc.scenario.xdsml.functionscenariomt.activity.ObjectNodeKind KIND_OF_NODE_EDEFAULT = org.gemoc.scenario.xdsml.functionscenariomt.activity.ObjectNodeKind.UNSPECIFIED;
  
  protected final static org.gemoc.scenario.xdsml.functionscenariomt.activity.ObjectNodeOrderingKind ORDERING_EDEFAULT = org.gemoc.scenario.xdsml.functionscenariomt.activity.ObjectNodeOrderingKind.FIFO;
  
  protected final static boolean IS_CONTROL_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.eINSTANCE.getValuePin();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__NAME:
    		return getName();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__IN_ACTIVITY_PARTITION:
    		return getInActivityPartition();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__IN_INTERRUPTIBLE_REGION:
    		return getInInterruptibleRegion();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__IN_STRUCTURED_NODE:
    		return getInStructuredNode();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__OUTGOING:
    		return getOutgoing();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__INCOMING:
    		return getIncoming();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__ABSTRACT_TYPE:
    		return getAbstractType();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__IS_CONTROL_TYPE:
    		return isIsControlType() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__KIND_OF_NODE:
    		return getKindOfNode();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__ORDERING:
    		return getOrdering();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__UPPER_BOUND:
    		return getUpperBound();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__IN_STATE:
    		return getInState();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__SELECTION:
    		return getSelection();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__IS_CONTROL:
    		return isIsControl() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__INPUT_EVALUATION_ACTION:
    		return getInputEvaluationAction();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__IN_ACTIVITY_PARTITION:
    		return getInActivityPartition() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__IN_INTERRUPTIBLE_REGION:
    		return getInInterruptibleRegion() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__IN_STRUCTURED_NODE:
    		return getInStructuredNode() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__OUTGOING:
    		return getOutgoing() != null && !getOutgoing().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__INCOMING:
    		return getIncoming() != null && !getIncoming().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__ABSTRACT_TYPE:
    		return getAbstractType() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__IS_CONTROL_TYPE:
    		return isIsControlType() != IS_CONTROL_TYPE_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__KIND_OF_NODE:
    		return getKindOfNode() != KIND_OF_NODE_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__ORDERING:
    		return getOrdering() != ORDERING_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__UPPER_BOUND:
    		return getUpperBound() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__IN_STATE:
    		return getInState() != null && !getInState().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__SELECTION:
    		return getSelection() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__IS_CONTROL:
    		return isIsControl() != IS_CONTROL_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__INPUT_EVALUATION_ACTION:
    		return getInputEvaluationAction() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__VALUE:
    		return getValue() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__ABSTRACT_TYPE:
    		setAbstractType(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractType)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__IS_CONTROL_TYPE:
    		setIsControlType(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__KIND_OF_NODE:
    		setKindOfNode(
    		(org.gemoc.scenario.xdsml.functionscenariomt.activity.ObjectNodeKind)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__ORDERING:
    		setOrdering(
    		(org.gemoc.scenario.xdsml.functionscenariomt.activity.ObjectNodeOrderingKind)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__UPPER_BOUND:
    		setUpperBound(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ValueSpecification)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__IN_STATE:
    		getInState().clear();
    		getInState().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__SELECTION:
    		setSelection(
    		(org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractBehavior)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__IS_CONTROL:
    		setIsControl(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__INPUT_EVALUATION_ACTION:
    		setInputEvaluationAction(
    		(org.gemoc.scenario.xdsml.functionscenariomt.activity.AbstractAction)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.VALUE_PIN__VALUE:
    		setValue(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ValueSpecification)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
