package com.zps.comsumer.controller;

import com.zps.comsumer.feign.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zps on 2020/5/23 18:29
 */
@RequestMapping("/consumer")
@RestController
public class ConsumerController {


    @Autowired
    private Client client;

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") String id){
       // return client.getUserById(id);
        return null;
    }

    @GetMapping("/getLine/{id}")
    public String findByLine(@PathVariable("id") String id){
        System.out.println(1);
        return client.getUserByLine(id);
    }
}
