package com.arsenal.ak47.controller;

import com.arsenal.ak47.pojo.User;
import com.arsenal.ak47.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
