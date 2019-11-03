package org.gemoc.scenario.k3dsa;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.scenario.k3dsa.AbstractEndAspectAbstractEndAspectProperties;
import org.polarsys.capella.core.data.interaction.AbstractEnd;
import org.polarsys.capella.core.data.interaction.Execution;
import org.polarsys.capella.core.data.interaction.MessageEnd;
import org.polarsys.capella.core.data.interaction.Scenario;
import org.polarsys.capella.core.data.interaction.SequenceMessage;
import org.polarsys.capella.core.data.interaction.TimeLapse;

/**
 * Simple Ecore extension allowing to annotate all classes of an ecore model by adding
 * an annotation containing the list of all super classes (flat)
 */
@Aspect(className = AbstractEnd.class)
@SuppressWarnings("all")
public class AbstractEndAspect {
  public static String getLabel(final AbstractEnd _self) {
    final org.gemoc.scenario.k3dsa.AbstractEndAspectAbstractEndAspectProperties _self_ = org.gemoc.scenario.k3dsa.AbstractEndAspectAbstractEndAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getLabel()
    if (_self instanceof org.polarsys.capella.core.data.interaction.AbstractEnd){
    	result = org.gemoc.scenario.k3dsa.AbstractEndAspect._privk3_getLabel(_self_, (org.polarsys.capella.core.data.interaction.AbstractEnd)_self);
    };
    return (java.lang.String)result;
  }
  
  public static int occ(final AbstractEnd _self) {
    final org.gemoc.scenario.k3dsa.AbstractEndAspectAbstractEndAspectProperties _self_ = org.gemoc.scenario.k3dsa.AbstractEndAspectAbstractEndAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# int occ()
    if (_self instanceof org.polarsys.capella.core.data.interaction.AbstractEnd){
    	result = org.gemoc.scenario.k3dsa.AbstractEndAspect._privk3_occ(_self_, (org.polarsys.capella.core.data.interaction.AbstractEnd)_self);
    };
    return (int)result;
  }
  
  public static void occ(final AbstractEnd _self, final int occ) {
    final org.gemoc.scenario.k3dsa.AbstractEndAspectAbstractEndAspectProperties _self_ = org.gemoc.scenario.k3dsa.AbstractEndAspectAbstractEndAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void occ(int)
    if (_self instanceof org.polarsys.capella.core.data.interaction.AbstractEnd){
    	org.gemoc.scenario.k3dsa.AbstractEndAspect._privk3_occ(_self_, (org.polarsys.capella.core.data.interaction.AbstractEnd)_self,occ);
    };
  }
  
  protected static String _privk3_getLabel(final AbstractEndAspectAbstractEndAspectProperties _self_, final AbstractEnd _self) {
    if ((_self instanceof MessageEnd)) {
      MessageEnd _sendingEnd = ((MessageEnd)_self).getMessage().getSendingEnd();
      boolean _equals = Objects.equal(_sendingEnd, _self);
      if (_equals) {
        int _occ = AbstractEndAspect.occ(_self);
        int _plus = (_occ + 1);
        AbstractEndAspect.occ(_self, _plus);
        SequenceMessage _message = ((MessageEnd)_self).getMessage();
        int _occ_1 = AbstractEndAspect.occ(_self);
        String _plus_1 = ("occurred" + Integer.valueOf(_occ_1));
        _message.setReview(_plus_1);
      } else {
        SequenceMessage _message_1 = ((MessageEnd)_self).getMessage();
        _message_1.setReview("");
      }
    }
    EObject _eContainer = _self.eContainer();
    final Consumer<TimeLapse> _function = (TimeLapse tl) -> {
      if ((tl instanceof Execution)) {
        if ((Objects.equal(((Execution)tl).getCovered(), _self.getCovered()) && Objects.equal(((Execution)tl).getStart(), _self))) {
          ((Execution)tl).setReview("started");
        }
      }
    };
    ((Scenario) _eContainer).getOwnedTimeLapses().forEach(_function);
    EObject _eContainer_1 = _self.eContainer();
    final Consumer<TimeLapse> _function_1 = (TimeLapse tl) -> {
      if ((tl instanceof Execution)) {
        if ((Objects.equal(((Execution)tl).getCovered(), _self.getCovered()) && Objects.equal(((Execution)tl).getFinish(), _self))) {
          ((Execution)tl).setReview("");
        }
      }
    };
    ((Scenario) _eContainer_1).getOwnedTimeLapses().forEach(_function_1);
    String _name = _self.getName();
    String _plus_2 = (_name + " is occurring");
    InputOutput.<String>println(_plus_2);
    return _self.getName();
  }
  
  protected static int _privk3_occ(final AbstractEndAspectAbstractEndAspectProperties _self_, final AbstractEnd _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getOcc") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.occ;
  }
  
  protected static void _privk3_occ(final AbstractEndAspectAbstractEndAspectProperties _self_, final AbstractEnd _self, final int occ) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setOcc")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, occ);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.occ = occ;
    }
  }
}
