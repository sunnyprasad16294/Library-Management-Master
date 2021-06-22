package com.libr.mng.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.libr.mng.book.data.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

	@Query("from Book where id=?1")
	Book fetchBookDetailsByID(int id);

}
