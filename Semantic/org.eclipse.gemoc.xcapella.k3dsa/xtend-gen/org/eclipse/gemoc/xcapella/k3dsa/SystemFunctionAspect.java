package org.eclipse.gemoc.xcapella.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.gemoc.xcapella.k3dsa.CapellaElementAspect;
import org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.polarsys.capella.core.data.ctx.SystemFunction;

@Aspect(className = SystemFunction.class)
@SuppressWarnings("all")
public class SystemFunctionAspect {
  public static Boolean hasUnnamedLabel(final SystemFunction _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Boolean hasUnnamedLabel()
    if (_self instanceof org.polarsys.capella.core.data.ctx.SystemFunction){
    	result = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect._privk3_hasUnnamedLabel(_self_, (org.polarsys.capella.core.data.ctx.SystemFunction)_self);
    };
    return (java.lang.Boolean)result;
  }
  
  public static String getLabel(final SystemFunction _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getLabel()
    if (_self instanceof org.polarsys.capella.core.data.ctx.SystemFunction){
    	result = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect._privk3_getLabel(_self_, (org.polarsys.capella.core.data.ctx.SystemFunction)_self);
    };
    return (java.lang.String)result;
  }
  
  public static String toString(final SystemFunction _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String toString()
    if (_self instanceof org.polarsys.capella.core.data.ctx.SystemFunction){
    	result = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect._privk3_toString(_self_, (org.polarsys.capella.core.data.ctx.SystemFunction)_self);
    };
    return (java.lang.String)result;
  }
  
  public static Boolean isStarted(final SystemFunction _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Boolean isStarted()
    if (_self instanceof org.polarsys.capella.core.data.ctx.SystemFunction){
    	result = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect._privk3_isStarted(_self_, (org.polarsys.capella.core.data.ctx.SystemFunction)_self);
    };
    return (java.lang.Boolean)result;
  }
  
  public static void isStarted(final SystemFunction _self, final Boolean isStarted) {
    final org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void isStarted(Boolean)
    if (_self instanceof org.polarsys.capella.core.data.ctx.SystemFunction){
    	org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect._privk3_isStarted(_self_, (org.polarsys.capella.core.data.ctx.SystemFunction)_self,isStarted);
    };
  }
  
  public static Boolean isEnacted(final SystemFunction _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Boolean isEnacted()
    if (_self instanceof org.polarsys.capella.core.data.ctx.SystemFunction){
    	result = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect._privk3_isEnacted(_self_, (org.polarsys.capella.core.data.ctx.SystemFunction)_self);
    };
    return (java.lang.Boolean)result;
  }
  
  public static void isEnacted(final SystemFunction _self, final Boolean isEnacted) {
    final org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void isEnacted(Boolean)
    if (_self instanceof org.polarsys.capella.core.data.ctx.SystemFunction){
    	org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect._privk3_isEnacted(_self_, (org.polarsys.capella.core.data.ctx.SystemFunction)_self,isEnacted);
    };
  }
  
  public static Integer runCycles(final SystemFunction _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer runCycles()
    if (_self instanceof org.polarsys.capella.core.data.ctx.SystemFunction){
    	result = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect._privk3_runCycles(_self_, (org.polarsys.capella.core.data.ctx.SystemFunction)_self);
    };
    return (java.lang.Integer)result;
  }
  
  public static void runCycles(final SystemFunction _self, final Integer runCycles) {
    final org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void runCycles(Integer)
    if (_self instanceof org.polarsys.capella.core.data.ctx.SystemFunction){
    	org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect._privk3_runCycles(_self_, (org.polarsys.capella.core.data.ctx.SystemFunction)_self,runCycles);
    };
  }
  
  protected static Boolean _privk3_hasUnnamedLabel(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self) {
    Boolean _isStarted = SystemFunctionAspect.isStarted(_self);
    if ((_isStarted).booleanValue()) {
      String _name = _self.getName();
      String _plus = (_name + " is STOPPED");
      InputOutput.<String>println(_plus);
      SystemFunctionAspect.isStarted(_self, Boolean.valueOf(false));
      SystemFunctionAspect.runCycles(_self, Integer.valueOf(0));
    } else {
      String _name_1 = _self.getName();
      String _plus_1 = (_name_1 + " is STARTED");
      InputOutput.<String>println(_plus_1);
      SystemFunctionAspect.isStarted(_self, Boolean.valueOf(true));
      String _description = _self.getDescription();
      boolean _tripleNotEquals = (_description != null);
      if (_tripleNotEquals) {
        String _description_1 = _self.getDescription();
        String _plus_2 = ("run: \n" + _description_1);
        InputOutput.<String>println(_plus_2);
        CapellaElementAspect.callGroovy(_self);
      }
    }
    return Boolean.valueOf(false);
  }
  
  protected static String _privk3_getLabel(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self) {
    Boolean _isEnacted = SystemFunctionAspect.isEnacted(_self);
    if ((_isEnacted).booleanValue()) {
      String _name = _self.getName();
      String _plus = (_name + " is UNenacted");
      InputOutput.<String>println(_plus);
      SystemFunctionAspect.isEnacted(_self, Boolean.valueOf(false));
    } else {
      SystemFunctionAspect.isEnacted(_self, Boolean.valueOf(true));
      String _name_1 = _self.getName();
      String _plus_1 = (_name_1 + " is enacted");
      InputOutput.<String>println(_plus_1);
    }
    return _self.getName();
  }
  
  protected static String _privk3_toString(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self) {
    Integer _runCycles = SystemFunctionAspect.runCycles(_self);
    int _plus = ((_runCycles).intValue() + 1);
    SystemFunctionAspect.runCycles(_self, Integer.valueOf(_plus));
    String _name = _self.getName();
    String _plus_1 = (_name + " ran for ");
    Integer _runCycles_1 = SystemFunctionAspect.runCycles(_self);
    String _plus_2 = (_plus_1 + _runCycles_1);
    String _plus_3 = (_plus_2 + " cycles");
    InputOutput.<String>println(_plus_3);
    return _self.getName();
  }
  
  protected static Boolean _privk3_isStarted(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isIsStarted") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Boolean) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.isStarted;
  }
  
  protected static void _privk3_isStarted(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self, final Boolean isStarted) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setIsStarted")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, isStarted);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.isStarted = isStarted;
    }
  }
  
  protected static Boolean _privk3_isEnacted(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isIsEnacted") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Boolean) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.isEnacted;
  }
  
  protected static void _privk3_isEnacted(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self, final Boolean isEnacted) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setIsEnacted")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, isEnacted);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.isEnacted = isEnacted;
    }
  }
  
  protected static Integer _privk3_runCycles(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getRunCycles") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Integer) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.runCycles;
  }
  
  protected static void _privk3_runCycles(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self, final Integer runCycles) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setRunCycles")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, runCycles);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.runCycles = runCycles;
    }
  }
}
