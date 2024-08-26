package org.example.ex02;

public class Product {
    private String num;
    private String name;
    private int price;
    private String maker;
    private String date;
    private int stock;

    public Product(String num, String name, int price, String maker, String date, int stock) {
        this.num = num;
        this.name = name;
        this.price = price;
        this.maker = maker;
        this.date = date;
        this.stock = stock;
    }

    public String getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getMaker() {
        return maker;
    }

    public String getDate() {
        return date;
    }

    public int getStock() {
        return stock;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "상품번호='" + num + '\'' +
                ", 상품명='" + name + '\'' +
                ", 가격=" + price +
                ", 제조회사='" + maker + '\'' +
                ", 제조일='" + date + '\'' +
                ", 재고=" + stock +
                '}';
    }
}
