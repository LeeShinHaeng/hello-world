package org.example.ex05;

public class MultiThread extends Thread {
    private int id;

    public MultiThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread("+ id + "): " + i);
        }
    }
}
