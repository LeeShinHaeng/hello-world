package com.example.h2rest.service;

import com.example.h2rest.mapper.BookMapper;
import com.example.h2rest.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookMapper bookMapper;

    public List<Book> findAllBooks() {
        return bookMapper.findAll();
    }

    public Book findBooksById(Long id) {
        try {
            return bookMapper.findById(id);
        } catch (Exception e) {
            return null;
        }
    }

    public Book createBook(Book book) {
        bookMapper.save(book);
        return book;
    }

    public Book updateBook(Long id, Book book) {
        Book foundBook = findBooksById(id);

        foundBook.setPublishedDate(book.getPublishedDate());
        foundBook.setAuthor(book.getAuthor());
        foundBook.setTitle(book.getTitle());
        foundBook.setPublisher(book.getPublisher());
        bookMapper.update(foundBook);

        return foundBook;
    }

    public void deleteBook(Long id) {
        bookMapper.deleteById(id);
    }
}
