package org.eclipse.gemoc.xcapella.k3dsa;

import java.util.Map;
import org.eclipse.gemoc.xcapella.k3dsa.ModeAspectModeAspectProperties;
import org.polarsys.capella.core.data.capellacommon.Mode;

@SuppressWarnings("all")
public class ModeAspectModeAspectContext {
  public final static ModeAspectModeAspectContext INSTANCE = new ModeAspectModeAspectContext();
  
  public static ModeAspectModeAspectProperties getSelf(final Mode _self) {
    		if (!INSTANCE.map.containsKey(_self.getId()))
    			INSTANCE.map.put(_self.getId(), new org.eclipse.gemoc.xcapella.k3dsa.ModeAspectModeAspectProperties());
    		return INSTANCE.map.get(_self.getId());
  }
  
  private Map<String, ModeAspectModeAspectProperties> map = new java.util.WeakHashMap<String, org.eclipse.gemoc.xcapella.k3dsa.ModeAspectModeAspectProperties>();
  
  public Map<String, ModeAspectModeAspectProperties> getMap() {
    return map;
  }
}
