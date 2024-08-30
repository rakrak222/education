package com.baek.di;

import java.io.IOException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baek.bookprj.entity.Book;
import com.baek.bookprj.service.BookService;
import com.newlecture.web.repository.Repository;

public class App {
	public static void main(String[] args) throws IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-setting2.xml");
		
		
		Object book = context.getBean("book");
		System.out.println(book);
		
		BookService service = context.getBean(BookService.class);
		List<Book> list = service.showBooks();
		System.out.println(list);
		
		Repository<Book> repository = context.getBean(Repository.class);
		List<Book> list2 = repository.findAll();
	}
}
