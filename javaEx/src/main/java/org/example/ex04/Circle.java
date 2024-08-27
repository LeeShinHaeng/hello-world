package org.example.ex04;

public class Circle extends DrawingObject{
    public Circle() {
        penColor = "blue";
    }

    @Override
    public void draw() {
        System.out.println(penColor + " Circle");
    }
}
