package com.libr.mng.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libr.mng.book.data.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
