package org.example.expmission.week1;

public class AvgAndChangeArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        int index = 2;
        int value = 20;

        System.out.println("평균: " + findAvg(arr));

        changeArrayValue(arr, index, value);
        System.out.print("바뀐 배열 값: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static double findAvg(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return (double) sum / array.length;
    }

    private static void changeArrayValue(int[] array, int index, int value) {
        array[index] = value;
    }
}
