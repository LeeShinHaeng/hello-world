package com.example.mvcproject2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    // http://localhost:8080/hello
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
