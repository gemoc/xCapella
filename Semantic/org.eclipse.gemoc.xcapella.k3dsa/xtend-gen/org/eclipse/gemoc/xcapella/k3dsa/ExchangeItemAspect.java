package org.eclipse.gemoc.xcapella.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.gemoc.xcapella.k3dsa.ExchangeItemAspectExchangeItemAspectProperties;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.polarsys.capella.core.data.information.ExchangeItem;

@Aspect(className = ExchangeItem.class)
@SuppressWarnings("all")
public class ExchangeItemAspect {
  public static String getLabel(final ExchangeItem _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.ExchangeItemAspectExchangeItemAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.ExchangeItemAspectExchangeItemAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getLabel()
    if (_self instanceof org.polarsys.capella.core.data.information.ExchangeItem){
    	result = org.eclipse.gemoc.xcapella.k3dsa.ExchangeItemAspect._privk3_getLabel(_self_, (org.polarsys.capella.core.data.information.ExchangeItem)_self);
    };
    return (java.lang.String)result;
  }
  
  protected static String _privk3_getLabel(final ExchangeItemAspectExchangeItemAspectProperties _self_, final ExchangeItem _self) {
    String _name = _self.getName();
    String _plus = ("----> Event " + _name);
    String _plus_1 = (_plus + " occurred");
    InputOutput.<String>println(_plus_1);
    return _self.getName();
  }
}
