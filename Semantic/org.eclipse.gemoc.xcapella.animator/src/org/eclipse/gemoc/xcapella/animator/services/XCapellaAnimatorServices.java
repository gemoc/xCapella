package org.eclipse.gemoc.xcapella.animator.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices;
import org.polarsys.capella.core.data.capellacommon.Mode;
import org.polarsys.capella.core.data.capellacommon.StateMachine;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.ctx.SystemFunction;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.interaction.InstanceRole;
import org.polarsys.capella.core.data.interaction.TimeLapse;
import org.polarsys.capella.core.data.pa.PhysicalArchitecture;
import org.polarsys.kitalpha.emde.model.ElementExtension;

import xcapella.xdsml.api.impl.XcapellaRTDAccessor;


public class XCapellaAnimatorServices extends AbstractGemocAnimatorServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();
		
		res.add(new StringCouple("ScenarioAnimation","Animation"));
		res.add(new StringCouple("DataflowAnimation","Animation"));
		res.add(new StringCouple("SystemArchitectureAnimation","Animation"));
		res.add(new StringCouple("ModesAnimation","Animation"));
		return res;
	}

	@Override
	public boolean hasBeenActivated(EObject instruction) {
		// TODO Auto-generated method stub
		
//		if(instruction instanceof CapellaElement){
//			EList<ElementExtension> ownedExs = ((CapellaElement)instruction).getOwnedExtensions();
//			
//			
//			boolean res=false; 
//			for (ElementExtension elementExtension : ownedExs) {
//				
//				res  = super.hasBeenActivated(elementExtension);
//				if(res) return true;
//		
//			}
//		}
		

		return super.hasBeenActivated(instruction);
	}


	public boolean isStarted(EObject eo) {
		if (eo instanceof InstanceRole) {
//			System.out.println("isStarted: "+((InstanceRole)eo).getRepresentedInstance().getName()+" "+XcapellaRTDAccessor.getisStarted(((InstanceRole)eo).getRepresentedInstance()) );
			if(((InstanceRole)eo).getRepresentedInstance() instanceof SystemFunction) {
				return XcapellaRTDAccessor.getIsStarted((SystemFunction) ((InstanceRole)eo).getRepresentedInstance());
			} else {
				return false;
			}
		}else if (eo instanceof SystemFunction) {
//			System.out.println("isStarted: "+((SystemFunction)eo).getName()+" "+XcapellaRTDAccessor.getisStarted(eo));
			return XcapellaRTDAccessor.getIsStarted((SystemFunction)eo);
		} else {
			return false;
		}
	}
	

	
	public boolean isEnacted(EObject eo) {
			if (eo instanceof SystemFunction) {
				return XcapellaRTDAccessor.getIsEnacted((SystemFunction)eo);
			}
			return false;
	}
	
	public boolean isUnEnacted(EObject eo) {
		return !isEnacted(eo);
	}
	
	public int getRunningCycles(EObject eo) {
		if (eo instanceof InstanceRole) {
			if(((InstanceRole)eo).getRepresentedInstance() instanceof SystemFunction) {
				return XcapellaRTDAccessor.getRunCycles((SystemFunction) ((InstanceRole)eo).getRepresentedInstance());
			} else {
				return 0;
			}
		}else if (eo instanceof SystemFunction) {
//			System.out.println("getRunCycle: "+((SystemFunction)eo).getName()+" "+XcapellaRTDAccessor.getrunCycles(eo));
			return XcapellaRTDAccessor.getRunCycles((SystemFunction)eo);
		}else {
			return 0;
		}
	}
	
	public boolean isCurrentMode(EObject eo) {
		if (eo instanceof Mode) {
			Mode cm = XcapellaRTDAccessor.getCurrentMode((StateMachine) eo.eContainer().eContainer());
			if (cm != null) {
				return ((Mode) eo).getId().compareTo(cm.getId()) == 0;
			}
		}
		return false;
	}
	
	public int getCurrentTime(EObject eo) {
		if (eo instanceof PhysicalArchitecture) {
			return XcapellaRTDAccessor.getCurrentTime((PhysicalArchitecture)eo);
		}
		else {
			return 0;
		}
	}
	
	public double getValue(EObject eo) {
		if (eo instanceof ComponentExchange) {
			return XcapellaRTDAccessor.getValue((ComponentExchange)eo);
		}
		else {
			return -999.0;
		}
	}


}
