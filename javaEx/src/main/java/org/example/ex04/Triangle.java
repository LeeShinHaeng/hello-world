package org.example.ex04;

public class Triangle extends DrawingObject {
    public Triangle() {
        penColor = "pink";
    }

    @Override
    public void draw() {
        System.out.println(penColor + " Triangle");
    }
}
