package org.example.ex02;

public class ProductJava {
    public static void main(String[] args) {
        Product p = new Product("1001",
                "노트북",
                1_000_000,
                "삼성",
                "2024-08-26",
                10
        );
        System.out.println(p);
    }
}
