package com.arms.soldiereureka.controller;

import com.arms.soldier.pojo.User;
import com.arms.soldiereureka.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/info/{id}")
    public User getUserInfo(@PathVariable Integer id){
        return userService.getUserById(id);
    }
}
