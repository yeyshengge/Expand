package com.zps;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by zps on 2020/4/12 13:40
 */
public class StringDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(19);
        System.out.println(sb.capacity());
        System.out.println(sb.length());


        sb.append("aaaaaaaaaaaaaaaaaaaa");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        System.out.println(3==3);

        LinkedList list = new LinkedList();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list.pop());
        System.out.println(list.poll());
        System.out.println(list);
    }

}
