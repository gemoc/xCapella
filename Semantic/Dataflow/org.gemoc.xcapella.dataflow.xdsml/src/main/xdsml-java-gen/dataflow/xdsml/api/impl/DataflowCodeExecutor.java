/* GENERATED FILE, do not modify manually                                                    *
 * If you need to modify it, disable the generation in the BuildOptions of the project.xdsml */
package dataflow.xdsml.api.impl;
import org.gemoc.execution.concurrent.ccsljavaengine.dsa.executors.CodeExecutorDispatcher;
public class DataflowCodeExecutor extends CodeExecutorDispatcher 
		implements org.gemoc.execution.concurrent.ccsljavaengine.extensions.k3.dsa.api.IK3DSAExecutorClassLoader  {
	public DataflowCodeExecutor(){
	    // add K3 DSA specific executor
		addExecutor(new org.gemoc.execution.concurrent.ccsljavaengine.extensions.k3.dsa.impl.Kermeta3AspectsCodeExecutor(this,
			"org.gemoc.xcapella.dataflow.k3dsa"));
		// fall back executor : search classic java method
		addExecutor(new org.gemoc.execution.concurrent.ccsljavaengine.dsa.executors.JavaCodeExecutor());
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