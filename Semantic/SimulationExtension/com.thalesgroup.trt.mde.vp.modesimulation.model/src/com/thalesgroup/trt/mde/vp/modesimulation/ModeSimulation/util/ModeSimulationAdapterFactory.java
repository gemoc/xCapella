package com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.util;

import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.common.data.modellingcore.AbstractNamedElement;
import org.polarsys.capella.common.data.modellingcore.ModelElement;
import org.polarsys.capella.common.data.modellingcore.PublishableElement;
import org.polarsys.capella.common.data.modellingcore.TraceableElement;

import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.NamedElement;

import org.polarsys.kitalpha.emde.model.Element;
import org.polarsys.kitalpha.emde.model.ElementExtension;
import org.polarsys.kitalpha.emde.model.ExtensibleElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ModeSimulationPackage
 * @generated
 */
public class ModeSimulationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModeSimulationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeSimulationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModeSimulationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeSimulationSwitch<Adapter> modelSwitch = new ModeSimulationSwitch<Adapter>() {
		@Override
		public Adapter caseTransitionRuntimeData(TransitionRuntimeData object) {
			return createTransitionRuntimeDataAdapter();
		}

		@Override
		public Adapter caseModeRuntimeData(ModeRuntimeData object) {
			return createModeRuntimeDataAdapter();
		}

		@Override
		public Adapter caseGuardRuntimeData(GuardRuntimeData object) {
			return createGuardRuntimeDataAdapter();
		}

		@Override
		public Adapter caseMachineRuntimeData(MachineRuntimeData object) {
			return createMachineRuntimeDataAdapter();
		}

		@Override
		public Adapter caseComponentRuntimeData(ComponentRuntimeData object) {
			return createComponentRuntimeDataAdapter();
		}

		@Override
		public Adapter caseFunctionRuntimeData(FunctionRuntimeData object) {
			return createFunctionRuntimeDataAdapter();
		}

		@Override
		public Adapter caseFunctionalChainRuntimeData(
				FunctionalChainRuntimeData object) {
			return createFunctionalChainRuntimeDataAdapter();
		}

		@Override
		public Adapter caseExpressionRuntimeData(ExpressionRuntimeData object) {
			return createExpressionRuntimeDataAdapter();
		}

		@Override
		public Adapter caseClockRuntimeData(ClockRuntimeData object) {
			return createClockRuntimeDataAdapter();
		}

		@Override
		public Adapter caseEventRuntimeData(EventRuntimeData object) {
			return createEventRuntimeDataAdapter();
		}

		@Override
		public Adapter caseActionRuntimeData(ActionRuntimeData object) {
			return createActionRuntimeDataAdapter();
		}

		@Override
		public Adapter caseElement(Element object) {
			return createElementAdapter();
		}

		@Override
		public Adapter caseExtensibleElement(ExtensibleElement object) {
			return createExtensibleElementAdapter();
		}

		@Override
		public Adapter caseModelElement(ModelElement object) {
			return createModelElementAdapter();
		}

		@Override
		public Adapter caseAbstractNamedElement(AbstractNamedElement object) {
			return createAbstractNamedElementAdapter();
		}

		@Override
		public Adapter caseTraceableElement(TraceableElement object) {
			return createTraceableElementAdapter();
		}

		@Override
		public Adapter casePublishableElement(PublishableElement object) {
			return createPublishableElementAdapter();
		}

		@Override
		public Adapter caseCapellaElement(CapellaElement object) {
			return createCapellaElementAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseElementExtension(ElementExtension object) {
			return createElementExtensionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.TransitionRuntimeData <em>Transition Runtime Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.TransitionRuntimeData
	 * @generated
	 */
	public Adapter createTransitionRuntimeDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ModeRuntimeData <em>Mode Runtime Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ModeRuntimeData
	 * @generated
	 */
	public Adapter createModeRuntimeDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.GuardRuntimeData <em>Guard Runtime Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.GuardRuntimeData
	 * @generated
	 */
	public Adapter createGuardRuntimeDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.MachineRuntimeData <em>Machine Runtime Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.MachineRuntimeData
	 * @generated
	 */
	public Adapter createMachineRuntimeDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ComponentRuntimeData <em>Component Runtime Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ComponentRuntimeData
	 * @generated
	 */
	public Adapter createComponentRuntimeDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionRuntimeData <em>Function Runtime Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionRuntimeData
	 * @generated
	 */
	public Adapter createFunctionRuntimeDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionalChainRuntimeData <em>Functional Chain Runtime Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionalChainRuntimeData
	 * @generated
	 */
	public Adapter createFunctionalChainRuntimeDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ExpressionRuntimeData <em>Expression Runtime Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ExpressionRuntimeData
	 * @generated
	 */
	public Adapter createExpressionRuntimeDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ClockRuntimeData <em>Clock Runtime Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ClockRuntimeData
	 * @generated
	 */
	public Adapter createClockRuntimeDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.EventRuntimeData <em>Event Runtime Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.EventRuntimeData
	 * @generated
	 */
	public Adapter createEventRuntimeDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ActionRuntimeData <em>Action Runtime Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ActionRuntimeData
	 * @generated
	 */
	public Adapter createActionRuntimeDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.emde.model.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.emde.model.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.emde.model.ExtensibleElement <em>Extensible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.emde.model.ExtensibleElement
	 * @generated
	 */
	public Adapter createExtensibleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.capella.common.data.modellingcore.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.capella.common.data.modellingcore.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.capella.common.data.modellingcore.AbstractNamedElement <em>Abstract Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.capella.common.data.modellingcore.AbstractNamedElement
	 * @generated
	 */
	public Adapter createAbstractNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.capella.common.data.modellingcore.TraceableElement <em>Traceable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.capella.common.data.modellingcore.TraceableElement
	 * @generated
	 */
	public Adapter createTraceableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.capella.common.data.modellingcore.PublishableElement <em>Publishable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.capella.common.data.modellingcore.PublishableElement
	 * @generated
	 */
	public Adapter createPublishableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.capella.core.data.capellacore.CapellaElement <em>Capella Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.capella.core.data.capellacore.CapellaElement
	 * @generated
	 */
	public Adapter createCapellaElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.capella.core.data.capellacore.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.capella.core.data.capellacore.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.emde.model.ElementExtension <em>Element Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.emde.model.ElementExtension
	 * @generated
	 */
	public Adapter createElementExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModeSimulationAdapterFactory
