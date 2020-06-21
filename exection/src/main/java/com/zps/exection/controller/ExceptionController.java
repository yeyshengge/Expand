package com.zps.exection.controller;

import com.zps.exection.entity.User;
import com.zps.exection.handle.CatchException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zps on 2020/3/4 20:15
 */
@RestController
@RequestMapping("/test")
public class ExceptionController {

    private User user;

    @RequestMapping("/")
    public String test() {

        System.out.println(user.getId());
        System.out.println(11);
        CatchException.cast(500);
        return "nice";

    }
}
