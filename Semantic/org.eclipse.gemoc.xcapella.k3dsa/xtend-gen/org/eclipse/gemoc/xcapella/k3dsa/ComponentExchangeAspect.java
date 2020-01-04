package org.eclipse.gemoc.xcapella.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.gemoc.xcapella.k3dsa.ComponentExchangeAspectComponentExchangeAspectProperties;
import org.polarsys.capella.core.data.fa.ComponentExchange;

@Aspect(className = ComponentExchange.class)
@SuppressWarnings("all")
public class ComponentExchangeAspect {
  public static void fake(final ComponentExchange _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.ComponentExchangeAspectComponentExchangeAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.ComponentExchangeAspectComponentExchangeAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void fake()
    if (_self instanceof org.polarsys.capella.core.data.fa.ComponentExchange){
    	org.eclipse.gemoc.xcapella.k3dsa.ComponentExchangeAspect._privk3_fake(_self_, (org.polarsys.capella.core.data.fa.ComponentExchange)_self);
    };
  }
  
  public static Double value(final ComponentExchange _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.ComponentExchangeAspectComponentExchangeAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.ComponentExchangeAspectComponentExchangeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Double value()
    if (_self instanceof org.polarsys.capella.core.data.fa.ComponentExchange){
    	result = org.eclipse.gemoc.xcapella.k3dsa.ComponentExchangeAspect._privk3_value(_self_, (org.polarsys.capella.core.data.fa.ComponentExchange)_self);
    };
    return (java.lang.Double)result;
  }
  
  public static void value(final ComponentExchange _self, final Double value) {
    final org.eclipse.gemoc.xcapella.k3dsa.ComponentExchangeAspectComponentExchangeAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.ComponentExchangeAspectComponentExchangeAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void value(Double)
    if (_self instanceof org.polarsys.capella.core.data.fa.ComponentExchange){
    	org.eclipse.gemoc.xcapella.k3dsa.ComponentExchangeAspect._privk3_value(_self_, (org.polarsys.capella.core.data.fa.ComponentExchange)_self,value);
    };
  }
  
  protected static void _privk3_fake(final ComponentExchangeAspectComponentExchangeAspectProperties _self_, final ComponentExchange _self) {
  }
  
  protected static Double _privk3_value(final ComponentExchangeAspectComponentExchangeAspectProperties _self_, final ComponentExchange _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Double) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.value;
  }
  
  protected static void _privk3_value(final ComponentExchangeAspectComponentExchangeAspectProperties _self_, final ComponentExchange _self, final Double value) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setValue")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, value);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.value = value;
    }
  }
}
