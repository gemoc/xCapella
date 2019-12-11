package org.eclipse.gemoc.xcapella.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import org.polarsys.capella.core.data.fa.AbstractFunction

/*
 * 
 * Simple Ecore extension allowing to annotate all classes of an ecore model by adding 
 * an annotation containing the list of all super classes (flat)  
 */
 
 
@Aspect(className=AbstractFunction)
class AbstractFunctionAspect {
	
	def void getLabel(){
		println("getLabel() of "+_self.name)
	}
}

