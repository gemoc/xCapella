package org.eclipse.gemoc.xcapella.animator.services;

import java.io.File;
import java.util.Collection;
import java.util.Map;

import javax.swing.JFileChooser;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.ctx.SystemFunction;
import org.polarsys.capella.core.data.pa.PhysicalComponent;



public class XCapellaFmuLoader implements IExternalJavaAction {

	public PhysicalComponent fmuComponent;
	public Part fmuPart;
	
	public XCapellaFmuLoader() {
		System.out.println("FMU loader instantiated");
	}
	
	public PhysicalComponent loadFMU() {

		JFileChooser p = new JFileChooser();
		p.showOpenDialog(null);
		File selectedFile = p.getSelectedFile();

			String FMUFilePath = selectedFile.getAbsolutePath();
		XCapellaFmuFactory factory = new XCapellaFmuFactory(FMUFilePath);
		if(factory.IsInitialized())
		{
			String label = factory.GetFMUName();
			String FMUFileLastName = (new File(FMUFilePath)).getName();
			if(label == null)
				label = FMUFileLastName.substring(0, FMUFileLastName.toLowerCase().indexOf(".fmu"));
		
			fmuComponent = factory.fmuComponent;
			fmuPart = factory.fmuPart;
			
			factory.terminate();
			
			return fmuComponent;
		}
			
		
		return null;
		
	}

//	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

//	@Override
	public void execute(Collection<? extends EObject> arg0,
			Map<String, Object> arg1) {
		
		PhysicalComponent theFmu = loadFMU();
		if(theFmu != null){
			((PhysicalComponent)arg0.iterator().next()).getOwnedPhysicalComponents().add(theFmu);
			((PhysicalComponent)arg0.iterator().next()).getOwnedFeatures().add(fmuPart);
		}
		System.out.println("executed !");
	}
	
	

}

