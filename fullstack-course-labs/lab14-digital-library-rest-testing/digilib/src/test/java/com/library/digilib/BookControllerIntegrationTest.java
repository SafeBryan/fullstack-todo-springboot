package com.library.digilib;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.library.digilib.model.Book;
import com.library.digilib.repository.BookRepository;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BookControllerIntegrationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private BookRepository bookRepository;

    private String baseUrl() {
        return "http://localhost:" + port + "/books";
    }

    @BeforeEach
    void setUp() {
        Book book = bookRepository.findById(3L).orElse(new Book());

        book.setId(3L);
        book.setTitle("Clean Code: A Handbook of Agile Software Craftsmanship");
        book.setAuthor("Robert C. Martin");
        book.setPublicationDate(Date.valueOf("2008-08-11"));
        book.setAvailable(true);

        bookRepository.save(book);
    }

    @Test
    void shouldCompleteGetBorrowAndReturnFlow() {
        ResponseEntity<String> getResponse = restTemplate.getForEntity(
                baseUrl() + "/3",
                String.class);

        assertEquals(HttpStatus.OK, getResponse.getStatusCode());
        assertNotNull(getResponse.getBody());
        assertTrue(getResponse.getBody().contains("Clean Code"));
        assertTrue(getResponse.getBody().contains("borrow"));

        ResponseEntity<String> borrowResponse = restTemplate.postForEntity(
                baseUrl() + "/3/borrow",
                null,
                String.class);

        assertEquals(HttpStatus.OK, borrowResponse.getStatusCode());
        assertNotNull(borrowResponse.getBody());
        assertTrue(borrowResponse.getBody().contains("\"available\":false"));

        Book borrowedBook = bookRepository.findById(3L).orElseThrow();
        assertFalse(borrowedBook.isAvailable());

        ResponseEntity<String> returnResponse = restTemplate.postForEntity(
                baseUrl() + "/3/return",
                null,
                String.class);

        assertEquals(HttpStatus.OK, returnResponse.getStatusCode());
        assertNotNull(returnResponse.getBody());
        assertTrue(returnResponse.getBody().contains("\"available\":true"));

        Book returnedBook = bookRepository.findById(3L).orElseThrow();
        assertTrue(returnedBook.isAvailable());
    }

    @Test
    void shouldReturnNotFoundWhenBookDoesNotExist() {
        ResponseEntity<String> response = restTemplate.getForEntity(
                baseUrl() + "/999",
                String.class);

        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
        assertNotNull(response.getBody());
        assertTrue(response.getBody().contains("not found"));
    }
}