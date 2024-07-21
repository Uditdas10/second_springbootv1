package com.udit.second_springboot.second_springbootv1.service;

import java.util.HashSet;

import org.springframework.stereotype.Service;

import com.udit.second_springboot.second_springbootv1.model.Book;

@Service
public class BookServiceImpl implements BookService {
	HashSet<Book> booklist = new HashSet<>();
	@Override
	public HashSet<Book> findAllBooks() {
		if(booklist.isEmpty()) {
			return null;
		}else {
			return booklist;
		}
	}

	@Override
	public Book findById(long bookid) {
		Book book = booklist.stream().filter(b -> b.getBookid() == bookid).findAny().orElse(null);
		return book;
	}

	@Override
	public void addBook(Book b) {
		booklist.add(b);
		
//		 boolean alreadyExists = false;
//	        for (Book existingBook : booklist) {
//	            if (existingBook.getBookid() == b.getBookid() || ((existingBook.getTitle().equals(b.getTitle()) && existingBook.getAuthor().equals(b.getAuthor())))) {
//	                alreadyExists = true;
//	                break;
//	            }
//	        }
//	        
//	        if (!alreadyExists) {
//	            booklist.add(b);
//	        } else {
//	            System.out.println("Duplicate book or bookid detected");
//	            
//	        }
	      
	       
		
	}

	@Override
	public void deleteAllBooks() {
		booklist.clear();
		
	}
	
	@Override
	public void deleteById(long bookid) {
		booklist.removeIf(book -> book.getBookid() == bookid);
		
	}

}
