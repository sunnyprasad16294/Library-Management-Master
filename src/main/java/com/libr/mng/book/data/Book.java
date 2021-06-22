package com.libr.mng.book.data;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Book {
	
	@Id
	private int bookID;
	private String bookName;
	private String autherName;
	private int keepDays;
	private Date issuedDate;
	private Date lastDateOfReturn;
	
	@ManyToOne
	private Category category;
	
	

}
