package com.example.mvcproject2.controller;

import com.example.mvcproject2.service.LoggedUserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    private final LoggedUserManagementService loggedUserManagementService;

    @Autowired
    public MainController(LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }

    @GetMapping("/main")
    public String mainPage(
            @RequestParam(required = false) String logout,
            Model model) {
        if(logout != null) {
            loggedUserManagementService.setUserName(null);
            return "redirect:/user/login2";
        }

        String userName = loggedUserManagementService.getUserName();
        if(userName == null) {
            return "redirect:/user/login2";
        }

        model.addAttribute("userName", userName);
        return "main";
    }
}
