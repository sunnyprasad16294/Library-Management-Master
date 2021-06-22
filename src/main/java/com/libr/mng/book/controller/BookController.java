package com.libr.mng.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libr.mng.book.data.Book;
import com.libr.mng.book.service.BookService;
import com.libr.mng.book.util.BookException;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	BookService service;
	
	@GetMapping("/testxception")
	public Book testException() throws BookException {
		throw new BookException();
		
	}
	
	@GetMapping("/getAllBooks")
	public List<Book> getAllBooks()  {
		return service.gtAllBooks();
	}
	
	@GetMapping("/getBookDetails/{id}")
	public Book getBookDetailsByID(@PathVariable int id) throws BookException {
		
		return service.getBookDetailsByID(id);
		
	}

}
