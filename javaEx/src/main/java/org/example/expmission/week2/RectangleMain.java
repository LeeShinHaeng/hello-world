package org.example.expmission.week2;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 5);
        System.out.println("넓이: " + rectangle.getArea());
        System.out.println("둘레: " + rectangle.getPerimeter());
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

        public int getPerimeter() {
            return 2 * (width + height);
        }
    }
}
