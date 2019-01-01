package com.zte.springbootdemo1.controller;

import com.zte.springbootdemo1.pojo.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/springboot")
public class UserController {

    @GetMapping("/user")
    public User getUser(){
        User user = new User();
        user.setUsername("张桓");
        return user;
    }

}
