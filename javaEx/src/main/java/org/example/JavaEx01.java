package org.example;

import java.util.Scanner;

public class JavaEx01 {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        System.out.print("Enter your name: ");

        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//
//        System.out.println("Welcome, " + name + "!");

        int age = 24;
        long population = 50_000_000_000L;

        float weight = 70.5f;
        double height = 170.2;

        char ch = '3';

        boolean isStudent = true;

        System.out.println("Age : " + age);

        System.out.print("Enter Number : ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }
}