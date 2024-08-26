package org.example.expmission.week2;

public class ShapesMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 5);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3, 5);

        System.out.println("사각형의 넓이: " + rectangle.getArea());
        System.out.println("원의 넓이: " + circle.getArea());
        System.out.println("삼각형의 넓이: " + triangle.getArea());
    }

    private static class Rectangle {
        int width;
        int height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getArea(){
            return width * height;
        }
    }

    private static class Circle {
        int radius;

        public Circle(int radius) {
            this.radius = radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        public double getArea(){
            return Math.PI * radius * radius;
        }
    }

    private static class Triangle {
        int width;
        int height;

        public Triangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public void setWidth(int width) {
            this.width = width;
        }
        public void setHeight(int height) {
            this.height = height;
        }

        public double getArea(){
            return (double) (width * height) / 2;
        }
    }

}
