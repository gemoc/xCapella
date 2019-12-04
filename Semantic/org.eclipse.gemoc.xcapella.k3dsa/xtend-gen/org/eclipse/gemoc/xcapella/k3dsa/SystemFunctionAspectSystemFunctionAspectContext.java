package org.eclipse.gemoc.xcapella.k3dsa;

import java.util.Map;
import org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties;
import org.polarsys.capella.core.data.ctx.SystemFunction;

@SuppressWarnings("all")
public class SystemFunctionAspectSystemFunctionAspectContext {
  public final static SystemFunctionAspectSystemFunctionAspectContext INSTANCE = new SystemFunctionAspectSystemFunctionAspectContext();
  
  public static SystemFunctionAspectSystemFunctionAspectProperties getSelf(final SystemFunction _self) {
    		if (!INSTANCE.map.containsKey(_self.getId()))
    			INSTANCE.map.put(_self.getId(), new org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties());
    		return INSTANCE.map.get(_self.getId());
  }
  
  private Map<String, SystemFunctionAspectSystemFunctionAspectProperties> map = new java.util.WeakHashMap<String, org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspectSystemFunctionAspectProperties>();
  
  public Map<String, SystemFunctionAspectSystemFunctionAspectProperties> getMap() {
    return map;
  }
}
