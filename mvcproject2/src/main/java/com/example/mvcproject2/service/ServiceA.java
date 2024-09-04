package com.example.mvcproject2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceA {
    @Autowired
    private ServiceB serviceB;

    public void methodA(){
        System.out.println("ServiceA.methodA");
        serviceB.methodB();
    }
}
