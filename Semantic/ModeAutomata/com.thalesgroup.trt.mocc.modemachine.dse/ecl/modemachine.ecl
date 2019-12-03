import 'http://www.polarsys.org/capella/core/modeller/1.3.0'
import 'http://www.polarsys.org/capella/core/cs/1.3.0'
import 'http://www.polarsys.org/capella/core/information/1.3.0'
import 'http://www.polarsys.org/kitalpha/emde/1.0.0'
import 'platform:/resource/com.thalesgroup.trt.mde.vp.time/models/time.ecore'
import 'platform:/resource/com.thalesgroup.trt.mde.vp.mode/models/mode.ecore'
import 'platform:/resource/com.thalesgroup.trt.mde.vp.expression/models/expression.ecore'
import 'platform:/resource/com.thalesgroup.trt.mde.vp.al/models/al.ecore'
import 'platform:/resource/com.thalesgroup.trt.mde.vp.modesimulation/models/ModeSimulation.ecore'
import 'http://www.polarsys.org/capella/common/behavior/1.3.0'
import 'http://www.polarsys.org/capella/core/fa/1.3.0'
import 'http://www.polarsys.org/capella/core/ctx/1.3.0'

--import 'http://www.gemoc.org/sample/smcube' 
import 'http://www.eclipse.org/emf/2002/Ecore'

ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"
ECLimport "platform:/resource/org.gemoc.sample.smcube.moc.lib/ccsl/SMCubeMoC.ccslLib"
ECLimport "platform:/resource/org.gemoc.sample.smcube.moc.lib/ccsl/SMCubeMoCC.moccml" 


package capellamodeller

endpackage

package cs 

endpackage

package information

endpackage

package emde

endpackage

package time 
  	context Clock  
		def: ticks : Event = self.oclAsType(emde::ExtensibleElement).ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::ClockRuntimeData))->first().oclAsType(ModeSimulation::ClockRuntimeData).ticks() 
endpackage

package mode 
	context AbstractMode
		def : entering : Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::ModeRuntimeData))->first().oclAsType(ModeSimulation::ModeRuntimeData).onEnter()
		def : leaving : Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::ModeRuntimeData))->first().oclAsType(ModeSimulation::ModeRuntimeData).onLeave()
     
	context ModeMachine
		def: start : Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::MachineRuntimeData))->first().oclAsType(ModeSimulation::MachineRuntimeData).init()
		def: anyEventOrTime :Event = self
--		def: stop : Event = self

	context Transition
		def : fire : Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::TransitionRuntimeData))->first().oclAsType(ModeSimulation::TransitionRuntimeData).fire()
		def : reset : Event = self --.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::TransitionRuntimeData))->first().oclAsType(ModeSimulation::TransitionRuntimeData).reset()
 
-- 		def if(self <> self.oclAsType(ecore::EObject).eContainer().oclAsType(mode::ModeMachine).initial.outgoingTransitions->first()):
		def	:evaluate : Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::TransitionRuntimeData))->first().oclAsType(ModeSimulation::TransitionRuntimeData).evaluate() [res] switch case self.res = true forbid self.evaluatedFalse until self.evaluatedTrue;
     																				 case self.res = false forbid self.evaluatedTrue until self.evaluatedFalse;
--		def if(self <> self.oclAsType(ecore::EObject).eContainer().oclAsType(mode::ModeMachine).initial.outgoingTransitions->first()): 
		def	:evaluatedTrue : Event  = self
--		def if(self <> self.oclAsType(ecore::EObject).eContainer().oclAsType(mode::ModeMachine).initial.outgoingTransitions->first()):
		def	:evaluatedFalse : Event = self 
		
--	context Mode_
--		def : enter : Event = self.enterActions
		
--		def : do : Event = self.doActions
--		def : exit : Event = self.exitActions
--		
--		def : subDo: Event = self.subModeMachine
--		def : functions: Event = self.availableFunctionalChains
		context Transition
	
	--first all reset are defined
		inv reset_singleTransitionNoSuperState:
			( self.source.outgoingTransitions ->select(t | (t) <> self)->size() = 0
				and (self.source.oclAsType(ecore::EObject).eContainer().eContainer().oclIsKindOf(cs::Component) )
			) implies
			let doNotTickreset: Event = Expression  NoTick(self.fire) in --here we can put any clock, it is just need to construct an empty, non dying clock
			Relation Coincides (self.reset, doNotTickreset)

		inv reset_severalTransitionsNoSuperState:
			(self.source.outgoingTransitions->select(t | (t) <> self)->size() > 0
				and (self.source.oclAsType(ecore::EObject).eContainer().eContainer().oclIsKindOf(cs::Component) )
			) implies
			let otherFireFromTheSameStateNOOSS: Event = Expression Union (self.source.outgoingTransitions->select(t | (t) <> self).fire) in
			Relation Coincides (self.reset, otherFireFromTheSameStateNOOSS)

--		inv reset_singleTransitionSuperState:
--			( self.source.outgoingTransitions->select(t | (t) <> self)->size() = 0
--				and self.source.owningSMCube.oclAsType(ecore::EObject).eContainer().oclIsKindOf(SuperState_OR)
--			) implies
--			(Relation Coincides (self.reset, self.source.oclAsType(ecore::EObject).eContainer().eContainer().oclAsType(SuperState_OR).leaving))
--	
--		inv reset_severalTransitionsSuperState:
--			(self.source.outgoingTransitions->select(t | (t) <> self)->size() > 0
--				and self.source.oclAsType(ecore::EObject).eContainer().eContainer().oclIsKindOf(SuperState_OR)
--			) implies
--			let otherFireFromTheSameStateOSS: Event = Expression Union (self.source.outgoingTransitions->select(t | (t) <> self).fire) in
--			let superStateExitOrotherFireFromTheSameState: Event = Expression Union(otherFireFromTheSameStateOSS, self.source.owningSMCube.oclAsType(ecore::EObject).eContainer().oclAsType(SuperState_OR).leaving) in
--			Relation Coincides (self.reset, superStateExitOrotherFireFromTheSameState)
--	
	
	--first, the 2 cases with no JOIN
	--case 1: guard and trigger not null, NO JOIN
		inv TAG:
			( self.trigger <> null
			  and self.source.oclIsKindOf(AbstractMode)
			  and self.target.oclIsKindOf(AbstractMode)
			) implies
		 	(Relation TriggerAndGuardedTransition(
		 							self.source.oclAsType(AbstractMode).entering,
		 							self.trigger.occurs,
		 							self.evaluate,
		 							self.evaluatedTrue,
		 							self.evaluatedFalse,
		 							self.reset,
		 							self.fire
		 	)) 
		 	
	 
	 --case 2: no trigger , NO JOIN
	 	inv GO:
			( self.trigger = null
			  and self.source.oclIsKindOf(AbstractMode)
			  and self.target.oclIsKindOf(AbstractMode)
			) implies
			let allTicksGO : Event = Expression Union(self.oclAsType(ecore::EObject).eContainer().oclAsType(mode::ModeMachine).localClocks.ticks) in
		 	(Relation TriggerAndGuardedTransition(
		 							self.source.oclAsType(AbstractMode).entering,
		 							allTicksGO,
		 							self.evaluate,
		 							self.evaluatedTrue,
		 							self.evaluatedFalse,
		 							self.reset,
		 							self.fire
		 	) )
	 
	
	--JOIN related constraints 
	
	
	 
		--fire of first is union of all the join transition
--		inv fireUnionJoinTrans:
--			(self.source.oclIsKindOf(Join)
--			)
--			implies
--			let joinTorF : Event = Expression Union(self.evaluatedTrue, self.evaluatedFalse) in
--			let initiatorTorF : Event = Expression Union(self.source.incomingTransitions->first().evaluatedTrue, self.source.incomingTransitions->first().evaluatedFalse) in
--			let aReset : Event = Expression Union (self.reset, self.source.incomingTransitions->first().reset) in
--			Relation JoinGuardedTrueAndFalse(self.evaluate, initiatorTorF, joinTorF, aReset)
	
		--evaluate together with the join transition, if no guard defined, always returns true :).
--		inv evaluateUnionJoinTransAllGuard:
--			(self.target.oclIsKindOf(Join)
--			)
--			implies
--			let unionOfevaluateAllGuard : Event = Expression Union(self.target.outgoingTransitions.evaluate) in
--			Relation Coincides(self.evaluate, unionOfevaluateAllGuard)
	
		--fire of the initiator is the union of the join transition fire
--		inv fireUnionJoinTrans:
--			(self.target.oclIsKindOf(Join)
--			)
--			implies
--			let unionOfFire : Event = Expression Union(self.target.outgoingTransitions.fire) in
--			Relation Coincides(self.fire, unionOfFire) 
	
	
		
	
	--case join1: trigger not null in both initiator and self, JOIN source
--		inv TAG_TAG_join:
--			(self.trigger <> null
--			 and self.source.incomingTransitions->first().trigger <> null
--			 and self.source.oclIsKindOf(Join)
--			 and self.target.oclIsKindOf(State)
--			) implies
--			let conjunctionOfEventsTAG_TAG1 : Event = Expression Intersection(self.trigger.occurs, self.source.incomingTransitions->first().trigger.occurs) in
--			let bothEvaluatedTrueTAG_TAG1 : Event = Expression Intersection(self.evaluatedTrue, self.source.incomingTransitions->first().evaluatedTrue) in
--			let bothEvaluatedFalseTAG_TAG1 : Event = Expression Union(self.evaluatedFalse, self.source.incomingTransitions->first().evaluatedFalse) in
--			Relation TriggerAndGuardedTransition(
--									self.source.incomingTransitions->first().source.oclAsType(State).entering,
--		 							conjunctionOfEventsTAG_TAG1,
--		 							self.evaluate,
--		 							bothEvaluatedTrueTAG_TAG1,
--		 							bothEvaluatedFalseTAG_TAG1,
--		 							self.reset,
--		 							self.fire
--		 	)
		 	



	--case join2: trigger not null in the initiator and null in self, JOIN source
--		inv TAG_TAG_join2:
--			(self.trigger = null
--			 and self.source.incomingTransitions->first().trigger <> null
--			 and self.source.oclIsKindOf(Join)
--			 and self.target.oclIsKindOf(State)
--			) implies
--			let bothEvaluatedTrueTAG_TAG2 : Event = Expression Intersection(self.evaluatedTrue, self.source.incomingTransitions->first().evaluatedTrue) in
--			let bothEvaluatedFalseTAG_TAG2 : Event = Expression Union(self.evaluatedFalse, self.source.incomingTransitions->first().evaluatedFalse) in
--			Relation TriggerAndGuardedTransition(
--									self.source.incomingTransitions->first().source.oclAsType(State).entering,
--		 							self.source.incomingTransitions->first().trigger.occurs,
--		 							self.evaluate,
--		 							bothEvaluatedTrueTAG_TAG2,
--		 							bothEvaluatedFalseTAG_TAG2,
--		 							self.reset,
--		 							self.fire
--		 	)
		 	

	--case join3: trigger null in the initiator and not null in self, JOIN source
--		inv TAG_TAG_join3:
--			(self.trigger <> null
--			 and self.source.incomingTransitions->first().trigger = null
--			 and self.source.oclIsKindOf(Join)
--			 and self.target.oclIsKindOf(State)
--			) implies
--			let bothEvaluatedTrueTAG_TAG3 : Event = Expression Intersection(self.evaluatedTrue, self.source.incomingTransitions->first().evaluatedTrue) in
--			let bothEvaluatedFalseTAG_TAG3 : Event = Expression Union(self.evaluatedFalse, self.source.incomingTransitions->first().evaluatedFalse) in
--			Relation TriggerAndGuardedTransition(
--									self.source.incomingTransitions->first().source.oclAsType(State).entering,
--		 							self.trigger.occurs,
--		 							self.evaluate,
--		 							bothEvaluatedTrueTAG_TAG3,
--		 							bothEvaluatedFalseTAG_TAG3,
--		 							self.reset,
--		 							self.fire
--		 	)


	--case join4: trigger null in both the initiator and in self, JOIN source
--		inv TAG_TAG_join4:
--			(self.trigger = null
--			 and self.source.incomingTransitions->first().trigger = null
--			 and self.source.oclIsKindOf(Join)
--			 and self.target.oclIsKindOf(State)
--			) implies
--			let bothEvaluatedTrueTAG_TAG4 : Event = Expression Intersection(self.evaluatedTrue, self.source.incomingTransitions->first().evaluatedTrue) in
--			let bothEvaluatedFalseTAG_TAG4 : Event = Expression Union(self.evaluatedFalse, self.source.incomingTransitions->first().evaluatedFalse) in
--			Relation TriggerAndGuardedTransition(
--									self.source.incomingTransitions->first().source.oclAsType(State).entering,
--		 							self.oclAsType(ecore::EObject).eContainer().oclAsType(SMCube).localClock.ticks,
--		 							self.evaluate,
--		 							bothEvaluatedTrueTAG_TAG4,
--		 							bothEvaluatedFalseTAG_TAG4,
--		 							self.reset,
--		 							self.fire
--		 	)

	context AbstractMode
		inv enterOnceBeforeToLeave:
			Relation WeakAlternates(self.entering, self.leaving)  
		
		inv firingATransitionAlternatesWithLeavingState:
			(self.outgoingTransitions->size() > 0
				and (self.oclAsType(ecore::EObject).eContainer().eContainer().oclIsKindOf(cs::Component) )
			) implies
			let allFiredoutgoingTransition : Event = Expression Union(self.outgoingTransitions.fire) in
			Relation Coincides(allFiredoutgoingTransition, self.leaving)
			
--		inv firingATransitionAlternatesWithLeavingStateORSuperstate:
--			(self.outgoingTransitions->size() > 0
--				and self.owningSMCube.oclAsType(ecore::EObject).eContainer().oclIsKindOf(SuperState_OR)
--			) implies
--			let allFiredoutgoingTransitionOSS : Event = Expression Union(self.outgoingTransitions.fire) in
--			let allFireOrExitSuperState : Event = Expression Union(allFiredoutgoingTransitionOSS, self.owningSMCube.oclAsType(ecore::EObject).eContainer().oclAsType(SuperState_OR).leaving) in
--			Relation Coincides(allFireOrExitSuperState, self.leaving)
		

		inv stateEntering1:
--			(not (self = self.oclAsType(ecore::EObject).eContainer().oclAsType(mode::ModeMachine).initial)) implies
			(not (self.oclIsTypeOf(mode::Initial))) implies
			let allInputTransition : Event = Expression Union(self.incomingTransitions.fire) in
			Relation Alternates(allInputTransition,self.entering)
			
-- micro step : no time elapsed between the fire and the entering (micro step) (also no other events, kind of RTC)
		inv stateEntering_microstep1:
--		(self <> self.oclAsType(ecore::EObject).eContainer().oclAsType(mode::ModeMachine).initial
--		) implies
		(not (self.oclIsTypeOf(mode::Initial))) implies
			let allFire1 : Event = Expression Union(self.incomingTransitions.fire) in --->select(it | not ((it).source.oclIsKindOf(InitialState))).evaluate) in
			Relation MicroStepConstraint(self.oclAsType(ecore::EObject).eContainer().oclAsType(mode::ModeMachine).anyEventOrTime, allFire1, self.entering)
			


		inv oneTransitionAtATime:
			(self.outgoingTransitions->size() > 1
			) implies
			(Relation Exclusion(self.outgoingTransitions.fire))

--	context Mode_
--		inv do_Mode: 
--			let enterActions1 : Event = Expression Union(self.enterActions.runAction) in
--			let doActions1: Event = Expression Union(self.doActions.runAction) in
		
--			Relation Coincides (enterActions1, doActions1)
	
--		inv enter_Mode: 
			--let enterActions2 : Event = Expression Union(self.enterActions.runAction) in		
--			Relation Coincides (sel.entering,enterActions1 )
			
			
--		inv activate_Functions: 
--			let allFunctions1: Event = Expression Union(self.availableFunctionalChains.activate) in
--			Relation WeakAlternates(self.enter, allFunctions1)
--		inv runModeNoSubMachine:
--			(self.subModeMachine = null) implies
--			let allFunctions2: Event = Expression Union(self.functions) in
--			Relation Precedes (allFunctions2, self.do)
--			
--		inv runModeSubMachine:
--			(not (self.subModeMachine = null)) implies
--			let allFunctions3: Event = Expression Union(self.functions) in
--			Relation Precedes (allFunctions3, self.subModeMachine.start)
--			
--		inv exit_Mode_afterDo:
			--(self.subModeMachine = null) implies
			--let doDone: Event = self.do in	
			
--			let doActions2: Event = Expression Union(self.doActions.runAction) in	
--			let exitActions1 : Event = Expression Union(self.exitActions.runAction) in
--			Relation Precedes (doActions2,exitActions1)
--		inv exit_Mode_afterSubMachine:
--			(not (self.subModeMachine = null)) implies
--			let subMachineStop: Event = self.subModeMachine.stop in
--			Relation Precedes (subMachineStop,self.exit)
--		
--		inv exitingWhenExit:
--			let exitActions2 : Event = Expression Union(self.exitActions.runAction) in
--			Relation Precides(exitActions2, self.leaving)
			
--		
--		inv deActivate_Functions: 
--			let allFunctions4: Event = Expression Union(self.availableFunctionalChains.deactivate) in
--			Relation WeakAlternates(self.enter, allFunctions4)
--			

--	context Join
--		inv oneTransitionAtATimeJoin:
--			(self.outgoingTransitions->size() > 1
--			) implies
--			(Relation Exclusion(self.outgoingTransitions.fire))

	context ModeMachine
		inv oneModeAtATime:
			Relation Exclusion(self.ownedModes->select(s | (s).oclIsKindOf(AbstractMode)).oclAsType(AbstractMode).entering)
		
--		inv StartBeforeStop:
--			Relation WeakAlternates(self.start, self.stop)
		
		inv defineAllEventOrTime:
			(self.inputEvents->size() > 0) implies
			let allEvents : Event = Expression Union(self.inputEvents.occurs ) in
			let allTicksevt : Event = Expression Union(self.localClocks.ticks) in
			let eventsOrTime : Event = Expression Union(allTicksevt, allEvents) in
			Relation Coincides (self.anyEventOrTime, eventsOrTime)
			
			
		inv defineAllEventOrTime2:
			 
			(self.inputEvents->size() = 0 and self.localClocks->size() > 0) implies
			let allTicksEvt2 : Event = Expression Union(self.localClocks.ticks) in
			Relation Coincides (self.anyEventOrTime, allTicksEvt2)
			
		inv firstIsInitialState:
			--let firedTrans : Event = Expression Union (self.initial.outgoingTransitions.fire) in
			Relation Coincides(self.start, self.initial.entering)
			--Relation Coincides(self.start, self.initial.outgoingTransitions->first().fire)
			
			
		inv firstOnlyOnce:
			let onlyOneFirst : Event = Expression OneTickAndNoMore(self.start) in
			Relation Coincides(self.start,onlyOneFirst)		
endpackage


package expression 
	context EventExpression
		def : occurs : Event = self
		
		
	context EventBinaryExpression
		inv eventAND:
			(self.operator = EventBinaryOperator::AND) implies
			let binaryConjunction : Event = Expression Intersection(self.operand1.occurs, self.operand2.occurs) in
			(Relation Coincides(self.occurs, binaryConjunction))	
			

		inv eventOR:
			(self.operator = EventBinaryOperator::OR) implies
			let binaryDisjunction : Event = Expression Union(self.operand1.occurs, self.operand2.occurs) in
			(Relation Coincides(self.occurs, binaryDisjunction))
	

	context EventUnaryExpression
		inv EventRefCoincidence:
			Relation Coincides(self.occurs, self.operand.occurs)
endpackage

package al 
--	context Action
--		def : runAction : Event = self

endpackage

package ModeSimulation 
      
endpackage  	    														 

package behavior
	context AbstractEvent
		def if(not (self.oclIsKindOf(fa::AbstractFunction) or self.oclIsKindOf(fa::FunctionalExchange) or self.oclIsKindOf(information::ExchangeItem))): occurs : Event = self.oclAsType(emde::ExtensibleElement).ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::EventRuntimeData))->first().oclAsType(ModeSimulation::EventRuntimeData).occurs() 
endpackage

package fa
--	context AbstractFunction
--		def: start : Event = self.oclAsType(emde::ExtensibleElement).ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::FunctionRuntimeData))->first().oclAsType(ModeSimulation::FunctionRuntimeData).init()
		
--	context FunctionalChain
--		def : isActive :Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::FunctionRuntimeData))->first().oclAsType(ModeSimulation::FunctionRuntimeData).isActive 
--																					 
--     	def: activate: Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::FunctionRuntimeData))->first().oclAsType(ModeSimulation::FunctionRuntimeData).activate()
--     	def: deactivate: Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::FunctionRuntimeData))->first().oclAsType(ModeSimulation::FunctionRuntimeData).deactivate()
		
endpackage
package ctx 
	context System	
		def if(self.oclIsTypeOf(ctx::System)): start : Event = self.oclAsType(emde::ExtensibleElement).ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::ComponentRuntimeData))->first().oclAsType(ModeSimulation::ComponentRuntimeData).init() 

		
		inv startTimedSystemBeforeAllStartComponent:
--			let allStartSMCube : Event = Expression Union(self.smcubes.start) in
--			Relation Precedes(self.start, allStartSMCube)
--			let allModeMachine: Event = Expression Union (self.ownedExtensions->select(e | (e).oclIsTypeOf(mode::ModeMachine))) in
			(self.ownedExtensions->select(e | (e).oclIsTypeOf(mode::ModeMachine))->size() > 0) implies
			let allStartMachine : Event = Expression Union(self.ownedExtensions->select(e | (e).oclIsTypeOf(mode::ModeMachine)).oclAsType(mode::ModeMachine).start) in
			Relation Precedes(self.start, allStartMachine)
			
		inv allStartsTogether:
			(self.ownedExtensions->select(e | (e).oclIsTypeOf(mode::ModeMachine))->size() > 1) implies
			(Relation Coincides(self.ownedExtensions->select(e | (e).oclIsTypeOf(mode::ModeMachine))->first().oclAsType(mode::ModeMachine).start))
		
		inv firstOnlyOnce:
			let onlyOneFirst : Event = Expression OneTickAndNoMore(self.start) in
			Relation Coincides(self.start,onlyOneFirst)
endpackage


--	context SuperState_OR
--		inv enterMeansStart:
--			Relation Coincides(self.entering, self.internalDefinition.start)	
	

		
--	context _Event
--		inv onlyWhenSollicitatedSingleT:
--			(self.sollicitingTransitions->size() = 1) implies
--			(Relation Coincides(self.occurs, self.sollicitingTransitions->first().fire))
--		
--		inv onlyWhenSollicitatedSeveralT:
--			(self.sollicitingTransitions->size() > 1) implies
--			let aTransitionFired : Event = Expression Union(self.sollicitingTransitions.fire) in
--			(Relation Coincides(self.occurs, aTransitionFired))
			
--package fa
--	context AbstractFunction
--		 
--		inv startTimedSystemBeforeAllStartFunction:
----			let allStartSMCube : Event = Expression Union(self.smcubes.start) in
----			Relation Precedes(self.start, allStartSMCube)
--			let allStartMachine : Event = Expression Union(self.ownedExtensions->select(e | (e).oclIsTypeOf(mode::ModeMachine))->first().oclAsType(mode::ModeMachine).start) in
--			Relation Precedes(self.start, allStartMachine)
--			
--		inv allStartsTogether:
--			(self.ownedExtensions->select(e | (e).oclIsTypeOf(mode::ModeMachine)).oclAsType(mode::ModeMachine)->size() > 1) implies
--			(Relation Coincides(self.ownedExtensions->select(e | (e).oclIsTypeOf(mode::ModeMachine))->first().oclAsType(mode::ModeMachine).start))
--		
--		inv firstOnlyOnce:
--			let onlyOneFirst : Event = Expression OneTickAndNoMore(self.start) in
--			Relation Coincides(self.start,onlyOneFirst)
--endpackage