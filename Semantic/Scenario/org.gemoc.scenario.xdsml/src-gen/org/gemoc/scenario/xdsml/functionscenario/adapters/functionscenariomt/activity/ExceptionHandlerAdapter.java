package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.common.data.activity.ExceptionHandler;

@SuppressWarnings("all")
public class ExceptionHandlerAdapter extends EObjectAdapter<ExceptionHandler> implements org.gemoc.scenario.xdsml.functionscenariomt.activity.ExceptionHandler {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public ExceptionHandlerAdapter() {
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
  public org.gemoc.scenario.xdsml.functionscenariomt.activity.ExecutableNode getProtectedNode() {
    return () adaptersFactory.createAdapter(adaptee.getProtectedNode(), eResource);
  }
  
  @Override
  public void setProtectedNode(final org.gemoc.scenario.xdsml.functionscenariomt.activity.ExecutableNode o) {
    if (o != null)
    	adaptee.setProtectedNode(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ExecutableNodeAdapter) o).getAdaptee());
    else adaptee.setProtectedNode(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.activity.ExecutableNode getHandlerBody() {
    return () adaptersFactory.createAdapter(adaptee.getHandlerBody(), eResource);
  }
  
  @Override
  public void setHandlerBody(final org.gemoc.scenario.xdsml.functionscenariomt.activity.ExecutableNode o) {
    if (o != null)
    	adaptee.setHandlerBody(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ExecutableNodeAdapter) o).getAdaptee());
    else adaptee.setHandlerBody(null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.activity.ObjectNode getExceptionInput() {
    return () adaptersFactory.createAdapter(adaptee.getExceptionInput(), eResource);
  }
  
  @Override
  public void setExceptionInput(final org.gemoc.scenario.xdsml.functionscenariomt.activity.ObjectNode o) {
    if (o != null)
    	adaptee.setExceptionInput(((org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ObjectNodeAdapter) o).getAdaptee());
    else adaptee.setExceptionInput(null);
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractType> */Object exceptionTypes_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.AbstractType> */Object getExceptionTypes() {
    if (exceptionTypes_ == null)
    	exceptionTypes_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getExceptionTypes(), adaptersFactory, eResource);
    return exceptionTypes_;
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
    return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.eINSTANCE.getExceptionHandler();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.EXCEPTION_HANDLER__OWNED_EXTENSIONS:
    		return getOwnedExtensions();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.EXCEPTION_HANDLER__ID:
    		return getId();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.EXCEPTION_HANDLER__SID:
    		return getSid();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.EXCEPTION_HANDLER__CONSTRAINTS:
    		return getConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.EXCEPTION_HANDLER__OWNED_CONSTRAINTS:
    		return getOwnedConstraints();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.EXCEPTION_HANDLER__PROTECTED_NODE:
    		return getProtectedNode();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.EXCEPTION_HANDLER__HANDLER_BODY:
    		return getHandlerBody();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT:
    		return getExceptionInput();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.EXCEPTION_HANDLER__EXCEPTION_TYPES:
    		return getExceptionTypes();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.EXCEPTION_HANDLER__OWNED_EXTENSIONS:
    		return getOwnedExtensions() != null && !getOwnedExtensions().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.EXCEPTION_HANDLER__ID:
    		return getId() != ID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.EXCEPTION_HANDLER__SID:
    		return getSid() != SID_EDEFAULT;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.EXCEPTION_HANDLER__CONSTRAINTS:
    		return getConstraints() != null && !getConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.EXCEPTION_HANDLER__OWNED_CONSTRAINTS:
    		return getOwnedConstraints() != null && !getOwnedConstraints().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.EXCEPTION_HANDLER__PROTECTED_NODE:
    		return getProtectedNode() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.EXCEPTION_HANDLER__HANDLER_BODY:
    		return getHandlerBody() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT:
    		return getExceptionInput() != null;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.EXCEPTION_HANDLER__EXCEPTION_TYPES:
    		return getExceptionTypes() != null && !getExceptionTypes().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.EXCEPTION_HANDLER__OWNED_EXTENSIONS:
    		getOwnedExtensions().clear();
    		getOwnedExtensions().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.EXCEPTION_HANDLER__ID:
    		setId(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.EXCEPTION_HANDLER__SID:
    		setSid(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.EXCEPTION_HANDLER__OWNED_CONSTRAINTS:
    		getOwnedConstraints().clear();
    		getOwnedConstraints().addAll((Collection) newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.EXCEPTION_HANDLER__PROTECTED_NODE:
    		setProtectedNode(
    		(org.gemoc.scenario.xdsml.functionscenariomt.activity.ExecutableNode)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.EXCEPTION_HANDLER__HANDLER_BODY:
    		setHandlerBody(
    		(org.gemoc.scenario.xdsml.functionscenariomt.activity.ExecutableNode)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT:
    		setExceptionInput(
    		(org.gemoc.scenario.xdsml.functionscenariomt.activity.ObjectNode)
    		 newValue);
    		return;
    	case org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.EXCEPTION_HANDLER__EXCEPTION_TYPES:
    		getExceptionTypes().clear();
    		getExceptionTypes().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
