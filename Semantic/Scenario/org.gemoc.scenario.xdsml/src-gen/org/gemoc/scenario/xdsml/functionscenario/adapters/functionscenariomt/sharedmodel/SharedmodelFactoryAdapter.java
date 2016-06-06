package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.sharedmodel;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.sharedmodel.SharedmodelFactory;

@SuppressWarnings("all")
public class SharedmodelFactoryAdapter extends EFactoryImpl implements org.gemoc.scenario.xdsml.functionscenariomt.sharedmodel.SharedmodelFactory {
  private FunctionScenarioMTAdaptersFactory adaptersFactory = org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory.getInstance();
  
  private SharedmodelFactory sharedmodelAdaptee = org.polarsys.capella.core.data.sharedmodel.SharedmodelFactory.eINSTANCE;
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.sharedmodel.SharedPkg createSharedPkg() {
    return adaptersFactory.createSharedPkgAdapter(sharedmodelAdaptee.createSharedPkg(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.sharedmodel.GenericPkg createGenericPkg() {
    return adaptersFactory.createGenericPkgAdapter(sharedmodelAdaptee.createGenericPkg(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getSharedmodelPackage();
  }
  
  public org.gemoc.scenario.xdsml.functionscenariomt.sharedmodel.SharedmodelPackage getSharedmodelPackage() {
    return org.gemoc.scenario.xdsml.functionscenariomt.sharedmodel.SharedmodelPackage.eINSTANCE;
  }
}
