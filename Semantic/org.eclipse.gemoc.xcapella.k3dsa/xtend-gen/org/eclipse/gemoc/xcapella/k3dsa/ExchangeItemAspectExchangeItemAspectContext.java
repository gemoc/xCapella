package org.eclipse.gemoc.xcapella.k3dsa;

import java.util.Map;
import org.eclipse.gemoc.xcapella.k3dsa.ExchangeItemAspectExchangeItemAspectProperties;
import org.polarsys.capella.core.data.information.ExchangeItem;

@SuppressWarnings("all")
public class ExchangeItemAspectExchangeItemAspectContext {
  public final static ExchangeItemAspectExchangeItemAspectContext INSTANCE = new ExchangeItemAspectExchangeItemAspectContext();
  
  public static ExchangeItemAspectExchangeItemAspectProperties getSelf(final ExchangeItem _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.eclipse.gemoc.xcapella.k3dsa.ExchangeItemAspectExchangeItemAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ExchangeItem, ExchangeItemAspectExchangeItemAspectProperties> map = new java.util.WeakHashMap<org.polarsys.capella.core.data.information.ExchangeItem, org.eclipse.gemoc.xcapella.k3dsa.ExchangeItemAspectExchangeItemAspectProperties>();
  
  public Map<ExchangeItem, ExchangeItemAspectExchangeItemAspectProperties> getMap() {
    return map;
  }
}
