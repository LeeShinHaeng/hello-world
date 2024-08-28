package org.example.ex05;

public class MultiThreadMain {
    public static void main(String[] args) {
        MultiThread t1 = new MultiThread(1);
        MultiThread t2 = new MultiThread(2);
        MultiThread t3 = new MultiThread(3);

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);
        
        t1.start();
        t2.start();
        t3.start();
    }
}
