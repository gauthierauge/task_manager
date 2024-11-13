package com.example.task_manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/admin/home")
    public String adminHome() {
        return "admin-home";
    }

    @GetMapping("/user/home")
    public String userHome() {
        return "user-home";
    }
}