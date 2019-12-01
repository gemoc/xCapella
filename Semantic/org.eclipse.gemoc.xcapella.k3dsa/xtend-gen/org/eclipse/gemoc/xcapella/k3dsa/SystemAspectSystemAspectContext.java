package org.eclipse.gemoc.xcapella.k3dsa;

import java.util.Map;
import org.eclipse.gemoc.xcapella.k3dsa.SystemAspectSystemAspectProperties;

@SuppressWarnings("all")
public class SystemAspectSystemAspectContext {
  public final static SystemAspectSystemAspectContext INSTANCE = new SystemAspectSystemAspectContext();
  
  public static SystemAspectSystemAspectProperties getSelf(final org.polarsys.capella.core.data.ctx.System _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.eclipse.gemoc.xcapella.k3dsa.SystemAspectSystemAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<org.polarsys.capella.core.data.ctx.System, SystemAspectSystemAspectProperties> map = new java.util.WeakHashMap<org.polarsys.capella.core.data.ctx.System, org.eclipse.gemoc.xcapella.k3dsa.SystemAspectSystemAspectProperties>();
  
  public Map<org.polarsys.capella.core.data.ctx.System, SystemAspectSystemAspectProperties> getMap() {
    return map;
  }
}
