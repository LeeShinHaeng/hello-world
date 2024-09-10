package com.example.h2rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestExController {

    // http://localhost:8080/swagger-ui/index.html
    @GetMapping("/test")
    public String test() {
        return "{}";
    }

    @GetMapping("/test2")
    public String test2() {
        return "test2";
    }

}
