package com.thalesgroup.trt.gemoc.modeautomata.animation.services;

import org.polarsys.capella.common.data.behavior.AbstractEvent;

import com.thalesgroup.trt.mde.vp.al.al.Action;
import com.thalesgroup.trt.mde.vp.statemode.statemode.*;

/** modeautomata services.
 * 
 * 
 * 
 */
public class ModeAutomataServices {

	/**
	 * Gets the label for the given {@link Transition}.
	 * 
	 * @param transition
	 *            the {@link Transition}
	 * @return the label for the given {@link Transition}
	 */
	public String getLabel(Transition transition) {
		final StringBuilder res = new StringBuilder();
			
			if (transition.getTrigger() != null){
				res.append("when ");
				res.append(transition.getTrigger().toString());
			}
			
			if (transition.getGuard() != null){
				res.append("[");
				res.append(transition.getGuard().toString());
				res.append("] ");
			}
			
			res.append("\n / \n");
		for(Action e : transition.getActions()){
			res.append(e.toString()+"\n");
		}
		res.append("\n");
		for (AbstractEvent event : transition.getGeneratedEvents()) {
			res.append(" !");
			res.append(event.getName());
			res.append(";");
		}

		return res.toString();
	}


}
