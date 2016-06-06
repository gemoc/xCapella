package org.gemoc.scenario.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.gemoc.scenario.k3dsa.AbstractEndAspectAbstractEndAspectProperties;
import org.polarsys.capella.core.data.interaction.AbstractEnd;
import org.polarsys.capella.core.data.interaction.Execution;
import org.polarsys.capella.core.data.interaction.ExecutionEnd;
import org.polarsys.capella.core.data.interaction.MessageEnd;
import org.polarsys.capella.core.data.interaction.SequenceMessage;

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
    result = _privk3_getLabel(_self_, _self);;
    return (java.lang.String)result;
  }
  
  private static int occ(final AbstractEnd _self) {
    final org.gemoc.scenario.k3dsa.AbstractEndAspectAbstractEndAspectProperties _self_ = org.gemoc.scenario.k3dsa.AbstractEndAspectAbstractEndAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_occ(_self_, _self);;
    return (int)result;
  }
  
  private static void occ(final AbstractEnd _self, final int occ) {
    final org.gemoc.scenario.k3dsa.AbstractEndAspectAbstractEndAspectProperties _self_ = org.gemoc.scenario.k3dsa.AbstractEndAspectAbstractEndAspectContext.getSelf(_self);
    _privk3_occ(_self_, _self,occ);;
  }
  
  protected static String _privk3_getLabel(final AbstractEndAspectAbstractEndAspectProperties _self_, final AbstractEnd _self) {
    String _name = _self.getName();
    String _plus = (_name + " is occurring");
    InputOutput.<String>println(_plus);
    if ((_self instanceof ExecutionEnd)) {
      int _occ = AbstractEndAspect.occ(_self);
      int _plus_1 = (_occ + 1);
      AbstractEndAspect.occ(_self, _plus_1);
      Execution _execution = ((ExecutionEnd)_self).getExecution();
      int _occ_1 = AbstractEndAspect.occ(_self);
      String _plus_2 = ("occurred !" + Integer.valueOf(_occ_1));
      _execution.setReview(_plus_2);
    }
    if ((_self instanceof MessageEnd)) {
      int _occ_2 = AbstractEndAspect.occ(_self);
      int _plus_3 = (_occ_2 + 1);
      AbstractEndAspect.occ(_self, _plus_3);
      SequenceMessage _message = ((MessageEnd)_self).getMessage();
      int _occ_3 = AbstractEndAspect.occ(_self);
      String _plus_4 = ("occurred !" + Integer.valueOf(_occ_3));
      _message.setReview(_plus_4);
    }
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
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.occ;
  }
  
  protected static void _privk3_occ(final AbstractEndAspectAbstractEndAspectProperties _self_, final AbstractEnd _self, final int occ) {
    _self_.occ = occ; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setOcc")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, occ);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
