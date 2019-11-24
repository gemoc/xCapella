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

package ctx

  context SystemFunction
  																	--we are reusing already existing EOperation to avoid using Kitalpha here
	def if (self.ownedFunctions->isEmpty()) : activated : Event = self.getLabel()
	def if (self.ownedFunctions->isEmpty()) : started : Event = self.hasUnnamedLabel()
	def if (self.ownedFunctions->isEmpty()) : terminated : Event = self.hasUnnamedLabel()
	def if (self.ownedFunctions->isEmpty()) : suspended : Event = self.getFullLabel()
	def if (self.ownedFunctions->isEmpty()) : unsuspend : Event = self.destroy()
	def if (self.ownedFunctions->isEmpty()) : isRunning : Event = self.getLabel()
	def if (self.ownedFunctions->isEmpty()) : hasBeenElected : Event = self.toString()
	
		
context System
  	def if (self.ownedFunctionalAllocation.function.oclAsType(SystemFunction)->size() > 0): isWorking : Event = self
  	def : start : Event = self
  
context SystemAnalysis
 	def : ms : Event = self
endpackage


package capellacommon 
	
	context ChangeEvent
		def : occurs : Event = self

	context Mode --only top level modes
		def if (self.oclAsType(ecore::EObject).eContainer().eContainer().oclIsKindOf(StateMachine)): entering : Event = self.toString() --.onEnter()
		def if (self.oclAsType(ecore::EObject).eContainer().eContainer().oclIsKindOf(StateMachine)): leaving : Event = self.toString() --ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::ModeRuntimeData))->first().oclAsType(ModeSimulation::ModeRuntimeData).onLeave()
     
	context StateMachine
		def : start : Event = self.toString() --init()
		def : anyEventOrTime :Event = self
--		def : localClockTicks : Event = self.getLabel() --ticks()

	context StateTransition
		def if (self.oclAsType(ecore::EObject).eContainer().eContainer().oclIsKindOf(StateMachine)): fire : Event = self.toString() -- ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::TransitionRuntimeData))->first().oclAsType(ModeSimulation::TransitionRuntimeData).fire()
--		def if (self.oclAsType(ecore::EObject).eContainer().eContainer().oclIsKindOf(StateMachine)): reset : Event = self --.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::TransitionRuntimeData))->first().oclAsType(ModeSimulation::TransitionRuntimeData).reset()
--		def	if (self.oclAsType(ecore::EObject).eContainer().eContainer().oclIsKindOf(StateMachine) and not self.source.oclIsKindOf(InitialPseudoState)):evaluate : Event = self--.toString() [res] switch case (self.res = true) forbid self.evaluatedFalse until self.evaluatedTrue;
     									--					   case (self.res = false) forbid self.evaluatedTrue until self.evaluatedFalse;
--		def	if (self.oclAsType(ecore::EObject).eContainer().eContainer().oclIsKindOf(StateMachine) and not self.source.oclIsKindOf(InitialPseudoState)):evaluatedTrue : Event  = self
--		def	if (self.oclAsType(ecore::EObject).eContainer().eContainer().oclIsKindOf(StateMachine) and not self.source.oclIsKindOf(InitialPseudoState)):evaluatedFalse : Event = self 
		
	context StateTransition
	
	--first all reset are defined
--		inv reset_singleTransitionNoSuperState:
--			( self.oclAsType(ecore::EObject).eContainer().eContainer().oclIsKindOf(StateMachine)
--			  and self.source.outgoing->select(t | t <> self)->size() = 0
--			) implies
--			let doNotTickreset: Event = Expression  NoTick(self.fire) in --here we can put any clock, it is just need to construct an empty, non dying clock
--			Relation Coincides (self.reset, doNotTickreset)

--		inv reset_severalTransitionsNoSuperState:
--			(self.oclAsType(ecore::EObject).eContainer().eContainer().oclIsKindOf(StateMachine)
--			  and self.source.outgoing->select(t | t <> self)->size() > 0
--			) implies
--			let otherFireFromTheSameStateNOOSS: Event = Expression Union (self.source.outgoing->select(t | (t) <> self).fire) in
--			Relation Coincides (self.reset, otherFireFromTheSameStateNOOSS)

	
	--first, the 2 cases with no JOIN
	--case 1: guard and trigger not null, NO JOIN
		inv TAG: --actually trigger only
			( self.oclAsType(ecore::EObject).eContainer().eContainer().oclIsKindOf(StateMachine)
			  and self.triggers->size() > 0
			  and self.source.oclIsKindOf(Mode)
			  and self.target.oclIsKindOf(Mode)
			) implies
		 	(Relation TriggerOnlyTransition(
		 							self.source.oclAsType(Mode).entering,
		 							self.triggers->first().oclAsType(ChangeEvent).occurs,
		 							self.source.oclAsType(Mode).leaving,
		 							self.fire
		 	)) 
		 	
	 
	 --case 2: no trigger , NO JOIN
--	 	inv GO:
--			( self.oclAsType(ecore::EObject).eContainer().eContainer().oclIsKindOf(StateMachine)
--			  and self.triggers->size() = 0
--			  and self.source.oclIsKindOf(Mode)
--			  and self.target.oclIsKindOf(Mode)
--			) implies
--		 	(Relation TriggerAndGuardedTransition(
--		 							self.source.oclAsType(Mode).entering,
--		 							self.oclAsType(ecore::EObject).eContainer().eContainer().oclAsType(StateMachine).localClockTicks,
--		 							self.evaluate,
--		 							self.evaluatedTrue,
--		 							self.evaluatedFalse,
--		 							self.reset,
--		 							self.fire
--		 	) )
	 


	context Mode
		inv enterOnceBeforeToLeave:
			(self.oclAsType(ecore::EObject).eContainer().eContainer().oclIsKindOf(StateMachine)) implies
			(Relation WeakAlternates(self.entering, self.leaving))  
		
		inv firingATransitionAlternatesWithLeavingState:
			(self.oclAsType(ecore::EObject).eContainer().eContainer().oclIsKindOf(StateMachine)
			  and self.outgoing->size() > 0
--				and (self.oclAsType(ecore::EObject).eContainer().eContainer().oclIsKindOf(cs::Component) )
			) implies
			let allFiredoutgoingTransition : Event = Expression Union(self.outgoing.fire) in
			Relation Coincides(allFiredoutgoingTransition, self.leaving)
			

		inv stateEntering1:
--			(not (self = self.oclAsType(ecore::EObject).eContainer().oclAsType(mode::ModeMachine).initial)) implies
			(self.oclAsType(ecore::EObject).eContainer().eContainer().oclIsKindOf(StateMachine)
			  and not (self.oclIsTypeOf(InitialPseudoState)) and self.incoming->size() > 0) implies
			let allInputTransition : Event = Expression Union(self.incoming.fire) in
			Relation Alternates(allInputTransition,self.entering)
			
-- micro step : no time elapsed between the fire and the entering (micro step) (also no other events, kind of RTC)
		inv stateEntering_microstep1:
		(self.oclAsType(ecore::EObject).eContainer().eContainer().oclIsKindOf(StateMachine)
		 and (not (self.oclIsTypeOf(InitialPseudoState))) and self.incoming->size() > 0) implies
			let allFire1 : Event = Expression Union(self.incoming.fire) in --->select(it | not ((it).source.oclIsKindOf(InitialState))).evaluate) in
			Relation MicroStepConstraint(self.oclAsType(ecore::EObject).eContainer().eContainer().oclAsType(StateMachine).anyEventOrTime, allFire1, self.entering)
			


		inv oneTransitionAtATime:
			(self.oclAsType(ecore::EObject).eContainer().eContainer().oclIsKindOf(StateMachine)
			  and self.outgoing->size() > 1
			) implies
			(Relation Exclusion(self.outgoing.fire))


	context StateMachine
		inv oneModeAtATime:
			(Relation Exclusion(self.ownedRegions.ownedStates->select(s | (s).oclIsKindOf(Mode)).oclAsType(Mode).entering))
		
--		inv StartBeforeStop:
--			Relation WeakAlternates(self.start, self.stop)
		
		inv defineAllEventOrTime:
			(self.ownedRegions.ownedTransitions->size() > 0 and self.ownedRegions.ownedTransitions->select(t| t.triggers->size() > 0 and t.triggers->first().oclIsKindOf(ChangeEvent))->size() > 0) implies
			let allEvents : Event = Expression Union(self.ownedRegions.ownedTransitions->select(t| t.triggers->size() > 0 and t.triggers->first().oclIsKindOf(ChangeEvent)).triggers->first().oclAsType(ChangeEvent).occurs) in
--			let eventsOrTime : Event = Expression Union(self.localClockTicks, allEvents) in 
			Relation Coincides (self.anyEventOrTime, allEvents)
			
			
--		inv defineAllEventOrTime2:
--			(self.ownedRegions.ownedTransitions->size() = 0) implies
--			Relation Coincides (self.anyEventOrTime, self.localClockTicks)
			
		inv firstIsInitialState:
			(self.ownedRegions->first().ownedStates->select(e | e.oclIsKindOf(InitialPseudoState))->first().outgoing->size() > 0)
			implies
			(Relation Coincides(self.start, self.ownedRegions->first().ownedStates->select(e | e.oclIsKindOf(InitialPseudoState))->first().outgoing->first().oclAsType(Mode).entering)) 
			--Relation Coincides(self.start, self.initial.outgoingTransitions->first().fire)
			
			
		inv firstOnlyOnce:
			let onlyOneFirst : Event = Expression OneTickAndNoMore(self.start) in
			Relation Coincides(self.start,onlyOneFirst)		
endpackage

--to be actually used !
--package behavior
--	context AbstractEvent
--		def if(not (self.oclIsKindOf(fa::AbstractFunction) or self.oclIsKindOf(fa::FunctionalExchange) or self.oclIsKindOf(information::ExchangeItem))): occurs : Event = self.oclAsType(emde::ExtensibleElement).ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::EventRuntimeData))->first().oclAsType(ModeSimulation::EventRuntimeData).occurs() 
--endpackage


package ctx 
	context System	
		
		inv startTimedSystemBeforeAllStartComponent:
			(self.oclAsType(ecore::EObject).eAllContents()->select(e | e.oclIsTypeOf(capellacommon::StateMachine))->size() > 0) implies
			let allStartMachine : Event = Expression Union(self.oclAsType(ecore::EObject).eAllContents()->select(e | e.oclIsTypeOf(capellacommon::StateMachine)).oclAsType(capellacommon::StateMachine).start) in
			Relation Precedes(self.start, allStartMachine)
			
		inv allStartsTogether:
			(self.oclAsType(ecore::EObject).eAllContents()->select(e | e.oclIsTypeOf(capellacommon::StateMachine))->size() > 1) implies
			(Relation Coincides(self.oclAsType(ecore::EObject).eAllContents()->select(e | e.oclIsTypeOf(capellacommon::StateMachine)).oclAsType(capellacommon::StateMachine).start))
		
		inv firstOnlyOnce:
			let onlyOneFirst : Event = Expression OneTickAndNoMore(self.start) in
			Relation Coincides(self.start,onlyOneFirst)
endpackage















 








package interaction 

	--context MessageEnd
	-- def : messEnd_occurs : Event = self.getLabel()
	
--	context ExecutionEnd
--	 def : execEnd_occurs : Event = self.getLabel()
	 
	context AbstractEnd
	 def : abstractEnd_occurs : Event = self.getLabel()--.isOccurring() 

	context InstanceRole
		inv endsInOrder:
			Relation Causes(self.abstractEnds.abstractEnd_occurs)
			
		inv nonRentrantSCenario:
			(self.abstractEnds->size() > 1) implies
			(Relation WeakAlternates(self.abstractEnds->first().abstractEnd_occurs, self.abstractEnds->last().abstractEnd_occurs))
			
	context SequenceMessage	
		inv instantaneousReply:
			(self.kind = MessageKind::REPLY) implies
			(Relation Causes(self.sendingEnd.abstractEnd_occurs,self.receivingEnd.abstractEnd_occurs))
			
		inv causalityCall:
			(self.kind <> MessageKind::REPLY) implies
			(Relation Causes(self.sendingEnd.abstractEnd_occurs,self.receivingEnd.abstractEnd_occurs))
		
		inv sendMeansActivates:
		(self.kind <> MessageKind::REPLY and self.receivingFunction <> null) implies
			(Relation Coincides(self.sendingEnd.abstractEnd_occurs, self.receivingFunction.oclAsType(ctx::SystemFunction).activated)) 
			
--		inv sendifRunning:
--		(self.kind <> MessageKind::REPLY) implies
--			(Relation SubClock(self.sendingEnd.messEnd_occurs, self.sendingEnd.covered.representedInstance.oclAsType(ctx::SystemFunction).isRunning)) 

--	context MessageEnd 
--		inv messIsAbst:
--			Relation Coincides(self.abstractEnd_occurs, self.abstractEnd_occurs)
--	
--	context ExecutionEnd
--		inv execIsAbst:
--			Relation Coincides(self.abstractEnd_occurs, self.abstractEnd_occurs)
	
	context Execution
	
			inv eitherElectedXORmessageOccured:
			(self.covered.representedInstance <> null and self.covered.representedInstance.oclIsTypeOf(ctx::SystemFunction)) implies
			Relation Exclusion(self.covered.representedInstance.oclAsType(ctx::SystemFunction).hasBeenElected, self.start.oclAsType(AbstractEnd).abstractEnd_occurs)
	
			inv startedOrrElectedMeansStarts:
			(self.covered.representedInstance <> null and self.covered.representedInstance.oclIsTypeOf(ctx::SystemFunction)) implies
				let startedOrElected : Event = Expression Union(self.covered.representedInstance.oclAsType(ctx::SystemFunction).hasBeenElected, self.start.oclAsType(AbstractEnd).abstractEnd_occurs) in
				(Relation Coincides(startedOrElected, self.covered.representedInstance.oclAsType(ctx::SystemFunction).started))
--		inv startWhenEndOccurs:
--			Relation Coincides(self.covered.representedInstance.oclAsType(ctx::SystemFunction).activated, self.start.oclAsType(AbstractEnd).abstractEnd_occurs)
		inv stopWhenEndOccurs:
			(self.covered.representedInstance <> null and self.covered.representedInstance.oclIsTypeOf(ctx::SystemFunction)) implies
				Relation Coincides(self.finish.oclAsType(AbstractEnd).abstractEnd_occurs, self.covered.representedInstance.oclAsType(ctx::SystemFunction).terminated)
		inv startBeforeFinish_nonRentrant:
			Relation WeakAlternates(self.start.oclAsType(AbstractEnd).abstractEnd_occurs, self.finish.oclAsType(AbstractEnd).abstractEnd_occurs)


	context ConstraintDuration
		def : isPeriodic : Integer = if (self.duration.startsWith('p')) then 1 else 0 endif
		def : periodValue : Integer = if (self.duration.startsWith('p')) then self.duration.replaceAll('^..','').replaceAll(';.*','').toString().toInteger().round() else 0 endif
		def : offsetValue : Integer = if (self.duration.startsWith('p')) then self.duration.replaceAll('..[0-9]+;','').replaceAll(']','').toString().toInteger().round() else 0 endif
		def : firstValue : Integer = if (not self.duration.startsWith('p')) then self.duration.replaceAll('^.','').replaceAll(';.*','').toString().toInteger().round() else 0 endif
		def : secondValue : Integer = if (not self.duration.startsWith('p')) then self.duration.replaceAll('.[0-9]+;','').replaceAll(']','').toString().toInteger().round() else 0 endif
		def : theSystem : ctx::SystemAnalysis = self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().eContainer().oclAsType(ctx::SystemAnalysis)
		def : otherTasksOnSameCPU : Collection(ctx::SystemFunction) = self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().eContainer().eContents()->select(eo | eo.oclIsKindOf(ctx::System)).oclAsType(ctx::System).ownedFunctionalAllocation.function.oclAsType(ctx::SystemFunction)->select(sf | (sf = self.start.oclAsType(AbstractEnd).covered.representedInstance))	
 		def : isAllocatedWithOthers : Integer = if (self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().eContainer().oclAsType(ctx::SystemAnalysis).ownedSystem.ownedFunctionalAllocation.function->exists(sf| sf = self)) then 1 else 0 endif
		inv DurationAsAPeriodic: 
		(
			isPeriodic = 1
			and 
			periodValue <> 0
		) implies 
		(Relation PeriodicWithJitterUnknowOffset(self.start.oclAsType(AbstractEnd).abstractEnd_occurs, 
							 theSystem.ms,
							 periodValue, offsetValue)
		)
	
	
		inv DurationOfAllocatedExec:
		(
			(not (isPeriodic = 1)) 
			and
			firstValue <> 0 
			and
			isAllocatedWithOthers = 1
		) implies 
		(Relation Duration(self.start.oclAsType(AbstractEnd).abstractEnd_occurs, 
				   self.finish.oclAsType(AbstractEnd).abstractEnd_occurs,
				   self.start.oclAsType(AbstractEnd).covered.representedInstance.oclAsType(ctx::SystemFunction).isRunning,
				   firstValue, secondValue)
		)

		inv DurationOfNonAllocatedExec:
		(
			(not (isPeriodic = 1)) 
			and
			firstValue <> 0 
			and
			isAllocatedWithOthers = 0
		) implies 
		(Relation Duration(self.start.oclAsType(AbstractEnd).abstractEnd_occurs, 
				   self.finish.oclAsType(AbstractEnd).abstractEnd_occurs,
				   self.start.oclAsType(AbstractEnd).covered.representedInstance.oclAsType(ctx::SystemFunction).isRunning,
				   firstValue, secondValue)
		)


		inv DurationOfZero:
		( 
			(not (isPeriodic = 1)) 
			and
			firstValue = 0 
			and
			secondValue = 0
		) implies
		(Relation Coincides(self.start.oclAsType(AbstractEnd).abstractEnd_occurs, 
				            self.finish.oclAsType(AbstractEnd).abstractEnd_occurs)
		) 



endpackage	

----ONLY FOR THALES DEMO --> SHOULD USE bcoOl


package ctx

  context System

	
	inv nonPreemptiveSched_part2:
		(
			self.ownedFunctionalAllocation->size() > 0
		) implies
		(Relation Exclusion(self.ownedFunctionalAllocation.function.oclAsType(SystemFunction).started))
	 
	inv isWorkingIfATaskIsRunning:
		(self.ownedFunctionalAllocation.function.oclAsType(SystemFunction)->size() > 0) implies
		let aTaskIsRunning : Event = Expression Union(self.ownedFunctionalAllocation.function.oclAsType(SystemFunction).isRunning) in
		(Relation Coincides(aTaskIsRunning, self.isWorking))
	
	
		
	
  context SystemFunction
  
  	def : theSystem : SystemAnalysis = self.oclAsType(ecore::EObject)->closure(eo |if not eo.oclIsKindOf(SystemAnalysis) then eo.eContainer() else null endif)->select(s | s.oclIsKindOf(SystemAnalysis))->asSequence()->first().oclAsType(SystemAnalysis)
  
  	inv unsuspendBeforeElection:
	  	(
	  		self.ownedFunctions->isEmpty()
	  	) implies
	  	(Relation Causes(self.unsuspend, self.hasBeenElected))

	inv taskTaskInv:
		(
			self.ownedFunctions->isEmpty()
		) implies
		(Relation TaskState(self.activated,self.started,self.terminated,self.suspended,self.unsuspend, self.isRunning))
		
	inv isRunningTakesTime:
		(
			self.ownedFunctions->isEmpty()
		) implies
		(Relation SubClock(self.isRunning, theSystem.ms))
	
	
	def : allSynchCallSet : Collection(interaction::SequenceMessage) = 
			theSystem.containedCapabilityPkg.ownedCapabilities.oclAsType(Capability)->first().ownedScenarios.ownedMessages
				->select(eo|
					eo.oclIsTypeOf(interaction::SequenceMessage)
					and eo.oclAsType(interaction::SequenceMessage).kind = interaction::MessageKind::SYNCHRONOUS_CALL
					and eo.oclAsType(interaction::SequenceMessage).sendingFunction = self)
		 	.oclAsType(interaction::SequenceMessage)
	
	def : allReplySet : Collection(interaction::SequenceMessage) =
			(theSystem.containedCapabilityPkg.ownedCapabilities.oclAsType(Capability)->first().ownedScenarios.ownedMessages
					->select(eo|
					eo.oclIsTypeOf(interaction::SequenceMessage)
					and eo.oclAsType(interaction::SequenceMessage).kind = interaction::MessageKind::REPLY
					and eo.oclAsType(interaction::SequenceMessage).receivingFunction = self)
			).oclAsType(interaction::SequenceMessage)
	
	def : otherTasks : Collection(SystemFunction) = theSystem.ownedSystem.ownedFunctionalAllocation.function.oclAsType(SystemFunction)->select(sf| sf <> self)
	def : isAllocatedWithOthers : Integer = if (  self.oclAsType(ecore::EObject)->closure(eo |if not eo.oclIsKindOf(SystemAnalysis) then eo.eContainer() else null endif)->select(s | s.oclIsKindOf(SystemAnalysis))->asSequence()->first().oclAsType(SystemAnalysis).ownedSystem.ownedFunctionalAllocation.function.oclAsType(SystemFunction)->exists(sf| sf = self)) then 1 else 0 endif
	
	--suspend is the union of all synchronousCall+allOtherStarts from the same CPU
	inv SuspendIfAnotherStartOnSameCPUOrSendSynchCall: 
		(
			allSynchCallSet->size() > 0
			and
			isAllocatedWithOthers = 1
			and
			self.ownedFunctions->isEmpty()
		) implies
		(let allOtherStarts : Event = Expression Union(otherTasks.started) in
		let allSynchronousCalls : Event = Expression Union(allSynchCallSet.sendingEnd.abstractEnd_occurs) in
		let allSuspenders : Event = Expression Union(allOtherStarts,allSynchronousCalls) in
		let allowers: Event = Expression Union(self.started,self.unsuspend) in
		Relation SuspendOnlyWhenNeeded(allSuspenders, self.terminated, allowers, self.suspended)) 
		
	inv SuspendIfAnotherStartOnSameCPU:
		(
			allSynchCallSet->size() = 0
			and
			isAllocatedWithOthers = 1
			and
			self.ownedFunctions->isEmpty()
		) implies
		(let allOtherStarts2 : Event = Expression Union(otherTasks.started)in
		let allowers2: Event = Expression Union(self.started,self.unsuspend) in
		Relation SuspendOnlyWhenNeeded(allOtherStarts2, self.terminated, allowers2, self.suspended))

	inv SuspendIfSendSynchCall:
		(
			allSynchCallSet->size() > 0
			and
			isAllocatedWithOthers = 0
			and
			self.ownedFunctions->isEmpty()
		) implies
		(let allSynchronousCalls3 : Event = Expression Union(allSynchCallSet.sendingEnd.abstractEnd_occurs)in
		let allowers3: Event = Expression Union(self.started,self.unsuspend) in
		Relation SuspendOnlyWhenNeeded(allSynchronousCalls3, self.terminated, allowers3, self.suspended))

	inv NeverSuspend:
		( 
			allSynchCallSet->size() = 0
			and
			isAllocatedWithOthers = 0
			and
			self.ownedFunctions->isEmpty()
		) implies
		(Relation Exclusion(self.suspended,self.suspended))


	inv UnSuspendIfAnotherTerminateOnSameCPUorReceiveSynchCall:
		(
			allReplySet->size() > 0
			and
			isAllocatedWithOthers = 1
			and
			self.ownedFunctions->isEmpty()
		) implies
		(let allOtherterminated : Event = Expression Union(otherTasks.terminated) in
		let allOtherSuspend : Event = Expression Union(otherTasks.suspended) in
		let allOtherterminatedOrUnsuspend : Event = Expression Union(allOtherterminated, allOtherSuspend) in
		let allSynchronousReceiveCalls : Event = Expression Union(allReplySet.receivingEnd.abstractEnd_occurs) in
		let allUnSuspenders : Event = Expression Union(allOtherterminated,allSynchronousReceiveCalls) in
		Relation SuspendOnlyWhenNeeded(allUnSuspenders, self.terminated, self.suspended, self.unsuspend))

	inv UnSuspendIfAnotherTerminateOnSameCPU:
		(
			allReplySet->size() = 0
			and
			isAllocatedWithOthers = 1
			and
			self.ownedFunctions->isEmpty()
		) implies
		(let allOtherterminated2 : Event = Expression Union(otherTasks.terminated) in
		Relation SuspendOnlyWhenNeeded(allOtherterminated2, self.terminated, self.suspended, self.unsuspend))

	inv UnSuspendIfReceiveSynchCall:
		(
			allReplySet->size() > 0
			and
			isAllocatedWithOthers = 0
			and
			self.ownedFunctions->isEmpty()
		) implies
		(let allSynchronousReceiveCalls2 : Event = Expression Union(allReplySet.receivingEnd.abstractEnd_occurs) in
		Relation SuspendOnlyWhenNeeded(allSynchronousReceiveCalls2, self.terminated, self.suspended, self.unsuspend))

	inv NeverUnsuspend:
		(
			allReplySet->size() = 0
			and
			isAllocatedWithOthers = 0
			and
			self.ownedFunctions->isEmpty()
		) implies
		(Relation Exclusion(self.unsuspend,self.unsuspend))


endpackage

----- END ONLY FOR THALMES DEMO	
			
			
