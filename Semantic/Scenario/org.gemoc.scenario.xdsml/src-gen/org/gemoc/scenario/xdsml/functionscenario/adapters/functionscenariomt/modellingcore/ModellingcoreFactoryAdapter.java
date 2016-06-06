package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.common.data.modellingcore.ModellingcoreFactory;

@SuppressWarnings("all")
public class ModellingcoreFactoryAdapter extends EFactoryImpl implements org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcoreFactory {
  private FunctionScenarioMTAdaptersFactory adaptersFactory = org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory.getInstance();
  
  private ModellingcoreFactory modellingcoreAdaptee = org.polarsys.capella.common.data.modellingcore.ModellingcoreFactory.eINSTANCE;
  
  @Override
  public EPackage getEPackage() {
    return getModellingcorePackage();
  }
  
  public org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage getModellingcorePackage() {
    return org.gemoc.scenario.xdsml.functionscenariomt.modellingcore.ModellingcorePackage.eINSTANCE;
  }
}
