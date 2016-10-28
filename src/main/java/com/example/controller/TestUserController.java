package com.example.controller;

import com.example.dao.UserDao;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Pinggang Yu on 2016/10/28.
 */

@RestController
public class TestUserController {
    @Autowired
    UserDao userDao;

    @RequestMapping("/user")
    public User getOneUser() {
        return userDao.getUserById(2);
    }

    @RequestMapping("/users")
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
