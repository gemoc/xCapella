package org.gemoc.scenario.xdsml;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.gemoc.scenario.xdsml.FunctionScenarioMT;

@SuppressWarnings("all")
public class FunctionScenario implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static FunctionScenario load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    FunctionScenario mm = new FunctionScenario();
    mm.setResource(res);
    return mm ;
  }
  
  public FunctionScenarioMT toFunctionScenarioMT() {
    org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioAdapter adaptee = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
