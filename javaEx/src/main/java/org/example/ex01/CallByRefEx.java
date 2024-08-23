package org.example.ex01;

public class CallByRefEx {
    public static void main(String[] args) {
        int[] originalValue = {1, 2, 3};
        System.out.println("Before Call: " + originalValue[0]);
        modifyValue(originalValue);
        System.out.println("After Call: " + originalValue[0]);
    }

    public static void modifyValue(int[] value) {
        value[0] = 10;
        System.out.println("Inside Method: " + value[0]);
    }
}
