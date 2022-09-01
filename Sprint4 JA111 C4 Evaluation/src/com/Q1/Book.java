package com.Q1;

import java.util.Objects;

public class Book {


	private int bookId;
	private String bookName;
	private String author;
	
	
	
	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Book(int bookId, String bookName, String author) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
	}

	
	
	

	@Override
	public int hashCode() {
		return Objects.hash(bookId);
	}


	@Override
	public boolean equals(Object obj) {

		Book b = this;
		Book b2 = (Book)obj;
		
		if(b.getBookId() == b2.bookId) {
			return true;
		}
		else
			return false;
				
	}


	@Override
	public String toString() {
		return "Book {bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + "}";
	}



	


	


}
