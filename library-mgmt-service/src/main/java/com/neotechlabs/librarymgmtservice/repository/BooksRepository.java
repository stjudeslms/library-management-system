package com.neotechlabs.librarymgmtservice.repository;

import com.neotechlabs.librarymgmtservice.document.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BooksRepository extends MongoRepository<Book, Integer>{
    Book findById(Integer id);
    List<Book> findByAuthor(String name);
}
