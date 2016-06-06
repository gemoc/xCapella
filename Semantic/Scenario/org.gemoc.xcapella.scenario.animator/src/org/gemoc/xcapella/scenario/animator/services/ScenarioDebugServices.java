package org.gemoc.xcapella.scenario.animator.services;

import java.util.ArrayList;
import java.util.List;

import org.gemoc.executionframework.extensions.sirius.services.AbstractGemocDebuggerServices;

public class ScenarioDebugServices extends AbstractGemocDebuggerServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();

		res.add(new StringCouple("ScenarioDebug", "xCapellaDebug"));

		return res;
	}

}
