package org.example.ex03;

public class ParentChildMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.setC(20);
        child.setP(10);

        child.showP();
        System.out.println("--");
        child.showC();
    }
}
