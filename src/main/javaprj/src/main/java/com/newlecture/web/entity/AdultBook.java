package com.newlecture.web.entity;

public class AdultBook extends Book{
    private String bookFloor; // 책이 위치하는 층수

    public AdultBook(String[] BookInf) {
    	super(BookInf);
        bookFloor = "2층";
	}

    public String getBookFloor() {
        return bookFloor;
    }

    @Override
    public String toString() {
        return "Book{name='" + getName() + "', writter='" + getWritter() + "', ISBN='" + getISBN() +"', state='"+ isState() + "', floor='" + getBookFloor()+ "'}";
    }
}
