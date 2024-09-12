package com.example.h2rest.service;

import com.example.h2rest.entity.BookEntity;
import com.example.h2rest.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public List<BookEntity> findAllBooks() {
        return bookRepository.findAll();
    }

    public BookEntity findBooksById(Long id) {
        try {
            return bookRepository.findById(id).orElse(null);
        } catch (Exception e) {
            return null;
        }
    }

    public BookEntity createBook(BookEntity bookEntity) {
        return bookRepository.save(bookEntity);
    }

    public BookEntity updateBook(Long id, BookEntity bookEntity) {
        BookEntity foundBook = findBooksById(id);

        foundBook.setPublishedDate(bookEntity.getPublishedDate());
        foundBook.setAuthor(bookEntity.getAuthor());
        foundBook.setTitle(bookEntity.getTitle());
        foundBook.setPublisher(bookEntity.getPublisher());
        bookRepository.save(foundBook);

        return foundBook;
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
