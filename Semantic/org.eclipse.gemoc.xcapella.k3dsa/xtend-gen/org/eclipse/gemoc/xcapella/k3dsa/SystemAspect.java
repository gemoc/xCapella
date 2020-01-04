package org.eclipse.gemoc.xcapella.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import groovy.lang.Binding;
import org.eclipse.gemoc.xcapella.k3dsa.CapellaElementAspect;
import org.eclipse.gemoc.xcapella.k3dsa.SystemAspectSystemAspectProperties;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = org.polarsys.capella.core.data.ctx.System.class)
@SuppressWarnings("all")
public class SystemAspect {
  public static org.polarsys.capella.core.data.ctx.System instance = null;
  
  public static String getLabel(final org.polarsys.capella.core.data.ctx.System _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.SystemAspectSystemAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.SystemAspectSystemAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getLabel()
    if (_self instanceof org.polarsys.capella.core.data.ctx.System){
    	result = org.eclipse.gemoc.xcapella.k3dsa.SystemAspect._privk3_getLabel(_self_, (org.polarsys.capella.core.data.ctx.System)_self);
    };
    return (java.lang.String)result;
  }
  
  protected static String _privk3_getLabel(final SystemAspectSystemAspectProperties _self_, final org.polarsys.capella.core.data.ctx.System _self) {
    SystemAspect.instance = _self;
    String _description = _self.getDescription();
    boolean _tripleNotEquals = (_description != null);
    if (_tripleNotEquals) {
      String _description_1 = _self.getDescription();
      String _plus = ("run: \n" + _description_1);
      InputOutput.<String>println(_plus);
      Binding _binding = new Binding();
      CapellaElementAspect.callGroovy(_self, _binding);
    }
    return _self.getName();
  }
}
