package com.Online.Bookstore.OnlineBookStore.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.Online.Bookstore.OnlineBookStore.entity.BookCategory;

@RepositoryRestResource(collectionResourceRel = "bookCateogry", path = "book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}