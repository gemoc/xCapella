package org.eclipse.gemoc.xcapella.k3dsa;

import java.util.Map;
import org.eclipse.gemoc.xcapella.k3dsa.ExchangeItemAspectExchangeItemAspectProperties;
import org.polarsys.capella.core.data.information.ExchangeItem;

@SuppressWarnings("all")
public class ExchangeItemAspectExchangeItemAspectContext {
  public final static ExchangeItemAspectExchangeItemAspectContext INSTANCE = new ExchangeItemAspectExchangeItemAspectContext();
  
  public static ExchangeItemAspectExchangeItemAspectProperties getSelf(final ExchangeItem _self) {
    		if (!INSTANCE.map.containsKey(_self.getId()))
    			INSTANCE.map.put(_self.getId(), new org.eclipse.gemoc.xcapella.k3dsa.ExchangeItemAspectExchangeItemAspectProperties());
    		return INSTANCE.map.get(_self.getId());
  }
  
  private Map<String, ExchangeItemAspectExchangeItemAspectProperties> map = new java.util.WeakHashMap<String, org.eclipse.gemoc.xcapella.k3dsa.ExchangeItemAspectExchangeItemAspectProperties>();
  
  public Map<String, ExchangeItemAspectExchangeItemAspectProperties> getMap() {
    return map;
  }
}
