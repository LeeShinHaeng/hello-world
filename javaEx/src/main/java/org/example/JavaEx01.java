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

        if (number < 10) {
            System.out.println(number + " 은 한자리 ");
        } else if (number < 100) {
            System.out.println(number + " 은 두자리 ");
        } else if (number < 1000) {
            System.out.println(number + " 은 세자리 ");
        }

        switch (number) {
            case 1:
                System.out.println("일");
                break;
            case 2:
                System.out.println("이");
                System.out.println("둘");
                break;
            default:
                System.out.println("아무것도 아님");
                break;
        }
    }
}