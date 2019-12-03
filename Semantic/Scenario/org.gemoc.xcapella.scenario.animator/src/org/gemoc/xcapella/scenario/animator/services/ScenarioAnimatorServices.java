package org.gemoc.xcapella.scenario.animator.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.interaction.InstanceRole;
import org.polarsys.kitalpha.emde.model.ElementExtension;

import xcapellascenario.xdsml.api.impl.XCapellaScenarioRTDAccessor;

public class ScenarioAnimatorServices extends AbstractGemocAnimatorServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();
		
		res.add(new StringCouple("ScenarioAnimation","xCapellaAnimation"));

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
		

		return super.hasBeenActivated(instruction);
	}


	public boolean isStarted(EObject eo) {
		if (eo instanceof InstanceRole) {
			System.out.println("isStarted: "+((InstanceRole)eo).getRepresentedInstance().getName()+" "+XCapellaScenarioRTDAccessor.getisStarted(((InstanceRole)eo).getRepresentedInstance()) );
			return XCapellaScenarioRTDAccessor.getisStarted(((InstanceRole)eo).getRepresentedInstance());
		}else {
			return false;
		}
	}
	
	public boolean isStopped(EObject eo) {
		if (eo instanceof InstanceRole) {
			return XCapellaScenarioRTDAccessor.getisStopped(((InstanceRole)eo).getRepresentedInstance());
		}else {
			return false;
		}
	}
	
	public boolean isSuspended(EObject eo) {
		if (eo instanceof InstanceRole) {
			return XCapellaScenarioRTDAccessor.getisSuspended(((InstanceRole)eo).getRepresentedInstance());
		}else {
			return false;
		}
	}
	
	public boolean isReady(EObject eo) {
		
		if (eo instanceof InstanceRole) {
			System.out.println("isReady: "+XCapellaScenarioRTDAccessor.getisReady(((InstanceRole)eo).getRepresentedInstance()));
			return XCapellaScenarioRTDAccessor.getisReady(((InstanceRole)eo).getRepresentedInstance());
		}else {
			return false;
		}
	}
	
	public int getRunningCycles(EObject eo) {
		if (eo instanceof InstanceRole) {
			return XCapellaScenarioRTDAccessor.getrunCycles(((InstanceRole)eo).getRepresentedInstance());
		}else {
			return 0;
		}
	}
	
	


}
