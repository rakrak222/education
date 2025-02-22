package com.newlecture.web.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.lang.Nullable;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.newlecture.web.entity.Exam;
import com.newlecture.web.service.ExamService;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class IndexController extends HttpServlet implements Controller{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext application = req.getServletContext();
//		ApplicationContext context 
//		= (ApplicationContext) application.getAttribute("context");

		ApplicationContext context = WebApplicationContextUtils
									.getWebApplicationContext(getServletContext());
		
		
		ExamService service = context.getBean(ExamService.class);
		List<Exam> list;
		try {
			list = service.getList();
			System.out.println(list);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	@Nullable
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		
		ModelAndView mv = new ModelAndView("/WEB-INF/view/index.jsp");
		
		mv.addObject("test", "hello");
		
		return mv;
	}

}
