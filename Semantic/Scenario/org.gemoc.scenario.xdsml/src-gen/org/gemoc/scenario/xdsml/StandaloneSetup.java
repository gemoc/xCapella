package org.gemoc.scenario.xdsml;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup();
    setup.doEMFRegistration();
    setup.doAdaptersRegistration();
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	org.polarsys.capella.core.data.capellamodeller.CapellamodellerPackage.eNS_URI,
    	org.polarsys.capella.core.data.capellamodeller.CapellamodellerPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.polarsys.capella.core.data.capellacore.CapellacorePackage.eNS_URI,
    	org.polarsys.capella.core.data.capellacore.CapellacorePackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.polarsys.capella.core.data.oa.OaPackage.eNS_URI,
    	org.polarsys.capella.core.data.oa.OaPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.polarsys.capella.core.data.ctx.CtxPackage.eNS_URI,
    	org.polarsys.capella.core.data.ctx.CtxPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.polarsys.capella.core.data.la.LaPackage.eNS_URI,
    	org.polarsys.capella.core.data.la.LaPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.polarsys.capella.core.data.pa.PaPackage.eNS_URI,
    	org.polarsys.capella.core.data.pa.PaPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.polarsys.capella.core.data.pa.deployment.DeploymentPackage.eNS_URI,
    	org.polarsys.capella.core.data.pa.deployment.DeploymentPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.polarsys.capella.core.data.epbs.EpbsPackage.eNS_URI,
    	org.polarsys.capella.core.data.epbs.EpbsPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.polarsys.capella.core.data.sharedmodel.SharedmodelPackage.eNS_URI,
    	org.polarsys.capella.core.data.sharedmodel.SharedmodelPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.polarsys.capella.core.data.requirement.RequirementPackage.eNS_URI,
    	org.polarsys.capella.core.data.requirement.RequirementPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eNS_URI,
    	org.polarsys.capella.core.data.capellacommon.CapellacommonPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.polarsys.capella.core.data.information.InformationPackage.eNS_URI,
    	org.polarsys.capella.core.data.information.InformationPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.polarsys.capella.core.data.information.communication.CommunicationPackage.eNS_URI,
    	org.polarsys.capella.core.data.information.communication.CommunicationPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.polarsys.capella.core.data.information.datatype.DatatypePackage.eNS_URI,
    	org.polarsys.capella.core.data.information.datatype.DatatypePackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.polarsys.capella.core.data.information.datavalue.DatavaluePackage.eNS_URI,
    	org.polarsys.capella.core.data.information.datavalue.DatavaluePackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.polarsys.capella.core.data.cs.CsPackage.eNS_URI,
    	org.polarsys.capella.core.data.cs.CsPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.polarsys.capella.core.data.fa.FaPackage.eNS_URI,
    	org.polarsys.capella.core.data.fa.FaPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.polarsys.capella.core.data.interaction.InteractionPackage.eNS_URI,
    	org.polarsys.capella.core.data.interaction.InteractionPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.polarsys.capella.common.data.modellingcore.ModellingcorePackage.eNS_URI,
    	org.polarsys.capella.common.data.modellingcore.ModellingcorePackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.polarsys.kitalpha.emde.model.EmdePackage.eNS_URI,
    	org.polarsys.kitalpha.emde.model.EmdePackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.polarsys.capella.common.data.activity.ActivityPackage.eNS_URI,
    	org.polarsys.capella.common.data.activity.ActivityPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	org.polarsys.capella.common.data.behavior.BehaviorPackage.eNS_URI,
    	org.polarsys.capella.common.data.behavior.BehaviorPackage.eINSTANCE
    );
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    );
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    );
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor functionScenario = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.gemoc.scenario.xdsml.FunctionScenario", "", "http://www.polarsys.org/capella/core/modeller/0.8.0", "org.gemoc.scenario.xdsml.FunctionScenarioMT"
    );
    functionScenario.addAdapter("org.gemoc.scenario.xdsml.FunctionScenarioMT", org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.gemoc.scenario.xdsml.FunctionScenario",
    	functionScenario
    );
    MelangeRegistry.ModelTypeDescriptor functionScenarioMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.gemoc.scenario.xdsml.FunctionScenarioMT", "", "http://functionscenariomt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.gemoc.scenario.xdsml.FunctionScenarioMT",
    	functionScenarioMT
    );
  }
}
