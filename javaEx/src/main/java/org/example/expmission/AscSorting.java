package org.example.expmission;

import java.util.Arrays;
import java.util.Scanner;

public class AscSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.print("정수 5개를 입력: ");
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
