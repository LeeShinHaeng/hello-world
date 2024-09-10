package com.example.h2rest.controller;

import com.example.h2rest.model.Book;
import com.example.h2rest.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    // http://localhost:8080/books/search?id=1
    @GetMapping("/search")
    public Book getBooksById(@RequestParam Long id) {
        return bookService.findBooksById(id);
    }
}
