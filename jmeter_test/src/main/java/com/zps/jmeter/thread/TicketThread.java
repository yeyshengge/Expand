package com.zps.jmeter.thread;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zps on 2020/6/7 11:35
 */
@Component
public class TicketThread implements Runnable {


    public int chepiao = 100;

    private static final ReentrantLock lock = new ReentrantLock();


    @Override
    public void run() {
        lock.lock();
            if(chepiao>0){
                System.out.println("第" + Thread.currentThread().getName() + "个车站正在卖出第" + (101-chepiao) + "张车票");
                --chepiao;
            }else{
                System.out.println("库存不足");
            }
            lock.unlock();
    }
}
