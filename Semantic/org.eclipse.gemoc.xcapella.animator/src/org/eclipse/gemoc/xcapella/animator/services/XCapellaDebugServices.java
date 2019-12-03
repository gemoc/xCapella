package org.eclipse.gemoc.xcapella.animator.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocDebuggerServices;

public class XCapellaDebugServices extends AbstractGemocDebuggerServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();

//		res.add(new StringCouple("ScenarioDebug", "Debug"));
//		res.add(new StringCouple("DataflowDebug", "Debug"));
		return res;
	}

	@Override
	public String getModelIdentifier() {
		return "xCapella";
	}

}
