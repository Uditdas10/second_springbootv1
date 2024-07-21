package com.udit.second_springboot.second_springbootv1.controller;

import java.util.HashSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.udit.second_springboot.second_springbootv1.model.Book;
import com.udit.second_springboot.second_springbootv1.service.BookServiceImpl;

@RestController
public class BookController {
	@Autowired
	BookServiceImpl bookServiceImpl;
	@PostMapping("/")
	public void addBook(@RequestBody Book book) {
		bookServiceImpl.addBook(book);
	}
	@GetMapping("/find_all")
	public HashSet<Book> getAllBooks(){
	return bookServiceImpl.findAllBooks();
	}
	@GetMapping("/find_by_id/{bookid}")
	public Book getBookById(@PathVariable long bookid) {
		return bookServiceImpl.findById(bookid);	
	}
	
	
	@DeleteMapping("/delete")
	public void deleteAllBooks() {
		bookServiceImpl.deleteAllBooks();
	}
	
	@DeleteMapping("/delete_by_id/{bookid}")
	public void deleteById(@PathVariable long bookid) {
		bookServiceImpl.deleteById(bookid);	
	}
}
