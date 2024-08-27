package org.example.ex04;

public class Line extends DrawingObject{
    public Line(){
        penColor = "red";
    }

    @Override
    public void draw() {
        System.out.println(penColor + " Line" );
    }
}
