package org.eclipse.gemoc.xcapella.k3dsa;

import java.util.Map;
import org.eclipse.gemoc.xcapella.k3dsa.TimeLapseAspectTimeLapseAspectProperties;
import org.polarsys.capella.core.data.interaction.TimeLapse;

@SuppressWarnings("all")
public class TimeLapseAspectTimeLapseAspectContext {
  public final static TimeLapseAspectTimeLapseAspectContext INSTANCE = new TimeLapseAspectTimeLapseAspectContext();
  
  public static TimeLapseAspectTimeLapseAspectProperties getSelf(final TimeLapse _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.eclipse.gemoc.xcapella.k3dsa.TimeLapseAspectTimeLapseAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<TimeLapse, TimeLapseAspectTimeLapseAspectProperties> map = new java.util.WeakHashMap<org.polarsys.capella.core.data.interaction.TimeLapse, org.eclipse.gemoc.xcapella.k3dsa.TimeLapseAspectTimeLapseAspectProperties>();
  
  public Map<TimeLapse, TimeLapseAspectTimeLapseAspectProperties> getMap() {
    return map;
  }
}
