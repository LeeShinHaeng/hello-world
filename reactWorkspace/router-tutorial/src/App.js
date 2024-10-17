import { Link, Route, Routes } from "react-router-dom";
import React from "react";
import Home from "./components/Home";
import About from "./components/About";
import Product from "./components/Product";
import PageNotFound from "./components/PageNotFound"

const App = () => {
  return (
    <div>
      <nav>
        <Link to="/">Home</Link>  <Link to="/about">About</Link>
      </nav>

      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/about" element={<About />} />
        <Route path="/info" element={<About />} />
        <Route path="/product/:productId" element={<Product />} />
        <Route path="/*" element={<PageNotFound />} />
      </Routes>
    </div>
  );
};

export default App;
