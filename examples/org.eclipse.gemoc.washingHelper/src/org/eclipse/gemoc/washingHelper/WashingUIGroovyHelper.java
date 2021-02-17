package org.eclipse.gemoc.washingHelper;


// This class helps to have all UI related actions in a single easily editable file
//  (editing in melody editor is possible but painful)
//  It has one method per action in the model
public class WashingUIGroovyHelper {
	
	public WashingHelper uiHelper;
	
	public WashingUIGroovyHelper(String projectPath) {
		uiHelper = new WashingHelper(projectPath);
	}

	
	// Statemachine event code
	public void sm_openable_doorLocked() {
		uiHelper.showClosedDoor(true);
		uiHelper.showOpenDoor(false);
	}
	
	public void sm_simpleWash_doorUnlocked() {
		uiHelper.showClosedDoor(false);
		uiHelper.showOpenDoor(true);
	}
	
	public void sm_dryOnly_doorUnlocked() {
		uiHelper.showClosedDoor(false);
		uiHelper.showOpenDoor(true);
	}

	public void sm_gentleColdWashSelected_startProgram() {
		uiHelper.showThirty(true);
	}
	
	public void sm_gentleColdWash_doorUnlocked() {
		uiHelper.showThirty(false);
		uiHelper.showClosedDoor(false);
		uiHelper.showOpenDoor(true);
	}
	
	public void sm_washAndDry_doorUnlocked() {
		uiHelper.showClosedDoor(false);
		uiHelper.showOpenDoor(true);
	}
	


	
	// SystemFunctions in [SDFB]
	public void sf_loadClothes() {
		uiHelper.showSteadyLaundry(true);
	}
	public void sf_unloadClothes() {
		uiHelper.showSteadyLaundry(false);
	}
	public void sf_startProgram() {
		// TODO Auto-generated method stub
		
	}
	public void sf_fillWater() {
		uiHelper.showSteadyWater(true);
	}
	
	public void sf_wash() {
		uiHelper.showSteadyWater(false);
		uiHelper.showSteadyLaundry(false);
		uiHelper.showMovingWater(true);
		
	}
	public void sf_rinse() {
		uiHelper.showClosedDoorLaundry(true);
		uiHelper.showSteadyWater(false);
		uiHelper.showMovingWater(false);
		
	}
	public void sf_spinClothes() {
		uiHelper.showClosedDoorLaundry(false);
		uiHelper.showSpinLaundry(true);
	}
	
	public void sf_stopProgram() {
		uiHelper.showSpinLaundry(false);
		uiHelper.showSteadyLaundry(true);
	}
}
