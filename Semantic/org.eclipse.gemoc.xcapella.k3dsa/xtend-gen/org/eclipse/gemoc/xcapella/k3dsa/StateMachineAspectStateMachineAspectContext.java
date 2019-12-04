package org.eclipse.gemoc.xcapella.k3dsa;

import java.util.Map;
import org.eclipse.gemoc.xcapella.k3dsa.StateMachineAspectStateMachineAspectProperties;
import org.polarsys.capella.core.data.capellacommon.StateMachine;

@SuppressWarnings("all")
public class StateMachineAspectStateMachineAspectContext {
  public final static StateMachineAspectStateMachineAspectContext INSTANCE = new StateMachineAspectStateMachineAspectContext();
  
  public static StateMachineAspectStateMachineAspectProperties getSelf(final StateMachine _self) {
    		if (!INSTANCE.map.containsKey(_self.getId()))
    			INSTANCE.map.put(_self.getId(), new org.eclipse.gemoc.xcapella.k3dsa.StateMachineAspectStateMachineAspectProperties());
    		return INSTANCE.map.get(_self.getId());
  }
  
  private Map<String, StateMachineAspectStateMachineAspectProperties> map = new java.util.WeakHashMap<String, org.eclipse.gemoc.xcapella.k3dsa.StateMachineAspectStateMachineAspectProperties>();
  
  public Map<String, StateMachineAspectStateMachineAspectProperties> getMap() {
    return map;
  }
}
