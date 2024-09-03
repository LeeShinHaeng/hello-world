package com.example.mvcproject2.controller;

import com.example.mvcproject2.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String signup(@ModelAttribute User user) {
        System.out.println(user);
        return "redirect:/";
    }
}
