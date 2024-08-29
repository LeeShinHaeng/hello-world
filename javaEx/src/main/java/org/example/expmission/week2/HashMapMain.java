package org.example.expmission.week2;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
    private static Map<String, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        addData("홍길동", 10);
        addData("이신행", 9);
        addData("김구름", 8);
        findAll();
        findScoreByName("김구름");
        deleteData("홍길동");
        findAll();
        deleteAll();
        findAll();
    }

    private static void addData(String name, int score){
        map.put(name, score);
    }

    private static void findAll(){
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void findScoreByName(String name){
        System.out.println(map.get(name));
    }

    private static void deleteData(String name){
        map.remove(name);
    }

    private static void deleteAll(){
        map.clear();
    }
}
