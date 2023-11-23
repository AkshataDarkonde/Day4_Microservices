package com.Basic.microservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    @GetMapping("/hello-world")  //http GET Request.
    public String helloWorld(){
        return "Hello World";
    }
}
