package com.example.libraryManagement.service;

import java.util.List;

import com.example.libraryManagement.entity.Subscription;

public interface SubscriberService {
	
	List<Subscription> findAll();
	List<Subscription> findBySubscriberName(String subscriberName);
	void createrSubscription(Subscription subscriber);

}
