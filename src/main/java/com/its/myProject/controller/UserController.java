package com.its.myProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @GetMapping("/hello")
    public String hello(@RequestParam (value="world", required = false) String name){
         return "Hello " + name;
    }

    @GetMapping("/bye/{placeholder}")
    public String bye(@PathVariable("placeholder") String something){
        return "Bye " + something;
    }
}
