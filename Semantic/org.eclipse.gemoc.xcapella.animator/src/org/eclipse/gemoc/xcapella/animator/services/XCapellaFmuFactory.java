package org.eclipse.gemoc.xcapella.animator.services;

/* % Function name : FMUFactory
%-------------------------------------------------------------------------
% Created by           :    Jean-Philippe LAM-YEE-MUI (EDF R&D)
% Date                 :    01/01/2015
% SVN version          :    0
% Last modification by :    xxxxxxxxx
% Date                 :    xx/xx/xxxx
% SVN version          :    xxx
%-------------------------------------------------------------------------
% DACCOSIM 2015 - Copyright @ 2015 EDF and CentraleSupelec
% Code under GNU AGPL v3 license.
%-------------------------------------------------------------------------*/

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.javafmi.wrapper.generic.Simulation2;
import org.javafmi.wrapper.v2.Access;
import org.polarsys.capella.core.data.fa.ComponentPort;
import org.polarsys.capella.core.data.fa.ComponentPortKind;
import org.polarsys.capella.core.data.fa.OrientationPortKind;
import org.polarsys.capella.core.data.pa.PhysicalComponent;

//import fr.inria.kairos.fmisimulator.xfmisimulator.fmiAssembler.FMIVersion;
//import fr.inria.kairos.fmisimulator.xfmisimulator.fmiAssembler.FmiAssemblerFactory;
//import fr.inria.kairos.fmisimulator.xfmisimulator.fmiAssembler.Fmu;
//import fr.inria.kairos.fmisimulator.xfmisimulator.fmiAssembler.Input;
//import fr.inria.kairos.fmisimulator.xfmisimulator.fmiAssembler.Output;
//import fr.inria.kairos.fmisimulator.xfmisimulator.fmiAssembler.Variable;

public class XCapellaFmuFactory
{
	public PhysicalComponent m_FMUModel;
	private boolean m_bInitialized = false;

	public XCapellaFmuFactory(String FMUFilePath)
	{
		if(!FMUFilePath.isEmpty())
		{
//			if(FMUFilePath.toLowerCase().endsWith("daccosimfmu"))
//			{
//				// Initialize the model
//				DACCOSIMFMUPackage.eINSTANCE.eClass();
//
//				ResourceSet resourceSet = new ResourceSetImpl();
//				Resource resource = resourceSet.getResource(URI.createURI((new File(FMUFilePath)).toURI().toString()), true);
//				try {
//					resource.load(null);
//					m_FMUModel = (Fmu) resource.getContents().get(0);
//					m_bInitialized = true;
//				} catch(IOException e) {
//					e.printStackTrace();
//				}
//			}
//			else 
			if(FMUFilePath.toLowerCase().endsWith("fmu"))
			{
				// Try to load the FMU at FMUFilePath
				Simulation2 javaFMI_FMU = null;
				try {javaFMI_FMU = new Simulation2(FMUFilePath);}
				catch(Exception e)
				{
					System.err.println(e.toString());
					System.err.println("Failed to load " + FMUFilePath);
//					new MessageBoxErrorIcon("Failed to load " + FMUFilePath);
					return;
				}
				
				boolean bSuccessfulInitialization = true;
	//not needed just to import it	
	try {javaFMI_FMU.init(0.0);}	catch(Exception e){bSuccessfulInitialization = false;}
				
				// Initialize m_FMUModel
				m_FMUModel = org.polarsys.capella.core.data.pa.PaFactory.eINSTANCE.createPhysicalComponent();
				m_FMUModel.setDescription("fmuPath:"+FMUFilePath);
				String FMUFileLastName = (new File(FMUFilePath)).getName();
				if(javaFMI_FMU.getModelDescription().getModelName() == null){
					m_FMUModel.setName(FMUFileLastName.substring(0, FMUFileLastName.toLowerCase().indexOf(".fmu")));					
				}
				else{
					m_FMUModel.setName(javaFMI_FMU.getModelDescription().getModelName() );
				}

				//*******************************************************************
				// Populate m_FMUModel inputs and outputs and initializable variables
				Access access = null;
//				Map<String, List<String>> mapOutputDependencies = null;
				// Try to load the FMU as a FMI V2.0 FMU
				try
				{
//					access = new Access(javaFMI_FMU);
//					String fmuInfo = "fmiVersion:"+FmiVersion.TWO+"\n";
//					m_FMUModel.setReview(fmuInfo);
//					m_FMUModel.setCanBeInstantiatedOnlyOncePerProcess(access.check(new Capability("CAN_BE_INSTANTIATED_ONLY_ONCE_PER_PROCESS")));
//					m_FMUModel.setCanHandleVariableCommunicationStepSize(access.check(new Capability("CAN_HANDLE_VARIABLE_COMMUNICATION_STEP_SIZE")));
//					m_FMUModel.setCanGetAndSetFMUState(access.check(new Capability("CAN_GET_AND_SET_FMU_STATE")));
//					m_FMUModel.setCanInterpolateInputs(access.check(new Capability("CAN_INTERPOLATE_INPUTS")));
				}
				catch(Exception e)
				{
					System.err.println("error while loading fmu:\n" +e);
					return;
				}

				// Loop through the FMU inputs, outputs, and initializable variables
				Map<String, ComponentPort> mapInputs = new HashMap<String, ComponentPort>();
				for(org.javafmi.modeldescription.ScalarVariable variable : access.getModelVariables())
				{
					String causality = variable.getCausality();

					if(causality.equals("input"))
					{
						ComponentPort input = org.polarsys.capella.core.data.fa.FaFactory.eINSTANCE.createComponentPort();
						input.setOrientation(OrientationPortKind.IN);
						input.setKind(ComponentPortKind.FLOW);
//						CalculationGraphModelUtils.INSTANCE.SetScalarVariableData(input, variable);
//						if(access.getVersion() == FmiVersion.TWO)
//							CalculationGraphModelUtils.INSTANCE.SetFMI2ScalarVariableData(input, (org.javafmi.modeldescription.v2.ScalarVariable) variable);
//						if(bSuccessfulInitialization)
//							input.setDefaultInitialValue(javaFMI_FMU.readVariable(variable.getName()).getValue().toString());
						m_FMUModel.getOwnedFeatures().add(input);
						mapInputs.put(input.getName(), input);
						
					}
					else if(causality.equals("output"))
					{
						ComponentPort input = org.polarsys.capella.core.data.fa.FaFactory.eINSTANCE.createComponentPort();
						input.setOrientation(OrientationPortKind.OUT);
						input.setKind(ComponentPortKind.FLOW);
//						CalculationGraphModelUtils.INSTANCE.SetScalarVariableData(input, variable);
//						if(access.getVersion() == FmiVersion.TWO)
//							CalculationGraphModelUtils.INSTANCE.SetFMI2ScalarVariableData(input, (org.javafmi.modeldescription.v2.ScalarVariable) variable);
//						if(bSuccessfulInitialization)
//							input.setDefaultInitialValue(javaFMI_FMU.readVariable(variable.getName()).getValue().toString());
						m_FMUModel.getOwnedFeatures().add(input);
						mapInputs.put(input.getName(), input);
					}
//					else
//					{
//						String variability = variable.getVariability();
//						if(access.getVersion() == FmiVersion.TWO && !variability.equals("constant"))
//						{
//							String initial = ((org.javafmi.modeldescription.v2.ScalarVariable) variable).getInitial();
//							if(initial.equals("exact") || initial.equals("approx") || (causality.equals("parameter") && variability.equals("tunable")))
//							{
//								Variable _variable = FmiAssemblerFactory.eINSTANCE.createVariable();
//								CalculationGraphModelUtils.INSTANCE.SetScalarVariableData(_variable, variable);
//								CalculationGraphModelUtils.INSTANCE.SetFMI2ScalarVariableData(_variable, (org.javafmi.modeldescription.v2.ScalarVariable) variable);
//								if(bSuccessfulInitialization)
//									_variable.setDefaultInitialValue(javaFMI_FMU.readVariable(variable.getName()).getValue().toString());
//								m_FMUModel.getOwnedVariables().add(_variable);
//							}
//						}
//					}
				}
//				// Add information about the output dependencies (only for FMU compliant with FMI 2.0)
//				if(access.getVersion() == FmiVersion.TWO)
//				{
//					for(Output output : m_FMUModel.getOutputList())
//					{
////						if(mapOutputDependencies.containsKey(output.getName()))
////							for(String outputDependency : mapOutputDependencies.get(output.getName()))
////								output.getDependencyList().add(mapInputs.get(outputDependency));
//					}
//				}
				m_bInitialized = true;
			}
		}
	}

	public boolean IsInitialized()
	{
		return m_bInitialized;
	}

//	@Override
//	public Object getNewObject()
//	{
//		FMU FMUInstance = DACCOSIMCalculationGraphFactory.eINSTANCE.createFMU();
//
//		//===================================================
//		// Conversion between fr.daccosim.model.fmu and
//		// fr.daccosim.model.calculationgraph.FMU
//		if(m_FMUModel != null)
//		{
//			switch(m_FMUModel.getFMIVersion())
//			{
//			case V2_0:
//				FMUInstance.setFMIVersion(fr.daccosim.model.calculationgraph.FMIVersion.V2_0);
//				break;
//			}
//			
//			Map<String, Input> mapInputs = new HashMap<String, Input>();
//			for(fr.daccosim.model.fmu.Input FMUModelInput : m_FMUModel.getInputList())
//			{
//				Input input = DACCOSIMCalculationGraphFactory.eINSTANCE.createInput();
//				CalculationGraphModelUtils.INSTANCE.ConvertFromFMUModelToCalculationGraphFMU(input, FMUModelInput);
//				input.setDefaultInitialValue(FMUModelInput.getDefaultInitialValue());
//				FMUInstance.getInputList().add(input);
//				mapInputs.put(input.getName(), input);
//			}
//
//			for(fr.daccosim.model.fmu.Output FMUModelOutput : m_FMUModel.getOutputList())
//			{
//				Output output = DACCOSIMCalculationGraphFactory.eINSTANCE.createOutput();
//				CalculationGraphModelUtils.INSTANCE.ConvertFromFMUModelToCalculationGraphFMU(output, FMUModelOutput);
//				output.setTolerance(FMUModelOutput.getTolerance());
//				FMUInstance.getOutputList().add(output);
//			}		
//
//			for(fr.daccosim.model.fmu.Variable FMUModelVariable : m_FMUModel.getVariableList())
//			{
//				Variable variable = DACCOSIMCalculationGraphFactory.eINSTANCE.createVariable();
//				CalculationGraphModelUtils.INSTANCE.ConvertFromFMUModelToCalculationGraphFMU(variable, FMUModelVariable);
//				variable.setDefaultInitialValue(FMUModelVariable.getDefaultInitialValue());
//				FMUInstance.getVariableList().add(variable);
//			}		
//
//			FMUInstance.setName(m_FMUModel.getInternalName());
//			FMUInstance.setPath(m_FMUModel.getPath());
//			FMUInstance.setCanBeInstantiatedOnlyOncePerProcess(m_FMUModel.isCanBeInstantiatedOnlyOncePerProcess());
//			FMUInstance.setCanHandleVariableCommunicationStepSize(m_FMUModel.isCanHandleVariableCommunicationStepSize());
//			FMUInstance.setCanGetAndSetFMUState(m_FMUModel.isCanGetAndSetFMUState());
//			FMUInstance.setCanInterpolateInputs(m_FMUModel.isCanInterpolateInputs());
//			FMUInstance.setInternalSolverTolerance(m_FMUModel.getInternalSolverTolerance());
//			
//			if(FMUInstance.getFMIVersion() == fr.daccosim.model.calculationgraph.FMIVersion.V2_0)
//			{	
//				int uiOutputIndex = 0;
//				for(fr.daccosim.model.fmu.Output FMUModelOutput : m_FMUModel.getOutputList())
//				{
//					Output FMUInstanceOutput = FMUInstance.getOutputList().get(uiOutputIndex);
//					for(fr.daccosim.model.fmu.Input dependency : FMUModelOutput.getDependencyList())
//						FMUInstanceOutput.getDependencyList().add(mapInputs.get(dependency.getName()));
//					++uiOutputIndex;
//				}
//			}
//		}
//
//		return FMUInstance;
//	}
//
//	@Override public Object getObjectType()
//	{
//		return FMU.class;
//	}

	public String GetFMUName()
	{
		return m_FMUModel.getName();
	}

}

