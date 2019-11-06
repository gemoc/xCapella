package org.eclipse.gemoc.xcapella.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod


import static extension org.eclipse.gemoc.xcapella.k3dsa.AbstractEndAspect.*
//import static extension org.gemoc.scenario.k3dsa.MessageEndAspect.*
//import static extension org.gemoc.scenario.k3dsa.ExecutionEndAspect.*
import org.polarsys.capella.core.data.interaction.AbstractEnd
import org.polarsys.capella.core.data.interaction.MessageEnd
import org.polarsys.capella.core.data.interaction.Execution
import org.polarsys.capella.core.data.ctx.SystemFunction
import org.polarsys.capella.core.data.interaction.Scenario
import org.polarsys.capella.core.data.interaction.TimeLapse

/*
 * 
 * Simple Ecore extension allowing to annotate all classes of an ecore model by adding 
 * an annotation containing the list of all super classes (flat)  
 */
 
 
@Aspect(className=AbstractEnd)
class AbstractEndAspect {
	public int occ= 0;
	def String getLabel(){
		if(_self instanceof MessageEnd)
		{
			if(_self.message.sendingEnd == _self){
				_self.occ =_self.occ + 1
				_self.message.review = "occurred" +_self.occ
			}else{
				_self.message.review = ""
			}
		}
		
		(_self.eContainer as Scenario).ownedTimeLapses.forEach[TimeLapse tl | if (tl instanceof Execution){if (tl.covered == _self.covered && tl.start == _self){tl.review = "started"}} ]
		(_self.eContainer as Scenario).ownedTimeLapses.forEach[TimeLapse tl | if (tl instanceof Execution){if (tl.covered == _self.covered && tl.finish == _self){tl.review = ""}} ]
		
		println(_self.name+" is occurring");
//		if (_self instanceof ExecutionEnd){
//			if(_self.execution.start == _self){
//				_self.occ =_self.occ + 1
//				_self.execution.review = "occurred" +_self.occ
//			}else{
//				_self.execution.review = ""
//			}
//		}
		return _self.name; 
	}
}

@Aspect(className=Execution)
class ExecutionAspect {
//	private boolean isStarted= false;
//	private boolean isReady= false;
//	private boolean isSuspended= false;
//	private boolean isStopped= false;
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

@Aspect(className=SystemFunction)
class SystemFunctionAspect {
	public boolean isStarted= false;
	public boolean isReady= false;
	public boolean isSuspended= false;
	public boolean isStopped= false;
	public int runCycles = 0;
	
	def Boolean hasUnnamedLabel(){
		if (_self.isStarted && ! _self.isSuspended){
			println(_self.name+" is STOPPED");
			_self.isStarted = false
			_self.isReady =false;
			_self.isSuspended =false;
			_self.isStopped = true
			_self.runCycles = 0;
			_self.review = "   "
		}else{
			println(_self.name+" is STARTED");
			_self.isStarted = true
			if (_self.review !== null && ! _self.isSuspended){
				_self.review = " started"		
			}		
			
		}
		return false; 
	}
	
	def String getLabel(){
		if (_self.isReady == false){
			println(_self.name+" is activated");
			if (_self.review === null){
				_self.review = " activated"
			}
			else if (_self.review.length() <=3){
				_self.review = " activated"		
			}
			_self.isReady = true;
		}else{
				//use for isRunning too...
			_self.runCycles= _self.runCycles+1;
			println(_self.name+" ran for "+_self.runCycles+ " cycles"); 
			_self.description = _self.runCycles.toString;
		}
		return _self.name; 
	}
	
	def String getFullLabel(){
		_self.isSuspended = true;
		_self.isStarted = false;
		println(_self.name+" is suspended");
		_self.review =" suspended"
		return _self.name; 
	}

	def String destroy(){
		_self.isSuspended = false;
		println(_self.name+" is resumed");
		_self.review = "" //go back to activated state
		return _self.name; 
	}	
		
		
//		public def String toString(){
//			_self.runCycles= _self.runCycles+1;
//			println(_self.name+" ran for "+_self.runCycles+ " cycles"); 
//			_self.description = _self.runCycles.toString;
//			return _self.name; 
//		}	
}

