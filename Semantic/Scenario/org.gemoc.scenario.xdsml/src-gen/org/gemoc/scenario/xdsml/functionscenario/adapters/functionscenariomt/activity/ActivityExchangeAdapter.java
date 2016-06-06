package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.common.data.activity.ActivityExchange;

@SuppressWarnings("all")
public class ActivityExchangeAdapter extends EObjectAdapter<ActivityExchange> implements org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityExchange {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public ActivityExchangeAdapter() {
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
    return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.eINSTANCE.getActivityExchange();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__NAME:
    		return getName();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__REALIZED_FLOW:
    		return getRealizedFlow();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__REALIZATIONS:
    		return getRealizations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__CONVOYED_INFORMATIONS:
    		return getConvoyedInformations();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__SOURCE:
    		return getSource();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__TARGET:
    		return getTarget();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__REALIZING_ACTIVITY_FLOWS:
    		return getRealizingActivityFlows();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__REALIZED_FLOW:
    		return getRealizedFlow() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__REALIZATIONS:
    		return getRealizations() != null && !getRealizations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__CONVOYED_INFORMATIONS:
    		return getConvoyedInformations() != null && !getConvoyedInformations().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__SOURCE:
    		return getSource() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__TARGET:
    		return getTarget() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__REALIZING_ACTIVITY_FLOWS:
    		return getRealizingActivityFlows() != null && !getRealizingActivityFlows().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__REALIZED_FLOW:
    		setRealizedFlow(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractInformationFlow)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__REALIZATIONS:
    		getRealizations().clear();
    		getRealizations().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__CONVOYED_INFORMATIONS:
    		getConvoyedInformations().clear();
    		getConvoyedInformations().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__SOURCE:
    		setSource(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.InformationsExchanger)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.ACTIVITY_EXCHANGE__TARGET:
    		setTarget(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.InformationsExchanger)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
