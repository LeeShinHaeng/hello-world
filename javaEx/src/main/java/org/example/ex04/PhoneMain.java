package org.example.ex04;

public class PhoneMain {
    public static void main(String[] args) {
        ISmartPhone isp1 = new Samsung();
        isp1.sendCall();

        ISmartPhone isp2 = new Apple();
        isp2.sendCall();
    }
}
