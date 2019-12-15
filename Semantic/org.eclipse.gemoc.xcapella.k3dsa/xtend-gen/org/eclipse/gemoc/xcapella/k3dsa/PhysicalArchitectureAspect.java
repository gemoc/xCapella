package org.eclipse.gemoc.xcapella.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.gemoc.xcapella.k3dsa.PhysicalArchitectureAspectPhysicalArchitectureAspectProperties;
import org.eclipse.gemoc.xcapella.k3dsa.XcapellaPlotter;
import org.polarsys.capella.core.data.pa.PhysicalArchitecture;

@Aspect(className = PhysicalArchitecture.class)
@SuppressWarnings("all")
public class PhysicalArchitectureAspect {
  public static String getLabel(final PhysicalArchitecture _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.PhysicalArchitectureAspectPhysicalArchitectureAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.PhysicalArchitectureAspectPhysicalArchitectureAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getLabel()
    if (_self instanceof org.polarsys.capella.core.data.pa.PhysicalArchitecture){
    	result = org.eclipse.gemoc.xcapella.k3dsa.PhysicalArchitectureAspect._privk3_getLabel(_self_, (org.polarsys.capella.core.data.pa.PhysicalArchitecture)_self);
    };
    return (java.lang.String)result;
  }
  
  public static Integer currentTime(final PhysicalArchitecture _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.PhysicalArchitectureAspectPhysicalArchitectureAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.PhysicalArchitectureAspectPhysicalArchitectureAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer currentTime()
    if (_self instanceof org.polarsys.capella.core.data.pa.PhysicalArchitecture){
    	result = org.eclipse.gemoc.xcapella.k3dsa.PhysicalArchitectureAspect._privk3_currentTime(_self_, (org.polarsys.capella.core.data.pa.PhysicalArchitecture)_self);
    };
    return (java.lang.Integer)result;
  }
  
  public static void currentTime(final PhysicalArchitecture _self, final Integer currentTime) {
    final org.eclipse.gemoc.xcapella.k3dsa.PhysicalArchitectureAspectPhysicalArchitectureAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.PhysicalArchitectureAspectPhysicalArchitectureAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void currentTime(Integer)
    if (_self instanceof org.polarsys.capella.core.data.pa.PhysicalArchitecture){
    	org.eclipse.gemoc.xcapella.k3dsa.PhysicalArchitectureAspect._privk3_currentTime(_self_, (org.polarsys.capella.core.data.pa.PhysicalArchitecture)_self,currentTime);
    };
  }
  
  protected static String _privk3_getLabel(final PhysicalArchitectureAspectPhysicalArchitectureAspectProperties _self_, final PhysicalArchitecture _self) {
    Integer _currentTime = PhysicalArchitectureAspect.currentTime(_self);
    int _plus = ((_currentTime).intValue() + 100);
    PhysicalArchitectureAspect.currentTime(_self, Integer.valueOf(_plus));
    XcapellaPlotter.current_time = PhysicalArchitectureAspect.currentTime(_self);
    return _self.getName();
  }
  
  protected static Integer _privk3_currentTime(final PhysicalArchitectureAspectPhysicalArchitectureAspectProperties _self_, final PhysicalArchitecture _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentTime") &&
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
    return _self_.currentTime;
  }
  
  protected static void _privk3_currentTime(final PhysicalArchitectureAspectPhysicalArchitectureAspectProperties _self_, final PhysicalArchitecture _self, final Integer currentTime) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentTime")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentTime);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.currentTime = currentTime;
    }
  }
}
