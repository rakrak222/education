package com.baek.bookprj.util;

import com.baek.bookprj.entity.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CsvUtils {
    private static final String csvPath = "/C:/8th_rak/Work/WebApp2/res/books.csv";

    public static List<Book> readBooksFromCsv() throws FileNotFoundException {
//        List<Book> books = new ArrayList<>();
//        try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE_PATH))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                String[] values = line.split(",");
//                if (values.length == 3) {
//                    Book book = new Book(values[0], values[1], values[2]);
//                    books.add(book);
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        
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
				
				books.add(new Book(name, writter, ISBM, state));
			}
		}
        return books;
    }
    
    public static void writeBookToCsv(Book book) throws IOException {
        FileWriter writer = new FileWriter(csvPath, true);
        writer.append(book.getName()).append(",")
        .append(book.getWritter()).append(",")
        .append(book.getISBM()).append(",")
        .append("false")
        .append("\n");
        writer.close();
    }

	public static void writeBooksToCsv(List<Book> books) throws IOException {
        FileWriter writer = new FileWriter(csvPath);
        for (Book book : books) {
            writer.append(book.getName()).append(",")
                  .append(book.getWritter()).append(",")
                  .append(book.getISBM()).append(",")
                  .append("false")
                  .append("\n");
        }
        writer.close();
		
	}
}
