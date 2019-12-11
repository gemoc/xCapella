//package org.eclipse.gemoc.xcapella.animator.services;
//
///* % Function name : CalculationGraphModelUtils
//%-------------------------------------------------------------------------
//% Created by           :    Jean-Philippe LAM-YEE-MUI (EDF R&D)
//% Date                 :    01/01/2015
//% SVN version          :    0
//% Last modification by :    xxxxxxxxx
//% Date                 :    xx/xx/xxxx
//% SVN version          :    xxx
//%-------------------------------------------------------------------------
//% DACCOSIM 2015 - Copyright � 2015 EDF and CentraleSupelec
//% Code under GNU AGPL v3 license.
//%-------------------------------------------------------------------------*/
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.javafmi.modeldescription.v2.Unknown;
//import org.polarsys.capella.core.data.fa.ComponentPort;
//
//
//
//public enum FmiVariableHelper
//{
//	INSTANCE;
//
////
////	public void SetScalarVariableData(ScalarVariable sv, org.javafmi.modeldescription.ScalarVariable variable)
////	{
////		sv.setName(variable.getName());
////		switch(variable.getTypeName())
////		{
////		case "Boolean":
////			sv.setType(fr.daccosim.model.calculationgraph.VariableType.BOOLEAN);
////			break;
////		case "Enumeration":
////			sv.setType(fr.daccosim.model.calculationgraph.VariableType.ENUMERATION);
////			break;
////		case "Integer":
////			sv.setType(fr.daccosim.model.calculationgraph.VariableType.INTEGER);
////			break;
////		case "Real":
////			sv.setType(fr.daccosim.model.calculationgraph.VariableType.REAL);
////			break;
////		case "String":
////			sv.setType(fr.daccosim.model.calculationgraph.VariableType.STRING);
////			break;
////		}
////		switch(variable.getCausality())
////		{
////		case "parameter":
////			sv.setCausality(fr.daccosim.model.calculationgraph.Causality.PARAMETER);
////			break;
////		case "calculatedParameter":
////			sv.setCausality(fr.daccosim.model.calculationgraph.Causality.CALCULATED_PARAMETER);
////			break;
////		case "input":
////			sv.setCausality(fr.daccosim.model.calculationgraph.Causality.INPUT);
////			break;
////		case "output":
////			sv.setCausality(fr.daccosim.model.calculationgraph.Causality.OUTPUT);
////			break;
////		case "local":
////			sv.setCausality(fr.daccosim.model.calculationgraph.Causality.LOCAL);
////			break;
////		case "independent":
////			sv.setCausality(fr.daccosim.model.calculationgraph.Causality.INDEPENDENT);
////			break;
////		}
////		switch(variable.getVariability())
////		{
////		case "constant":
////			sv.setVariability(fr.daccosim.model.calculationgraph.Variability.CONSTANT);
////			break;
////		case "fixed":
////			sv.setVariability(fr.daccosim.model.calculationgraph.Variability.FIXED);
////			break;
////		case "tunable":
////			sv.setVariability(fr.daccosim.model.calculationgraph.Variability.TUNABLE);
////			break;
////		case "discrete":
////			sv.setVariability(fr.daccosim.model.calculationgraph.Variability.DISCRETE);
////			break;
////		case "continuous":
////			sv.setVariability(fr.daccosim.model.calculationgraph.Variability.CONTINUOUS);
////			break;
////		case "parameter":
////			sv.setVariability(fr.daccosim.model.calculationgraph.Variability.PARAMETER);
////			break;
////		}
////	}
//
////	/** Retrieve the initial attribute for the scalar variable 'sv' */
////	public void SetFMI2ScalarVariableData(fr.daccosim.model.calculationgraph.ScalarVariable sv, org.javafmi.modeldescription.v2.ScalarVariable variable)
////	{
////		switch(variable.getInitial())
////		{
////		case "exact":
////			sv.setInitial(fr.daccosim.model.calculationgraph.Initial.EXACT);
////			break;
////		case "approx":
////			sv.setInitial(fr.daccosim.model.calculationgraph.Initial.APPROX);
////			break;
////		case "calculated":
////			sv.setInitial(fr.daccosim.model.calculationgraph.Initial.CALCULATED);
////			break;
////		}
////	}
//	
//	public void SetScalarVariableData(ComponentPort var, org.javafmi.modeldescription.ScalarVariable variable)
//	{
//		var.setName(variable.getName());
//		switch(variable.getTypeName())
//		{
//		case "Boolean":
//			
//			var.setType(VariableType.BOOLEAN);
//			break;
//		case "Enumeration":
//			var.setType(VariableType.ENUMERATION);
//			break;
//		case "Integer":
//			var.setType(VariableType.INTEGER);
//			break;
//		case "Real":
//			var.setType(VariableType.REAL);
//			break;
//		case "String":
//			var.setType(VariableType.STRING);
//			break;
//		}
//		switch(variable.getCausality())
//		{
//		case "parameter":
//			var.setCausality(Causality.PARAMETER);
//			break;
//		case "calculatedParameter":
//			var.setCausality(Causality.CALCULATED_PARAMETER);
//			break;
//		case "input":
//			var.setCausality(Causality.INPUT);
//			break;
//		case "output":
//			var.setCausality(Causality.OUTPUT);
//			break;
//		case "local":
//			var.setCausality(Causality.LOCAL);
//			break;
//		case "independent":
//			var.setCausality(Causality.INDEPENDENT);
//			break;
//		}
//		switch(variable.getVariability())
//		{
//		case "constant":
//			var.setVariability(Variability.CONSTANT);
//			break;
//		case "fixed":
//			var.setVariability(Variability.FIXED);
//			break;
//		case "tunable":
//			var.setVariability(Variability.TUNABLE);
//			break;
//		case "discrete":
//			var.setVariability(Variability.DISCRETE);
//			break;
//		case "continuous":
//			var.setVariability(Variability.CONTINUOUS);
//			break;
//		case "event":
//			var.setVariability(Variability.EVENT);
//			break;
//		}
//	}
//	
//	/** Retrieve the initial attribute for the scalar variable 'sv' */
//	public void SetFMI2ScalarVariableData(ScalarVariable input,org.javafmi.modeldescription.v2.ScalarVariable variable)
//	{
//		switch(variable.getInitial())
//		{
//		case "exact":
//			input.setInitial(Initial.EXACT);
//			break;
//		case "approx":
//			input.setInitial(Initial.APPROX);
//			break;
//		case "calculated":
//			input.setInitial(Initial.CALCULATED);
//			break;
//		}
//	}
//
//
//	 static public Map<String, List<String>> getOutputDependencies(org.javafmi.wrapper.v2.Access access) {
// 		Map<String, List<String>> res = new HashMap<String, List<String>>();
// 		org.javafmi.modeldescription.ScalarVariable[] aSV = access.getModelDescription().getModelVariables();
// 		for(Unknown outputDependency : access.getModelDescription().getModelStructure().getOutputs())
// 		{
// 			ArrayList<String> lDependencies = new ArrayList<String>();
// 			if(!outputDependency.getDependencies().isEmpty())
// 			{
// 				String[] astrDependencies = outputDependency.getDependencies().split(" ");
// 				for(String strIndex : astrDependencies)
// 				{
// 					org.javafmi.modeldescription.ScalarVariable sv = aSV[Integer.parseInt(strIndex)-1];
// 					if(sv.getCausality().equals("input"))
// 						lDependencies.add(sv.getName());
// 				}
// 				res.put(aSV[outputDependency.getIndex()-1].getName(), lDependencies);
// 				// If lDependencies is empty, we assume that the output depends on all the inputs
// 				if(lDependencies.isEmpty())
// 				{
// 					for(int i=0; i<aSV.length; ++i)
// 						if(aSV[i].getCausality().equals("input"))
// 							lDependencies.add(aSV[i].getName());
// 				}
// 			}
// 		}
// 	
// 		return res;
// 	}
//
//}
