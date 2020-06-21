package com.zps;

import com.zps.domain.People;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by zps on 2020/3/21 10:51
 */
public class reflect {

    public static void main(String[] args) throws Exception {
        /*Class<People> peopleClass = People.class;
        People people = peopleClass.newInstance();
        Method method = peopleClass.getDeclaredMethod("Test2", String.class);

        method.setAccessible(true);
        Field username = peopleClass.getDeclaredField("username");

        username.set(people, "张三");

        method.invoke(people, "你好");

        Method[] methods = peopleClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }*/

        People p1 = new People();
        People p2 = new People();

        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));

        p1=p2;
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));



    }
}
