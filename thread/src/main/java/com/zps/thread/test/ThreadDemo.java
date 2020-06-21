package com.zps.thread.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zps on 2020/6/21 10:27
 */
@Component
public class ThreadDemo implements CommandLineRunner {
    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i <5; i++) {
            executorService.submit(()->{
                test();
            });
        }
    }

    public void test() {

        int i = 0;
        while (true) {
            i++;
            if (i == 5) {

                try {
                    error();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            System.out.println(Thread.currentThread().getName()+"----------  "+i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void error() {
            Integer i = null;
            i.toString();
    }
}
