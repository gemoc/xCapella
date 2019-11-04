import 'http://www.polarsys.org/capella/core/modeller/1.3.0'
import 'http://www.polarsys.org/kitalpha/emde/1.0.0'

import 'http://www.polarsys.org/capella/core/interaction/1.3.0' 



import 'http://www.polarsys.org/capella/core/ctx/1.3.0'

import 'http://www.polarsys.org/capella/core/common/1.3.0'

import 'http://www.eclipse.org/emf/2002/Ecore'

import 'http://www.polarsys.org/capella/core/la/1.3.0' 

import 'http://www.polarsys.org/capella/core/cs/1.3.0' 

ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"

package capellamodeller
endpackage

package emde
endpackage



----ONLY FOR THALES DEMO --> SHOULD USE bcoOl

package ctx



  context SystemFunction

  

	def if (self.ownedFunctions->isEmpty()) : ACTIVATED : Event = self.getLabel()

--	def if (self.ownedFunctions->isEmpty()) : STARTED : Event = self.hasUnnamedLabel()
--
--	def if (self.ownedFunctions->isEmpty()) : TERMINATED : Event = self.hasUnnamedLabel()
--
--	def if (self.ownedFunctions->isEmpty()) : SUSPENDED : Event = self.getFullLabel()
--
--	def if (self.ownedFunctions->isEmpty()) : unsuspend : Event = self.destroy()
--
--	def if (self.ownedFunctions->isEmpty()) : isRunning : Event = self.getLabel()
--
--	def if (self.ownedFunctions->isEmpty()) : hasBeenElected : Event = self

endpackage