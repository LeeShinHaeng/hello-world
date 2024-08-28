package org.example.expmission.week2;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            if(chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] += 32;
            } else if(chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] -= 32;
            }
            sb.append(chars[i]);
        }
        System.out.println(sb);
        sc.close();
    }
}
