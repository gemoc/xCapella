package org.gemoc.scenario.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.scenario.k3dsa.ExecutionAspectExecutionAspectProperties;
import org.polarsys.capella.core.data.interaction.Execution;

@Aspect(className = Execution.class)
@SuppressWarnings("all")
public class ExecutionAspect {
  public static String getFullLabel(final Execution _self) {
    final org.gemoc.scenario.k3dsa.ExecutionAspectExecutionAspectProperties _self_ = org.gemoc.scenario.k3dsa.ExecutionAspectExecutionAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getFullLabel(_self_, _self);;
    return (java.lang.String)result;
  }
  
  private static boolean isStarted(final Execution _self) {
    final org.gemoc.scenario.k3dsa.ExecutionAspectExecutionAspectProperties _self_ = org.gemoc.scenario.k3dsa.ExecutionAspectExecutionAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_isStarted(_self_, _self);;
    return (boolean)result;
  }
  
  private static void isStarted(final Execution _self, final boolean isStarted) {
    final org.gemoc.scenario.k3dsa.ExecutionAspectExecutionAspectProperties _self_ = org.gemoc.scenario.k3dsa.ExecutionAspectExecutionAspectContext.getSelf(_self);
    _privk3_isStarted(_self_, _self,isStarted);;
  }
  
  protected static String _privk3_getFullLabel(final ExecutionAspectExecutionAspectProperties _self_, final Execution _self) {
    boolean _isStarted = ExecutionAspect.isStarted(_self);
    if (_isStarted) {
      String _name = _self.getName();
      String _plus = (_name + " is STOPPED");
      InputOutput.<String>println(_plus);
      ExecutionAspect.isStarted(_self, false);
      _self.setReview("");
    } else {
      String _name_1 = _self.getName();
      String _plus_1 = (_name_1 + " is STARTED");
      InputOutput.<String>println(_plus_1);
      ExecutionAspect.isStarted(_self, true);
      _self.setReview("started");
    }
    return _self.getName();
  }
  
  protected static boolean _privk3_isStarted(final ExecutionAspectExecutionAspectProperties _self_, final Execution _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getIsStarted") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.isStarted;
  }
  
  protected static void _privk3_isStarted(final ExecutionAspectExecutionAspectProperties _self_, final Execution _self, final boolean isStarted) {
    _self_.isStarted = isStarted; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setIsStarted")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, isStarted);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
