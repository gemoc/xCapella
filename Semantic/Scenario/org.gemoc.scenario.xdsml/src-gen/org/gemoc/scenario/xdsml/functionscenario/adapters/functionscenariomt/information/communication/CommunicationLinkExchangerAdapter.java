package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory;
import org.polarsys.capella.core.data.information.communication.CommunicationLinkExchanger;

@SuppressWarnings("all")
public class CommunicationLinkExchangerAdapter extends EObjectAdapter<CommunicationLinkExchanger> implements org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLinkExchanger {
  private FunctionScenarioMTAdaptersFactory adaptersFactory;
  
  public CommunicationLinkExchangerAdapter() {
    super(org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory.getInstance();
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object ownedCommunicationLinks_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object getOwnedCommunicationLinks() {
    if (ownedCommunicationLinks_ == null)
    	ownedCommunicationLinks_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedCommunicationLinks(), adaptersFactory, eResource);
    return ownedCommunicationLinks_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object produce_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object getProduce() {
    if (produce_ == null)
    	produce_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getProduce(), adaptersFactory, eResource);
    return produce_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object consume_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object getConsume() {
    if (consume_ == null)
    	consume_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getConsume(), adaptersFactory, eResource);
    return consume_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object send_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object getSend() {
    if (send_ == null)
    	send_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSend(), adaptersFactory, eResource);
    return send_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object receive_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object getReceive() {
    if (receive_ == null)
    	receive_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getReceive(), adaptersFactory, eResource);
    return receive_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object call_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object getCall() {
    if (call_ == null)
    	call_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getCall(), adaptersFactory, eResource);
    return call_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object execute_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object getExecute() {
    if (execute_ == null)
    	execute_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getExecute(), adaptersFactory, eResource);
    return execute_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object write_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object getWrite() {
    if (write_ == null)
    	write_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getWrite(), adaptersFactory, eResource);
    return write_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object access_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object getAccess() {
    if (access_ == null)
    	access_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAccess(), adaptersFactory, eResource);
    return access_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object acquire_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object getAcquire() {
    if (acquire_ == null)
    	acquire_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAcquire(), adaptersFactory, eResource);
    return acquire_;
  }
  
  private /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object transmit_;
  
  @Override
  public /* EList<org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationLink> */Object getTransmit() {
    if (transmit_ == null)
    	transmit_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getTransmit(), adaptersFactory, eResource);
    return transmit_;
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationPackage.eINSTANCE.getCommunicationLinkExchanger();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__OWNED_COMMUNICATION_LINKS:
    		return getOwnedCommunicationLinks();
    	case org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__PRODUCE:
    		return getProduce();
    	case org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__CONSUME:
    		return getConsume();
    	case org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__SEND:
    		return getSend();
    	case org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__RECEIVE:
    		return getReceive();
    	case org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__CALL:
    		return getCall();
    	case org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__EXECUTE:
    		return getExecute();
    	case org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__WRITE:
    		return getWrite();
    	case org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__ACCESS:
    		return getAccess();
    	case org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__ACQUIRE:
    		return getAcquire();
    	case org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__TRANSMIT:
    		return getTransmit();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__OWNED_COMMUNICATION_LINKS:
    		return getOwnedCommunicationLinks() != null && !getOwnedCommunicationLinks().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__PRODUCE:
    		return getProduce() != null && !getProduce().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__CONSUME:
    		return getConsume() != null && !getConsume().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__SEND:
    		return getSend() != null && !getSend().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__RECEIVE:
    		return getReceive() != null && !getReceive().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__CALL:
    		return getCall() != null && !getCall().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__EXECUTE:
    		return getExecute() != null && !getExecute().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__WRITE:
    		return getWrite() != null && !getWrite().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__ACCESS:
    		return getAccess() != null && !getAccess().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__ACQUIRE:
    		return getAcquire() != null && !getAcquire().isEmpty();
    	case org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__TRANSMIT:
    		return getTransmit() != null && !getTransmit().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.scenario.xdsml.functionscenariomt.communication.CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__OWNED_COMMUNICATION_LINKS:
    		getOwnedCommunicationLinks().clear();
    		getOwnedCommunicationLinks().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
