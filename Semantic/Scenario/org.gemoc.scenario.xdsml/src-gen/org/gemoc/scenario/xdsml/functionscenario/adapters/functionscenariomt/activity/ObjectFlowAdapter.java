package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.common.data.activity.ObjectFlow;

@SuppressWarnings("all")
public class ObjectFlowAdapter extends EObjectAdapter<ObjectFlow> implements org.gemoc.scenario.xdsml.functionscenariomt.activity.ObjectFlow {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public ObjectFlowAdapter() {
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
  
  protected final static org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.RateKind KIND_OF_RATE_EDEFAULT = org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.RateKind.UNSPECIFIED;
  
  protected final static boolean IS_MULTICAST_EDEFAULT = false;
  
  protected final static boolean IS_MULTIRECEIVE_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.eINSTANCE.getObjectFlow();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__REALIZED_FLOW:
    		return getRealizedFlow();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__KIND_OF_RATE:
    		return getKindOfRate();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__IN_ACTIVITY_PARTITION:
    		return getInActivityPartition();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__IN_INTERRUPTIBLE_REGION:
    		return getInInterruptibleRegion();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__IN_STRUCTURED_NODE:
    		return getInStructuredNode();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__RATE:
    		return getRate();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__PROBABILITY:
    		return getProbability();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__TARGET:
    		return getTarget();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__SOURCE:
    		return getSource();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__GUARD:
    		return getGuard();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__WEIGHT:
    		return getWeight();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__INTERRUPTS:
    		return getInterrupts();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__IS_MULTICAST:
    		return isIsMulticast() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__IS_MULTIRECEIVE:
    		return isIsMultireceive() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__TRANSFORMATION:
    		return getTransformation();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__SELECTION:
    		return getSelection();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__REALIZED_FLOW:
    		return getRealizedFlow() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__KIND_OF_RATE:
    		return getKindOfRate() != KIND_OF_RATE_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__IN_ACTIVITY_PARTITION:
    		return getInActivityPartition() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__IN_INTERRUPTIBLE_REGION:
    		return getInInterruptibleRegion() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__IN_STRUCTURED_NODE:
    		return getInStructuredNode() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__RATE:
    		return getRate() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__PROBABILITY:
    		return getProbability() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__TARGET:
    		return getTarget() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__SOURCE:
    		return getSource() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__GUARD:
    		return getGuard() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__WEIGHT:
    		return getWeight() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__INTERRUPTS:
    		return getInterrupts() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__IS_MULTICAST:
    		return isIsMulticast() != IS_MULTICAST_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__IS_MULTIRECEIVE:
    		return isIsMultireceive() != IS_MULTIRECEIVE_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__TRANSFORMATION:
    		return getTransformation() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__SELECTION:
    		return getSelection() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__REALIZED_FLOW:
    		setRealizedFlow(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractInformationFlow)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__KIND_OF_RATE:
    		setKindOfRate(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.RateKind)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__RATE:
    		setRate(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ValueSpecification)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__PROBABILITY:
    		setProbability(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ValueSpecification)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__TARGET:
    		setTarget(
    		(org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityNode)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__SOURCE:
    		setSource(
    		(org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityNode)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__GUARD:
    		setGuard(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ValueSpecification)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__WEIGHT:
    		setWeight(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ValueSpecification)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__INTERRUPTS:
    		setInterrupts(
    		(org.gemoc.scenario.xdsml.functionscenariomt.activity.InterruptibleActivityRegion)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__IS_MULTICAST:
    		setIsMulticast(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__IS_MULTIRECEIVE:
    		setIsMultireceive(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__TRANSFORMATION:
    		setTransformation(
    		(org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractBehavior)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.OBJECT_FLOW__SELECTION:
    		setSelection(
    		(org.gemoc.scenario.xdsml.functionscenariomt.behavior.AbstractBehavior)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
