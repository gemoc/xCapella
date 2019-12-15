import 'http://www.polarsys.org/capella/core/modeller/1.3.0'
import 'http://www.polarsys.org/capella/core/interaction/1.3.0' 
import 'http://www.polarsys.org/capella/core/ctx/1.3.0'
import 'http://www.polarsys.org/capella/core/common/1.3.0'
import 'http://www.eclipse.org/emf/2002/Ecore'
import 'http://www.polarsys.org/capella/core/cs/1.3.0'
import 'http://www.polarsys.org/capella/core/information/1.3.0'
import 'http://www.polarsys.org/capella/common/behavior/1.3.0'
import 'http://www.polarsys.org/capella/core/fa/1.3.0'

ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"
ECLimport  "platform:/resource/org.eclipse.gemoc.xcapella.mocc/mocc/lib4RT.ccslLib"
ECLimport  "platform:/resource/org.eclipse.gemoc.xcapella.mocc/mocc/temporalConstraints.moccml" 
ECLimport  "platform:/resource/org.eclipse.gemoc.xcapella.mocc/mocc/SMCubeMoC.ccslLib"
ECLimport  "platform:/resource/org.eclipse.gemoc.xcapella.mocc/mocc/SMCubeMoCC.moccml" 

 
package capellamodeller

endpackage
package fa 

endpackage

package interaction 	 
	context AbstractEnd
	 def : occurs : Event = self.getLabel()--.isOccurring() 
endpackage

package information 
	context ExchangeItem
		def if(self.exchangeMechanism = ExchangeMechanism::EVENT): occurs : Event = self.getLabel()
endpackage

package ctx
 
	context SystemFunction
  																	--we are reusing already existing EOperation to avoid using Kitalpha here
		def if (self.ownedFunctions->isEmpty()) : enacts : Event = self.getLabel()
		def if (self.ownedFunctions->isEmpty()) : unEnacts : Event = self.getLabel()
		def if (self.ownedFunctions->isEmpty()) : starts : Event = self.hasUnnamedLabel()
		def if (self.ownedFunctions->isEmpty()) : stops : Event = self.hasUnnamedLabel()
--	def if (self.ownedFunctions->isEmpty()) : isRunning : Event = self.toString()
	
		
	context System
--  	def if (self.ownedFunctionalAllocation.function.oclAsType(SystemFunction)->size() > 0): isWorking : Event = self
  		def : start : Event = self.getLabel()
   
	
--context SystemAnalysis
---- 	def : ms : Event = self

endpackage 


package capellacommon
	

	context Mode --only top level modes
		def if (self.oclAsType(ecore::EObject).eContainer().eContainer().oclIsKindOf(StateMachine)): entering : Event = self.getLabel() --.onEnter()
		def if (self.oclAsType(ecore::EObject).eContainer().eContainer().oclIsKindOf(StateMachine)): leaving : Event = self.toString() --ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::ModeRuntimeData))->first().oclAsType(ModeSimulation::ModeRuntimeData).onLeave()
     
	context StateMachine
		def : start : Event = self.getLabel() --init()

	context StateTransition
		def if (self.oclAsType(ecore::EObject).eContainer().eContainer().oclIsKindOf(StateMachine)): fire : Event = self.getLabel() -- ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::TransitionRuntimeData))->first().oclAsType(ModeSimulation::TransitionRuntimeData).fire()

	context StateTransition 
	
	 
	--first, the 2 cases with no JOIN
	--case 1: guard and trigger not null, NO JOIN
		inv TAGshare: --actually trigger only
		let triggerIsShare : Boolean = self.oclAsType(ecore::EObject).eContainer().eContainer().oclAsType(capellacommon::StateMachine).ownedRegions.ownedTransitions->select(t | t.triggers->size() > 0 and t.triggers->first() <> null and t.triggers->first() = self.triggers->first() )->size() > 0 in
			( self.oclAsType(ecore::EObject).eContainer().eContainer().oclIsKindOf(StateMachine)
			  and self.triggers->size() > 0
			  and self.source.oclIsKindOf(Mode)
			  and self.target.oclIsKindOf(Mode)
			  and triggerIsShare
			) implies
		 	(Relation TriggerOnlyTransition(
		 							self.source.oclAsType(Mode).entering,
		 							self.fire, --triggers->first().oclAsType(information::ExchangeItem).occurs,
		 							self.source.oclAsType(Mode).leaving,
		 							self.fire
		 	)) 
		 	
		inv TAGsNotSare: --actually trigger only
		let triggerIsShare : Boolean = self.oclAsType(ecore::EObject).eContainer().eContainer().oclAsType(capellacommon::StateMachine).ownedRegions.ownedTransitions->select(t | t.triggers->size() > 0 and t.triggers->first() <> null and t.triggers->first() = self.triggers->first() )->size() > 0 in
			( self.oclAsType(ecore::EObject).eContainer().eContainer().oclIsKindOf(StateMachine)
			  and self.triggers->size() > 0
			  and self.source.oclIsKindOf(Mode)
			  and self.target.oclIsKindOf(Mode)
			  and triggerIsShare
			) implies
		 	(Relation TriggerOnlyTransition(
		 							self.source.oclAsType(Mode).entering,
		 							self.triggers->first().oclAsType(information::ExchangeItem).occurs,
		 							self.source.oclAsType(Mode).leaving,
		 							self.fire
		 	)) 
		 


	context Mode
		inv enterOnceBeforeToLeave:
			(self.oclAsType(ecore::EObject).eContainer().eContainer().oclIsKindOf(StateMachine)) implies
			(Relation WeakAlternates(self.entering, self.leaving))  
		
		inv firingATransitionMeansLeavingState:
			(self.oclAsType(ecore::EObject).eContainer().eContainer().oclIsKindOf(StateMachine)
			  and self.oclAsType(ecore::EObject).eContainer().oclAsType(Region).ownedTransitions-> select (t | t.source = self)->size() > 0
			) implies
			let allFiredoutgoingTransition : Event = Expression Union(self.oclAsType(ecore::EObject).eContainer().oclAsType(Region).ownedTransitions-> select (t | t.source = self).fire) in
			Relation Coincides(allFiredoutgoingTransition, self.leaving)
			

		inv stateEntering1:
			(self.oclAsType(ecore::EObject).eContainer().eContainer().oclIsKindOf(StateMachine)
			  and not (self.oclIsTypeOf(InitialPseudoState)) 
			  and self.oclAsType(ecore::EObject).eContainer().oclAsType(Region).ownedTransitions-> select (t | t.target = self)->size() > 0) implies
			let allInputTransition : Event = Expression Union(self.oclAsType(ecore::EObject).eContainer().oclAsType(Region).ownedTransitions-> select (t | t.target = self).fire) in
			Relation Alternates(allInputTransition,self.entering)
			

		inv oneTransitionAtATime:
			(self.oclAsType(ecore::EObject).eContainer().eContainer().oclIsKindOf(StateMachine)
			  and self.oclAsType(ecore::EObject).eContainer().oclAsType(Region).ownedTransitions-> select (t | t.source = self)->size() > 1
			) implies
			(Relation Exclusion(self.oclAsType(ecore::EObject).eContainer().oclAsType(Region).ownedTransitions-> select (t | t.source = self).fire))
			

	context StateMachine
--		inv oneModeAtATime:
--			(Relation Exclusion(self.ownedRegions.ownedStates->select(s | (s).oclIsKindOf(Mode)).oclAsType(Mode).entering))
		
		
		
		inv firstIsInitialState:
		(self.ownedRegions->first().ownedTransitions->select(t | t.source =self.ownedRegions->first().ownedStates->select(e | e.oclIsKindOf(InitialPseudoState))->first())->size() > 0) 
			implies
			(Relation Coincides(self.start, self.ownedRegions->first().ownedTransitions->select(t | t.source =self.ownedRegions->first().ownedStates->select(e | e.oclIsKindOf(InitialPseudoState))->first())->first().fire)) 
		
			
		inv firstOnlyOnce:
			let onlyOneFirst : Event = Expression OneTickAndNoMore(self.start) in
			Relation Coincides(self.start,onlyOneFirst)		
endpackage


package ctx 
	context System	
		
		inv startTimedSystemBeforeAllStartComponent:
			(self.ownedStateMachines->size() > 0) implies
			let allStartMachine : Event = Expression Union(self.ownedStateMachines.start) in
			Relation Coincides(self.start, allStartMachine)
			
		inv allStartsTogether:
			(self.ownedStateMachines->size() > 1) implies
			(Relation Coincides(self.ownedStateMachines.start))
		
		inv firstOnlyOnce:
			let onlyOneFirst : Event = Expression OneTickAndNoMore(self.start) in
			Relation Coincides(self.start,onlyOneFirst)
endpackage



package information

	context ExchangeItem
		def : raisingTransitions : Collection(capellacommon::StateTransition) = 
				self.oclAsType(ecore::EObject)->closure(eo |if not eo.oclIsKindOf(ctx::SystemAnalysis) then eo.eContainer() else null endif)->select(s | s.oclIsKindOf(ctx::SystemAnalysis))->asSequence()->first().oclAsType(ctx::SystemAnalysis)
				.oclAsType(ecore::EObject)->closure(e | e.eContents().oclAsType(ecore::EObject))->select(eo |eo.oclIsKindOf(capellacommon::StateTransition))->select(t | t.oclAsType(capellacommon::StateTransition).effect->exists(f | f = self)).oclAsType(capellacommon::StateTransition)
 
		inv occursWhenFireIfInEffects:
		(raisingTransitions->size() > 0 and self.exchangeMechanism = ExchangeMechanism::EVENT) implies
		(let raisingTransitionFiring : Event = Expression Union(raisingTransitions.fire) in
			Relation Coincides(self.occurs, raisingTransitionFiring)
		)
		
		def : raisingMessages : Collection(interaction::SequenceMessage) =
			self.oclAsType(ecore::EObject)->closure(eo |if not eo.oclIsKindOf(ctx::SystemAnalysis) then eo.eContainer() else null endif)->select(s | s.oclIsKindOf(ctx::SystemAnalysis))->asSequence()->first().oclAsType(ctx::SystemAnalysis)
				.oclAsType(ecore::EObject)->closure(e | e.eContents().oclAsType(ecore::EObject))->select(eo |eo.oclIsKindOf(interaction::SequenceMessage)).oclAsType(interaction::SequenceMessage)->select(e | e.oclIsKindOf(interaction::SequenceMessage) and e.oclAsType(interaction::SequenceMessage).exchangedItems->size() > 0 and e.oclAsType(interaction::SequenceMessage).exchangedItems->first()=self ).oclAsType(interaction::SequenceMessage)
			
		
		inv occursWhenAnyMEssageSent:
			(raisingMessages->size() > 1) implies
			let allRelatedMessages : Event = Expression Union(raisingMessages.sendingEnd.occurs) in
			(Relation Coincides(allRelatedMessages, self.occurs))
			
		inv ifExchangeItemItOccurs:
			(raisingMessages->size() = 1) implies
			(Relation Coincides(raisingMessages->asSequence()->first().sendingEnd.occurs, self.occurs))
			
--		inv ifExchangeItemItOccurs2:
--			(raisingMessages->size() = 1) implies
--			(Relation Alternates(self.occurs, raisingMessages->asSequence()->first().receivingEnd.occurs))
 
 
endpackage



 
package interaction 

	context InstanceRole
		inv endsInOrder:
			(Relation Causes(self.abstractEnds.occurs)) 
			
		inv nonRentrantSCenario:
			(self.abstractEnds->size() > 1) implies
			(Relation WeakAlternates(self.abstractEnds->first().occurs, self.abstractEnds->last().occurs))
			
	context SequenceMessage	
		inv instantaneousReply:
			(self.kind = MessageKind::REPLY) implies
			(Relation Coincides(self.sendingEnd.occurs,self.receivingEnd.occurs))
			
		inv causalityCall:
			(self.kind <> MessageKind::REPLY) implies
			(Relation Coincides(self.sendingEnd.occurs,self.receivingEnd.occurs))

		inv forceORderToEaseUnderstanding:
			(self.sendingEnd.covered <> self.receivingEnd.covered and self.sendingEnd.covered.abstractEnds->size() > (self.sendingEnd.covered.abstractEnds->indexOf(self.sendingEnd)+1)) implies
			(Relation Precedes(self.receivingEnd.occurs,self.sendingEnd.covered.abstractEnds->at(self.sendingEnd.covered.abstractEnds->indexOf(self.sendingEnd)+1).oclAsType(MessageEnd).occurs ))


	
	context Execution
        def : correspondingFunctions : Collection(ctx::SystemFunction) = self.oclAsType(ecore::EObject)->closure(eo |if not eo.oclIsKindOf(ctx::SystemAnalysis) then eo.eContainer() else null endif)->select(s | s.oclIsKindOf(ctx::SystemAnalysis))->asSequence()->first().oclAsType(ctx::SystemAnalysis)
        .oclAsType(ecore::EObject)->closure(e | e.eContents().oclAsType(ecore::EObject))->select(eo |eo.oclIsKindOf(ctx::SystemFunction)).oclAsType(ctx::SystemFunction)->select(sf | sf.name = self.name )
	
		inv instantaneousIfNoFunctions:
			(correspondingFunctions->size() = 0) implies
				(Relation Coincides(self.start.oclAsType(AbstractEnd).occurs, self.finish.oclAsType(AbstractEnd).occurs))
        
	
		inv startsWhenEndOccurs:
			(correspondingFunctions->size() = 1) implies
				(Relation Coincides(self.start.oclAsType(AbstractEnd).occurs, correspondingFunctions->asSequence()->first().starts))
        inv stopsWhenEndOccurs:
			(correspondingFunctions->size() = 1) implies
				(Relation Coincides(self.finish.oclAsType(AbstractEnd).occurs, correspondingFunctions->asSequence()->first().stops))
 
 
 		--associatedMessage.sendingEnd.covered <> associatedMessage.receivingEnd.covered and 
        inv endsBeforeNextmessageSending:
            let associatedMessage : SequenceMessage = self.start.oclAsType(ecore::EObject).eCrossReferences()->select(cr |cr.oclIsKindOf(interaction::SequenceMessage)).oclAsType(interaction::SequenceMessage)->asSequence()->first() in
            (associatedMessage.sendingEnd.covered <> associatedMessage.receivingEnd.covered and associatedMessage.sendingEnd.covered.abstractEnds->size() > (associatedMessage.sendingEnd.covered.abstractEnds->indexOf(associatedMessage.sendingEnd)+1)) implies
            (Relation Precedes(self.finish.oclAsType(AbstractEnd).occurs,associatedMessage.sendingEnd.covered.abstractEnds->at(associatedMessage.sendingEnd.covered.abstractEnds->indexOf(associatedMessage.sendingEnd)+1).oclAsType(MessageEnd).occurs ))
 
	    inv endsBeforeNextmessageSending2:
            let associatedMessage : SequenceMessage = self.start.oclAsType(ecore::EObject).eCrossReferences()->select(cr |cr.oclIsKindOf(interaction::SequenceMessage)).oclAsType(interaction::SequenceMessage)->asSequence()->first() in
            (associatedMessage.sendingEnd.covered = associatedMessage.receivingEnd.covered and self.covered.abstractEnds->size() > (self.covered.abstractEnds->indexOf(self.finish)+1)) implies
            (Relation Precedes(self.finish.oclAsType(AbstractEnd).occurs, self.covered.abstractEnds->at(self.covered.abstractEnds->indexOf(self.finish)+1).oclAsType(AbstractEnd).occurs ))
 
 

endpackage 

package ctx 

  context SystemFunction
  	def : theSystem : SystemAnalysis = self.oclAsType(ecore::EObject)->closure(eo |if not eo.oclIsKindOf(SystemAnalysis) then eo.eContainer() else null endif)->select(s | s.oclIsKindOf(SystemAnalysis))->asSequence()->first().oclAsType(SystemAnalysis)
    def : allRelatedModes : Collection(capellacommon::Mode) = 
    		self.oclAsType(ecore::EObject)->closure(eo |if not eo.oclIsKindOf(SystemAnalysis) then eo.eContainer() else null endif)->select(s | s.oclIsKindOf(SystemAnalysis))->asSequence()->first().oclAsType(SystemAnalysis)
    		.oclAsType(ecore::EObject)->closure(e | e.eContents().oclAsType(ecore::EObject))->select(eo |eo.oclIsKindOf(fa::FunctionalChain))->select(m | m.oclAsType(fa::FunctionalChain).enactedFunctions->exists(f | f = self)).oclAsType(fa::FunctionalChain).availableInStates.oclAsType(capellacommon::Mode)
    
    
	inv taskTaskInv: 
		(self.ownedFunctions->isEmpty()) implies
		(Relation DesactivableAlternates(self.starts,self.stops, self.enacts, self.unEnacts))
	

	inv EnactedByAssociatedModeEntering:
		((allRelatedModes->size() > 0) implies 
		let allAssociatedModeEntering : Event = Expression Union(allRelatedModes.entering) in
		Relation Coincides(self.enacts, allAssociatedModeEntering))

	inv UnEnactedByAssociatedModeLeaving:
		((allRelatedModes->size() > 0)  implies 
		let allAssociatedModeLeaving : Event = Expression Union(allRelatedModes.leaving) in
		Relation Coincides(self.unEnacts, allAssociatedModeLeaving))
		
		
endpackage 

package fa 
  context FunctionalExchange
 	def : allRelatedModes : Collection(capellacommon::Mode) = 
    	self.oclAsType(ecore::EObject)->closure(eo |if not eo.oclIsKindOf(ctx::SystemAnalysis) then eo.eContainer() else null endif)->select(s | s.oclIsKindOf(ctx::SystemAnalysis))->asSequence()->first().oclAsType(ctx::SystemAnalysis)
    	.oclAsType(ecore::EObject)->closure(e | e.eContents().oclAsType(ecore::EObject))->select(eo |eo.oclIsKindOf(fa::FunctionalChain))->select(m | m.oclAsType(fa::FunctionalChain).involvedFunctionalExchanges->exists(f | f = self) or self = m.oclAsType(fa::FunctionalChain).firstFunctionalChainInvolvements.involvedElement->first()).oclAsType(fa::FunctionalChain).availableInStates.oclAsType(capellacommon::Mode)
 
  	inv ConditionalAlternatesRelationFromFunctionalExchanges:
  		(allRelatedModes->size() > 0 and self.source.oclAsType(ecore::EObject).eContainer().oclIsKindOf(ctx::SystemFunction)) implies
  		let relatedModeEntering : Event = Expression Union(allRelatedModes.entering) in
  		let relatedModeLeaving : Event = Expression Union(allRelatedModes.leaving) in
  		Relation AlternatesOrFree(
  			self.source.oclAsType(ecore::EObject).eContainer().oclAsType(ctx::SystemFunction).stops,
  			self.target.oclAsType(ecore::EObject).eContainer().oclAsType(ctx::SystemFunction).starts,
  			relatedModeEntering,
  			relatedModeLeaving
  		)
  		
  	inv AlternatesRelationFromFunctionalExchanges:
  		(allRelatedModes->size() = 0 and self.source.oclAsType(ecore::EObject).eContainer().oclIsKindOf(ctx::SystemFunction)) implies
  		(Relation Alternates(
  			self.source.oclAsType(ecore::EObject).eContainer().oclAsType(ctx::SystemFunction).stops,
  			self.target.oclAsType(ecore::EObject).eContainer().oclAsType(ctx::SystemFunction).starts
  		))	
  	inv eventExchangeItemCanOccurOnlyInDedicatedContext:
			(self.exchangedItems->size() > 0 and self.exchangedItems->first().exchangeMechanism = ExchangeMechanism::EVENT) implies
			(Relation Causes(
						self.exchangedItems->first().occurs,
						self.target.oclAsType(ecore::EObject).eContainer().oclAsType(ctx::SystemFunction).starts
			)) 
			
	inv eventExchangeItemCanOccurOnlyInDedicatedContext2:
			(self.exchangedItems->size() > 0 and self.exchangedItems->first().exchangeMechanism = ExchangeMechanism::EVENT) implies
			(Relation Coincides(
						self.source.oclAsType(ecore::EObject).eContainer().oclAsType(ctx::SystemFunction).stops,
						self.exchangedItems->first().occurs
			)) 
		
   context FunctionOutputPort
   	 inv outputPortsWithEventCanOccurDuringFunctionExecution:
			(self.outgoingExchangeItems->size() > 0 and self.outgoingExchangeItems->first().exchangeMechanism = ExchangeMechanism::EVENT) implies
			let associatedStateEntering : Event = Expression Union(self.oclAsType(ecore::EObject).eContainer().eContainer().oclAsType(ctx::SystemFunction).ownedFunctionalChains->select(fc|fc.oclAsType(fa::FunctionalChain).enactedFunctions->select(ef | ef = self.oclAsType(ecore::EObject).eContainer())->size() > 0).availableInStates.oclAsType(capellacommon::Mode).entering) in
			let associatedStateLeaving : Event = Expression Union(self.oclAsType(ecore::EObject).eContainer().eContainer().oclAsType(ctx::SystemFunction).ownedFunctionalChains->select(fc|fc.oclAsType(fa::FunctionalChain).enactedFunctions->select(ef | ef = self.oclAsType(ecore::EObject).eContainer())->size() > 0).availableInStates.oclAsType(capellacommon::Mode).leaving) in
			(Relation ContextualEvent(self.outgoingExchangeItems->first().occurs,
								self.oclAsType(ecore::EObject).eContainer().oclAsType(ctx::SystemFunction).starts,
								self.oclAsType(ecore::EObject).eContainer().oclAsType(ctx::SystemFunction).stops,
								associatedStateEntering,
								associatedStateLeaving
			))
   
   context FunctionalChain
  		
  	 inv globalAlternatesOnFC: 
  	 	(self.involvedElements->first().oclIsKindOf(FunctionalExchange)) implies
  		(Relation AlternatesOrFree(
  			self.involvedElements->first().oclAsType(FunctionalExchange).source.oclAsType(ecore::EObject).eContainer().oclAsType(ctx::SystemFunction).starts,
  			self.firstFunctionalChainInvolvements->last().involved.oclAsType(ctx::SystemFunction).stops,
  			self.availableInStates.oclAsType(capellacommon::Mode)->first().entering,
  			self.availableInStates.oclAsType(capellacommon::Mode)->first().leaving
  		))
  		
  	inv globalAlternatesOnFC_SF:
  	(self.involvedElements->first().oclIsKindOf(ctx::SystemFunction)) implies
  		(Relation AlternatesOrFree(
  			self.involvedElements->first().oclAsType(ctx::SystemFunction).starts,
  			self.firstFunctionalChainInvolvements->last().involved.oclAsType(ctx::SystemFunction).stops,
  			self.availableInStates.oclAsType(capellacommon::Mode)->first().entering,
  			self.availableInStates.oclAsType(capellacommon::Mode)->first().leaving
  		))
  
endpackage

			
			
