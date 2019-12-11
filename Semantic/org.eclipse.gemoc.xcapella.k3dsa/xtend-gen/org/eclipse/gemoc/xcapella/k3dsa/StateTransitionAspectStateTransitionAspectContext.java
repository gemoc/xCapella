package org.eclipse.gemoc.xcapella.k3dsa;

import java.util.Map;
import org.eclipse.gemoc.xcapella.k3dsa.StateTransitionAspectStateTransitionAspectProperties;
import org.polarsys.capella.core.data.capellacommon.StateTransition;

@SuppressWarnings("all")
public class StateTransitionAspectStateTransitionAspectContext {
  public final static StateTransitionAspectStateTransitionAspectContext INSTANCE = new StateTransitionAspectStateTransitionAspectContext();
  
  public static StateTransitionAspectStateTransitionAspectProperties getSelf(final StateTransition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.eclipse.gemoc.xcapella.k3dsa.StateTransitionAspectStateTransitionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StateTransition, StateTransitionAspectStateTransitionAspectProperties> map = new java.util.WeakHashMap<org.polarsys.capella.core.data.capellacommon.StateTransition, org.eclipse.gemoc.xcapella.k3dsa.StateTransitionAspectStateTransitionAspectProperties>();
  
  public Map<StateTransition, StateTransitionAspectStateTransitionAspectProperties> getMap() {
    return map;
  }
}
