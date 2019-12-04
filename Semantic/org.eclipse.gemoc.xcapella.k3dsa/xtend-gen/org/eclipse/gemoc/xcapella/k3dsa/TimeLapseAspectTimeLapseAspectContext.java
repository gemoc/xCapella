package org.eclipse.gemoc.xcapella.k3dsa;

import java.util.Map;
import org.eclipse.gemoc.xcapella.k3dsa.TimeLapseAspectTimeLapseAspectProperties;
import org.polarsys.capella.core.data.interaction.TimeLapse;

@SuppressWarnings("all")
public class TimeLapseAspectTimeLapseAspectContext {
  public final static TimeLapseAspectTimeLapseAspectContext INSTANCE = new TimeLapseAspectTimeLapseAspectContext();
  
  public static TimeLapseAspectTimeLapseAspectProperties getSelf(final TimeLapse _self) {
    		if (!INSTANCE.map.containsKey(_self.getId()))
    			INSTANCE.map.put(_self.getId(), new org.eclipse.gemoc.xcapella.k3dsa.TimeLapseAspectTimeLapseAspectProperties());
    		return INSTANCE.map.get(_self.getId());
  }
  
  private Map<String, TimeLapseAspectTimeLapseAspectProperties> map = new java.util.WeakHashMap<String, org.eclipse.gemoc.xcapella.k3dsa.TimeLapseAspectTimeLapseAspectProperties>();
  
  public Map<String, TimeLapseAspectTimeLapseAspectProperties> getMap() {
    return map;
  }
}
