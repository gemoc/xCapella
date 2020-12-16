/* GENERATED FILE, do not modify manually                                                    *
 * If you need to modify it, copy it first */
package xcapella.xdsml.api.impl;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.extensions.k3.rtd.modelstate.k3ModelState.ElementState;
import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.extensions.k3.rtd.modelstate.k3ModelState.K3ModelState;
import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.extensions.k3.rtd.modelstate.k3ModelState.K3ModelStateFactory;
import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.extensions.k3.dsa.helper.IK3ModelStateHelper;import org.eclipse.gemoc.executionframework.engine.commons.K3DslHelper;


public class XcapellaModelStateHelper implements IK3ModelStateHelper{
	private static class AttributeNameToValue implements Serializable{

		private static final long serialVersionUID = 0;		String name;
		Object value;
		public AttributeNameToValue(String n, Object v) {
			name = n;
			value = v;
		}


		@Override
		public boolean equals(Object obj) {
			if (! (obj instanceof AttributeNameToValue)) {
				return false;
			}
			AttributeNameToValue a2n = (AttributeNameToValue)obj;
			if (this.name.compareTo(a2n.name) != 0) {
				return false;
			}
			if (this.value == null) {
				return a2n.value == null;
			}
			if (!this.value.equals(a2n.value)) {
				return false;
			}
			return true;
		}	}
		K3ModelStateFactory theFactory = K3ModelStateFactory.eINSTANCE; 
	public K3ModelState getK3ModelState(EObject model) {
		K3ModelState res = theFactory.createK3ModelState();

		TreeIterator<EObject> allContentIt = model.eAllContents();
		while (allContentIt.hasNext()) {
			EObject elem = allContentIt.next();

			Class<?> clazz =null;
			clazz = K3DslHelper.getTarget(org.eclipse.gemoc.xcapella.k3dsa.AbstractEndAspect.class);
			if (clazz.isInstance(elem)) {
				ElementState elemState = theFactory.createElementState();
				elemState.setModelElement(elem);
				res.getOwnedElementstates().add(elemState);
				AttributeNameToValue n2v0 = new AttributeNameToValue("occurrenceNumber", XcapellaRTDAccessor.getOccurrenceNumber((org.polarsys.capella.core.data.interaction.AbstractEnd)elem));
				elemState.getSavedRTDs().add(n2v0);
				AttributeNameToValue n2v1 = new AttributeNameToValue("occurred", XcapellaRTDAccessor.getOccurred((org.polarsys.capella.core.data.interaction.AbstractEnd)elem));
				elemState.getSavedRTDs().add(n2v1);
			}
			clazz = K3DslHelper.getTarget(org.eclipse.gemoc.xcapella.k3dsa.ComponentExchangeAspect.class);
			if (clazz.isInstance(elem)) {
				ElementState elemState = theFactory.createElementState();
				elemState.setModelElement(elem);
				res.getOwnedElementstates().add(elemState);
				AttributeNameToValue n2v0 = new AttributeNameToValue("value", XcapellaRTDAccessor.getValue((org.polarsys.capella.core.data.fa.ComponentExchange)elem));
				elemState.getSavedRTDs().add(n2v0);
			}
			clazz = K3DslHelper.getTarget(org.eclipse.gemoc.xcapella.k3dsa.PhysicalComponentAspect.class);
			if (clazz.isInstance(elem)) {
				ElementState elemState = theFactory.createElementState();
				elemState.setModelElement(elem);
				res.getOwnedElementstates().add(elemState);
				AttributeNameToValue n2v0 = new AttributeNameToValue("javaFMI_FMU", XcapellaRTDAccessor.getJavaFMI_FMU((org.polarsys.capella.core.data.pa.PhysicalComponent)elem));
				elemState.getSavedRTDs().add(n2v0);
				AttributeNameToValue n2v1 = new AttributeNameToValue("fmuAccess", XcapellaRTDAccessor.getFmuAccess((org.polarsys.capella.core.data.pa.PhysicalComponent)elem));
				elemState.getSavedRTDs().add(n2v1);
			}
			clazz = K3DslHelper.getTarget(org.eclipse.gemoc.xcapella.k3dsa.StateMachineAspect.class);
			if (clazz.isInstance(elem)) {
				ElementState elemState = theFactory.createElementState();
				elemState.setModelElement(elem);
				res.getOwnedElementstates().add(elemState);
				AttributeNameToValue n2v0 = new AttributeNameToValue("currentMode", XcapellaRTDAccessor.getCurrentMode((org.polarsys.capella.core.data.capellacommon.StateMachine)elem));
				elemState.getSavedRTDs().add(n2v0);
			}
			clazz = K3DslHelper.getTarget(org.eclipse.gemoc.xcapella.k3dsa.TimeLapseAspect.class);
			if (clazz.isInstance(elem)) {
				ElementState elemState = theFactory.createElementState();
				elemState.setModelElement(elem);
				res.getOwnedElementstates().add(elemState);
				AttributeNameToValue n2v0 = new AttributeNameToValue("isExecuting", XcapellaRTDAccessor.getIsExecuting((org.polarsys.capella.core.data.interaction.TimeLapse)elem));
				elemState.getSavedRTDs().add(n2v0);
			}
			clazz = K3DslHelper.getTarget(org.eclipse.gemoc.xcapella.k3dsa.SystemFunctionAspect.class);
			if (clazz.isInstance(elem)) {
				ElementState elemState = theFactory.createElementState();
				elemState.setModelElement(elem);
				res.getOwnedElementstates().add(elemState);
				AttributeNameToValue n2v0 = new AttributeNameToValue("isStarted", XcapellaRTDAccessor.getIsStarted((org.polarsys.capella.core.data.ctx.SystemFunction)elem));
				elemState.getSavedRTDs().add(n2v0);
				AttributeNameToValue n2v1 = new AttributeNameToValue("isEnacted", XcapellaRTDAccessor.getIsEnacted((org.polarsys.capella.core.data.ctx.SystemFunction)elem));
				elemState.getSavedRTDs().add(n2v1);
				AttributeNameToValue n2v2 = new AttributeNameToValue("runCycles", XcapellaRTDAccessor.getRunCycles((org.polarsys.capella.core.data.ctx.SystemFunction)elem));
				elemState.getSavedRTDs().add(n2v2);
			}
			clazz = K3DslHelper.getTarget(org.eclipse.gemoc.xcapella.k3dsa.PhysicalArchitectureAspect.class);
			if (clazz.isInstance(elem)) {
				ElementState elemState = theFactory.createElementState();
				elemState.setModelElement(elem);
				res.getOwnedElementstates().add(elemState);
				AttributeNameToValue n2v0 = new AttributeNameToValue("currentTime", XcapellaRTDAccessor.getCurrentTime((org.polarsys.capella.core.data.pa.PhysicalArchitecture)elem));
				elemState.getSavedRTDs().add(n2v0);
			}
		}
		return res;
		}

	public void restoreModelState(K3ModelState state) {
		for(ElementState elemState : state.getOwnedElementstates()) {
			for(Object o : elemState.getSavedRTDs()) {
				AttributeNameToValue n2v = (AttributeNameToValue)o;
				try {
					if (n2v.value != null) {
						Method m = XcapellaRTDAccessor.class.getMethod("set"+n2v.name, EObject.class, n2v.value.getClass());
						m.invoke(null, elemState.getModelElement(), n2v.value);
					}
				} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					Method m = null;
					for(Class<?> c : n2v.value.getClass().getInterfaces()) {
						
						try {
							m = XcapellaRTDAccessor.class.getMethod("set"+n2v.name, EObject.class, n2v.value.getClass().getInterfaces()[0]);
							m.invoke(null, elemState.getModelElement(), n2v.value);
						} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e1) {
						}
						if (m == null) {
							throw new RuntimeException("not method found for "+n2v.value.getClass().getName()+"::set"+n2v.name);
						}
					}
				}
			}
		}
	}

};