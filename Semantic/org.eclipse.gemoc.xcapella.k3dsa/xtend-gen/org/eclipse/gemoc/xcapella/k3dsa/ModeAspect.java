package org.eclipse.gemoc.xcapella.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gemoc.xcapella.k3dsa.ModeAspectModeAspectProperties;
import org.eclipse.gemoc.xcapella.k3dsa.StateMachineAspect;
import org.polarsys.capella.core.data.capellacommon.Mode;
import org.polarsys.capella.core.data.capellacommon.StateMachine;

@Aspect(className = Mode.class)
@SuppressWarnings("all")
public class ModeAspect {
  public static String getLabel(final Mode _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.ModeAspectModeAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.ModeAspectModeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getLabel()
    if (_self instanceof org.polarsys.capella.core.data.capellacommon.Mode){
    	result = org.eclipse.gemoc.xcapella.k3dsa.ModeAspect._privk3_getLabel(_self_, (org.polarsys.capella.core.data.capellacommon.Mode)_self);
    };
    return (java.lang.String)result;
  }
  
  public static String toString(final Mode _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.ModeAspectModeAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.ModeAspectModeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String toString()
    if (_self instanceof org.polarsys.capella.core.data.capellacommon.Mode){
    	result = org.eclipse.gemoc.xcapella.k3dsa.ModeAspect._privk3_toString(_self_, (org.polarsys.capella.core.data.capellacommon.Mode)_self);
    };
    return (java.lang.String)result;
  }
  
  protected static String _privk3_getLabel(final ModeAspectModeAspectProperties _self_, final Mode _self) {
    EObject _eContainer = _self.eContainer().eContainer();
    StateMachineAspect.currentMode(((StateMachine) _eContainer), _self);
    return _self.getName();
  }
  
  protected static String _privk3_toString(final ModeAspectModeAspectProperties _self_, final Mode _self) {
    EObject _eContainer = _self.eContainer().eContainer();
    StateMachineAspect.currentMode(((StateMachine) _eContainer), null);
    return _self.getName();
  }
}
