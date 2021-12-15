package com.example.libraryManagement.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subscription {
	
	@Id
	@Column(name="SUBCRIBER_NAME")
	private String subscriberName;
	
	@Column(name="DATE_SUBSCRIBED")
	private Date dateSubscribed;
	
	@Column(name="DATE_RETURNED")
	private Date dateReturned;
	
	@Column(name="BOOK_ID")
	private String bookID;
	
	public String getSubscriberName() {
		return subscriberName;
	}

	public void setSubscriberName(String subscriberName) {
		this.subscriberName = subscriberName;
	}

	public Date getDateSubscribed() {
		return dateSubscribed;
	}

	public void setDateSubscribed(Date dateSubscribed) {
		this.dateSubscribed = dateSubscribed;
	}

	public Date getDateReturned() {
		return dateReturned;
	}

	public void setDateReturned(Date dateReturned) {
		this.dateReturned = dateReturned;
	}

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
}
