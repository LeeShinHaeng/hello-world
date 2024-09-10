package com.example.h2rest.mapper;

import com.example.h2rest.model.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface BookMapper {
    ArrayList<Book> findAll();

    Book findById(Long id);
}
