package com.neotechlabs.librarymgmtservice.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Books")
public class Book {
    @Id
    private Integer id;
    private String title;
    private String author;
    private String publisher;
    private String oldIsbn;
    private Long newIsbn;

    public Book() {
    }

    public Book(Integer id, String title, String author, String publisher, String oldIsbn, Long newIsbn) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.oldIsbn = oldIsbn;
        this.newIsbn = newIsbn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getOldIsbn() {
        return oldIsbn;
    }

    public void setOldIsbn(String oldIsbn) {
        this.oldIsbn = oldIsbn;
    }

    public Long getNewIsbn() {
        return newIsbn;
    }

    public void setNewIsbn(Long newIsbn) {
        this.newIsbn = newIsbn;
    }
}
