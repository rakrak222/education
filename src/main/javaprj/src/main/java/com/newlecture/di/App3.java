package com.newlecture.di;

import java.io.IOException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.newlecture.web.entity.Exam;
import com.newlecture.web.repository.Repository;
import com.newlecture.web.service.ExamService;

public class App3 {
	
	int x = 3;
	
	public App3() {
		System.out.println(x);
		x = 4;
		System.out.println(x);
	}
	
	public static void main(String[] args) throws IOException {
		
		new App3();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-setting4.xml");
		
		ExamService service = context.getBean(ExamService.class);
		
		List<Exam> list = service.getList();
		System.out.println(list);
	}
}