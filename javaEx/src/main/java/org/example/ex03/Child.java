package org.example.ex03;

public class Child extends Parent {
    private int c;

    public void setC(int c) {
        this.c = c;
    }

    public void showC(){
        super.showP();
        System.out.println("자식 클래스 c : " + c);
    }
}
