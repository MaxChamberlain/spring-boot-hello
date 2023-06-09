package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/login")
    public String login() {
        return "<h1>Login Page</h1>";
    }



}