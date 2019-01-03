package com.arms.soldier.service;

import com.arms.soldier.dao.UserDao;
import com.arms.soldier.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User getUserById(Integer id){
        return userDao.getUserById(id);
    }
}
