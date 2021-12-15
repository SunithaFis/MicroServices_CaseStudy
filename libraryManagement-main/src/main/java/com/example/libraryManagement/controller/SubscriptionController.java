package com.example.libraryManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.libraryManagement.entity.Subscription;
import com.example.libraryManagement.service.SubscriptionServiceImpl;

@RestController
public class SubscriptionController {
	
	@Autowired
	SubscriptionServiceImpl service;
	
	@GetMapping(value="/getSubscription")
	public List<Subscription> getSubscriber(){
		return service.findAll();
	}
	
	@PostMapping(value="/createSubscription")
	public void createSubscriber(@RequestBody Subscription subscriber) {
		service.createrSubscription(subscriber);
	}
	
}
