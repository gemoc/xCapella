package org.gemoc.scenario.k3dsa;

import java.util.Map;
import org.gemoc.scenario.k3dsa.ExecutionAspectExecutionAspectProperties;
import org.polarsys.capella.core.data.interaction.Execution;

@SuppressWarnings("all")
public class ExecutionAspectExecutionAspectContext {
  public final static ExecutionAspectExecutionAspectContext INSTANCE = new ExecutionAspectExecutionAspectContext();
  
  public static ExecutionAspectExecutionAspectProperties getSelf(final Execution _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.scenario.k3dsa.ExecutionAspectExecutionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Execution, ExecutionAspectExecutionAspectProperties> map = new java.util.WeakHashMap<org.polarsys.capella.core.data.interaction.Execution, org.gemoc.scenario.k3dsa.ExecutionAspectExecutionAspectProperties>();
  
  public Map<Execution, ExecutionAspectExecutionAspectProperties> getMap() {
    return map;
  }
}
