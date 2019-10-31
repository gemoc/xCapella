package org.gemoc.xcapella.dataflow.animator.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.kitalpha.emde.model.ElementExtension;

import xcapellascenario.xdsml.api.impl.XCapellaScenarioRTDAccessor;

public class DataflowAnimatorServices extends AbstractGemocAnimatorServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();
		
		res.add(new StringCouple("DataflowAnimation","xCapellaAnimation"));
		res.add(new StringCouple("SystemArchitectureAnimation","xCapellaAnimation"));
		return res;
	}

	@Override
	public boolean hasBeenActivated(EObject instruction) {
		// TODO Auto-generated method stub
		
		if(instruction instanceof CapellaElement){
			EList<ElementExtension> ownedExs = ((CapellaElement)instruction).getOwnedExtensions();
			
			
			boolean res=false; 
			for (ElementExtension elementExtension : ownedExs) {
				
				res  = super.hasBeenActivated(elementExtension);
				if(res) return true;
		
			}
		}
		

		return false;
	}

	public boolean isStarted(EObject eo) {
		System.out.println("DF: isStarted: "+XCapellaScenarioRTDAccessor.getisReady(eo));
		return XCapellaScenarioRTDAccessor.getisStarted(eo);
	}
	
	public boolean isStopped(EObject eo) {
		return XCapellaScenarioRTDAccessor.getisStopped(eo);
	}
	
	public boolean isSuspended(EObject eo) {
		return XCapellaScenarioRTDAccessor.getisSuspended(eo);
	}
	
	public boolean isReady(EObject eo) {
		System.out.println("DF: isReady: "+XCapellaScenarioRTDAccessor.getisReady(eo));
		return XCapellaScenarioRTDAccessor.getisReady(eo);
	}
	
	public int getRunningCycles(EObject eo) {
			return XCapellaScenarioRTDAccessor.getrunCycles(eo);
	}


}
