package com.example.springboot.loginentity.BookEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BookEntity {

    @Id
    private int ebookId;
    private String title;
    private String author;
    private String genre;
    private int pageCount;

    public BookEntity(int ebookId, String title, String author, String genre, int pageCount) {
        this.ebookId = ebookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pageCount = pageCount;
    }

    public BookEntity() {
    }

    public int getEbookId() {
        return ebookId;
    }

    public void setEbookId(int ebookId) {
        this.ebookId = ebookId;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
