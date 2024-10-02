package com.example.day01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx {
    static final int NUM_OF_ELEMENTS = 100_000;

    public static void main(String[] args) {
        System.out.println("ArrayList vs LinkedList 시간 비교");

        List<Integer> arrList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList();

        System.out.println("요소 추가");
        long start = System.currentTimeMillis();
        for (int i = 0; i < NUM_OF_ELEMENTS; i++) {
            arrList.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList: " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < NUM_OF_ELEMENTS; i++) {
            linkedList.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList: " + (end - start));


        System.out.println("\n요소 검색");
        start = System.currentTimeMillis();
        for (int i = 0; i < NUM_OF_ELEMENTS; i++) {
            arrList.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList: " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < NUM_OF_ELEMENTS; i++) {
            linkedList.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList: " + (end - start) + "ms");


        System.out.println("\n요소 삭제");
        start = System.currentTimeMillis();
        for (int i = NUM_OF_ELEMENTS - 1; i >= 0; i--) {
            arrList.remove(i);
        }
        end = System.currentTimeMillis();
        System.out.println("ArrayList: " + (end - start) + "ms");

        start = System.currentTimeMillis();
        for (int i = NUM_OF_ELEMENTS - 1; i >= 0; i--) {
            linkedList.remove(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList: " + (end - start) + "ms");


    }
}
