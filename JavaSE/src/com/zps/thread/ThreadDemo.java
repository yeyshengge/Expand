package com.zps.thread;

import java.util.concurrent.Executors;

/**
 * Created by zps on 2020/6/10 20:23
 */
public class ThreadDemo {

    private static DataMap dataMap = new DataMap();

    public static void main(String[] args) {

        int i = 0 ;
        while (i++ %2==0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Executors.newFixedThreadPool(5).submit(() -> {
                dataMap.loadData();
                System.out.println(Thread.currentThread().getName());
            });
        }
    }
}
