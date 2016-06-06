package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.common.data.modellingcore.IState;

@SuppressWarnings("all")
public class IStateAdapter extends EObjectAdapter<IState> implements org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.IState {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public IStateAdapter() {
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
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.IState> */Object referencedStates_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.IState> */Object getReferencedStates() {
    if (referencedStates_ == null)
    	referencedStates_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getReferencedStates(), adaptersFactory, eResource);
    return referencedStates_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.IState> */Object availableInStates_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.IState> */Object getAvailableInStates() {
    if (availableInStates_ == null)
    	availableInStates_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAvailableInStates(), adaptersFactory, eResource);
    return availableInStates_;
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
    return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.eINSTANCE.getIState();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ISTATE__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ISTATE__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ISTATE__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ISTATE__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ISTATE__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ISTATE__NAME:
    		return getName();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ISTATE__REFERENCED_STATES:
    		return getReferencedStates();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ISTATE__AVAILABLE_IN_STATES:
    		return getAvailableInStates();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ISTATE__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ISTATE__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ISTATE__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ISTATE__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ISTATE__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ISTATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ISTATE__REFERENCED_STATES:
    		return getReferencedStates() != null && !getReferencedStates().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ISTATE__AVAILABLE_IN_STATES:
    		return getAvailableInStates() != null && !getAvailableInStates().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ISTATE__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ISTATE__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ISTATE__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ISTATE__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ISTATE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ISTATE__REFERENCED_STATES:
    		getReferencedStates().clear();
    		getReferencedStates().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ISTATE__AVAILABLE_IN_STATES:
    		getAvailableInStates().clear();
    		getAvailableInStates().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
