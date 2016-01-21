import 'platform:/resource/com.thalesgroup.trt.mde.vp.modesimulation/models/ModeSimulation.ecore'
-- import 'http://www.polarsys.org/capella/common/behavior/0.8.0' 
--import 'http://www.polarsys.org/capella/core/core/0.8.0'
import 'http://www.polarsys.org/capella/core/modeller/0.8.0'
--import 'http://www.polarsys.org/capella/core/common/0.8.0'
import 'http://www.polarsys.org/capella/core/fa/0.8.0' 
--import 'http://www.eclipse.org/emf/2002/Ecore'
--import 'http://www.polarsys.org/kitalpha/emde/1.0.0'


ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib" 
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib" 
ECLimport "platform:/resource/fr.inria.aoste.dataflowmode.constraint.moccml/mocc/ModeFunctionalChain.moccml"

package capellamodeller

endpackage

--package emde
--
--endpackage

package ModeSimulation 
      
endpackage  

package fa


context FunctionalChain
def : activate : Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::FunctionalChainRuntimeData)).oclAsType(ModeSimulation::FunctionalChainRuntimeData)->first().activate()
def : deactivate : Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::FunctionalChainRuntimeData)).oclAsType(ModeSimulation::FunctionalChainRuntimeData)->first().deactivate()
def : anyFunctionStart: Event = self


context AbstractFunction
	def if (self.ownedFunctions->notEmpty() 
			or (self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(AbstractFunction))) : init : Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::FunctionRuntimeData)).oclAsType(ModeSimulation::FunctionRuntimeData)->first().init()
	def if (self.ownedFunctions->notEmpty() 
			or (self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(AbstractFunction))) : makeactive : Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::FunctionRuntimeData)).oclAsType(ModeSimulation::FunctionRuntimeData)->first().activate()
	def if (self.ownedFunctions->notEmpty() 
			or (self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(AbstractFunction))) : makeinactive : Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::FunctionRuntimeData)).oclAsType(ModeSimulation::FunctionRuntimeData)->first().deactivate()
	def if (self.ownedFunctions->notEmpty() 
			or (self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(AbstractFunction))) : start : Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::FunctionRuntimeData)).oclAsType(ModeSimulation::FunctionRuntimeData)->first().start()
	def if (self.ownedFunctions->notEmpty() 
			or (self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(AbstractFunction))) : stop : Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::FunctionRuntimeData)).oclAsType(ModeSimulation::FunctionRuntimeData)->first().stop()


--	def : compute : Event = self.compute()
--	def : update : Event = self.update()
	
--	def : isSequential : Integer = 0

context FunctionalChain
	inv anyFunctionSettings:
		let anyStart: Event = Expression Union(self.enactedFunctions.start) in
		Relation Coincides(anyFunctionStart, anyStart)
	
	inv functionsStartOnlyWhenActive:
		Relation NoFunctionalChainIfNotAvailableInMode(self.activate, self.deactivate, self.anyFunctionStart)

context AbstractFunction
	inv InitOnlyOnce :
		(self.ownedFunctions->notEmpty() 
--			or (self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(AbstractFunction))
			)
		implies 
	  	(let firstInit : Event = Expression OneTickAndNoMore(init) in
	  	Relation Coincides(self.init, firstInit))
	  
	inv InitSonWithFather :
		(self.ownedFunctions->notEmpty()) implies
		(Relation Coincides(self.init,self.ownedFunctions->first().init))
	  
	inv InitAllSonTogether :
		(self.ownedFunctions->notEmpty()) implies
		(Relation Coincides(self.ownedFunctions.init))
	  
	 inv InitPrecedesStart :
	 	(self.ownedFunctions->notEmpty() 
--			or (self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(AbstractFunction))
			)
		implies
	 	(Relation Precedes(self.init,self.makeactive))

	inv AlternateStartAndFinish:
		(self.ownedFunctions->notEmpty() 
--				or (self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(AbstractFunction))
				)
		implies
	  	(Relation Alternates(self.makeactive,self.makeinactive))
	  
	inv StartFatherBeforeSon:
		(self.ownedFunctions->notEmpty()) implies
		(let firstSonStart : Event = Expression Inf(self.ownedFunctions.makeactive) in
			Relation Precedes(self.makeactive,firstSonStart))
		
	inv FinishSonBeforeFather:
		(self.ownedFunctions->notEmpty()) implies
		(let lastSonFinish: Event = Expression Sup(self.ownedFunctions.makeinactive) in
			Relation Precedes(lastSonFinish,self.makeinactive))

--context FunctionalExchange
--
----	def : sourceFunction : AbstractFunction =
----		self.sourceFunctionOutputPort.oclAsType(ecore::EObject).eContainer().oclAsType(AbstractFunction)
--		
----	def : targetFunction : AbstractFunction =
----		self.targetFunctionInputPort.oclAsType(ecore::EObject).eContainer().oclAsType(AbstractFunction)
--
--	inv SourcePrecedesTarget:
--	(let sourceFunction : AbstractFunction =
--		self.sourceFunctionOutputPort.oclAsType(ecore::EObject).eContainer().oclAsType(AbstractFunction) in
--	let targetFunction : AbstractFunction =
--		self.targetFunctionInputPort.oclAsType(ecore::EObject).eContainer().oclAsType(AbstractFunction) in
--          	(Relation Precedes((sourceFunction).makeinactive,(targetFunction).makeactive)))
--          	
--
endpackage
