package org.example.expmission.week1;

import java.util.Scanner;

public class PlusMinusMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("합: " + plus(a, b));
        System.out.println("차: " + minus(a, b));
    }

    private static int plus(int a, int b) {
        return a + b;
    }

    private static int minus(int a, int b) {
        return a - b;
    }
}
