package org.example.ex02;

public class StudentMain {
    public static void main(String[] args) {
        Student std = new Student("2024001", "홍길동", 1);
        System.out.println(std);
        std.show();

        System.out.println(std.getStdName());
        std.setStdYear(2);
        System.out.println(std);
    }
}
