package org.eclipse.gemoc.xcapella.k3dsa;

import java.util.Map;
import org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties;
import org.polarsys.capella.core.data.ctx.SystemFunction;

@SuppressWarnings("all")
public class SystemFunctionAspectSystemFunctionAspectContext {
  public final static SystemFunctionAspectSystemFunctionAspectContext INSTANCE = new SystemFunctionAspectSystemFunctionAspectContext();
  
  public static SystemFunctionAspectSystemFunctionAspectProperties getSelf(final SystemFunction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<SystemFunction, SystemFunctionAspectSystemFunctionAspectProperties> map = new java.util.WeakHashMap<org.polarsys.capella.core.data.ctx.SystemFunction, org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties>();
  
  public Map<SystemFunction, SystemFunctionAspectSystemFunctionAspectProperties> getMap() {
    return map;
  }
}
