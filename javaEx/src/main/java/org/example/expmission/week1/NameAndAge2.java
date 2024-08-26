package org.example.expmission.week1;

import java.util.Scanner;

public class NameAndAge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력: ");
        String name = sc.nextLine();

        System.out.print("나이 입력: ");
        int age = sc.nextInt();

        System.out.println(name + " : " + age + "세");
    }
}
