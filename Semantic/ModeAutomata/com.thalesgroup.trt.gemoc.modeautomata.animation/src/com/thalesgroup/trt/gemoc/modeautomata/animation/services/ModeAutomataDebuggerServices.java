package com.thalesgroup.trt.gemoc.modeautomata.animation.services;

import java.util.ArrayList;
import java.util.List;

import org.gemoc.gemoc_language_workbench.extensions.sirius.services.AbstractGemocDebuggerServices;

public class ModeAutomataDebuggerServices extends AbstractGemocDebuggerServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();
		
		res.add(new StringCouple("ModeMachine","xCapellaDebug"));
		
		return res;
	}
	
}
