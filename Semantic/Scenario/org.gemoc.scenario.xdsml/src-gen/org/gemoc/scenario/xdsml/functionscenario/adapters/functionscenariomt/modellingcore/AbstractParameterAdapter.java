package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.common.data.modellingcore.AbstractParameter;

@SuppressWarnings("all")
public class AbstractParameterAdapter extends EObjectAdapter<AbstractParameter> implements org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractParameter {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public AbstractParameterAdapter() {
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
  public boolean isIsException() {
    return adaptee.isIsException();
  }
  
  @Override
  public void setIsException(final boolean o) {
    adaptee.setIsException(o);
  }
  
  @Override
  public boolean isIsStream() {
    return adaptee.isIsStream();
  }
  
  @Override
  public void setIsStream(final boolean o) {
    adaptee.setIsStream(o);
  }
  
  @Override
  public boolean isIsOptional() {
    return adaptee.isIsOptional();
  }
  
  @Override
  public void setIsOptional(final boolean o) {
    adaptee.setIsOptional(o);
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
  public org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ParameterEffectKind getEffect() {
    return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ParameterEffectKind.get(adaptee.getEffect().getValue());
  }
  
  @Override
  public void setEffect(final org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ParameterEffectKind o) {
    adaptee.setEffect(org.polarsys.capella.common.data.modellingcore.ParameterEffectKind.get(o.getValue()));
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
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractParameterSet> */Object parameterSet_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractParameterSet> */Object getParameterSet() {
    if (parameterSet_ == null)
    	parameterSet_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getParameterSet(), adaptersFactory, eResource);
    return parameterSet_;
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
  
  protected final static boolean IS_EXCEPTION_EDEFAULT = false;
  
  protected final static boolean IS_STREAM_EDEFAULT = false;
  
  protected final static boolean IS_OPTIONAL_EDEFAULT = false;
  
  protected final static org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.RateKind KIND_OF_RATE_EDEFAULT = org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.RateKind.UNSPECIFIED;
  
  protected final static org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ParameterEffectKind EFFECT_EDEFAULT = org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ParameterEffectKind.CREATE;
  
  @Override
  public EClass eClass() {
    return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.eINSTANCE.getAbstractParameter();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__NAME:
    		return getName();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__ABSTRACT_TYPE:
    		return getAbstractType();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__IS_EXCEPTION:
    		return isIsException() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__IS_STREAM:
    		return isIsStream() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__IS_OPTIONAL:
    		return isIsOptional() ? Boolean.TRUE : Boolean.FALSE;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__KIND_OF_RATE:
    		return getKindOfRate();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__EFFECT:
    		return getEffect();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__RATE:
    		return getRate();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__PROBABILITY:
    		return getProbability();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__PARAMETER_SET:
    		return getParameterSet();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__ABSTRACT_TYPE:
    		return getAbstractType() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__IS_EXCEPTION:
    		return isIsException() != IS_EXCEPTION_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__IS_STREAM:
    		return isIsStream() != IS_STREAM_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__IS_OPTIONAL:
    		return isIsOptional() != IS_OPTIONAL_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__KIND_OF_RATE:
    		return getKindOfRate() != KIND_OF_RATE_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__EFFECT:
    		return getEffect() != EFFECT_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__RATE:
    		return getRate() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__PROBABILITY:
    		return getProbability() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__PARAMETER_SET:
    		return getParameterSet() != null && !getParameterSet().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__ABSTRACT_TYPE:
    		setAbstractType(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractType)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__IS_EXCEPTION:
    		setIsException(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__IS_STREAM:
    		setIsStream(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__IS_OPTIONAL:
    		setIsOptional(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__KIND_OF_RATE:
    		setKindOfRate(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.RateKind)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__EFFECT:
    		setEffect(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ParameterEffectKind)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__RATE:
    		setRate(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ValueSpecification)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__PROBABILITY:
    		setProbability(
    		(org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ValueSpecification)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.ABSTRACT_PARAMETER__PARAMETER_SET:
    		getParameterSet().clear();
    		getParameterSet().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
