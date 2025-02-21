//Create a Helloworld Spring App
//to display “Hello from
//BridgeLabz” using STS - To learn any new Language or any New
//Framework start with Helloworld
//- This will ensure all the necessary components are
//involved
//- A quick way to jumpstart ones learning
package com.spring.appdevelopment.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from BridgeLabz";
    }
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

    @PutMapping("/hello")
    public String putHello(){
        return "Hello from BridgeLabz";
    }


}
