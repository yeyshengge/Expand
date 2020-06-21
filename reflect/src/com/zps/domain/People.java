package com.zps.domain;

import java.util.Objects;

/**
 * Created by zps on 2020/3/21 10:52
 */
public class People {

    public String username;

    private Integer age;

    public People(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    public People() {
    }

    protected People(String username) {
        this.username = username;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public void Test(){
        System.out.println(username);
    }

    private void Test1(){
        System.out.println(username);
    }

    protected void Test2(String a){
        System.out.println(username + a);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return Objects.equals(username, people.username) &&
                Objects.equals(age, people.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, age);
    }
}
