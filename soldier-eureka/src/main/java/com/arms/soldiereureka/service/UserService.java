package com.arms.soldiereureka.service;

import com.arms.soldier.pojo.User;
import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private DiscoveryClient discoveryClient;

    public User getUserById(Integer id){

        return null;
    }
}
