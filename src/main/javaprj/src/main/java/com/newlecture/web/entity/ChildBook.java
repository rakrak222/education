package com.newlecture.web.entity;

public class ChildBook extends Book{
    private String bookFloor; // 책이 위치하는 층수

    
    


    public ChildBook(String[] BookInf) {
    	super(BookInf);
        bookFloor = "1층";
	}



	public String getBookFloor() {
        return bookFloor;
    }

    @Override
    public String toString() {
        return "Book{name='" + getName() + "', writter='" + getWritter() + "', ISBN='" + getISBN() +"', state='"+ isState() + "', floor='" + getBookFloor()+ "'}";
    }
    
}
