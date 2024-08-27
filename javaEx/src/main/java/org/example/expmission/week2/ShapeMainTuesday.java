package org.example.expmission.week2;


public class ShapeMainTuesday {
    public static void main(String[] args) {
        IShape circle = new Circle(3);
        circle.showArea();

        IShape rectangle = new Rect(4, 5);
        rectangle.showArea();

        IShape triangle = new Triangle(4, 5);
        triangle.showArea();
    }
}
