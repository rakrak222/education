package com.baek.bookprj.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.baek.bookprj.entity.Book;
import com.baek.bookprj.repository.CsvUtilsRopository;
import com.baek.bookprj.service.BookService;

@WebServlet("/book/list2")
public class BookController extends HttpServlet {
    private static final long serialVersionUID = 1L;
	
    private BookService service;

    public BookController() {
        
    	//service = new BookService(new CsvUtilsRopository());
    	
    	//ApplicationContext context = new ClassPathXmlApplicationContext("spring-setting2.xml");
    	
    	
    	
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	ServletContext application = request.getServletContext();
    	ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
    	service = context.getBean(BookService.class);
    	
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        List<Book> list = service.showBooks();

        request.setAttribute("list", list);
        request.getRequestDispatcher("/WEB-INF/view/book/list.jsp").forward(request, response);
    }

   
        
    
}
