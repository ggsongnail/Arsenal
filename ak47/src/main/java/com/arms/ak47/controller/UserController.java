package com.arms.ak47.controller;

import com.arms.ak47.pojo.User;
import com.arms.ak47.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/detail/{id}")
    public String getUserInfo(@PathVariable Integer id, Model model){
        User user = userService.getUserById(id);
        model.addAttribute("user",user);
        return "user";
    }

    @GetMapping("/json/{id}")
    public @ResponseBody User getUserJson(@PathVariable Integer id){
        return userService.getUserById(id);
    }
}
