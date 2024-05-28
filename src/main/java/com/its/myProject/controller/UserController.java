package com.its.myProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/hello")
    public String hello(@RequestParam (value = "world", defaultValue = "none") String name){
         return "Hello " + name;
    }
}
