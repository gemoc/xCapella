package org.gemoc.xcapella.dataflow.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectProperties;
import org.polarsys.capella.core.data.fa.AbstractFunction;

/**
 * context AbstractFunction
 * def if (self.ownedFunctions->isEmpty()) : makeactive : Event = self.getFullLabel() --dirty reuse of existing functions
 * def if (self.ownedFunctions->isEmpty()) : start : Event = self.getLabel() --dirty reuse of existing functions
 * def if (self.ownedFunctions->isEmpty()) : run : Event = self.destroy() --dirty reuse of existing functions
 * def if (self.ownedFunctions->isEmpty()) : stop : Event = self.hasUnnamedLabel() --dirty reuse of existing functions
 * def if (self.ownedFunctions->isEmpty()) : makeinactive : Event = self.toString() --dirty reuse of existing functions
 * 
 * context FunctionalChain
 * def : activate : Event = self.getLabel() --dirty reuse of existing functions
 * def : deactivate : Event = self.destroy() --dirty reuse of existing functions
 */
@Aspect(className = AbstractFunction.class)
@SuppressWarnings("all")
public class FunctionAspect {
  public static String getFullLabel(final AbstractFunction _self) {
    final org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectProperties _self_ = org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getFullLabel()
    if (_self instanceof org.polarsys.capella.core.data.fa.AbstractFunction){
    	result = org.gemoc.xcapella.dataflow.k3dsa.FunctionAspect._privk3_getFullLabel(_self_, (org.polarsys.capella.core.data.fa.AbstractFunction)_self);
    };
    return (java.lang.String)result;
  }
  
  public static String getLabel(final AbstractFunction _self) {
    final org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectProperties _self_ = org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getLabel()
    if (_self instanceof org.polarsys.capella.core.data.fa.AbstractFunction){
    	result = org.gemoc.xcapella.dataflow.k3dsa.FunctionAspect._privk3_getLabel(_self_, (org.polarsys.capella.core.data.fa.AbstractFunction)_self);
    };
    return (java.lang.String)result;
  }
  
  public static String destroy(final AbstractFunction _self) {
    final org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectProperties _self_ = org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String destroy()
    if (_self instanceof org.polarsys.capella.core.data.fa.AbstractFunction){
    	result = org.gemoc.xcapella.dataflow.k3dsa.FunctionAspect._privk3_destroy(_self_, (org.polarsys.capella.core.data.fa.AbstractFunction)_self);
    };
    return (java.lang.String)result;
  }
  
  public static String hasUnnamedLabel(final AbstractFunction _self) {
    final org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectProperties _self_ = org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String hasUnnamedLabel()
    if (_self instanceof org.polarsys.capella.core.data.fa.AbstractFunction){
    	result = org.gemoc.xcapella.dataflow.k3dsa.FunctionAspect._privk3_hasUnnamedLabel(_self_, (org.polarsys.capella.core.data.fa.AbstractFunction)_self);
    };
    return (java.lang.String)result;
  }
  
  public static String toString(final AbstractFunction _self) {
    final org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectProperties _self_ = org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String toString()
    if (_self instanceof org.polarsys.capella.core.data.fa.AbstractFunction){
    	result = org.gemoc.xcapella.dataflow.k3dsa.FunctionAspect._privk3_toString(_self_, (org.polarsys.capella.core.data.fa.AbstractFunction)_self);
    };
    return (java.lang.String)result;
  }
  
  public static boolean isActive(final AbstractFunction _self) {
    final org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectProperties _self_ = org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isActive()
    if (_self instanceof org.polarsys.capella.core.data.fa.AbstractFunction){
    	result = org.gemoc.xcapella.dataflow.k3dsa.FunctionAspect._privk3_isActive(_self_, (org.polarsys.capella.core.data.fa.AbstractFunction)_self);
    };
    return (boolean)result;
  }
  
  public static void isActive(final AbstractFunction _self, final boolean isActive) {
    final org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectProperties _self_ = org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void isActive(boolean)
    if (_self instanceof org.polarsys.capella.core.data.fa.AbstractFunction){
    	org.gemoc.xcapella.dataflow.k3dsa.FunctionAspect._privk3_isActive(_self_, (org.polarsys.capella.core.data.fa.AbstractFunction)_self,isActive);
    };
  }
  
  public static boolean isStarted(final AbstractFunction _self) {
    final org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectProperties _self_ = org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isStarted()
    if (_self instanceof org.polarsys.capella.core.data.fa.AbstractFunction){
    	result = org.gemoc.xcapella.dataflow.k3dsa.FunctionAspect._privk3_isStarted(_self_, (org.polarsys.capella.core.data.fa.AbstractFunction)_self);
    };
    return (boolean)result;
  }
  
  public static void isStarted(final AbstractFunction _self, final boolean isStarted) {
    final org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectProperties _self_ = org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void isStarted(boolean)
    if (_self instanceof org.polarsys.capella.core.data.fa.AbstractFunction){
    	org.gemoc.xcapella.dataflow.k3dsa.FunctionAspect._privk3_isStarted(_self_, (org.polarsys.capella.core.data.fa.AbstractFunction)_self,isStarted);
    };
  }
  
  public static boolean isReady(final AbstractFunction _self) {
    final org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectProperties _self_ = org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isReady()
    if (_self instanceof org.polarsys.capella.core.data.fa.AbstractFunction){
    	result = org.gemoc.xcapella.dataflow.k3dsa.FunctionAspect._privk3_isReady(_self_, (org.polarsys.capella.core.data.fa.AbstractFunction)_self);
    };
    return (boolean)result;
  }
  
  public static void isReady(final AbstractFunction _self, final boolean isReady) {
    final org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectProperties _self_ = org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void isReady(boolean)
    if (_self instanceof org.polarsys.capella.core.data.fa.AbstractFunction){
    	org.gemoc.xcapella.dataflow.k3dsa.FunctionAspect._privk3_isReady(_self_, (org.polarsys.capella.core.data.fa.AbstractFunction)_self,isReady);
    };
  }
  
  public static boolean isSuspended(final AbstractFunction _self) {
    final org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectProperties _self_ = org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isSuspended()
    if (_self instanceof org.polarsys.capella.core.data.fa.AbstractFunction){
    	result = org.gemoc.xcapella.dataflow.k3dsa.FunctionAspect._privk3_isSuspended(_self_, (org.polarsys.capella.core.data.fa.AbstractFunction)_self);
    };
    return (boolean)result;
  }
  
  public static void isSuspended(final AbstractFunction _self, final boolean isSuspended) {
    final org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectProperties _self_ = org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void isSuspended(boolean)
    if (_self instanceof org.polarsys.capella.core.data.fa.AbstractFunction){
    	org.gemoc.xcapella.dataflow.k3dsa.FunctionAspect._privk3_isSuspended(_self_, (org.polarsys.capella.core.data.fa.AbstractFunction)_self,isSuspended);
    };
  }
  
  public static boolean isStopped(final AbstractFunction _self) {
    final org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectProperties _self_ = org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isStopped()
    if (_self instanceof org.polarsys.capella.core.data.fa.AbstractFunction){
    	result = org.gemoc.xcapella.dataflow.k3dsa.FunctionAspect._privk3_isStopped(_self_, (org.polarsys.capella.core.data.fa.AbstractFunction)_self);
    };
    return (boolean)result;
  }
  
  public static void isStopped(final AbstractFunction _self, final boolean isStopped) {
    final org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectProperties _self_ = org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void isStopped(boolean)
    if (_self instanceof org.polarsys.capella.core.data.fa.AbstractFunction){
    	org.gemoc.xcapella.dataflow.k3dsa.FunctionAspect._privk3_isStopped(_self_, (org.polarsys.capella.core.data.fa.AbstractFunction)_self,isStopped);
    };
  }
  
  public static boolean isRunning(final AbstractFunction _self) {
    final org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectProperties _self_ = org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isRunning()
    if (_self instanceof org.polarsys.capella.core.data.fa.AbstractFunction){
    	result = org.gemoc.xcapella.dataflow.k3dsa.FunctionAspect._privk3_isRunning(_self_, (org.polarsys.capella.core.data.fa.AbstractFunction)_self);
    };
    return (boolean)result;
  }
  
  public static void isRunning(final AbstractFunction _self, final boolean isRunning) {
    final org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectProperties _self_ = org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void isRunning(boolean)
    if (_self instanceof org.polarsys.capella.core.data.fa.AbstractFunction){
    	org.gemoc.xcapella.dataflow.k3dsa.FunctionAspect._privk3_isRunning(_self_, (org.polarsys.capella.core.data.fa.AbstractFunction)_self,isRunning);
    };
  }
  
  protected static String _privk3_getFullLabel(final FunctionAspectAbstractFunctionAspectProperties _self_, final AbstractFunction _self) {
    String _xblockexpression = null;
    {
      EObject _eContainer = _self.eContainer();
      AbstractFunction func = ((AbstractFunction) _eContainer);
      boolean _isActive = FunctionAspect.isActive(_self);
      if (_isActive) {
        String _name = func.getName();
        String _plus = ("ERROR: " + _name);
        String _plus_1 = (_plus + " HAS BEEN ACTIVATED ELSEWHERE!");
        InputOutput.<String>println(_plus_1);
        return "ERROR";
      }
      FunctionAspect.isActive(_self, true);
      String _name_1 = func.getName();
      String _plus_2 = (_name_1 + " ACTIVE!");
      _xblockexpression = InputOutput.<String>println(_plus_2);
    }
    return _xblockexpression;
  }
  
  protected static String _privk3_getLabel(final FunctionAspectAbstractFunctionAspectProperties _self_, final AbstractFunction _self) {
    String _xblockexpression = null;
    {
      EObject _eContainer = _self.eContainer();
      AbstractFunction func = ((AbstractFunction) _eContainer);
      boolean _isStarted = FunctionAspect.isStarted(_self);
      if (_isStarted) {
        String _name = func.getName();
        String _plus = ("ERROR: " + _name);
        String _plus_1 = (_plus + " HAS BEEN STARTED ELSEWHERE!");
        InputOutput.<String>println(_plus_1);
        return "ERROR";
      }
      boolean _isActive = FunctionAspect.isActive(_self);
      boolean _not = (!_isActive);
      if (_not) {
        String _name_1 = func.getName();
        String _plus_2 = ("ERROR: " + _name_1);
        String _plus_3 = (_plus_2 + " MUST BE ACTIVATED BEFORE STARTED!");
        InputOutput.<String>println(_plus_3);
        return "ERROR";
      }
      FunctionAspect.isStarted(_self, true);
      String _name_2 = func.getName();
      String _plus_4 = (_name_2 + " STARTED!");
      _xblockexpression = InputOutput.<String>println(_plus_4);
    }
    return _xblockexpression;
  }
  
  protected static String _privk3_destroy(final FunctionAspectAbstractFunctionAspectProperties _self_, final AbstractFunction _self) {
    String _xblockexpression = null;
    {
      EObject _eContainer = _self.eContainer();
      AbstractFunction func = ((AbstractFunction) _eContainer);
      boolean _isRunning = FunctionAspect.isRunning(_self);
      if (_isRunning) {
        String _name = func.getName();
        String _plus = ("ERROR: " + _name);
        String _plus_1 = (_plus + " HAS BEEN RUNNED ELSEWHERE!");
        InputOutput.<String>println(_plus_1);
        return "ERROR";
      }
      boolean _isStarted = FunctionAspect.isStarted(_self);
      boolean _not = (!_isStarted);
      if (_not) {
        String _name_1 = func.getName();
        String _plus_2 = ("ERROR: " + _name_1);
        String _plus_3 = (_plus_2 + " MUST BE STARTED BEFORE RUNNED!");
        InputOutput.<String>println(_plus_3);
        return "ERROR";
      }
      FunctionAspect.isRunning(_self, true);
      String _name_2 = func.getName();
      String _plus_4 = (_name_2 + " RUNNING!");
      _xblockexpression = InputOutput.<String>println(_plus_4);
    }
    return _xblockexpression;
  }
  
  protected static String _privk3_hasUnnamedLabel(final FunctionAspectAbstractFunctionAspectProperties _self_, final AbstractFunction _self) {
    String _xblockexpression = null;
    {
      EObject _eContainer = _self.eContainer();
      AbstractFunction func = ((AbstractFunction) _eContainer);
      boolean _isStarted = FunctionAspect.isStarted(_self);
      boolean _not = (!_isStarted);
      if (_not) {
        String _name = func.getName();
        String _plus = ("ERROR: " + _name);
        String _plus_1 = (_plus + " HAS BEEN STOPPED ELSEWHERE!");
        InputOutput.<String>println(_plus_1);
        return "ERROR";
      }
      FunctionAspect.isRunning(_self, false);
      FunctionAspect.isStarted(_self, false);
      String _name_1 = func.getName();
      String _plus_2 = (_name_1 + " STOPPED!");
      _xblockexpression = InputOutput.<String>println(_plus_2);
    }
    return _xblockexpression;
  }
  
  protected static String _privk3_toString(final FunctionAspectAbstractFunctionAspectProperties _self_, final AbstractFunction _self) {
    String _xblockexpression = null;
    {
      EObject _eContainer = _self.eContainer();
      AbstractFunction func = ((AbstractFunction) _eContainer);
      boolean _isActive = FunctionAspect.isActive(_self);
      boolean _not = (!_isActive);
      if (_not) {
        String _name = func.getName();
        String _plus = ("ERROR: " + _name);
        String _plus_1 = (_plus + " HAS BEEN DEACTIVATED ELSEWHERE!");
        InputOutput.<String>println(_plus_1);
        return "ERROR";
      }
      FunctionAspect.isRunning(_self, false);
      FunctionAspect.isStarted(_self, false);
      FunctionAspect.isActive(_self, false);
      String _name_1 = func.getName();
      String _plus_2 = (_name_1 + " NOT ACTIVE!");
      _xblockexpression = InputOutput.<String>println(_plus_2);
    }
    return _xblockexpression;
  }
  
  protected static boolean _privk3_isActive(final FunctionAspectAbstractFunctionAspectProperties _self_, final AbstractFunction _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isIsActive") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.isActive;
  }
  
  protected static void _privk3_isActive(final FunctionAspectAbstractFunctionAspectProperties _self_, final AbstractFunction _self, final boolean isActive) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setIsActive")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, isActive);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.isActive = isActive;
    }
  }
  
  protected static boolean _privk3_isStarted(final FunctionAspectAbstractFunctionAspectProperties _self_, final AbstractFunction _self) {
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
  
  protected static void _privk3_isStarted(final FunctionAspectAbstractFunctionAspectProperties _self_, final AbstractFunction _self, final boolean isStarted) {
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
  
  protected static boolean _privk3_isReady(final FunctionAspectAbstractFunctionAspectProperties _self_, final AbstractFunction _self) {
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
  
  protected static void _privk3_isReady(final FunctionAspectAbstractFunctionAspectProperties _self_, final AbstractFunction _self, final boolean isReady) {
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
  
  protected static boolean _privk3_isSuspended(final FunctionAspectAbstractFunctionAspectProperties _self_, final AbstractFunction _self) {
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
  
  protected static void _privk3_isSuspended(final FunctionAspectAbstractFunctionAspectProperties _self_, final AbstractFunction _self, final boolean isSuspended) {
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
  
  protected static boolean _privk3_isStopped(final FunctionAspectAbstractFunctionAspectProperties _self_, final AbstractFunction _self) {
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
  
  protected static void _privk3_isStopped(final FunctionAspectAbstractFunctionAspectProperties _self_, final AbstractFunction _self, final boolean isStopped) {
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
  
  protected static boolean _privk3_isRunning(final FunctionAspectAbstractFunctionAspectProperties _self_, final AbstractFunction _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isIsRunning") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.isRunning;
  }
  
  protected static void _privk3_isRunning(final FunctionAspectAbstractFunctionAspectProperties _self_, final AbstractFunction _self, final boolean isRunning) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setIsRunning")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, isRunning);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.isRunning = isRunning;
    }
  }
}
