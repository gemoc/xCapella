import 'http://www.polarsys.org/capella/core/modeller/1.3.0'
--import 'http://www.polarsys.org/kitalpha/emde/1.0.0'
import 'http://www.polarsys.org/capella/core/interaction/1.3.0' 

import 'http://www.polarsys.org/capella/core/ctx/1.3.0'
import 'http://www.polarsys.org/capella/core/common/1.3.0'
import 'http://www.eclipse.org/emf/2002/Ecore'
--import 'http://www.polarsys.org/capella/core/la/1.3.0' 
--import 'http://www.polarsys.org/capella/core/cs/1.3.0' 

ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"
ECLimport  "platform:/resource/org.gemoc.scenario.mocc/mocc/lib4RT.ccslLib"
ECLimport  "platform:/resource/org.gemoc.scenario.mocc/mocc/temporalConstraints.moccml" 

package capellamodeller

endpackage


----ONLY FOR THALES DEMO --> SHOULD USE bcoOl
package ctx

  context SystemFunction
  
	def if (self.ownedFunctions->isEmpty()) : ACTIVATED : Event = self.getLabel()
	def if (self.ownedFunctions->isEmpty()) : STARTED : Event = self.hasUnnamedLabel()
	def if (self.ownedFunctions->isEmpty()) : TERMINATED : Event = self.hasUnnamedLabel()
	def if (self.ownedFunctions->isEmpty()) : SUSPENDED : Event = self.getFullLabel()
	def if (self.ownedFunctions->isEmpty()) : unsuspend : Event = self.destroy()
	def if (self.ownedFunctions->isEmpty()) : isRunning : Event = self.getLabel()
	def if (self.ownedFunctions->isEmpty()) : hasBeenElected : Event = self
	
  context System
  	def : isWorking : Event = self
  --	def : isIdle : Event = self

  context SystemAnalysis
 	def : ms : Event = self
endpackage


----- END ONLY FOR THALES DEMO


package interaction 

	context MessageEnd
	 def : messEnd_occurs : Event = self.getLabel()
	 
	context ExecutionEnd
	 def : execEnd_occurs : Event = self.getLabel()
	 
	context AbstractEnd
	 def : abstractEnd_occurs : Event = self--.isOccurring()

	context InstanceRole
		inv endsInOrder:
			Relation Causes(self.abstractEnds.abstractEnd_occurs)
			
		inv nonRentrantSCenario:
			(self.abstractEnds->size() > 1) implies
			(Relation WeakAlternates(self.abstractEnds->first().abstractEnd_occurs, self.abstractEnds->last().abstractEnd_occurs))
			
	context SequenceMessage	
		inv instantaneousReply:
			(self.kind = MessageKind::REPLY) implies
			(Relation Causes(self.sendingEnd.messEnd_occurs,self.receivingEnd.messEnd_occurs))
			
		inv causalityCall:
			(self.kind <> MessageKind::REPLY) implies
			(Relation Causes(self.sendingEnd.messEnd_occurs,self.receivingEnd.messEnd_occurs))
		
		inv sendMeansActivates:
		(self.kind <> MessageKind::REPLY) implies
			(Relation Coincides(self.sendingEnd.messEnd_occurs, self.receivingFunction.oclAsType(ctx::SystemFunction).ACTIVATED)) 
			
--		inv sendifRunning:
--		(self.kind <> MessageKind::REPLY) implies
--			(Relation SubClock(self.sendingEnd.messEnd_occurs, self.sendingEnd.covered.representedInstance.oclAsType(ctx::SystemFunction).isRunning)) 

	context MessageEnd 
		inv messIsAbst:
			Relation Coincides(self.abstractEnd_occurs, self.messEnd_occurs)
	
	context ExecutionEnd
		inv execIsAbst:
			Relation Coincides(self.abstractEnd_occurs, self.execEnd_occurs)
	
	context Execution
	
			inv eitherElectedXORmessageOccured:
			Relation Exclusion(self.covered.representedInstance.oclAsType(ctx::SystemFunction).hasBeenElected, self.start.oclAsType(AbstractEnd).abstractEnd_occurs)
	
			inv startedOrrElectedMeansStarts:
			let startedOrElected : Event = Expression Union(self.covered.representedInstance.oclAsType(ctx::SystemFunction).hasBeenElected, self.start.oclAsType(AbstractEnd).abstractEnd_occurs) in
			(Relation Coincides(startedOrElected, self.covered.representedInstance.oclAsType(ctx::SystemFunction).STARTED))
--		inv startWhenEndOccurs:
--			Relation Coincides(self.covered.representedInstance.oclAsType(ctx::SystemFunction).ACTIVATED, self.start.oclAsType(AbstractEnd).abstractEnd_occurs)
		inv stopWhenEndOccurs:
			Relation Coincides(self.finish.oclAsType(AbstractEnd).abstractEnd_occurs, self.covered.representedInstance.oclAsType(ctx::SystemFunction).TERMINATED)
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
		(Relation Exclusion(self.ownedFunctionalAllocation.function.oclAsType(SystemFunction).STARTED))
	 
	inv isWorkingIfATaskIsRunning:
		let aTaskIsRunning : Event = Expression Union(self.ownedFunctionalAllocation.function.oclAsType(SystemFunction).isRunning) in
		(Relation Coincides(aTaskIsRunning, self.isWorking))
		
	
  context SystemFunction
  
  	inv unsuspendBeforeElection:
	  	(
	  		self.ownedFunctions->isEmpty()
	  	) implies
	  	(Relation Causes(self.unsuspend, self.hasBeenElected))

	inv taskTaskInv:
		(
			self.ownedFunctions->isEmpty()
		) implies
		(Relation TaskState(self.ACTIVATED,self.STARTED,self.TERMINATED,self.SUSPENDED,self.unsuspend, self.isRunning))
		
	inv isRunningTakesTime:
		(
			self.ownedFunctions->isEmpty()
		) implies
		(Relation SubClock(self.isRunning, self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().oclAsType(SystemAnalysis).ms))
	
	
	def : theSystem : ctx::SystemAnalysis = self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().oclAsType(SystemAnalysis)

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
	def : isAllocatedWithOthers : Integer = if (self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().oclAsType(SystemAnalysis).ownedSystem.ownedFunctionalAllocation.function.oclAsType(SystemFunction)->exists(sf| sf = self)) then 1 else 0 endif
	
	--suspend is the union of all synchronousCall+allOtherStarts from the same CPU
	inv SuspendIfAnotherStartOnSameCPUOrSendSynchCall: 
		(
			allSynchCallSet->size() > 0
			and
			isAllocatedWithOthers = 1
			and
			self.ownedFunctions->isEmpty()
		) implies
		(let allOtherStarts : Event = Expression Union(otherTasks.STARTED) in
		let allSynchronousCalls : Event = Expression Union(allSynchCallSet.sendingEnd.messEnd_occurs) in
		let allSuspenders : Event = Expression Union(allOtherStarts,allSynchronousCalls) in
		let allowers: Event = Expression Union(self.STARTED,self.unsuspend) in
		Relation SuspendOnlyWhenNeeded(allSuspenders, self.TERMINATED, allowers, self.SUSPENDED)) 
		
	inv SuspendIfAnotherStartOnSameCPU:
		(
			allSynchCallSet->size() = 0
			and
			isAllocatedWithOthers = 1
			and
			self.ownedFunctions->isEmpty()
		) implies
		(let allOtherStarts2 : Event = Expression Union(otherTasks.STARTED)in
		let allowers2: Event = Expression Union(self.STARTED,self.unsuspend) in
		Relation SuspendOnlyWhenNeeded(allOtherStarts2, self.TERMINATED, allowers2, self.SUSPENDED))

	inv SuspendIfSendSynchCall:
		(
			allSynchCallSet->size() > 0
			and
			isAllocatedWithOthers = 0
			and
			self.ownedFunctions->isEmpty()
		) implies
		(let allSynchronousCalls3 : Event = Expression Union(allSynchCallSet.sendingEnd.messEnd_occurs)in
		let allowers3: Event = Expression Union(self.STARTED,self.unsuspend) in
		Relation SuspendOnlyWhenNeeded(allSynchronousCalls3, self.TERMINATED, allowers3, self.SUSPENDED))

	inv NeverSuspend:
		(
			allSynchCallSet->size() = 0
			and
			isAllocatedWithOthers = 0
			and
			self.ownedFunctions->isEmpty()
		) implies
		(Relation Exclusion(self.SUSPENDED,self.SUSPENDED))


	inv UnSuspendIfAnotherTerminateOnSameCPUorReceiveSynchCall:
		(
			allReplySet->size() > 0
			and
			isAllocatedWithOthers = 1
			and
			self.ownedFunctions->isEmpty()
		) implies
		(let allOtherTerminated : Event = Expression Union(otherTasks.TERMINATED) in
		let allOtherSuspend : Event = Expression Union(otherTasks.SUSPENDED) in
		let allOtherTerminatedOrUnsuspend : Event = Expression Union(allOtherTerminated, allOtherSuspend) in
		let allSynchronousReceiveCalls : Event = Expression Union(allReplySet.receivingEnd.messEnd_occurs) in
		let allUnSuspenders : Event = Expression Union(allOtherTerminated,allSynchronousReceiveCalls) in
		Relation SuspendOnlyWhenNeeded(allUnSuspenders, self.TERMINATED, self.SUSPENDED, self.unsuspend))

	inv UnSuspendIfAnotherTerminateOnSameCPU:
		(
			allReplySet->size() = 0
			and
			isAllocatedWithOthers = 1
			and
			self.ownedFunctions->isEmpty()
		) implies
		(let allOtherTerminated2 : Event = Expression Union(otherTasks.TERMINATED) in
		Relation SuspendOnlyWhenNeeded(allOtherTerminated2, self.TERMINATED, self.SUSPENDED, self.unsuspend))

	inv UnSuspendIfReceiveSynchCall:
		(
			allReplySet->size() > 0
			and
			isAllocatedWithOthers = 0
			and
			self.ownedFunctions->isEmpty()
		) implies
		(let allSynchronousReceiveCalls2 : Event = Expression Union(allReplySet.receivingEnd.messEnd_occurs) in
		Relation SuspendOnlyWhenNeeded(allSynchronousReceiveCalls2, self.TERMINATED, self.SUSPENDED, self.unsuspend))

	inv NeverUnsuspend:
		(
			allReplySet->size() = 0
			and
			isAllocatedWithOthers = 0
			and
			self.ownedFunctions->isEmpty()
		) implies
		(Relation Exclusion(self.unsuspend,self.unsuspend))






















--	context ConstraintDuration
--		inv DurationAsAPeriodic:
--		((self.duration.startsWith('p')) and
--		self.duration.replaceAll('^..','').replaceAll(';.*','').toString().toInteger().round() <> 0) implies 
--			let  period1 : Integer = self.duration.replaceAll('^..','').replaceAll(';.*','').toString().toInteger().round() in
--			let  jitter1 : Integer = self.duration.replaceAll('..[0-9]+;','').replaceAll(']','').toString().toInteger().round() in
--			Relation PeriodicWithJitterUnknowOffset(self.start.oclAsType(AbstractEnd).abstractEnd_occurs, 
--							  self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().eContainer().oclAsType(ecore::EObject).oclAsType(ctx::SystemAnalysis).ms,
--							  period1, jitter1
--			)
--	
--	
--		inv DurationOfAllocatedExec:
--		((not (self.duration.startsWith('p'))) and
--		self.duration.replaceAll('^.','').replaceAll(';.*','').toString().toInteger().round() <> 0 and
--		self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().eContainer().oclAsType(ecore::EObject).eContents()->select(eo | (eo).oclIsKindOf(ctx::System)).oclAsType(ctx::System).ownedFunctionalAllocation.function->exists(sf | ((sf) = self.start.oclAsType(AbstractEnd).covered.representedInstance))
--		) implies 
--			let bestExecCase1 : Integer = self.duration.replaceAll('^.','').replaceAll(';.*','').toString().toInteger().round() in
--			let worstlExecCase1 : Integer = self.duration.replaceAll('.[0-9]+;','').replaceAll(']','').toString().toInteger().round() in
--			Relation Duration(self.start.oclAsType(AbstractEnd).abstractEnd_occurs, 
--							  self.finish.oclAsType(AbstractEnd).abstractEnd_occurs,
--							  self.start.oclAsType(AbstractEnd).covered.representedInstance.oclAsType(ctx::SystemFunction).isRunning,
--							  bestExecCase1, worstlExecCase1
--			)
----			self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().eContainer().oclAsType(ecore::EObject).oclAsType(ctx::SystemAnalysis).ms,
--
--		inv DurationOfNonAllocatedExec:
--		((not (self.duration.startsWith('p'))) and
--		 self.duration.replaceAll('^.','').replaceAll(';.*','').toString().toInteger().round() <> 0 and not
--		(self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().eContainer().oclAsType(ecore::EObject).eContents()->select(eo | (eo).oclIsKindOf(ctx::System)).oclAsType(ctx::System).ownedFunctionalAllocation.function->exists(sf | ((sf) = self.start.oclAsType(AbstractEnd).covered.representedInstance)))
--		) implies 
--		(	let bestExecCase : Integer = self.duration.replaceAll('^.','').replaceAll(';.*','').toString().toInteger().round() in
--			let worstlExecCase : Integer = self.duration.replaceAll('.[0-9]+;','').replaceAll(']','').toString().toInteger().round() in
--			Relation Duration(self.start.oclAsType(AbstractEnd).abstractEnd_occurs, 
--							  self.finish.oclAsType(AbstractEnd).abstractEnd_occurs,
--							  self.start.oclAsType(AbstractEnd).covered.representedInstance.oclAsType(ctx::SystemFunction).isRunning,
--							  bestExecCase, worstlExecCase)
--			)
----			 self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().eContainer().oclAsType(ecore::EObject).oclAsType(ctx::SystemAnalysis).ms,
--		inv DurationOfZero:
--		((not (self.duration.startsWith('p'))) and
--		self.duration.replaceAll('^.','').replaceAll(';.*','').toString().toInteger().round() = 0
--			and
--		 self.duration.replaceAll('.[0-9]+;','').replaceAll(']','').toString().toInteger().round() = 0
--		) implies
--		(Relation Coincides(self.start.oclAsType(AbstractEnd).abstractEnd_occurs, 
--						    self.finish.oclAsType(AbstractEnd).abstractEnd_occurs
--					 )
--		 ) 
----							self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().eContainer().oclAsType(ecore::EObject).oclAsType(ctx::SystemAnalysis).ms
--
--endpackage	
--
------ONLY FOR THALES DEMO --> SHOULD USE bcoOl
--
--
--package ctx
--
--  context System
--
--	
--	inv nonPreemptiveSched_part2:
--	(self.ownedFunctionalAllocation->size() > 0) implies
--		(Relation Exclusion(self.ownedFunctionalAllocation.function.oclAsType(SystemFunction).STARTED))
--	
--	
--	
--	inv isWorkingIfATaskIsRunning:
--		let aTaskIsRunning : Event = Expression Union(self.ownedFunctionalAllocation.function.oclAsType(SystemFunction).isRunning) in
--		Relation Coincides(aTaskIsRunning, self.isWorking)
--		
--  context SystemFunction
--  
--  	inv unsuspendBeforeElection:
--  	(self.ownedFunctions->isEmpty()) implies
--  		(Relation Causes(self.unsuspend, self.hasBeenElected))
--   
--	inv taskTaskInv:
--	(self.ownedFunctions->isEmpty()) implies
--		(Relation TaskState(self.ACTIVATED,self.STARTED,self.TERMINATED,self.SUSPENDED,self.unsuspend, self.isRunning))
--	
--	inv isRunningTakesTime:
--	(self.ownedFunctions->isEmpty()) implies
--		(Relation SubClock(self.isRunning, self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().oclAsType(SystemAnalysis).ms))
--		

--	--suspend is the union of all synchronousCall+allOtherStarts from the same CPU
--	inv SuspendIfAnotherStartOnSameCPUOrSendSynchCall: 
--		let allSynchCallSet : Collection(interaction::SequenceMessage) =
--			(self.oclAsType(ecore::EObject).eCrossReferences()->select(eo | eo.oclIsKindOf(Capability)).oclAsType(Capability).ownedScenarios.ownedMessages
--				->select(eo|
--					eo.oclIsTypeOf(interaction::SequenceMessage)
--					and eo.oclAsType(interaction::SequenceMessage).kind = interaction::MessageKind::SYNCHRONOUS_CALL
--					and eo.oclAsType(interaction::SequenceMessage).sendingFunction = self)
--			).oclAsType(interaction::SequenceMessage) in
--		
--		let otherTasks : Collection(SystemFunction) = self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().oclAsType(SystemAnalysis).ownedSystem.ownedFunctionalAllocation.function.oclAsType(SystemFunction)->select(sf| sf = self)
--			in
--		(
--			allSynchCallSet->size() > 0
--			and
--			otherTasks->size() > 0
--			and
--			self.ownedFunctions->isEmpty()
--		) implies
--		(let allOtherStarts : Event = Expression Union(otherTasks.STARTED) in
--		let allSynchronousCalls : Event = Expression Union(allSynchCallSet.sendingEnd.messEnd_occurs) in
--		let allSuspenders : Event = Expression Union(allOtherStarts,allSynchronousCalls) in
--		let allowers: Event = Expression Union(self.STARTED,self.unsuspend) in
--		Relation SuspendOnlyWhenNeeded(allSuspenders, self.TERMINATED, allowers, self.SUSPENDED)) 
--		
--		inv SuspendIfAnotherStartOnSameCPU:
--		let allSynchCallSet2 : Collection(interaction::SequenceMessage) =
--			(self.oclAsType(ecore::EObject).eCrossReferences()->select(eo | eo.oclIsKindOf(Capability)).oclAsType(Capability).ownedScenarios.ownedMessages
--				->select(eo|
--					eo.oclIsTypeOf(interaction::SequenceMessage)
--					and eo.oclAsType(interaction::SequenceMessage).kind = interaction::MessageKind::SYNCHRONOUS_CALL
--					and eo.oclAsType(interaction::SequenceMessage).sendingFunction = self)
--			).oclAsType(interaction::SequenceMessage) in
--		
--		let otherTasks2 : Collection(SystemFunction) = self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().oclAsType(SystemAnalysis).ownedSystem.ownedFunctionalAllocation.function.oclAsType(SystemFunction)->select(sf| sf = self)
--			in
--		(
--			allSynchCallSet2->size() = 0
--			and
--			otherTasks2->size() > 0
--			and
--			self.ownedFunctions->isEmpty()
--		) implies
--		(let allOtherStarts2 : Event = Expression Union(otherTasks2.STARTED)in
--		let allowers2: Event = Expression Union(self.STARTED,self.unsuspend) in
--		Relation SuspendOnlyWhenNeeded(allOtherStarts2, self.TERMINATED, allowers2, self.SUSPENDED))
--
--		inv SuspendIfSendSynchCall:
--		let allSynchCallSet3 : Collection(interaction::SequenceMessage) =
--			(self.oclAsType(ecore::EObject).eCrossReferences()->select(eo | eo.oclIsKindOf(Capability)).oclAsType(Capability).ownedScenarios.ownedMessages
--				->select(eo|
--					eo.oclIsTypeOf(interaction::SequenceMessage)
--					and eo.oclAsType(interaction::SequenceMessage).kind = interaction::MessageKind::SYNCHRONOUS_CALL
--					and eo.oclAsType(interaction::SequenceMessage).sendingFunction = self)
--			).oclAsType(interaction::SequenceMessage) in
--		
--		let otherTasks3 : Collection(SystemFunction) = self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().oclAsType(SystemAnalysis).ownedSystem.ownedFunctionalAllocation.function.oclAsType(SystemFunction)->select(sf| sf = self)
--			in
--		(
--			allSynchCallSet3->size() > 0
--			and
--			otherTasks3->size() = 0
--			and
--			self.ownedFunctions->isEmpty()
--		) implies
--		(let allSynchronousCalls3 : Event = Expression Union(allSynchCallSet3.sendingEnd.messEnd_occurs)in
--		let allowers3: Event = Expression Union(self.STARTED,self.unsuspend) in
--		Relation SuspendOnlyWhenNeeded(allSynchronousCalls3, self.TERMINATED, allowers3, self.SUSPENDED))
--
--	inv NeverSuspend:
--		let allSynchCallSet4 : Collection(interaction::SequenceMessage) =
--			(self.oclAsType(ecore::EObject).eCrossReferences()->select(eo | eo.oclIsKindOf(Capability)).oclAsType(Capability).ownedScenarios.ownedMessages
--				->select(eo|
--					eo.oclIsTypeOf(interaction::SequenceMessage)
--					and eo.oclAsType(interaction::SequenceMessage).kind = interaction::MessageKind::SYNCHRONOUS_CALL
--					and eo.oclAsType(interaction::SequenceMessage).sendingFunction = self)
--			).oclAsType(interaction::SequenceMessage) in
--		
--		let otherTasks4 : Collection(SystemFunction) = self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().oclAsType(SystemAnalysis).ownedSystem.ownedFunctionalAllocation.function.oclAsType(SystemFunction)->select(sf| sf = self)
--			in
--		(
--			allSynchCallSet4->size() = 0
--			and
--			otherTasks4->size() = 0
--			and
--			self.ownedFunctions->isEmpty()
--		) implies
--		(Relation Exclusion(self.SUSPENDED,self.SUSPENDED))

	
--	inv startsSynchronous:
--	(self.ownedFunctions->isEmpty()) implies
--		(Relation SubClock(self.STARTED, self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().oclAsType(SystemAnalysis).ms))	
----	inv terminatesSynchronous:
----	(self.ownedFunctions->isEmpty()) implies
----		(Relation SubClock(self.TERMINATED, self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().oclAsType(SystemAnalysis).ms))
--	inv SuspendsSynchronous:
--	(self.ownedFunctions->isEmpty()) implies
--		(Relation SubClock(self.SUSPENDED, self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().oclAsType(SystemAnalysis).ms))
--	inv activatedSynchronous:
--	(self.ownedFunctions->isEmpty()) implies
--		(Relation SubClock(self.ACTIVATED, self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().oclAsType(SystemAnalysis).ms))
--	inv unsuspendsSynchronous:
--	(self.ownedFunctions->isEmpty()) implies
--		(Relation SubClock(self.unsuspend, self.oclAsType(ecore::EObject).eContainer().eContainer().eContainer().oclAsType(SystemAnalysis).ms))
	
endpackage

----- END ONLY FOR THALMES DEMO	
			
			
