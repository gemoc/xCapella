//package fr.inria.glose.fcl.alefcl.xdsml.fmu.services;
//
//import java.io.File;
//
//import javax.swing.JFileChooser;
//import org.eclipse.core.resources.IFile;
//import org.eclipse.core.runtime.Platform;
//import org.eclipse.emf.ecore.EObject;
//import org.eclipse.gemoc.commons.eclipse.core.resources.IFileUtils;
//import org.javafmi.modeldescription.FmiVersion;
//import org.javafmi.proxy.Status;
//import org.javafmi.wrapper.generic.Simulation2;
//import org.javafmi.wrapper.v2.Access;
//
//import fr.inria.glose.fcl.alefcl.xdsml.Activator;
//import fr.inria.glose.fcl.model.fcl.FMUFunction;
//import fr.inria.glose.fcl.model.fcl.FMUSimulationWrapper;
//import fr.inria.glose.fcl.model.fcl.FclFactory;
//
//public class FMUService {
//
//	public static void interactiveLoadFMU(EObject self) {
//		JFileChooser p = new JFileChooser();
//		p.showOpenDialog(null);
//		File selectedFile = p.getSelectedFile();
//
//	
//		String FMUFilePath = selectedFile.getAbsolutePath();
//		FMUFactory factory = new FMUFactory(FMUFilePath);
//		if(factory.IsInitialized())
//		{
//			
//		}
//	}
//	
//	// BIG ALE bug !!! https://github.com/gemoc/ale-lang/issues/46
//	//public static FMUSimulationWrapper createFMUSimulationWrapper(FMUFunction self) {
//	public static FMUSimulationWrapper createAndAssignFMUSimulationWrapper_buggy(FMUFunction  self) {
//		FMUSimulationWrapper result =	null;
//		
//		String FMUFilePath =  ((FMUFunction)self).getRunnableFmuPath();
//		try {
//			Simulation2 aRunnableFmu = new Simulation2(FMUFilePath);
//			aRunnableFmu.init(0.0);	// start time 0.0
//			// connect to wrapper for model access
//			result = FclFactory.eINSTANCE.createFMUSimulationWrapper();
//			result.setFmiSimulation2(aRunnableFmu);
//			//((FMUFunction)self).s
//		} catch (Exception e) {
//			Activator.error("Failed to initialize FMU "+FMUFilePath, e);
//		}
//		return result;
//	}
//	
//	// workaround to ALE bug (typechecker problem), parameter type must be EObject, cannot return EObject (cannot be cast) or precise type  
//	public static void loadAndAssignFMUSimulationWrapper_workaround(EObject  selfFMUFunction, EObject resultFMUSimulationWrapper) {
//		FMUSimulationWrapper result =	(FMUSimulationWrapper)resultFMUSimulationWrapper;
//		FMUFunction self = (FMUFunction)selfFMUFunction;
//		
//		
//		
//		//String FMUFilePath =  self.getRunnableFmuPath();
//		try {
//			IFile iFile = IFileUtils.getIFileFromWorkspaceOrFileSystem(self.getRunnableFmuPath());
//			String FMUFilePath =  iFile.getLocation().toString();
//		
//			Simulation2 aRunnableFmu = new Simulation2(FMUFilePath);
//			aRunnableFmu.init(0.0);	// start time 0.0
//			// connect to wrapper for model access
//			//result = Alefcl_vmFactory.eINSTANCE.createFMUSimulationWrapper();
//			result.setFmiSimulation2(aRunnableFmu);
//		} catch (Exception e) {
//			Activator.error("Failed to initialize FMU "+self.getRunnableFmuPath(), e);
//		}
//	}
//	
//	public double getOutputPortValueFromSimulation2Runtime(EObject  selfFMUFunction, EObject fmuSimulationWrapper, String portName) {
//		FMUSimulationWrapper wrapper =	(FMUSimulationWrapper)fmuSimulationWrapper;
//		Simulation2 javaFMI_FMU = wrapper.getFmiSimulation2();
//		return javaFMI_FMU.read(portName).asDouble();
//	}
//	public void setSimulation2RuntimeVariableFromInputPortValue(EObject  selfFMUFunction, EObject fmuSimulationWrapper, String portName, Double portValue) {
//		FMUSimulationWrapper wrapper =	(FMUSimulationWrapper)fmuSimulationWrapper;
//		Simulation2 javaFMI_FMU = wrapper.getFmiSimulation2();
//		Status status = javaFMI_FMU.write(portName).with(portValue);
//		if(status != Status.OK) {
//			System.err.println("Failed to write "+portValue+" in fmu variable "+portName+" "+status.getValue());
//		}
//	}
//	
//	public void doStep(EObject  selfFMUFunction, EObject fmuSimulationWrapper, double stepSize) {
//		FMUSimulationWrapper wrapper =	(FMUSimulationWrapper)fmuSimulationWrapper;
//		Simulation2 javaFMI_FMU = wrapper.getFmiSimulation2();
//		Status status = javaFMI_FMU.doStep(stepSize);
//		if(status != Status.OK) {
//			System.err.println("Failed to doStep "+selfFMUFunction);
//		}
//	}
//	
//	public double getSimulationCurrentTime(EObject  selfFMUFunction, EObject fmuSimulationWrapper) {
//		FMUSimulationWrapper wrapper =	(FMUSimulationWrapper)fmuSimulationWrapper;
//		Simulation2 javaFMI_FMU = wrapper.getFmiSimulation2();
//		return javaFMI_FMU.getCurrentTime();
//	}
//	
//	
//	public String getKnownOutputVariables(EObject  selfFMUFunction, EObject fmuSimulationWrapper) {
//		StringBuilder sb = new StringBuilder();
//		FMUFunction self = (FMUFunction)selfFMUFunction;
//		FMUSimulationWrapper wrapper =	(FMUSimulationWrapper)fmuSimulationWrapper;
//		Simulation2 javaFMI_FMU = wrapper.getFmiSimulation2();
//		Access access = new Access(javaFMI_FMU);
//		for(org.javafmi.modeldescription.ScalarVariable variable : access.getModelVariables())
//		{
//			String causality = variable.getCausality();
//
//			String varName = variable.getName();
//			if(causality.equals("output"))
//			{
//				sb.append("FMU output: "+varName+" = "+javaFMI_FMU.read(varName).asDouble() + " //"+javaFMI_FMU.readVariable(varName)+ " "+variable.getType()+"\n");
//			}
//		}
//		return sb.toString();
//	}
//	public String getKnownInputVariables(EObject  selfFMUFunction, EObject fmuSimulationWrapper) {
//		StringBuilder sb = new StringBuilder();
//		FMUFunction self = (FMUFunction)selfFMUFunction;
//		FMUSimulationWrapper wrapper =	(FMUSimulationWrapper)fmuSimulationWrapper;
//		Simulation2 javaFMI_FMU = wrapper.getFmiSimulation2();
//		Access access = new Access(javaFMI_FMU);
//		for(org.javafmi.modeldescription.ScalarVariable variable : access.getModelVariables())
//		{
//			String causality = variable.getCausality();
//
//			String varName = variable.getName();
//			if(causality.equals("input"))
//			{
//				sb.append("FMU input: "+varName+" = "+javaFMI_FMU.read(varName).asDouble() + " //"+javaFMI_FMU.readVariable(varName)+ " "+variable.getType()+"\n");
//			}
//		}
//		return sb.toString();
//	}
//	public void loadPortFromSimulation2(EObject  selfFMUFunction, EObject fmuSimulationWrapper) {
//		FMUFunction self = (FMUFunction)selfFMUFunction;
//		FMUSimulationWrapper wrapper =	(FMUSimulationWrapper)fmuSimulationWrapper;
//		Simulation2 javaFMI_FMU = wrapper.getFmiSimulation2();
//		Access access = new Access(javaFMI_FMU);
//		for(org.javafmi.modeldescription.ScalarVariable variable : access.getModelVariables())
//		{
//			String causality = variable.getCausality();
//
//			String varName = variable.getName();
//			if(causality.equals("input"))
//			{
//				Activator.debug("FMU input: "+varName+" = "+javaFMI_FMU.read(varName).asDouble() + " //"+javaFMI_FMU.readVariable(varName)+ " "+variable.getType());
///*				Input input = FmiAssemblerFactory.eINSTANCE.createInput();
//				CalculationGraphModelUtils.INSTANCE.SetScalarVariableData(input, variable);
//				if(access.getVersion() == FmiVersion.TWO)
//					CalculationGraphModelUtils.INSTANCE.SetFMI2ScalarVariableData(input, (org.javafmi.modeldescription.v2.ScalarVariable) variable);
//				if(bSuccessfulInitialization)
//					input.setDefaultInitialValue(javaFMI_FMU.readVariable(variable.getName()).getValue().toString());
//				m_FMUModel.getOwnedInputs().add(input);
//				mapInputs.put(input.getName(), input);
//	*/			
//			}
//			else if(causality.equals("output"))
//			{
//				Activator.debug("FMU output: "+varName+" = "+javaFMI_FMU.read(varName).asDouble() + " //"+javaFMI_FMU.readVariable(varName)+ " "+variable.getType());
///*					Output output = FmiAssemblerFactory.eINSTANCE.createOutput();
//				CalculationGraphModelUtils.INSTANCE.SetScalarVariableData(output, variable);
//				if(access.getVersion() == FmiVersion.TWO)
//					CalculationGraphModelUtils.INSTANCE.SetFMI2ScalarVariableData(output, (org.javafmi.modeldescription.v2.ScalarVariable) variable);
//				m_FMUModel.getOwnedOutputs().add(output);
//*/				}
//			else
//			{
//				String variability = variable.getVariability();
//				if(access.getVersion() == FmiVersion.TWO && !variability.equals("constant"))
//				{
//					String initial = ((org.javafmi.modeldescription.v2.ScalarVariable) variable).getInitial();
//					if(initial.equals("exact") || initial.equals("approx") || (causality.equals("parameter") && variability.equals("tunable")))
//					{
///*						Variable _variable = FmiAssemblerFactory.eINSTANCE.createVariable();
//						CalculationGraphModelUtils.INSTANCE.SetScalarVariableData(_variable, variable);
//						CalculationGraphModelUtils.INSTANCE.SetFMI2ScalarVariableData(_variable, (org.javafmi.modeldescription.v2.ScalarVariable) variable);
//						if(bSuccessfulInitialization)
//							_variable.setDefaultInitialValue(javaFMI_FMU.readVariable(variable.getName()).getValue().toString());
//						m_FMUModel.getOwnedVariables().add(_variable);
//	*/				}
//				}
//			}
//		}
//		
//	}
//	
//}
