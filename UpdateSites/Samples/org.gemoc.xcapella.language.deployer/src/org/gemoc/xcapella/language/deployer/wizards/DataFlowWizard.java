
package org.gemoc.xcapella.language.deployer.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.gemoc.xcapella.language.deployer.Activator;


public class DataFlowWizard
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
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/fr.inria.aoste.dataflowmode.constaint.moccml.zip", "fr.inria.aoste.dataflowmode.constaint.moccml"));

		
		
		return projects;
	}

	@Override
	protected AbstractUIPlugin getContainerPlugin() {
		
		return Activator.getDefault();
	}
}

