/* GENERATED FILE, do not modify manually                                                    *
 * If you need to modify it, disable the generation in the BuildOptions of the project.xdsml */
package functionscenario.xdsml.api.impl;
import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.dsa.executors.CodeExecutorDispatcher;
public class FunctionScenarioCodeExecutor extends CodeExecutorDispatcher 
		implements org.eclipse.gemoc.execution.concurrent.ccsljavaengine.extensions.k3.dsa.api.IK3DSAExecutorClassLoader  {
	public FunctionScenarioCodeExecutor(){
	    // add Melange or K3 DSA specific executors
		addExecutor(new org.eclipse.gemoc.execution.concurrent.ccsljavaengine.extensions.k3.dsa.impl.MelangeCodeExecutor(this,
			"org.gemoc.scenario.xdsml.FunctionScenario"));
		// fall back executor : search classic java method
		addExecutor(new org.eclipse.gemoc.execution.concurrent.ccsljavaengine.dsa.executors.JavaCodeExecutor());
	}
	public String getDSAProjectName(){
		//TODO please implement
		return "";
	}
   @Override
	public Class<?> getClassForName(String className) throws ClassNotFoundException {
		return Class.forName(className);
	}
	@Override
	public java.io.InputStream getResourceAsStream(String resourceName) {
		//this.getClass().getResourceAsStream(resourceName);
		return Thread.currentThread().getContextClassLoader().getResourceAsStream(resourceName);
	}
}