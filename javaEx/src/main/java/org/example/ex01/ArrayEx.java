package org.example.ex01;

public class ArrayEx {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        System.out.println("배열의 길이: " + numbers.length);

        System.out.println("배열의 첫번째 요소: "+numbers[0]);
        System.out.println("배열의 두번째 요소: "+numbers[1]);
        System.out.println("배열의 마지막 요소: "+numbers[numbers.length-1]);

        numbers[0] = 1;
        System.out.println("변경 후 첫 번째 요소: " + numbers[0]);

        // for 문으로 순회
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // for-each 문으로 순회
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        String[] names = new String[5];
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";
        names[3] = "David";
        names[4] = "Elijah";

        System.out.println("String 배열의 요소: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}
