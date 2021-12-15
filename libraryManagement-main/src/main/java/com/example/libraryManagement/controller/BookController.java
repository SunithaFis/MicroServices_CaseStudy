package com.example.libraryManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.libraryManagement.entity.Books;
import com.example.libraryManagement.service.BooksServiceImpl;

@RestController
public class BookController {
	
	@Autowired
	BooksServiceImpl service;
	
	@GetMapping(value="/getBooks")
	public List<Books> getAllBooks() {
		return service.findAll();
	}
}
