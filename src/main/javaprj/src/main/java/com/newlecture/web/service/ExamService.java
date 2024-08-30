package com.newlecture.web.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import com.newlecture.web.entity.Exam;
import com.newlecture.web.repository.Repository;
import com.newlecture.web.repository.FileExamRepository;


@Component
public class ExamService {
	
	public ExamService() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	private Repository<Exam> repository;
	
//	@Autowired
//	public void setRepository(Repository<Exam> repository) {
//		this.repository = repository;
//	}
	
	// 
	public ExamService(Repository<Exam> repository) {
		this.repository = repository;
		//repository = new FileExamRepository();
		//repository = new JDBCExamRepository();
	}

	public List<Exam> getList() throws IOException {
		
		return getList(1);
		
		
	}
	


	public List<Exam> getList(int page) throws IOException {

		
		List<Exam> list = repository.findAll();

		return list;
	}
	
	

}
