package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.common.data.modellingcore.AbstractConstraint;

@SuppressWarnings("all")
public class AbstractConstraintAdapter extends EObjectAdapter<AbstractConstraint> implements org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractConstraint {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public AbstractConstraintAdapter() {
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
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModelElement> */Object constrainedElements_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModelElement> */Object getConstrainedElements() {
    if (constrainedElements_ == null)
    	constrainedElements_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getConstrainedElements(), adaptersFactory, eResource);
    return constrainedElements_;
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ValueSpecification getOwnedSpecification() {
    return () adaptersFactory.createAdapter(adaptee.getOwnedSpecification(), eResource);
  }
  
  @Override
  public void setOwnedSpecification(final org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ValueSpecification o) {
    if (o != null)
    	adaptee.setOwnedSpecification(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.ValueSpecificationAdapter) o).getAdaptee());
    else adaptee.setOwnedSpecification(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModelElement getContext() {
    return () adaptersFactory.createAdapter(adaptee.getContext(), eResource);
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
    return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.eINSTANCE.getAbstractConstraint();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_CONSTRAINT__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_CONSTRAINT__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_CONSTRAINT__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_CONSTRAINT__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_CONSTRAINT__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_CONSTRAINT__CONSTRAINED_ELEMENTS:
    		return getConstrainedElements();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_CONSTRAINT__OWNED_SPECIFICATION:
    		return getOwnedSpecification();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_CONSTRAINT__CONTEXT:
    		return getContext();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_CONSTRAINT__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_CONSTRAINT__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_CONSTRAINT__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_CONSTRAINT__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_CONSTRAINT__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_CONSTRAINT__CONSTRAINED_ELEMENTS:
    		return getConstrainedElements() != null && !getConstrainedElements().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_CONSTRAINT__OWNED_SPECIFICATION:
    		return getOwnedSpecification() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_CONSTRAINT__CONTEXT:
    		return getContext() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_CONSTRAINT__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_CONSTRAINT__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_CONSTRAINT__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_CONSTRAINT__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_CONSTRAINT__CONSTRAINED_ELEMENTS:
    		getConstrainedElements().clear();
    		getConstrainedElements().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_CONSTRAINT__OWNED_SPECIFICATION:
    		setOwnedSpecification(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ValueSpecification)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
