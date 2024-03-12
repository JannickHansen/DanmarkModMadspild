package com.example.madspildwebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
    @GetMapping("/")
    public String forside(){
        return "forside";
    }
    @GetMapping("/forbruger")
    public String forbruger(){
        return "forbruger";
    }
    @GetMapping("/header")
    public String header(){
        return "header";
    }
}
