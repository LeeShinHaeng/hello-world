package org.example.ex01;

import java.util.Arrays;

public class kthMin {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 6, 4};
        int k = 3;

        System.out.println("정답: " + findKthMin(arr, k));
    }

    private static int findKthMin(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }
}
