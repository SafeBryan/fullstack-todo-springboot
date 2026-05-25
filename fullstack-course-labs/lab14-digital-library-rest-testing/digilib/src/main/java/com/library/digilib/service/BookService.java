package com.library.digilib.service;

import com.library.digilib.model.Book;
import com.library.digilib.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book findBookById(long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }
}