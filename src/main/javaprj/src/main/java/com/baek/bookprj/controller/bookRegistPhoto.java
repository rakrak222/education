package com.baek.bookprj.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.baek.bookprj.entity.Book;
import com.baek.bookprj.service.BookService;

@WebServlet("/book/registPhoto")
public class bookRegistPhoto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bookRegistPhoto() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        BookService service = new BookService();
        List<Book> list = service.showBooks();

        request.setAttribute("list", list);
        
        request.getRequestDispatcher("/WEB-INF/view/book/detailRegist.jsp").forward(request, response);
    }
        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        String action = request.getParameter("action");
        BookService service = new BookService();
        
        String registBookName = request.getParameter("name");
        String registWritterName = request.getParameter("writter");
        String registISBM = request.getParameter("ISBM");

        String uploadPath = application.getRealPath("/upload");
        
        
        
        Book newBook = new Book(registBookName, registWritterName, registISBM, false);
        service.regist(newBook);

        List<Book> list = service.showBooks();
        request.setAttribute("list", list);
        response.sendRedirect("/javaprj/book/list");
        //request.getRequestDispatcher("/WEB-INF/view/book/list.jsp").forward(request, response);
	}

}
