package com.baek.bookprj.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.baek.bookprj.entity.Book;
import com.baek.bookprj.repository.Repository;

@Component
public class BookService {
	@Autowired
   private Repository<Book> repository;
   
   
   public BookService(Repository<Book> repository) {
	   this.repository = repository;
}
   public BookService() {
	// TODO Auto-generated constructor stub
}
   


   public void setRepository(Repository<Book> repository) {
	this.repository = repository;
}
public void regist(Book book) throws IOException {
	   repository.write(book);
   }
   
   public List<Book> showBooks() throws FileNotFoundException {

	   List<Book> list = repository.read();
		return list;
   }


    
   public List<Book> searchBook(String keyword) throws FileNotFoundException {
	   List<Book> list = repository.read(keyword);
	   
	   return list;
   }
   
   
   public void reviseBook(String bookName, String attribute, String newValue) throws FileNotFoundException, IOException {
	   repository.revise(bookName,attribute,newValue);
   }


 
   


   public void delBook(int bookId) {
	 // books.remove(bookId);
	   

      
   }



}
   







