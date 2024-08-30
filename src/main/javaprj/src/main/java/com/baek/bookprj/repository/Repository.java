package com.baek.bookprj.repository;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.baek.bookprj.entity.Book;

public interface Repository<T> {		
	
	List<Book> read() throws FileNotFoundException;
	int write(T t) throws IOException;

	void revise(String bookName, String attribute, String newValue) throws FileNotFoundException, IOException;
	List<Book> read(String keyword) throws FileNotFoundException;
	
}
