package com.newlecture.web.controller;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class NewWebInitializer implements WebApplicationInitializer{
	
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		XmlWebApplicationContext context = new XmlWebApplicationContext();
		context.setConfigLocations("/WEB-INF/dispatcher-servlet.xml");
		
		ServletRegistration.Dynamic dispatcher =
				servletContext.addServlet("dispatcher", new DispatcherServlet(context));
		System.out.println("onstart");
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
		
	}

}
