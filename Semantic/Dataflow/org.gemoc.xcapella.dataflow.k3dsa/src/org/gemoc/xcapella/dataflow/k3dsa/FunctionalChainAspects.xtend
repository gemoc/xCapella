package org.gemoc.xcapella.dataflow.k3dsa



import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionRuntimeData
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionalChainRuntimeData
import java.util.ArrayList
import static extension org.gemoc.xcapella.dataflow.k3dsa.FunctionRuntimeDataAspect.*
import static extension org.gemoc.xcapella.dataflow.k3dsa.FunctionalChainRuntimeDataAspect.*



import org.polarsys.capella.core.data.fa.FunctionalChain
import org.polarsys.capella.core.data.fa.AbstractFunction
import org.polarsys.kitalpha.emde.model.ElementExtension
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.MachineRuntimeData
import com.thalesgroup.trt.mde.vp.mode.mode.ModeMachine
import fr.inria.diverse.k3.al.annotationprocessor.Aspect

@Aspect(className=FunctionRuntimeData)
class FunctionRuntimeDataAspect {
	def public String init() {
		var AbstractFunction func = _self.eContainer as AbstractFunction
		
		for (ElementExtension ext :func.ownedExtensions) {
			if(ext instanceof ModeMachine) {
				var ModeMachine machine = ext as ModeMachine
				for(ElementExtension theExt : machine.ownedExtensions) {
					if(theExt instanceof MachineRuntimeData) {
						var MachineRuntimeData rtData = ext as MachineRuntimeData
						rtData.current = null
//						for(Variable currentVar: machine.localVariables) {
//							currentVar.currentValue.
//						}
					}
				}
			}
		}
		
		println("[" + func.getClass().getSimpleName() + ":" + func.getName() + ".Init()]Initialized " + func.name);
	}	
	def public void activate(){
		var AbstractFunction func = _self.eContainer as AbstractFunction
		if(_self.isActive) {
			println("ERROR: " + func.name + " HAS BEEN ACTIVATED ELSEWHERE!")
			return;
		}
		
		_self.isActive = true;
		
		println(func.name  + " ACTIVE!")
	}
	
	def public void deactivate(){
		var AbstractFunction func = _self.eContainer as AbstractFunction
		if(! _self.isActive) {
			println("ERROR: " + func.name + " HAS BEEN DEACTIVATED ELSEWHERE!")
			return;
		}

		_self.isActive = false;
		
		println(func.name  + " NOT ACTIVE!")
	}
	
//	def public void start(){
//		var AbstractFunction func = _self.eContainer as AbstractFunction
//		if(_self.isRunning) {
//			println("ERROR: " + func.name + " HAS BEEN STARTED ELSEWHERE!")
//			return;
//		}
//		
//		_self.isRunning = true;
//		
//		println(func.name  + " STARTED!")
//	}
//	
//	def public void stop(){
//		var AbstractFunction func = _self.eContainer as AbstractFunction
//		if(! _self.isRunning) {
//			println("ERROR: " + func.name + " HAS NOT BEEN STARTED!")
//			return;
//		}
//			
//		_self.isRunning = false;
//		
//		println(func.name  + " STOPPED!")
//	}
}

@Aspect(className=FunctionalChainRuntimeData)
class FunctionalChainRuntimeDataAspect {
	
	def public void activate(){
		var FunctionalChain chain = _self.eContainer as FunctionalChain
		
		if(_self.isActive) {
			println("ERROR: " + chain.name + " HAS BEEN ACTIVATED ELSEWHERE!")
			return;
		}
		
		
		for(AbstractFunction func : chain.enactedFunctions) {
			for(ElementExtension theExt : func.ownedExtensions) {
				if(theExt instanceof FunctionRuntimeData) {
					var FunctionRuntimeData rtData = theExt as FunctionRuntimeData
					rtData.activate();
				}
			}
		}
		
		_self.isActive = true;
		
		println(chain.name  + " ACTIVE!")
	}
	
	def public void deactivate(){
		var FunctionalChain chain = _self.eContainer as FunctionalChain
		
		if(! _self.isActive) {
			println("ERROR: " + chain.name + " HAS BEEN DEACTIVATED ELSEWHERE!")
			return;
		}
		
		for(AbstractFunction func : chain.enactedFunctions) {
			for(ElementExtension theExt : func.ownedExtensions) {
				if(theExt instanceof FunctionRuntimeData) {
					var FunctionRuntimeData rtData = theExt as FunctionRuntimeData
					rtData.deactivate();
				}
			}
		}		
		_self.isActive = false;
		
		println(chain.name  + " UNACTIVED!")
		
	}

}






