package org.eclipse.gemoc.xcapella.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import groovy.lang.Binding;
import org.eclipse.gemoc.xcapella.k3dsa.CapellaElementAspect;
import org.eclipse.gemoc.xcapella.k3dsa.StateTransitionAspectStateTransitionAspectProperties;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.polarsys.capella.core.data.capellacommon.StateTransition;

@Aspect(className = StateTransition.class)
@SuppressWarnings("all")
public class StateTransitionAspect {
  public static String getLabel(final StateTransition _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.StateTransitionAspectStateTransitionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.StateTransitionAspectStateTransitionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getLabel()
    if (_self instanceof org.polarsys.capella.core.data.capellacommon.StateTransition){
    	result = org.eclipse.gemoc.xcapella.k3dsa.StateTransitionAspect._privk3_getLabel(_self_, (org.polarsys.capella.core.data.capellacommon.StateTransition)_self);
    };
    return (java.lang.String)result;
  }
  
  protected static String _privk3_getLabel(final StateTransitionAspectStateTransitionAspectProperties _self_, final StateTransition _self) {
    String _name = _self.getName();
    String _plus = (_name + " fired");
    InputOutput.<String>println(_plus);
    String _description = _self.getDescription();
    boolean _tripleNotEquals = (_description != null);
    if (_tripleNotEquals) {
      String _description_1 = _self.getDescription();
      String _plus_1 = ("run: \n" + _description_1);
      InputOutput.<String>println(_plus_1);
      Binding _binding = new Binding();
      CapellaElementAspect.callGroovy(_self, _binding);
    }
    return _self.getName();
  }
}
