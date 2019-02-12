package com.arms.soldiereureka.service;

import com.arms.soldier.pojo.User;
import com.arms.soldiereureka.SoldierEurekaApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SoldierEurekaApplication.class)
public class UserServiceTest {

    @Autowired
    public UserService userService;

    @Test
    public void getUserById() {
        userService.getUserById(1);
    }
}