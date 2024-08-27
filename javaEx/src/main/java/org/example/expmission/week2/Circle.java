package org.example.expmission.week2;

public class Circle extends AbstractShape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void showArea() {
        System.out.println("원의 넓이: "
                + Math.PI
                * radius * radius);
    }
}
