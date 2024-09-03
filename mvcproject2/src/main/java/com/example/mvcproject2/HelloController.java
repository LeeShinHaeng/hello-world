package com.example.mvcproject2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class HelloController {
    // http://localhost:8080/hello
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    // http://localhost:8080/requestMapping
    @RequestMapping(value = "/requestMapping", method = RequestMethod.GET)
    public String requestMapping(Model model) {
        model.addAttribute("textFromController", "World!!");
        model.addAttribute("textFromController2", "abcd");
        return "requestHello";
    }

    // http://localhost:8080/requestParamTest?a=1&b=hey&c=false
    @RequestMapping("/requestParamTest")
    public String requestParamTest(
            @RequestParam(name = "a", required = false, defaultValue = "0") int a,
            @RequestParam("b") String b,
            @RequestParam(name = "c", defaultValue = "true") boolean c) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        return "hello";
    }

    // http://localhost:8080/requestParamMapTest?param1=hello&param2=world&who=snhng
    @RequestMapping("/requestParamMapTest")
    public String requestParamMapTest(
            @RequestParam Map<String, String> map){
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        return "hello";
    }

    // http://localhost:8080/pathVariableTest
    // http://localhost:8080/pathVariableTest/hello/woooorld/2024
    @RequestMapping("/pathVariableTest/{a}/{b}/{c}")
    public String pathVariableTest(
            @PathVariable String a,
            @PathVariable(value = "b") String b,
            @PathVariable int c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        return "hello";
    }
}
