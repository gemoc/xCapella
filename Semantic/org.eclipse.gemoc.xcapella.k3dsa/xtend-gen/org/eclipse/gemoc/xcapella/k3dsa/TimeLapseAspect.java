package org.eclipse.gemoc.xcapella.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.gemoc.xcapella.k3dsa.TimeLapseAspectTimeLapseAspectProperties;
import org.polarsys.capella.core.data.interaction.TimeLapse;

@Aspect(className = TimeLapse.class)
@SuppressWarnings("all")
public class TimeLapseAspect {
  public static Boolean isExecuting(final TimeLapse _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.TimeLapseAspectTimeLapseAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.TimeLapseAspectTimeLapseAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Boolean isExecuting()
    if (_self instanceof org.polarsys.capella.core.data.interaction.TimeLapse){
    	result = org.eclipse.gemoc.xcapella.k3dsa.TimeLapseAspect._privk3_isExecuting(_self_, (org.polarsys.capella.core.data.interaction.TimeLapse)_self);
    };
    return (java.lang.Boolean)result;
  }
  
  public static void isExecuting(final TimeLapse _self, final Boolean isExecuting) {
    final org.eclipse.gemoc.xcapella.k3dsa.TimeLapseAspectTimeLapseAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.TimeLapseAspectTimeLapseAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void isExecuting(Boolean)
    if (_self instanceof org.polarsys.capella.core.data.interaction.TimeLapse){
    	org.eclipse.gemoc.xcapella.k3dsa.TimeLapseAspect._privk3_isExecuting(_self_, (org.polarsys.capella.core.data.interaction.TimeLapse)_self,isExecuting);
    };
  }
  
  protected static Boolean _privk3_isExecuting(final TimeLapseAspectTimeLapseAspectProperties _self_, final TimeLapse _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isIsExecuting") &&
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
    return _self_.isExecuting;
  }
  
  protected static void _privk3_isExecuting(final TimeLapseAspectTimeLapseAspectProperties _self_, final TimeLapse _self, final Boolean isExecuting) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setIsExecuting")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, isExecuting);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.isExecuting = isExecuting;
    }
  }
}
