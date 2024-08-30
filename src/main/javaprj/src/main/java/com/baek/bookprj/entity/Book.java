package com.baek.bookprj.entity;
//회원 >> 책 대출
//

import org.springframework.stereotype.Component;

@Component
public class Book {
   
   private String name;
   private String writter;
   private String ISBM;
   
   private boolean state;public Book() {
	// TODO Auto-generated constructor stub
}
   

   
   public Book(String name, String writter, String ISBM, boolean state) {
      this.name = name;
      this.writter = writter;
      this.ISBM = ISBM;
      this.state = false;
      
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

   public String getISBM() {
      return ISBM;
   }

   public void setISBM(String ISBM) {
      this.ISBM = ISBM;
   }

   public boolean isState() {
      return state;
   }
   
   

   public void setState(boolean state) {
      this.state = state;
   }



   
         
   @Override
   public String toString() {
       return "Book{name='" + name + "', writter='" + writter + "', ISBN='" + ISBM +"', state='"+ state + "'}";
   }
   
   
   
}
