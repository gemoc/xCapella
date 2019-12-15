package org.eclipse.gemoc.xcapella.k3dsa;

import java.util.Map;
import org.eclipse.gemoc.xcapella.k3dsa.PhysicalComponentAspectPhysicalComponentAspectProperties;
import org.polarsys.capella.core.data.pa.PhysicalComponent;

@SuppressWarnings("all")
public class PhysicalComponentAspectPhysicalComponentAspectContext {
  public final static PhysicalComponentAspectPhysicalComponentAspectContext INSTANCE = new PhysicalComponentAspectPhysicalComponentAspectContext();
  
  public static PhysicalComponentAspectPhysicalComponentAspectProperties getSelf(final PhysicalComponent _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.eclipse.gemoc.xcapella.k3dsa.PhysicalComponentAspectPhysicalComponentAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<PhysicalComponent, PhysicalComponentAspectPhysicalComponentAspectProperties> map = new java.util.WeakHashMap<org.polarsys.capella.core.data.pa.PhysicalComponent, org.eclipse.gemoc.xcapella.k3dsa.PhysicalComponentAspectPhysicalComponentAspectProperties>();
  
  public Map<PhysicalComponent, PhysicalComponentAspectPhysicalComponentAspectProperties> getMap() {
    return map;
  }
}
