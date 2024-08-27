package org.example.expmission.week2;


public class ShapeMainTuesday {
    public static void main(String[] args) {
        AbstractShape circle = new Circle(5);
        circle.showArea();

        AbstractShape rectangle = new Rect(4, 5);
        rectangle.showArea();

        AbstractShape triangle = new Triangle(4, 5);
        triangle.showArea();
    }
}
