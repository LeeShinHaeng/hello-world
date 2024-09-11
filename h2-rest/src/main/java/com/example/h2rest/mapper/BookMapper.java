package com.example.h2rest.mapper;

import com.example.h2rest.model.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface BookMapper {
    ArrayList<Book> findAll();

    Book findById(Long id);

    void save(Book book);

    void update(Book book);

    void deleteById(Long id);
}
