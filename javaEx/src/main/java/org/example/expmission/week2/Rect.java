package org.example.expmission.week2;

public class Rect implements IShape {
    private int width;
    private int height;

    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void showArea() {
        System.out.println("사각형의 넓이: " + width * height);
    }
}
