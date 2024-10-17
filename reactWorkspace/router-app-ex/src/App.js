import { BrowserRouter, Link, Route, Routes } from "react-router-dom";
import React from "react";
import Home from "./components/Home";
import Content from "./components/Content";
import Book from "./components/Book";

const App = () => {
  return (
    <BrowserRouter>
      <div>
        <nav>
          <Link to="/">Home</Link> <Link to="/content">Content</Link>
        </nav>

        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/content" element={<Content />} />
          <Route path="/book/:keyword" element={<Book />} />
        </Routes>
      </div>
    </BrowserRouter>
  );
};

export default App;
