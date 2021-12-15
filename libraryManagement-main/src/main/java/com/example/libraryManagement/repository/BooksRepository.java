package com.example.libraryManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.libraryManagement.entity.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Long> {
	
	List<Books> findByBookID(String bookID);
	Books findByBookName(String bookName);

}