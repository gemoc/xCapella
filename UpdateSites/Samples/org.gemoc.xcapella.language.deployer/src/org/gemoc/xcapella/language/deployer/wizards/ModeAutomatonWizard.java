
package org.gemoc.xcapella.language.deployer.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.gemoc.xcapella.language.deployer.Activator;


public class ModeAutomatonWizard
	extends AbstractExampleWizard {
	
	protected Collection<ProjectDescriptor> getProjectDescriptors() {		
		// We need the statements example to be unzipped along with the
		// EMF library example model, edit and editor examples
		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
//		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/com.thalesgroup.trt.gemoc.modeautomata.animation.zip", "com.thalesgroup.trt.gemoc.modeautomata.animation"));
//		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/com.thalesgroup.trt.mocc.modemachine.dse.zip", "com.thalesgroup.trt.mocc.modemachine.dse"));
//		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/com.thalesgroup.trt.mocc.modemachine.k3dsa.zip", "com.thalesgroup.trt.mocc.modemachine.k3dsa"));
//		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/com.thalesgroup.trt.mocc.modemachine.xdsml.zip", "com.thalesgroup.trt.mocc.modemachine.xdsml"));
//		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/fr.inria.aoste.timesquare.ccslkernel.solver.extension.statemachine.zip", "fr.inria.aoste.timesquare.ccslkernel.solver.extension.statemachine"));
//		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.sample.smcube.moc.lib.zip", "org.gemoc.sample.smcube.moc.lib"));

		
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/com.thalesgroup.trt.gemoc.modeautomata.animation.zip", "."));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/com.thalesgroup.trt.mocc.modemachine.dse.zip", "."));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/com.thalesgroup.trt.mocc.modemachine.k3dsa.zip", "."));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/com.thalesgroup.trt.mocc.modemachine.xdsml.zip", "."));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/fr.inria.aoste.timesquare.ccslkernel.solver.extension.statemachine.zip", "."));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.sample.smcube.moc.lib.zip", "."));

		return projects;
	}

	@Override
	protected AbstractUIPlugin getContainerPlugin() {
		
		return Activator.getDefault();
	}
}

