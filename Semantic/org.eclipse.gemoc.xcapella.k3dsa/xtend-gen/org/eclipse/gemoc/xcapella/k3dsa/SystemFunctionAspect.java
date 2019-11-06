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
  
  public static boolean isStarted(final SystemFunction _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isStarted()
    if (_self instanceof org.polarsys.capella.core.data.ctx.SystemFunction){
    	result = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect._privk3_isStarted(_self_, (org.polarsys.capella.core.data.ctx.SystemFunction)_self);
    };
    return (boolean)result;
  }
  
  public static void isStarted(final SystemFunction _self, final boolean isStarted) {
    final org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void isStarted(boolean)
    if (_self instanceof org.polarsys.capella.core.data.ctx.SystemFunction){
    	org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect._privk3_isStarted(_self_, (org.polarsys.capella.core.data.ctx.SystemFunction)_self,isStarted);
    };
  }
  
  public static boolean isReady(final SystemFunction _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isReady()
    if (_self instanceof org.polarsys.capella.core.data.ctx.SystemFunction){
    	result = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect._privk3_isReady(_self_, (org.polarsys.capella.core.data.ctx.SystemFunction)_self);
    };
    return (boolean)result;
  }
  
  public static void isReady(final SystemFunction _self, final boolean isReady) {
    final org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void isReady(boolean)
    if (_self instanceof org.polarsys.capella.core.data.ctx.SystemFunction){
    	org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect._privk3_isReady(_self_, (org.polarsys.capella.core.data.ctx.SystemFunction)_self,isReady);
    };
  }
  
  public static boolean isSuspended(final SystemFunction _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isSuspended()
    if (_self instanceof org.polarsys.capella.core.data.ctx.SystemFunction){
    	result = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect._privk3_isSuspended(_self_, (org.polarsys.capella.core.data.ctx.SystemFunction)_self);
    };
    return (boolean)result;
  }
  
  public static void isSuspended(final SystemFunction _self, final boolean isSuspended) {
    final org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void isSuspended(boolean)
    if (_self instanceof org.polarsys.capella.core.data.ctx.SystemFunction){
    	org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect._privk3_isSuspended(_self_, (org.polarsys.capella.core.data.ctx.SystemFunction)_self,isSuspended);
    };
  }
  
  public static boolean isStopped(final SystemFunction _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isStopped()
    if (_self instanceof org.polarsys.capella.core.data.ctx.SystemFunction){
    	result = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect._privk3_isStopped(_self_, (org.polarsys.capella.core.data.ctx.SystemFunction)_self);
    };
    return (boolean)result;
  }
  
  public static void isStopped(final SystemFunction _self, final boolean isStopped) {
    final org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void isStopped(boolean)
    if (_self instanceof org.polarsys.capella.core.data.ctx.SystemFunction){
    	org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect._privk3_isStopped(_self_, (org.polarsys.capella.core.data.ctx.SystemFunction)_self,isStopped);
    };
  }
  
  public static int runCycles(final SystemFunction _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# int runCycles()
    if (_self instanceof org.polarsys.capella.core.data.ctx.SystemFunction){
    	result = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect._privk3_runCycles(_self_, (org.polarsys.capella.core.data.ctx.SystemFunction)_self);
    };
    return (int)result;
  }
  
  public static void runCycles(final SystemFunction _self, final int runCycles) {
    final org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void runCycles(int)
    if (_self instanceof org.polarsys.capella.core.data.ctx.SystemFunction){
    	org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect._privk3_runCycles(_self_, (org.polarsys.capella.core.data.ctx.SystemFunction)_self,runCycles);
    };
  }
  
  protected static Boolean _privk3_hasUnnamedLabel(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self) {
    if ((SystemFunctionAspect.isStarted(_self) && (!SystemFunctionAspect.isSuspended(_self)))) {
      String _name = _self.getName();
      String _plus = (_name + " is STOPPED");
      InputOutput.<String>println(_plus);
      SystemFunctionAspect.isStarted(_self, false);
      SystemFunctionAspect.isReady(_self, false);
      SystemFunctionAspect.isSuspended(_self, false);
      SystemFunctionAspect.isStopped(_self, true);
      SystemFunctionAspect.runCycles(_self, 0);
      _self.setReview("   ");
    } else {
      String _name_1 = _self.getName();
      String _plus_1 = (_name_1 + " is STARTED");
      InputOutput.<String>println(_plus_1);
      SystemFunctionAspect.isStarted(_self, true);
      if (((_self.getReview() != null) && (!SystemFunctionAspect.isSuspended(_self)))) {
        _self.setReview(" started");
      }
    }
    return Boolean.valueOf(false);
  }
  
  protected static String _privk3_getLabel(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self) {
    boolean _isReady = SystemFunctionAspect.isReady(_self);
    boolean _equals = (_isReady == false);
    if (_equals) {
      String _name = _self.getName();
      String _plus = (_name + " is activated");
      InputOutput.<String>println(_plus);
      String _review = _self.getReview();
      boolean _tripleEquals = (_review == null);
      if (_tripleEquals) {
        _self.setReview(" activated");
      } else {
        int _length = _self.getReview().length();
        boolean _lessEqualsThan = (_length <= 3);
        if (_lessEqualsThan) {
          _self.setReview(" activated");
        }
      }
      SystemFunctionAspect.isReady(_self, true);
    } else {
      int _runCycles = SystemFunctionAspect.runCycles(_self);
      int _plus_1 = (_runCycles + 1);
      SystemFunctionAspect.runCycles(_self, _plus_1);
      String _name_1 = _self.getName();
      String _plus_2 = (_name_1 + " ran for ");
      int _runCycles_1 = SystemFunctionAspect.runCycles(_self);
      String _plus_3 = (_plus_2 + Integer.valueOf(_runCycles_1));
      String _plus_4 = (_plus_3 + " cycles");
      InputOutput.<String>println(_plus_4);
      _self.setDescription(Integer.valueOf(SystemFunctionAspect.runCycles(_self)).toString());
    }
    return _self.getName();
  }
  
  protected static String _privk3_getFullLabel(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self) {
    SystemFunctionAspect.isSuspended(_self, true);
    SystemFunctionAspect.isStarted(_self, false);
    String _name = _self.getName();
    String _plus = (_name + " is suspended");
    InputOutput.<String>println(_plus);
    _self.setReview(" suspended");
    return _self.getName();
  }
  
  protected static String _privk3_destroy(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self) {
    SystemFunctionAspect.isSuspended(_self, false);
    String _name = _self.getName();
    String _plus = (_name + " is resumed");
    InputOutput.<String>println(_plus);
    _self.setReview("");
    return _self.getName();
  }
  
  protected static boolean _privk3_isStarted(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isIsStarted") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.isStarted;
  }
  
  protected static void _privk3_isStarted(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self, final boolean isStarted) {
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
  
  protected static boolean _privk3_isReady(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isIsReady") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.isReady;
  }
  
  protected static void _privk3_isReady(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self, final boolean isReady) {
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
  
  protected static boolean _privk3_isSuspended(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isIsSuspended") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.isSuspended;
  }
  
  protected static void _privk3_isSuspended(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self, final boolean isSuspended) {
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
  
  protected static boolean _privk3_isStopped(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isIsStopped") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.isStopped;
  }
  
  protected static void _privk3_isStopped(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self, final boolean isStopped) {
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
  
  protected static int _privk3_runCycles(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getRunCycles") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.runCycles;
  }
  
  protected static void _privk3_runCycles(final SystemFunctionAspectSystemFunctionAspectProperties _self_, final SystemFunction _self, final int runCycles) {
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
