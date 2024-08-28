package org.example.expmission.week2;

public class PrintByMultiThread {
    public static void main(String[] args) {
        Thread thread0 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        });

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                char c = (char) ('A' + i);
                System.out.println(Thread.currentThread().getName() + ": " + c);
            }
        });

        thread0.start();
        thread1.start();
    }
}
