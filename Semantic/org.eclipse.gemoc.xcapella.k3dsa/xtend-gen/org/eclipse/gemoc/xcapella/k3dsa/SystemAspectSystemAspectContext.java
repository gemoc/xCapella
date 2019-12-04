package org.eclipse.gemoc.xcapella.k3dsa;

import java.util.Map;
import org.eclipse.gemoc.xcapella.k3dsa.SystemAspectSystemAspectProperties;

@SuppressWarnings("all")
public class SystemAspectSystemAspectContext {
  public final static SystemAspectSystemAspectContext INSTANCE = new SystemAspectSystemAspectContext();
  
  public static SystemAspectSystemAspectProperties getSelf(final org.polarsys.capella.core.data.ctx.System _self) {
    		if (!INSTANCE.map.containsKey(_self.getId()))
    			INSTANCE.map.put(_self.getId(), new org.eclipse.gemoc.xcapella.k3dsa.SystemAspectSystemAspectProperties());
    		return INSTANCE.map.get(_self.getId());
  }
  
  private Map<String, SystemAspectSystemAspectProperties> map = new java.util.WeakHashMap<String, org.eclipse.gemoc.xcapella.k3dsa.SystemAspectSystemAspectProperties>();
  
  public Map<String, SystemAspectSystemAspectProperties> getMap() {
    return map;
  }
}
