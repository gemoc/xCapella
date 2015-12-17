package ModeSimulation.ModeSimulation.aspects

import com.thalesgroup.trt.mde.vp.al.al.Action
import com.thalesgroup.trt.mde.vp.expression.expression.Expression
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ActionRuntimeData
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ClockRuntimeData
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ComponentRuntimeData
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.EventRuntimeData
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ExpressionRuntimeData
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionRuntimeData
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionalChainRuntimeData
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.GuardRuntimeData
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.MachineRuntimeData
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ModeRuntimeData
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.TransitionRuntimeData
import com.thalesgroup.trt.mde.vp.mode.mode.AbstractMode
import com.thalesgroup.trt.mde.vp.mode.mode.Mode_
import com.thalesgroup.trt.mde.vp.mode.mode.ModeMachine
import com.thalesgroup.trt.mde.vp.mode.mode.Transition
import com.thalesgroup.trt.mde.vp.expression.expression.Guard
import com.thalesgroup.trt.mde.vp.expression.expression.AbstractGuard
import com.thalesgroup.trt.mde.vp.expression.expression.TemporalGuard
import com.thalesgroup.trt.mde.vp.expression.expression.EventGuard
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.polarsys.capella.common.data.behavior.AbstractEvent
import org.polarsys.kitalpha.emde.model.ElementExtension
import com.thalesgroup.trt.mde.vp.time.time.Clock
import org.polarsys.capella.core.data.cs.Component
import org.polarsys.capella.core.data.information.datavalue.AbstractBooleanValue
import com.thalesgroup.trt.mde.vp.expression.expression.Variable
import org.polarsys.capella.core.data.fa.AbstractFunction
import com.thalesgroup.trt.mde.vp.expression.expression.BooleanBinaryExpression
import com.thalesgroup.trt.mde.vp.expression.expression.BooleanUnaryExpression
import com.thalesgroup.trt.mde.vp.expression.expression.BooleanExpression
import com.thalesgroup.trt.mde.vp.expression.expression.NumericComparisonExpression
import com.thalesgroup.trt.mde.vp.expression.expression.BooleanBinaryOperator
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import com.thalesgroup.trt.mde.vp.expression.expression.BooleanUnaryOperator
import org.polarsys.capella.core.data.information.datavalue.LiteralBooleanValue
import cnrs.luchogie.up.SwingPlotter
import javax.swing.JFrame
import cnrs.luchogie.up.data.Figure
import cnrs.luchogie.up.InteractiveSwingPlotter
import java.util.ArrayList

import org.polarsys.capella.common.data.modellingcore.ValueSpecification
import org.polarsys.capella.core.data.information.datavalue.LiteralNumericValue
import com.thalesgroup.trt.mde.vp.expression.expression.NumericExpression

import static extension ModeSimulation.ModeSimulation.aspects.TransitionRuntimeDataAspect.*
import static extension ModeSimulation.ModeSimulation.aspects.ModeRuntimeDataAspect.*
import static extension ModeSimulation.ModeSimulation.aspects.GuardRuntimeDataAspect.*
import static extension ModeSimulation.ModeSimulation.aspects.MachineRuntimeDataAspect.*
import static extension ModeSimulation.ModeSimulation.aspects.ComponentRuntimeDataAspect.*
import static extension ModeSimulation.ModeSimulation.aspects.FunctionRuntimeDataAspect.*
import static extension ModeSimulation.ModeSimulation.aspects.FunctionalChainRuntimeDataAspect.*
import static extension ModeSimulation.ModeSimulation.aspects.ExpressionRuntimeDataAspect.*
import static extension ModeSimulation.ModeSimulation.aspects.ClockRuntimeDataAspect.*
import static extension ModeSimulation.ModeSimulation.aspects.EventRuntimeDataAspect.*
import static extension ModeSimulation.ModeSimulation.aspects.ActionRuntimeDataAspect.*

import static extension ModeSimulation.ModeSimulation.aspects.BooleanExpressionAspect.*
import static extension ModeSimulation.ModeSimulation.aspects.BooleanBinaryExpressionAspect.*
import static extension ModeSimulation.ModeSimulation.aspects.BooleanUnaryExpressionAspect.*
import org.polarsys.capella.core.data.fa.FunctionalChain

@Aspect(className=TransitionRuntimeData)
class TransitionRuntimeDataAspect {
	//debugging purpose
	def public String reset() {
		var Transition trans = _self.eContainer() as Transition
		
		println("reset of " + trans.name)
		return "reset of " + trans.name
	}

	def private void runAction(Action a){
			var ActionRuntimeData act= a.eContents as ActionRuntimeData
				ActionRuntimeDataAspect::evaluate(act)
			}
//	def private void runExpression(Expression e){
//		switch(e){
//				IntegerComparisonExpression: IntegerComparisonExpressionAspect::evaluate(e) 
//				IntegerCalculationExpression: IntegerCalculationExpressionAspect::evaluate(e)
//				BooleanExpression: BooleanExpressionAspect::evaluate(e)
//				OpaqueAction: OpaqueActionAspect::evaluate(e)
//			}
//	}
	
	def public String fire() {
		//GroovyRunner.executeScript(_self.actions, _self);
//		_self.source.owningSMCube.currentState = null
		var Transition trans = _self.eContainer() as Transition
		
//		if (trans.source instanceof Mode_){
//			
//			(trans.source as Mode_).exitActions.forEach[ea|
//				_self.runAction(ea)
//			]
//		}
//		
//		trans.actions.forEach[a | 
//			_self.runAction(a)
//		]
		
		println("[" + trans.getClass().getSimpleName() + ":" + trans.getName() + ".fire()]Fired " + trans.name + " -> " +
			trans.actions)
	}
	
	def public boolean evaluate(){ 
		var Transition trans = _self.eContainer() as Transition
		
		if (trans.guard == null){
			return true
		}
		for (ElementExtension ext: trans.guard.ownedExtensions) {
			var GuardRuntimeData theGuard = ext as GuardRuntimeData
			return GuardRuntimeDataAspect::evaluate(theGuard)
		}
		
//		switch(trans.guard){
////			IntegerComparisonExpression: return IntegerComparisonExpressionAspect::evaluate(_self.guard)
//			BooleanBinaryExpression: return BooleanBinaryExpressionAspect::evaluate(trans.guard)
//			BooleanUnaryExpression: return BooleanUnaryExpressionAspect::evaluate(trans.guard)
//			BooleanExpression: return BooleanExpressionAspect::evaluate(trans.guard)
//			default: return false
//		}
//		return Expression::evaluate(trans.guard)
		
	}


}

@Aspect(className=ModeRuntimeData)
class ModeRuntimeDataAspect {
	
	def public String onEnter() {
		var AbstractMode mode = _self.eContainer as AbstractMode
		var ModeMachine machine = mode.eContainer as ModeMachine
		
		for(ElementExtension ext : machine.ownedExtensions) {
			if(ext instanceof MachineRuntimeData) {
				(ext as MachineRuntimeData).current = mode
			}
		}
		return ""
	}	
		
//		if (mode instanceof Mode_){
//		(mode as Mode_).enterActions.forEach[ea|
//			_self.runAction(ea)
//		]
//		}
		
//		println("[" + mode.getClass().getSimpleName() + ":" + mode.getName() + ".onEnter()]Entering " + mode.name);
		
		def private void runAction(Action a){
			var ActionRuntimeData act= a.eContents as ActionRuntimeData

				ActionRuntimeDataAspect::evaluate(act)
			}

	def public String onLeave() {
		var AbstractMode mode = _self.eContainer as AbstractMode
		var ModeMachine machine= mode.eContainer as ModeMachine
		
		for(ElementExtension ext : machine.ownedExtensions) {
			if(ext instanceof MachineRuntimeData) {
				(ext as MachineRuntimeData).current = null
			}
		}
		println("[" + mode.getClass().getSimpleName() + ":" + mode.getName() + ".onLeave()]Leaving " + mode.name);
	}

}

@Aspect(className=GuardRuntimeData)
class GuardRuntimeDataAspect {
	def public boolean evaluate() {
		var AbstractGuard theGuard = _self.eContainer as AbstractGuard
		
//		switch(theGuard){
//				Guard: BooleanExpressionAspect::evaluate((theGuard as Guard).condition) 
//				TemporalGuard: TemporalGuardAspect::evaluate(_self)
//				EventGuard: EventExpressionAspect::evaluate((theGuard as TemporalGuard).afterDuration)
//			default: return true
//			}
		return true

	}
}

@Aspect(className=MachineRuntimeData)
class MachineRuntimeDataAspect {
		// should be added automatically by the dsa, currently introduced directly in the ecore
	public Mode_ current;

	def public String init() {
		//_self.current = null
		println("[" + _self.getClass().getSimpleName() + ":" + _self.getName() + ".Init()]Initialized " + _self.name);
	}

}

@Aspect(className=ComponentRuntimeData)
class ComponentRuntimeDataAspect {
	def public String init() {
		var Component comp = _self.eContainer as Component
//		
//		for (ElementExtension ext :comp.ownedExtensions) {
//			if(ext instanceof ModeMachine) {
//				var ModeMachine machine = ext as ModeMachine
//				for(ElementExtension theExt : machine.ownedExtensions) {
//					if(theExt instanceof MachineRuntimeData) {
//						var MachineRuntimeData rtData = ext as MachineRuntimeData
//						rtData.current = null
////						for(Variable currentVar: machine.localVariables) {
////							currentVar.currentValue.
////						}
//					}
//				}
//			}
//		}
		
		println("[" + comp.getClass().getSimpleName() + ":" + comp.getName() + ".Init()]Initialized " + comp.name);
	}
}

@Aspect(className=FunctionRuntimeData)
class FunctionRuntimeDataAspect {
	def public String init() {
		var AbstractFunction func = _self.eContainer as AbstractFunction
		
		for (ElementExtension ext :func.ownedExtensions) {
			if(ext instanceof ModeMachine) {
				var ModeMachine machine = ext as ModeMachine
				for(ElementExtension theExt : machine.ownedExtensions) {
					if(theExt instanceof MachineRuntimeData) {
						var MachineRuntimeData rtData = ext as MachineRuntimeData
						rtData.current = null
//						for(Variable currentVar: machine.localVariables) {
//							currentVar.currentValue.
//						}
					}
				}
			}
		}
		
		println("[" + func.getClass().getSimpleName() + ":" + func.getName() + ".Init()]Initialized " + func.name);
	}	
	def public void activate(){
		var AbstractFunction func = _self.eContainer as AbstractFunction
		if(_self.isActive) {
			println("ERROR: " + func.name + " HAS BEEN ACTIVATED ELSEWHERE!")
			return;
		}
		
		
		_self.isActive = true;
		
		println(func.name  + " ACTIVE!")
	}
	
	def public void deactivate(){
		var AbstractFunction func = _self.eContainer as AbstractFunction
		if(! _self.isActive) {
			println("ERROR: " + func.name + " HAS BEEN DEACTIVATED ELSEWHERE!")
			return;
		}
		
		
		
		_self.isActive = false;
		
		println(func.name  + " NOT ACTIVE!")
	}

}

@Aspect(className=FunctionalChainRuntimeData)
class FunctionalChainRuntimeDataAspect {
	
	def public void activate(){
		var FunctionalChain chain = _self.eContainer as FunctionalChain
		
		if(_self.isActive) {
			println("ERROR: " + chain.name + " HAS BEEN ACTIVATED ELSEWHERE!")
			return;
		}
		
		
		for(AbstractFunction func : chain.enactedFunctions) {
			for(ElementExtension theExt : func.ownedExtensions) {
				if(theExt instanceof FunctionRuntimeData) {
					var FunctionRuntimeData rtData = theExt as FunctionRuntimeData
					rtData.activate();
				}
			}
		}
		
		_self.isActive = true;
		
		println(chain.name  + " ACTIVE!")
	}
	
	def public void deactivate(){
		var FunctionalChain chain = _self.eContainer as FunctionalChain
		
		if(! _self.isActive) {
			println("ERROR: " + chain.name + " HAS BEEN DEACTIVATED ELSEWHERE!")
			return;
		}
		
		for(AbstractFunction func : chain.enactedFunctions) {
			for(ElementExtension theExt : func.ownedExtensions) {
				if(theExt instanceof FunctionRuntimeData) {
					var FunctionRuntimeData rtData = theExt as FunctionRuntimeData
					rtData.deactivate();
				}
			}
		}		
		_self.isActive = false;
		
		println(chain.name  + " NOT ACTIVE!")
		
	}

}

@Aspect(className=ExpressionRuntimeData)
class ExpressionRuntimeDataAspect {
	def public boolean evaluate() {
		var Expression expr = _self.eContainer as Expression
		
//		switch(expr){
//			NumericComparisonExpression: return NumericComparisonExpressionAspect::evaluate()
//			BooleanBinaryExpression: return BooleanBinaryExpressionAspect::evaluate()
//			BooleanUnaryExpression: return BooleanUnaryExpressionAspect::evaluate()
////			BooleanExpression: return BooleanExpressionAspect::evaluate(_self.guard)
//			default: return true
//		}
return true
	}	
}

@Aspect(className= NumericComparisonExpression)
class NumericComparisonExpressionAspect extends BooleanExpressionAspect{
	def public boolean evaluate() {
//		var boolean res;
//		var LiteralNumericValue op1 = _self.operand1.currentValue as LiteralNumericValue
//		var LiteralNumericValue op2 = _self.operand2.currentValue as LiteralNumericValue
//		
//		
//		
//		switch(_self.operator){
//			case EQUALS: res = _self.operand1.currentValue == _self.operand2.currentValue
//			case GREATER:  res = _self.operand1.currentValue > _self.operand2.currentValue
//			case GREATER_EQUALS:  res = _self.operand1.currentValue >= _self.operand2.currentValue
//			case SMALLER:  res = _self.operand1.currentValue < _self.operand2.currentValue
//			case SMALLER_EQUALS:  res = _self.operand1.currentValue <= _self.operand2.currentValue
//		}
//		_self.assignee.currentValue = res;
//		return res
return true
}
}
@Aspect(className= NumericExpression)
class NumericExpressionAspect{
	def public double evaluate() {
//		switch(_self){
//			NumericBinaryExpression: return NumericBinaryExpressionAspect::evaluate()
//			NumericUnaryExpression: return NumericUnaryExpressionAspect::evaluate()
//			default: return 0.0
//		}
	return 0.0		
	}
}



@Aspect(className= BooleanBinaryExpression)
class BooleanBinaryExpressionAspect extends BooleanExpressionAspect{
	@OverrideAspectMethod
	def public boolean evaluate() {
		var boolean res;
		switch(_self.operator){
			case BooleanBinaryOperator.AND_VALUE: res = _self.operand1.evaluate() && _self.operand2.evaluate()
			case BooleanBinaryOperator.OR_VALUE:  res = _self.operand1.evaluate() || _self.operand2.evaluate()
		}

		return res ;
	}
}
@Aspect(className= BooleanUnaryExpression)
class BooleanUnaryExpressionAspect extends BooleanExpressionAspect{
	@OverrideAspectMethod
	def public boolean evaluate() {
		var boolean res = (_self.operand.currentValue as LiteralBooleanValue).value
		if(_self.operator != null){
			res = !res
		}

		return res ;
	}
}
@Aspect(className= BooleanExpression)
class BooleanExpressionAspect {
	def public boolean evaluate() {
//		switch(_self){
//			BooleanBinaryExpression: return BooleanBinaryExpressionAspect::evaluate()
//			BooleanUnaryExpression: return BooleanUnaryExpressionAspect::evaluate()
//			default: return false
//		}
return true
	}
}



@Aspect(className=ClockRuntimeData)
class ClockRuntimeDataAspect {
		//public Integer numberOfTicks;
	public int numberOfTicks

	// Clock tick
	def public String ticks() {
		var Clock clk = _self.eContainer as Clock
		
		//GroovyRunner.executeScript("doTick", _self);
		_self.numberOfTicks = _self.numberOfTicks + 1
		println("[" + clk.getClass().getSimpleName() + ":" + clk.getName() + ".ticks()]New number of ticks : " +
			_self.numberOfTicks.toString())
	}

}

@Aspect(className=EventRuntimeData)
class EventRuntimeDataAspect {
		def public String occurs() {
			var AbstractEvent myEv = _self.eContainer as AbstractEvent
			println("[" + myEv.getClass().getSimpleName() + ":" + myEv.getName() + ".occurs()]  Occurred " )
	}
}

@Aspect(className=ActionRuntimeData)
class ActionRuntimeDataAspect {
//	private SwingPlotter plotter = new InteractiveSwingPlotter
//	private JFrame frame = new JFrame
//	private Figure figure = new Figure
	
	
	def public String evaluate() {
//		_self.frame.setContentPane(_self.plotter)
//		_self.frame.setSize(400, 400)
//		
//		val binding = new Binding()
//		binding.setVariable("plotter", _self.plotter)
//		binding.setVariable("frame", _self.frame)
//		binding.setVariable("figure", _self.figure)
//		
//		
//		
//		val varList = new ArrayList()
//		
//		switch(_self.eContainer()){
//			Mode: {
//				   varList.addAll(((_self.eContainer() as Mode).eContainer() as ModeMachine).localVariables)
//				   varList.addAll(((_self.eContainer() as Mode).eContainer() as ModeMachine).inputSignals)
//				   varList.addAll(((_self.eContainer() as Mode).eContainer() as ModeMachine).outputSignals)
//				   binding.setVariable("t", ((_self.eContainer() as Mode).eContainer() as ModeMachine).localClocks.numberOfTicks)
//			}
//			Transition:{
//				   varList.addAll((_self.eContainer() as Transition).target.owningSMCube.ownedVariables)
//				   varList.addAll((_self.eContainer() as Transition).target.owningSMCube.inputSignals)
//				   varList.addAll((_self.eContainer() as Transition).target.owningSMCube.outputSignals)
//				   binding.setVariable("t", (_self.eContainer() as Transition).target.owningSMCube.localClock.numberOfTicks)
//
//			}
//		}
//		varList.forEach[v|
//			switch(v){
//				IntegerVariable: binding.setVariable(v.name, v.currentValue)
//				BooleanVariable: binding.setVariable(v.name, v.currentValue)
//			} 
//		]
//		
//	
//		
//		val ucl = OpaqueActionAspect.classLoader
//		val shell = new GroovyShell(ucl,binding)
//	try{
//		
//		val res = shell.evaluate(_self.body) as Map<String, Object>
//	
//		varList.forEach[v|
//			if (res.containsKey(v.name)){
//				switch(v){
//				IntegerVariable: v.currentValue = (res.get(v.name) as Integer)
//				BooleanVariable: v.currentValue = (res.get(v.name) as Boolean)
//				}
//			}
//		]
//		
//	  } catch (Exception cnfe){
//			println("Failed to call Groovy script"+cnfe.message)
//			cnfe.printStackTrace
//	  }
	var Action theAction = _self.eContainer as Action
		return theAction.name + "executed";
	}	


}



