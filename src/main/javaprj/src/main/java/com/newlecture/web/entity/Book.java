package com.newlecture.web.entity;
//회원 >> 책 대출
//


public abstract class Book {
   private String[] book;
   private String name;
   private String writter;
   private String ISBN;
   private boolean state;
   
   public Book() {
      this(null);
   }
   
   public Book(String[] BookInf) {
      this.name = BookInf[0];
      this.writter = BookInf[1];
      this.ISBN = BookInf[2];
      state = false;
      book = new String[4];
   }
      
   public String[] getBook() {
      return book;
   }

   public void setBook(String[] book) {
      this.book = book;
   }
   
   
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getWritter() {
      return writter;
   }

   public void setWritter(String writter) {
      this.writter = writter;
   }

   public String getISBN() {
      return ISBN;
   }

   public void setISBN(String ISBN) {
      this.ISBN = ISBN;
   }

   public boolean isState() {
      return state;
   }
   
   

   public void setState(boolean state) {
      this.state = state;
   }

   public void setbook(String name, String writter, String isbn) {
      
      this.book[0] = name;
      this.book[1] = writter;
      this.book[2] = isbn;
   }

   
         
   @Override
   public String toString() {
       return "Book{name='" + name + "', writter='" + writter + "', ISBN='" + ISBN +"', state='"+ state + "'}";
   }
   
   
   
}
