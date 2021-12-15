package com.example.libraryManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Books {
	
	@Id
	@Column(name="BOOK_ID")
	private String bookID;
	
	@Column(name="BOOK_NAME")
	private String bookName;
	
	@Column(name="AUTHOR")
	private String author;
	
	@Column(name="AVAILABLE_COPIES")
	private int availableCopies;
	
	@Column(name="TOTAL_COPIES")
	private int totalCopies;

	/*
	 * public Book() {}
	 * 
	 * public Book(String bookID, String bookName, String author, int
	 * availableCopies, int totalCopies) { super(); this.bookID = bookID;
	 * this.bookName = bookName; this.author = author; this.availableCopies =
	 * availableCopies; this.totalCopies = totalCopies; }
	 */

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
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

	public int getAvailableCopies() {
		return availableCopies;
	}

	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}

	public int getTotalCopies() {
		return totalCopies;
	}

	public void setTotalCopies(int totalCopies) {
		this.totalCopies = totalCopies;
	}

}
