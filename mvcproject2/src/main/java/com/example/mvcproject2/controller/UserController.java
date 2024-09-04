package com.example.mvcproject2.controller;

import com.example.mvcproject2.domain.Login;
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

    @PostMapping("/signup")
    @ResponseBody
    public String signup(@ModelAttribute User user) {
        System.out.println(user);
        return "success";
    }

//    @PostMapping("/signup")
//    public String signup(@ModelAttribute User user) {
//        System.out.println(user);
//        return "redirect:/";
//    }

    // http://localhost:8080/user/login
    @GetMapping("/login")
    public String login(Model model) {
        Login login = new Login();
        model.addAttribute("login", login);
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute Login login,
                        Model model) {
        User user = new User();
        if (login.getName().equals(user.getName()) && login.getPassword().equals(user.getPassword())) {
            model.addAttribute("id", user.getName());
            return "loginSuccess";
        }

        return "redirect:/user/login";
    }
}
