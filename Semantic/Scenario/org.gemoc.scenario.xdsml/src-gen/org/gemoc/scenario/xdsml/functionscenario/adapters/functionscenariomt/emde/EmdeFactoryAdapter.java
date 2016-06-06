package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.emde;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.kitalpha.emde.model.EmdeFactory;

@SuppressWarnings("all")
public class EmdeFactoryAdapter extends EFactoryImpl implements org.gemoc.scenario.xdsml.functionscenariomt.emde.EmdeFactory {
  private FunctionScenarioMTAdaptersFactory adaptersFactory = org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory.getInstance();
  
  private EmdeFactory emdeAdaptee = org.polarsys.kitalpha.emde.model.EmdeFactory.eINSTANCE;
  
  @Override
  public EPackage getEPackage() {
    return getEmdePackage();
  }
  
  public org.gemoc.scenario.xdsml.functionscenariomt.emde.EmdePackage getEmdePackage() {
    return org.gemoc.scenario.xdsml.functionscenariomt.emde.EmdePackage.eINSTANCE;
  }
}
