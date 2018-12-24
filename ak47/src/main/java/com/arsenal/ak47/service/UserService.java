package com.arsenal.ak47.service;

import com.arsenal.ak47.mapper.UserMapper;
import com.arsenal.ak47.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(Integer id){
        User user = new User();
        user.setId(id);
        return userMapper.selectByPrimaryKey(user);
    }
}
