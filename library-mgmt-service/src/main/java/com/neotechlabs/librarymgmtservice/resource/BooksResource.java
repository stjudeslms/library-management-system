package com.neotechlabs.librarymgmtservice.resource;

import com.neotechlabs.librarymgmtservice.document.Book;
import com.neotechlabs.librarymgmtservice.repository.BooksRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lms/inventory")
public class BooksResource {

    private BooksRepository booksRepository;

    public BooksResource(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @GetMapping("/all")
    public List<Book> getAll() {
        return booksRepository.findAll();
    }

    @PutMapping
    public void insert(@RequestBody Book book) {
        booksRepository.insert(book);
    }

    @PostMapping
    public void update(@RequestBody Book book) {
        booksRepository.save(book);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id) {
        booksRepository.delete(id);
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable("id")Integer id) {
        Book book = booksRepository.findById(id);
        return book;
    }

    @GetMapping("/author/{name}")
    public List<Book> getByAuthor(@PathVariable("name")String name) {
        List<Book> books = booksRepository.findByAuthor(name);
//        String authorName = name.replaceAll("%20", " ");
//        List<Book> books = booksRepository.findByAuthor(authorName);
        return books;
    }
}
