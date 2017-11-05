package com.neotechlabs.librarymgmtservice.resource;

import com.neotechlabs.librarymgmtservice.document.Books;
import com.neotechlabs.librarymgmtservice.repository.BooksRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/books")
public class BooksResource {

    private BooksRepository booksRepository;

    public BooksResource(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @GetMapping("/all")
    public List<Books> getAll() {
        return booksRepository.findAll();
    }
}
