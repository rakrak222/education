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
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.baek.bookprj.config.BookprjConfig;
import com.baek.bookprj.entity.Book;
import com.baek.bookprj.repository.CsvUtilsRopository;
import com.baek.bookprj.service.BookService;

@WebServlet("/book/list")
public class BookControllerAnnotation extends HttpServlet {
    private static final long serialVersionUID = 1L;
	
    private BookService service;

    public BookControllerAnnotation() {
        
    	//service = new BookService(new CsvUtilsRopository());
    	
 
    	
//    	ApplicationContext context = new AnnotationConfigApplicationContext(BookprjConfig.class);
//    	service = context.getBean(BookService.class);
    	
    	
    }	
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

    	ServletContext application = request.getServletContext();
    	ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
    	service = context.getBean(BookService.class);
    	
        List<Book> list = service.showBooks();

        request.setAttribute("list", list);
        request.getRequestDispatcher("/WEB-INF/view/book/list.jsp").forward(request, response);
    }

   
        
    
}
