package com.example.day02;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class MaxIndexEx {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 1, 3, 2, 5, 6, 6, 1};
        int[] arr2 = {9, 2, 3, 1, 0, 2, 9, 9};
        int[] arr3 = {0, 2, 4, 2, 4, 0};

        System.out.println("---1---");
        System.out.println(Arrays.toString(solution1(arr1)));
        System.out.println(Arrays.toString(solution1(arr2)));
        System.out.println(Arrays.toString(solution1(arr3)));
        System.out.println("---2---");
        System.out.println(Arrays.toString(solution2(arr1)));
        System.out.println(Arrays.toString(solution2(arr2)));
        System.out.println(Arrays.toString(solution2(arr3)));
        System.out.println("---3---");
        System.out.println(Arrays.toString(solution3(arr1)));
        System.out.println(Arrays.toString(solution3(arr2)));
        System.out.println(Arrays.toString(solution3(arr3)));
        System.out.println("---4---");
        System.out.println(Arrays.toString(solution4(arr1)));
        System.out.println(Arrays.toString(solution4(arr2)));
        System.out.println(Arrays.toString(solution4(arr3)));
    }

    // 배열을 사용
    public static int[] solution1(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int a : arr) {
            max = Math.max(max, a);
        }

        int count = 0;
        for (int a : arr) {
            if (a == max) {
                count++;
            }
        }

        int[] ans = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                ans[index++] = i;
            }
        }

        return ans;
    }

    // 리스트를 사용
    public static int[] solution2(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int a : arr) {
            max = Math.max(max, a);
        }

        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                list.add(i);
            }
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }

    // 리스트 + 스트림 사용
    public static int[] solution3(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();

        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                list.add(i);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    // IntStream 사용
    public static int[] solution4(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();

        return IntStream
                .range(0, arr.length)
                .filter(i -> arr[i] == max)
                .toArray();
    }
}
