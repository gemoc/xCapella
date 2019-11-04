package org.eclipse.gemoc.xcapella.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.gemoc.xcapella.k3dsa.AbstractFunctionAspectAbstractFunctionAspectProperties;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.polarsys.capella.core.data.fa.AbstractFunction;

/**
 * Simple Ecore extension allowing to annotate all classes of an ecore model by adding
 * an annotation containing the list of all super classes (flat)
 */
@Aspect(className = AbstractFunction.class)
@SuppressWarnings("all")
public class AbstractFunctionAspect {
  public static void getLabel(final AbstractFunction _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.AbstractFunctionAspectAbstractFunctionAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.AbstractFunctionAspectAbstractFunctionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void getLabel()
    if (_self instanceof org.polarsys.capella.core.data.fa.AbstractFunction){
    	org.eclipse.gemoc.xcapella.k3dsa.AbstractFunctionAspect._privk3_getLabel(_self_, (org.polarsys.capella.core.data.fa.AbstractFunction)_self);
    };
  }
  
  protected static void _privk3_getLabel(final AbstractFunctionAspectAbstractFunctionAspectProperties _self_, final AbstractFunction _self) {
    String _name = _self.getName();
    String _plus = ("getLabel() of " + _name);
    InputOutput.<String>println(_plus);
  }
}
