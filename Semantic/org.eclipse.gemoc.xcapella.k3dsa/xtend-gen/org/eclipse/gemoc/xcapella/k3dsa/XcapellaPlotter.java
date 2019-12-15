package org.eclipse.gemoc.xcapella.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.kairos.oscilloscup.view.views.OscilloscupView;
import java.awt.Frame;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gemoc.xcapella.k3dsa.ComponentExchangeAspect;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.pa.PhysicalArchitecture;
import oscilloscup.data.rendering.DataElementRenderer;
import oscilloscup.data.rendering.figure.ConnectedLineFigureRenderer;
import oscilloscup.multiscup.Clock;
import oscilloscup.multiscup.Multiscope;
import oscilloscup.multiscup.Property;
import oscilloscup.multiscup.PropertyValueFormatter;

@SuppressWarnings("all")
public class XcapellaPlotter {
  public static class PlotterClock extends Clock {
    @Override
    public double getTime() {
      return (XcapellaPlotter.current_time).intValue();
    }
    
    @Override
    public String getTimeUnit() {
      return "milliseconds";
    }
  }
  
  public static class ComponentExchangeProperty extends Property<ComponentExchange> {
    @Override
    public Object getRawValue(final ComponentExchange ce) {
      return ComponentExchangeAspect.value(ce);
    }
  }
  
  public static Integer current_time = Integer.valueOf(0);
  
  public static Multiscope<ComponentExchange> multiScopeConnectorValues;
  
  @InitializeModel
  public static void initialize(final CapellaElement elm) {
    Display _default = Display.getDefault();
    _default.asyncExec(new Runnable() {
      @Override
      public void run() {
        IViewPart v = null;
        try {
          v = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("fr.inria.kairos.oscilloscup.view.views.OscilloscupView");
        } catch (final Throwable _t) {
          if (_t instanceof PartInitException) {
            final PartInitException e = (PartInitException)_t;
            System.err.println(e);
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
        Frame f = ((OscilloscupView) v).frame;
        f.setSize(1000, 800);
        f.removeAll();
        EList<ComponentExchange> allCapElem = ((PhysicalArchitecture) elm).getOwnedPhysicalComponent().getOwnedComponentExchanges();
        ArrayList<ComponentExchange> plotCes = new ArrayList<ComponentExchange>();
        for (final ComponentExchange ce : allCapElem) {
          if (((ce.getSummary() != null) && ce.getSummary().startsWith("plot"))) {
            plotCes.add(ce);
          }
        }
        InputOutput.<String>println(("plotCes =" + plotCes));
        final XcapellaPlotter.PlotterClock aClock = new XcapellaPlotter.PlotterClock();
        XcapellaPlotter.ComponentExchangeProperty cewp = new XcapellaPlotter.ComponentExchangeProperty();
        cewp.setName("Connector values");
        PropertyValueFormatter.PrettyDecimals _prettyDecimals = new PropertyValueFormatter.PrettyDecimals(2);
        cewp.setReformatter(_prettyDecimals);
        cewp.setClock(aClock);
        XcapellaPlotter.createComponentExchangeMultiscope(f, cewp, plotCes);
        f.setVisible(true);
        GridLayout _gridLayout = new GridLayout();
        f.setLayout(_gridLayout);
      }
    });
  }
  
  public static void createComponentExchangeMultiscope(final Frame f, final XcapellaPlotter.ComponentExchangeProperty prop, final List<ComponentExchange> tasks) {
    List<Property<ComponentExchange>> _asList = Arrays.<Property<ComponentExchange>>asList(prop);
    XcapellaPlotter.multiScopeConnectorValues = new Multiscope<ComponentExchange>(_asList) {
      @Override
      protected String getRowNameFor(final ComponentExchange row) {
        return row.getName();
      }
      
      @Override
      protected int getNbPointsInSlidingWindow(final ComponentExchange row, final Property<ComponentExchange> p) {
        return 50;
      }
      
      @Override
      protected DataElementRenderer getSpecificRenderer(final ComponentExchange row, final Property<ComponentExchange> property) {
        return new ConnectedLineFigureRenderer();
      }
    };
    XcapellaPlotter.multiScopeConnectorValues.setRows(tasks);
    XcapellaPlotter.multiScopeConnectorValues.setRefreshPeriodMs(500);
    f.add(XcapellaPlotter.multiScopeConnectorValues);
  }
}
