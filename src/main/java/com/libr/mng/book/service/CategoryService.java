package com.libr.mng.book.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libr.mng.book.data.Book;
import com.libr.mng.book.data.Category;
import com.libr.mng.book.repository.BookRepository;
import com.libr.mng.book.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	public CategoryRepository repo;
	
	@Autowired
	public BookRepository repo1;
	
	
	@PostConstruct
	public void initDB() {
		List<Category> ctgList = new ArrayList<>();
		ctgList.add(new Category(1,"Physics","Gravity"));
		ctgList.add(new Category(2,"Physics","Mechnics"));
		ctgList.add(new Category(3,"Chemistry","Organics"));
		ctgList.add(new Category(4,"Chemistry","InOrganics"));
		ctgList.add(new Category(5,"Mathematics","Differentiation"));
		ctgList.add(new Category(6,"Mathematics","Integration"));
		ctgList.add(new Category(7,"English","Spoken"));
		ctgList.add(new Category(8,"English","Written"));
		
		repo.saveAll(ctgList);
		
		List<Book> bookList = new ArrayList<>();
		bookList.add(new Book(1,"Yo_Gravity","Sunny",10,new Date(System.currentTimeMillis()),this.addDays(new Date(System.currentTimeMillis()), 10),ctgList.get(0)));
		bookList.add(new Book(2,"Thermodynamics","Sudeep",10,new Date(System.currentTimeMillis()),this.addDays(new Date(System.currentTimeMillis()), 10),ctgList.get(1)));
		bookList.add(new Book(3,"Chemistry1","Abhijit",10,new Date(System.currentTimeMillis()),this.addDays(new Date(System.currentTimeMillis()), 10),ctgList.get(2)));
		bookList.add(new Book(4,"Chemistry2","Guru",10,new Date(System.currentTimeMillis()),this.addDays(new Date(System.currentTimeMillis()), 10),ctgList.get(3)));
		bookList.add(new Book(5,"Derivation","Puja Sharma",10,new Date(System.currentTimeMillis()),this.addDays(new Date(System.currentTimeMillis()), 10),ctgList.get(4)));
		bookList.add(new Book(6,"Integrations","Lucky",10,new Date(System.currentTimeMillis()),this.addDays(new Date(System.currentTimeMillis()), 10),ctgList.get(5)));
		bookList.add(new Book(7,"Speak with Confidence","Lipsha",10,new Date(System.currentTimeMillis()),this.addDays(new Date(System.currentTimeMillis()), 10),ctgList.get(6)));
		bookList.add(new Book(8,"Write with Confidence","Jayant",10,new Date(System.currentTimeMillis()),this.addDays(new Date(System.currentTimeMillis()), 10),ctgList.get(7)));
		bookList.add(new Book(9,"Movemnt of Electron","Bignesh",10,new Date(System.currentTimeMillis()),this.addDays(new Date(System.currentTimeMillis()), 10),ctgList.get(0)));
		bookList.add(new Book(10,"Chemical Reaction","Umakant",10,new Date(System.currentTimeMillis()),this.addDays(new Date(System.currentTimeMillis()), 10),ctgList.get(2)));

		repo1.saveAll(bookList);
	}

	
	 public static Date addDays(Date date, int days) {
	        Calendar c = Calendar.getInstance();
	        c.setTime(date);
	        c.add(Calendar.DATE, days);
	        return new Date(c.getTimeInMillis());
	    }
}
