package org.example.ex04;

public class Rect extends DrawingObject{
    public Rect() {
        penColor = "green";
    }

    @Override
    public void draw() {
        System.out.println(penColor + " Rectangle");
    }
}
