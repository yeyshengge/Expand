package com.zps.exection.entity;

/**
 * Created by zps on 2020/3/4 21:51
 */
public class User {
    private Integer id;

    public User(Integer id) {
        this.id = id;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
