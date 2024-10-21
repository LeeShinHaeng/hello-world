package com.example.day04;

public class RecursionEx {
    public static void main(String[] args) {
        String str = "Hello World";
        printCharReverse(str);
        System.out.println();
        printCharReverseRecursion(str, str.length()-1);
    }

    public static void printCharReverse(String s) {
        for (int i = s.length()-1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }

    public static void printCharReverseRecursion(String s, int index) {
        System.out.print(s.charAt(index));
        if(index == 0)
            return;
        printCharReverseRecursion(s, index-1);
    }
}
