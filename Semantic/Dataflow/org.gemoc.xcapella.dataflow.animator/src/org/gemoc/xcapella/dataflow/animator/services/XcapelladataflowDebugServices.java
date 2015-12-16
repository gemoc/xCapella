package org.gemoc.xcapella.dataflow.animator.services;

import java.util.ArrayList;
import java.util.List;

import org.gemoc.gemoc_language_workbench.extensions.sirius.services.AbstractGemocDebuggerServices;

public class XcapelladataflowDebugServices extends AbstractGemocDebuggerServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();

		res.add(new StringCouple("xCapella Dataflow", "Debug"));

		return res;
	}

}
