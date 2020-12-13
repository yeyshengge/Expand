package com.zps.mybatis.service;

import com.zps.mybatis.model.User;

import java.util.List;

/**
 * Created by zps on 2020/12/5 14:21
 */
public interface UserService {
    User findOne(String username);


    List<User> findMany(String username);
}
