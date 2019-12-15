package org.eclipse.gemoc.xcapella.animator.services;


import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.javafmi.wrapper.Simulation;
import org.javafmi.wrapper.v2.Access;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.fa.ComponentPort;
import org.polarsys.capella.core.data.fa.ComponentPortKind;
import org.polarsys.capella.core.data.fa.OrientationPortKind;
import org.polarsys.capella.core.data.pa.PhysicalComponent;
import org.polarsys.capella.core.data.pa.PhysicalComponentNature;


public class XCapellaFmuFactory
{
	public PhysicalComponent fmuComponent;
	public Part fmuPart;
	
	protected Simulation javaFMI_FMU = null;
	protected boolean m_bInitialized = false;

	public XCapellaFmuFactory(String FMUFilePath)
	{
		if(!FMUFilePath.isEmpty() && FMUFilePath.toLowerCase().endsWith("fmu"))
		{
			Access access = null;
			try {
				javaFMI_FMU = new Simulation(FMUFilePath);
				System.out.println(javaFMI_FMU.init(0.0));
				access = new Access(javaFMI_FMU);
//				String[] unknownVariables = new String[]{"unknown", "variables"};
//				String knownVariable = "known";
//				double[] directionalDerivatives = access.getDirectionalDerivative(knownVariable, unknownVariables);
			
			}catch(Exception e)
			{
				System.err.println("error while loading fmu:\n" +e);
				return;
			}
			

			
			// Initialize m_FMUModel
			fmuComponent = org.polarsys.capella.core.data.pa.PaFactory.eINSTANCE.createPhysicalComponent();
			fmuPart = org.polarsys.capella.core.data.cs.CsFactory.eINSTANCE.createPart();
			fmuPart.setAbstractType(fmuComponent);
			fmuComponent.setDescription("fmuPath:"+FMUFilePath);
			fmuPart.setDescription("fmuPath:"+FMUFilePath);
			fmuComponent.setNature(PhysicalComponentNature.BEHAVIOR);
			String FMUFileLastName = (new File(FMUFilePath)).getName();
			if(javaFMI_FMU.getModelDescription().getModelName() == null){
				String fmuName = FMUFileLastName.substring(0, FMUFileLastName.toLowerCase().indexOf(".fmu"));
				fmuComponent.setName(fmuName);
				fmuPart.setName(fmuName);
			}
			else{
				fmuComponent.setName(javaFMI_FMU.getModelDescription().getModelName());
				fmuPart.setName(javaFMI_FMU.getModelDescription().getModelName());
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
					input.setName(variable.getName());
					input.setDescription("value:"+variable.getInitial());
					fmuComponent.getOwnedFeatures().add(input);
					mapInputs.put(input.getName(), input);
					
				}
				else if(causality.equals("output"))
				{
					ComponentPort output = org.polarsys.capella.core.data.fa.FaFactory.eINSTANCE.createComponentPort();
					output.setOrientation(OrientationPortKind.OUT);
					output.setKind(ComponentPortKind.FLOW);
					output.setName(variable.getName());
					fmuComponent.getOwnedFeatures().add(output);
					mapInputs.put(output.getName(), output);
				}
				
				else if(causality.equals("parameter"))
				{
					ComponentPort param = org.polarsys.capella.core.data.fa.FaFactory.eINSTANCE.createComponentPort();
					param.setOrientation(OrientationPortKind.UNSET);
					param.setKind(ComponentPortKind.STANDARD);
					param.setName(variable.getName());
					param.setDescription("value:"+variable.getInitial());
					fmuComponent.getOwnedFeatures().add(param);
					mapInputs.put(param.getName(), param);
				}

			m_bInitialized = true;
			}
		}
	}

	public boolean IsInitialized()
	{
		return m_bInitialized;
	}


	public String GetFMUName()
	{
		return fmuComponent.getName();
	}

	public void terminate() {
		javaFMI_FMU.terminate();
	}

}

