package org.eclipse.gemoc.xcapella.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import groovy.lang.Binding
import groovy.lang.GroovyShell
import java.util.ArrayList
import java.util.List
import java.util.Map
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.JavaCore
import org.polarsys.capella.common.data.activity.OutputPin
import org.polarsys.capella.core.data.capellacommon.Mode
import org.polarsys.capella.core.data.capellacommon.StateMachine
import org.polarsys.capella.core.data.capellacommon.StateTransition
import org.polarsys.capella.core.data.ctx.System
import org.polarsys.capella.core.data.ctx.SystemFunction
import org.polarsys.capella.core.data.information.ExchangeItem
import org.polarsys.capella.core.data.interaction.AbstractEnd
import org.polarsys.capella.core.data.interaction.Execution
import org.polarsys.capella.core.data.interaction.MessageEnd
import org.polarsys.capella.core.data.interaction.Scenario
import org.polarsys.capella.core.data.interaction.TimeLapse

import static extension org.eclipse.gemoc.xcapella.k3dsa.StateMachineAspect.*
import static extension org.eclipse.gemoc.xcapella.k3dsa.TimeLapseAspect.*
import static extension org.eclipse.gemoc.xcapella.k3dsa.CapellaElementAspect.*
import static extension org.eclipse.gemoc.xcapella.k3dsa.ComponentExchangeAspect.*
import static extension org.eclipse.gemoc.xcapella.k3dsa.PhysicalArchitectureAspect.*

import java.net.URL
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.Path
import org.eclipse.jdt.launching.JavaRuntime
import java.net.URLClassLoader
import org.polarsys.capella.common.data.modellingcore.ModelElement
import org.polarsys.capella.core.data.capellacore.CapellaElement
import org.polarsys.capella.core.data.pa.PhysicalComponent
import org.javafmi.wrapper.Simulation
import org.javafmi.wrapper.v2.Access
import org.polarsys.capella.core.data.pa.PhysicalArchitecture
import org.polarsys.capella.core.data.fa.ComponentPort
import org.polarsys.capella.core.data.fa.ComponentExchange
import oscilloscup.multiscup.Clock
import oscilloscup.multiscup.Multiscope
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import org.eclipse.swt.widgets.Display
import org.eclipse.ui.IViewPart
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.PartInitException
import java.awt.Frame
import fr.inria.kairos.oscilloscup.view.views.OscilloscupView
import oscilloscup.multiscup.PropertyValueFormatter
import java.awt.GridLayout
import oscilloscup.data.rendering.figure.ConnectedLineFigureRenderer
import oscilloscup.data.rendering.DataElementRenderer
import java.util.Arrays

@Aspect(className=System)
class SystemAspect{
	public static System instance = null;
	def String getLabel() { // start
		instance = _self
		if (_self.description !== null){
			println("run: \n"+_self.description)
			_self.callGroovy()
		}
		return _self.name
	}
}
 
@Aspect(className=AbstractEnd)
class AbstractEndAspect {
	public Integer occurrenceNumber= 0;
	public Boolean occurred = false
	def String getLabel(){
		if(_self instanceof MessageEnd)
		{
			if(_self.message.sendingEnd == _self){
				_self.occurrenceNumber =_self.occurrenceNumber + 1
				_self.message.review = "occurred" +_self.occurrenceNumber
				_self.occurred = true
			}else{
				_self.message.review = ""
				_self.occurred = false
			}
		}
		
		(_self.eContainer as Scenario).ownedTimeLapses.forEach[TimeLapse tl | if (tl instanceof Execution){if (tl.covered == _self.covered && tl.start == _self){tl.isExecuting = true}} ]
		(_self.eContainer as Scenario).ownedTimeLapses.forEach[TimeLapse tl | if (tl instanceof Execution){if (tl.covered == _self.covered && tl.finish == _self){tl.isExecuting = false}} ]
		
		println(_self.name+" is occurring");
		return _self.name; 
	}
}

@Aspect(className=ExchangeItem)
class ExchangeItemAspect{
	
	def String getLabel(){ //occurs
		println("----> Event "+ _self.name+" occurred")
		return _self.name
	}
}

@Aspect(className=StateMachine)
class StateMachineAspect{
	public Mode currentMode = null
	
	def String getLabel(){ //start
		println("initial state machine: "+_self.name)
		if (_self.description !== null){
			println("run: \n"+_self.description)
			_self.callGroovy()
		}
		return _self.name
	}
	
}

@Aspect(className=StateTransition)
class StateTransitionAspect{
	
	def String getLabel(){ //fire
		println(_self.name + " fired")
		if (_self.description !== null){
			println("run: \n"+_self.description)
			_self.callGroovy()
		}
		return _self.name
	}
	
}

@Aspect(className=Mode)
class ModeAspect{
	
	def String getLabel(){ //Entering
		(_self.eContainer().eContainer() as StateMachine).currentMode = _self;
		return _self.name
	}
	
		def String toString(){ //Leaving
		(_self.eContainer().eContainer() as StateMachine).currentMode = null;
		return _self.name
	}
	
}


@Aspect(className=TimeLapse)
class TimeLapseAspect{
	public Boolean isExecuting = false
}

@Aspect(className=Execution)
class ExecutionAspect {
//	private Boolean isStarted= false;
//	private Boolean isReady= false;
//	private Boolean isSuspended= false;
//	private Boolean isStopped= false;
//	
//	public def String getFullLabel(){
//		if (_self.isStarted){
//			println(_self.name+" is STOPPED");
//			_self.isStarted = false
//			_self.review = ""
//		}else{
//			println(_self.name+" is STARTED");
//			_self.isStarted = true
//			_self.review = "started"	
//			
//		}
//		return _self.name; 
//	}
//	
	
}

//																--we are reusing already existing EOperation to avoid using Kitalpha here
//	def if (self.ownedFunctions->isEmpty()) : enacts : Event = self.getLabel()
//	def if (self.ownedFunctions->isEmpty()) : unEnacts : Event = self.getLabel()
//	def if (self.ownedFunctions->isEmpty()) : starts : Event = self.hasUnnamedLabel()
//	def if (self.ownedFunctions->isEmpty()) : stops : Event = self.hasUnnamedLabel()
//--	def if (self.ownedFunctions->isEmpty()) : isRunning : Event = self.toString()

@Aspect(className=SystemFunction)
class SystemFunctionAspect {
	public Boolean isStarted= false;
	public Boolean isEnacted = false;
	public Integer runCycles = 0;
	
	def Boolean hasUnnamedLabel(){	//does both start and stop since no more EOperation were available. otherwise kitalpha is required	
		if (_self.isStarted){
			println(_self.name+" is STOPPED");
			_self.isStarted = false
			_self.runCycles = 0;
			
		}else{
			println(_self.name+" is STARTED");
			_self.isStarted = true
			if (_self.description !== null){
				println("run: \n"+_self.description)
				_self.callGroovy()
			}
		}
		return false; 
	}
	
	def String getLabel(){  //does both activated and isRunning
		if (_self.isEnacted){
			println(_self.name+" is UNenacted");
			_self.isEnacted = false;
		}else{
			_self.isEnacted = true;
			println(_self.name+" is enacted"); 
		}
		return _self.name; 
	}
		
		
	def String toString(){ //isRunning
		_self.runCycles= _self.runCycles+1;
		println(_self.name+" ran for "+_self.runCycles+ " cycles"); 	
		return _self.name; 
	}	
}
	
@Aspect(className=CapellaElement)
class CapellaElementAspect{
		
	
	
	def String callGroovy(){
		val binding = new Binding
		binding.setVariable("id", _self.id)
		var ClassLoader lastClassLoader = null;//SystemFunction.classLoader;
		var ClassLoader currentClassLoader = null;
		try{
			println("run code")
			val List<IJavaProject> javaProjects = new ArrayList<IJavaProject>();
			val IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
			for(IProject project: projects){
			 project.open(null /* IProgressMonitor */);
			 val IJavaProject javaProject = JavaCore.create(project);
			 javaProjects.add(javaProject);
			}
			
			val List<URL> urlList = new ArrayList<URL>();
			for(IJavaProject project: javaProjects){
				val String[] classPathEntries = JavaRuntime.computeDefaultRuntimeClassPath(project);
				for (var int i = 0; i < classPathEntries.length; i++) {
				 val String entry = classPathEntries.get(i);
				 val IPath path = new Path(entry);
				 val URL url = path.toFile().toURI().toURL();
				 urlList.add(url);
				}
				lastClassLoader = project.getClass().getClassLoader();
				var URL[] urls = newArrayOfSize(urlList.length);
				for(var int i = 0; i < urlList.length; i++){
					urls.set(i,urlList.get(i))
				}
				currentClassLoader = new URLClassLoader(urls, lastClassLoader);
				lastClassLoader = currentClassLoader
			}			
			
			val shell = new GroovyShell(/*currentClassLoader,*/ binding)
			var cl = shell.classLoader
			for(var int i = 0; i < urlList.length; i++){
					cl.addURL(urlList.get(i))
			}
	
			val res = shell.evaluate(_self.description) as Map<String, Object>
	
//			for (OutputPin port: _self.outputs) {
//				//_self.system.sharedMemory.put(portName, res.get(portName))
//			}
		} catch (Exception cnfe){
			println("Failed to call Groovy script "+cnfe.message)
			cnfe.printStackTrace()
		}
		return _self.description 
	}	
}





























//physical archi stuff
@Aspect(className=PhysicalArchitecture)
class PhysicalArchitectureAspect{
	public var Integer currentTime = 0
	
	def String getLabel(){ //ticks
		_self.currentTime = _self.currentTime + 100
		XcapellaPlotter.current_time = _self.currentTime
		return _self.name
	}
}

@Aspect(className=ComponentExchange)
class ComponentExchangeAspect{
	public var Double value = 0.0
	def void fake(){
		
	}
}


@Aspect(className=PhysicalComponent)
class PhysicalComponentAspect{
	public var Simulation javaFMI_FMU
	public var Access fmuAccess	
	
	def String getLabel() { //init(){
		XcapellaPlotter.initialize(_self.eContainer.eContainer as CapellaElement);
		if (_self.description.startsWith("fmuPath:")){
			_self.javaFMI_FMU = new Simulation(_self.description.replace("fmuPath:", ""));
			_self.javaFMI_FMU.init(0.0);
			_self.fmuAccess = new Access(_self.javaFMI_FMU);	
			
			for(ComponentPort cp : _self.ownedFeatures.filter(ComponentPort)){
				//getting connectors feeding the port
				for(ComponentExchange ce : (_self.eContainer()as PhysicalComponent).ownedComponentExchanges.filter[ce | ce.targetPort == cp]){
					if (ce.description.startsWith("value:")){
						println("description "+ce.description)
						ce.value = new Double(ce.description.replace("value:",""))
					}else{
						ce.value = 10.0	
					}
					
				}
			}	
		}
		println("initialized")
		return _self.name
	}
	
	def String getFullLabel(){ //doStep(){     fire
		for(ComponentPort cp : _self.ownedFeatures.filter(ComponentPort)){
			//getting connectors feeding the port
			for(ComponentExchange ce : (_self.eContainer()as PhysicalComponent).ownedComponentExchanges.filter[ce | ce.targetPort == cp]){
				_self.javaFMI_FMU.write(cp.name).with(ce.value)
			}
		}			
		
		_self.javaFMI_FMU.doStep(0.1);
		
		println("fire")
		
		return _self.name		
	}
	
	def Boolean hasUnnamedLabel(){ //postFire
		for(ComponentPort cp : _self.ownedFeatures.filter(ComponentPort)){
			//getting connectors outgoing from the port
			for(ComponentExchange ce : (_self.eContainer()as PhysicalComponent).ownedComponentExchanges.filter[ce | ce.sourcePort == cp]){
				ce.value = _self.javaFMI_FMU.read(cp.name).asDouble
				println(ce.value)
			}
		}	
		println("post fire")
		return true
	} 
	

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	class XcapellaPlotter {
	public static var Integer current_time = 0;
	public static var Multiscope<ComponentExchange> multiScopeConnectorValues;
	
	
	static class PlotterClock extends Clock
	{
		 override double getTime()
		{	
			return XcapellaPlotter.current_time;
		}
		
		 override String getTimeUnit()
		{
			return "milliseconds";
		}
	}
	
	static class ComponentExchangeProperty extends oscilloscup.multiscup.Property<ComponentExchange>{
		 override Object getRawValue(ComponentExchange ce) {
			return ce.value 
		}
	}
	
	
	@InitializeModel
	static def void initialize(CapellaElement elm){
		Display.getDefault().asyncExec(new Runnable() {
			override
    	  	 void run() {
				var IViewPart v = null
				try{
				v = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("fr.inria.kairos.oscilloscup.view.views.OscilloscupView");
				}catch(PartInitException e){
					java.lang.System.err.println(e)
				}

				var Frame f = (v as OscilloscupView).frame
				f.setSize(1000, 800);
				f.removeAll();
				var allCapElem = (elm as PhysicalArchitecture).ownedPhysicalComponent.ownedComponentExchanges;
				var ArrayList<ComponentExchange> plotCes = new ArrayList
				for(ComponentExchange ce : allCapElem){
					if (ce.summary !== null && ce.summary.startsWith("plot")){
						plotCes.add(ce)
					}
				}
				println("plotCes ="+plotCes)
				val PlotterClock aClock = new XcapellaPlotter.PlotterClock()
				var ComponentExchangeProperty cewp = new ComponentExchangeProperty();
				cewp.setName("Connector values");
				cewp.setReformatter(new PropertyValueFormatter.PrettyDecimals(2));
				cewp.clock = aClock;

				XcapellaPlotter.createComponentExchangeMultiscope(f, cewp, plotCes);
		
				f.setVisible(true);
				f.layout = new GridLayout
			}
		})
	}
	static def void createComponentExchangeMultiscope(Frame f, ComponentExchangeProperty prop, List<ComponentExchange> tasks){
		XcapellaPlotter.multiScopeConnectorValues = new Multiscope<ComponentExchange>(Arrays.asList(prop)) 
		{
			override protected String getRowNameFor(ComponentExchange row) {
				return row.name;
			}
												
			protected override int getNbPointsInSlidingWindow(ComponentExchange row, oscilloscup.multiscup.Property<ComponentExchange> p)
			{
				return 50;
			}
												
			override protected DataElementRenderer getSpecificRenderer(ComponentExchange row, 
				oscilloscup.multiscup.Property<ComponentExchange> property) {
				return new ConnectedLineFigureRenderer();
			}
			
		};
		
		XcapellaPlotter.multiScopeConnectorValues.setRows(tasks);
		XcapellaPlotter.multiScopeConnectorValues.setRefreshPeriodMs(500);
		f.add(XcapellaPlotter.multiScopeConnectorValues);
	}
}


