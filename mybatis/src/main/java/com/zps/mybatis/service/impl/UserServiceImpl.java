package com.zps.mybatis.service.impl;

import com.zps.mybatis.dao.UserMapper;
import com.zps.mybatis.model.User;
import com.zps.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zps on 2020/12/5 14:21
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;


    @Override
    public User findOne(String username) {
        return userMapper.selectOneByName(username);
    }

    @Override
    public List<User> findMany(String username) {
        return userMapper.selectManyByName(username);
    }
}
