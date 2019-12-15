package org.eclipse.gemoc.xcapella.k3dsa;

import java.util.Map;
import org.eclipse.gemoc.xcapella.k3dsa.ComponentExchangeAspectComponentExchangeAspectProperties;
import org.polarsys.capella.core.data.fa.ComponentExchange;

@SuppressWarnings("all")
public class ComponentExchangeAspectComponentExchangeAspectContext {
  public final static ComponentExchangeAspectComponentExchangeAspectContext INSTANCE = new ComponentExchangeAspectComponentExchangeAspectContext();
  
  public static ComponentExchangeAspectComponentExchangeAspectProperties getSelf(final ComponentExchange _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.eclipse.gemoc.xcapella.k3dsa.ComponentExchangeAspectComponentExchangeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ComponentExchange, ComponentExchangeAspectComponentExchangeAspectProperties> map = new java.util.WeakHashMap<org.polarsys.capella.core.data.fa.ComponentExchange, org.eclipse.gemoc.xcapella.k3dsa.ComponentExchangeAspectComponentExchangeAspectProperties>();
  
  public Map<ComponentExchange, ComponentExchangeAspectComponentExchangeAspectProperties> getMap() {
    return map;
  }
}
