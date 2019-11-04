package org.eclipse.gemoc.xcapella.k3dsa;

import java.util.Map;
import org.eclipse.gemoc.xcapella.k3dsa.AbstractFunctionAspectAbstractFunctionAspectProperties;
import org.polarsys.capella.core.data.fa.AbstractFunction;

@SuppressWarnings("all")
public class AbstractFunctionAspectAbstractFunctionAspectContext {
  public final static AbstractFunctionAspectAbstractFunctionAspectContext INSTANCE = new AbstractFunctionAspectAbstractFunctionAspectContext();
  
  public static AbstractFunctionAspectAbstractFunctionAspectProperties getSelf(final AbstractFunction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.eclipse.gemoc.xcapella.k3dsa.AbstractFunctionAspectAbstractFunctionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<AbstractFunction, AbstractFunctionAspectAbstractFunctionAspectProperties> map = new java.util.WeakHashMap<org.polarsys.capella.core.data.fa.AbstractFunction, org.eclipse.gemoc.xcapella.k3dsa.AbstractFunctionAspectAbstractFunctionAspectProperties>();
  
  public Map<AbstractFunction, AbstractFunctionAspectAbstractFunctionAspectProperties> getMap() {
    return map;
  }
}
