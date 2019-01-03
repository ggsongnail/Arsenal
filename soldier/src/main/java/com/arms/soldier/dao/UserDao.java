package com.arms.soldier.dao;

import com.arms.soldier.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.Inet4Address;

@Component
public class UserDao {
    @Autowired
    private RestTemplate restTemplate;

    public User getUserById(Integer id){
        User user = restTemplate.getForObject("http://localhost:8080/user/json/"+id,User.class);
        return user;
    }
}
