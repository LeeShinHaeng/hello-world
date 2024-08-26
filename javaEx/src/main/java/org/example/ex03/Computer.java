package org.example.ex03;

public class Computer extends Calculator {
    @Override
    public double areaCircle(double radius) {
        System.out.println("Computer.areaCircle");
        return Math.PI * radius * radius;
    }
}
