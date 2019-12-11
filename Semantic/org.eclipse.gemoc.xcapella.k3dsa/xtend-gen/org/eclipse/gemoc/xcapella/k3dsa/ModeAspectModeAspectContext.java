package org.eclipse.gemoc.xcapella.k3dsa;

import java.util.Map;
import org.eclipse.gemoc.xcapella.k3dsa.ModeAspectModeAspectProperties;
import org.polarsys.capella.core.data.capellacommon.Mode;

@SuppressWarnings("all")
public class ModeAspectModeAspectContext {
  public final static ModeAspectModeAspectContext INSTANCE = new ModeAspectModeAspectContext();
  
  public static ModeAspectModeAspectProperties getSelf(final Mode _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.eclipse.gemoc.xcapella.k3dsa.ModeAspectModeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Mode, ModeAspectModeAspectProperties> map = new java.util.WeakHashMap<org.polarsys.capella.core.data.capellacommon.Mode, org.eclipse.gemoc.xcapella.k3dsa.ModeAspectModeAspectProperties>();
  
  public Map<Mode, ModeAspectModeAspectProperties> getMap() {
    return map;
  }
}
