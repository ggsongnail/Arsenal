package com.arsenal.ak47.controller;

import com.arsenal.ak47.pojo.User;
import com.arsenal.ak47.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/detail/{id}")
    public User getUserInfo(@PathVariable Integer id){
        return userService.getUserById(id);
    }
}
