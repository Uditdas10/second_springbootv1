package com.udit.second_springboot.second_springbootv1.service;

import java.util.HashSet;

import com.udit.second_springboot.second_springbootv1.model.Book;

public interface BookService {
	HashSet<Book> findAllBooks();
	Book findById(long id);
	void addBook(Book b);
	void deleteAllBooks();
	void deleteById(long bookid);
}
