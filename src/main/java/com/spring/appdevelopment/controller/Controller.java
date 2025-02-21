//Create a Helloworld Spring App
//to display “Hello from
//BridgeLabz” using STS - To learn any new Language or any New
//Framework start with Helloworld
//- This will ensure all the necessary components are
//involved
//- A quick way to jumpstart ones learning
package com.spring.appdevelopment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from BridgeLabz";
    }
}
