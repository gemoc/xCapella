import 'http://www.polarsys.org/capella/core/modeller/1.3.0'
import 'http://www.eclipse.org/emf/2002/Ecore'
import 'http://www.polarsys.org/capella/core/fa/1.3.0'
import 'http://www.polarsys.org/capella/core/pa/1.3.0'

ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"

 
package capellamodeller 

endpackage
package pa
	
	context PhysicalComponent
																		--we are reusing already existing EOperation to avoid using Kitalpha here
		def if (self.ownedPhysicalComponents->isEmpty() and self.description.startsWith('fmuPath:'))
				: fire : Event = self.getFullLabel()
		def if (self.ownedPhysicalComponents->isEmpty() and self.description.startsWith('fmuPath:')) 
				: postFire : Event = self.hasUnnamedLabel()
		def if (self.ownedPhysicalComponents->isEmpty() and self.description.startsWith('fmuPath:'))  
				: initialize : Event = self.getLabel() 
--		def if (self.ownedPhysicalComponents->isEmpty() and self.description.startsWith('fmuPath:'))  
--				: terminate : Event = self.toString()
		
	context PhysicalArchitecture
  		def : ticks : Event = self.getLabel()

	context PhysicalArchitecture
	
		def : theFMUs : Sequence(PhysicalComponent) = self.ownedPhysicalComponent.oclAsType(ecore::EObject)->closure(e | e.eContents().oclAsType(ecore::EObject))->select(pc|pc.oclIsKindOf(pa::PhysicalComponent) and pc.oclAsType(pa::PhysicalComponent).ownedPhysicalComponents->isEmpty() and pc.oclAsType(pa::PhysicalComponent).description <> null and pc.oclAsType(pa::PhysicalComponent).description.startsWith('fmuPath'))->asSequence().oclAsType(pa::PhysicalComponent)

	
		inv synchronousInit: 
		 	(Relation Coincides(theFMUs.initialize))
		 	
		inv synchronousFire:
		 	(Relation Coincides(theFMUs.fire)) 
		 	
		inv synchronousPostFire:
		 	(Relation Coincides(theFMUs.postFire)) 
		
--		inv synchronousTerminate:
--		 	(Relation Coincides(theFMUs.terminate))		 	
--		 
		 
 		inv fireThenPostFire:
 			(theFMUs->size() > 0) implies
 			(Relation Coincides(theFMUs->first().fire, 
 								theFMUs->first().postFire
 			))
 		
 		inv timeThenFire:
 			(theFMUs->size() > 0) implies
 			(Relation Coincides(theFMUs->first().postFire, 
 								self.ticks
 			))
 		
 		inv onlyOneInit:
 			(theFMUs->size() > 0) implies
 			(let firstInit : Event = Expression OneTickAndNoMore(theFMUs->first().initialize) in
 			  Relation Coincides(theFMUs->first().initialize, firstInit))
 		
 		inv initFirst:
 			(theFMUs->size() > 0) implies
 			(let firstFire : Event = Expression OneTickAndNoMore(theFMUs->first().fire) in
 			Relation Precedes(theFMUs->first().initialize, firstFire))
 			
-- 		inv initBeforeTerminate:
-- 			(theFMUs->size() > 0) implies
-- 			Relation Precedes(theFMUs->first().initialize, theFMUs->first().terminate)
-- 		
-- 		inv terminateAlone1:
-- 			(theFMUs->size() > 0) implies
-- 			Relation Exclusion(theFMUs->first().fire, theFMUs->first().terminate)
-- 		inv terminateAlone2:
-- 			(theFMUs->size() > 0) implies
-- 			Relation Exclusion(theFMUs->first().postFire, theFMUs->first().terminate)
-- 		inv terminateAlone3: 
-- 			(theFMUs->size() > 0) implies
-- 			Relation Exclusion(self.ticks, theFMUs->first().terminate)
 		
endpackage
