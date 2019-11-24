package org.eclipse.gemoc.xcapella.k3dsa;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gemoc.xcapella.k3dsa.AbstractEndAspectAbstractEndAspectProperties;
import org.eclipse.gemoc.xcapella.k3dsa.TimeLapseAspect;
import org.eclipse.xtext.xbase.lib.InputOutput;
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
    final org.eclipse.gemoc.xcapella.k3dsa.AbstractEndAspectAbstractEndAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.AbstractEndAspectAbstractEndAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getLabel()
    if (_self instanceof org.polarsys.capella.core.data.interaction.AbstractEnd){
    	result = org.eclipse.gemoc.xcapella.k3dsa.AbstractEndAspect._privk3_getLabel(_self_, (org.polarsys.capella.core.data.interaction.AbstractEnd)_self);
    };
    return (java.lang.String)result;
  }
  
  public static Integer occurrenceNumber(final AbstractEnd _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.AbstractEndAspectAbstractEndAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.AbstractEndAspectAbstractEndAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer occurrenceNumber()
    if (_self instanceof org.polarsys.capella.core.data.interaction.AbstractEnd){
    	result = org.eclipse.gemoc.xcapella.k3dsa.AbstractEndAspect._privk3_occurrenceNumber(_self_, (org.polarsys.capella.core.data.interaction.AbstractEnd)_self);
    };
    return (java.lang.Integer)result;
  }
  
  public static void occurrenceNumber(final AbstractEnd _self, final Integer occurrenceNumber) {
    final org.eclipse.gemoc.xcapella.k3dsa.AbstractEndAspectAbstractEndAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.AbstractEndAspectAbstractEndAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void occurrenceNumber(Integer)
    if (_self instanceof org.polarsys.capella.core.data.interaction.AbstractEnd){
    	org.eclipse.gemoc.xcapella.k3dsa.AbstractEndAspect._privk3_occurrenceNumber(_self_, (org.polarsys.capella.core.data.interaction.AbstractEnd)_self,occurrenceNumber);
    };
  }
  
  public static Boolean occurred(final AbstractEnd _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.AbstractEndAspectAbstractEndAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.AbstractEndAspectAbstractEndAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Boolean occurred()
    if (_self instanceof org.polarsys.capella.core.data.interaction.AbstractEnd){
    	result = org.eclipse.gemoc.xcapella.k3dsa.AbstractEndAspect._privk3_occurred(_self_, (org.polarsys.capella.core.data.interaction.AbstractEnd)_self);
    };
    return (java.lang.Boolean)result;
  }
  
  public static void occurred(final AbstractEnd _self, final Boolean occurred) {
    final org.eclipse.gemoc.xcapella.k3dsa.AbstractEndAspectAbstractEndAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.AbstractEndAspectAbstractEndAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void occurred(Boolean)
    if (_self instanceof org.polarsys.capella.core.data.interaction.AbstractEnd){
    	org.eclipse.gemoc.xcapella.k3dsa.AbstractEndAspect._privk3_occurred(_self_, (org.polarsys.capella.core.data.interaction.AbstractEnd)_self,occurred);
    };
  }
  
  protected static String _privk3_getLabel(final AbstractEndAspectAbstractEndAspectProperties _self_, final AbstractEnd _self) {
    if ((_self instanceof MessageEnd)) {
      MessageEnd _sendingEnd = ((MessageEnd)_self).getMessage().getSendingEnd();
      boolean _equals = Objects.equal(_sendingEnd, _self);
      if (_equals) {
        Integer _occurrenceNumber = AbstractEndAspect.occurrenceNumber(_self);
        int _plus = ((_occurrenceNumber).intValue() + 1);
        AbstractEndAspect.occurrenceNumber(_self, Integer.valueOf(_plus));
        SequenceMessage _message = ((MessageEnd)_self).getMessage();
        Integer _occurrenceNumber_1 = AbstractEndAspect.occurrenceNumber(_self);
        String _plus_1 = ("occurred" + _occurrenceNumber_1);
        _message.setReview(_plus_1);
        AbstractEndAspect.occurred(_self, Boolean.valueOf(true));
      } else {
        SequenceMessage _message_1 = ((MessageEnd)_self).getMessage();
        _message_1.setReview("");
        AbstractEndAspect.occurred(_self, Boolean.valueOf(false));
      }
    }
    EObject _eContainer = _self.eContainer();
    final Consumer<TimeLapse> _function = new Consumer<TimeLapse>() {
      @Override
      public void accept(final TimeLapse tl) {
        if ((tl instanceof Execution)) {
          if ((Objects.equal(((Execution)tl).getCovered(), _self.getCovered()) && Objects.equal(((Execution)tl).getStart(), _self))) {
            TimeLapseAspect.isExecuting(tl, Boolean.valueOf(true));
          }
        }
      }
    };
    ((Scenario) _eContainer).getOwnedTimeLapses().forEach(_function);
    EObject _eContainer_1 = _self.eContainer();
    final Consumer<TimeLapse> _function_1 = new Consumer<TimeLapse>() {
      @Override
      public void accept(final TimeLapse tl) {
        if ((tl instanceof Execution)) {
          if ((Objects.equal(((Execution)tl).getCovered(), _self.getCovered()) && Objects.equal(((Execution)tl).getFinish(), _self))) {
            TimeLapseAspect.isExecuting(tl, Boolean.valueOf(false));
          }
        }
      }
    };
    ((Scenario) _eContainer_1).getOwnedTimeLapses().forEach(_function_1);
    String _name = _self.getName();
    String _plus_2 = (_name + " is occurring");
    InputOutput.<String>println(_plus_2);
    return _self.getName();
  }
  
  protected static Integer _privk3_occurrenceNumber(final AbstractEndAspectAbstractEndAspectProperties _self_, final AbstractEnd _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getOccurrenceNumber") &&
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
    return _self_.occurrenceNumber;
  }
  
  protected static void _privk3_occurrenceNumber(final AbstractEndAspectAbstractEndAspectProperties _self_, final AbstractEnd _self, final Integer occurrenceNumber) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setOccurrenceNumber")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, occurrenceNumber);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.occurrenceNumber = occurrenceNumber;
    }
  }
  
  protected static Boolean _privk3_occurred(final AbstractEndAspectAbstractEndAspectProperties _self_, final AbstractEnd _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isOccurred") &&
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
    return _self_.occurred;
  }
  
  protected static void _privk3_occurred(final AbstractEndAspectAbstractEndAspectProperties _self_, final AbstractEnd _self, final Boolean occurred) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setOccurred")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, occurred);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.occurred = occurred;
    }
  }
}
