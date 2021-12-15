package com.example.libraryManagement.service;

import java.util.List;

import com.example.libraryManagement.entity.Books;

public interface BooksService {
	
	List<Books> findAll();
	List<Books> findByBookID(String bookID);
	Books findByBookName(String bookName);

}