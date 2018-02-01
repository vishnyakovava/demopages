package com.example.demopages.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(){
        return "index.html";
    }

    @GetMapping("/signUp")
    public String signUp(){
        return "signup.html";
    }

    @GetMapping("/signIn")
    public String signIn(){
        return "signin.html";
    }
}
