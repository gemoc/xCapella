package org.eclipse.gemoc.xcapella.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod


//import static extension org.gemoc.scenario.k3dsa.MessageEndAspect.*
//import static extension org.gemoc.scenario.k3dsa.ExecutionEndAspect.*
import org.polarsys.capella.core.data.interaction.AbstractEnd
import org.polarsys.capella.core.data.interaction.MessageEnd
import org.polarsys.capella.core.data.interaction.Execution
import org.polarsys.capella.core.data.ctx.SystemFunction
import org.polarsys.capella.core.data.interaction.Scenario
import org.polarsys.capella.core.data.interaction.TimeLapse
import static extension org.eclipse.gemoc.xcapella.k3dsa.AbstractEndAspect.*
import static extension org.eclipse.gemoc.xcapella.k3dsa.TimeLapseAspect.*

/*
 * 
 * Simple Ecore extension allowing to annotate all classes of an ecore model by adding 
 * an annotation containing the list of all super classes (flat)  
 */
 
 
@Aspect(className=AbstractEnd)
class AbstractEndAspect {
	public Integer occurrenceNumber= 0;
	public Boolean occurred = false
	def String getLabel(){
		if(_self instanceof MessageEnd)
		{
			if(_self.message.sendingEnd == _self){
				_self.occurrenceNumber =_self.occurrenceNumber + 1
				_self.message.review = "occurred" +_self.occurrenceNumber
				_self.occurred = true
			}else{
				_self.message.review = ""
				_self.occurred = false
			}
		}
		
		(_self.eContainer as Scenario).ownedTimeLapses.forEach[TimeLapse tl | if (tl instanceof Execution){if (tl.covered == _self.covered && tl.start == _self){tl.isExecuting = true}} ]
		(_self.eContainer as Scenario).ownedTimeLapses.forEach[TimeLapse tl | if (tl instanceof Execution){if (tl.covered == _self.covered && tl.finish == _self){tl.isExecuting = false}} ]
		
		println(_self.name+" is occurring");
		return _self.name; 
	}
}

@Aspect(className=TimeLapse)
class TimeLapseAspect{
	public Boolean isExecuting = false
}

@Aspect(className=Execution)
class ExecutionAspect {
//	private Boolean isStarted= false;
//	private Boolean isReady= false;
//	private Boolean isSuspended= false;
//	private Boolean isStopped= false;
//	
//	public def String getFullLabel(){
//		if (_self.isStarted){
//			println(_self.name+" is STOPPED");
//			_self.isStarted = false
//			_self.review = ""
//		}else{
//			println(_self.name+" is STARTED");
//			_self.isStarted = true
//			_self.review = "started"	
//			
//		}
//		return _self.name; 
//	}
//	
	
}

//																--we are reusing already existing EOperation to avoid using Kitalpha here
//	def if (self.ownedFunctions->isEmpty()) : enacts : Event = self.getLabel()
//	def if (self.ownedFunctions->isEmpty()) : unEnacts : Event = self.getLabel()
//	def if (self.ownedFunctions->isEmpty()) : starts : Event = self.hasUnnamedLabel()
//	def if (self.ownedFunctions->isEmpty()) : stops : Event = self.hasUnnamedLabel()
//--	def if (self.ownedFunctions->isEmpty()) : isRunning : Event = self.toString()

@Aspect(className=SystemFunction)
class SystemFunctionAspect {
	public Boolean isStarted= false;
	public Boolean isEnacted = false;
	public Integer runCycles = 0;
	
	def Boolean hasUnnamedLabel(){	//does both start and stop since no more EOperation were available. otherwise kitalpha is required	
		if (_self.isStarted){
			println(_self.name+" is STOPPED");
			_self.isStarted = false
			_self.runCycles = 0;
		}else{
			println(_self.name+" is STARTED");
			_self.isStarted = true
		}
		return false; 
	}
	
	def String getLabel(){  //does both activated and isRunning
		if (_self.isEnacted){
			println(_self.name+" is UNenacted");
			_self.isEnacted = false;
		}else{
			_self.isEnacted = true;
			println(_self.name+" is enacted"); 
		}
		return _self.name; 
	}
	
//	def String getFullLabel(){ //suspended
//		_self.isSuspended = true;
//		_self.isStarted = false;
//		println(_self.name+" is suspended");
//		return _self.name; 
//	}
//
//	def String destroy(){ //unsuspended
//		_self.isSuspended = false;
//		_self.isStarted = true;
//		println(_self.name+" is resumed");
//		return _self.name; 
//	}	
		
		
	def String toString(){ //isRunning
		_self.runCycles= _self.runCycles+1;
		println(_self.name+" ran for "+_self.runCycles+ " cycles"); 	
		return _self.name; 
	}	
}

