package com.library.digilib.controller;

import com.library.digilib.model.Book;
import com.library.digilib.service.BookService;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getBookById(@PathVariable long id) {
        Book foundBook = bookService.findBookById(id);

        if (foundBook == null) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Error: Book with ID " + id + " not found.");
        }

        EntityModel<Book> resource = EntityModel.of(foundBook);
        resource.add(linkTo(methodOn(BookController.class).getBookById(id)).withSelfRel());

        if (foundBook.isAvailable()) {
            resource.add(linkTo(methodOn(BookController.class).borrowBook(id)).withRel("borrow"));
        } else {
            resource.add(linkTo(methodOn(BookController.class).returnBook(id)).withRel("return"));
        }

        return ResponseEntity.ok(resource);
    }

    @PostMapping("/{id}/borrow")
    public ResponseEntity<?> borrowBook(@PathVariable long id) {
        Book foundBook = bookService.findBookById(id);

        if (foundBook == null) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Error: Book with ID " + id + " not found.");
        }

        if (!foundBook.isAvailable()) {
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .body("Error: Book with ID " + id + " is already borrowed.");
        }

        foundBook.setAvailable(false);
        Book updatedBook = bookService.updateBook(foundBook);

        EntityModel<Book> resource = EntityModel.of(
                updatedBook,
                linkTo(methodOn(BookController.class).getBookById(id)).withSelfRel());

        return ResponseEntity.ok(resource);
    }

    @PostMapping("/{id}/return")
    public ResponseEntity<?> returnBook(@PathVariable long id) {
        Book foundBook = bookService.findBookById(id);

        if (foundBook == null) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Error: Book with ID " + id + " not found.");
        }

        if (foundBook.isAvailable()) {
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .body("Error: Book with ID " + id + " has already been returned.");
        }

        foundBook.setAvailable(true);
        Book updatedBook = bookService.updateBook(foundBook);

        EntityModel<Book> resource = EntityModel.of(
                updatedBook,
                linkTo(methodOn(BookController.class).getBookById(id)).withSelfRel());

        return ResponseEntity.ok(resource);
    }
}