package org.gemoc.xcapella.dataflow.k3dsa

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionRuntimeData
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionalChainRuntimeData
import org.polarsys.capella.core.data.fa.AbstractFunction
import org.polarsys.capella.core.data.fa.FunctionalChain

import org.polarsys.kitalpha.emde.model.ElementExtension
import com.thalesgroup.trt.mde.vp.mode.mode.ModeMachine
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.MachineRuntimeData


import static extension org.gemoc.xcapella.dataflow.k3dsa.FunctionRuntimeDataAspect.*
import static extension org.gemoc.xcapella.dataflow.k3dsa.FunctionalChainRuntimeDataAspect.*

@Aspect(className=FunctionRuntimeData)
class FunctionRuntimeDataAspect {

	def public String activate(){
		var AbstractFunction func = _self.eContainer as AbstractFunction
		if(_self.isActive) {
			println("ERROR: " + func.name + " HAS BEEN ACTIVATED ELSEWHERE!")
			return "ERROR";	
		}
		_self.isActive = true;
		
		println(func.name  + " ACTIVE!")
	}
	def public String start() {
		var AbstractFunction func = _self.eContainer as AbstractFunction
		if(_self.isStarted) {
			println("ERROR: " + func.name + " HAS BEEN STARTED ELSEWHERE!")
			return "ERROR";	
		}
		if(! _self.isActive) {
			println("ERROR: " + func.name + " MUST BE ACTIVATED BEFORE STARTED!")
			return "ERROR";	
		}
		
		_self.isStarted = true;
		
		println(func.name  + " STARTED!")
	}
	
	def public String run() {
		var AbstractFunction func = _self.eContainer as AbstractFunction
		if(_self.isRunning) {
			println("ERROR: " + func.name + " HAS BEEN RUNNED ELSEWHERE!")
			return "ERROR";	
		}
		if(! _self.isStarted) {
			println("ERROR: " + func.name + " MUST BE STARTED BEFORE RUNNED!")
			return "ERROR";	
		}
		
		_self.isRunning = true;
		
		println(func.name  + " RUNNING!")
	}
	
	def public String stop() {
		var AbstractFunction func = _self.eContainer as AbstractFunction
		if(! _self.isStarted) {
			println("ERROR: " + func.name + " HAS BEEN STOPPED ELSEWHERE!")
			return "ERROR";	
		}
		_self.isRunning = false;
		_self.isStarted = false;
		
		println(func.name  + " STOPPED!")
	}
	
	def public String deactivate(){
		var AbstractFunction func = _self.eContainer as AbstractFunction
		if(! _self.isActive) {
			println("ERROR: " + func.name + " HAS BEEN DEACTIVATED ELSEWHERE!")
			return "ERROR";	
		}
		_self.isRunning = false;
		_self.isStarted = false;
		_self.isActive = false;
		
		println(func.name  + " NOT ACTIVE!")
	}

}

@Aspect(className=FunctionalChainRuntimeData)
class FunctionalChainRuntimeDataAspect {
	
	def public String activate(){
		var FunctionalChain chain = _self.eContainer as FunctionalChain
		
		if(_self.isActive) {
			println("ERROR: " + chain.name + " HAS BEEN ACTIVATED ELSEWHERE!")
			return "ERROR";
		}
	
		_self.isActive = true;
		
		println(chain.name  + " ACTIVE!")
	}
	
	def public String deactivate(){
		var FunctionalChain chain = _self.eContainer as FunctionalChain
		
		if(! _self.isActive) {
			println("ERROR: " + chain.name + " HAS BEEN DEACTIVATED ELSEWHERE!")
			return "ERROR";
		}
		
		_self.isActive = false;
		
		println(chain.name  + " NOT ACTIVE!")
		
	}

}

	


