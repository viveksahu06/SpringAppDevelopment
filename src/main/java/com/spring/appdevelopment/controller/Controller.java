//Create a Helloworld Spring App
//to display “Hello from
//BridgeLabz” using STS - To learn any new Language or any New
//Framework start with Helloworld
//- This will ensure all the necessary components are
//involved
//- A quick way to jumpstart ones learning
package com.spring.appdevelopment.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class Controller {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(Controller.class);
    @GetMapping("/hello")
    public String sayHello(){
        logger.info("Hello endpoint was called");
        return "Hello from BridgeLabz";
    }
    @GetMapping("/")
    public String homePage() {
        logger.info("/ endpoint was called");
        return "index";  // Loads index.html from src/main/resources/templates
    }

    // REST API to return simple hello
    @GetMapping("/web")
    @ResponseBody
    public String hello() {
        logger.info("Web endpoint was called");
        return "Hello, welcome to Spring Boot!";
    }

    @PutMapping("/hello")
    public String putHello(){

        return "Hello from BridgeLabz";
    }


}
