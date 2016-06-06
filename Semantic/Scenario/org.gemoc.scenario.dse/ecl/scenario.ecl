import 'http://www.polarsys.org/capella/core/modeller/0.8.0'
import 'http://www.polarsys.org/kitalpha/emde/1.0.0'
import 'http://www.polarsys.org/capella/core/interaction/0.8.0' 

import 'http://www.polarsys.org/capella/core/ctx/0.8.0'
import 'http://www.polarsys.org/capella/core/common/0.8.0'
import 'http://www.eclipse.org/emf/2002/Ecore'
import 'http://www.polarsys.org/capella/core/fa/0.8.0' 


ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"

ECLimport  "platform:/resource/org.gemoc.scenario.mocc/mocc/lib4RT.ccslLib"
ECLimport  "platform:/resource/org.gemoc.scenario.mocc/mocc/temporalConstraints.moccml" 

package capellamodeller

endpackage

package emde

endpackage


----ONLY FOR THALES DEMO --> SHOULD USE bcoOl
--package fa
--
--context AbstractFunction
----	def if ( (self.ownedFunctions->notEmpty() and not self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(FunctionPkg)) 
----			or (self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(AbstractFunction))) : makeactive : Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::FunctionRuntimeData)).oclAsType(ModeSimulation::FunctionRuntimeData)->first().activate()
--
--	def if (self.ownedFunctions->isEmpty()) : begin : Event = self
--	def if (self.ownedFunctions->isEmpty()) : stop : Event = self
--
--endpackage


----- END ONLY FOR THALMES DEMO





package ctx

	context Capability
	 def : globalClock : Event = self
endpackage


package interaction

	context Execution
	 def : begin : Event = self.getFullLabel()
	 def : stop : Event = self.getFullLabel()


	context MessageEnd
	 def : messEnd_occurs : Event = self.getLabel()
	 
	context ExecutionEnd
	 def : execEnd_occurs : Event = self.getLabel()
	 
	context AbstractEnd
	 def : abstractEnd_occurs : Event = self--.isOccurring()
	
	context SequenceMessage
 	 def : AnyReceivingOccurs: Event = self 
	
	
	
	context InstanceRole
		inv endsInOrder:
			Relation Precedes(self.abstractEnds.abstractEnd_occurs)
			
		inv nonRentrantSCenario:
			(self.abstractEnds->size() > 1) implies
			(Relation Alternates(self.abstractEnds->first().abstractEnd_occurs, self.abstractEnds->last().abstractEnd_occurs))
			
	context SequenceMessage
		inv startPrecedesEnd:
			Relation Precedes(self.sendingEnd.messEnd_occurs, self.receivingEnd.messEnd_occurs)
	
		inv unionConstruction:
			let UnionofallReceptionOfMessageOfSameName : Event = Expression Union(self.oclAsType(ecore::EObject).eContainer().allSubobjectsOfKind(SequenceMessage)->select(me | (me).oclAsType(SequenceMessage).name.toString() = (self.name.toString())).oclAsType(SequenceMessage).receivingEnd.messEnd_occurs) in
			Relation Coincides(UnionofallReceptionOfMessageOfSameName, self.AnyReceivingOccurs)
	
	context MessageEnd 
		inv messIsAbst:
			Relation Coincides(self.abstractEnd_occurs, self.messEnd_occurs)
	
	context ExecutionEnd
		inv execIsAbst:
			Relation Coincides(self.abstractEnd_occurs, self.execEnd_occurs)
	
	----ONLY FOR THALES DEMO --> should use BCOoL
	context Execution
		inv startWhenStarted:
			Relation Coincides(self.begin, self.start.oclAsType(AbstractEnd).abstractEnd_occurs)
		inv stopWhenStopped:
			Relation Coincides(self.stop, self.finish.oclAsType(AbstractEnd).abstractEnd_occurs)
	
	----END ONLY FOR THALES DEMO
	
	context Execution
		inv startBeforeFinish:
			Relation Precedes(self.start.oclAsType(AbstractEnd).abstractEnd_occurs, self.finish.oclAsType(AbstractEnd).abstractEnd_occurs)

 
--	context AbstractEnd	
--		inv periodicExecJitter:
--			(self.arrivalPeriod <> 0 and self.periodPrecision = 0) implies
--			let period : Integer = self.arrivalPeriod in
--			let itsJitter : Integer = self.jitter in
--			(Relation PeriodicWithJitter(self.abstractEnd_occurs, 
--										 self.oclAsType(ecore::EObject).eContainer().oclAsType(Interaction).globalClock,
--										 period, itsJitter
--			)) 
--	
--		inv periodicExecPrecision:
--			(self.arrivalPeriod <> 0 and self.periodPrecision <> 0) implies
--			let zero2 : Integer = 0 in
--			let period2 : Integer = (self.arrivalPeriod - (self.arrivalPeriod * (self.periodPrecision/100))).round() in
--			(Relation PeriodicSignal(self.abstractEnd_occurs, 
--										 self.oclAsType(ecore::EObject).eContainer().oclAsType(Interaction).globalClock,
--										 zero2, period2
--			))
	
	context ConstraintDuration
		inv DurationOfExec: 
			let bestExecCase : Integer = self.duration.replaceAll('^.','').replaceAll(';.*','').toString().toInteger().round() in
			let worstExecCase : Integer = self.duration.replaceAll('.[0-9]+;','').replaceAll(']','').toString().toInteger().round() in
			Relation Duration(self.start.oclAsType(AbstractEnd).abstractEnd_occurs, 
							  self.finish.oclAsType(AbstractEnd).abstractEnd_occurs,
							  self.oclAsType(ecore::EObject).eContainer().oclAsType(Scenario).oclAsType(ecore::EObject).eContainer().oclAsType(ctx::Capability).globalClock,
							  bestExecCase, worstExecCase
			)
endpackage		
			
			
