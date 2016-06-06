package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datatype;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.information.datatype.DatatypeFactory;

@SuppressWarnings("all")
public class DatatypeFactoryAdapter extends EFactoryImpl implements org.gemoc.scenario.xdsml.functionscenariomt.information.datatype.DatatypeFactory {
  private FunctionScenarioMTAdaptersFactory adaptersFactory = org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory.getInstance();
  
  private DatatypeFactory datatypeAdaptee = org.polarsys.capella.core.data.information.datatype.DatatypeFactory.eINSTANCE;
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datatype.BooleanType createBooleanType() {
    return adaptersFactory.createBooleanTypeAdapter(datatypeAdaptee.createBooleanType(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datatype.Enumeration createEnumeration() {
    return adaptersFactory.createEnumerationAdapter(datatypeAdaptee.createEnumeration(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datatype.StringType createStringType() {
    return adaptersFactory.createStringTypeAdapter(datatypeAdaptee.createStringType(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datatype.NumericType createNumericType() {
    return adaptersFactory.createNumericTypeAdapter(datatypeAdaptee.createNumericType(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datatype.PhysicalQuantity createPhysicalQuantity() {
    return adaptersFactory.createPhysicalQuantityAdapter(datatypeAdaptee.createPhysicalQuantity(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getDatatypePackage();
  }
  
  public org.gemoc.scenario.xdsml.functionscenariomt.information.datatype.DatatypePackage getDatatypePackage() {
    return org.gemoc.scenario.xdsml.functionscenariomt.information.datatype.DatatypePackage.eINSTANCE;
  }
}
