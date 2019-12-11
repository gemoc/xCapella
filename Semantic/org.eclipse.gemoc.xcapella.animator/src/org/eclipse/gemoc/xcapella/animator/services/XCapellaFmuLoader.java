package org.eclipse.gemoc.xcapella.animator.services;

import java.io.File;
import java.util.Collection;
import java.util.Map;

import javax.swing.JFileChooser;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.polarsys.capella.core.data.ctx.SystemFunction;
import org.polarsys.capella.core.data.pa.PhysicalComponent;



public class XCapellaFmuLoader implements IExternalJavaAction {

//extends org.eclipse.sirius.business.api.action.AbstractExternalJavaAction {
	
	public XCapellaFmuLoader() {
		System.out.println("FMU loader instantiated");
	}
	
	public PhysicalComponent loadFMU() {

		JFileChooser p = new JFileChooser();
		p.showOpenDialog(null);
		File selectedFile = p.getSelectedFile();



//		for(int i = 0; i < filenames.length; i++)
//		{
//			if(filterPath != null && filterPath.trim().length() > 0)
//				selectedFiles[i] = new File(filterPath, filenames[i]);
//			else
//				selectedFiles[i] = new File(filenames[i]);
//
//			//String FMUFileAbsolutePath = selectedFiles[i].getAbsolutePath();
//			
			String FMUFilePath = selectedFile.getAbsolutePath();
			XCapellaFmuFactory factory = new XCapellaFmuFactory(FMUFilePath);
			if(factory.IsInitialized())
			{
				String label = factory.GetFMUName();
				String FMUFileLastName = (new File(FMUFilePath)).getName();
				if(label == null)
					label = FMUFileLastName.substring(0, FMUFileLastName.toLowerCase().indexOf(".fmu"));
			
				return factory.m_FMUModel;
			}
			
//		}	
		
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
		}
		System.out.println("executed !");
	}

}

