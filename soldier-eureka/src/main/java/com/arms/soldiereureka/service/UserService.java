package com.arms.soldiereureka.service;

import com.arms.soldier.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;

    public User getUserById(Integer id){
        List<ServiceInstance> instanceInfoList = discoveryClient.getInstances("ak47");
        System.out.println(instanceInfoList.get(0).getHost());
        //String userUrl = "http://"+instanceInfoList.get(0).getHost()+":"+instanceInfoList.get(0).getPort()+"/user/json/"+id;
        String userUrl = "http://ak47/user/json/"+id;
        User user = restTemplate.getForObject(userUrl,User.class);
        return user;
    }
}
