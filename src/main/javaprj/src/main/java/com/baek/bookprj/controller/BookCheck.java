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

@WebServlet("/book/check")
public class BookCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private BookService service;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookCheck() {
        service = new BookService(new CsvUtilsRopository());
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        
        List<Book> list = service.showBooks();

        request.setAttribute("list", list);
        request.getRequestDispatcher("/WEB-INF/view/book/check.jsp").forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
