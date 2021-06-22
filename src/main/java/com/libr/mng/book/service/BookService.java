package com.libr.mng.book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libr.mng.book.data.Book;
import com.libr.mng.book.repository.BookRepository;
import com.libr.mng.book.util.BookException;

@Service
public class BookService {

	@Autowired
	BookRepository repo;
	
	public List<Book> gtAllBooks() {
		return repo.findAll();
	}

	public Book getBookDetailsByID(int id) throws BookException {
		Book bk = new Book();
		Optional<Book> o = repo.findById(id);
		if(o.isPresent()) {
			bk = repo.fetchBookDetailsByID(id);
		}else {
			throw new BookException();
		}
		return bk;
	}

}
