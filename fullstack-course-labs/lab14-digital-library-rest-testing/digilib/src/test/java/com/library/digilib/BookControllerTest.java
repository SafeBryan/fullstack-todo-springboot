package com.library.digilib;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
class BookControllerTest {

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
        Book book = bookRepository.findById(1L).orElse(new Book());

        book.setId(1L);
        book.setTitle("Spring Boot in Action");
        book.setAuthor("Craig Walls");
        book.setPublicationDate(Date.valueOf("2015-11-01"));
        book.setAvailable(true);

        bookRepository.save(book);
    }

    @Test
    void shouldGetBookById() {
        ResponseEntity<String> response = restTemplate.getForEntity(
                baseUrl() + "/1",
                String.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertTrue(response.getBody().contains("Spring Boot in Action"));
        assertTrue(response.getBody().contains("_links"));
    }

    @Test
    void shouldBorrowBook() {
        ResponseEntity<String> response = restTemplate.postForEntity(
                baseUrl() + "/1/borrow",
                null,
                String.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertTrue(response.getBody().contains("\"available\":false"));
        assertTrue(response.getBody().contains("_links"));
    }

    @Test
    void shouldReturnBook() {
        Book book = bookRepository.findById(1L).orElseThrow();
        book.setAvailable(false);
        bookRepository.save(book);

        ResponseEntity<String> response = restTemplate.postForEntity(
                baseUrl() + "/1/return",
                null,
                String.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertTrue(response.getBody().contains("\"available\":true"));
        assertTrue(response.getBody().contains("_links"));
    }
}