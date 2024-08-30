package com.newlecture.web.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.newlecture.web.entity.Exam;
import com.newlecture.web.repository.FileExamRepository;
import com.newlecture.web.service.ExamService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

//@Controller
@MultipartConfig(
	maxFileSize = 10*1024*1024, //byte
	maxRequestSize = 200*1024*1024
)
public class ListController extends HttpServlet {

//	@Autowired
	private ExamService service;
	
	public ListController() {
//		Repository<Exam> repository = new JDBCExamRepository();
//		service = new ExamService(repository);
		
		service = new ExamService(new FileExamRepository());
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		
		resp.setContentType("text/html; UTF-8");

		String[] colors;
//		if(colors != null)
//			colors = req.getParameterValues("c");
		int page = 1;
		String page_ = req.getParameter("p");
		
		if(page_ != null)
			page = Integer.parseInt(page_);
		
		
		
		
//		Exam[] exams = service.getList();
		List<Exam> list = service.getList(page);
		
		PrintWriter out = resp.getWriter();

		
		String n = "최윤성";
		
		req.setAttribute("p", page);
		req.setAttribute("list", list);
		
		req.getRequestDispatcher("/WEB-INF/view/exam/list.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Part imgPart = req.getPart("img");
		String imgName = imgPart.getSubmittedFileName();
		InputStream is = imgPart.getInputStream();
		
		
		String realPath = req.getServletContext().getRealPath("/notice/upload");
		System.out.println(realPath);
		
		File pathFile = new File(realPath);
		if(!pathFile.exists())
			pathFile.mkdirs();
		
		String path = realPath+File.separator+imgName;
		FileOutputStream fos = new FileOutputStream(path);
		
//		for(int b=0;(b = is.read()) != -1;)
//			fos.write(b);
		
		byte[] buf = new byte[1024];
		for(int size=0;(size = is.read(buf)) != -1;)
			fos.write(buf,0,size);
		
		
		
		
//		System.out.println(imgName);
	}

	public static boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}

}
