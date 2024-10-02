package com.example.day01;

import java.util.*;

public class RankTransform {
    public static void main(String[] args) {
        int[][] arrs = {
                {40, 10, 20, 30},
                {100, 100, 100},
                {37, 12, 28, 9, 100, 56, 80, 5, 12}
        };
        for (int[] arr : arrs) {
            arrayRankTransform(arr);
        }
    }

    public static void arrayRankTransform(int[] arr){
        int[] clone = arr.clone();
        Arrays.sort(clone);

        int rank = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : clone) {
            if(map.get(i) == null){
                map.put(i, rank++);
            }
        }

        List<Integer> result = new LinkedList<>();
        for (int i : arr) {
            result.add(map.get(i));
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Integer integer : result) {
            sb.append(integer).append(", ");
        }
        sb.delete(sb.length()-2, sb.length()).append("]");
        System.out.println(sb);
    }
}
