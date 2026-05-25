package com.library.digilib.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    private String author;

    @Column(name = "publication_date")
    private Date publicationDate;

    @Column(name = "is_available")
    private boolean available;

    public Book() {
    }

    public Book(long id, String title, String author, Date publicationDate, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.available = available;
    }

    public Book(String title, String author, Date publicationDate, boolean available) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.available = available;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}