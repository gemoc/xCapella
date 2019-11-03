package org.gemoc.xcapella.dataflow.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.xcapella.dataflow.k3dsa.FunctionalChainAspectFunctionalChainAspectProperties;
import org.polarsys.capella.core.data.fa.FunctionalChain;

@Aspect(className = FunctionalChain.class)
@SuppressWarnings("all")
public class FunctionalChainAspect {
  public static String getLabel(final FunctionalChain _self) {
    final org.gemoc.xcapella.dataflow.k3dsa.FunctionalChainAspectFunctionalChainAspectProperties _self_ = org.gemoc.xcapella.dataflow.k3dsa.FunctionalChainAspectFunctionalChainAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getLabel()
    if (_self instanceof org.polarsys.capella.core.data.fa.FunctionalChain){
    	result = org.gemoc.xcapella.dataflow.k3dsa.FunctionalChainAspect._privk3_getLabel(_self_, (org.polarsys.capella.core.data.fa.FunctionalChain)_self);
    };
    return (java.lang.String)result;
  }
  
  public static String destroy(final FunctionalChain _self) {
    final org.gemoc.xcapella.dataflow.k3dsa.FunctionalChainAspectFunctionalChainAspectProperties _self_ = org.gemoc.xcapella.dataflow.k3dsa.FunctionalChainAspectFunctionalChainAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String destroy()
    if (_self instanceof org.polarsys.capella.core.data.fa.FunctionalChain){
    	result = org.gemoc.xcapella.dataflow.k3dsa.FunctionalChainAspect._privk3_destroy(_self_, (org.polarsys.capella.core.data.fa.FunctionalChain)_self);
    };
    return (java.lang.String)result;
  }
  
  public static boolean isActive(final FunctionalChain _self) {
    final org.gemoc.xcapella.dataflow.k3dsa.FunctionalChainAspectFunctionalChainAspectProperties _self_ = org.gemoc.xcapella.dataflow.k3dsa.FunctionalChainAspectFunctionalChainAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isActive()
    if (_self instanceof org.polarsys.capella.core.data.fa.FunctionalChain){
    	result = org.gemoc.xcapella.dataflow.k3dsa.FunctionalChainAspect._privk3_isActive(_self_, (org.polarsys.capella.core.data.fa.FunctionalChain)_self);
    };
    return (boolean)result;
  }
  
  public static void isActive(final FunctionalChain _self, final boolean isActive) {
    final org.gemoc.xcapella.dataflow.k3dsa.FunctionalChainAspectFunctionalChainAspectProperties _self_ = org.gemoc.xcapella.dataflow.k3dsa.FunctionalChainAspectFunctionalChainAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void isActive(boolean)
    if (_self instanceof org.polarsys.capella.core.data.fa.FunctionalChain){
    	org.gemoc.xcapella.dataflow.k3dsa.FunctionalChainAspect._privk3_isActive(_self_, (org.polarsys.capella.core.data.fa.FunctionalChain)_self,isActive);
    };
  }
  
  protected static String _privk3_getLabel(final FunctionalChainAspectFunctionalChainAspectProperties _self_, final FunctionalChain _self) {
    String _xblockexpression = null;
    {
      EObject _eContainer = _self.eContainer();
      FunctionalChain chain = ((FunctionalChain) _eContainer);
      boolean _isActive = FunctionalChainAspect.isActive(_self);
      if (_isActive) {
        String _name = chain.getName();
        String _plus = ("ERROR: " + _name);
        String _plus_1 = (_plus + " HAS BEEN ACTIVATED ELSEWHERE!");
        InputOutput.<String>println(_plus_1);
        return "ERROR";
      }
      FunctionalChainAspect.isActive(_self, true);
      String _name_1 = chain.getName();
      String _plus_2 = (_name_1 + " ACTIVE!");
      _xblockexpression = InputOutput.<String>println(_plus_2);
    }
    return _xblockexpression;
  }
  
  protected static String _privk3_destroy(final FunctionalChainAspectFunctionalChainAspectProperties _self_, final FunctionalChain _self) {
    String _xblockexpression = null;
    {
      EObject _eContainer = _self.eContainer();
      FunctionalChain chain = ((FunctionalChain) _eContainer);
      boolean _isActive = FunctionalChainAspect.isActive(_self);
      boolean _not = (!_isActive);
      if (_not) {
        String _name = chain.getName();
        String _plus = ("ERROR: " + _name);
        String _plus_1 = (_plus + " HAS BEEN DEACTIVATED ELSEWHERE!");
        InputOutput.<String>println(_plus_1);
        return "ERROR";
      }
      FunctionalChainAspect.isActive(_self, false);
      String _name_1 = chain.getName();
      String _plus_2 = (_name_1 + " NOT ACTIVE!");
      _xblockexpression = InputOutput.<String>println(_plus_2);
    }
    return _xblockexpression;
  }
  
  protected static boolean _privk3_isActive(final FunctionalChainAspectFunctionalChainAspectProperties _self_, final FunctionalChain _self) {
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
  
  protected static void _privk3_isActive(final FunctionalChainAspectFunctionalChainAspectProperties _self_, final FunctionalChain _self, final boolean isActive) {
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
}
