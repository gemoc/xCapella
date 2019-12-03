package org.gemoc.xcapella.dataflow.animator.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocDebuggerServices;

public class DataflowDebugServices extends AbstractGemocDebuggerServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();

		res.add(new StringCouple("DataflowDebug", "xCapellaDebug"));

		return res;
	}

	@Override
	public String getModelIdentifier() {
		// TODO Auto-generated method stub
		return "xCapella_dataflow";
	}

}
