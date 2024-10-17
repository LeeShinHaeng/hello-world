import React from 'react';
import { Link } from 'react-router-dom';

const books = [
  { title: "Book1"},
  { title: "Book2"}
];

const Content = () => {
  return (
    <div>
      <h2>Book List</h2>
      <table border="1">
        <thead>
          <tr>
            <th>Title</th>
          </tr>
        </thead>
        <tbody>
          {books.map((book, index) => (
            <tr key={index}>
              <td><Link to={`/book/${book.title}`}>{book.title}</Link></td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default Content;
