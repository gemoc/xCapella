package org.eclipse.gemoc.xcapella.animator.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocDebuggerServices;

public class XCapellaDebugServices extends AbstractGemocDebuggerServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();

		res.add(new StringCouple("ScenarioDebug", "xCapellaScenarioDebug"));
		res.add(new StringCouple("ScenarioDataflowDebug", "xCapellaDataflowDebug"));
		return res;
	}

	@Override
	public String getModelIdentifier() {
		// TODO Auto-generated method stub
		return "null";
	}

}
