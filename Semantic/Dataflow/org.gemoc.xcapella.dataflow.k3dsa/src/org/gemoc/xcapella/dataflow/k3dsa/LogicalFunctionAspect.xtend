package org.gemoc.xcapella.dataflow.k3dsa

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
	
import org.polarsys.capella.core.data.la.LogicalFunction
	
@Aspect(className=LogicalFunction)
public class LogicalFunctionAspect extends AbstractFunctionAspect {

	def void init() {
		println("init of " + _self.name);
	}
	
	def void start() {
		println("start of " + _self.name);		
	}
	
	def void finish() {
		println("finish of " + _self.name);		
	}
}