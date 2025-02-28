package com.br.bussticket.busticket.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NoAuthenticationController {
    @GetMapping("/home")
    public String homePage() {
        return "home";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
   
    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

}
