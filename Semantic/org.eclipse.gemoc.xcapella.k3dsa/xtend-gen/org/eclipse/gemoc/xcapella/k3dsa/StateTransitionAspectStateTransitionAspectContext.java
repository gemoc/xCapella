package org.eclipse.gemoc.xcapella.k3dsa;

import java.util.Map;
import org.eclipse.gemoc.xcapella.k3dsa.StateTransitionAspectStateTransitionAspectProperties;
import org.polarsys.capella.core.data.capellacommon.StateTransition;

@SuppressWarnings("all")
public class StateTransitionAspectStateTransitionAspectContext {
  public final static StateTransitionAspectStateTransitionAspectContext INSTANCE = new StateTransitionAspectStateTransitionAspectContext();
  
  public static StateTransitionAspectStateTransitionAspectProperties getSelf(final StateTransition _self) {
    		if (!INSTANCE.map.containsKey(_self.getId()))
    			INSTANCE.map.put(_self.getId(), new org.eclipse.gemoc.xcapella.k3dsa.StateTransitionAspectStateTransitionAspectProperties());
    		return INSTANCE.map.get(_self.getId());
  }
  
  private Map<String, StateTransitionAspectStateTransitionAspectProperties> map = new java.util.WeakHashMap<String, org.eclipse.gemoc.xcapella.k3dsa.StateTransitionAspectStateTransitionAspectProperties>();
  
  public Map<String, StateTransitionAspectStateTransitionAspectProperties> getMap() {
    return map;
  }
}
