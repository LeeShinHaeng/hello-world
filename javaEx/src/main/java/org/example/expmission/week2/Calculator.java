package org.example.expmission.week2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("사칙연산 계산기 (형식 : 1 + 2)");
        int a, b;
        char operator = 0;

        while (true) {
            System.out.print("계산을 입력하세요 : ");
            String input = sc.nextLine();

            String[] s = input.split(" ");
            try {
                a = Integer.parseInt(s[0]);
                operator = s[1].charAt(0);
                b = Integer.parseInt(s[2]);
            } catch (Exception e) {
                System.out.println("형식에 맞지 않는 입력");
                continue;
            }

            double result = 0;
            switch (operator) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if(b == 0){
                        System.out.println("0으로 나뉨");
                        continue;
                    }
                    result = (double) a / b;
                    break;
                default:
                    System.out.println("연산자가 아님");
                    continue;
            }

            System.out.println("답: " + result);
            return;
        }
    }
}
