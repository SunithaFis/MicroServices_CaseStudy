package com.example.libraryManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.libraryManagement.entity.Subscription;

@Repository
public interface SubscriptionRespository extends JpaRepository<Subscription, Long>{
	
	List<Subscription> findBySubscriberName(String subscriber);

}
