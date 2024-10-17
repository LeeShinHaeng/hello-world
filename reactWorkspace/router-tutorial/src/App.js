import { Link, Route, Routes } from "react-router-dom";
import React from "react";
import Home from "./components/Home";
import About from "./components/About";
import Product from "./components/Product";
import Product2 from "./components/Product2";
import Product3 from "./components/Product3";
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
        <Route path="/product2/:productId" element={<Product2 />} />
        <Route path="/product3/:productId" element={<Product3 />} />
        <Route path="/*" element={<PageNotFound />} />
      </Routes>
    </div>
  );
};

export default App;
