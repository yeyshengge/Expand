package com.zps.jmeter.web;

import com.zps.jmeter.thread.TicketThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zps on 2020/6/7 11:32
 */
@RequestMapping("/jmeter")
@RestController
public class ThreadController {


    @Autowired
    private TicketThread ticketThread;

    @GetMapping("/test")
    public void method() {
        new Thread(ticketThread).start();

    }
}
