package org.gemoc.xcapella.dataflow.k3dsa;

import java.util.Map;
import org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectProperties;
import org.polarsys.capella.core.data.fa.AbstractFunction;

@SuppressWarnings("all")
public class FunctionAspectAbstractFunctionAspectContext {
  public final static FunctionAspectAbstractFunctionAspectContext INSTANCE = new FunctionAspectAbstractFunctionAspectContext();
  
  public static FunctionAspectAbstractFunctionAspectProperties getSelf(final AbstractFunction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<AbstractFunction, FunctionAspectAbstractFunctionAspectProperties> map = new java.util.WeakHashMap<org.polarsys.capella.core.data.fa.AbstractFunction, org.gemoc.xcapella.dataflow.k3dsa.FunctionAspectAbstractFunctionAspectProperties>();
  
  public Map<AbstractFunction, FunctionAspectAbstractFunctionAspectProperties> getMap() {
    return map;
  }
}
