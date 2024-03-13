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
    @GetMapping("/organisationerforside")
    public String OrganisationerForside() {return "OrganisationerForside";}
    @GetMapping("/SSL")
    public String ssl() {return "SSL";}
    @GetMapping("/TGTG")
    public String tgtg() {return "TGTG";}
    @GetMapping("/MNSTRT")
    public String mnstrt() {return "ministeriet";}
    @GetMapping("/LNDBRG")
    public String lndbrg() {return "landbrug";}
    @GetMapping("/header")
    public String header(){
        return "header";
    }
}
