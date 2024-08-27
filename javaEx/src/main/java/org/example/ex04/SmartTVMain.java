package org.example.ex04;

public class SmartTVMain {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTV();
        rc.turnOn();
        rc.setVolume(10);
        rc.turnOff();

        Searchable search = new SmartTV();
        search.search("127.0.0.1");
    }
}
