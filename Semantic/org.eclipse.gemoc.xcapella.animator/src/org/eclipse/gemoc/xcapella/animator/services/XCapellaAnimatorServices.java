package org.eclipse.gemoc.xcapella.animator.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.ctx.SystemFunction;
import org.polarsys.capella.core.data.interaction.InstanceRole;
import org.polarsys.kitalpha.emde.model.ElementExtension;

import xcapella.xdsml.api.impl.XcapellaRTDAccessor;


public class XCapellaAnimatorServices extends AbstractGemocAnimatorServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();
		
		res.add(new StringCouple("ScenarioAnimation","xCapellaScenarioAnimation"));
		res.add(new StringCouple("DataflowAnimation","xCapellaDataflowAnimation"));
		res.add(new StringCouple("SystemArchitectureAnimation","xCapellaSAFAnimation"));
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
			System.out.println("isStarted: "+((InstanceRole)eo).getRepresentedInstance().getName()+" "+XcapellaRTDAccessor.getisStarted(((InstanceRole)eo).getRepresentedInstance()) );
			return XcapellaRTDAccessor.getisStarted(((InstanceRole)eo).getRepresentedInstance());
		}else if (eo instanceof SystemFunction) {
			System.out.println("isStarted: "+((SystemFunction)eo).getName()+" "+XcapellaRTDAccessor.getisStarted(eo));
			return XcapellaRTDAccessor.getisStarted(eo);
		}else {
			return false;
		}
	}
	
	public boolean isStopped(EObject eo) {
		if (eo instanceof InstanceRole) {
			return XcapellaRTDAccessor.getisStopped(((InstanceRole)eo).getRepresentedInstance());
		}else if (eo instanceof SystemFunction) {
			System.out.println("isStopped: "+((SystemFunction)eo).getName()+" "+XcapellaRTDAccessor.getisStopped(eo));
			return XcapellaRTDAccessor.getisStopped(eo);
		}else{
			return false;
		}
	}
	
	public boolean isSuspended(EObject eo) {
		if (eo instanceof InstanceRole) {
			return XcapellaRTDAccessor.getisSuspended(((InstanceRole)eo).getRepresentedInstance());
		}else if (eo instanceof SystemFunction) {
			System.out.println("isSuspended: "+((SystemFunction)eo).getName()+" "+XcapellaRTDAccessor.getisSuspended(eo));
			return XcapellaRTDAccessor.getisSuspended(eo);
		}else{
			return false;
		}
	}
	
	public boolean isReady(EObject eo) {
		
		if (eo instanceof InstanceRole) {
			System.out.println("isReady: "+XcapellaRTDAccessor.getisReady(((InstanceRole)eo).getRepresentedInstance()));
			return XcapellaRTDAccessor.getisReady(((InstanceRole)eo).getRepresentedInstance());
		}else if (eo instanceof SystemFunction) {
			System.out.println("isReady: "+((SystemFunction)eo).getName()+" "+XcapellaRTDAccessor.getisReady(eo));
			return XcapellaRTDAccessor.getisReady(eo);
		}else{
			return false;
		}
	}
	
	public int getRunningCycles(EObject eo) {
		if (eo instanceof InstanceRole) {
			return XcapellaRTDAccessor.getrunCycles(((InstanceRole)eo).getRepresentedInstance());
		}else if (eo instanceof SystemFunction) {
			System.out.println("getRunCycle: "+((SystemFunction)eo).getName()+" "+XcapellaRTDAccessor.getrunCycles(eo));
			return XcapellaRTDAccessor.getrunCycles(eo);
		}else {
			return 0;
		}
	}
	
	


}
