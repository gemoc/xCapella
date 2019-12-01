package org.eclipse.gemoc.xcapella.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import groovy.lang.Binding;
import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyShell;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.gemoc.xcapella.k3dsa.CapellaElementAspectCapellaElementAspectProperties;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.polarsys.capella.core.data.capellacore.CapellaElement;

@Aspect(className = CapellaElement.class)
@SuppressWarnings("all")
public class CapellaElementAspect {
  public static String callGroovy(final CapellaElement _self) {
    final org.eclipse.gemoc.xcapella.k3dsa.CapellaElementAspectCapellaElementAspectProperties _self_ = org.eclipse.gemoc.xcapella.k3dsa.CapellaElementAspectCapellaElementAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String callGroovy()
    if (_self instanceof org.polarsys.capella.core.data.capellacore.CapellaElement){
    	result = org.eclipse.gemoc.xcapella.k3dsa.CapellaElementAspect._privk3_callGroovy(_self_, (org.polarsys.capella.core.data.capellacore.CapellaElement)_self);
    };
    return (java.lang.String)result;
  }
  
  protected static String _privk3_callGroovy(final CapellaElementAspectCapellaElementAspectProperties _self_, final CapellaElement _self) {
    final Binding binding = new Binding();
    binding.setVariable("id", _self.getId());
    ClassLoader lastClassLoader = null;
    ClassLoader currentClassLoader = null;
    try {
      InputOutput.<String>println("run code");
      final List<IJavaProject> javaProjects = new ArrayList<IJavaProject>();
      final IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
      for (final IProject project : projects) {
        {
          project.open(null);
          final IJavaProject javaProject = JavaCore.create(project);
          javaProjects.add(javaProject);
        }
      }
      final List<URL> urlList = new ArrayList<URL>();
      for (final IJavaProject project_1 : javaProjects) {
        {
          final String[] classPathEntries = JavaRuntime.computeDefaultRuntimeClassPath(project_1);
          for (int i = 0; (i < classPathEntries.length); i++) {
            {
              final String entry = classPathEntries[i];
              final IPath path = new Path(entry);
              final URL url = path.toFile().toURI().toURL();
              urlList.add(url);
            }
          }
          lastClassLoader = project_1.getClass().getClassLoader();
          URL[] urls = new URL[((Object[])Conversions.unwrapArray(urlList, Object.class)).length];
          for (int i = 0; (i < ((Object[])Conversions.unwrapArray(urlList, Object.class)).length); i++) {
            urls[i] = urlList.get(i);
          }
          URLClassLoader _uRLClassLoader = new URLClassLoader(urls, lastClassLoader);
          currentClassLoader = _uRLClassLoader;
          lastClassLoader = currentClassLoader;
        }
      }
      final GroovyShell shell = new GroovyShell(binding);
      GroovyClassLoader cl = shell.getClassLoader();
      for (int i = 0; (i < ((Object[])Conversions.unwrapArray(urlList, Object.class)).length); i++) {
        cl.addURL(urlList.get(i));
      }
      Object _evaluate = shell.evaluate(_self.getDescription());
      final Map<String, Object> res = ((Map<String, Object>) _evaluate);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception cnfe = (Exception)_t;
        String _message = cnfe.getMessage();
        String _plus = ("Failed to call Groovy script " + _message);
        InputOutput.<String>println(_plus);
        cnfe.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _self.getDescription();
  }
}
