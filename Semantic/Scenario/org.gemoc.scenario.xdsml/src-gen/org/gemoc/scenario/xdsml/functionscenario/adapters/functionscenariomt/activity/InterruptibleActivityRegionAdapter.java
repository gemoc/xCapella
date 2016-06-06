package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.common.data.activity.InterruptibleActivityRegion;

@SuppressWarnings("all")
public class InterruptibleActivityRegionAdapter extends EObjectAdapter<InterruptibleActivityRegion> implements org.gemoc.scenario.xdsml.functionscenariomt.activity.InterruptibleActivityRegion {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public InterruptibleActivityRegionAdapter() {
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
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityEdge> */Object interruptingEdges_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityEdge> */Object getInterruptingEdges() {
    if (interruptingEdges_ == null)
    	interruptingEdges_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInterruptingEdges(), adaptersFactory, eResource);
    return interruptingEdges_;
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
  
  @Override
  public EClass eClass() {
    return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.eINSTANCE.getInterruptibleActivityRegion();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__SUPER_GROUP:
    		return getSuperGroup();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__SUB_GROUPS:
    		return getSubGroups();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_NODES:
    		return getOwnedNodes();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_EDGES:
    		return getOwnedEdges();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGES:
    		return getInterruptingEdges();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__SUPER_GROUP:
    		return getSuperGroup() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__SUB_GROUPS:
    		return getSubGroups() != null && !getSubGroups().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_NODES:
    		return getOwnedNodes() != null && !getOwnedNodes().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_EDGES:
    		return getOwnedEdges() != null && !getOwnedEdges().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGES:
    		return getInterruptingEdges() != null && !getInterruptingEdges().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__SUPER_GROUP:
    		setSuperGroup(
    		(org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityGroup)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__SUB_GROUPS:
    		getSubGroups().clear();
    		getSubGroups().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_NODES:
    		getOwnedNodes().clear();
    		getOwnedNodes().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__OWNED_EDGES:
    		getOwnedEdges().clear();
    		getOwnedEdges().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGES:
    		getInterruptingEdges().clear();
    		getInterruptingEdges().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
