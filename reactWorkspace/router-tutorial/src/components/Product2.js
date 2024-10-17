import React from 'react';
import { useLocation, useParams, useSearchParams } from 'react-router-dom';

const Product2 = () => {
    const { productId } = useParams();
    const [searchParams, setSearchParams] = useSearchParams();
    const keyWords = searchParams;
    const keyWord = searchParams.get("search");

    // http://localhost:3000/product2/1?search=productName&q=demo#test

    return (
        <div>
            <h2>{productId}번 상품 페이지 입니다.</h2>
            <ul>
                <li>keyWords: {keyWords}</li>
                <li>keyWord: {keyWord}</li>
            </ul>
        </div>
    );
};

export default Product2;