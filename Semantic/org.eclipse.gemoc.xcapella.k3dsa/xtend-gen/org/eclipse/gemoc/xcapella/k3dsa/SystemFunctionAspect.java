package org.eclipse.gemoc.xcapella.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
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
  
  public static String getFullLabel(final SystemFunction _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getFullLabel()
    if (_self instanceof org.polarsys.capella.core.data.ctx.SystemFunction){
    	result = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect._privk3_getFullLabel(_self_, (org.polarsys.capella.core.data.ctx.SystemFunction)_self);
    };
    return (java.lang.String)result;
  }
  
  public static String destroy(final SystemFunction _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String destroy()
    if (_self instanceof org.polarsys.capella.core.data.ctx.SystemFunction){
    	result = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect._privk3_destroy(_self_, (org.polarsys.capella.core.data.ctx.SystemFunction)_self);
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
  
  public static Boolean isReady(final SystemFunction _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Boolean isReady()
    if (_self instanceof org.polarsys.capella.core.data.ctx.SystemFunction){
    	result = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect._privk3_isReady(_self_, (org.polarsys.capella.core.data.ctx.SystemFunction)_self);
    };
    return (java.lang.Boolean)result;
  }
  
  public static void isReady(final SystemFunction _self, final Boolean isReady) {
    final org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void isReady(Boolean)
    if (_self instanceof org.polarsys.capella.core.data.ctx.SystemFunction){
    	org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect._privk3_isReady(_self_, (org.polarsys.capella.core.data.ctx.SystemFunction)_self,isReady);
    };
  }
  
  public static Boolean isSuspended(final SystemFunction _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Boolean isSuspended()
    if (_self instanceof org.polarsys.capella.core.data.ctx.SystemFunction){
    	result = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect._privk3_isSuspended(_self_, (org.polarsys.capella.core.data.ctx.SystemFunction)_self);
    };
    return (java.lang.Boolean)result;
  }
  
  public static void isSuspended(final SystemFunction _self, final Boolean isSuspended) {
    final org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void isSuspended(Boolean)
    if (_self instanceof org.polarsys.capella.core.data.ctx.SystemFunction){
    	org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect._privk3_isSuspended(_self_, (org.polarsys.capella.core.data.ctx.SystemFunction)_self,isSuspended);
    };
  }
  
  public static Boolean isStopped(final SystemFunction _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Boolean isStopped()
    if (_self instanceof org.polarsys.capella.core.data.ctx.SystemFunction){
    	result = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect._privk3_isStopped(_self_, (org.polarsys.capella.core.data.ctx.SystemFunction)_self);
    };
    return (java.lang.Boolean)result;
  }
  
  public static void isStopped(final SystemFunction _self, final Boolean isStopped) {
    final org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void isStopped(Boolean)
    if (_self instanceof org.polarsys.capella.core.data.ctx.SystemFunction){
    	org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect._privk3_isStopped(_self_, (org.polarsys.capella.core.data.ctx.SystemFunction)_self,isStopped);
    };
  }
  
  public static Boolean isElected(final SystemFunction _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Boolean isElected()
    if (_self instanceof org.polarsys.capella.core.data.ctx.SystemFunction){
    	result = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect._privk3_isElected(_self_, (org.polarsys.capella.core.data.ctx.SystemFunction)_self);
    };
    return (java.lang.Boolean)result;
  }
  
  public static void isElected(final SystemFunction _self, final Boolean isElected) {
    final org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void isElected(Boolean)
    if (_self instanceof org.polarsys.capella.core.data.ctx.SystemFunction){
    	org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect._privk3_isElected(_self_, (org.polarsys.capella.core.data.ctx.SystemFunction)_self,isElected);
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
    if (((SystemFunctionAspect.isStarted(_self)).booleanValue() && (!(SystemFunctionAspect.isSuspended(_self)).booleanValue()))) {
      String _name = _self.getName();
      String _plus = (_name + " is STOPPED");
      InputOutput.<String>println(_plus);
      SystemFunctionAspect.isStarted(_self, Boolean.valueOf(false));
      SystemFunctionAspect.isReady(_self, Boolean.valueOf(false));
      SystemFunctionAspect.isSuspended(_self, Boolean.valueOf(false));
      SystemFunctionAspect.isStopped(_self, Boolean.valueOf(true));
      SystemFunctionAspect.isElected(_self, Boolean.valueOf(false));
      SystemFunctionAspect.runCycles(_self, Integer.valueOf(0));
    } else {
      String _name_1 = _self.getName();
      String _plus_1 = (_name_1 + " is STARTED");
      InputOutput.<String>println(_plus_1);
      SystemFunctionAspect.isStopped(_self, Boolean.valueOf(false));
      SystemFunctionAspect.isStarted(_self, Boolean.valueOf(true));
      SystemFunctionAspect.isElected(_self, Boolean.valueOf(false));
    }
    return Boolean.valueOf(false);
  }
  
  protected static String _privk3_getLabel(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self) {
    Boolean _isReady = SystemFunctionAspect.isReady(_self);
    boolean _equals = ((_isReady).booleanValue() == false);
    if (_equals) {
      String _name = _self.getName();
      String _plus = (_name + " is activated");
      InputOutput.<String>println(_plus);
      SystemFunctionAspect.isReady(_self, Boolean.valueOf(true));
    } else {
      SystemFunctionAspect.isSuspended(_self, Boolean.valueOf(false));
      SystemFunctionAspect.isStarted(_self, Boolean.valueOf(true));
      Integer _runCycles = SystemFunctionAspect.runCycles(_self);
      int _plus_1 = ((_runCycles).intValue() + 1);
      SystemFunctionAspect.runCycles(_self, Integer.valueOf(_plus_1));
      String _name_1 = _self.getName();
      String _plus_2 = (_name_1 + " ran for ");
      Integer _runCycles_1 = SystemFunctionAspect.runCycles(_self);
      String _plus_3 = (_plus_2 + _runCycles_1);
      String _plus_4 = (_plus_3 + " cycles");
      InputOutput.<String>println(_plus_4);
    }
    return _self.getName();
  }
  
  protected static String _privk3_getFullLabel(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self) {
    SystemFunctionAspect.isSuspended(_self, Boolean.valueOf(true));
    SystemFunctionAspect.isStarted(_self, Boolean.valueOf(false));
    String _name = _self.getName();
    String _plus = (_name + " is suspended");
    InputOutput.<String>println(_plus);
    return _self.getName();
  }
  
  protected static String _privk3_destroy(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self) {
    SystemFunctionAspect.isSuspended(_self, Boolean.valueOf(false));
    SystemFunctionAspect.isStarted(_self, Boolean.valueOf(true));
    String _name = _self.getName();
    String _plus = (_name + " is resumed");
    InputOutput.<String>println(_plus);
    return _self.getName();
  }
  
  protected static String _privk3_toString(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self) {
    String _name = _self.getName();
    String _plus = (_name + " has been activated");
    InputOutput.<String>println(_plus);
    SystemFunctionAspect.isElected(_self, Boolean.valueOf(true));
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
  
  protected static Boolean _privk3_isReady(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isIsReady") &&
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
    return _self_.isReady;
  }
  
  protected static void _privk3_isReady(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self, final Boolean isReady) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setIsReady")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, isReady);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.isReady = isReady;
    }
  }
  
  protected static Boolean _privk3_isSuspended(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isIsSuspended") &&
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
    return _self_.isSuspended;
  }
  
  protected static void _privk3_isSuspended(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self, final Boolean isSuspended) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setIsSuspended")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, isSuspended);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.isSuspended = isSuspended;
    }
  }
  
  protected static Boolean _privk3_isStopped(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isIsStopped") &&
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
    return _self_.isStopped;
  }
  
  protected static void _privk3_isStopped(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self, final Boolean isStopped) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setIsStopped")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, isStopped);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.isStopped = isStopped;
    }
  }
  
  protected static Boolean _privk3_isElected(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isIsElected") &&
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
    return _self_.isElected;
  }
  
  protected static void _privk3_isElected(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self, final Boolean isElected) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setIsElected")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, isElected);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.isElected = isElected;
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
