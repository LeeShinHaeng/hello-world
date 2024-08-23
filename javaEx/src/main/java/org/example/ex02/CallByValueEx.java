package org.example.ex02;

public class CallByValueEx {
    public static void main(String[] args) {
        int originalValue = 5;
        System.out.println("Before Call: " + originalValue);
        modifyValue(originalValue);
        System.out.println("After Call: " + originalValue);
    }

    public static void modifyValue(int value) {
        value = 10;
        System.out.println("Inside Method: " + value);
    }
}
