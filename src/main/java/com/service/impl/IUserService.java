package com.service.impl;

import com.dao.UserDao;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="userService")
public class IUserService implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public boolean login(String name, String pwd) {
        System.out.println(userDao.toString());
        return userDao.login(name, pwd);
    }
    public String toString() {
        return "IUserService";
    }
}
