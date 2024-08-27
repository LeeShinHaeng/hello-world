package org.example.ex04;

public class Apple implements ISmartPhone{
    private String name;

    public Apple() {
        name = "Apple";
    }

    @Override
    public void sendCall() {
        System.out.println(name + "으로 전화 걸기");
    }

    @Override
    public void receiveCall() {
        System.out.println(name + "으로 전화 받기");
    }

    @Override
    public void sendSMS() {

    }

    @Override
    public void receiveSMS() {

    }
}
