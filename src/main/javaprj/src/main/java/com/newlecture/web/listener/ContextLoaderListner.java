package com.newlecture.web.listener;

import java.io.IOException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.newlecture.web.entity.Exam;
import com.newlecture.web.service.ExamService;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;


@WebListener
public class ContextLoaderListner implements ServletContextListener {
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		
		
//		String xml = "spring-setting4.xml";
//		Object location = sce.getServletContext().getInitParameter("location");
//		if(location != null)
//			xml = String.valueOf(location);
		
		System.out.println("시작되었어? 톰캣");
		ApplicationContext context =
				new ClassPathXmlApplicationContext("spring-setting3.xml");
		
		sce
		.getServletContext()
		.setAttribute("context",context);
		System.out.println("OK");
		
		

		
	}@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("야 또 보자~");
	}

}
