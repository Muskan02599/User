package com.example.User.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class DemoController {
    @GetMapping("/name")
    public  String getName(){
        return "JAVA";
    }
    @GetMapping("/address")
    public  String getAddress(){
        return "Insia";
    }
    @GetMapping("/status")
    public  String getStatus(){
        return "active";
    }
}
