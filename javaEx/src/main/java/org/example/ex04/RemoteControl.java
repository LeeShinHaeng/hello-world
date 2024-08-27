package org.example.ex04;

public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 설정");
        } else {
            System.out.println("무음 해제");
        }
    }

    static void changeBattery(){
        System.out.println("건전지 교환");
    }
}
