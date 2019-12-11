package org.eclipse.gemoc.xcapella.k3dsa;

import java.util.Map;
import org.eclipse.gemoc.xcapella.k3dsa.CapellaElementAspectCapellaElementAspectProperties;
import org.polarsys.capella.core.data.capellacore.CapellaElement;

@SuppressWarnings("all")
public class CapellaElementAspectCapellaElementAspectContext {
  public final static CapellaElementAspectCapellaElementAspectContext INSTANCE = new CapellaElementAspectCapellaElementAspectContext();
  
  public static CapellaElementAspectCapellaElementAspectProperties getSelf(final CapellaElement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.eclipse.gemoc.xcapella.k3dsa.CapellaElementAspectCapellaElementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<CapellaElement, CapellaElementAspectCapellaElementAspectProperties> map = new java.util.WeakHashMap<org.polarsys.capella.core.data.capellacore.CapellaElement, org.eclipse.gemoc.xcapella.k3dsa.CapellaElementAspectCapellaElementAspectProperties>();
  
  public Map<CapellaElement, CapellaElementAspectCapellaElementAspectProperties> getMap() {
    return map;
  }
}
