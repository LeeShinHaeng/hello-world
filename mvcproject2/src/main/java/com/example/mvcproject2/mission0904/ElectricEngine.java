package com.example.mvcproject2.mission0904;

import org.springframework.stereotype.Component;

@Component(value = "electricEngine")
public class ElectricEngine implements Engine {
    @Override
    public String start() {
        System.out.println("Electric Engine is starting...");
        return "Electric Engine is starting...";
    }
}
