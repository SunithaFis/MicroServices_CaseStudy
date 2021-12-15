package com.example.libraryManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.libraryManagement.entity.Books;
import com.example.libraryManagement.repository.BooksRepository;

@Service
public class BooksServiceImpl implements BooksService{
	
	@Autowired
	BooksRepository repo;

	@Override
	public List<Books> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Books> findByBookID(String bookID) {
		// TODO Auto-generated method stub
		return repo.findByBookID(bookID);
	}
	
	@Override
	public Books findByBookName(String bookName) {
		// TODO Auto-generated method stub
		return repo.findByBookName(bookName);
	}
	
}
