package com.example.mvcproject2.controller;

import com.example.mvcproject2.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    // http://localhost:8080/user/signup
    @GetMapping("/signup")
    public String signup(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "signup";
    }

    // http://localhost:8080/user/signup
    @PostMapping("/signup")
    @ResponseBody
    public String signup(@ModelAttribute User user) {
        System.out.println(user);
        return "success";
    }
}
