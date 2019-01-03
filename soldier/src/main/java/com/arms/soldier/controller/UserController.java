package com.arms.soldier.controller;

import com.arms.soldier.pojo.User;
import com.arms.soldier.service.UserService;
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

    @GetMapping("/info/{id}")
    public User getUserInfo(@PathVariable Integer id){
        return userService.getUserById(id);
    }

}
