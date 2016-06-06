package org.gemoc.scenario.xdsml;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface ScenarioMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract org.gemoc.scenario.xdsml.scenariomt.interactions.InteractionsFactory getFactory();
  
  public abstract void save(final String uri) throws IOException;
}
