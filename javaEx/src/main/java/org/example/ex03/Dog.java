package org.example.ex03;

public class Dog extends Animal {
    @Override
    public void show() {
        System.out.println("강아지");
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    public void dogMethod() {
        System.out.println("Dog.dogMethod 입니다");
    }
}
