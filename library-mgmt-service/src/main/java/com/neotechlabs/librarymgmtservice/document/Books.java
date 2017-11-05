package com.neotechlabs.librarymgmtservice.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Books {

    @Id
    private Integer id;
    private String title;
    private String author;
    private String publisher;
    private Long isbn;

    public Books(Integer id, String title, String author, String publisher, Long isbn) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
