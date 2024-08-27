package org.example.ex04;

public class SmartTV implements RemoteControl, Searchable {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("SmartTV.turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartTV.turnOff");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }

        System.out.println("현재 볼륨: " + this.volume);
    }

    @Override
    public void search(String url) {
        System.out.println(url + " 검색");
    }
}
