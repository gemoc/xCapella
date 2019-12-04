package org.eclipse.gemoc.xcapella.k3dsa;

import java.util.Map;
import org.eclipse.gemoc.xcapella.k3dsa.ExecutionAspectExecutionAspectProperties;
import org.polarsys.capella.core.data.interaction.Execution;

@SuppressWarnings("all")
public class ExecutionAspectExecutionAspectContext {
  public final static ExecutionAspectExecutionAspectContext INSTANCE = new ExecutionAspectExecutionAspectContext();
  
  public static ExecutionAspectExecutionAspectProperties getSelf(final Execution _self) {
    		if (!INSTANCE.map.containsKey(_self.getId()))
    			INSTANCE.map.put(_self.getId(), new org.eclipse.gemoc.xcapella.k3dsa.ExecutionAspectExecutionAspectProperties());
    		return INSTANCE.map.get(_self.getId());
  }
  
  private Map<String, ExecutionAspectExecutionAspectProperties> map = new java.util.WeakHashMap<String, org.eclipse.gemoc.xcapella.k3dsa.ExecutionAspectExecutionAspectProperties>();
  
  public Map<String, ExecutionAspectExecutionAspectProperties> getMap() {
    return map;
  }
}
