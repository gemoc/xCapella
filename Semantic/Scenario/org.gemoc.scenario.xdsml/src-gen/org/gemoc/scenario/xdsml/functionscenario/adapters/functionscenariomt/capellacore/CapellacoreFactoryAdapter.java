package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.capellacore.CapellacoreFactory;

@SuppressWarnings("all")
public class CapellacoreFactoryAdapter extends EFactoryImpl implements org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacoreFactory {
  private FunctionScenarioMTAdaptersFactory adaptersFactory = org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory.getInstance();
  
  private CapellacoreFactory capellacoreAdaptee = org.polarsys.capella.core.data.capellacore.CapellacoreFactory.eINSTANCE;
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacore.NamingRule createNamingRule() {
    return adaptersFactory.createNamingRuleAdapter(capellacoreAdaptee.createNamingRule(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Constraint createConstraint() {
    return adaptersFactory.createConstraintAdapter(capellacoreAdaptee.createConstraint(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacore.KeyValue createKeyValue() {
    return adaptersFactory.createKeyValueAdapter(capellacoreAdaptee.createKeyValue(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacore.ReuseLink createReuseLink() {
    return adaptersFactory.createReuseLinkAdapter(capellacoreAdaptee.createReuseLink(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacore.Generalization createGeneralization() {
    return adaptersFactory.createGeneralizationAdapter(capellacoreAdaptee.createGeneralization(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacore.StringPropertyValue createStringPropertyValue() {
    return adaptersFactory.createStringPropertyValueAdapter(capellacoreAdaptee.createStringPropertyValue(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacore.IntegerPropertyValue createIntegerPropertyValue() {
    return adaptersFactory.createIntegerPropertyValueAdapter(capellacoreAdaptee.createIntegerPropertyValue(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacore.BooleanPropertyValue createBooleanPropertyValue() {
    return adaptersFactory.createBooleanPropertyValueAdapter(capellacoreAdaptee.createBooleanPropertyValue(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacore.FloatPropertyValue createFloatPropertyValue() {
    return adaptersFactory.createFloatPropertyValueAdapter(capellacoreAdaptee.createFloatPropertyValue(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyValue createEnumerationPropertyValue() {
    return adaptersFactory.createEnumerationPropertyValueAdapter(capellacoreAdaptee.createEnumerationPropertyValue(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyType createEnumerationPropertyType() {
    return adaptersFactory.createEnumerationPropertyTypeAdapter(capellacoreAdaptee.createEnumerationPropertyType(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacore.EnumerationPropertyLiteral createEnumerationPropertyLiteral() {
    return adaptersFactory.createEnumerationPropertyLiteralAdapter(capellacoreAdaptee.createEnumerationPropertyLiteral(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacore.PropertyValueGroup createPropertyValueGroup() {
    return adaptersFactory.createPropertyValueGroupAdapter(capellacoreAdaptee.createPropertyValueGroup(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacore.PropertyValuePkg createPropertyValuePkg() {
    return adaptersFactory.createPropertyValuePkgAdapter(capellacoreAdaptee.createPropertyValuePkg(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getCapellacorePackage();
  }
  
  public org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage getCapellacorePackage() {
    return org.gemoc.scenario.xdsml.functionscenariomt.capellacore.CapellacorePackage.eINSTANCE;
  }
}
