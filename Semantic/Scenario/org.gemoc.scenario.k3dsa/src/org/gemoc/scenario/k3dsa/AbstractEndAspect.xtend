package org.gemoc.scenario.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod


import static extension org.gemoc.scenario.k3dsa.AbstractEndAspect.*
//import static extension org.gemoc.scenario.k3dsa.MessageEndAspect.*
//import static extension org.gemoc.scenario.k3dsa.ExecutionEndAspect.*
import org.polarsys.capella.core.data.interaction.AbstractEnd
import org.polarsys.capella.core.data.interaction.MessageEnd
import org.polarsys.capella.core.data.interaction.ExecutionEnd
import org.polarsys.capella.core.data.interaction.Execution

/*
 * 
 * Simple Ecore extension allowing to annotate all classes of an ecore model by adding 
 * an annotation containing the list of all super classes (flat)  
 */
 
 
@Aspect(className=AbstractEnd)
class AbstractEndAspect {
	private int occ= 0;
	public def String getLabel(){
		println(_self.name+" is occurring");
		if (_self instanceof ExecutionEnd){
			_self.occ =_self.occ + 1
			_self.execution.review = "occurred !" +_self.occ
		}
		if (_self instanceof MessageEnd){
			_self.occ =_self.occ + 1
			_self.message.review = "occurred !" +_self.occ
		}
		return _self.name; 
	}
}

@Aspect(className=Execution)
class ExecutionAspect {
	private boolean isStarted= false;
	public def String getFullLabel(){
		if (_self.isStarted){
			println(_self.name+" is STOPPED");
			_self.isStarted = false
			_self.review = ""
		}else{
			println(_self.name+" is STARTED");
			_self.isStarted = true
			_self.review = "started"	
			
		}
//		_self.covered.name = "toto"
		return _self.name; 
	}
}



//
//@Aspect(className=MessageEnd)
//class MessageEndAspect {
//	@Override
//	public def String getLabel(){
//		println(_self.name+" is occurring 2");
////		if (_self.message.sendingEnd == _self){
////			_self.message.isSending = true
////		}
////		if (_self.message.receivingEnd == _self){
////			_self.message.isSending = false
////		}
//		return "yop";
//	}
//}
//
////@Aspect(className=MixEnd)
////class MixEndAspect {
////	
////	public def void isOccurring(){
////		println(_self.name+" is occurring 3");
////		return;
////	}
////}  
//
//@Aspect(className=ExecutionEnd)
//class ExecutionEndAspect {
//	@Override
//	public def String getLabel(){
//		_self.execution.review = "occurred !"
//		println(_self.name+" is occurring 4");
////		if (_self.execution.start == _self){
////			_self.execution.isExecuting = true
////		}
////		if (_self.execution.end == _self){
////			_self.execution.isExecuting = false
////		}
//		return "yop";
//	}
//}
