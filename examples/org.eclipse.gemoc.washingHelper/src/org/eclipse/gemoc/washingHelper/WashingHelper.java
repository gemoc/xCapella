package org.eclipse.gemoc.washingHelper;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.browser.IWebBrowser;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class WashingHelper {

	public static String serverUrl = "http://localhost:3000";
	
	private static Process pid = null;
	private String path = "";
	private File f;
	
	public String projectPath;
	
	public WashingHelper(String projectPath) {
		this.projectPath = projectPath;
		this.path=this.projectPath+"/../org.eclipse.gemoc.washingHelper/htmlTests/";
		this.f = new File(path+"washingMachine.html");
	}
	
	public void startServer() {
		if( pid != null) {
			stopServer();
		}
		ProcessBuilder pb = new ProcessBuilder().inheritIO().command("sh", path+"runApp.sh");//launchApp()");
		pb.directory(new File(path));
		System.out.println("projectPath="+projectPath);
		try {
			pid = pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void stopServer() {
		if( pid != null) {
			// kill previous nodejs server if running
			pid.destroy();
		}
	}
		
	public void showSteadyWater(boolean show) {
		Document doc = getDocument();
		
	    Element elem = doc.getElementById("steadywater");
	    if(show) {
	    	elem.removeClass("invisible");
	    }else {
	    	elem.addClass("invisible");
	    }
	    
	    saveDocument(f, doc);
	}
		
	public void showOpenTankLaundry(boolean show) {
		Document doc = getDocument();
		
	    Element elem = doc.getElementById("openTanklaundry");
	    if(show) {
	    	elem.removeClass("invisible");
	    }else {
	    	elem.addClass("invisible");
	    }
	    
	    saveDocument(f, doc);
	}
	
	public void showOpenDoor(boolean show) {
		Document doc = getDocument();
		
	    Element elem = doc.getElementById("opentank");
	    if(show) {
	    	elem.removeClass("invisible");
	    }else {
	    	elem.addClass("invisible");
	    }
	    
	    saveDocument(f, doc);
	}
	
	public void showClosedDoorLaundry(boolean show) {
		Document doc = getDocument();
		
	    Element elem = doc.getElementById("closeddoorlaundry");
	    if(show) {
	    	elem.removeClass("invisible");
	    }else {
	    	elem.addClass("invisible");
	    }
	    
	    saveDocument(f, doc);
	}
	
	public void showMovingWater(boolean show) {
		Document doc = getDocument();
		
	    Element elem = doc.getElementById("water");
	    if(show) {
	    	elem.removeClass("invisible");
	    }else {
	    	elem.addClass("invisible");
	    }
	    
	    saveDocument(f, doc);
	}
	
	public void showWashingLaundry(boolean show) {
		Document doc = getDocument();
		
	    Element elem = doc.getElementById("washinglaundry");
	    if(show) {
	    	elem.removeClass("invisible");
	    }else {
	    	elem.addClass("invisible");
	    }
	    
	    saveDocument(f, doc);
	}
	
	public void showClosedDoor(boolean show) {
		Document doc = getDocument();
		
	    Element elem = doc.getElementById("tank");
	    if(show) {
	    	elem.removeClass("invisible");
	    }else {
	    	elem.addClass("invisible");
	    }
	    
	    saveDocument(f, doc);
	}
	
	public void showSpinLaundry(boolean show) {
		Document doc = getDocument();
		
	    Element elem = doc.getElementById("spin");
	    if(show) {
	    	elem.removeClass("invisible");
	    }else {
	    	elem.addClass("invisible");
	    }
	    
	    saveDocument(f, doc);
	}
	
	public void showSteadyLaundry(boolean show) {
		Document doc = getDocument();
		
	    Element elem = doc.getElementById("openTanklaundry");
	    if(show) {
	    	elem.removeClass("invisible");
	    }else {
	    	elem.addClass("invisible");
	    } 
	    elem = doc.getElementById("closeddoorlaundry");
	    if(show) {
	    	elem.removeClass("invisible");
	    }else {
	    	elem.addClass("invisible");
	    }
	    
	    saveDocument(f, doc);
	}
	
	public void showThirty(boolean show) {
		Document doc = getDocument();
		
	    Element elem = doc.getElementById("thirty");
	    if(show) {
	    	elem.removeClass("invisible");
	    }else {
	    	elem.addClass("invisible");
	    }
	    
	    saveDocument(f, doc);
	}
	
	public void openBrowser() {
		
		if(Platform.isRunning()) {
			try {
				URL url = new URL(serverUrl);
				// Open default external browser in eclipse if possible
				IWorkbenchBrowserSupport browserSupport = PlatformUI.getWorkbench().getBrowserSupport();
				IWebBrowser externalBrowser = browserSupport.getExternalBrowser();
				externalBrowser.openURL(url);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if(Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)){
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI(serverUrl));
            } catch (IOException | URISyntaxException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }else{
            Runtime runtime = Runtime.getRuntime();
            try {
                runtime.exec("xdg-open " + serverUrl);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
		
//		Shell parentShell = Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell();
//		Shell myShell = new Shell (parentShell, SWT.SHELL_TRIM);
//		// Very important, generally parents must have a layout set to display children
//		myShell.setLayout (new FillLayout()); 
//		Browser browser = new Browser (myShell, SWT.NONE);
//		browser.setUrl ("http://localhost:3000");
//		myShell.layout();
//		myShell.open();
	}

	private static Document getDocument() {
		Document doc = null;
		try {
			doc = Jsoup.connect(serverUrl).get();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return doc;
	}

	private static void saveDocument(File f, Document doc) {
		PrintWriter writer;
		try {
			writer = new PrintWriter(f,"UTF-8");
			writer.write(doc.html() ) ;
		    writer.flush();
		    writer.close();
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) throws IOException {
//		WashingHelper me = new WashingHelper();
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e1) {
//			e1.printStackTrace();
//		}
//		
//		openBrowser();
//		
//		showOpenTankLaundry(true);
//		
//		
//	
//	    
//	}


}
