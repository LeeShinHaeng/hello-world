package org.example.ex06;

public class BoxMain {
    public static void main(String[] args) {
        Box box = new Box();

        box.setObject("홍길동");
        String name = (String) box.getObject();
        System.out.println(name);

        box.setObject(new Apple());
        Apple apple = (Apple) box.getObject();
        System.out.println(apple);

        GBox<String> gBox = new GBox<>();
        gBox.setT("홍길동");
        name = gBox.getT();
        System.out.println(name);

        GBox<Apple> gBox2 = new GBox<>();
        gBox2.setT(new Apple());
        Apple apple3 = gBox2.getT();
        System.out.println(apple3);
    }
}
