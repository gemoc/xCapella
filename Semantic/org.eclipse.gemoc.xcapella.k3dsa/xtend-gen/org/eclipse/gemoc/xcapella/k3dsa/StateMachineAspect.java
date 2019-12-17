package org.eclipse.gemoc.xcapella.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import groovy.lang.Binding;
import org.eclipse.gemoc.xcapella.k3dsa.CapellaElementAspect;
import org.eclipse.gemoc.xcapella.k3dsa.StateMachineAspectStateMachineAspectProperties;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.polarsys.capella.core.data.capellacommon.Mode;
import org.polarsys.capella.core.data.capellacommon.StateMachine;

@Aspect(className = StateMachine.class)
@SuppressWarnings("all")
public class StateMachineAspect {
  public static String getLabel(final StateMachine _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.StateMachineAspectStateMachineAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getLabel()
    if (_self instanceof org.polarsys.capella.core.data.capellacommon.StateMachine){
    	result = org.eclipse.gemoc.xcapella.k3dsa.StateMachineAspect._privk3_getLabel(_self_, (org.polarsys.capella.core.data.capellacommon.StateMachine)_self);
    };
    return (java.lang.String)result;
  }
  
  public static Mode currentMode(final StateMachine _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.StateMachineAspectStateMachineAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Mode currentMode()
    if (_self instanceof org.polarsys.capella.core.data.capellacommon.StateMachine){
    	result = org.eclipse.gemoc.xcapella.k3dsa.StateMachineAspect._privk3_currentMode(_self_, (org.polarsys.capella.core.data.capellacommon.StateMachine)_self);
    };
    return (org.polarsys.capella.core.data.capellacommon.Mode)result;
  }
  
  public static void currentMode(final StateMachine _self, final Mode currentMode) {
    final org.eclipse.gemoc.xcapella.k3dsa.StateMachineAspectStateMachineAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void currentMode(Mode)
    if (_self instanceof org.polarsys.capella.core.data.capellacommon.StateMachine){
    	org.eclipse.gemoc.xcapella.k3dsa.StateMachineAspect._privk3_currentMode(_self_, (org.polarsys.capella.core.data.capellacommon.StateMachine)_self,currentMode);
    };
  }
  
  protected static String _privk3_getLabel(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    String _name = _self.getName();
    String _plus = ("initial state machine: " + _name);
    InputOutput.<String>println(_plus);
    String _description = _self.getDescription();
    boolean _tripleNotEquals = (_description != null);
    if (_tripleNotEquals) {
      String _description_1 = _self.getDescription();
      String _plus_1 = ("run: \n" + _description_1);
      InputOutput.<String>println(_plus_1);
      Binding _binding = new Binding();
      CapellaElementAspect.callGroovy(_self, _binding);
    }
    return _self.getName();
  }
  
  protected static Mode _privk3_currentMode(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentMode") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.polarsys.capella.core.data.capellacommon.Mode) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentMode;
  }
  
  protected static void _privk3_currentMode(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final Mode currentMode) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentMode")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentMode);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.currentMode = currentMode;
    }
  }
}
