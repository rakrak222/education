package com.baek.bookprj.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.baek.bookprj.entity.Book;
import com.baek.bookprj.repository.CsvUtilsRopository;
import com.baek.bookprj.service.BookService;

@WebServlet("/book/revise")
public class BookRevice extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private BookService service;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookRevice() {
        service = new BookService(new CsvUtilsRopository());
        // TODO Auto-generated constructor stub
    }

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        

        
        request.getRequestDispatcher("/WEB-INF/view/book/detailRevise.jsp").forward(request, response);
	}

    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        
        
        
		String bookName = request.getParameter("bookName");
        String attribute = request.getParameter("attribute");
        String newValue = request.getParameter("newValue");
        
        service.reviseBook(bookName, attribute, newValue);
        
        response.sendRedirect("/javaprj/book/list");
	}

}
