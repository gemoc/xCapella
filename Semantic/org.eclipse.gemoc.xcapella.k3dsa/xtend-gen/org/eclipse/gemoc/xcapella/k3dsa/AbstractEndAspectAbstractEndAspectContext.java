package org.eclipse.gemoc.xcapella.k3dsa;

import java.util.Map;
import org.eclipse.gemoc.xcapella.k3dsa.AbstractEndAspectAbstractEndAspectProperties;
import org.polarsys.capella.core.data.interaction.AbstractEnd;

@SuppressWarnings("all")
public class AbstractEndAspectAbstractEndAspectContext {
  public final static AbstractEndAspectAbstractEndAspectContext INSTANCE = new AbstractEndAspectAbstractEndAspectContext();
  
  public static AbstractEndAspectAbstractEndAspectProperties getSelf(final AbstractEnd _self) {
    		if (!INSTANCE.map.containsKey(_self.getId()))
    			INSTANCE.map.put(_self.getId(), new org.eclipse.gemoc.xcapella.k3dsa.AbstractEndAspectAbstractEndAspectProperties());
    		return INSTANCE.map.get(_self.getId());
  }
  
  private Map<String, AbstractEndAspectAbstractEndAspectProperties> map = new java.util.WeakHashMap<String, org.eclipse.gemoc.xcapella.k3dsa.AbstractEndAspectAbstractEndAspectProperties>();
  
  public Map<String, AbstractEndAspectAbstractEndAspectProperties> getMap() {
    return map;
  }
}
