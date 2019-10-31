package org.gemoc.xcapella.dataflow.k3dsa;

import java.util.Map;
import org.gemoc.xcapella.dataflow.k3dsa.FunctionalChainAspectFunctionalChainAspectProperties;
import org.polarsys.capella.core.data.fa.FunctionalChain;

@SuppressWarnings("all")
public class FunctionalChainAspectFunctionalChainAspectContext {
  public final static FunctionalChainAspectFunctionalChainAspectContext INSTANCE = new FunctionalChainAspectFunctionalChainAspectContext();
  
  public static FunctionalChainAspectFunctionalChainAspectProperties getSelf(final FunctionalChain _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.xcapella.dataflow.k3dsa.FunctionalChainAspectFunctionalChainAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<FunctionalChain, FunctionalChainAspectFunctionalChainAspectProperties> map = new java.util.WeakHashMap<org.polarsys.capella.core.data.fa.FunctionalChain, org.gemoc.xcapella.dataflow.k3dsa.FunctionalChainAspectFunctionalChainAspectProperties>();
  
  public Map<FunctionalChain, FunctionalChainAspectFunctionalChainAspectProperties> getMap() {
    return map;
  }
}
