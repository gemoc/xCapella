package org.gemoc.xcapella.dataflow.k3dsa

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.polarsys.capella.core.data.fa.AbstractFunction
import org.polarsys.capella.core.data.fa.FunctionalChain

import static extension org.gemoc.xcapella.dataflow.k3dsa.FunctionAspect.*
import static extension org.gemoc.xcapella.dataflow.k3dsa.FunctionalChainAspect.*



/**
 context AbstractFunction
	def if (self.ownedFunctions->isEmpty()) : makeactive : Event = self.getFullLabel() --dirty reuse of existing functions
	def if (self.ownedFunctions->isEmpty()) : start : Event = self.getLabel() --dirty reuse of existing functions
	def if (self.ownedFunctions->isEmpty()) : run : Event = self.destroy() --dirty reuse of existing functions
	def if (self.ownedFunctions->isEmpty()) : stop : Event = self.hasUnnamedLabel() --dirty reuse of existing functions
	def if (self.ownedFunctions->isEmpty()) : makeinactive : Event = self.toString() --dirty reuse of existing functions

context FunctionalChain
	def : activate : Event = self.getLabel() --dirty reuse of existing functions
	def : deactivate : Event = self.destroy() --dirty reuse of existing functions
 
 */

@Aspect(className=AbstractFunction)
class FunctionAspect {

	public var boolean isActive = false;
	public boolean isStarted= false;
	public boolean isReady= false;
	public boolean isSuspended= false;
	public boolean isStopped= false;
	public boolean isRunning= false;

	def String getFullLabel(){ //makeActive
		var AbstractFunction func = _self.eContainer as AbstractFunction
		if(_self.isActive) {
			println("ERROR: " + func.name + " HAS BEEN ACTIVATED ELSEWHERE!")
			return "ERROR";	
		}
		_self.isActive = true;
		
		println(func.name  + " ACTIVE!")
	}
	def String getLabel() { //start 
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
	
	def String destroy() { //run
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
	
	def String hasUnnamedLabel() { //stop
		var AbstractFunction func = _self.eContainer as AbstractFunction
		if(! _self.isStarted) {
			println("ERROR: " + func.name + " HAS BEEN STOPPED ELSEWHERE!")
			return "ERROR";	
		}
		_self.isRunning = false;
		_self.isStarted = false;
		
		println(func.name  + " STOPPED!")
	}
	
	def String toString(){ //makeInactive
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

@Aspect(className=FunctionalChain)
class FunctionalChainAspect {
	public boolean isActive= false;
	def String getLabel(){ //activate
		var FunctionalChain chain = _self.eContainer as FunctionalChain
		
		if(_self.isActive) {
			println("ERROR: " + chain.name + " HAS BEEN ACTIVATED ELSEWHERE!")
			return "ERROR";
		}
	
		_self.isActive = true;
		
		println(chain.name  + " ACTIVE!")
	}
	
	def String destroy(){ //make inactive
		var FunctionalChain chain = _self.eContainer as FunctionalChain
		
		if(! _self.isActive) {
			println("ERROR: " + chain.name + " HAS BEEN DEACTIVATED ELSEWHERE!")
			return "ERROR";
		}
		
		_self.isActive = false;
		
		println(chain.name  + " NOT ACTIVE!")
		
	}

}

	


