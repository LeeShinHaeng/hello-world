import React from 'react';
import { useParams } from 'react-router-dom';

const bookDetails = {
  "Book1": {
    author: "홀길동",
    publisher: "출판사1",
    publishDate: "2023-01-01",
    price: "20,000"
  },
  "Book2": {
    author: "홍길순",
    publisher: "출판사2",
    publishDate: "2024-01-01",
    price: "25,000"
  }
};

const Book = () => {
  const { keyword } = useParams();
  const book = bookDetails[keyword];

  if (!book) {
    return <h2>Book not found</h2>;
  }

  return (
    <div>
      <h2>{keyword}</h2>
      <p><strong>제목:</strong> {book.author}</p>
      <p><strong>작가:</strong> {book.publisher}</p>
      <p><strong>출판일:</strong> {book.publishDate}</p>
      <p><strong>가격:</strong> {book.price}</p>
    </div>
  );
};

export default Book;
