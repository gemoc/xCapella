package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.common.data.activity.ActivityFactory;

@SuppressWarnings("all")
public class ActivityFactoryAdapter extends EFactoryImpl implements org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityFactory {
  private FunctionScenarioMTAdaptersFactory adaptersFactory = org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory.getInstance();
  
  private ActivityFactory activityAdaptee = org.polarsys.capella.common.data.activity.ActivityFactory.eINSTANCE;
  
  @Override
  public EPackage getEPackage() {
    return getActivityPackage();
  }
  
  public org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage getActivityPackage() {
    return org.gemoc.scenario.xdsml.functionscenariomt.activity.ActivityPackage.eINSTANCE;
  }
}
