package com.spring.appdevelopment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWebController {

    // Serve HTML Page
    @GetMapping("/")
    public String homePage() {
        return "index";  // Loads index.html from src/main/resources/templates
    }

    // REST API to return simple hello
    @GetMapping("/web")
    @ResponseBody
    public String hello() {
        return "Hello, welcome to Spring Boot!";
    }

    // REST API to return message from BridgeLabz
    @GetMapping("/web/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello from BridgeLabz!";
    }
}
