package com.example.libraryManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.libraryManagement.entity.Subscription;
import com.example.libraryManagement.repository.SubscriptionRespository;

@Service
public class SubscriptionServiceImpl implements SubscriberService{
	
	@Autowired
	SubscriptionRespository repo;

	@Override
	public List<Subscription> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Subscription> findBySubscriberName(String subscriberName) {
		// TODO Auto-generated method stub
		return repo.findBySubscriberName(subscriberName);
	}

	@Override
	public void createrSubscription(Subscription subscriber) {
		// TODO Auto-generated method stub
		repo.save(subscriber);
	}


}
