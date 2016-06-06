package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.information.InformationFactory;

@SuppressWarnings("all")
public class InformationFactoryAdapter extends EFactoryImpl implements org.gemoc.scenario.xdsml.functionscenariomt.information.InformationFactory {
  private FunctionScenarioMTAdaptersFactory adaptersFactory = org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory.getInstance();
  
  private InformationFactory informationAdaptee = org.polarsys.capella.core.data.information.InformationFactory.eINSTANCE;
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.Association createAssociation() {
    return adaptersFactory.createAssociationAdapter(informationAdaptee.createAssociation(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.Class createClass() {
    return adaptersFactory.createClassAdapter(informationAdaptee.createClass(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.Collection createCollection() {
    return adaptersFactory.createCollectionAdapter(informationAdaptee.createCollection(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.CollectionValue createCollectionValue() {
    return adaptersFactory.createCollectionValueAdapter(informationAdaptee.createCollectionValue(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.CollectionValueReference createCollectionValueReference() {
    return adaptersFactory.createCollectionValueReferenceAdapter(informationAdaptee.createCollectionValueReference(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.DataPkg createDataPkg() {
    return adaptersFactory.createDataPkgAdapter(informationAdaptee.createDataPkg(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.DomainElement createDomainElement() {
    return adaptersFactory.createDomainElementAdapter(informationAdaptee.createDomainElement(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.KeyPart createKeyPart() {
    return adaptersFactory.createKeyPartAdapter(informationAdaptee.createKeyPart(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.OperationAllocation createOperationAllocation() {
    return adaptersFactory.createOperationAllocationAdapter(informationAdaptee.createOperationAllocation(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.Parameter createParameter() {
    return adaptersFactory.createParameterAdapter(informationAdaptee.createParameter(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.Property createProperty() {
    return adaptersFactory.createPropertyAdapter(informationAdaptee.createProperty(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.Service createService() {
    return adaptersFactory.createServiceAdapter(informationAdaptee.createService(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.Union createUnion() {
    return adaptersFactory.createUnionAdapter(informationAdaptee.createUnion(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.UnionProperty createUnionProperty() {
    return adaptersFactory.createUnionPropertyAdapter(informationAdaptee.createUnionProperty(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.Unit createUnit() {
    return adaptersFactory.createUnitAdapter(informationAdaptee.createUnit(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.PortRealization createPortRealization() {
    return adaptersFactory.createPortRealizationAdapter(informationAdaptee.createPortRealization(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.PortAllocation createPortAllocation() {
    return adaptersFactory.createPortAllocationAdapter(informationAdaptee.createPortAllocation(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.ExchangeItem createExchangeItem() {
    return adaptersFactory.createExchangeItemAdapter(informationAdaptee.createExchangeItem(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.ExchangeItemElement createExchangeItemElement() {
    return adaptersFactory.createExchangeItemElementAdapter(informationAdaptee.createExchangeItemElement(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.ExchangeItemInstance createExchangeItemInstance() {
    return adaptersFactory.createExchangeItemInstanceAdapter(informationAdaptee.createExchangeItemInstance(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.InformationRealization createInformationRealization() {
    return adaptersFactory.createInformationRealizationAdapter(informationAdaptee.createInformationRealization(), null);
  }
  
  @Override
  public org.gemoc.scenario.xdsml.functionscenariomt.information.ExchangeItemRealization createExchangeItemRealization() {
    return adaptersFactory.createExchangeItemRealizationAdapter(informationAdaptee.createExchangeItemRealization(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getInformationPackage();
  }
  
  public org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage getInformationPackage() {
    return org.gemoc.scenario.xdsml.functionscenariomt.information.InformationPackage.eINSTANCE;
  }
}
