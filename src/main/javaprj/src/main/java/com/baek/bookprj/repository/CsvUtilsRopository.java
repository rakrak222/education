package com.baek.bookprj.repository;

import com.baek.bookprj.entity.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class CsvUtilsRopository implements Repository<Book> {
	
	
	
	public CsvUtilsRopository() {
		// TODO Auto-generated constructor stub
	}
	
    @Override
	public List<Book> read(String keyword) throws FileNotFoundException {
    	List<Book> books = new ArrayList<>();
		FileInputStream fis = new FileInputStream(csvPath);
		Scanner scan = new Scanner(fis);
		while (scan.hasNextLine()) {
			String name, writter, ISBM;
			boolean state;
			
			String line = scan.nextLine();
			String[] tokens = line.split(",");
			if (tokens.length == 4) {
				name = tokens[0];
				writter = tokens[1];
				ISBM = tokens[2];
				state = Boolean.valueOf(tokens[3]);
				
				if (name != null && keyword != null && name.contains(keyword))
				books.add(new Book(name, writter, ISBM, state));
			}
		}
        return books;
	}

	private static final String csvPath = "/C:/8th_rak/Work/WebApp2/res/books.csv";

    public List<Book> read() throws FileNotFoundException {
    	List<Book> books = read("");
        return books;
    }
    

	public int write(Book book) throws IOException {
        FileWriter writer = new FileWriter(csvPath, true);
        writer.append(book.getName()).append(",")
        .append(book.getWritter()).append(",")
        .append(book.getISBM()).append(",")
        .append("false")
        .append("\n");
        writer.close();
		return 0;
    }

	public int write(List<Book> books) throws IOException {
        FileWriter writer = new FileWriter(csvPath);
        for (Book book : books) {
            writer.append(book.getName()).append(",")
                  .append(book.getWritter()).append(",")
                  .append(book.getISBM()).append(",")
                  .append("false")
                  .append("\n");
        }
        writer.close();
		return 0;
		
	}
	
	@Override
	public void revise(String bookName, String attribute, String newValue) throws IOException {
		   List<Book> allBooks = this.read();
		   for (Book book : allBooks) {
			   if (book.getName().equals(bookName)) {
				   switch (attribute) {
				   case "name":
					   book.setName(newValue);
					   break;
				   case "writter":
					   book.setWritter(newValue);
					   break;
				   case "ISBM":
					   book.setISBM(newValue);
					   break;
				   }
				   this.write(allBooks);
				   break;
			   }
		   }
		
	}
}
