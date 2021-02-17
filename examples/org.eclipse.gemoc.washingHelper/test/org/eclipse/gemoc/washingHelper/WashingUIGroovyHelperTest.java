package org.eclipse.gemoc.washingHelper;

import org.junit.After;
import org.junit.jupiter.api.Test;

class WashingUIGroovyHelperTest {

	String currentDir = System.getProperty("user.dir");
	
	
	@Test
	void testSimpleWash() throws InterruptedException {
		WashingUIGroovyHelper washingMachine = new org.eclipse.gemoc.washingHelper.WashingUIGroovyHelper(currentDir);
		washingMachine.uiHelper.startServer(); 
		Thread.sleep(1000);
		washingMachine.uiHelper.openBrowser();


		Thread.sleep(1500);
		washingMachine.sf_loadClothes();
		Thread.sleep(1500);
		washingMachine.sm_openable_doorLocked();
		Thread.sleep(1500);
		washingMachine.sf_startProgram();
		Thread.sleep(1500);
		washingMachine.sf_fillWater();
		Thread.sleep(1500);
		washingMachine.sf_wash();
		Thread.sleep(1500);
		washingMachine.sf_rinse();
		Thread.sleep(1500);
		washingMachine.sf_spinClothes();
		Thread.sleep(1500);
		washingMachine.sf_stopProgram();
		Thread.sleep(1500);
		washingMachine.sm_simpleWash_doorUnlocked();
		Thread.sleep(1500);
		washingMachine.sf_unloadClothes();
	}

	@After
	void afterTest() {
		WashingHelper washingMachine = new org.eclipse.gemoc.washingHelper.WashingHelper(currentDir);
		washingMachine.stopServer(); 
	}
	
}
