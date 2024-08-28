package org.example.expmission.week2;

import java.util.Scanner;
import java.util.function.BiFunction;

public class CalculatorLambda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("사칙연산 계산기 (형식 : 1 + 2)");
        System.out.print("계산을 입력하세요 : ");
        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[2]);
        char operator = input[1].charAt(0);

        BiFunction<Integer, Integer, Double> operation = switch (operator) {
            case '+' -> (x, y) -> (double) (x + y);
            case '-' -> (x, y) -> (double) (x - y);
            case '*' -> (x, y) -> (double) (x * y);
            case '/' -> (x, y) -> (double) (x / y);
            default -> throw new IllegalStateException("지원하지 않는 연산자: " + operator);
        };
        System.out.println(operation.apply(a, b));

        sc.close();
    }

}
