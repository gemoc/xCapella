package org.gemoc.scenario.k3dsa;

import java.util.Map;
import org.gemoc.scenario.k3dsa.AbstractEndAspectAbstractEndAspectProperties;
import org.polarsys.capella.core.data.interaction.AbstractEnd;

@SuppressWarnings("all")
public class AbstractEndAspectAbstractEndAspectContext {
  public final static AbstractEndAspectAbstractEndAspectContext INSTANCE = new AbstractEndAspectAbstractEndAspectContext();
  
  public static AbstractEndAspectAbstractEndAspectProperties getSelf(final AbstractEnd _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.scenario.k3dsa.AbstractEndAspectAbstractEndAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<AbstractEnd, AbstractEndAspectAbstractEndAspectProperties> map = new java.util.WeakHashMap<org.polarsys.capella.core.data.interaction.AbstractEnd, org.gemoc.scenario.k3dsa.AbstractEndAspectAbstractEndAspectProperties>();
  
  public Map<AbstractEnd, AbstractEndAspectAbstractEndAspectProperties> getMap() {
    return map;
  }
}
