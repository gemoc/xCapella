package org.eclipse.gemoc.xcapella.k3dsa;

import java.util.Map;
import org.eclipse.gemoc.xcapella.k3dsa.PhysicalArchitectureAspectPhysicalArchitectureAspectProperties;
import org.polarsys.capella.core.data.pa.PhysicalArchitecture;

@SuppressWarnings("all")
public class PhysicalArchitectureAspectPhysicalArchitectureAspectContext {
  public final static PhysicalArchitectureAspectPhysicalArchitectureAspectContext INSTANCE = new PhysicalArchitectureAspectPhysicalArchitectureAspectContext();
  
  public static PhysicalArchitectureAspectPhysicalArchitectureAspectProperties getSelf(final PhysicalArchitecture _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.eclipse.gemoc.xcapella.k3dsa.PhysicalArchitectureAspectPhysicalArchitectureAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<PhysicalArchitecture, PhysicalArchitectureAspectPhysicalArchitectureAspectProperties> map = new java.util.WeakHashMap<org.polarsys.capella.core.data.pa.PhysicalArchitecture, org.eclipse.gemoc.xcapella.k3dsa.PhysicalArchitectureAspectPhysicalArchitectureAspectProperties>();
  
  public Map<PhysicalArchitecture, PhysicalArchitectureAspectPhysicalArchitectureAspectProperties> getMap() {
    return map;
  }
}
