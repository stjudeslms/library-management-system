package com.neotechlabs.librarymgmtservice.repository;

import com.neotechlabs.librarymgmtservice.document.Books;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BooksRepository extends MongoRepository<Books, Integer>{
}
