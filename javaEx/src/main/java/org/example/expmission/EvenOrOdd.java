package org.example.expmission;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나를 입력: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + "은 짝수");
        } else {
            System.out.println(number + "은 홀수");
        }
    }
}
