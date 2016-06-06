package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.emde;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.kitalpha.emde.model.Element;

@SuppressWarnings("all")
public class ElementAdapter extends EObjectAdapter<Element> implements org.gemoc.scenario.xdsml.functionscenariomt.emde.Element {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public ElementAdapter() {
    super(org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.scenario.xdsml.functionscenariomt.emde.EmdePackage.eINSTANCE.getElement();
  }
}
