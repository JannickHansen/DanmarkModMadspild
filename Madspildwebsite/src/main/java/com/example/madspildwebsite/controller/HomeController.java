package com.example.madspildwebsite.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping("/")
    public String forside(){
        return "forside";
    }
}
