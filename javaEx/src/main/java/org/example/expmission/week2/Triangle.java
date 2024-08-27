package org.example.expmission.week2;

public class Triangle extends AbstractShape {
    private int width;
    private int height;

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void showArea() {
        System.out.println("삼각형의 넓이: "
                + (double) (width * height)
                / 2);
    }
}
