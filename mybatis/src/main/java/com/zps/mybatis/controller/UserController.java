package com.zps.mybatis.controller;

import com.zps.mybatis.model.User;
import com.zps.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zps on 2020/12/5 14:19
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping(value = "/queryMany/{username}")
    public List<User> getUserList(@PathVariable("username") String username) {
        return userService.findMany(username);
    }


    @GetMapping(value = "/queryOne/{username}")
    public User getUser(@PathVariable("username") String username) {
        return userService.findOne(username);
    }
}
