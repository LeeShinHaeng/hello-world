package org.example.ex05;

public class MyPrintMain {
    public static void main(String[] args) {
        // 객체 사용
        Runnable my = new MyRunnable();
        Thread thread = new Thread(my);
        thread.start();

        // 익명 구현 객체 사용
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Runnable is running " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread2.start();

        // 람다 사용
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Runnable is running " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread3.start();
    }
}
