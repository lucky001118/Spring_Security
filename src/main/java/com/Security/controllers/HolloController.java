package com.Security.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolloController {
    @GetMapping("/home")
    public String greet(HttpServletRequest request){
        return "This is lucky "+request.getSession().getId();
    }
}
