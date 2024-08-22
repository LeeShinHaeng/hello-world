package org.example.ex01;

import java.util.Scanner;

public class JavaEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // for 문
        System.out.print("곱셈표 출력할 숫자를 입력: ");
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }

        // for-each 문
        System.out.print("배열의 크기를 입력: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print(n + "개의 정수 입력(공백으로 구분): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("배열의 요소: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        // while 문
        System.out.print("\n합을 계산할 숫자를 입력: ");
        int limit = sc.nextInt();
        int sum = 0;
        int count = 1;
        while (count <= limit) {
            sum += count;
            count++;
        }
        System.out.println("1부터 " + limit + "까지의 합: " + sum);

        // do-while 문
        System.out.println("숫자를 맞추는 게임!! (1~10)");
        int answer = 1;
        int guess;
        do {
            System.out.print("입력: ");
            guess = sc.nextInt();
        } while (guess != answer);
        System.out.println("정답!!");
    }
}
