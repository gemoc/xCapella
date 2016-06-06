package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.common.data.modellingcore.InformationsExchanger;

@SuppressWarnings("all")
public class InformationsExchangerAdapter extends EObjectAdapter<InformationsExchanger> implements org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.InformationsExchanger {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public InformationsExchangerAdapter() {
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
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractInformationFlow> */Object incomingInformationFlows_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractInformationFlow> */Object getIncomingInformationFlows() {
    if (incomingInformationFlows_ == null)
    	incomingInformationFlows_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingInformationFlows(), adaptersFactory, eResource);
    return incomingInformationFlows_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractInformationFlow> */Object outgoingInformationFlows_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractInformationFlow> */Object getOutgoingInformationFlows() {
    if (outgoingInformationFlows_ == null)
    	outgoingInformationFlows_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingInformationFlows(), adaptersFactory, eResource);
    return outgoingInformationFlows_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractInformationFlow> */Object informationFlows_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractInformationFlow> */Object getInformationFlows() {
    if (informationFlows_ == null)
    	informationFlows_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getInformationFlows(), adaptersFactory, eResource);
    return informationFlows_;
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
    return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.eINSTANCE.getInformationsExchanger();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.INFORMATIONS_EXCHANGER__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.INFORMATIONS_EXCHANGER__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.INFORMATIONS_EXCHANGER__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.INFORMATIONS_EXCHANGER__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.INFORMATIONS_EXCHANGER__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.INFORMATIONS_EXCHANGER__INCOMING_INFORMATION_FLOWS:
    		return getIncomingInformationFlows();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.INFORMATIONS_EXCHANGER__OUTGOING_INFORMATION_FLOWS:
    		return getOutgoingInformationFlows();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.INFORMATIONS_EXCHANGER__INFORMATION_FLOWS:
    		return getInformationFlows();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.INFORMATIONS_EXCHANGER__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.INFORMATIONS_EXCHANGER__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.INFORMATIONS_EXCHANGER__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.INFORMATIONS_EXCHANGER__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.INFORMATIONS_EXCHANGER__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.INFORMATIONS_EXCHANGER__INCOMING_INFORMATION_FLOWS:
    		return getIncomingInformationFlows() != null && !getIncomingInformationFlows().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.INFORMATIONS_EXCHANGER__OUTGOING_INFORMATION_FLOWS:
    		return getOutgoingInformationFlows() != null && !getOutgoingInformationFlows().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.INFORMATIONS_EXCHANGER__INFORMATION_FLOWS:
    		return getInformationFlows() != null && !getInformationFlows().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.INFORMATIONS_EXCHANGER__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.INFORMATIONS_EXCHANGER__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.INFORMATIONS_EXCHANGER__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.INFORMATIONS_EXCHANGER__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
