package org.eclipse.gemoc.xcapella.k3dsa;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gemoc.xcapella.k3dsa.ComponentExchangeAspect;
import org.eclipse.gemoc.xcapella.k3dsa.PhysicalComponentAspectPhysicalComponentAspectProperties;
import org.eclipse.gemoc.xcapella.k3dsa.XcapellaPlotter;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.javafmi.wrapper.Simulation;
import org.javafmi.wrapper.v2.Access;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentPort;
import org.polarsys.capella.core.data.information.Port;
import org.polarsys.capella.core.data.pa.PhysicalComponent;

@Aspect(className = PhysicalComponent.class)
@SuppressWarnings("all")
public class PhysicalComponentAspect {
  public static String getLabel(final PhysicalComponent _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.PhysicalComponentAspectPhysicalComponentAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.PhysicalComponentAspectPhysicalComponentAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getLabel()
    if (_self instanceof org.polarsys.capella.core.data.pa.PhysicalComponent){
    	result = org.eclipse.gemoc.xcapella.k3dsa.PhysicalComponentAspect._privk3_getLabel(_self_, (org.polarsys.capella.core.data.pa.PhysicalComponent)_self);
    };
    return (java.lang.String)result;
  }
  
  public static String getFullLabel(final PhysicalComponent _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.PhysicalComponentAspectPhysicalComponentAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.PhysicalComponentAspectPhysicalComponentAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getFullLabel()
    if (_self instanceof org.polarsys.capella.core.data.pa.PhysicalComponent){
    	result = org.eclipse.gemoc.xcapella.k3dsa.PhysicalComponentAspect._privk3_getFullLabel(_self_, (org.polarsys.capella.core.data.pa.PhysicalComponent)_self);
    };
    return (java.lang.String)result;
  }
  
  public static Boolean hasUnnamedLabel(final PhysicalComponent _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.PhysicalComponentAspectPhysicalComponentAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.PhysicalComponentAspectPhysicalComponentAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Boolean hasUnnamedLabel()
    if (_self instanceof org.polarsys.capella.core.data.pa.PhysicalComponent){
    	result = org.eclipse.gemoc.xcapella.k3dsa.PhysicalComponentAspect._privk3_hasUnnamedLabel(_self_, (org.polarsys.capella.core.data.pa.PhysicalComponent)_self);
    };
    return (java.lang.Boolean)result;
  }
  
  public static Simulation javaFMI_FMU(final PhysicalComponent _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.PhysicalComponentAspectPhysicalComponentAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.PhysicalComponentAspectPhysicalComponentAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Simulation javaFMI_FMU()
    if (_self instanceof org.polarsys.capella.core.data.pa.PhysicalComponent){
    	result = org.eclipse.gemoc.xcapella.k3dsa.PhysicalComponentAspect._privk3_javaFMI_FMU(_self_, (org.polarsys.capella.core.data.pa.PhysicalComponent)_self);
    };
    return (org.javafmi.wrapper.Simulation)result;
  }
  
  public static void javaFMI_FMU(final PhysicalComponent _self, final Simulation javaFMI_FMU) {
    final org.eclipse.gemoc.xcapella.k3dsa.PhysicalComponentAspectPhysicalComponentAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.PhysicalComponentAspectPhysicalComponentAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void javaFMI_FMU(Simulation)
    if (_self instanceof org.polarsys.capella.core.data.pa.PhysicalComponent){
    	org.eclipse.gemoc.xcapella.k3dsa.PhysicalComponentAspect._privk3_javaFMI_FMU(_self_, (org.polarsys.capella.core.data.pa.PhysicalComponent)_self,javaFMI_FMU);
    };
  }
  
  public static Access fmuAccess(final PhysicalComponent _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.PhysicalComponentAspectPhysicalComponentAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.PhysicalComponentAspectPhysicalComponentAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Access fmuAccess()
    if (_self instanceof org.polarsys.capella.core.data.pa.PhysicalComponent){
    	result = org.eclipse.gemoc.xcapella.k3dsa.PhysicalComponentAspect._privk3_fmuAccess(_self_, (org.polarsys.capella.core.data.pa.PhysicalComponent)_self);
    };
    return (org.javafmi.wrapper.v2.Access)result;
  }
  
  public static void fmuAccess(final PhysicalComponent _self, final Access fmuAccess) {
    final org.eclipse.gemoc.xcapella.k3dsa.PhysicalComponentAspectPhysicalComponentAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.PhysicalComponentAspectPhysicalComponentAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void fmuAccess(Access)
    if (_self instanceof org.polarsys.capella.core.data.pa.PhysicalComponent){
    	org.eclipse.gemoc.xcapella.k3dsa.PhysicalComponentAspect._privk3_fmuAccess(_self_, (org.polarsys.capella.core.data.pa.PhysicalComponent)_self,fmuAccess);
    };
  }
  
  protected static String _privk3_getLabel(final PhysicalComponentAspectPhysicalComponentAspectProperties _self_, final PhysicalComponent _self) {
    EObject _eContainer = _self.eContainer().eContainer();
    XcapellaPlotter.initialize(((CapellaElement) _eContainer));
    boolean _startsWith = _self.getDescription().startsWith("fmuPath:");
    if (_startsWith) {
      String _replace = _self.getDescription().replace("fmuPath:", "");
      Simulation _simulation = new Simulation(_replace);
      PhysicalComponentAspect.javaFMI_FMU(_self, _simulation);
      PhysicalComponentAspect.javaFMI_FMU(_self).init(0.0);
      Simulation _javaFMI_FMU = PhysicalComponentAspect.javaFMI_FMU(_self);
      Access _access = new Access(_javaFMI_FMU);
      PhysicalComponentAspect.fmuAccess(_self, _access);
      Iterable<ComponentPort> _filter = Iterables.<ComponentPort>filter(_self.getOwnedFeatures(), ComponentPort.class);
      for (final ComponentPort cp : _filter) {
        EObject _eContainer_1 = _self.eContainer();
        final Function1<ComponentExchange, Boolean> _function = new Function1<ComponentExchange, Boolean>() {
          @Override
          public Boolean apply(final ComponentExchange ce) {
            Port _targetPort = ce.getTargetPort();
            return Boolean.valueOf(Objects.equal(_targetPort, cp));
          }
        };
        Iterable<ComponentExchange> _filter_1 = IterableExtensions.<ComponentExchange>filter(((PhysicalComponent) _eContainer_1).getOwnedComponentExchanges(), _function);
        for (final ComponentExchange ce : _filter_1) {
          boolean _startsWith_1 = ce.getDescription().startsWith("value:");
          if (_startsWith_1) {
            String _description = ce.getDescription();
            String _plus = ("description " + _description);
            InputOutput.<String>println(_plus);
            String _replace_1 = ce.getDescription().replace("value:", "");
            Double _double = new Double(_replace_1);
            ComponentExchangeAspect.value(ce, _double);
          } else {
            ComponentExchangeAspect.value(ce, Double.valueOf(10.0));
          }
        }
      }
    }
    InputOutput.<String>println("initialized");
    return _self.getName();
  }
  
  protected static String _privk3_getFullLabel(final PhysicalComponentAspectPhysicalComponentAspectProperties _self_, final PhysicalComponent _self) {
    Iterable<ComponentPort> _filter = Iterables.<ComponentPort>filter(_self.getOwnedFeatures(), ComponentPort.class);
    for (final ComponentPort cp : _filter) {
      EObject _eContainer = _self.eContainer();
      final Function1<ComponentExchange, Boolean> _function = new Function1<ComponentExchange, Boolean>() {
        @Override
        public Boolean apply(final ComponentExchange ce) {
          Port _targetPort = ce.getTargetPort();
          return Boolean.valueOf(Objects.equal(_targetPort, cp));
        }
      };
      Iterable<ComponentExchange> _filter_1 = IterableExtensions.<ComponentExchange>filter(((PhysicalComponent) _eContainer).getOwnedComponentExchanges(), _function);
      for (final ComponentExchange ce : _filter_1) {
        PhysicalComponentAspect.javaFMI_FMU(_self).write(cp.getName()).with((ComponentExchangeAspect.value(ce)).doubleValue());
      }
    }
    PhysicalComponentAspect.javaFMI_FMU(_self).doStep(0.1);
    InputOutput.<String>println("fire");
    return _self.getName();
  }
  
  protected static Boolean _privk3_hasUnnamedLabel(final PhysicalComponentAspectPhysicalComponentAspectProperties _self_, final PhysicalComponent _self) {
    Iterable<ComponentPort> _filter = Iterables.<ComponentPort>filter(_self.getOwnedFeatures(), ComponentPort.class);
    for (final ComponentPort cp : _filter) {
      EObject _eContainer = _self.eContainer();
      final Function1<ComponentExchange, Boolean> _function = new Function1<ComponentExchange, Boolean>() {
        @Override
        public Boolean apply(final ComponentExchange ce) {
          Port _sourcePort = ce.getSourcePort();
          return Boolean.valueOf(Objects.equal(_sourcePort, cp));
        }
      };
      Iterable<ComponentExchange> _filter_1 = IterableExtensions.<ComponentExchange>filter(((PhysicalComponent) _eContainer).getOwnedComponentExchanges(), _function);
      for (final ComponentExchange ce : _filter_1) {
        {
          ComponentExchangeAspect.value(ce, Double.valueOf(PhysicalComponentAspect.javaFMI_FMU(_self).read(cp.getName()).asDouble()));
          InputOutput.<Double>println(ComponentExchangeAspect.value(ce));
        }
      }
    }
    InputOutput.<String>println("post fire");
    return Boolean.valueOf(true);
  }
  
  protected static Simulation _privk3_javaFMI_FMU(final PhysicalComponentAspectPhysicalComponentAspectProperties _self_, final PhysicalComponent _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getJavaFMI_FMU") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.javafmi.wrapper.Simulation) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.javaFMI_FMU;
  }
  
  protected static void _privk3_javaFMI_FMU(final PhysicalComponentAspectPhysicalComponentAspectProperties _self_, final PhysicalComponent _self, final Simulation javaFMI_FMU) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setJavaFMI_FMU")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, javaFMI_FMU);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.javaFMI_FMU = javaFMI_FMU;
    }
  }
  
  protected static Access _privk3_fmuAccess(final PhysicalComponentAspectPhysicalComponentAspectProperties _self_, final PhysicalComponent _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getFmuAccess") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.javafmi.wrapper.v2.Access) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.fmuAccess;
  }
  
  protected static void _privk3_fmuAccess(final PhysicalComponentAspectPhysicalComponentAspectProperties _self_, final PhysicalComponent _self, final Access fmuAccess) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setFmuAccess")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, fmuAccess);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.fmuAccess = fmuAccess;
    }
  }
}
