package com.example.mvcproject2.mission0904;

import org.springframework.stereotype.Component;

@Component(value = "v6Engine")
public class V6Engine implements Engine {
    @Override
    public String start() {
        System.out.println("V6 Engine is starting...");
        return "V6 Engine is starting...";
    }
}
