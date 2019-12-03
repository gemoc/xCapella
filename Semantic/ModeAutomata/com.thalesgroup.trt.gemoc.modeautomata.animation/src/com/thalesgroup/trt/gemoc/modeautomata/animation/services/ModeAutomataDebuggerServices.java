package com.thalesgroup.trt.gemoc.modeautomata.animation.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gemoc.dsl.debug.ide.sirius.ui.services.AbstractDSLDebuggerServices.StringCouple;
import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocDebuggerServices;

public class ModeAutomataDebuggerServices extends AbstractGemocDebuggerServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();
		
		res.add(new StringCouple("ModeMachine","xCapellaDebug"));
		
		return res;
	}

	@Override
	public String getModelIdentifier() {
		// TODO Auto-generated method stub
		return "null";
	}
	
}
