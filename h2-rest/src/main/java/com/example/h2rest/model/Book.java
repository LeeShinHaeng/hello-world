package com.example.h2rest.model;

import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class Book {
    @Id
    private Long id;
    private String title;
    private String author;
    private LocalDate publishedDate;
    private String publisher;
}
