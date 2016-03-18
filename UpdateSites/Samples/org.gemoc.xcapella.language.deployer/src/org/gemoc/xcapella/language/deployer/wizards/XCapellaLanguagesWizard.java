
package org.gemoc.xcapella.language.deployer.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.gemoc.xcapella.language.deployer.Activator;
import org.gemoc.xcapella.language.deployer.wizards.AbstractExampleWizard.ProjectDescriptor;


public class XCapellaLanguagesWizard
	extends AbstractExampleWizard {
	
	protected Collection<ProjectDescriptor> getProjectDescriptors() {		
		// We need the statements example to be unzipped along with the
		// EMF library example model, edit and editor examples
		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.xcapella.dataflow.animator.zip", "org.gemoc.xcapella.dataflow.animator"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.xcapella.dataflow.dse.zip", "org.gemoc.xcapella.dataflow.dse"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.xcapella.dataflow.k3dsa.zip", "org.gemoc.xcapella.dataflow.k3dsa"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.xcapella.dataflow.mocc.zip", "org.gemoc.xcapella.dataflow.mocc"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.xcapella.dataflow.xdsml.zip", "org.gemoc.xcapella.dataflow.xdsml"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/fr.inria.aoste.dataflowmode.constraint.moccml.zip", "fr.inria.aoste.dataflowmode.constraint.moccml"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.executionframework.engine.coordinator.commons.zip", "org.gemoc.executionframework.engine.coordinator.commons"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.gemoc_language_workbench.utils.zip", "org.gemoc.gemoc_language_workbench.utils"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/com.thalesgroup.trt.gemoc.modeautomata.animation.zip", "com.thalesgroup.trt.gemoc.modeautomata.animation"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/com.thalesgroup.trt.mocc.modemachine.dse.zip", "com.thalesgroup.trt.mocc.modemachine.dse"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/com.thalesgroup.trt.mocc.modemachine.k3dsa.zip", "com.thalesgroup.trt.mocc.modemachine.k3dsa"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/com.thalesgroup.trt.mocc.modemachine.xdsml.zip", "com.thalesgroup.trt.mocc.modemachine.xdsml"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/fr.inria.aoste.timesquare.ccslkernel.solver.extension.statemachine.zip", "fr.inria.aoste.timesquare.ccslkernel.solver.extension.statemachine"));
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.gemoc.sample.smcube.moc.lib.zip", "org.gemoc.sample.smcube.moc.lib"));

					
		
		return projects;
	}

	@Override
	protected AbstractUIPlugin getContainerPlugin() {
		
		return Activator.getDefault();
	}
}

