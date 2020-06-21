package com.zps.Enum;

/**
 * Created by zps on 2020/5/23 16:29
 */
public enum NumberEnum {


    ONE("one"),

    TWO("two"),

    THREE("three");

    private String addr;

    NumberEnum(String s){
        this.addr = s ;
    }

    public String method(){
        return addr;
    }

}
