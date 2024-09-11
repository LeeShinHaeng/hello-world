package com.example.h2rest.controller;

import com.example.h2rest.model.Book;
import com.example.h2rest.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    //  http://localhost:8080/books
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.findAllBooks();
    }

    // http://localhost:8080/books/1
    @GetMapping("/{id}")
    public Book getBooksById(@PathVariable Long id) {
        return bookService.findBooksById(id);
    }

    // http://localhost:8080/books
    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    // http://localhost:8080/books/1
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        return bookService.updateBook(id, book);
    }

    // http://localhost:8080/books/1
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}
